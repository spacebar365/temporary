package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0837n;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p101n.C1145c;
import org.bouncycastle.p083b.p101n.C1154l;
import org.bouncycastle.p083b.p101n.C1161s;
import org.bouncycastle.p083b.p101n.InterfaceC1143a;
import org.bouncycastle.p083b.p102o.C1164a;

/* JADX INFO: loaded from: classes.dex */
public class DSASigner extends SignatureSpi implements InterfaceC0674n, InterfaceC0760aa {

    /* JADX INFO: renamed from: bO */
    private InterfaceC1175r f5644bO;

    /* JADX INFO: renamed from: bP */
    private InterfaceC1142n f5645bP;

    /* JADX INFO: renamed from: bQ */
    private InterfaceC1143a f5646bQ = C1161s.f4644a;

    /* JADX INFO: renamed from: bR */
    private SecureRandom f5647bR;

    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(C1164a.m2784c(), new C1145c(new C1154l(C1164a.m2784c())));
        }
    }

    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(C1164a.m2785d(), new C1145c(new C1154l(C1164a.m2785d())));
        }
    }

    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(C1164a.m2786e(), new C1145c(new C1154l(C1164a.m2786e())));
        }
    }

    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(C1164a.m2787f(), new C1145c(new C1154l(C1164a.m2787f())));
        }
    }

    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(C1164a.m2784c(), new C1145c());
        }
    }

    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(C1164a.m2785d(), new C1145c());
        }
    }

    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(C1164a.m2786e(), new C1145c());
        }
    }

    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(C1164a.m2787f(), new C1145c());
        }
    }

    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new C0837n(), new C1145c());
        }
    }

    protected DSASigner(InterfaceC1175r interfaceC1175r, InterfaceC1142n interfaceC1142n) {
        this.f5644bO = interfaceC1175r;
        this.f5645bP = interfaceC1142n;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        C1075b c1075bM4209a = DSAUtil.m4209a(privateKey);
        InterfaceC1003i c1081bf = this.f5647bR != null ? new C1081bf(c1075bM4209a, this.f5647bR) : c1075bM4209a;
        this.f5644bO.mo1931c();
        this.f5645bP.mo2715a(true, c1081bf);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f5647bR = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        C1075b c1075bM4210a = DSAUtil.m4210a(publicKey);
        this.f5644bO.mo1931c();
        this.f5645bP.mo2715a(false, c1075bM4210a);
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
        byte[] bArr = new byte[this.f5644bO.mo1930b()];
        this.f5644bO.mo1926a(bArr, 0);
        try {
            BigInteger[] bigIntegerArrA = this.f5645bP.mo2717a(bArr);
            return this.f5646bQ.mo2747a(this.f5645bP.mo2746a(), bigIntegerArrA[0], bigIntegerArrA[1]);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5644bO.mo1928a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5644bO.mo1929a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f5644bO.mo1930b()];
        this.f5644bO.mo1926a(bArr2, 0);
        try {
            BigInteger[] bigIntegerArrMo2748a = this.f5646bQ.mo2748a(this.f5645bP.mo2746a(), bArr);
            return this.f5645bP.mo2716a(bArr2, bigIntegerArrMo2748a[0], bigIntegerArrMo2748a[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    public static class detDSA extends DSASigner {
        public detDSA() {
            super(new C0842s(), new C1145c(new C1154l(new C0842s())));
        }
    }

    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(new C0843t(), new C1145c(new C1154l(new C0843t())));
        }
    }

    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(new C0844u(), new C1145c(new C1154l(new C0844u())));
        }
    }

    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(new C0845v(), new C1145c(new C1154l(new C0845v())));
        }
    }

    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(new C0847x(), new C1145c(new C1154l(new C0847x())));
        }
    }

    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(new C0843t(), new C1145c());
        }
    }

    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(new C0844u(), new C1145c());
        }
    }

    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(new C0845v(), new C1145c());
        }
    }

    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(new C0847x(), new C1145c());
        }
    }

    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(new C0842s(), new C1145c());
        }
    }
}
