package org.bouncycastle.p107d.p108a.p115d;

import java.security.SecureRandom;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p107d.p108a.p114c.AbstractC1377a;
import org.bouncycastle.p107d.p108a.p114c.AbstractC1378b;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.d.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1382a {

    /* JADX INFO: renamed from: a */
    private static final byte[] f5024a = C1560k.m4168d("SigEd25519 no Ed25519 collisions");

    /* JADX INFO: renamed from: b */
    private static final int[] f5025b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c */
    private static final int[] f5026c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* JADX INFO: renamed from: d */
    private static final int[] f5027d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* JADX INFO: renamed from: e */
    private static final int[] f5028e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* JADX INFO: renamed from: f */
    private static final int[] f5029f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};

    /* JADX INFO: renamed from: g */
    private static final int[] f5030g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* JADX INFO: renamed from: h */
    private static final int[] f5031h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* JADX INFO: renamed from: i */
    private static Object f5032i = new Object();

    /* JADX INFO: renamed from: j */
    private static b[] f5033j = null;

    /* JADX INFO: renamed from: k */
    private static int[] f5034k = null;

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        int[] f5035a;

        /* JADX INFO: renamed from: b */
        int[] f5036b;

        /* JADX INFO: renamed from: c */
        int[] f5037c;

        /* JADX INFO: renamed from: d */
        int[] f5038d;

        /* JADX INFO: renamed from: e */
        int[] f5039e;

        private a() {
            this.f5035a = AbstractC1378b.m3310a();
            this.f5036b = AbstractC1378b.m3310a();
            this.f5037c = AbstractC1378b.m3310a();
            this.f5038d = AbstractC1378b.m3310a();
            this.f5039e = AbstractC1378b.m3310a();
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d.a$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        int[] f5040a;

        /* JADX INFO: renamed from: b */
        int[] f5041b;

        /* JADX INFO: renamed from: c */
        int[] f5042c;

        /* JADX INFO: renamed from: d */
        int[] f5043d;

        private b() {
            this.f5040a = AbstractC1378b.m3310a();
            this.f5041b = AbstractC1378b.m3310a();
            this.f5042c = AbstractC1378b.m3310a();
            this.f5043d = AbstractC1378b.m3310a();
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d.a$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        int[] f5044a;

        /* JADX INFO: renamed from: b */
        int[] f5045b;

        /* JADX INFO: renamed from: c */
        int[] f5046c;

        private c() {
            this.f5044a = AbstractC1378b.m3310a();
            this.f5045b = AbstractC1378b.m3310a();
            this.f5046c = AbstractC1378b.m3310a();
        }

        /* synthetic */ c(byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m3378a(byte[] bArr, int i) {
        int i2 = i + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16);
    }

    /* JADX INFO: renamed from: a */
    private static b m3379a(a aVar) {
        b bVar = new b((byte) 0);
        AbstractC1378b.m3307a(aVar.f5035a, bVar.f5040a, 0);
        AbstractC1378b.m3307a(aVar.f5036b, bVar.f5041b, 0);
        AbstractC1378b.m3307a(aVar.f5037c, bVar.f5042c, 0);
        AbstractC1378b.m3313b(aVar.f5038d, aVar.f5039e, bVar.f5043d);
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    private static void m3381a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    public static void m3383a(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m3384a(AbstractC1377a.a aVar, byte[] bArr, int[] iArr, int[] iArr2) {
        byte b2 = 0;
        if (aVar == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        m3399b(bArr, bArr2);
        a aVar2 = new a(b2);
        m3389a(bArr2, aVar2);
        AbstractC1378b.m3307a(aVar2.f5036b, iArr, 0);
        AbstractC1378b.m3307a(aVar2.f5037c, iArr2, 0);
    }

    /* JADX INFO: renamed from: a */
    private static void m3385a(a aVar, byte[] bArr) {
        int[] iArrM3310a = AbstractC1378b.m3310a();
        int[] iArrM3310a2 = AbstractC1378b.m3310a();
        AbstractC1378b.m3306a(aVar.f5037c, iArrM3310a2);
        AbstractC1378b.m3313b(aVar.f5035a, iArrM3310a2, iArrM3310a);
        AbstractC1378b.m3313b(aVar.f5036b, iArrM3310a2, iArrM3310a2);
        AbstractC1378b.m3317d(iArrM3310a);
        AbstractC1378b.m3317d(iArrM3310a2);
        AbstractC1378b.m3305a(iArrM3310a2, bArr, 0);
        bArr[31] = (byte) (((iArrM3310a[0] & 1) << 7) | bArr[31]);
    }

    /* JADX INFO: renamed from: a */
    private static void m3386a(b bVar) {
        AbstractC1378b.m3320e(bVar.f5042c);
        AbstractC1378b.m3313b(bVar.f5040a, bVar.f5041b, bVar.f5043d);
    }

    /* JADX INFO: renamed from: a */
    private static void m3387a(boolean z, b bVar, a aVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrM3310a = AbstractC1378b.m3310a();
        int[] iArrM3310a2 = AbstractC1378b.m3310a();
        int[] iArrM3310a3 = AbstractC1378b.m3310a();
        int[] iArrM3310a4 = AbstractC1378b.m3310a();
        int[] iArr5 = aVar.f5038d;
        int[] iArrM3310a5 = AbstractC1378b.m3310a();
        int[] iArrM3310a6 = AbstractC1378b.m3310a();
        int[] iArr6 = aVar.f5039e;
        if (z) {
            iArr = iArrM3310a5;
            iArr2 = iArrM3310a6;
            iArr3 = iArrM3310a3;
            iArr4 = iArrM3310a4;
        } else {
            iArr = iArrM3310a6;
            iArr2 = iArrM3310a5;
            iArr3 = iArrM3310a4;
            iArr4 = iArrM3310a3;
        }
        AbstractC1378b.m3309a(aVar.f5036b, aVar.f5035a, iArrM3310a2, iArrM3310a);
        AbstractC1378b.m3309a(bVar.f5041b, bVar.f5040a, iArr3, iArr4);
        AbstractC1378b.m3313b(iArrM3310a, iArrM3310a3, iArrM3310a);
        AbstractC1378b.m3313b(iArrM3310a2, iArrM3310a4, iArrM3310a2);
        AbstractC1378b.m3313b(aVar.f5038d, aVar.f5039e, iArrM3310a3);
        AbstractC1378b.m3313b(iArrM3310a3, bVar.f5043d, iArrM3310a3);
        AbstractC1378b.m3313b(iArrM3310a3, f5030g, iArrM3310a3);
        AbstractC1378b.m3313b(aVar.f5037c, bVar.f5042c, iArrM3310a4);
        AbstractC1378b.m3308a(iArrM3310a4, iArrM3310a4, iArrM3310a4);
        AbstractC1378b.m3309a(iArrM3310a2, iArrM3310a, iArr6, iArr5);
        AbstractC1378b.m3309a(iArrM3310a4, iArrM3310a3, iArr, iArr2);
        AbstractC1378b.m3311b(iArr);
        AbstractC1378b.m3313b(iArr5, iArrM3310a5, aVar.f5035a);
        AbstractC1378b.m3313b(iArrM3310a6, iArr6, aVar.f5036b);
        AbstractC1378b.m3313b(iArrM3310a5, iArrM3310a6, aVar.f5037c);
    }

    /* JADX INFO: renamed from: a */
    private static void m3388a(boolean z, b bVar, b bVar2, b bVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrM3310a = AbstractC1378b.m3310a();
        int[] iArrM3310a2 = AbstractC1378b.m3310a();
        int[] iArrM3310a3 = AbstractC1378b.m3310a();
        int[] iArrM3310a4 = AbstractC1378b.m3310a();
        int[] iArrM3310a5 = AbstractC1378b.m3310a();
        int[] iArrM3310a6 = AbstractC1378b.m3310a();
        int[] iArrM3310a7 = AbstractC1378b.m3310a();
        int[] iArrM3310a8 = AbstractC1378b.m3310a();
        if (z) {
            iArr = iArrM3310a6;
            iArr2 = iArrM3310a7;
            iArr3 = iArrM3310a3;
            iArr4 = iArrM3310a4;
        } else {
            iArr = iArrM3310a7;
            iArr2 = iArrM3310a6;
            iArr3 = iArrM3310a4;
            iArr4 = iArrM3310a3;
        }
        AbstractC1378b.m3309a(bVar.f5041b, bVar.f5040a, iArrM3310a2, iArrM3310a);
        AbstractC1378b.m3309a(bVar2.f5041b, bVar2.f5040a, iArr3, iArr4);
        AbstractC1378b.m3313b(iArrM3310a, iArrM3310a3, iArrM3310a);
        AbstractC1378b.m3313b(iArrM3310a2, iArrM3310a4, iArrM3310a2);
        AbstractC1378b.m3313b(bVar.f5043d, bVar2.f5043d, iArrM3310a3);
        AbstractC1378b.m3313b(iArrM3310a3, f5030g, iArrM3310a3);
        AbstractC1378b.m3313b(bVar.f5042c, bVar2.f5042c, iArrM3310a4);
        AbstractC1378b.m3308a(iArrM3310a4, iArrM3310a4, iArrM3310a4);
        AbstractC1378b.m3309a(iArrM3310a2, iArrM3310a, iArrM3310a8, iArrM3310a5);
        AbstractC1378b.m3309a(iArrM3310a4, iArrM3310a3, iArr, iArr2);
        AbstractC1378b.m3311b(iArr);
        AbstractC1378b.m3313b(iArrM3310a5, iArrM3310a6, bVar3.f5040a);
        AbstractC1378b.m3313b(iArrM3310a7, iArrM3310a8, bVar3.f5041b);
        AbstractC1378b.m3313b(iArrM3310a6, iArrM3310a7, bVar3.f5042c);
        AbstractC1378b.m3313b(iArrM3310a5, iArrM3310a8, bVar3.f5043d);
    }

    /* JADX INFO: renamed from: a */
    private static void m3392a(byte[] bArr, int[] iArr) {
        for (int i = 0; i < 8; i++) {
            iArr[i + 0] = m3397b(bArr, (i * 4) + 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3393a(byte[] bArr) {
        int[] iArr = new int[8];
        m3392a(bArr, iArr);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !AbstractC1421h.m3700d(iArr, f5025b);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m3395a(int[] iArr, int i) {
        int[] iArr2 = new int[16];
        int i2 = 8;
        int i3 = 0;
        int i4 = 16;
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
        byte[] bArr = new byte[256];
        int i7 = 1 << i;
        int i8 = i7 - 1;
        int i9 = i7 >>> 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < 16) {
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

    /* JADX INFO: renamed from: b */
    private static int m3397b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    /* JADX INFO: renamed from: b */
    private static void m3398b(a aVar) {
        int[] iArrM3310a = AbstractC1378b.m3310a();
        int[] iArrM3310a2 = AbstractC1378b.m3310a();
        int[] iArrM3310a3 = AbstractC1378b.m3310a();
        int[] iArr = aVar.f5038d;
        int[] iArrM3310a4 = AbstractC1378b.m3310a();
        int[] iArrM3310a5 = AbstractC1378b.m3310a();
        int[] iArr2 = aVar.f5039e;
        AbstractC1378b.m3318d(aVar.f5035a, iArrM3310a);
        AbstractC1378b.m3318d(aVar.f5036b, iArrM3310a2);
        AbstractC1378b.m3318d(aVar.f5037c, iArrM3310a3);
        AbstractC1378b.m3308a(iArrM3310a3, iArrM3310a3, iArrM3310a3);
        AbstractC1378b.m3309a(iArrM3310a, iArrM3310a2, iArr2, iArrM3310a5);
        AbstractC1378b.m3308a(aVar.f5035a, aVar.f5036b, iArr);
        AbstractC1378b.m3318d(iArr, iArr);
        AbstractC1378b.m3319d(iArr2, iArr, iArr);
        AbstractC1378b.m3308a(iArrM3310a3, iArrM3310a5, iArrM3310a4);
        AbstractC1378b.m3311b(iArrM3310a4);
        AbstractC1378b.m3313b(iArr, iArrM3310a4, aVar.f5035a);
        AbstractC1378b.m3313b(iArrM3310a5, iArr2, aVar.f5036b);
        AbstractC1378b.m3313b(iArrM3310a4, iArrM3310a5, aVar.f5037c);
    }

    /* JADX INFO: renamed from: b */
    private static void m3399b(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & 127);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m3400b(byte[] bArr) {
        long jM3397b = ((long) m3397b(bArr, 0)) & 4294967295L;
        long jM3378a = ((long) (m3378a(bArr, 4) << 4)) & 4294967295L;
        long jM3397b2 = ((long) m3397b(bArr, 7)) & 4294967295L;
        long jM3378a2 = ((long) (m3378a(bArr, 11) << 4)) & 4294967295L;
        long jM3397b3 = ((long) m3397b(bArr, 14)) & 4294967295L;
        long jM3378a3 = ((long) (m3378a(bArr, 18) << 4)) & 4294967295L;
        long jM3397b4 = ((long) m3397b(bArr, 21)) & 4294967295L;
        long jM3378a4 = ((long) (m3378a(bArr, 25) << 4)) & 4294967295L;
        long jM3397b5 = ((long) m3397b(bArr, 28)) & 4294967295L;
        long jM3378a5 = ((long) (m3378a(bArr, 32) << 4)) & 4294967295L;
        long jM3397b6 = ((long) m3397b(bArr, 35)) & 4294967295L;
        long jM3378a6 = ((long) (m3378a(bArr, 39) << 4)) & 4294967295L;
        long jM3397b7 = ((long) m3397b(bArr, 42)) & 4294967295L;
        long jM3378a7 = ((long) (m3378a(bArr, 46) << 4)) & 4294967295L;
        long jM3397b8 = ((long) m3397b(bArr, 49)) & 4294967295L;
        long jM3378a8 = ((long) (m3378a(bArr, 53) << 4)) & 4294967295L;
        long jM3397b9 = ((long) m3397b(bArr, 56)) & 4294967295L;
        long jM3378a9 = ((long) (m3378a(bArr, 60) << 4)) & 4294967295L;
        long j = ((long) bArr[63]) & 255;
        long j2 = jM3378a9 + (jM3397b9 >> 28);
        long j3 = jM3397b9 & 268435455;
        long j4 = (jM3397b7 - ((-6428113) * j)) - (j2 * 5343);
        long j5 = ((jM3378a6 - (127719000 * j)) - ((-6428113) * j2)) - (j3 * 5343);
        long j6 = jM3378a8 + (jM3397b8 >> 28);
        long j7 = jM3397b8 & 268435455;
        long j8 = (((jM3397b6 - (19280294 * j)) - (127719000 * j2)) - ((-6428113) * j3)) - (j6 * 5343);
        long j9 = ((((jM3378a5 - ((-50998291) * j)) - (19280294 * j2)) - (127719000 * j3)) - ((-6428113) * j6)) - (j7 * 5343);
        long j10 = (jM3378a7 - (j * 5343)) + (j4 >> 28);
        long j11 = (j4 & 268435455) + (j5 >> 28);
        long j12 = ((((jM3378a4 - ((-50998291) * j3)) - (19280294 * j6)) - (127719000 * j7)) - ((-6428113) * j10)) - (j11 * 5343);
        long j13 = (j5 & 268435455) + (j8 >> 28);
        long j14 = (j8 & 268435455) + (j9 >> 28);
        long j15 = jM3378a - ((-50998291) * j14);
        long j16 = (jM3397b2 - ((-50998291) * j13)) - (19280294 * j14);
        long j17 = ((jM3378a2 - ((-50998291) * j11)) - (19280294 * j13)) - (127719000 * j14);
        long j18 = (((jM3397b3 - ((-50998291) * j10)) - (19280294 * j11)) - (127719000 * j13)) - ((-6428113) * j14);
        long j19 = ((((jM3378a3 - ((-50998291) * j7)) - (19280294 * j10)) - (127719000 * j11)) - ((-6428113) * j13)) - (j14 * 5343);
        long j20 = (((((jM3397b5 - ((-50998291) * j2)) - (19280294 * j3)) - (127719000 * j6)) - ((-6428113) * j7)) - (j10 * 5343)) + (j12 >> 28);
        long j21 = (j9 & 268435455) + (j20 >> 28);
        long j22 = j20 & 268435455;
        long j23 = j22 >>> 27;
        long j24 = j21 + j23;
        long j25 = jM3397b - ((-50998291) * j24);
        long j26 = (j15 - (19280294 * j24)) + (j25 >> 28);
        long j27 = (j16 - (127719000 * j24)) + (j26 >> 28);
        long j28 = (j17 - ((-6428113) * j24)) + (j27 >> 28);
        long j29 = (j18 - (j24 * 5343)) + (j28 >> 28);
        long j30 = j19 + (j29 >> 28);
        long j31 = (((((jM3397b4 - ((-50998291) * j6)) - (19280294 * j7)) - (127719000 * j10)) - ((-6428113) * j11)) - (j13 * 5343)) + (j30 >> 28);
        long j32 = (j12 & 268435455) + (j31 >> 28);
        long j33 = j22 + (j32 >> 28);
        long j34 = (j33 >> 28) - j23;
        long j35 = (j25 & 268435455) + ((-50998291) & j34);
        long j36 = (j26 & 268435455) + (19280294 & j34) + (j35 >> 28);
        long j37 = (j27 & 268435455) + (127719000 & j34) + (j36 >> 28);
        long j38 = (j28 & 268435455) + ((-6428113) & j34) + (j37 >> 28);
        long j39 = (j29 & 268435455) + (j34 & 5343) + (j38 >> 28);
        long j40 = (j30 & 268435455) + (j39 >> 28);
        long j41 = (j31 & 268435455) + (j40 >> 28);
        long j42 = (j32 & 268435455) + (j41 >> 28);
        byte[] bArr2 = new byte[32];
        m3382a((j35 & 268435455) | ((j36 & 268435455) << 28), bArr2, 0);
        m3382a(((j38 & 268435455) << 28) | (j37 & 268435455), bArr2, 7);
        m3382a(((j40 & 268435455) << 28) | (j39 & 268435455), bArr2, 14);
        m3382a(((j42 & 268435455) << 28) | (j41 & 268435455), bArr2, 21);
        m3381a((int) ((j33 & 268435455) + (j42 >> 28)), bArr2, 28);
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    private static void m3401c(a aVar) {
        AbstractC1378b.m3323g(aVar.f5035a);
        AbstractC1378b.m3320e(aVar.f5036b);
        AbstractC1378b.m3320e(aVar.f5037c);
        AbstractC1378b.m3323g(aVar.f5038d);
        AbstractC1378b.m3320e(aVar.f5039e);
    }

    /* JADX INFO: renamed from: c */
    private static void m3402c(byte[] bArr, byte[] bArr2) {
        a aVar = new a((byte) 0);
        m3389a(bArr, aVar);
        m3385a(aVar, bArr2);
    }

    /* JADX INFO: renamed from: a */
    private static void m3382a(long j, byte[] bArr, int i) {
        m3381a((int) j, bArr, i);
        int i2 = (int) (j >>> 32);
        int i3 = i + 4;
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i4 + 1] = (byte) (i2 >>> 16);
    }

    /* JADX INFO: renamed from: a */
    public static void m3390a(byte[] bArr, byte[] bArr2) {
        C0847x c0847x = new C0847x();
        byte[] bArr3 = new byte[c0847x.mo1930b()];
        c0847x.mo1929a(bArr, 0, 32);
        c0847x.mo1926a(bArr3, 0);
        byte[] bArr4 = new byte[32];
        m3399b(bArr3, bArr4);
        m3402c(bArr4, bArr2);
    }

    /* JADX INFO: renamed from: a */
    private static b[] m3396a(b bVar, int i) {
        byte b2 = 0;
        b bVar2 = new b(b2);
        m3388a(false, bVar, bVar, bVar2);
        b[] bVarArr = new b[i];
        b bVar3 = new b(b2);
        AbstractC1378b.m3307a(bVar.f5040a, bVar3.f5040a, 0);
        AbstractC1378b.m3307a(bVar.f5041b, bVar3.f5041b, 0);
        AbstractC1378b.m3307a(bVar.f5042c, bVar3.f5042c, 0);
        AbstractC1378b.m3307a(bVar.f5043d, bVar3.f5043d, 0);
        bVarArr[0] = bVar3;
        for (int i2 = 1; i2 < i; i2++) {
            b bVar4 = bVarArr[i2 - 1];
            b bVar5 = new b(b2);
            bVarArr[i2] = bVar5;
            m3388a(false, bVar4, bVar2, bVar5);
        }
        return bVarArr;
    }

    /* JADX INFO: renamed from: a */
    private static void m3380a() {
        synchronized (f5032i) {
            if (f5034k != null) {
                return;
            }
            b bVar = new b((byte) 0);
            AbstractC1378b.m3307a(f5027d, bVar.f5040a, 0);
            AbstractC1378b.m3307a(f5028e, bVar.f5041b, 0);
            m3386a(bVar);
            f5033j = m3396a(bVar, 32);
            a aVar = new a((byte) 0);
            AbstractC1378b.m3307a(f5027d, aVar.f5035a, 0);
            AbstractC1378b.m3307a(f5028e, aVar.f5036b, 0);
            AbstractC1378b.m3320e(aVar.f5037c);
            AbstractC1378b.m3307a(aVar.f5035a, aVar.f5038d, 0);
            AbstractC1378b.m3307a(aVar.f5036b, aVar.f5039e, 0);
            f5034k = new int[1920];
            int i = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                b[] bVarArr = new b[4];
                b bVar2 = new b((byte) 0);
                AbstractC1378b.m3323g(bVar2.f5040a);
                AbstractC1378b.m3320e(bVar2.f5041b);
                AbstractC1378b.m3320e(bVar2.f5042c);
                AbstractC1378b.m3323g(bVar2.f5043d);
                for (int i3 = 0; i3 < 4; i3++) {
                    m3388a(true, bVar2, m3379a(aVar), bVar2);
                    m3398b(aVar);
                    bVarArr[i3] = m3379a(aVar);
                    if (i2 + i3 != 10) {
                        for (int i4 = 1; i4 < 8; i4++) {
                            m3398b(aVar);
                        }
                    }
                }
                b[] bVarArr2 = new b[8];
                int i5 = 1;
                bVarArr2[0] = bVar2;
                for (int i6 = 0; i6 < 3; i6++) {
                    int i7 = 1 << i6;
                    int i8 = 0;
                    while (i8 < i7) {
                        b bVar3 = bVarArr2[i5 - i7];
                        b bVar4 = bVarArr[i6];
                        b bVar5 = new b((byte) 0);
                        bVarArr2[i5] = bVar5;
                        m3388a(false, bVar3, bVar4, bVar5);
                        i8++;
                        i5++;
                    }
                }
                for (int i9 = 0; i9 < 8; i9++) {
                    b bVar6 = bVarArr2[i9];
                    int[] iArrM3310a = AbstractC1378b.m3310a();
                    int[] iArrM3310a2 = AbstractC1378b.m3310a();
                    AbstractC1378b.m3308a(bVar6.f5042c, bVar6.f5042c, iArrM3310a);
                    AbstractC1378b.m3306a(iArrM3310a, iArrM3310a2);
                    AbstractC1378b.m3313b(bVar6.f5040a, iArrM3310a2, iArrM3310a);
                    AbstractC1378b.m3313b(bVar6.f5041b, iArrM3310a2, iArrM3310a2);
                    c cVar = new c((byte) 0);
                    AbstractC1378b.m3309a(iArrM3310a2, iArrM3310a, cVar.f5044a, cVar.f5045b);
                    AbstractC1378b.m3313b(iArrM3310a, iArrM3310a2, cVar.f5046c);
                    AbstractC1378b.m3313b(cVar.f5046c, f5031h, cVar.f5046c);
                    AbstractC1378b.m3317d(cVar.f5044a);
                    AbstractC1378b.m3317d(cVar.f5045b);
                    AbstractC1378b.m3307a(cVar.f5044a, f5034k, i);
                    int i10 = i + 10;
                    AbstractC1378b.m3307a(cVar.f5045b, f5034k, i10);
                    int i11 = i10 + 10;
                    AbstractC1378b.m3307a(cVar.f5046c, f5034k, i11);
                    i = i11 + 10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3389a(byte[] bArr, a aVar) {
        m3380a();
        m3401c(aVar);
        int[] iArr = new int[8];
        m3392a(bArr, iArr);
        AbstractC1416c.m3571a(8, (iArr[0] ^ (-1)) & 1, iArr, f5026c, iArr);
        AbstractC1416c.m3597d(8, iArr, 1);
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            int i3 = ((i2 >>> 7) ^ i2) & 11141290;
            int i4 = i2 ^ (i3 ^ (i3 << 7));
            int i5 = ((i4 >>> 14) ^ i4) & 52428;
            int i6 = i4 ^ (i5 ^ (i5 << 14));
            int i7 = ((i6 >>> 4) ^ i6) & 15728880;
            int i8 = i6 ^ (i7 ^ (i7 << 4));
            int i9 = ((i8 >>> 8) ^ i8) & 65280;
            iArr[i] = i8 ^ (i9 ^ (i9 << 8));
        }
        c cVar = new c((byte) 0);
        int i10 = 28;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 >= 8) {
                    break;
                }
                int i13 = iArr[i12] >>> i10;
                int i14 = (i13 >>> 3) & 1;
                int i15 = (i13 ^ (-i14)) & 7;
                int i16 = i12 * 8 * 3 * 10;
                for (int i17 = 0; i17 < 8; i17++) {
                    int i18 = ((i17 ^ i15) - 1) >> 31;
                    AbstractC1416c.m3580a(10, i18, f5034k, i16, cVar.f5044a);
                    int i19 = i16 + 10;
                    AbstractC1416c.m3580a(10, i18, f5034k, i19, cVar.f5045b);
                    int i20 = i19 + 10;
                    AbstractC1416c.m3580a(10, i18, f5034k, i20, cVar.f5046c);
                    i16 = i20 + 10;
                }
                AbstractC1378b.m3298a(i14, cVar.f5044a, cVar.f5045b);
                AbstractC1378b.m3297a(i14, cVar.f5046c);
                int[] iArrM3310a = AbstractC1378b.m3310a();
                int[] iArrM3310a2 = AbstractC1378b.m3310a();
                int[] iArrM3310a3 = AbstractC1378b.m3310a();
                int[] iArr2 = aVar.f5038d;
                int[] iArrM3310a4 = AbstractC1378b.m3310a();
                int[] iArrM3310a5 = AbstractC1378b.m3310a();
                int[] iArr3 = aVar.f5039e;
                AbstractC1378b.m3309a(aVar.f5036b, aVar.f5035a, iArrM3310a2, iArrM3310a);
                AbstractC1378b.m3313b(iArrM3310a, cVar.f5045b, iArrM3310a);
                AbstractC1378b.m3313b(iArrM3310a2, cVar.f5044a, iArrM3310a2);
                AbstractC1378b.m3313b(aVar.f5038d, aVar.f5039e, iArrM3310a3);
                AbstractC1378b.m3313b(iArrM3310a3, cVar.f5046c, iArrM3310a3);
                AbstractC1378b.m3309a(iArrM3310a2, iArrM3310a, iArr3, iArr2);
                AbstractC1378b.m3309a(aVar.f5037c, iArrM3310a3, iArrM3310a5, iArrM3310a4);
                AbstractC1378b.m3311b(iArrM3310a5);
                AbstractC1378b.m3313b(iArr2, iArrM3310a4, aVar.f5035a);
                AbstractC1378b.m3313b(iArrM3310a5, iArr3, aVar.f5036b);
                AbstractC1378b.m3313b(iArrM3310a4, iArrM3310a5, aVar.f5037c);
                i11 = i12 + 1;
            }
            i10 -= 4;
            if (i10 < 0) {
                return;
            } else {
                m3398b(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3391a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        C0847x c0847x = new C0847x();
        byte[] bArr5 = new byte[c0847x.mo1930b()];
        c0847x.mo1929a(bArr, 0, 32);
        c0847x.mo1926a(bArr5, 0);
        byte[] bArr6 = new byte[32];
        m3399b(bArr5, bArr6);
        c0847x.mo1929a(bArr5, 32, 32);
        c0847x.mo1929a(bArr3, 0, i);
        c0847x.mo1926a(bArr5, 0);
        byte[] bArrM3400b = m3400b(bArr5);
        byte[] bArr7 = new byte[32];
        m3402c(bArrM3400b, bArr7);
        c0847x.mo1929a(bArr7, 0, 32);
        c0847x.mo1929a(bArr2, 0, 32);
        c0847x.mo1929a(bArr3, 0, i);
        c0847x.mo1926a(bArr5, 0);
        byte[] bArrM3400b2 = m3400b(bArr5);
        int[] iArr = new int[16];
        m3392a(bArrM3400b, iArr);
        int[] iArr2 = new int[8];
        m3392a(bArrM3400b2, iArr2);
        int[] iArr3 = new int[8];
        m3392a(bArr6, iArr3);
        AbstractC1421h.m3702e(iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[64];
        for (int i2 = 0; i2 < 16; i2++) {
            m3381a(iArr[i2], bArr8, i2 * 4);
        }
        byte[] bArrM3400b3 = m3400b(bArr8);
        System.arraycopy(bArr7, 0, bArr4, 0, 32);
        System.arraycopy(bArrM3400b3, 0, bArr4, 32, 32);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3394a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        boolean z;
        byte b2 = 0;
        byte[] bArrM4090c = C1535a.m4090c(bArr, 0, 32);
        byte[] bArrM4090c2 = C1535a.m4090c(bArr, 32, 64);
        if (!m3393a(bArrM4090c)) {
            return false;
        }
        int[] iArr = new int[8];
        m3392a(bArrM4090c2, iArr);
        if (!(!AbstractC1421h.m3700d(iArr, f5026c))) {
            return false;
        }
        b bVar = new b(b2);
        byte[] bArrM4090c3 = C1535a.m4090c(bArr2, 0, 32);
        if (m3393a(bArrM4090c3)) {
            int i2 = (bArrM4090c3[31] & 128) >>> 7;
            bArrM4090c3[31] = (byte) (bArrM4090c3[31] & 127);
            AbstractC1378b.m3300a(bArrM4090c3, bVar.f5041b);
            int[] iArrM3310a = AbstractC1378b.m3310a();
            int[] iArrM3310a2 = AbstractC1378b.m3310a();
            AbstractC1378b.m3318d(bVar.f5041b, iArrM3310a);
            AbstractC1378b.m3313b(f5029f, iArrM3310a, iArrM3310a2);
            AbstractC1378b.m3322f(iArrM3310a);
            AbstractC1378b.m3301a(iArrM3310a2);
            if (AbstractC1378b.m3316c(iArrM3310a, iArrM3310a2, bVar.f5040a)) {
                AbstractC1378b.m3317d(bVar.f5040a);
                if (i2 == 1 && AbstractC1378b.m3315c(bVar.f5040a)) {
                    z = false;
                } else {
                    if (!(i2 != (bVar.f5040a[0] & 1))) {
                        AbstractC1378b.m3314c(bVar.f5040a, bVar.f5040a);
                    }
                    m3386a(bVar);
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
        C0847x c0847x = new C0847x();
        byte[] bArr4 = new byte[c0847x.mo1930b()];
        c0847x.mo1929a(bArrM4090c, 0, 32);
        c0847x.mo1929a(bArr2, 0, 32);
        c0847x.mo1929a(bArr3, 0, i);
        c0847x.mo1926a(bArr4, 0);
        byte[] bArrM3400b = m3400b(bArr4);
        int[] iArr2 = new int[8];
        m3392a(bArrM4090c2, iArr2);
        int[] iArr3 = new int[8];
        m3392a(bArrM3400b, iArr3);
        a aVar = new a(b2);
        m3380a();
        byte[] bArrM3395a = m3395a(iArr2, 7);
        byte[] bArrM3395a2 = m3395a(iArr3, 5);
        b[] bVarArrM3396a = m3396a(bVar, 8);
        m3401c(aVar);
        int i3 = 255;
        while (i3 > 0 && (bArrM3395a[i3] | bArrM3395a2[i3]) == 0) {
            i3--;
        }
        while (true) {
            int i4 = i3;
            byte b3 = bArrM3395a[i4];
            if (b3 != 0) {
                int i5 = b3 >> 31;
                m3387a(i5 != 0, f5033j[(b3 ^ i5) >>> 1], aVar);
            }
            byte b4 = bArrM3395a2[i4];
            if (b4 != 0) {
                int i6 = b4 >> 31;
                m3387a(i6 != 0, bVarArrM3396a[(b4 ^ i6) >>> 1], aVar);
            }
            i3 = i4 - 1;
            if (i3 < 0) {
                byte[] bArr5 = new byte[32];
                m3385a(aVar, bArr5);
                return C1535a.m4076a(bArr5, bArrM4090c);
            }
            m3398b(aVar);
        }
    }
}
