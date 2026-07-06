package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource$PSpecified;
import org.bouncycastle.a.s.n;
import org.bouncycastle.b.a;
import org.bouncycastle.b.d.b;
import org.bouncycastle.b.d.c;
import org.bouncycastle.b.e.an;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.l;
import org.bouncycastle.b.r;
import org.bouncycastle.b.v;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi$ErasableOutputStream;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class CipherSpi extends BaseCipherSpi {
    private final JcaJceHelper c;
    private a d;
    private AlgorithmParameterSpec e;
    private AlgorithmParameters f;
    private boolean g;
    private boolean h;
    private BaseCipherSpi$ErasableOutputStream i;

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.c = new BCJcaJceHelper();
        this.g = false;
        this.h = false;
        this.i = new BaseCipherSpi$ErasableOutputStream();
        try {
            a(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public CipherSpi(a aVar) {
        this.c = new BCJcaJceHelper();
        this.g = false;
        this.h = false;
        this.i = new BaseCipherSpi$ErasableOutputStream();
        this.d = aVar;
    }

    public CipherSpi(boolean z, boolean z2, a aVar) {
        this.c = new BCJcaJceHelper();
        this.g = false;
        this.h = false;
        this.i = new BaseCipherSpi$ErasableOutputStream();
        this.g = z;
        this.h = z2;
        this.d = aVar;
    }

    private void a(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        r rVarA = DigestFactory.a(mGF1ParameterSpec.getDigestAlgorithm());
        if (rVarA == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.d = new b(new an(), rVarA, ((PSource$PSpecified) oAEPParameterSpec.getPSource()).getValue());
        this.e = oAEPParameterSpec;
    }

    private byte[] a() {
        try {
            try {
                return this.d.a(this.i.a(), 0, this.i.size());
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BadBlockException("unable to decrypt block", e);
            } catch (v e2) {
                throw new BadBlockException("unable to decrypt block", e2);
            }
        } finally {
            this.i.b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.i.write(bArr, i, i2);
        }
        if (this.d instanceof an) {
            if (this.i.size() > this.d.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.i.size() > this.d.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        byte[] bArrA = a();
        for (int i4 = 0; i4 != bArrA.length; i4++) {
            bArr2[i3 + i4] = bArrA[i4];
        }
        return bArrA.length;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.i.write(bArr, i, i2);
        }
        if (this.d instanceof an) {
            if (this.i.size() > this.d.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.i.size() > this.d.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return a();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        try {
            return this.d.a();
        } catch (NullPointerException e) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        throw new IllegalArgumentException("not an RSA key!");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        try {
            return this.d.b();
        } catch (NullPointerException e) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f == null && this.e != null) {
            try {
                this.f = this.c.c("OAEP");
                this.f.init(this.e);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString(), e);
            }
        }
        this.f = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        bm bmVarA;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
        }
        if (key instanceof RSAPublicKey) {
            if (this.h && i == 1) {
                throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
            }
            bmVarA = RSAUtil.a((RSAPublicKey) key);
        } else {
            if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            }
            if (this.g && i == 1) {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            bmVarA = RSAUtil.a((RSAPrivateKey) key);
        }
        if (algorithmParameterSpec != null) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.e = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(n.j_.b())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            r rVarA = DigestFactory.a(oAEPParameterSpec.getDigestAlgorithm());
            if (rVarA == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            r rVarA2 = DigestFactory.a(mGF1ParameterSpec.getDigestAlgorithm());
            if (rVarA2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.d = new b(new an(), rVarA, rVarA2, ((PSource$PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        i bfVar = !(this.d instanceof an) ? secureRandom != null ? new bf(bmVarA, secureRandom) : new bf(bmVarA, l.a()) : bmVarA;
        this.i.reset();
        switch (i) {
            case 1:
            case 3:
                this.d.a(true, bfVar);
                return;
            case 2:
            case 4:
                this.d.a(false, bfVar);
                return;
            default:
                throw new InvalidParameterException("unknown opmode " + i + " passed to RSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        String strB = k.b(str);
        if (strB.equals("NONE") || strB.equals("ECB")) {
            return;
        }
        if (strB.equals("1")) {
            this.h = true;
            this.g = false;
        } else {
            if (!strB.equals("2")) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
            this.h = false;
            this.g = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String strB = k.b(str);
        if (strB.equals("NOPADDING")) {
            this.d = new an();
            return;
        }
        if (strB.equals("PKCS1PADDING")) {
            this.d = new c(new an());
            return;
        }
        if (strB.equals("ISO9796-1PADDING")) {
            this.d = new org.bouncycastle.b.d.a(new an());
            return;
        }
        if (strB.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPPADDING")) {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strB.equals("OAEPWITHSHA1ANDMGF1PADDING") || strB.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strB.equals("OAEPWITHSHA224ANDMGF1PADDING") || strB.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA256ANDMGF1PADDING") || strB.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA384ANDMGF1PADDING") || strB.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA512ANDMGF1PADDING") || strB.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource$PSpecified.DEFAULT));
        } else if (strB.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource$PSpecified.DEFAULT));
        } else {
            if (!strB.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(str + " unavailable with RSA.");
            }
            a(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource$PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.i.write(bArr, i, i2);
        if (this.d instanceof an) {
            if (this.i.size() > this.d.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            return 0;
        }
        if (this.i.size() > this.d.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.i.write(bArr, i, i2);
        if (this.d instanceof an) {
            if (this.i.size() > this.d.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            return null;
        }
        if (this.i.size() > this.d.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return null;
    }
}
