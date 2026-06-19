package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p107d.p108a.p113b.C1374c;
import org.bouncycastle.p107d.p108a.p113b.C1375d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.ae */
/* JADX INFO: loaded from: classes.dex */
final class C0692ae extends AbstractC0508ae {
    C0692ae() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
        BigInteger bigInteger = InterfaceC1376c.f4994c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(7L);
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("0100000000000000000001B8FA16DFAB9ACA16B6B3");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
        C1375d c1375d = new C1375d(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), 176);
        AbstractC1381d.e eVar = new AbstractC1381d.e(bigIntegerM1706c, bigInteger, bigIntegerValueOf, bigIntegerM1706c2, bigIntegerValueOf2);
        AbstractC1381d abstractC1381dM3376a = eVar.m3363b().m3375a(new C1374c(eVar, c1375d)).m3376a();
        return new C0507ad(abstractC1381dM3376a, new C0509af(abstractC1381dM3376a, C1541f.m4106a("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE")), bigIntegerM1706c2, bigIntegerValueOf2, (byte[]) null);
    }
}
