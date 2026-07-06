package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource$PSpecified;
import org.bouncycastle.a.s.n;
import org.bouncycastle.b.a;
import org.bouncycastle.b.d.b;
import org.bouncycastle.b.d.c;
import org.bouncycastle.b.e.t;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.r;
import org.bouncycastle.b.v;
import org.bouncycastle.c.a.d;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi$ErasableOutputStream;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

/* JADX INFO: loaded from: classes.dex */
public class CipherSpi extends BaseCipherSpi {
    private a c;
    private AlgorithmParameterSpec d;
    private AlgorithmParameters e;
    private BaseCipherSpi$ErasableOutputStream f = new BaseCipherSpi$ErasableOutputStream();

    public CipherSpi(a aVar) {
        this.c = aVar;
    }

    private void a(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        r rVarA = DigestFactory.a(mGF1ParameterSpec.getDigestAlgorithm());
        if (rVarA == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.c = new b(new t(), rVarA, ((PSource$PSpecified) oAEPParameterSpec.getPSource()).getValue());
        this.d = oAEPParameterSpec;
    }

    private byte[] a() {
        try {
            try {
                return this.c.a(this.f.a(), 0, this.f.size());
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BadBlockException("unable to decrypt block", e);
            } catch (v e2) {
                throw new BadBlockException("unable to decrypt block", e2);
            }
        } finally {
            this.f.b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.f.write(bArr, i, i2);
        }
        if (this.c instanceof t) {
            if (this.f.size() > this.c.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.f.size() > this.c.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
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
            this.f.write(bArr, i, i2);
        }
        if (this.c instanceof t) {
            if (this.f.size() > this.c.a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.f.size() > this.c.a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return a();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.c.a();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        if (key instanceof d) {
            return ((d) key).a().a().bitLength();
        }
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not an ElGamal key!");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.c.b();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.e == null && this.d != null) {
            try {
                this.e = a("OAEP");
                this.e.init(this.d);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.e;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
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
        i iVarA;
        if (key instanceof DHPublicKey) {
            iVarA = ElGamalUtil.a((PublicKey) key);
        } else {
            if (!(key instanceof DHPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to ElGamal");
            }
            iVarA = ElGamalUtil.a((PrivateKey) key);
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.d = algorithmParameterSpec;
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
            this.c = new b(new t(), rVarA, rVarA2, ((PSource$PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        if (secureRandom != null) {
            iVarA = new bf(iVarA, secureRandom);
        }
        switch (i) {
            case 1:
            case 3:
                this.c.a(true, iVarA);
                return;
            case 2:
            case 4:
                this.c.a(false, iVarA);
                return;
            default:
                throw new InvalidParameterException("unknown opmode " + i + " passed to ElGamal");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        String strB = k.b(str);
        if (!strB.equals("NONE") && !strB.equals("ECB")) {
            throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String strB = k.b(str);
        if (strB.equals("NOPADDING")) {
            this.c = new t();
            return;
        }
        if (strB.equals("PKCS1PADDING")) {
            this.c = new c(new t());
            return;
        }
        if (strB.equals("ISO9796-1PADDING")) {
            this.c = new org.bouncycastle.b.d.a(new t());
            return;
        }
        if (strB.equals("OAEPPADDING")) {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strB.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strB.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
            a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource$PSpecified.DEFAULT));
            return;
        }
        if (strB.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
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
                throw new NoSuchPaddingException(str + " unavailable with ElGamal.");
            }
            a(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource$PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f.write(bArr, i, i2);
        return null;
    }
}
