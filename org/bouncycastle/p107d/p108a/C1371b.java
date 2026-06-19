package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.p113b.InterfaceC1372a;
import org.bouncycastle.p107d.p108a.p113b.InterfaceC1373b;
import org.bouncycastle.p107d.p116b.InterfaceC1407b;
import org.bouncycastle.p107d.p116b.InterfaceC1412g;

/* JADX INFO: renamed from: org.bouncycastle.d.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1371b {
    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m3271a(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j) {
        if (abstractC1381d.m3362a(abstractC1389j.m3459d())) {
            return abstractC1381d.mo3356a(abstractC1389j);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m3273a(AbstractC1389j abstractC1389j, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        AbstractC1389j abstractC1389jMo2912e = abstractC1389j.m3459d().mo2912e();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                abstractC1389jMo2912e = abstractC1389j;
            }
            for (int i = 1; i < iBitLength; i++) {
                abstractC1389j = abstractC1389j.mo2950t();
                if (bigIntegerAbs.testBit(i)) {
                    abstractC1389jMo2912e = abstractC1389jMo2912e.mo2946b(abstractC1389j);
                }
            }
        }
        return bigInteger.signum() < 0 ? abstractC1389jMo2912e.mo2949s() : abstractC1389jMo2912e;
    }

    /* JADX INFO: renamed from: a */
    static AbstractC1389j m3275a(AbstractC1389j abstractC1389j, BigInteger bigInteger, InterfaceC1391l interfaceC1391l, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, AbstractC1364aa.m3256a(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        AbstractC1389j abstractC1389jM3258a = AbstractC1364aa.m3258a(abstractC1389j, iMax, interfaceC1391l);
        C1405z c1405zM3259a = AbstractC1364aa.m3259a(abstractC1389j);
        C1405z c1405zM3259a2 = AbstractC1364aa.m3259a(abstractC1389jM3258a);
        return m3276a(z ? c1405zM3259a.m3550b() : c1405zM3259a.m3548a(), z ? c1405zM3259a.m3548a() : c1405zM3259a.m3550b(), AbstractC1364aa.m3265b(iMax, bigIntegerAbs), z2 ? c1405zM3259a2.m3550b() : c1405zM3259a2.m3548a(), z2 ? c1405zM3259a2.m3548a() : c1405zM3259a2.m3550b(), AbstractC1364aa.m3265b(iMax, bigIntegerAbs2));
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1389j m3276a(AbstractC1389j[] abstractC1389jArr, AbstractC1389j[] abstractC1389jArr2, byte[] bArr, AbstractC1389j[] abstractC1389jArr3, AbstractC1389j[] abstractC1389jArr4, byte[] bArr2) {
        AbstractC1389j abstractC1389jMo2946b;
        int i;
        int iMax = Math.max(bArr.length, bArr2.length);
        AbstractC1389j abstractC1389jMo2912e = abstractC1389jArr[0].m3459d().mo2912e();
        int i2 = 0;
        AbstractC1389j abstractC1389jMo2947d = abstractC1389jMo2912e;
        int i3 = iMax - 1;
        while (i3 >= 0) {
            byte b = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b2 = i3 < bArr2.length ? bArr2[i3] : (byte) 0;
            if ((b | b2) == 0) {
                i = i2 + 1;
            } else {
                if (b != 0) {
                    abstractC1389jMo2946b = abstractC1389jMo2912e.mo2946b((b < 0 ? abstractC1389jArr2 : abstractC1389jArr)[Math.abs((int) b) >>> 1]);
                } else {
                    abstractC1389jMo2946b = abstractC1389jMo2912e;
                }
                if (b2 != 0) {
                    abstractC1389jMo2946b = abstractC1389jMo2946b.mo2946b((b2 < 0 ? abstractC1389jArr4 : abstractC1389jArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    i = 0;
                    abstractC1389jMo2947d = abstractC1389jMo2947d.mo3453b(i2);
                } else {
                    i = i2;
                }
                abstractC1389jMo2947d = abstractC1389jMo2947d.mo2947d(abstractC1389jMo2946b);
            }
            i2 = i;
            i3--;
        }
        return i2 > 0 ? abstractC1389jMo2947d.mo3453b(i2) : abstractC1389jMo2947d;
    }

    /* JADX INFO: renamed from: a */
    public static void m3277a(AbstractC1386g[] abstractC1386gArr, int i, AbstractC1386g abstractC1386g) {
        AbstractC1386g[] abstractC1386gArr2 = new AbstractC1386g[i];
        abstractC1386gArr2[0] = abstractC1386gArr[0];
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= i) {
                break;
            } else {
                abstractC1386gArr2[i2] = abstractC1386gArr2[i2 - 1].mo2933c(abstractC1386gArr[i2 + 0]);
            }
        }
        int i3 = i2 - 1;
        if (abstractC1386g != null) {
            abstractC1386gArr2[i3] = abstractC1386gArr2[i3].mo2933c(abstractC1386g);
        }
        AbstractC1386g abstractC1386gMo2937f = abstractC1386gArr2[i3].mo2937f();
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = i3 + 0;
            AbstractC1386g abstractC1386g2 = abstractC1386gArr[i5];
            abstractC1386gArr[i5] = abstractC1386gArr2[i4].mo2933c(abstractC1386gMo2937f);
            abstractC1386gMo2937f = abstractC1386gMo2937f.mo2933c(abstractC1386g2);
            i3 = i4;
        }
        abstractC1386gArr[0] = abstractC1386gMo2937f;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3278a(InterfaceC1407b interfaceC1407b) {
        return interfaceC1407b.mo3553b() > 1 && interfaceC1407b.mo3552a().equals(InterfaceC1376c.f4996e) && (interfaceC1407b instanceof InterfaceC1412g);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1389j m3279b(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j) {
        if (abstractC1381d.m3362a(abstractC1389j.m3459d())) {
            return abstractC1381d.m3357a(abstractC1389j.m3452a(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3280b(InterfaceC1407b interfaceC1407b) {
        return interfaceC1407b.mo3553b() == 1;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m3274a(AbstractC1389j abstractC1389j, BigInteger bigInteger, AbstractC1389j abstractC1389j2, BigInteger bigInteger2) {
        int i;
        AbstractC1389j abstractC1389jMo2946b;
        AbstractC1381d abstractC1381dM3459d = abstractC1389j.m3459d();
        AbstractC1389j abstractC1389jM3271a = m3271a(abstractC1381dM3459d, abstractC1389j2);
        if ((abstractC1381dM3459d instanceof AbstractC1381d.a) && ((AbstractC1381d.a) abstractC1381dM3459d).mo3060o()) {
            return m3272a(abstractC1389j.m3447a(bigInteger).mo2946b(abstractC1389jM3271a.m3447a(bigInteger2)));
        }
        InterfaceC1372a interfaceC1372aM3371l = abstractC1381dM3459d.m3371l();
        if (!(interfaceC1372aM3371l instanceof InterfaceC1373b)) {
            boolean z = bigInteger.signum() < 0;
            boolean z2 = bigInteger2.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMax = Math.max(2, Math.min(16, AbstractC1364aa.m3256a(bigIntegerAbs.bitLength())));
            int iMax2 = Math.max(2, Math.min(16, AbstractC1364aa.m3256a(bigIntegerAbs2.bitLength())));
            C1405z c1405zM3260a = AbstractC1364aa.m3260a(abstractC1389j, iMax);
            C1405z c1405zM3260a2 = AbstractC1364aa.m3260a(abstractC1389jM3271a, iMax2);
            return m3272a(m3276a(z ? c1405zM3260a.m3550b() : c1405zM3260a.m3548a(), z ? c1405zM3260a.m3548a() : c1405zM3260a.m3550b(), AbstractC1364aa.m3265b(iMax, bigIntegerAbs), z2 ? c1405zM3260a2.m3550b() : c1405zM3260a2.m3548a(), z2 ? c1405zM3260a2.m3548a() : c1405zM3260a2.m3550b(), AbstractC1364aa.m3265b(iMax2, bigIntegerAbs2)));
        }
        AbstractC1389j[] abstractC1389jArr = {abstractC1389j, abstractC1389jM3271a};
        BigInteger[] bigIntegerArr = {bigInteger, bigInteger2};
        InterfaceC1373b interfaceC1373b = (InterfaceC1373b) interfaceC1372aM3371l;
        BigInteger bigIntegerM3368i = abstractC1389jArr[0].m3459d().m3368i();
        BigInteger[] bigIntegerArr2 = new BigInteger[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            BigInteger[] bigIntegerArrMo3282a = interfaceC1373b.mo3282a(bigIntegerArr[i3].mod(bigIntegerM3368i));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = bigIntegerArrMo3282a[0];
            i2 = i4 + 1;
            bigIntegerArr2[i4] = bigIntegerArrMo3282a[1];
        }
        InterfaceC1391l interfaceC1391lA = interfaceC1373b.mo3281a();
        boolean[] zArr = new boolean[4];
        C1405z[] c1405zArr = new C1405z[4];
        byte[][] bArr = new byte[4][];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= 2) {
                break;
            }
            int i7 = i6 << 1;
            int i8 = i7 + 1;
            BigInteger bigInteger3 = bigIntegerArr2[i7];
            zArr[i7] = bigInteger3.signum() < 0;
            BigInteger bigIntegerAbs3 = bigInteger3.abs();
            BigInteger bigInteger4 = bigIntegerArr2[i8];
            zArr[i8] = bigInteger4.signum() < 0;
            BigInteger bigIntegerAbs4 = bigInteger4.abs();
            int iMax3 = Math.max(2, Math.min(16, AbstractC1364aa.m3256a(Math.max(bigIntegerAbs3.bitLength(), bigIntegerAbs4.bitLength()))));
            AbstractC1389j abstractC1389j3 = abstractC1389jArr[i6];
            AbstractC1389j abstractC1389jM3258a = AbstractC1364aa.m3258a(abstractC1389j3, iMax3, interfaceC1391lA);
            c1405zArr[i7] = AbstractC1364aa.m3259a(abstractC1389j3);
            c1405zArr[i8] = AbstractC1364aa.m3259a(abstractC1389jM3258a);
            bArr[i7] = AbstractC1364aa.m3265b(iMax3, bigIntegerAbs3);
            bArr[i8] = AbstractC1364aa.m3265b(iMax3, bigIntegerAbs4);
            i5 = i6 + 1;
        }
        int iMax4 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            iMax4 = Math.max(iMax4, bArr[i9].length);
        }
        AbstractC1389j abstractC1389jMo2912e = c1405zArr[0].m3548a()[0].m3459d().mo2912e();
        int i10 = 0;
        AbstractC1389j abstractC1389jMo3453b = abstractC1389jMo2912e;
        int i11 = iMax4 - 1;
        while (i11 >= 0) {
            int i12 = 0;
            AbstractC1389j abstractC1389j4 = abstractC1389jMo2912e;
            while (i12 < 4) {
                byte[] bArr2 = bArr[i12];
                byte b = i11 < bArr2.length ? bArr2[i11] : (byte) 0;
                if (b != 0) {
                    int iAbs = Math.abs((int) b);
                    C1405z c1405z = c1405zArr[i12];
                    abstractC1389jMo2946b = abstractC1389j4.mo2946b(((b < 0) == zArr[i12] ? c1405z.m3548a() : c1405z.m3550b())[iAbs >>> 1]);
                } else {
                    abstractC1389jMo2946b = abstractC1389j4;
                }
                i12++;
                abstractC1389j4 = abstractC1389jMo2946b;
            }
            if (abstractC1389j4 == abstractC1389jMo2912e) {
                i = i10 + 1;
            } else {
                if (i10 > 0) {
                    i = 0;
                    abstractC1389jMo3453b = abstractC1389jMo3453b.mo3453b(i10);
                } else {
                    i = i10;
                }
                abstractC1389jMo3453b = abstractC1389jMo3453b.mo2947d(abstractC1389j4);
            }
            i10 = i;
            i11--;
        }
        if (i10 > 0) {
            abstractC1389jMo3453b = abstractC1389jMo3453b.mo3453b(i10);
        }
        return m3272a(abstractC1389jMo3453b);
    }

    /* JADX INFO: renamed from: a */
    static AbstractC1389j m3272a(AbstractC1389j abstractC1389j) {
        if (abstractC1389j.m3451a(false, false)) {
            return abstractC1389j;
        }
        throw new IllegalStateException("Invalid result");
    }
}
