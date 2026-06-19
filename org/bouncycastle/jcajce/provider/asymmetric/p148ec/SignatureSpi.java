package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0837n;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p101n.C1147e;
import org.bouncycastle.p083b.p101n.C1150h;
import org.bouncycastle.p083b.p101n.C1154l;
import org.bouncycastle.p083b.p101n.C1158p;
import org.bouncycastle.p083b.p101n.C1161s;
import org.bouncycastle.p083b.p101n.InterfaceC1143a;
import org.bouncycastle.p083b.p102o.C1164a;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends DSABase {

    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new C0839p(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(C1164a.m2784c(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(C1164a.m2785d(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(C1164a.m2786e(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(C1164a.m2787f(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new C0837n(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(C1164a.m2784c(), new C1147e(new C1154l(C1164a.m2784c())), C1161s.f4644a);
        }
    }

    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(C1164a.m2785d(), new C1147e(new C1154l(C1164a.m2785d())), C1161s.f4644a);
        }
    }

    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(C1164a.m2786e(), new C1147e(new C1154l(C1164a.m2786e())), C1161s.f4644a);
        }
    }

    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(C1164a.m2787f(), new C1147e(new C1154l(C1164a.m2787f())), C1161s.f4644a);
        }
    }

    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new C0839p(), new C1147e(), C1158p.f4633a);
        }
    }

    SignatureSpi(InterfaceC1175r interfaceC1175r, InterfaceC1142n interfaceC1142n, InterfaceC1143a interfaceC1143a) {
        super(interfaceC1175r, interfaceC1142n, interfaceC1143a);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        C1075b c1075bM4328a = ECUtil.m4328a(privateKey);
        this.f5915bO.mo1931c();
        if (this.appRandom != null) {
            this.f5916bP.mo2715a(true, new C1081bf(c1075bM4328a, this.appRandom));
        } else {
            this.f5916bP.mo2715a(true, c1075bM4328a);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        C1075b c1075bM4232a = ECUtils.m4232a(publicKey);
        this.f5915bO.mo1931c();
        this.f5916bP.mo2715a(false, c1075bM4232a);
    }

    public static class ecCVCDSA extends SignatureSpi {
        public ecCVCDSA() {
            super(new C0842s(), new C1147e(), C1158p.f4633a);
        }
    }

    public static class ecCVCDSA224 extends SignatureSpi {
        public ecCVCDSA224() {
            super(new C0843t(), new C1147e(), C1158p.f4633a);
        }
    }

    public static class ecCVCDSA256 extends SignatureSpi {
        public ecCVCDSA256() {
            super(new C0844u(), new C1147e(), C1158p.f4633a);
        }
    }

    public static class ecCVCDSA384 extends SignatureSpi {
        public ecCVCDSA384() {
            super(new C0845v(), new C1147e(), C1158p.f4633a);
        }
    }

    public static class ecCVCDSA512 extends SignatureSpi {
        public ecCVCDSA512() {
            super(new C0847x(), new C1147e(), C1158p.f4633a);
        }
    }

    public static class ecDSA extends SignatureSpi {
        public ecDSA() {
            super(new C0842s(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSA224 extends SignatureSpi {
        public ecDSA224() {
            super(new C0843t(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSA256 extends SignatureSpi {
        public ecDSA256() {
            super(new C0844u(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSA384 extends SignatureSpi {
        public ecDSA384() {
            super(new C0845v(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDSA512 extends SignatureSpi {
        public ecDSA512() {
            super(new C0847x(), new C1147e(), C1161s.f4644a);
        }
    }

    public static class ecDetDSA extends SignatureSpi {
        public ecDetDSA() {
            super(new C0842s(), new C1147e(new C1154l(new C0842s())), C1161s.f4644a);
        }
    }

    public static class ecDetDSA224 extends SignatureSpi {
        public ecDetDSA224() {
            super(new C0843t(), new C1147e(new C1154l(new C0843t())), C1161s.f4644a);
        }
    }

    public static class ecDetDSA256 extends SignatureSpi {
        public ecDetDSA256() {
            super(new C0844u(), new C1147e(new C1154l(new C0844u())), C1161s.f4644a);
        }
    }

    public static class ecDetDSA384 extends SignatureSpi {
        public ecDetDSA384() {
            super(new C0845v(), new C1147e(new C1154l(new C0845v())), C1161s.f4644a);
        }
    }

    public static class ecDetDSA512 extends SignatureSpi {
        public ecDetDSA512() {
            super(new C0847x(), new C1147e(new C1154l(new C0847x())), C1161s.f4644a);
        }
    }

    public static class ecNR extends SignatureSpi {
        public ecNR() {
            super(new C0842s(), new C1150h(), C1161s.f4644a);
        }
    }

    public static class ecNR224 extends SignatureSpi {
        public ecNR224() {
            super(new C0843t(), new C1150h(), C1161s.f4644a);
        }
    }

    public static class ecNR256 extends SignatureSpi {
        public ecNR256() {
            super(new C0844u(), new C1150h(), C1161s.f4644a);
        }
    }

    public static class ecNR384 extends SignatureSpi {
        public ecNR384() {
            super(new C0845v(), new C1150h(), C1161s.f4644a);
        }
    }

    public static class ecNR512 extends SignatureSpi {
        public ecNR512() {
            super(new C0847x(), new C1150h(), C1161s.f4644a);
        }
    }
}
