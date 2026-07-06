package org.bouncycastle.d.a.d;

import java.security.SecureRandom;
import org.bouncycastle.b.aq;
import org.bouncycastle.b.b.z;
import org.bouncycastle.d.a.c.c$a;
import org.bouncycastle.d.a.c.d;
import org.bouncycastle.d.c.c;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static final byte[] a = k.d("SigEd448");
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static Object f = new Object();
    private static b$a[] g = null;
    private static int[] h = null;

    private static int a(byte[] bArr, int i) {
        int i2 = i + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16);
    }

    private static aq a() {
        return new z(256);
    }

    private static b$a a(b$a b_a) {
        b$a b_a2 = new b$a((byte) 0);
        d.a(b_a.a, b_a2.a, 0);
        d.a(b_a.b, b_a2.b, 0);
        d.a(b_a.c, b_a2.c, 0);
        return b_a2;
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void a(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    private static void a(aq aqVar, byte[] bArr) {
        aqVar.a(a, 0, a.length);
        aqVar.a((byte) 0);
        aqVar.a((byte) bArr.length);
        aqVar.a(bArr, 0, bArr.length);
    }

    public static void a(c$a c_a, byte[] bArr, int[] iArr, int[] iArr2) {
        if (c_a == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        b(bArr, bArr2);
        b$a b_a = new b$a((byte) 0);
        b(bArr2, b_a);
        d.a(b_a.a, iArr, 0);
        d.a(b_a.b, iArr2, 0);
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        aq aqVarA = a();
        byte[] bArr3 = new byte[114];
        aqVarA.a(bArr, 0, 57);
        aqVarA.b(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        b(bArr3, bArr4);
        c(bArr4, bArr2);
    }

    private static void a(byte[] bArr, int[] iArr) {
        for (int i = 0; i < 14; i++) {
            iArr[i + 0] = b(bArr, (i * 4) + 0);
        }
    }

    private static void a(int[] iArr, int[] iArr2, b$a b_a, b$a b_a2) {
        b();
        byte[] bArrA = a(iArr, 7);
        byte[] bArrA2 = a(iArr2, 5);
        b$a[] b_aArrA = a(b_a, 8);
        c(b_a2);
        int i = 447;
        while (i > 0 && (bArrA[i] | bArrA2[i]) == 0) {
            i--;
        }
        while (true) {
            byte b2 = bArrA[i];
            if (b2 != 0) {
                int i2 = b2 >> 31;
                a(i2 != 0, g[(b2 ^ i2) >>> 1], b_a2);
            }
            byte b3 = bArrA2[i];
            if (b3 != 0) {
                int i3 = b3 >> 31;
                a(i3 != 0, b_aArrA[(b3 ^ i3) >>> 1], b_a2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                b(b_a2);
            }
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static byte[] a(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 14;
        int i3 = 0;
        int i4 = 28;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            int i5 = iArr[i2];
            int i6 = i4 - 1;
            iArr2[i6] = (i3 << 16) | (i5 >>> 16);
            i4 = i6 - 1;
            iArr2[i4] = i5;
            i3 = i5;
        }
        byte[] bArr = new byte[448];
        int i7 = 1 << i;
        int i8 = i7 - 1;
        int i9 = i7 >>> 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < 28) {
            int i13 = iArr2[i10];
            while (i12 < 16) {
                int i14 = i13 >>> i12;
                if ((i14 & 1) == i11) {
                    i12++;
                } else {
                    int i15 = i11 + (i14 & i8);
                    int i16 = i15 & i9;
                    int i17 = i15 - (i16 << 1);
                    i11 = i16 >>> (i - 1);
                    bArr[(i10 << 4) + i12] = (byte) i17;
                    i12 += i;
                }
            }
            i10++;
            i12 -= 16;
        }
        return bArr;
    }

    private static b$a[] a(b$a b_a, int i) {
        b$a b_aA = a(b_a);
        b(b_aA);
        b$a[] b_aArr = new b$a[i];
        b_aArr[0] = a(b_a);
        for (int i2 = 1; i2 < i; i2++) {
            b_aArr[i2] = a(b_aArr[i2 - 1]);
            a(false, b_aA, b_aArr[i2]);
        }
        return b_aArr;
    }

    private static int b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    private static void b(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static void b(byte[] bArr, int[] iArr) {
        a(bArr, iArr);
    }

    private static boolean b(byte[] bArr) {
        if ((bArr[56] & 127) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        a(bArr, iArr);
        return !c.c(14, iArr, b);
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        b$a b_a = new b$a((byte) 0);
        b(bArr, b_a);
        a(b_a, bArr2);
    }

    private static int d(byte[] bArr) {
        return (bArr[112] & 255) | ((bArr[113] & 255) << 8);
    }

    private static byte[] e(byte[] bArr) {
        long jB = ((long) b(bArr, 0)) & 4294967295L;
        long jA = ((long) (a(bArr, 4) << 4)) & 4294967295L;
        long jB2 = ((long) b(bArr, 7)) & 4294967295L;
        long jA2 = ((long) (a(bArr, 11) << 4)) & 4294967295L;
        long jB3 = ((long) b(bArr, 14)) & 4294967295L;
        long jA3 = ((long) (a(bArr, 18) << 4)) & 4294967295L;
        long jB4 = ((long) b(bArr, 21)) & 4294967295L;
        long jA4 = ((long) (a(bArr, 25) << 4)) & 4294967295L;
        long jB5 = ((long) b(bArr, 28)) & 4294967295L;
        long jA5 = ((long) (a(bArr, 32) << 4)) & 4294967295L;
        long jB6 = ((long) b(bArr, 35)) & 4294967295L;
        long jA6 = ((long) (a(bArr, 39) << 4)) & 4294967295L;
        long jB7 = ((long) b(bArr, 42)) & 4294967295L;
        long jA7 = ((long) (a(bArr, 46) << 4)) & 4294967295L;
        long jB8 = ((long) b(bArr, 49)) & 4294967295L;
        long jA8 = ((long) (a(bArr, 53) << 4)) & 4294967295L;
        long jB9 = ((long) b(bArr, 56)) & 4294967295L;
        long jA9 = ((long) (a(bArr, 60) << 4)) & 4294967295L;
        long jB10 = ((long) b(bArr, 63)) & 4294967295L;
        long jA10 = ((long) (a(bArr, 67) << 4)) & 4294967295L;
        long jB11 = ((long) b(bArr, 70)) & 4294967295L;
        long jA11 = ((long) (a(bArr, 74) << 4)) & 4294967295L;
        long jB12 = ((long) b(bArr, 77)) & 4294967295L;
        long jA12 = ((long) (a(bArr, 81) << 4)) & 4294967295L;
        long jB13 = ((long) b(bArr, 84)) & 4294967295L;
        long jA13 = ((long) (a(bArr, 88) << 4)) & 4294967295L;
        long jB14 = ((long) b(bArr, 91)) & 4294967295L;
        long jA14 = ((long) (a(bArr, 95) << 4)) & 4294967295L;
        long jB15 = ((long) b(bArr, 98)) & 4294967295L;
        long jA15 = ((long) (a(bArr, 102) << 4)) & 4294967295L;
        long jB16 = ((long) b(bArr, 105)) & 4294967295L;
        long jA16 = ((long) (a(bArr, 109) << 4)) & 4294967295L;
        long jD = ((long) d(bArr)) & 4294967295L;
        long j = jA16 + (jB16 >>> 28);
        long j2 = jB16 & 268435455;
        long j3 = jA15 + (jB15 >>> 28);
        long j4 = jB15 & 268435455;
        long j5 = jB11 + (96434764 * jD) + (227822194 * j) + (149865618 * j2) + (j3 * 550336261);
        long j6 = jA14 + (jB14 >>> 28);
        long j7 = jB14 & 268435455;
        long j8 = jA9 + (30366549 * jD) + (163752818 * j) + (258169998 * j2) + (96434764 * j3) + (227822194 * j4) + (149865618 * j6) + (j7 * 550336261);
        long j9 = jA13 + (jB13 >>> 28);
        long j10 = jA11 + (227822194 * jD) + (149865618 * j) + (j2 * 550336261) + (j5 >>> 28);
        long j11 = jB12 + (149865618 * jD) + (j * 550336261) + (j10 >>> 28);
        long j12 = jA12 + (jD * 550336261) + (j11 >>> 28);
        long j13 = j11 & 268435455;
        long j14 = (jB13 & 268435455) + (j12 >>> 28);
        long j15 = j12 & 268435455;
        long j16 = jB8 + (43969588 * j2) + (30366549 * j3) + (163752818 * j4) + (258169998 * j6) + (96434764 * j7) + (227822194 * j9) + (149865618 * j14) + (j15 * 550336261);
        long j17 = jB10 + (163752818 * jD) + (258169998 * j) + (96434764 * j2) + (227822194 * j3) + (149865618 * j4) + (j6 * 550336261) + (j8 >>> 28);
        long j18 = jA10 + (258169998 * jD) + (96434764 * j) + (227822194 * j2) + (149865618 * j3) + (j4 * 550336261) + (j17 >>> 28);
        long j19 = (j5 & 268435455) + (j18 >>> 28);
        long j20 = j18 & 268435455;
        long j21 = (j10 & 268435455) + (j19 >>> 28);
        long j22 = j19 & 268435455;
        long j23 = jA8 + (43969588 * j) + (30366549 * j2) + (163752818 * j3) + (258169998 * j4) + (96434764 * j6) + (227822194 * j7) + (149865618 * j9) + (j14 * 550336261) + (j16 >>> 28);
        long j24 = jB9 + (43969588 * jD) + (30366549 * j) + (163752818 * j2) + (258169998 * j3) + (96434764 * j4) + (227822194 * j6) + (149865618 * j7) + (j9 * 550336261) + (j23 >>> 28);
        long j25 = j23 & 268435455;
        long j26 = (j8 & 268435455) + (j24 >>> 28);
        long j27 = (j17 & 268435455) + (j26 >>> 28);
        long j28 = j26 & 268435455;
        long j29 = ((j24 & 268435455) * 4) + (j25 >>> 26) + 1;
        long j30 = jB + (78101261 * j29);
        long j31 = jA + (43969588 * j28) + (141809365 * j29) + (j30 >>> 28);
        long j32 = jB2 + (43969588 * j27) + (30366549 * j28) + (175155932 * j29) + (j31 >>> 28);
        long j33 = jA2 + (43969588 * j20) + (30366549 * j27) + (163752818 * j28) + (64542499 * j29) + (j32 >>> 28);
        long j34 = jB3 + (43969588 * j22) + (30366549 * j20) + (163752818 * j27) + (258169998 * j28) + (158326419 * j29) + (j33 >>> 28);
        long j35 = jA3 + (43969588 * j21) + (30366549 * j22) + (163752818 * j20) + (258169998 * j27) + (96434764 * j28) + (191173276 * j29) + (j34 >>> 28);
        long j36 = jB4 + (43969588 * j13) + (30366549 * j21) + (163752818 * j22) + (258169998 * j20) + (96434764 * j27) + (227822194 * j28) + (104575268 * j29) + (j35 >>> 28);
        long j37 = jA4 + (43969588 * j15) + (30366549 * j13) + (163752818 * j21) + (258169998 * j22) + (96434764 * j20) + (227822194 * j27) + (149865618 * j28) + (j29 * 137584065) + (j36 >>> 28);
        long j38 = jB5 + (43969588 * j14) + (30366549 * j15) + (163752818 * j13) + (258169998 * j21) + (96434764 * j22) + (227822194 * j20) + (149865618 * j27) + (j28 * 550336261) + (j37 >>> 28);
        long j39 = jA5 + (43969588 * j9) + (30366549 * j14) + (163752818 * j15) + (258169998 * j13) + (96434764 * j21) + (227822194 * j22) + (149865618 * j20) + (j27 * 550336261) + (j38 >>> 28);
        long j40 = jB6 + (43969588 * j7) + (30366549 * j9) + (163752818 * j14) + (258169998 * j15) + (96434764 * j13) + (227822194 * j21) + (149865618 * j22) + (j20 * 550336261) + (j39 >>> 28);
        long j41 = jA6 + (43969588 * j6) + (30366549 * j7) + (163752818 * j9) + (258169998 * j14) + (96434764 * j15) + (227822194 * j13) + (149865618 * j21) + (j22 * 550336261) + (j40 >>> 28);
        long j42 = jB7 + (43969588 * j4) + (30366549 * j6) + (163752818 * j7) + (258169998 * j9) + (96434764 * j14) + (227822194 * j15) + (149865618 * j13) + (j21 * 550336261) + (j41 >>> 28);
        long j43 = jA7 + (43969588 * j3) + (30366549 * j4) + (163752818 * j6) + (258169998 * j7) + (96434764 * j9) + (227822194 * j14) + (149865618 * j15) + (j13 * 550336261) + (j42 >>> 28);
        long j44 = (j16 & 268435455) + (j43 >>> 28);
        long j45 = (j25 & 67108863) + (j44 >>> 28);
        long j46 = (j45 >>> 26) - 1;
        long j47 = (j30 & 268435455) - (78101261 & j46);
        long j48 = ((j31 & 268435455) - (141809365 & j46)) + (j47 >> 28);
        long j49 = ((j32 & 268435455) - (175155932 & j46)) + (j48 >> 28);
        long j50 = ((j33 & 268435455) - (64542499 & j46)) + (j49 >> 28);
        long j51 = ((j34 & 268435455) - (158326419 & j46)) + (j50 >> 28);
        long j52 = ((j35 & 268435455) - (191173276 & j46)) + (j51 >> 28);
        long j53 = ((j36 & 268435455) - (104575268 & j46)) + (j52 >> 28);
        long j54 = ((j37 & 268435455) - (j46 & 137584065)) + (j53 >> 28);
        long j55 = (j38 & 268435455) + (j54 >> 28);
        long j56 = (j39 & 268435455) + (j55 >> 28);
        long j57 = (j40 & 268435455) + (j56 >> 28);
        long j58 = (j41 & 268435455) + (j57 >> 28);
        long j59 = (j42 & 268435455) + (j58 >> 28);
        long j60 = (j43 & 268435455) + (j59 >> 28);
        long j61 = (j44 & 268435455) + (j60 >> 28);
        byte[] bArr2 = new byte[57];
        a((j47 & 268435455) | ((j48 & 268435455) << 28), bArr2, 0);
        a(((j50 & 268435455) << 28) | (j49 & 268435455), bArr2, 7);
        a(((j52 & 268435455) << 28) | (j51 & 268435455), bArr2, 14);
        a(((j54 & 268435455) << 28) | (j53 & 268435455), bArr2, 21);
        a(((j56 & 268435455) << 28) | (j55 & 268435455), bArr2, 28);
        a(((j58 & 268435455) << 28) | (j57 & 268435455), bArr2, 35);
        a(((j60 & 268435455) << 28) | (j59 & 268435455), bArr2, 42);
        a((((j45 & 67108863) + (j61 >> 28)) << 28) | (j61 & 268435455), bArr2, 49);
        return bArr2;
    }

    private static boolean c(byte[] bArr) {
        if (bArr[56] != 0) {
            return false;
        }
        int[] iArr = new int[14];
        a(bArr, iArr);
        return !c.c(14, iArr, c);
    }

    private static boolean a(byte[] bArr, b$a b_a) {
        byte[] bArrC = org.bouncycastle.f.a.c(bArr, 0, 57);
        if (!b(bArrC)) {
            return false;
        }
        int i = (bArrC[56] & 128) >>> 7;
        bArrC[56] = (byte) (bArrC[56] & 127);
        d.a(bArrC, b_a.b);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        d.c(b_a.b, iArr);
        d.a(iArr, 39081, iArr2);
        d.b(iArr, iArr);
        iArr[0] = iArr[0] + 1;
        iArr2[0] = iArr2[0] + 1;
        if (!d.c(iArr, iArr2, b_a.a)) {
            return false;
        }
        d.c(b_a.a);
        if (i == 1 && d.b(b_a.a)) {
            return false;
        }
        if (!(i != (b_a.a[0] & 1))) {
            d.b(b_a.a, b_a.a);
        }
        d.d(b_a.c);
        return true;
    }

    private static void a(long j, byte[] bArr, int i) {
        a((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        int i3 = i + 4;
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i4 + 1] = (byte) (i2 >>> 16);
    }

    private static void a(b$a b_a, byte[] bArr) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        d.a(b_a.c, iArr2);
        d.b(b_a.a, iArr2, iArr);
        d.b(b_a.b, iArr2, iArr2);
        d.c(iArr);
        d.c(iArr2);
        d.a(iArr2, bArr, 0);
        bArr[56] = (byte) ((iArr[0] & 1) << 7);
    }

    private static void a(aq aqVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6) {
        a(aqVar, bArr4);
        aqVar.a(bArr, 57, 57);
        aqVar.a(bArr5, 0, i);
        aqVar.b(bArr, 0, 114);
        byte[] bArrE = e(bArr);
        byte[] bArr7 = new byte[57];
        c(bArrE, bArr7);
        a(aqVar, bArr4);
        aqVar.a(bArr7, 0, 57);
        aqVar.a(bArr3, 0, 57);
        aqVar.a(bArr5, 0, i);
        aqVar.b(bArr, 0, 114);
        byte[] bArrE2 = e(bArr);
        int[] iArr = new int[28];
        a(bArrE, iArr);
        int[] iArr2 = new int[14];
        a(bArrE2, iArr2);
        int[] iArr3 = new int[14];
        a(bArr2, iArr3);
        long j = 0;
        for (int i2 = 0; i2 < 14; i2++) {
            long jA = j + (((long) iArr[i2 + 14]) & 4294967295L) + (((long) c.a(14, iArr2[i2], iArr3, iArr, i2)) & 4294967295L);
            iArr[i2 + 14] = (int) jA;
            j = jA >>> 32;
        }
        byte[] bArr8 = new byte[114];
        for (int i3 = 0; i3 < 28; i3++) {
            a(iArr[i3], bArr8, i3 * 4);
        }
        byte[] bArrE3 = e(bArr8);
        System.arraycopy(bArr7, 0, bArr6, 0, 57);
        System.arraycopy(bArrE3, 0, bArr6, 57, 57);
    }

    private static void a(boolean z, b$a b_a, b$a b_a2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        if (z) {
            d.d(b_a.b, b_a.a, iArr12);
            iArr = iArr10;
            iArr2 = iArr11;
            iArr3 = iArr6;
            iArr4 = iArr9;
        } else {
            d.a(b_a.b, b_a.a, iArr12);
            iArr = iArr11;
            iArr2 = iArr10;
            iArr3 = iArr9;
            iArr4 = iArr6;
        }
        d.b(b_a.c, b_a2.c, iArr5);
        d.c(iArr5, iArr6);
        d.b(b_a.a, b_a2.a, iArr7);
        d.b(b_a.b, b_a2.b, iArr8);
        d.b(iArr7, iArr8, iArr9);
        d.a(iArr9, 39081, iArr9);
        d.a(iArr6, iArr9, iArr2);
        d.d(iArr6, iArr9, iArr);
        d.a(b_a2.a, b_a2.b, iArr9);
        d.b(iArr12, iArr9, iArr12);
        d.a(iArr8, iArr7, iArr4);
        d.d(iArr8, iArr7, iArr3);
        d.a(iArr4);
        d.d(iArr12, iArr6, iArr12);
        d.b(iArr12, iArr5, iArr12);
        d.b(iArr9, iArr5, iArr9);
        d.b(iArr10, iArr12, b_a2.a);
        d.b(iArr9, iArr11, b_a2.b);
        d.b(iArr10, iArr11, b_a2.c);
    }

    private static void b(b$a b_a) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        d.a(b_a.a, b_a.b, iArr);
        d.c(iArr, iArr);
        d.c(b_a.a, iArr2);
        d.c(b_a.b, iArr3);
        d.a(iArr2, iArr3, iArr4);
        d.a(iArr4);
        d.c(b_a.c, iArr5);
        d.a(iArr5, iArr5, iArr5);
        d.a(iArr5);
        d.d(iArr4, iArr5, iArr6);
        d.d(iArr, iArr4, iArr);
        d.d(iArr2, iArr3, iArr2);
        d.b(iArr, iArr6, b_a.a);
        d.b(iArr4, iArr2, b_a.b);
        d.b(iArr4, iArr6, b_a.c);
    }

    private static void c(b$a b_a) {
        int[] iArr = b_a.a;
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
        d.d(b_a.b);
        d.d(b_a.c);
    }

    private static void b() {
        synchronized (f) {
            if (h != null) {
                return;
            }
            b$a b_a = new b$a((byte) 0);
            d.a(d, b_a.a, 0);
            d.a(e, b_a.b, 0);
            d.d(b_a.c);
            g = a(b_a, 32);
            h = new int[2560];
            int i = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                b$a[] b_aArr = new b$a[5];
                b$a b_a2 = new b$a((byte) 0);
                c(b_a2);
                for (int i3 = 0; i3 < 5; i3++) {
                    a(true, b_a, b_a2);
                    b(b_a);
                    b_aArr[i3] = a(b_a);
                    if (i2 + i3 != 8) {
                        for (int i4 = 1; i4 < 18; i4++) {
                            b(b_a);
                        }
                    }
                }
                b$a[] b_aArr2 = new b$a[16];
                int i5 = 1;
                b_aArr2[0] = b_a2;
                for (int i6 = 0; i6 < 4; i6++) {
                    int i7 = 1 << i6;
                    int i8 = 0;
                    while (i8 < i7) {
                        b_aArr2[i5] = a(b_aArr2[i5 - i7]);
                        a(false, b_aArr[i6], b_aArr2[i5]);
                        i8++;
                        i5++;
                    }
                }
                for (int i9 = 0; i9 < 16; i9++) {
                    b$a b_a3 = b_aArr2[i9];
                    d.a(b_a3.c, b_a3.c);
                    d.b(b_a3.a, b_a3.c, b_a3.a);
                    d.b(b_a3.b, b_a3.c, b_a3.b);
                    d.a(b_a3.a, h, i);
                    int i10 = i + 16;
                    d.a(b_a3.b, h, i10);
                    i = i10 + 16;
                }
            }
        }
    }

    private static void b(byte[] bArr, b$a b_a) {
        b();
        c(b_a);
        int[] iArr = new int[15];
        a(bArr, iArr);
        iArr[14] = c.a(14, (iArr[0] ^ (-1)) & 1, iArr, c, iArr) + 4;
        c.d(15, iArr, 0);
        b$b b_b = new b$b((byte) 0);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 = (i4 & ((1 << i5) ^ (-1))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i5);
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                int i7 = ((-i6) ^ i4) & 15;
                int i8 = i3 * 16 * 2 * 16;
                for (int i9 = 0; i9 < 16; i9++) {
                    int i10 = ((i9 ^ i7) - 1) >> 31;
                    c.a(16, i10, h, i8, b_b.a);
                    int i11 = i8 + 16;
                    c.a(16, i10, h, i11, b_b.b);
                    i8 = i11 + 16;
                }
                int[] iArr2 = b_b.a;
                int[] iArr3 = new int[16];
                d.d(iArr3, iArr2, iArr3);
                c.a(16, i6, iArr3, 0, iArr2);
                int[] iArr4 = new int[16];
                int[] iArr5 = new int[16];
                int[] iArr6 = new int[16];
                int[] iArr7 = new int[16];
                int[] iArr8 = new int[16];
                int[] iArr9 = new int[16];
                int[] iArr10 = new int[16];
                d.c(b_a.c, iArr4);
                d.b(b_b.a, b_a.a, iArr5);
                d.b(b_b.b, b_a.b, iArr6);
                d.b(iArr5, iArr6, iArr7);
                d.a(iArr7, 39081, iArr7);
                d.a(iArr4, iArr7, iArr8);
                d.d(iArr4, iArr7, iArr9);
                d.a(b_b.a, b_b.b, iArr4);
                d.a(b_a.a, b_a.b, iArr7);
                d.b(iArr4, iArr7, iArr10);
                d.a(iArr6, iArr5, iArr4);
                d.d(iArr6, iArr5, iArr7);
                d.a(iArr4);
                d.d(iArr10, iArr4, iArr10);
                d.b(iArr10, b_a.c, iArr10);
                d.b(iArr7, b_a.c, iArr7);
                d.b(iArr8, iArr10, b_a.a);
                d.b(iArr7, iArr9, b_a.b);
                d.b(iArr8, iArr9, b_a.c);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                b(b_a);
            }
        }
    }

    public static void a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5) {
        if (!a(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        aq aqVarA = a();
        byte[] bArr6 = new byte[114];
        aqVarA.a(bArr, 0, 57);
        aqVarA.b(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        b(bArr6, bArr7);
        a(aqVarA, bArr6, bArr7, bArr2, bArr3, bArr4, i, bArr5);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        if (!a(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrC = org.bouncycastle.f.a.c(bArr, 0, 57);
        byte[] bArrC2 = org.bouncycastle.f.a.c(bArr, 57, 114);
        if (!b(bArrC) || !c(bArrC2)) {
            return false;
        }
        b$a b_a = new b$a((byte) 0);
        if (!a(bArr2, b_a)) {
            return false;
        }
        aq aqVarA = a();
        byte[] bArr5 = new byte[114];
        a(aqVarA, bArr3);
        aqVarA.a(bArrC, 0, 57);
        aqVarA.a(bArr2, 0, 57);
        aqVarA.a(bArr4, 0, i);
        aqVarA.b(bArr5, 0, 114);
        byte[] bArrE = e(bArr5);
        int[] iArr = new int[14];
        b(bArrC2, iArr);
        int[] iArr2 = new int[14];
        b(bArrE, iArr2);
        b$a b_a2 = new b$a((byte) 0);
        a(iArr, iArr2, b_a, b_a2);
        byte[] bArr6 = new byte[57];
        a(b_a2, bArr6);
        return org.bouncycastle.f.a.a(bArr6, bArrC);
    }
}
