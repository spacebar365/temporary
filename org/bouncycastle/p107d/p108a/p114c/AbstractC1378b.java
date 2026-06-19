package org.bouncycastle.p107d.p108a.p114c;

/* JADX INFO: renamed from: org.bouncycastle.d.a.c.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1378b {

    /* JADX INFO: renamed from: a */
    private static final int[] f5001a = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    /* JADX INFO: renamed from: a */
    private static int m3295a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    /* JADX INFO: renamed from: a */
    private static void m3296a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    public static void m3297a(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3298a(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3299a(byte[] bArr, int i, int[] iArr, int i2) {
        int iM3295a = m3295a(bArr, i + 0);
        int iM3295a2 = m3295a(bArr, i + 4);
        int iM3295a3 = m3295a(bArr, i + 8);
        int iM3295a4 = m3295a(bArr, i + 12);
        iArr[i2 + 0] = iM3295a & 67108863;
        iArr[i2 + 1] = ((iM3295a >>> 26) | (iM3295a2 << 6)) & 67108863;
        iArr[i2 + 2] = ((iM3295a2 >>> 20) | (iM3295a3 << 12)) & 33554431;
        iArr[i2 + 3] = ((iM3295a4 << 19) | (iM3295a3 >>> 13)) & 67108863;
        iArr[i2 + 4] = iM3295a4 >>> 7;
    }

    /* JADX INFO: renamed from: a */
    public static void m3300a(byte[] bArr, int[] iArr) {
        m3299a(bArr, 0, iArr, 0);
        m3299a(bArr, 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    /* JADX INFO: renamed from: a */
    public static void m3301a(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m3302a(int[] iArr, int i) {
        int i2 = iArr[9];
        int i3 = 16777215 & i2;
        int i4 = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = i4 & 67108863;
        int i5 = (i4 >> 26) + iArr[1];
        iArr[1] = i5 & 67108863;
        int i6 = (i5 >> 26) + iArr[2];
        iArr[2] = i6 & 33554431;
        int i7 = (i6 >> 25) + iArr[3];
        iArr[3] = i7 & 67108863;
        int i8 = (i7 >> 26) + iArr[4];
        iArr[4] = i8 & 33554431;
        int i9 = (i8 >> 25) + iArr[5];
        iArr[5] = i9 & 67108863;
        int i10 = (i9 >> 26) + iArr[6];
        iArr[6] = i10 & 67108863;
        int i11 = (i10 >> 26) + iArr[7];
        iArr[7] = i11 & 33554431;
        int i12 = (i11 >> 25) + iArr[8];
        iArr[8] = i12 & 67108863;
        iArr[9] = (i12 >> 26) + i3;
    }

    /* JADX INFO: renamed from: a */
    private static void m3303a(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        m3296a(i3 | (i4 << 26), bArr, i2 + 0);
        m3296a((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        m3296a((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        m3296a((i6 >>> 19) | (i7 << 7), bArr, i2 + 12);
    }

    /* JADX INFO: renamed from: a */
    private static void m3304a(int[] iArr, int i, int[] iArr2) {
        m3318d(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                m3318d(iArr2, iArr2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3305a(int[] iArr, byte[] bArr, int i) {
        m3303a(iArr, 0, bArr, i);
        m3303a(iArr, 5, bArr, i + 16);
    }

    /* JADX INFO: renamed from: a */
    public static void m3307a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            iArr2[i + i2] = iArr[i2 + 0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3308a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3309a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3310a() {
        return new int[10];
    }

    /* JADX INFO: renamed from: b */
    public static void m3311b(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i4 + (i3 >> 25);
        int i12 = i6 + (i5 >> 25);
        int i13 = i9 + (i8 >> 25);
        int i14 = i + ((i10 >> 25) * 38);
        int i15 = i2 + (i14 >> 26);
        int i16 = i7 + (i12 >> 26);
        iArr[0] = i14 & 67108863;
        iArr[1] = i15 & 67108863;
        iArr[2] = (i3 & 33554431) + (i15 >> 26);
        iArr[3] = i11 & 67108863;
        iArr[4] = (i5 & 33554431) + (i11 >> 26);
        iArr[5] = i12 & 67108863;
        iArr[6] = i16 & 67108863;
        iArr[7] = (i8 & 33554431) + (i16 >> 26);
        iArr[8] = i13 & 67108863;
        iArr[9] = (i10 & 33554431) + (i13 >> 26);
    }

    /* JADX INFO: renamed from: b */
    public static void m3312b(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        long j = ((long) i3) * 121666;
        int i10 = ((int) j) & 33554431;
        long j2 = ((long) i5) * 121666;
        int i11 = ((int) j2) & 33554431;
        long j3 = ((long) i8) * 121666;
        int i12 = ((int) j3) & 33554431;
        long j4 = ((long) iArr[9]) * 121666;
        int i13 = ((int) j4) & 33554431;
        long j5 = ((j4 >> 25) * 38) + (((long) i) * 121666);
        iArr2[0] = ((int) j5) & 67108863;
        long j6 = (j2 >> 25) + (((long) i6) * 121666);
        iArr2[5] = ((int) j6) & 67108863;
        long j7 = (((long) i2) * 121666) + (j5 >> 26);
        iArr2[1] = ((int) j7) & 67108863;
        long j8 = (j >> 25) + (((long) i4) * 121666);
        iArr2[3] = ((int) j8) & 67108863;
        long j9 = (j6 >> 26) + (((long) i7) * 121666);
        iArr2[6] = ((int) j9) & 67108863;
        long j10 = (j3 >> 25) + (((long) i9) * 121666);
        iArr2[8] = ((int) j10) & 67108863;
        iArr2[2] = ((int) (j7 >> 26)) + i10;
        iArr2[4] = ((int) (j8 >> 26)) + i11;
        iArr2[7] = ((int) (j9 >> 26)) + i12;
        iArr2[9] = ((int) (j10 >> 26)) + i13;
    }

    /* JADX INFO: renamed from: b */
    public static void m3313b(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = ((((long) i5) * ((long) i6)) << 1) + (((long) i) * ((long) i10)) + (((long) i3) * ((long) i8)) + (((long) i7) * ((long) i4)) + (((long) i9) * ((long) i2));
        long j2 = ((((long) i15) * ((long) i16)) << 1) + (((long) i11) * ((long) i20)) + (((long) i13) * ((long) i18)) + (((long) i17) * ((long) i14)) + (((long) i19) * ((long) i12));
        long j3 = (((long) i) * ((long) i2)) - (((((((long) i13) * ((long) i20)) + (((long) i15) * ((long) i18))) + (((long) i17) * ((long) i16))) + (((long) i19) * ((long) i14))) * 76);
        long j4 = ((((long) i) * ((long) i4)) + (((long) i3) * ((long) i2))) - (38 * ((((((long) i15) * ((long) i20)) + (((long) i19) * ((long) i16))) << 1) + (((long) i17) * ((long) i18))));
        long j5 = (((((long) i) * ((long) i6)) + (((long) i3) * ((long) i4))) + (((long) i5) * ((long) i2))) - (38 * ((((long) i17) * ((long) i20)) + (((long) i19) * ((long) i18))));
        long j6 = ((((((long) i3) * ((long) i6)) + (((long) i5) * ((long) i4))) << 1) + ((((long) i) * ((long) i8)) + (((long) i7) * ((long) i2)))) - (76 * (((long) i19) * ((long) i20)));
        long j7 = (((((((long) i3) * ((long) i10)) + (((long) i5) * ((long) i8))) + (((long) i7) * ((long) i6))) + (((long) i9) * ((long) i4))) << 1) - (((long) i11) * ((long) i12));
        long j8 = ((((((long) i5) * ((long) i10)) + (((long) i9) * ((long) i6))) << 1) + (((long) i7) * ((long) i8))) - ((((long) i11) * ((long) i14)) + (((long) i13) * ((long) i12)));
        long j9 = ((((long) i7) * ((long) i10)) + (((long) i9) * ((long) i8))) - (((((long) i11) * ((long) i16)) + (((long) i13) * ((long) i14))) + (((long) i15) * ((long) i12)));
        long j10 = ((((long) i9) * ((long) i10)) << 1) - ((((((long) i13) * ((long) i16)) + (((long) i15) * ((long) i14))) << 1) + ((((long) i11) * ((long) i18)) + (((long) i17) * ((long) i12))));
        int i21 = i + i11;
        int i22 = i2 + i12;
        int i23 = i3 + i13;
        int i24 = i4 + i14;
        int i25 = i5 + i15;
        int i26 = i6 + i16;
        int i27 = i7 + i17;
        int i28 = i8 + i18;
        int i29 = i9 + i19;
        int i30 = i10 + i20;
        long j11 = ((long) i21) * ((long) i22);
        long j12 = (((long) i21) * ((long) i24)) + (((long) i23) * ((long) i22));
        long j13 = (((long) i21) * ((long) i26)) + (((long) i23) * ((long) i24)) + (((long) i25) * ((long) i22));
        long j14 = (((((long) i23) * ((long) i26)) + (((long) i25) * ((long) i24))) << 1) + (((long) i21) * ((long) i28)) + (((long) i27) * ((long) i22));
        long j15 = (((long) i22) * ((long) i29)) + (((long) i21) * ((long) i30)) + (((long) i23) * ((long) i28)) + (((long) i27) * ((long) i24)) + ((((long) i25) * ((long) i26)) << 1);
        long j16 = ((((long) i24) * ((long) i29)) + (((((long) i23) * ((long) i30)) + (((long) i25) * ((long) i28))) + (((long) i27) * ((long) i26)))) << 1;
        long j17 = (((((long) i26) * ((long) i29)) + (((long) i25) * ((long) i30))) << 1) + (((long) i27) * ((long) i28));
        long j18 = (((long) i28) * ((long) i29)) + (((long) i27) * ((long) i30));
        long j19 = (j14 - j6) + j10;
        int i31 = ((int) j19) & 67108863;
        long j20 = ((j15 - j) - j2) + (j19 >> 26);
        int i32 = ((int) j20) & 33554431;
        long j21 = ((((j20 >> 25) + j16) - j7) * 38) + j3;
        iArr3[0] = ((int) j21) & 67108863;
        long j22 = (j21 >> 26) + ((j17 - j8) * 38) + j4;
        iArr3[1] = ((int) j22) & 67108863;
        long j23 = (j22 >> 26) + ((j18 - j9) * 38) + j5;
        iArr3[2] = ((int) j23) & 33554431;
        long j24 = (j23 >> 25) + ((((((long) i30) * ((long) i29)) << 1) - j10) * 38) + j6;
        iArr3[3] = ((int) j24) & 67108863;
        long j25 = (j24 >> 26) + (38 * j2) + j;
        iArr3[4] = ((int) j25) & 33554431;
        long j26 = (j25 >> 25) + (j11 - j3) + j7;
        iArr3[5] = ((int) j26) & 67108863;
        long j27 = (j26 >> 26) + (j12 - j4) + j8;
        iArr3[6] = ((int) j27) & 67108863;
        long j28 = (j27 >> 26) + (j13 - j5) + j9;
        iArr3[7] = ((int) j28) & 33554431;
        long j29 = (j28 >> 25) + ((long) i31);
        iArr3[8] = ((int) j29) & 67108863;
        iArr3[9] = ((int) (j29 >> 26)) + i32;
    }

    /* JADX INFO: renamed from: c */
    public static void m3314c(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3315c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return i == 0;
    }

    /* JADX INFO: renamed from: d */
    public static void m3317d(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        m3302a(iArr, i);
        m3302a(iArr, -i);
    }

    /* JADX INFO: renamed from: d */
    public static void m3318d(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i2 * 2;
        int i12 = i3 * 2;
        int i13 = i4 * 2;
        int i14 = i5 * 2;
        long j = ((long) i) * ((long) i11);
        long j2 = (((long) i11) * ((long) i12)) + (((long) i) * ((long) i13));
        long j3 = (((long) i3) * ((long) i12)) + (((long) i) * ((long) i14)) + (((long) i2) * ((long) i13));
        long j4 = (((long) i11) * ((long) i14)) + (((long) i12) * ((long) i13));
        int i15 = i7 * 2;
        int i16 = i8 * 2;
        int i17 = i9 * 2;
        int i18 = i10 * 2;
        long j5 = ((long) i6) * ((long) i15);
        long j6 = (((long) i15) * ((long) i16)) + (((long) i6) * ((long) i17));
        long j7 = (((long) i8) * ((long) i16)) + (((long) i6) * ((long) i18)) + (((long) i7) * ((long) i17));
        long j8 = (((long) i15) * ((long) i18)) + (((long) i16) * ((long) i17));
        long j9 = (((long) i) * ((long) i)) - (j8 * 38);
        long j10 = j - (((((long) i16) * ((long) i18)) + (((long) i9) * ((long) i9))) * 38);
        long j11 = ((((long) i) * ((long) i12)) + (((long) i2) * ((long) i2))) - (38 * (((long) i9) * ((long) i18)));
        long j12 = j2 - (38 * (((long) i18) * ((long) i10)));
        long j13 = j4 - (((long) i6) * ((long) i6));
        long j14 = ((((long) i12) * ((long) i14)) + (((long) i4) * ((long) i4))) - j5;
        long j15 = (((long) i4) * ((long) i14)) - ((((long) i6) * ((long) i16)) + (((long) i7) * ((long) i7)));
        long j16 = (((long) i14) * ((long) i5)) - j6;
        int i19 = i + i6;
        int i20 = i2 + i7;
        int i21 = i3 + i8;
        int i22 = i4 + i9;
        int i23 = i5 + i10;
        int i24 = i20 * 2;
        int i25 = i21 * 2;
        int i26 = i22 * 2;
        int i27 = i23 * 2;
        long j17 = ((long) i19) * ((long) i19);
        long j18 = ((long) i19) * ((long) i24);
        long j19 = (((long) i19) * ((long) i25)) + (((long) i20) * ((long) i20));
        long j20 = (((long) i24) * ((long) i25)) + (((long) i19) * ((long) i26));
        long j21 = (((long) i20) * ((long) i26)) + (((long) i21) * ((long) i25)) + (((long) i19) * ((long) i27));
        long j22 = (((long) i24) * ((long) i27)) + (((long) i25) * ((long) i26));
        long j23 = (((long) i25) * ((long) i27)) + (((long) i22) * ((long) i22));
        long j24 = ((long) i22) * ((long) i27);
        long j25 = ((long) i23) * ((long) i27);
        long j26 = (j20 - j12) + j16;
        int i28 = ((int) j26) & 67108863;
        long j27 = ((j21 - j3) - j7) + (j26 >> 26);
        int i29 = ((int) j27) & 33554431;
        long j28 = ((((j27 >> 25) + j22) - j13) * 38) + j9;
        iArr2[0] = ((int) j28) & 67108863;
        long j29 = (j28 >> 26) + ((j23 - j14) * 38) + j10;
        iArr2[1] = ((int) j29) & 67108863;
        long j30 = (j29 >> 26) + ((j24 - j15) * 38) + j11;
        iArr2[2] = ((int) j30) & 33554431;
        long j31 = (j30 >> 25) + ((j25 - j16) * 38) + j12;
        iArr2[3] = ((int) j31) & 67108863;
        long j32 = (j31 >> 26) + (38 * j7) + j3;
        iArr2[4] = ((int) j32) & 33554431;
        long j33 = (j32 >> 25) + (j17 - j9) + j13;
        iArr2[5] = ((int) j33) & 67108863;
        long j34 = (j33 >> 26) + (j18 - j10) + j14;
        iArr2[6] = ((int) j34) & 67108863;
        long j35 = (j34 >> 26) + (j19 - j11) + j15;
        iArr2[7] = ((int) j35) & 33554431;
        long j36 = (j35 >> 25) + ((long) i28);
        iArr2[8] = ((int) j36) & 67108863;
        iArr2[9] = ((int) (j36 >> 26)) + i29;
    }

    /* JADX INFO: renamed from: d */
    public static void m3319d(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3320e(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3322f(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m3323g(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3306a(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        m3321e(iArr, iArr3, iArr4);
        m3304a(iArr4, 3, iArr4);
        m3313b(iArr4, iArr3, iArr2);
    }

    /* JADX INFO: renamed from: e */
    private static void m3321e(int[] iArr, int[] iArr2, int[] iArr3) {
        m3318d(iArr, iArr2);
        m3313b(iArr, iArr2, iArr2);
        int[] iArr4 = new int[10];
        m3318d(iArr2, iArr4);
        m3313b(iArr, iArr4, iArr4);
        m3304a(iArr4, 2, iArr4);
        m3313b(iArr2, iArr4, iArr4);
        int[] iArr5 = new int[10];
        m3304a(iArr4, 5, iArr5);
        m3313b(iArr4, iArr5, iArr5);
        int[] iArr6 = new int[10];
        m3304a(iArr5, 5, iArr6);
        m3313b(iArr4, iArr6, iArr6);
        m3304a(iArr6, 10, iArr4);
        m3313b(iArr5, iArr4, iArr4);
        m3304a(iArr4, 25, iArr5);
        m3313b(iArr4, iArr5, iArr5);
        m3304a(iArr5, 25, iArr6);
        m3313b(iArr4, iArr6, iArr6);
        m3304a(iArr6, 50, iArr4);
        m3313b(iArr5, iArr4, iArr4);
        m3304a(iArr4, 125, iArr5);
        m3313b(iArr4, iArr5, iArr5);
        m3304a(iArr5, 2, iArr4);
        m3313b(iArr4, iArr, iArr3);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3316c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        m3313b(iArr, iArr2, iArr4);
        m3318d(iArr2, iArr5);
        m3313b(iArr4, iArr5, iArr4);
        m3318d(iArr5, iArr5);
        m3313b(iArr5, iArr4, iArr5);
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        m3321e(iArr5, iArr6, iArr7);
        m3313b(iArr7, iArr4, iArr7);
        int[] iArr8 = new int[10];
        m3318d(iArr7, iArr8);
        m3313b(iArr8, iArr2, iArr8);
        m3319d(iArr8, iArr, iArr6);
        m3317d(iArr6);
        if (m3315c(iArr6)) {
            m3307a(iArr7, iArr3, 0);
            return true;
        }
        m3308a(iArr8, iArr, iArr6);
        m3317d(iArr6);
        if (!m3315c(iArr6)) {
            return false;
        }
        m3313b(iArr7, f5001a, iArr3);
        return true;
    }
}
