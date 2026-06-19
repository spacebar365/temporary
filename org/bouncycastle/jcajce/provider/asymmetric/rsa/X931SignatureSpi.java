package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0824ae;
import org.bouncycastle.p083b.p086b.C0838o;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p089e.C0905an;
import org.bouncycastle.p083b.p101n.C1162t;
import org.bouncycastle.p083b.p102o.C1164a;

/* JADX INFO: loaded from: classes.dex */
public class X931SignatureSpi extends SignatureSpi {

    /* JADX INFO: renamed from: a */
    private C1162t f5898a;

    public static class RIPEMD128WithRSAEncryption extends X931SignatureSpi {
        public RIPEMD128WithRSAEncryption() {
            super(new C0838o(), new C0905an());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends X931SignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new C0839p(), new C0905an());
        }
    }

    public static class SHA512_224WithRSAEncryption extends X931SignatureSpi {
        public SHA512_224WithRSAEncryption() {
            super(C1164a.m2782a(), new C0905an());
        }
    }

    public static class SHA512_256WithRSAEncryption extends X931SignatureSpi {
        public SHA512_256WithRSAEncryption() {
            super(C1164a.m2783b(), new C0905an());
        }
    }

    public static class WhirlpoolWithRSAEncryption extends X931SignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new C0824ae(), new C0905an());
        }
    }

    protected X931SignatureSpi(InterfaceC1175r interfaceC1175r, InterfaceC0786a interfaceC0786a) {
        this.f5898a = new C1162t(interfaceC0786a, interfaceC1175r, (byte) 0);
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        this.f5898a.mo1904a(true, RSAUtil.m4297a((RSAPrivateKey) privateKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        this.f5898a.mo1904a(false, RSAUtil.m4298a((RSAPublicKey) publicKey));
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.f5898a.mo1907a();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5898a.mo1903a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5898a.mo1905a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.f5898a.mo1906a(bArr);
    }

    public static class SHA1WithRSAEncryption extends X931SignatureSpi {
        public SHA1WithRSAEncryption() {
            super(new C0842s(), new C0905an());
        }
    }

    public static class SHA224WithRSAEncryption extends X931SignatureSpi {
        public SHA224WithRSAEncryption() {
            super(new C0843t(), new C0905an());
        }
    }

    public static class SHA256WithRSAEncryption extends X931SignatureSpi {
        public SHA256WithRSAEncryption() {
            super(new C0844u(), new C0905an());
        }
    }

    public static class SHA384WithRSAEncryption extends X931SignatureSpi {
        public SHA384WithRSAEncryption() {
            super(new C0845v(), new C0905an());
        }
    }

    public static class SHA512WithRSAEncryption extends X931SignatureSpi {
        public SHA512WithRSAEncryption() {
            super(new C0847x(), new C0905an());
        }
    }
}
