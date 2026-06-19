package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: renamed from: org.bouncycastle.d.a.w */
/* JADX INFO: loaded from: classes.dex */
final class C1402w {

    /* JADX INFO: renamed from: a */
    public static final C1370ag[] f5103a;

    /* JADX INFO: renamed from: b */
    public static final byte[][] f5104b;

    /* JADX INFO: renamed from: c */
    public static final C1370ag[] f5105c;

    /* JADX INFO: renamed from: d */
    public static final byte[][] f5106d;

    /* JADX INFO: renamed from: e */
    private static final BigInteger f5107e = InterfaceC1376c.f4995d.negate();

    /* JADX INFO: renamed from: f */
    private static final BigInteger f5108f = InterfaceC1376c.f4996e.negate();

    /* JADX INFO: renamed from: g */
    private static final BigInteger f5109g = InterfaceC1376c.f4997f.negate();

    static {
        BigInteger bigInteger = f5107e;
        f5103a = new C1370ag[]{null, new C1370ag(InterfaceC1376c.f4995d, InterfaceC1376c.f4994c), null, new C1370ag(f5109g, f5107e), null, new C1370ag(bigInteger, bigInteger), null, new C1370ag(InterfaceC1376c.f4995d, f5107e), null};
        f5104b = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        BigInteger bigInteger2 = InterfaceC1376c.f4995d;
        f5105c = new C1370ag[]{null, new C1370ag(InterfaceC1376c.f4995d, InterfaceC1376c.f4994c), null, new C1370ag(f5109g, InterfaceC1376c.f4995d), null, new C1370ag(f5107e, InterfaceC1376c.f4995d), null, new C1370ag(bigInteger2, bigInteger2), null};
        f5106d = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    /* JADX INFO: renamed from: a */
    public static byte m3532a(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: a */
    public static BigInteger m3533a(byte b) {
        return b == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
    }

    /* JADX INFO: renamed from: a */
    private static C1401v m3535a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i) {
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - r1) - 2) + b));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight((((i + 5) / 2) + 10) - 10);
        if (bigIntegerAdd.testBit((r1 - 10) - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(InterfaceC1376c.f4995d);
        }
        return new C1401v(bigIntegerShiftRight, 10);
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger[] m3537a(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerValueOf;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = InterfaceC1376c.f4996e;
            bigIntegerValueOf = BigInteger.valueOf(b);
        } else {
            bigInteger = InterfaceC1376c.f4994c;
            bigIntegerValueOf = InterfaceC1376c.f4995d;
        }
        int i2 = 1;
        BigInteger bigInteger2 = bigIntegerValueOf;
        BigInteger bigInteger3 = bigInteger;
        while (i2 < i) {
            BigInteger bigIntegerSubtract = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger3.shiftLeft(1));
            i2++;
            bigInteger3 = bigInteger2;
            bigInteger2 = bigIntegerSubtract;
        }
        return new BigInteger[]{bigInteger3, bigInteger2};
    }

    /* JADX INFO: renamed from: a */
    public static BigInteger[] m3538a(AbstractC1381d.a aVar) {
        int i;
        if (!aVar.mo3060o()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int iA = aVar.mo2905a();
        int iIntValue = aVar.m3366g().mo2928a().intValue();
        byte bM3532a = m3532a(iIntValue);
        BigInteger bigIntegerJ = aVar.m3369j();
        if (bigIntegerJ != null) {
            if (bigIntegerJ.equals(InterfaceC1376c.f4996e)) {
                i = 1;
            } else if (bigIntegerJ.equals(InterfaceC1376c.f4998g)) {
                i = 2;
            }
            BigInteger[] bigIntegerArrM3537a = m3537a(bM3532a, (iA + 3) - iIntValue, false);
            if (bM3532a == 1) {
                bigIntegerArrM3537a[0] = bigIntegerArrM3537a[0].negate();
                bigIntegerArrM3537a[1] = bigIntegerArrM3537a[1].negate();
            }
            return new BigInteger[]{InterfaceC1376c.f4995d.add(bigIntegerArrM3537a[1]).shiftRight(i), InterfaceC1376c.f4995d.add(bigIntegerArrM3537a[0]).shiftRight(i).negate()};
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    /* JADX INFO: renamed from: a */
    public static C1370ag m3534a(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2) {
        C1401v c1401vM3528a;
        C1401v c1401vM3531b;
        BigInteger bigIntegerAdd = b2 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = m3537a(b2, i, true)[1];
        C1401v c1401vM3535a = m3535a(bigInteger, bigIntegerArr[0], bigInteger2, b, i);
        C1401v c1401vM3535a2 = m3535a(bigInteger, bigIntegerArr[1], bigInteger2, b, i);
        if (c1401vM3535a2.m3529b() != c1401vM3535a.m3529b()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerM3526a = c1401vM3535a.m3526a();
        BigInteger bigIntegerM3526a2 = c1401vM3535a2.m3526a();
        C1401v c1401vM3527a = c1401vM3535a.m3527a(bigIntegerM3526a);
        C1401v c1401vM3527a2 = c1401vM3535a2.m3527a(bigIntegerM3526a2);
        C1401v c1401vM3528a2 = c1401vM3527a.m3528a(c1401vM3527a);
        C1401v c1401vM3528a3 = b2 == 1 ? c1401vM3528a2.m3528a(c1401vM3527a2) : c1401vM3528a2.m3531b(c1401vM3527a2);
        C1401v c1401vM3528a4 = c1401vM3527a2.m3528a(c1401vM3527a2).m3528a(c1401vM3527a2);
        C1401v c1401vM3528a5 = c1401vM3528a4.m3528a(c1401vM3527a2);
        if (b2 == 1) {
            c1401vM3528a = c1401vM3527a.m3531b(c1401vM3528a4);
            c1401vM3531b = c1401vM3527a.m3528a(c1401vM3528a5);
        } else {
            c1401vM3528a = c1401vM3527a.m3528a(c1401vM3528a4);
            c1401vM3531b = c1401vM3527a.m3531b(c1401vM3528a5);
        }
        int i2 = 0;
        byte b3 = 0;
        if (c1401vM3528a3.m3530b(InterfaceC1376c.f4995d) >= 0) {
            if (c1401vM3528a.m3530b(f5107e) < 0) {
                b3 = b2;
            } else {
                i2 = 1;
            }
        } else if (c1401vM3531b.m3530b(InterfaceC1376c.f4996e) >= 0) {
            b3 = b2;
        }
        if (c1401vM3528a3.m3530b(f5107e) < 0) {
            if (c1401vM3528a.m3530b(InterfaceC1376c.f4995d) >= 0) {
                b3 = (byte) (-b2);
            } else {
                i2 = -1;
            }
        } else if (c1401vM3531b.m3530b(f5108f) < 0) {
            b3 = (byte) (-b2);
        }
        C1370ag c1370ag = new C1370ag(bigIntegerM3526a.add(BigInteger.valueOf(i2)), bigIntegerM3526a2.add(BigInteger.valueOf(b3)));
        return new C1370ag(bigInteger.subtract(bigIntegerAdd.multiply(c1370ag.f4980a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(c1370ag.f4981b)), bigIntegerArr[1].multiply(c1370ag.f4980a).subtract(bigIntegerArr[0].multiply(c1370ag.f4981b)));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3536a(byte b, C1370ag c1370ag, BigInteger bigInteger, BigInteger bigInteger2, C1370ag[] c1370agArr) {
        BigInteger bigIntegerAdd;
        BigInteger bigInteger3;
        boolean z;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerMultiply = c1370ag.f4980a.multiply(c1370ag.f4980a);
        BigInteger bigIntegerMultiply2 = c1370ag.f4980a.multiply(c1370ag.f4981b);
        BigInteger bigIntegerShiftLeft = c1370ag.f4981b.multiply(c1370ag.f4981b).shiftLeft(1);
        if (b == 1) {
            bigIntegerAdd = bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        } else {
            if (b != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerAdd = bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        int iBitLength = bigIntegerAdd.bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + 4 : 38];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd2 = c1370ag.f4980a;
        BigInteger bigIntegerNegate = c1370ag.f4981b;
        int i = 0;
        while (true) {
            if (bigIntegerAdd2.equals(InterfaceC1376c.f4994c) && bigIntegerNegate.equals(InterfaceC1376c.f4994c)) {
                return bArr;
            }
            if (bigIntegerAdd2.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd2.add(bigIntegerNegate.multiply(bigInteger2)).mod(bigInteger);
                byte bIntValue = bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0 ? (byte) bigIntegerMod.subtract(bigInteger).intValue() : (byte) bigIntegerMod.intValue();
                bArr[i] = bIntValue;
                if (bIntValue < 0) {
                    bIntValue = (byte) (-bIntValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    BigInteger bigIntegerSubtract = bigIntegerAdd2.subtract(c1370agArr[bIntValue].f4980a);
                    bigIntegerNegate = bigIntegerNegate.subtract(c1370agArr[bIntValue].f4981b);
                    bigInteger3 = bigIntegerSubtract;
                } else {
                    BigInteger bigIntegerAdd3 = bigIntegerAdd2.add(c1370agArr[bIntValue].f4980a);
                    bigIntegerNegate = bigIntegerNegate.add(c1370agArr[bIntValue].f4981b);
                    bigInteger3 = bigIntegerAdd3;
                }
            } else {
                bArr[i] = 0;
                bigInteger3 = bigIntegerAdd2;
            }
            bigIntegerAdd2 = b == 1 ? bigIntegerNegate.add(bigInteger3.shiftRight(1)) : bigIntegerNegate.subtract(bigInteger3.shiftRight(1));
            bigIntegerNegate = bigInteger3.shiftRight(1).negate();
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j.a[] m3539a(AbstractC1389j.a aVar, byte b) {
        int i;
        byte[][] bArr = b == 0 ? f5104b : f5106d;
        AbstractC1389j.a[] aVarArr = new AbstractC1389j.a[(bArr.length + 1) >>> 1];
        aVarArr[0] = aVar;
        int length = bArr.length;
        for (int i2 = 3; i2 < length; i2 += 2) {
            int i3 = i2 >>> 1;
            byte[] bArr2 = bArr[i2];
            AbstractC1389j.a aVar2 = (AbstractC1389j.a) aVar.m3459d().mo2912e();
            AbstractC1389j.a aVar3 = (AbstractC1389j.a) aVar.mo2949s();
            int length2 = bArr2.length - 1;
            int i4 = 0;
            AbstractC1389j.a aVarM3471c = aVar2;
            while (length2 >= 0) {
                int i5 = i4 + 1;
                byte b2 = bArr2[length2];
                if (b2 != 0) {
                    AbstractC1389j.a aVarM3471c2 = aVarM3471c.m3471c(i5);
                    AbstractC1389j.a aVar4 = b2 > 0 ? aVar : aVar3;
                    i = 0;
                    aVarM3471c = (AbstractC1389j.a) aVarM3471c2.mo2946b(aVar4);
                } else {
                    i = i5;
                }
                length2--;
                i4 = i;
            }
            if (i4 > 0) {
                aVarM3471c = aVarM3471c.m3471c(i4);
            }
            aVarArr[i3] = aVarM3471c;
        }
        aVar.m3459d().m3360a(aVarArr);
        return aVarArr;
    }
}
