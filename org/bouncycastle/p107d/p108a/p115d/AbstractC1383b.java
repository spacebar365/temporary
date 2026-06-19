package org.bouncycastle.p107d.p108a.p115d;

import java.security.SecureRandom;
import org.bouncycastle.p083b.InterfaceC0817aq;
import org.bouncycastle.p083b.p086b.C0849z;
import org.bouncycastle.p107d.p108a.p114c.AbstractC1379c;
import org.bouncycastle.p107d.p108a.p114c.AbstractC1380d;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.d.a.d.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1383b {

    /* JADX INFO: renamed from: a */
    private static final byte[] f5047a = C1560k.m4168d("SigEd448");

    /* JADX INFO: renamed from: b */
    private static final int[] f5048b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c */
    private static final int[] f5049c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};

    /* JADX INFO: renamed from: d */
    private static final int[] f5050d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};

    /* JADX INFO: renamed from: e */
    private static final int[] f5051e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};

    /* JADX INFO: renamed from: f */
    private static Object f5052f = new Object();

    /* JADX INFO: renamed from: g */
    private static a[] f5053g = null;

    /* JADX INFO: renamed from: h */
    private static int[] f5054h = null;

    /* JADX INFO: renamed from: a */
    private static int m3403a(byte[] bArr, int i) {
        int i2 = i + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16);
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0817aq m3404a() {
        return new C0849z(256);
    }

    /* JADX INFO: renamed from: a */
    private static a m3405a(a aVar) {
        a aVar2 = new a((byte) 0);
        AbstractC1380d.m3337a(aVar.f5055a, aVar2.f5055a, 0);
        AbstractC1380d.m3337a(aVar.f5056b, aVar2.f5056b, 0);
        AbstractC1380d.m3337a(aVar.f5057c, aVar2.f5057c, 0);
        return aVar2;
    }

    /* JADX INFO: renamed from: a */
    private static void m3406a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    public static void m3408a(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m3409a(InterfaceC0817aq interfaceC0817aq, byte[] bArr) {
        interfaceC0817aq.mo1929a(f5047a, 0, f5047a.length);
        interfaceC0817aq.mo1928a((byte) 0);
        interfaceC0817aq.mo1928a((byte) bArr.length);
        interfaceC0817aq.mo1929a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static void m3411a(AbstractC1379c.a aVar, byte[] bArr, int[] iArr, int[] iArr2) {
        byte b2 = 0;
        if (aVar == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        m3427b(bArr, bArr2);
        a aVar2 = new a(b2);
        m3426b(bArr2, aVar2);
        AbstractC1380d.m3337a(aVar2.f5055a, iArr, 0);
        AbstractC1380d.m3337a(aVar2.f5056b, iArr2, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m3414a(byte[] bArr, byte[] bArr2) {
        InterfaceC0817aq interfaceC0817aqM3404a = m3404a();
        byte[] bArr3 = new byte[114];
        interfaceC0817aqM3404a.mo1929a(bArr, 0, 57);
        interfaceC0817aqM3404a.mo1918b(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        m3427b(bArr3, bArr4);
        m3431c(bArr4, bArr2);
    }

    /* JADX INFO: renamed from: a */
    private static void m3416a(byte[] bArr, int[] iArr) {
        for (int i = 0; i < 14; i++) {
            iArr[i + 0] = m3423b(bArr, (i * 4) + 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3417a(int[] iArr, int[] iArr2, a aVar, a aVar2) {
        m3424b();
        byte[] bArrM3421a = m3421a(iArr, 7);
        byte[] bArrM3421a2 = m3421a(iArr2, 5);
        a[] aVarArrM3422a = m3422a(aVar, 8);
        m3430c(aVar2);
        int i = 447;
        while (i > 0 && (bArrM3421a[i] | bArrM3421a2[i]) == 0) {
            i--;
        }
        while (true) {
            byte b2 = bArrM3421a[i];
            if (b2 != 0) {
                int i2 = b2 >> 31;
                m3413a(i2 != 0, f5053g[(b2 ^ i2) >>> 1], aVar2);
            }
            byte b3 = bArrM3421a2[i];
            if (b3 != 0) {
                int i3 = b3 >> 31;
                m3413a(i3 != 0, aVarArrM3422a[(b3 ^ i3) >>> 1], aVar2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                m3425b(aVar2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3418a(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m3421a(int[] iArr, int i) {
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

    /* JADX INFO: renamed from: a */
    private static a[] m3422a(a aVar, int i) {
        a aVarM3405a = m3405a(aVar);
        m3425b(aVarM3405a);
        a[] aVarArr = new a[i];
        aVarArr[0] = m3405a(aVar);
        for (int i2 = 1; i2 < i; i2++) {
            aVarArr[i2] = m3405a(aVarArr[i2 - 1]);
            m3413a(false, aVarM3405a, aVarArr[i2]);
        }
        return aVarArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m3423b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    /* JADX INFO: renamed from: b */
    private static void m3427b(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    /* JADX INFO: renamed from: b */
    private static void m3428b(byte[] bArr, int[] iArr) {
        m3416a(bArr, iArr);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m3429b(byte[] bArr) {
        if ((bArr[56] & 127) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        m3416a(bArr, iArr);
        return !AbstractC1416c.m3596c(14, iArr, f5048b);
    }

    /* JADX INFO: renamed from: c */
    private static void m3431c(byte[] bArr, byte[] bArr2) {
        a aVar = new a((byte) 0);
        m3426b(bArr, aVar);
        m3412a(aVar, bArr2);
    }

    /* JADX INFO: renamed from: d */
    private static int m3433d(byte[] bArr) {
        return (bArr[112] & 255) | ((bArr[113] & 255) << 8);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m3434e(byte[] bArr) {
        long jM3423b = ((long) m3423b(bArr, 0)) & 4294967295L;
        long jM3403a = ((long) (m3403a(bArr, 4) << 4)) & 4294967295L;
        long jM3423b2 = ((long) m3423b(bArr, 7)) & 4294967295L;
        long jM3403a2 = ((long) (m3403a(bArr, 11) << 4)) & 4294967295L;
        long jM3423b3 = ((long) m3423b(bArr, 14)) & 4294967295L;
        long jM3403a3 = ((long) (m3403a(bArr, 18) << 4)) & 4294967295L;
        long jM3423b4 = ((long) m3423b(bArr, 21)) & 4294967295L;
        long jM3403a4 = ((long) (m3403a(bArr, 25) << 4)) & 4294967295L;
        long jM3423b5 = ((long) m3423b(bArr, 28)) & 4294967295L;
        long jM3403a5 = ((long) (m3403a(bArr, 32) << 4)) & 4294967295L;
        long jM3423b6 = ((long) m3423b(bArr, 35)) & 4294967295L;
        long jM3403a6 = ((long) (m3403a(bArr, 39) << 4)) & 4294967295L;
        long jM3423b7 = ((long) m3423b(bArr, 42)) & 4294967295L;
        long jM3403a7 = ((long) (m3403a(bArr, 46) << 4)) & 4294967295L;
        long jM3423b8 = ((long) m3423b(bArr, 49)) & 4294967295L;
        long jM3403a8 = ((long) (m3403a(bArr, 53) << 4)) & 4294967295L;
        long jM3423b9 = ((long) m3423b(bArr, 56)) & 4294967295L;
        long jM3403a9 = ((long) (m3403a(bArr, 60) << 4)) & 4294967295L;
        long jM3423b10 = ((long) m3423b(bArr, 63)) & 4294967295L;
        long jM3403a10 = ((long) (m3403a(bArr, 67) << 4)) & 4294967295L;
        long jM3423b11 = ((long) m3423b(bArr, 70)) & 4294967295L;
        long jM3403a11 = ((long) (m3403a(bArr, 74) << 4)) & 4294967295L;
        long jM3423b12 = ((long) m3423b(bArr, 77)) & 4294967295L;
        long jM3403a12 = ((long) (m3403a(bArr, 81) << 4)) & 4294967295L;
        long jM3423b13 = ((long) m3423b(bArr, 84)) & 4294967295L;
        long jM3403a13 = ((long) (m3403a(bArr, 88) << 4)) & 4294967295L;
        long jM3423b14 = ((long) m3423b(bArr, 91)) & 4294967295L;
        long jM3403a14 = ((long) (m3403a(bArr, 95) << 4)) & 4294967295L;
        long jM3423b15 = ((long) m3423b(bArr, 98)) & 4294967295L;
        long jM3403a15 = ((long) (m3403a(bArr, 102) << 4)) & 4294967295L;
        long jM3423b16 = ((long) m3423b(bArr, 105)) & 4294967295L;
        long jM3403a16 = ((long) (m3403a(bArr, 109) << 4)) & 4294967295L;
        long jM3433d = ((long) m3433d(bArr)) & 4294967295L;
        long j = jM3403a16 + (jM3423b16 >>> 28);
        long j2 = jM3423b16 & 268435455;
        long j3 = jM3403a15 + (jM3423b15 >>> 28);
        long j4 = jM3423b15 & 268435455;
        long j5 = jM3423b11 + (96434764 * jM3433d) + (227822194 * j) + (149865618 * j2) + (j3 * 550336261);
        long j6 = jM3403a14 + (jM3423b14 >>> 28);
        long j7 = jM3423b14 & 268435455;
        long j8 = jM3403a9 + (30366549 * jM3433d) + (163752818 * j) + (258169998 * j2) + (96434764 * j3) + (227822194 * j4) + (149865618 * j6) + (j7 * 550336261);
        long j9 = jM3403a13 + (jM3423b13 >>> 28);
        long j10 = jM3403a11 + (227822194 * jM3433d) + (149865618 * j) + (j2 * 550336261) + (j5 >>> 28);
        long j11 = jM3423b12 + (149865618 * jM3433d) + (j * 550336261) + (j10 >>> 28);
        long j12 = jM3403a12 + (jM3433d * 550336261) + (j11 >>> 28);
        long j13 = j11 & 268435455;
        long j14 = (jM3423b13 & 268435455) + (j12 >>> 28);
        long j15 = j12 & 268435455;
        long j16 = jM3423b8 + (43969588 * j2) + (30366549 * j3) + (163752818 * j4) + (258169998 * j6) + (96434764 * j7) + (227822194 * j9) + (149865618 * j14) + (j15 * 550336261);
        long j17 = jM3423b10 + (163752818 * jM3433d) + (258169998 * j) + (96434764 * j2) + (227822194 * j3) + (149865618 * j4) + (j6 * 550336261) + (j8 >>> 28);
        long j18 = jM3403a10 + (258169998 * jM3433d) + (96434764 * j) + (227822194 * j2) + (149865618 * j3) + (j4 * 550336261) + (j17 >>> 28);
        long j19 = (j5 & 268435455) + (j18 >>> 28);
        long j20 = j18 & 268435455;
        long j21 = (j10 & 268435455) + (j19 >>> 28);
        long j22 = j19 & 268435455;
        long j23 = jM3403a8 + (43969588 * j) + (30366549 * j2) + (163752818 * j3) + (258169998 * j4) + (96434764 * j6) + (227822194 * j7) + (149865618 * j9) + (j14 * 550336261) + (j16 >>> 28);
        long j24 = jM3423b9 + (43969588 * jM3433d) + (30366549 * j) + (163752818 * j2) + (258169998 * j3) + (96434764 * j4) + (227822194 * j6) + (149865618 * j7) + (j9 * 550336261) + (j23 >>> 28);
        long j25 = j23 & 268435455;
        long j26 = (j8 & 268435455) + (j24 >>> 28);
        long j27 = (j17 & 268435455) + (j26 >>> 28);
        long j28 = j26 & 268435455;
        long j29 = ((j24 & 268435455) * 4) + (j25 >>> 26) + 1;
        long j30 = jM3423b + (78101261 * j29);
        long j31 = jM3403a + (43969588 * j28) + (141809365 * j29) + (j30 >>> 28);
        long j32 = jM3423b2 + (43969588 * j27) + (30366549 * j28) + (175155932 * j29) + (j31 >>> 28);
        long j33 = jM3403a2 + (43969588 * j20) + (30366549 * j27) + (163752818 * j28) + (64542499 * j29) + (j32 >>> 28);
        long j34 = jM3423b3 + (43969588 * j22) + (30366549 * j20) + (163752818 * j27) + (258169998 * j28) + (158326419 * j29) + (j33 >>> 28);
        long j35 = jM3403a3 + (43969588 * j21) + (30366549 * j22) + (163752818 * j20) + (258169998 * j27) + (96434764 * j28) + (191173276 * j29) + (j34 >>> 28);
        long j36 = jM3423b4 + (43969588 * j13) + (30366549 * j21) + (163752818 * j22) + (258169998 * j20) + (96434764 * j27) + (227822194 * j28) + (104575268 * j29) + (j35 >>> 28);
        long j37 = jM3403a4 + (43969588 * j15) + (30366549 * j13) + (163752818 * j21) + (258169998 * j22) + (96434764 * j20) + (227822194 * j27) + (149865618 * j28) + (j29 * 137584065) + (j36 >>> 28);
        long j38 = jM3423b5 + (43969588 * j14) + (30366549 * j15) + (163752818 * j13) + (258169998 * j21) + (96434764 * j22) + (227822194 * j20) + (149865618 * j27) + (j28 * 550336261) + (j37 >>> 28);
        long j39 = jM3403a5 + (43969588 * j9) + (30366549 * j14) + (163752818 * j15) + (258169998 * j13) + (96434764 * j21) + (227822194 * j22) + (149865618 * j20) + (j27 * 550336261) + (j38 >>> 28);
        long j40 = jM3423b6 + (43969588 * j7) + (30366549 * j9) + (163752818 * j14) + (258169998 * j15) + (96434764 * j13) + (227822194 * j21) + (149865618 * j22) + (j20 * 550336261) + (j39 >>> 28);
        long j41 = jM3403a6 + (43969588 * j6) + (30366549 * j7) + (163752818 * j9) + (258169998 * j14) + (96434764 * j15) + (227822194 * j13) + (149865618 * j21) + (j22 * 550336261) + (j40 >>> 28);
        long j42 = jM3423b7 + (43969588 * j4) + (30366549 * j6) + (163752818 * j7) + (258169998 * j9) + (96434764 * j14) + (227822194 * j15) + (149865618 * j13) + (j21 * 550336261) + (j41 >>> 28);
        long j43 = jM3403a7 + (43969588 * j3) + (30366549 * j4) + (163752818 * j6) + (258169998 * j7) + (96434764 * j9) + (227822194 * j14) + (149865618 * j15) + (j13 * 550336261) + (j42 >>> 28);
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
        m3407a((j47 & 268435455) | ((j48 & 268435455) << 28), bArr2, 0);
        m3407a(((j50 & 268435455) << 28) | (j49 & 268435455), bArr2, 7);
        m3407a(((j52 & 268435455) << 28) | (j51 & 268435455), bArr2, 14);
        m3407a(((j54 & 268435455) << 28) | (j53 & 268435455), bArr2, 21);
        m3407a(((j56 & 268435455) << 28) | (j55 & 268435455), bArr2, 28);
        m3407a(((j58 & 268435455) << 28) | (j57 & 268435455), bArr2, 35);
        m3407a(((j60 & 268435455) << 28) | (j59 & 268435455), bArr2, 42);
        m3407a((((j45 & 67108863) + (j61 >> 28)) << 28) | (j61 & 268435455), bArr2, 49);
        return bArr2;
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d.b$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        int[] f5055a;

        /* JADX INFO: renamed from: b */
        int[] f5056b;

        /* JADX INFO: renamed from: c */
        int[] f5057c;

        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            this.f5055a = new int[16];
            this.f5056b = new int[16];
            this.f5057c = new int[16];
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d.b$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        int[] f5058a;

        /* JADX INFO: renamed from: b */
        int[] f5059b;

        /* synthetic */ b(byte b) {
            this();
        }

        private b() {
            this.f5058a = new int[16];
            this.f5059b = new int[16];
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3432c(byte[] bArr) {
        if (bArr[56] != 0) {
            return false;
        }
        int[] iArr = new int[14];
        m3416a(bArr, iArr);
        return !AbstractC1416c.m3596c(14, iArr, f5049c);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3419a(byte[] bArr, a aVar) {
        byte[] bArrM4090c = C1535a.m4090c(bArr, 0, 57);
        if (!m3429b(bArrM4090c)) {
            return false;
        }
        int i = (bArrM4090c[56] & 128) >>> 7;
        bArrM4090c[56] = (byte) (bArrM4090c[56] & 127);
        AbstractC1380d.m3330a(bArrM4090c, aVar.f5056b);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        AbstractC1380d.m3346c(aVar.f5056b, iArr);
        AbstractC1380d.m3334a(iArr, 39081, iArr2);
        AbstractC1380d.m3342b(iArr, iArr);
        iArr[0] = iArr[0] + 1;
        iArr2[0] = iArr2[0] + 1;
        if (!AbstractC1380d.m3347c(iArr, iArr2, aVar.f5055a)) {
            return false;
        }
        AbstractC1380d.m3345c(aVar.f5055a);
        if (i == 1 && AbstractC1380d.m3344b(aVar.f5055a)) {
            return false;
        }
        if (!(i != (aVar.f5055a[0] & 1))) {
            AbstractC1380d.m3342b(aVar.f5055a, aVar.f5055a);
        }
        AbstractC1380d.m3348d(aVar.f5057c);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static void m3407a(long j, byte[] bArr, int i) {
        m3406a((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        int i3 = i + 4;
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i4 + 1] = (byte) (i2 >>> 16);
    }

    /* JADX INFO: renamed from: a */
    private static void m3412a(a aVar, byte[] bArr) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        AbstractC1380d.m3336a(aVar.f5057c, iArr2);
        AbstractC1380d.m3343b(aVar.f5055a, iArr2, iArr);
        AbstractC1380d.m3343b(aVar.f5056b, iArr2, iArr2);
        AbstractC1380d.m3345c(iArr);
        AbstractC1380d.m3345c(iArr2);
        AbstractC1380d.m3335a(iArr2, bArr, 0);
        bArr[56] = (byte) ((iArr[0] & 1) << 7);
    }

    /* JADX INFO: renamed from: a */
    private static void m3410a(InterfaceC0817aq interfaceC0817aq, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6) {
        m3409a(interfaceC0817aq, bArr4);
        interfaceC0817aq.mo1929a(bArr, 57, 57);
        interfaceC0817aq.mo1929a(bArr5, 0, i);
        interfaceC0817aq.mo1918b(bArr, 0, 114);
        byte[] bArrM3434e = m3434e(bArr);
        byte[] bArr7 = new byte[57];
        m3431c(bArrM3434e, bArr7);
        m3409a(interfaceC0817aq, bArr4);
        interfaceC0817aq.mo1929a(bArr7, 0, 57);
        interfaceC0817aq.mo1929a(bArr3, 0, 57);
        interfaceC0817aq.mo1929a(bArr5, 0, i);
        interfaceC0817aq.mo1918b(bArr, 0, 114);
        byte[] bArrM3434e2 = m3434e(bArr);
        int[] iArr = new int[28];
        m3416a(bArrM3434e, iArr);
        int[] iArr2 = new int[14];
        m3416a(bArrM3434e2, iArr2);
        int[] iArr3 = new int[14];
        m3416a(bArr2, iArr3);
        long j = 0;
        for (int i2 = 0; i2 < 14; i2++) {
            long jM3570a = j + (((long) iArr[i2 + 14]) & 4294967295L) + (((long) AbstractC1416c.m3570a(14, iArr2[i2], iArr3, iArr, i2)) & 4294967295L);
            iArr[i2 + 14] = (int) jM3570a;
            j = jM3570a >>> 32;
        }
        byte[] bArr8 = new byte[114];
        for (int i3 = 0; i3 < 28; i3++) {
            m3406a(iArr[i3], bArr8, i3 * 4);
        }
        byte[] bArrM3434e3 = m3434e(bArr8);
        System.arraycopy(bArr7, 0, bArr6, 0, 57);
        System.arraycopy(bArrM3434e3, 0, bArr6, 57, 57);
    }

    /* JADX INFO: renamed from: a */
    private static void m3413a(boolean z, a aVar, a aVar2) {
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
            AbstractC1380d.m3350d(aVar.f5056b, aVar.f5055a, iArr12);
            iArr = iArr10;
            iArr2 = iArr11;
            iArr3 = iArr6;
            iArr4 = iArr9;
        } else {
            AbstractC1380d.m3338a(aVar.f5056b, aVar.f5055a, iArr12);
            iArr = iArr11;
            iArr2 = iArr10;
            iArr3 = iArr9;
            iArr4 = iArr6;
        }
        AbstractC1380d.m3343b(aVar.f5057c, aVar2.f5057c, iArr5);
        AbstractC1380d.m3346c(iArr5, iArr6);
        AbstractC1380d.m3343b(aVar.f5055a, aVar2.f5055a, iArr7);
        AbstractC1380d.m3343b(aVar.f5056b, aVar2.f5056b, iArr8);
        AbstractC1380d.m3343b(iArr7, iArr8, iArr9);
        AbstractC1380d.m3334a(iArr9, 39081, iArr9);
        AbstractC1380d.m3338a(iArr6, iArr9, iArr2);
        AbstractC1380d.m3350d(iArr6, iArr9, iArr);
        AbstractC1380d.m3338a(aVar2.f5055a, aVar2.f5056b, iArr9);
        AbstractC1380d.m3343b(iArr12, iArr9, iArr12);
        AbstractC1380d.m3338a(iArr8, iArr7, iArr4);
        AbstractC1380d.m3350d(iArr8, iArr7, iArr3);
        AbstractC1380d.m3331a(iArr4);
        AbstractC1380d.m3350d(iArr12, iArr6, iArr12);
        AbstractC1380d.m3343b(iArr12, iArr5, iArr12);
        AbstractC1380d.m3343b(iArr9, iArr5, iArr9);
        AbstractC1380d.m3343b(iArr10, iArr12, aVar2.f5055a);
        AbstractC1380d.m3343b(iArr9, iArr11, aVar2.f5056b);
        AbstractC1380d.m3343b(iArr10, iArr11, aVar2.f5057c);
    }

    /* JADX INFO: renamed from: b */
    private static void m3425b(a aVar) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        AbstractC1380d.m3338a(aVar.f5055a, aVar.f5056b, iArr);
        AbstractC1380d.m3346c(iArr, iArr);
        AbstractC1380d.m3346c(aVar.f5055a, iArr2);
        AbstractC1380d.m3346c(aVar.f5056b, iArr3);
        AbstractC1380d.m3338a(iArr2, iArr3, iArr4);
        AbstractC1380d.m3331a(iArr4);
        AbstractC1380d.m3346c(aVar.f5057c, iArr5);
        AbstractC1380d.m3338a(iArr5, iArr5, iArr5);
        AbstractC1380d.m3331a(iArr5);
        AbstractC1380d.m3350d(iArr4, iArr5, iArr6);
        AbstractC1380d.m3350d(iArr, iArr4, iArr);
        AbstractC1380d.m3350d(iArr2, iArr3, iArr2);
        AbstractC1380d.m3343b(iArr, iArr6, aVar.f5055a);
        AbstractC1380d.m3343b(iArr4, iArr2, aVar.f5056b);
        AbstractC1380d.m3343b(iArr4, iArr6, aVar.f5057c);
    }

    /* JADX INFO: renamed from: c */
    private static void m3430c(a aVar) {
        int[] iArr = aVar.f5055a;
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
        AbstractC1380d.m3348d(aVar.f5056b);
        AbstractC1380d.m3348d(aVar.f5057c);
    }

    /* JADX INFO: renamed from: b */
    private static void m3424b() {
        synchronized (f5052f) {
            if (f5054h != null) {
                return;
            }
            a aVar = new a((byte) 0);
            AbstractC1380d.m3337a(f5050d, aVar.f5055a, 0);
            AbstractC1380d.m3337a(f5051e, aVar.f5056b, 0);
            AbstractC1380d.m3348d(aVar.f5057c);
            f5053g = m3422a(aVar, 32);
            f5054h = new int[2560];
            int i = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                a[] aVarArr = new a[5];
                a aVar2 = new a((byte) 0);
                m3430c(aVar2);
                for (int i3 = 0; i3 < 5; i3++) {
                    m3413a(true, aVar, aVar2);
                    m3425b(aVar);
                    aVarArr[i3] = m3405a(aVar);
                    if (i2 + i3 != 8) {
                        for (int i4 = 1; i4 < 18; i4++) {
                            m3425b(aVar);
                        }
                    }
                }
                a[] aVarArr2 = new a[16];
                int i5 = 1;
                aVarArr2[0] = aVar2;
                for (int i6 = 0; i6 < 4; i6++) {
                    int i7 = 1 << i6;
                    int i8 = 0;
                    while (i8 < i7) {
                        aVarArr2[i5] = m3405a(aVarArr2[i5 - i7]);
                        m3413a(false, aVarArr[i6], aVarArr2[i5]);
                        i8++;
                        i5++;
                    }
                }
                for (int i9 = 0; i9 < 16; i9++) {
                    a aVar3 = aVarArr2[i9];
                    AbstractC1380d.m3336a(aVar3.f5057c, aVar3.f5057c);
                    AbstractC1380d.m3343b(aVar3.f5055a, aVar3.f5057c, aVar3.f5055a);
                    AbstractC1380d.m3343b(aVar3.f5056b, aVar3.f5057c, aVar3.f5056b);
                    AbstractC1380d.m3337a(aVar3.f5055a, f5054h, i);
                    int i10 = i + 16;
                    AbstractC1380d.m3337a(aVar3.f5056b, f5054h, i10);
                    i = i10 + 16;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m3426b(byte[] bArr, a aVar) {
        m3424b();
        m3430c(aVar);
        int[] iArr = new int[15];
        m3416a(bArr, iArr);
        iArr[14] = AbstractC1416c.m3571a(14, (iArr[0] ^ (-1)) & 1, iArr, f5049c, iArr) + 4;
        AbstractC1416c.m3597d(15, iArr, 0);
        b bVar = new b((byte) 0);
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
                    AbstractC1416c.m3580a(16, i10, f5054h, i8, bVar.f5058a);
                    int i11 = i8 + 16;
                    AbstractC1416c.m3580a(16, i10, f5054h, i11, bVar.f5059b);
                    i8 = i11 + 16;
                }
                int[] iArr2 = bVar.f5058a;
                int[] iArr3 = new int[16];
                AbstractC1380d.m3350d(iArr3, iArr2, iArr3);
                AbstractC1416c.m3580a(16, i6, iArr3, 0, iArr2);
                int[] iArr4 = new int[16];
                int[] iArr5 = new int[16];
                int[] iArr6 = new int[16];
                int[] iArr7 = new int[16];
                int[] iArr8 = new int[16];
                int[] iArr9 = new int[16];
                int[] iArr10 = new int[16];
                AbstractC1380d.m3346c(aVar.f5057c, iArr4);
                AbstractC1380d.m3343b(bVar.f5058a, aVar.f5055a, iArr5);
                AbstractC1380d.m3343b(bVar.f5059b, aVar.f5056b, iArr6);
                AbstractC1380d.m3343b(iArr5, iArr6, iArr7);
                AbstractC1380d.m3334a(iArr7, 39081, iArr7);
                AbstractC1380d.m3338a(iArr4, iArr7, iArr8);
                AbstractC1380d.m3350d(iArr4, iArr7, iArr9);
                AbstractC1380d.m3338a(bVar.f5058a, bVar.f5059b, iArr4);
                AbstractC1380d.m3338a(aVar.f5055a, aVar.f5056b, iArr7);
                AbstractC1380d.m3343b(iArr4, iArr7, iArr10);
                AbstractC1380d.m3338a(iArr6, iArr5, iArr4);
                AbstractC1380d.m3350d(iArr6, iArr5, iArr7);
                AbstractC1380d.m3331a(iArr4);
                AbstractC1380d.m3350d(iArr10, iArr4, iArr10);
                AbstractC1380d.m3343b(iArr10, aVar.f5057c, iArr10);
                AbstractC1380d.m3343b(iArr7, aVar.f5057c, iArr7);
                AbstractC1380d.m3343b(iArr8, iArr10, aVar.f5055a);
                AbstractC1380d.m3343b(iArr7, iArr9, aVar.f5056b);
                AbstractC1380d.m3343b(iArr8, iArr9, aVar.f5057c);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                m3425b(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3415a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5) {
        if (!m3418a(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        InterfaceC0817aq interfaceC0817aqM3404a = m3404a();
        byte[] bArr6 = new byte[114];
        interfaceC0817aqM3404a.mo1929a(bArr, 0, 57);
        interfaceC0817aqM3404a.mo1918b(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        m3427b(bArr6, bArr7);
        m3410a(interfaceC0817aqM3404a, bArr6, bArr7, bArr2, bArr3, bArr4, i, bArr5);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3420a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        byte b2 = 0;
        if (!m3418a(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrM4090c = C1535a.m4090c(bArr, 0, 57);
        byte[] bArrM4090c2 = C1535a.m4090c(bArr, 57, 114);
        if (!m3429b(bArrM4090c) || !m3432c(bArrM4090c2)) {
            return false;
        }
        a aVar = new a(b2);
        if (!m3419a(bArr2, aVar)) {
            return false;
        }
        InterfaceC0817aq interfaceC0817aqM3404a = m3404a();
        byte[] bArr5 = new byte[114];
        m3409a(interfaceC0817aqM3404a, bArr3);
        interfaceC0817aqM3404a.mo1929a(bArrM4090c, 0, 57);
        interfaceC0817aqM3404a.mo1929a(bArr2, 0, 57);
        interfaceC0817aqM3404a.mo1929a(bArr4, 0, i);
        interfaceC0817aqM3404a.mo1918b(bArr5, 0, 114);
        byte[] bArrM3434e = m3434e(bArr5);
        int[] iArr = new int[14];
        m3428b(bArrM4090c2, iArr);
        int[] iArr2 = new int[14];
        m3428b(bArrM3434e, iArr2);
        a aVar2 = new a(b2);
        m3417a(iArr, iArr2, aVar, aVar2);
        byte[] bArr6 = new byte[57];
        m3412a(aVar2, bArr6);
        return C1535a.m4076a(bArr6, bArrM4090c);
    }
}
