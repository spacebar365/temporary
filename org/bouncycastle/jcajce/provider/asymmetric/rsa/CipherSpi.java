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
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p088d.C0885a;
import org.bouncycastle.p083b.p088d.C0886b;
import org.bouncycastle.p083b.p088d.C0887c;
import org.bouncycastle.p083b.p089e.C0905an;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class CipherSpi extends BaseCipherSpi {

    /* JADX INFO: renamed from: c */
    private final JcaJceHelper f5866c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0786a f5867d;

    /* JADX INFO: renamed from: e */
    private AlgorithmParameterSpec f5868e;

    /* JADX INFO: renamed from: f */
    private AlgorithmParameters f5869f;

    /* JADX INFO: renamed from: g */
    private boolean f5870g;

    /* JADX INFO: renamed from: h */
    private boolean f5871h;

    /* JADX INFO: renamed from: i */
    private BaseCipherSpi.ErasableOutputStream f5872i;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new C0885a(new C0905an()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new C0905an());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new C0887c(new C0905an()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new C0887c(new C0905an()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new C0887c(new C0905an()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.f5866c = new BCJcaJceHelper();
        this.f5870g = false;
        this.f5871h = false;
        this.f5872i = new BaseCipherSpi.ErasableOutputStream();
        try {
            m4290a(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public CipherSpi(InterfaceC0786a interfaceC0786a) {
        this.f5866c = new BCJcaJceHelper();
        this.f5870g = false;
        this.f5871h = false;
        this.f5872i = new BaseCipherSpi.ErasableOutputStream();
        this.f5867d = interfaceC0786a;
    }

    public CipherSpi(boolean z, boolean z2, InterfaceC0786a interfaceC0786a) {
        this.f5866c = new BCJcaJceHelper();
        this.f5870g = false;
        this.f5871h = false;
        this.f5872i = new BaseCipherSpi.ErasableOutputStream();
        this.f5870g = z;
        this.f5871h = z2;
        this.f5867d = interfaceC0786a;
    }

    /* JADX INFO: renamed from: a */
    private void m4290a(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        InterfaceC1175r interfaceC1175rM4479a = DigestFactory.m4479a(mGF1ParameterSpec.getDigestAlgorithm());
        if (interfaceC1175rM4479a == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.f5867d = new C0886b(new C0905an(), interfaceC1175rM4479a, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        this.f5868e = oAEPParameterSpec;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4291a() {
        try {
            try {
                return this.f5867d.mo1870a(this.f5872i.m4305a(), 0, this.f5872i.size());
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new BadBlockException("unable to decrypt block", e);
            } catch (C1179v e2) {
                throw new BadBlockException("unable to decrypt block", e2);
            }
        } finally {
            this.f5872i.m4306b();
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (bArr != null) {
            this.f5872i.write(bArr, i, i2);
        }
        if (this.f5867d instanceof C0905an) {
            if (this.f5872i.size() > this.f5867d.mo1868a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.f5872i.size() > this.f5867d.mo1868a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        byte[] bArrM4291a = m4291a();
        for (int i4 = 0; i4 != bArrM4291a.length; i4++) {
            bArr2[i3 + i4] = bArrM4291a[i4];
        }
        return bArrM4291a.length;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f5872i.write(bArr, i, i2);
        }
        if (this.f5867d instanceof C0905an) {
            if (this.f5872i.size() > this.f5867d.mo1868a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.f5872i.size() > this.f5867d.mo1868a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return m4291a();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        try {
            return this.f5867d.mo1868a();
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
            return this.f5867d.mo1871b();
        } catch (NullPointerException e) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f5869f == null && this.f5868e != null) {
            try {
                this.f5869f = this.f5866c.mo4522c("OAEP");
                this.f5869f.init(this.f5868e);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f5869f;
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
        this.f5869f = algorithmParameters;
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
        C1088bm c1088bmM4297a;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
        }
        if (key instanceof RSAPublicKey) {
            if (this.f5871h && i == 1) {
                throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
            }
            c1088bmM4297a = RSAUtil.m4298a((RSAPublicKey) key);
        } else {
            if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            }
            if (this.f5870g && i == 1) {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            c1088bmM4297a = RSAUtil.m4297a((RSAPrivateKey) key);
        }
        if (algorithmParameterSpec != null) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.f5868e = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(InterfaceC0674n.f2738j_.m1593b())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            InterfaceC1175r interfaceC1175rM4479a = DigestFactory.m4479a(oAEPParameterSpec.getDigestAlgorithm());
            if (interfaceC1175rM4479a == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            InterfaceC1175r interfaceC1175rM4479a2 = DigestFactory.m4479a(mGF1ParameterSpec.getDigestAlgorithm());
            if (interfaceC1175rM4479a2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.f5867d = new C0886b(new C0905an(), interfaceC1175rM4479a, interfaceC1175rM4479a2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        InterfaceC1003i c1081bf = !(this.f5867d instanceof C0905an) ? secureRandom != null ? new C1081bf(c1088bmM4297a, secureRandom) : new C1081bf(c1088bmM4297a, C1124l.m2709a()) : c1088bmM4297a;
        this.f5872i.reset();
        switch (i) {
            case 1:
            case 3:
                this.f5867d.mo1869a(true, c1081bf);
                return;
            case 2:
            case 4:
                this.f5867d.mo1869a(false, c1081bf);
                return;
            default:
                throw new InvalidParameterException("unknown opmode " + i + " passed to RSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        String strM4163b = C1560k.m4163b(str);
        if (strM4163b.equals("NONE") || strM4163b.equals("ECB")) {
            return;
        }
        if (strM4163b.equals("1")) {
            this.f5871h = true;
            this.f5870g = false;
        } else {
            if (!strM4163b.equals("2")) {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
            this.f5871h = false;
            this.f5870g = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        String strM4163b = C1560k.m4163b(str);
        if (strM4163b.equals("NOPADDING")) {
            this.f5867d = new C0905an();
            return;
        }
        if (strM4163b.equals("PKCS1PADDING")) {
            this.f5867d = new C0887c(new C0905an());
            return;
        }
        if (strM4163b.equals("ISO9796-1PADDING")) {
            this.f5867d = new C0885a(new C0905an());
            return;
        }
        if (strM4163b.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPPADDING")) {
            m4290a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA1ANDMGF1PADDING") || strM4163b.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            m4290a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA224ANDMGF1PADDING") || strM4163b.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA256ANDMGF1PADDING") || strM4163b.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA384ANDMGF1PADDING") || strM4163b.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA512ANDMGF1PADDING") || strM4163b.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (strM4163b.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (strM4163b.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            m4290a(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else {
            if (!strM4163b.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(str + " unavailable with RSA.");
            }
            m4290a(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f5872i.write(bArr, i, i2);
        if (this.f5867d instanceof C0905an) {
            if (this.f5872i.size() > this.f5867d.mo1868a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            return 0;
        }
        if (this.f5872i.size() > this.f5867d.mo1868a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f5872i.write(bArr, i, i2);
        if (this.f5867d instanceof C0905an) {
            if (this.f5872i.size() > this.f5867d.mo1868a() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            return null;
        }
        if (this.f5872i.size() > this.f5867d.mo1868a()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return null;
    }
}
