package org.bouncycastle.d.a.d;

import java.security.SecureRandom;
import org.bouncycastle.b.b.x;
import org.bouncycastle.d.c.c;
import org.bouncycastle.d.c.h;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static final byte[] a = k.d("SigEd25519 no Ed25519 collisions");
    private static final int[] b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static Object i = new Object();
    private static a$b[] j = null;
    private static int[] k = null;

    private static int a(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i3] & 255) << 8) | ((bArr[i3 + 1] & 255) << 16);
    }

    private static a$b a(a$a a_a) {
        a$b a_b = new a$b((byte) 0);
        org.bouncycastle.d.a.c.b.a(a_a.a, a_b.a, 0);
        org.bouncycastle.d.a.c.b.a(a_a.b, a_b.b, 0);
        org.bouncycastle.d.a.c.b.a(a_a.c, a_b.c, 0);
        org.bouncycastle.d.a.c.b.b(a_a.d, a_a.e, a_b.d);
        return a_b;
    }

    private static void a(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i2 >>> 16);
        bArr[i5 + 1] = (byte) (i2 >>> 24);
    }

    public static void a(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void a(org.bouncycastle.d.a.c.a$a a_a, byte[] bArr, int[] iArr, int[] iArr2) {
        if (a_a == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        b(bArr, bArr2);
        a$a a_a2 = new a$a((byte) 0);
        a(bArr2, a_a2);
        org.bouncycastle.d.a.c.b.a(a_a2.b, iArr, 0);
        org.bouncycastle.d.a.c.b.a(a_a2.c, iArr2, 0);
    }

    private static void a(a$a a_a, byte[] bArr) {
        int[] iArrA = org.bouncycastle.d.a.c.b.a();
        int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
        org.bouncycastle.d.a.c.b.a(a_a.c, iArrA2);
        org.bouncycastle.d.a.c.b.b(a_a.a, iArrA2, iArrA);
        org.bouncycastle.d.a.c.b.b(a_a.b, iArrA2, iArrA2);
        org.bouncycastle.d.a.c.b.d(iArrA);
        org.bouncycastle.d.a.c.b.d(iArrA2);
        org.bouncycastle.d.a.c.b.a(iArrA2, bArr, 0);
        bArr[31] = (byte) (((iArrA[0] & 1) << 7) | bArr[31]);
    }

    private static void a(a$b a_b) {
        org.bouncycastle.d.a.c.b.e(a_b.c);
        org.bouncycastle.d.a.c.b.b(a_b.a, a_b.b, a_b.d);
    }

    private static void a(boolean z, a$b a_b, a$a a_a) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrA = org.bouncycastle.d.a.c.b.a();
        int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA3 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA4 = org.bouncycastle.d.a.c.b.a();
        int[] iArr5 = a_a.d;
        int[] iArrA5 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA6 = org.bouncycastle.d.a.c.b.a();
        int[] iArr6 = a_a.e;
        if (z) {
            iArr = iArrA5;
            iArr2 = iArrA6;
            iArr3 = iArrA3;
            iArr4 = iArrA4;
        } else {
            iArr = iArrA6;
            iArr2 = iArrA5;
            iArr3 = iArrA4;
            iArr4 = iArrA3;
        }
        org.bouncycastle.d.a.c.b.a(a_a.b, a_a.a, iArrA2, iArrA);
        org.bouncycastle.d.a.c.b.a(a_b.b, a_b.a, iArr3, iArr4);
        org.bouncycastle.d.a.c.b.b(iArrA, iArrA3, iArrA);
        org.bouncycastle.d.a.c.b.b(iArrA2, iArrA4, iArrA2);
        org.bouncycastle.d.a.c.b.b(a_a.d, a_a.e, iArrA3);
        org.bouncycastle.d.a.c.b.b(iArrA3, a_b.d, iArrA3);
        org.bouncycastle.d.a.c.b.b(iArrA3, g, iArrA3);
        org.bouncycastle.d.a.c.b.b(a_a.c, a_b.c, iArrA4);
        org.bouncycastle.d.a.c.b.a(iArrA4, iArrA4, iArrA4);
        org.bouncycastle.d.a.c.b.a(iArrA2, iArrA, iArr6, iArr5);
        org.bouncycastle.d.a.c.b.a(iArrA4, iArrA3, iArr, iArr2);
        org.bouncycastle.d.a.c.b.b(iArr);
        org.bouncycastle.d.a.c.b.b(iArr5, iArrA5, a_a.a);
        org.bouncycastle.d.a.c.b.b(iArrA6, iArr6, a_a.b);
        org.bouncycastle.d.a.c.b.b(iArrA5, iArrA6, a_a.c);
    }

    private static void a(boolean z, a$b a_b, a$b a_b2, a$b a_b3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrA = org.bouncycastle.d.a.c.b.a();
        int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA3 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA4 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA5 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA6 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA7 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA8 = org.bouncycastle.d.a.c.b.a();
        if (z) {
            iArr = iArrA6;
            iArr2 = iArrA7;
            iArr3 = iArrA3;
            iArr4 = iArrA4;
        } else {
            iArr = iArrA7;
            iArr2 = iArrA6;
            iArr3 = iArrA4;
            iArr4 = iArrA3;
        }
        org.bouncycastle.d.a.c.b.a(a_b.b, a_b.a, iArrA2, iArrA);
        org.bouncycastle.d.a.c.b.a(a_b2.b, a_b2.a, iArr3, iArr4);
        org.bouncycastle.d.a.c.b.b(iArrA, iArrA3, iArrA);
        org.bouncycastle.d.a.c.b.b(iArrA2, iArrA4, iArrA2);
        org.bouncycastle.d.a.c.b.b(a_b.d, a_b2.d, iArrA3);
        org.bouncycastle.d.a.c.b.b(iArrA3, g, iArrA3);
        org.bouncycastle.d.a.c.b.b(a_b.c, a_b2.c, iArrA4);
        org.bouncycastle.d.a.c.b.a(iArrA4, iArrA4, iArrA4);
        org.bouncycastle.d.a.c.b.a(iArrA2, iArrA, iArrA8, iArrA5);
        org.bouncycastle.d.a.c.b.a(iArrA4, iArrA3, iArr, iArr2);
        org.bouncycastle.d.a.c.b.b(iArr);
        org.bouncycastle.d.a.c.b.b(iArrA5, iArrA6, a_b3.a);
        org.bouncycastle.d.a.c.b.b(iArrA7, iArrA8, a_b3.b);
        org.bouncycastle.d.a.c.b.b(iArrA6, iArrA7, a_b3.c);
        org.bouncycastle.d.a.c.b.b(iArrA5, iArrA8, a_b3.d);
    }

    private static void a(byte[] bArr, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2 + 0] = b(bArr, (i2 * 4) + 0);
        }
    }

    private static boolean a(byte[] bArr) {
        int[] iArr = new int[8];
        a(bArr, iArr);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !h.d(iArr, b);
    }

    private static byte[] a(int[] iArr, int i2) {
        int[] iArr2 = new int[16];
        int i3 = 8;
        int i4 = 0;
        int i5 = 16;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i6 = iArr[i3];
            int i7 = i5 - 1;
            iArr2[i7] = (i4 << 16) | (i6 >>> 16);
            i5 = i7 - 1;
            iArr2[i5] = i6;
            i4 = i6;
        }
        byte[] bArr = new byte[256];
        int i8 = 1 << i2;
        int i9 = i8 - 1;
        int i10 = i8 >>> 1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < 16) {
            int i14 = iArr2[i11];
            while (i13 < 16) {
                int i15 = i14 >>> i13;
                if ((i15 & 1) == i12) {
                    i13++;
                } else {
                    int i16 = i12 + (i15 & i9);
                    int i17 = i16 & i10;
                    int i18 = i16 - (i17 << 1);
                    i12 = i17 >>> (i2 - 1);
                    bArr[(i11 << 4) + i13] = (byte) i18;
                    i13 += i2;
                }
            }
            i11++;
            i13 -= 16;
        }
        return bArr;
    }

    private static int b(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
        int i5 = i3 + 1;
        return i4 | ((bArr[i5] & 255) << 16) | (bArr[i5 + 1] << 24);
    }

    private static void b(a$a a_a) {
        int[] iArrA = org.bouncycastle.d.a.c.b.a();
        int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA3 = org.bouncycastle.d.a.c.b.a();
        int[] iArr = a_a.d;
        int[] iArrA4 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA5 = org.bouncycastle.d.a.c.b.a();
        int[] iArr2 = a_a.e;
        org.bouncycastle.d.a.c.b.d(a_a.a, iArrA);
        org.bouncycastle.d.a.c.b.d(a_a.b, iArrA2);
        org.bouncycastle.d.a.c.b.d(a_a.c, iArrA3);
        org.bouncycastle.d.a.c.b.a(iArrA3, iArrA3, iArrA3);
        org.bouncycastle.d.a.c.b.a(iArrA, iArrA2, iArr2, iArrA5);
        org.bouncycastle.d.a.c.b.a(a_a.a, a_a.b, iArr);
        org.bouncycastle.d.a.c.b.d(iArr, iArr);
        org.bouncycastle.d.a.c.b.d(iArr2, iArr, iArr);
        org.bouncycastle.d.a.c.b.a(iArrA3, iArrA5, iArrA4);
        org.bouncycastle.d.a.c.b.b(iArrA4);
        org.bouncycastle.d.a.c.b.b(iArr, iArrA4, a_a.a);
        org.bouncycastle.d.a.c.b.b(iArrA5, iArr2, a_a.b);
        org.bouncycastle.d.a.c.b.b(iArrA4, iArrA5, a_a.c);
    }

    private static void b(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & 127);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    private static byte[] b(byte[] bArr) {
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
        long j2 = ((long) bArr[63]) & 255;
        long j3 = jA9 + (jB9 >> 28);
        long j4 = jB9 & 268435455;
        long j5 = (jB7 - ((-6428113) * j2)) - (j3 * 5343);
        long j6 = ((jA6 - (127719000 * j2)) - ((-6428113) * j3)) - (j4 * 5343);
        long j7 = jA8 + (jB8 >> 28);
        long j8 = jB8 & 268435455;
        long j9 = (((jB6 - (19280294 * j2)) - (127719000 * j3)) - ((-6428113) * j4)) - (j7 * 5343);
        long j10 = ((((jA5 - ((-50998291) * j2)) - (19280294 * j3)) - (127719000 * j4)) - ((-6428113) * j7)) - (j8 * 5343);
        long j11 = (jA7 - (j2 * 5343)) + (j5 >> 28);
        long j12 = (j5 & 268435455) + (j6 >> 28);
        long j13 = ((((jA4 - ((-50998291) * j4)) - (19280294 * j7)) - (127719000 * j8)) - ((-6428113) * j11)) - (j12 * 5343);
        long j14 = (j6 & 268435455) + (j9 >> 28);
        long j15 = (j9 & 268435455) + (j10 >> 28);
        long j16 = jA - ((-50998291) * j15);
        long j17 = (jB2 - ((-50998291) * j14)) - (19280294 * j15);
        long j18 = ((jA2 - ((-50998291) * j12)) - (19280294 * j14)) - (127719000 * j15);
        long j19 = (((jB3 - ((-50998291) * j11)) - (19280294 * j12)) - (127719000 * j14)) - ((-6428113) * j15);
        long j20 = ((((jA3 - ((-50998291) * j8)) - (19280294 * j11)) - (127719000 * j12)) - ((-6428113) * j14)) - (j15 * 5343);
        long j21 = (((((jB5 - ((-50998291) * j3)) - (19280294 * j4)) - (127719000 * j7)) - ((-6428113) * j8)) - (j11 * 5343)) + (j13 >> 28);
        long j22 = (j10 & 268435455) + (j21 >> 28);
        long j23 = j21 & 268435455;
        long j24 = j23 >>> 27;
        long j25 = j22 + j24;
        long j26 = jB - ((-50998291) * j25);
        long j27 = (j16 - (19280294 * j25)) + (j26 >> 28);
        long j28 = (j17 - (127719000 * j25)) + (j27 >> 28);
        long j29 = (j18 - ((-6428113) * j25)) + (j28 >> 28);
        long j30 = (j19 - (j25 * 5343)) + (j29 >> 28);
        long j31 = j20 + (j30 >> 28);
        long j32 = (((((jB4 - ((-50998291) * j7)) - (19280294 * j8)) - (127719000 * j11)) - ((-6428113) * j12)) - (j14 * 5343)) + (j31 >> 28);
        long j33 = (j13 & 268435455) + (j32 >> 28);
        long j34 = j23 + (j33 >> 28);
        long j35 = (j34 >> 28) - j24;
        long j36 = (j26 & 268435455) + ((-50998291) & j35);
        long j37 = (j27 & 268435455) + (19280294 & j35) + (j36 >> 28);
        long j38 = (j28 & 268435455) + (127719000 & j35) + (j37 >> 28);
        long j39 = (j29 & 268435455) + ((-6428113) & j35) + (j38 >> 28);
        long j40 = (j30 & 268435455) + (j35 & 5343) + (j39 >> 28);
        long j41 = (j31 & 268435455) + (j40 >> 28);
        long j42 = (j32 & 268435455) + (j41 >> 28);
        long j43 = (j33 & 268435455) + (j42 >> 28);
        byte[] bArr2 = new byte[32];
        a((j36 & 268435455) | ((j37 & 268435455) << 28), bArr2, 0);
        a(((j39 & 268435455) << 28) | (j38 & 268435455), bArr2, 7);
        a(((j41 & 268435455) << 28) | (j40 & 268435455), bArr2, 14);
        a(((j43 & 268435455) << 28) | (j42 & 268435455), bArr2, 21);
        a((int) ((j34 & 268435455) + (j43 >> 28)), bArr2, 28);
        return bArr2;
    }

    private static void c(a$a a_a) {
        org.bouncycastle.d.a.c.b.g(a_a.a);
        org.bouncycastle.d.a.c.b.e(a_a.b);
        org.bouncycastle.d.a.c.b.e(a_a.c);
        org.bouncycastle.d.a.c.b.g(a_a.d);
        org.bouncycastle.d.a.c.b.e(a_a.e);
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        a$a a_a = new a$a((byte) 0);
        a(bArr, a_a);
        a(a_a, bArr2);
    }

    private static void a(long j2, byte[] bArr, int i2) {
        a((int) j2, bArr, i2);
        int i3 = (int) (j2 >>> 32);
        int i4 = i2 + 4;
        bArr[i4] = (byte) i3;
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i3 >>> 8);
        bArr[i5 + 1] = (byte) (i3 >>> 16);
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        x xVar = new x();
        byte[] bArr3 = new byte[xVar.b()];
        xVar.a(bArr, 0, 32);
        xVar.a(bArr3, 0);
        byte[] bArr4 = new byte[32];
        b(bArr3, bArr4);
        c(bArr4, bArr2);
    }

    private static a$b[] a(a$b a_b, int i2) {
        a$b a_b2 = new a$b((byte) 0);
        a(false, a_b, a_b, a_b2);
        a$b[] a_bArr = new a$b[i2];
        a$b a_b3 = new a$b((byte) 0);
        org.bouncycastle.d.a.c.b.a(a_b.a, a_b3.a, 0);
        org.bouncycastle.d.a.c.b.a(a_b.b, a_b3.b, 0);
        org.bouncycastle.d.a.c.b.a(a_b.c, a_b3.c, 0);
        org.bouncycastle.d.a.c.b.a(a_b.d, a_b3.d, 0);
        a_bArr[0] = a_b3;
        for (int i3 = 1; i3 < i2; i3++) {
            a$b a_b4 = a_bArr[i3 - 1];
            a$b a_b5 = new a$b((byte) 0);
            a_bArr[i3] = a_b5;
            a(false, a_b4, a_b2, a_b5);
        }
        return a_bArr;
    }

    private static void a() {
        synchronized (i) {
            if (k != null) {
                return;
            }
            a$b a_b = new a$b((byte) 0);
            org.bouncycastle.d.a.c.b.a(d, a_b.a, 0);
            org.bouncycastle.d.a.c.b.a(e, a_b.b, 0);
            a(a_b);
            j = a(a_b, 32);
            a$a a_a = new a$a((byte) 0);
            org.bouncycastle.d.a.c.b.a(d, a_a.a, 0);
            org.bouncycastle.d.a.c.b.a(e, a_a.b, 0);
            org.bouncycastle.d.a.c.b.e(a_a.c);
            org.bouncycastle.d.a.c.b.a(a_a.a, a_a.d, 0);
            org.bouncycastle.d.a.c.b.a(a_a.b, a_a.e, 0);
            k = new int[1920];
            int i2 = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                a$b[] a_bArr = new a$b[4];
                a$b a_b2 = new a$b((byte) 0);
                org.bouncycastle.d.a.c.b.g(a_b2.a);
                org.bouncycastle.d.a.c.b.e(a_b2.b);
                org.bouncycastle.d.a.c.b.e(a_b2.c);
                org.bouncycastle.d.a.c.b.g(a_b2.d);
                for (int i4 = 0; i4 < 4; i4++) {
                    a(true, a_b2, a(a_a), a_b2);
                    b(a_a);
                    a_bArr[i4] = a(a_a);
                    if (i3 + i4 != 10) {
                        for (int i5 = 1; i5 < 8; i5++) {
                            b(a_a);
                        }
                    }
                }
                a$b[] a_bArr2 = new a$b[8];
                int i6 = 1;
                a_bArr2[0] = a_b2;
                for (int i7 = 0; i7 < 3; i7++) {
                    int i8 = 1 << i7;
                    int i9 = 0;
                    while (i9 < i8) {
                        a$b a_b3 = a_bArr2[i6 - i8];
                        a$b a_b4 = a_bArr[i7];
                        a$b a_b5 = new a$b((byte) 0);
                        a_bArr2[i6] = a_b5;
                        a(false, a_b3, a_b4, a_b5);
                        i9++;
                        i6++;
                    }
                }
                for (int i10 = 0; i10 < 8; i10++) {
                    a$b a_b6 = a_bArr2[i10];
                    int[] iArrA = org.bouncycastle.d.a.c.b.a();
                    int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
                    org.bouncycastle.d.a.c.b.a(a_b6.c, a_b6.c, iArrA);
                    org.bouncycastle.d.a.c.b.a(iArrA, iArrA2);
                    org.bouncycastle.d.a.c.b.b(a_b6.a, iArrA2, iArrA);
                    org.bouncycastle.d.a.c.b.b(a_b6.b, iArrA2, iArrA2);
                    a$c a_c = new a$c((byte) 0);
                    org.bouncycastle.d.a.c.b.a(iArrA2, iArrA, a_c.a, a_c.b);
                    org.bouncycastle.d.a.c.b.b(iArrA, iArrA2, a_c.c);
                    org.bouncycastle.d.a.c.b.b(a_c.c, h, a_c.c);
                    org.bouncycastle.d.a.c.b.d(a_c.a);
                    org.bouncycastle.d.a.c.b.d(a_c.b);
                    org.bouncycastle.d.a.c.b.a(a_c.a, k, i2);
                    int i11 = i2 + 10;
                    org.bouncycastle.d.a.c.b.a(a_c.b, k, i11);
                    int i12 = i11 + 10;
                    org.bouncycastle.d.a.c.b.a(a_c.c, k, i12);
                    i2 = i12 + 10;
                }
            }
        }
    }

    private static void a(byte[] bArr, a$a a_a) {
        a();
        c(a_a);
        int[] iArr = new int[8];
        a(bArr, iArr);
        c.a(8, (iArr[0] ^ (-1)) & 1, iArr, c, iArr);
        c.d(8, iArr, 1);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iArr[i2];
            int i4 = ((i3 >>> 7) ^ i3) & 11141290;
            int i5 = i3 ^ (i4 ^ (i4 << 7));
            int i6 = ((i5 >>> 14) ^ i5) & 52428;
            int i7 = i5 ^ (i6 ^ (i6 << 14));
            int i8 = ((i7 >>> 4) ^ i7) & 15728880;
            int i9 = i7 ^ (i8 ^ (i8 << 4));
            int i10 = ((i9 >>> 8) ^ i9) & 65280;
            iArr[i2] = i9 ^ (i10 ^ (i10 << 8));
        }
        a$c a_c = new a$c((byte) 0);
        int i11 = 28;
        while (true) {
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= 8) {
                    break;
                }
                int i14 = iArr[i13] >>> i11;
                int i15 = (i14 >>> 3) & 1;
                int i16 = (i14 ^ (-i15)) & 7;
                int i17 = i13 * 8 * 3 * 10;
                for (int i18 = 0; i18 < 8; i18++) {
                    int i19 = ((i18 ^ i16) - 1) >> 31;
                    c.a(10, i19, k, i17, a_c.a);
                    int i20 = i17 + 10;
                    c.a(10, i19, k, i20, a_c.b);
                    int i21 = i20 + 10;
                    c.a(10, i19, k, i21, a_c.c);
                    i17 = i21 + 10;
                }
                org.bouncycastle.d.a.c.b.a(i15, a_c.a, a_c.b);
                org.bouncycastle.d.a.c.b.a(i15, a_c.c);
                int[] iArrA = org.bouncycastle.d.a.c.b.a();
                int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
                int[] iArrA3 = org.bouncycastle.d.a.c.b.a();
                int[] iArr2 = a_a.d;
                int[] iArrA4 = org.bouncycastle.d.a.c.b.a();
                int[] iArrA5 = org.bouncycastle.d.a.c.b.a();
                int[] iArr3 = a_a.e;
                org.bouncycastle.d.a.c.b.a(a_a.b, a_a.a, iArrA2, iArrA);
                org.bouncycastle.d.a.c.b.b(iArrA, a_c.b, iArrA);
                org.bouncycastle.d.a.c.b.b(iArrA2, a_c.a, iArrA2);
                org.bouncycastle.d.a.c.b.b(a_a.d, a_a.e, iArrA3);
                org.bouncycastle.d.a.c.b.b(iArrA3, a_c.c, iArrA3);
                org.bouncycastle.d.a.c.b.a(iArrA2, iArrA, iArr3, iArr2);
                org.bouncycastle.d.a.c.b.a(a_a.c, iArrA3, iArrA5, iArrA4);
                org.bouncycastle.d.a.c.b.b(iArrA5);
                org.bouncycastle.d.a.c.b.b(iArr2, iArrA4, a_a.a);
                org.bouncycastle.d.a.c.b.b(iArrA5, iArr3, a_a.b);
                org.bouncycastle.d.a.c.b.b(iArrA4, iArrA5, a_a.c);
                i12 = i13 + 1;
            }
            i11 -= 4;
            if (i11 < 0) {
                return;
            } else {
                b(a_a);
            }
        }
    }

    public static void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) {
        x xVar = new x();
        byte[] bArr5 = new byte[xVar.b()];
        xVar.a(bArr, 0, 32);
        xVar.a(bArr5, 0);
        byte[] bArr6 = new byte[32];
        b(bArr5, bArr6);
        xVar.a(bArr5, 32, 32);
        xVar.a(bArr3, 0, i2);
        xVar.a(bArr5, 0);
        byte[] bArrB = b(bArr5);
        byte[] bArr7 = new byte[32];
        c(bArrB, bArr7);
        xVar.a(bArr7, 0, 32);
        xVar.a(bArr2, 0, 32);
        xVar.a(bArr3, 0, i2);
        xVar.a(bArr5, 0);
        byte[] bArrB2 = b(bArr5);
        int[] iArr = new int[16];
        a(bArrB, iArr);
        int[] iArr2 = new int[8];
        a(bArrB2, iArr2);
        int[] iArr3 = new int[8];
        a(bArr6, iArr3);
        h.e(iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[64];
        for (int i3 = 0; i3 < 16; i3++) {
            a(iArr[i3], bArr8, i3 * 4);
        }
        byte[] bArrB3 = b(bArr8);
        System.arraycopy(bArr7, 0, bArr4, 0, 32);
        System.arraycopy(bArrB3, 0, bArr4, 32, 32);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        boolean z;
        byte[] bArrC = org.bouncycastle.f.a.c(bArr, 0, 32);
        byte[] bArrC2 = org.bouncycastle.f.a.c(bArr, 32, 64);
        if (!a(bArrC)) {
            return false;
        }
        int[] iArr = new int[8];
        a(bArrC2, iArr);
        if (!(!h.d(iArr, c))) {
            return false;
        }
        a$b a_b = new a$b((byte) 0);
        byte[] bArrC3 = org.bouncycastle.f.a.c(bArr2, 0, 32);
        if (a(bArrC3)) {
            int i3 = (bArrC3[31] & 128) >>> 7;
            bArrC3[31] = (byte) (bArrC3[31] & 127);
            org.bouncycastle.d.a.c.b.a(bArrC3, a_b.b);
            int[] iArrA = org.bouncycastle.d.a.c.b.a();
            int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
            org.bouncycastle.d.a.c.b.d(a_b.b, iArrA);
            org.bouncycastle.d.a.c.b.b(f, iArrA, iArrA2);
            org.bouncycastle.d.a.c.b.f(iArrA);
            org.bouncycastle.d.a.c.b.a(iArrA2);
            if (org.bouncycastle.d.a.c.b.c(iArrA, iArrA2, a_b.a)) {
                org.bouncycastle.d.a.c.b.d(a_b.a);
                if (i3 == 1 && org.bouncycastle.d.a.c.b.c(a_b.a)) {
                    z = false;
                } else {
                    if (!(i3 != (a_b.a[0] & 1))) {
                        org.bouncycastle.d.a.c.b.c(a_b.a, a_b.a);
                    }
                    a(a_b);
                    z = true;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        x xVar = new x();
        byte[] bArr4 = new byte[xVar.b()];
        xVar.a(bArrC, 0, 32);
        xVar.a(bArr2, 0, 32);
        xVar.a(bArr3, 0, i2);
        xVar.a(bArr4, 0);
        byte[] bArrB = b(bArr4);
        int[] iArr2 = new int[8];
        a(bArrC2, iArr2);
        int[] iArr3 = new int[8];
        a(bArrB, iArr3);
        a$a a_a = new a$a((byte) 0);
        a();
        byte[] bArrA = a(iArr2, 7);
        byte[] bArrA2 = a(iArr3, 5);
        a$b[] a_bArrA = a(a_b, 8);
        c(a_a);
        int i4 = 255;
        while (i4 > 0 && (bArrA[i4] | bArrA2[i4]) == 0) {
            i4--;
        }
        while (true) {
            int i5 = i4;
            byte b2 = bArrA[i5];
            if (b2 != 0) {
                int i6 = b2 >> 31;
                a(i6 != 0, j[(b2 ^ i6) >>> 1], a_a);
            }
            byte b3 = bArrA2[i5];
            if (b3 != 0) {
                int i7 = b3 >> 31;
                a(i7 != 0, a_bArrA[(b3 ^ i7) >>> 1], a_a);
            }
            i4 = i5 - 1;
            if (i4 < 0) {
                byte[] bArr5 = new byte[32];
                a(a_a, bArr5);
                return org.bouncycastle.f.a.a(bArr5, bArrC);
            }
            b(a_a);
        }
    }
}
