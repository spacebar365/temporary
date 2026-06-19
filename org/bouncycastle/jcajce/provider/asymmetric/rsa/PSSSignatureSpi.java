package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C1038j;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p089e.C0905an;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p101n.C1157o;

/* JADX INFO: loaded from: classes.dex */
public class PSSSignatureSpi extends SignatureSpi {

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5880a;

    /* JADX INFO: renamed from: b */
    private AlgorithmParameters f5881b;

    /* JADX INFO: renamed from: c */
    private PSSParameterSpec f5882c;

    /* JADX INFO: renamed from: d */
    private PSSParameterSpec f5883d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0786a f5884e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1175r f5885f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1175r f5886g;

    /* JADX INFO: renamed from: h */
    private int f5887h;

    /* JADX INFO: renamed from: i */
    private byte f5888i;

    /* JADX INFO: renamed from: j */
    private boolean f5889j;

    /* JADX INFO: renamed from: k */
    private C1088bm f5890k;

    /* JADX INFO: renamed from: l */
    private C1157o f5891l;

    /* JADX INFO: renamed from: m */
    private boolean f5892m;

    private class NullPssDigest implements InterfaceC1175r {

        /* JADX INFO: renamed from: c */
        private InterfaceC1175r f5895c;

        /* JADX INFO: renamed from: b */
        private ByteArrayOutputStream f5894b = new ByteArrayOutputStream();

        /* JADX INFO: renamed from: d */
        private boolean f5896d = true;

        public NullPssDigest(InterfaceC1175r interfaceC1175r) {
            this.f5895c = interfaceC1175r;
        }

        @Override // org.bouncycastle.p083b.InterfaceC1175r
        /* JADX INFO: renamed from: a */
        public final int mo1926a(byte[] bArr, int i) {
            byte[] byteArray = this.f5894b.toByteArray();
            if (this.f5896d) {
                System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.f5895c.mo1929a(byteArray, 0, byteArray.length);
                this.f5895c.mo1926a(bArr, i);
            }
            mo1931c();
            this.f5896d = this.f5896d ? false : true;
            return byteArray.length;
        }

        @Override // org.bouncycastle.p083b.InterfaceC1175r
        /* JADX INFO: renamed from: a */
        public final String mo1927a() {
            return "NULL";
        }

        @Override // org.bouncycastle.p083b.InterfaceC1175r
        /* JADX INFO: renamed from: a */
        public final void mo1928a(byte b) {
            this.f5894b.write(b);
        }

        @Override // org.bouncycastle.p083b.InterfaceC1175r
        /* JADX INFO: renamed from: a */
        public final void mo1929a(byte[] bArr, int i, int i2) {
            this.f5894b.write(bArr, i, i2);
        }

        @Override // org.bouncycastle.p083b.InterfaceC1175r
        /* JADX INFO: renamed from: b */
        public final int mo1930b() {
            return this.f5895c.mo1930b();
        }

        @Override // org.bouncycastle.p083b.InterfaceC1175r
        /* JADX INFO: renamed from: c */
        public final void mo1931c() {
            this.f5894b.reset();
            this.f5895c.mo1931c();
        }
    }

    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new C0905an(), null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new C0905an(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new C0905an(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new C0905an(), null, true);
        }
    }

    protected PSSSignatureSpi(InterfaceC0786a interfaceC0786a, PSSParameterSpec pSSParameterSpec) {
        this(interfaceC0786a, pSSParameterSpec, false);
    }

    protected PSSSignatureSpi(InterfaceC0786a interfaceC0786a, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.f5880a = new BCJcaJceHelper();
        this.f5892m = true;
        this.f5884e = interfaceC0786a;
        this.f5883d = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.f5882c = PSSParameterSpec.DEFAULT;
        } else {
            this.f5882c = pSSParameterSpec;
        }
        this.f5886g = DigestFactory.m4479a(this.f5882c.getDigestAlgorithm());
        this.f5887h = this.f5882c.getSaltLength();
        this.f5888i = m4294a(this.f5882c.getTrailerField());
        this.f5889j = z;
        m4295a();
    }

    /* JADX INFO: renamed from: a */
    private static byte m4294a(int i) {
        if (i == 1) {
            return (byte) -68;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    /* JADX INFO: renamed from: a */
    private void m4295a() {
        if (this.f5889j) {
            this.f5885f = new NullPssDigest(this.f5886g);
        } else {
            this.f5885f = this.f5886g;
        }
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f5881b == null && this.f5882c != null) {
            try {
                this.f5881b = this.f5880a.mo4522c("PSS");
                this.f5881b.init(this.f5882c);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f5881b;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.f5890k = RSAUtil.m4297a((RSAPrivateKey) privateKey);
        this.f5891l = new C1157o(this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i);
        this.f5891l.mo1904a(true, (InterfaceC1003i) this.f5890k);
        this.f5892m = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        }
        this.f5890k = RSAUtil.m4297a((RSAPrivateKey) privateKey);
        this.f5891l = new C1157o(this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i);
        this.f5891l.mo1904a(true, (InterfaceC1003i) new C1081bf(this.f5890k, secureRandom));
        this.f5892m = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        }
        this.f5890k = RSAUtil.m4298a((RSAPublicKey) publicKey);
        this.f5891l = new C1157o(this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i);
        this.f5891l.mo1904a(false, (InterfaceC1003i) this.f5890k);
        this.f5892m = true;
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec2;
        if (algorithmParameterSpec != null) {
            algorithmParameterSpec2 = algorithmParameterSpec;
        } else if (this.f5883d == null) {
            return;
        } else {
            algorithmParameterSpec2 = this.f5883d;
        }
        if (!this.f5892m) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec2 instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec2;
        if (this.f5883d != null && !DigestFactory.m4480a(this.f5883d.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + this.f5883d.getDigestAlgorithm());
        }
        if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !pSSParameterSpec.getMGFAlgorithm().equals(InterfaceC0674n.f2738j_.m1593b())) {
            throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
        }
        if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown MGF parameters");
        }
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
        if (!DigestFactory.m4480a(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
        }
        InterfaceC1175r interfaceC1175rM4479a = DigestFactory.m4479a(mGF1ParameterSpec.getDigestAlgorithm());
        if (interfaceC1175rM4479a == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.f5881b = null;
        this.f5882c = pSSParameterSpec;
        this.f5886g = interfaceC1175rM4479a;
        this.f5887h = this.f5882c.getSaltLength();
        this.f5888i = m4294a(this.f5882c.getTrailerField());
        m4295a();
        if (this.f5890k != null) {
            this.f5891l = new C1157o(this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i);
            if (this.f5890k.m2602a()) {
                this.f5891l.mo1904a(true, (InterfaceC1003i) this.f5890k);
            } else {
                this.f5891l.mo1904a(false, (InterfaceC1003i) this.f5890k);
            }
        }
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        this.f5892m = true;
        try {
            return this.f5891l.mo1907a();
        } catch (C1038j e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5891l.mo1903a(b);
        this.f5892m = false;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5891l.mo1905a(bArr, i, i2);
        this.f5892m = false;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        this.f5892m = true;
        return this.f5891l.mo1906a(bArr);
    }
}
