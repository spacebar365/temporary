package org.bouncycastle.p107d.p108a.p114c;

/* JADX INFO: renamed from: org.bouncycastle.d.a.c.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1380d {
    /* JADX INFO: renamed from: a */
    private static int m3326a(byte[] bArr, int i) {
        int i2 = i + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16);
    }

    /* JADX INFO: renamed from: a */
    private static void m3327a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i3 + 1] = (byte) (i >>> 16);
    }

    /* JADX INFO: renamed from: a */
    public static void m3328a(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3329a(byte[] bArr, int i, int[] iArr, int i2) {
        int iM3339b = m3339b(bArr, i);
        int iM3326a = m3326a(bArr, i + 4);
        iArr[i2] = 268435455 & iM3339b;
        iArr[i2 + 1] = (iM3339b >>> 28) | (iM3326a << 4);
    }

    /* JADX INFO: renamed from: a */
    public static void m3330a(byte[] bArr, int[] iArr) {
        m3329a(bArr, 0, iArr, 0);
        m3329a(bArr, 7, iArr, 2);
        m3329a(bArr, 14, iArr, 4);
        m3329a(bArr, 21, iArr, 6);
        m3329a(bArr, 28, iArr, 8);
        m3329a(bArr, 35, iArr, 10);
        m3329a(bArr, 42, iArr, 12);
        m3329a(bArr, 49, iArr, 14);
    }

    /* JADX INFO: renamed from: a */
    public static void m3331a(int[] iArr) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = i3 + (i2 >>> 28);
        int i16 = i7 + (i6 >>> 28);
        int i17 = i11 + (i10 >>> 28);
        int i18 = iArr[14] + (i14 >>> 28);
        int i19 = i4 + (i15 >>> 28);
        int i20 = i8 + (i16 >>> 28);
        int i21 = i12 + (i17 >>> 28);
        int i22 = iArr[15] + (i18 >>> 28);
        int i23 = i22 >>> 28;
        int i24 = i + i23;
        int i25 = i5 + (i19 >>> 28);
        int i26 = i9 + i23 + (i20 >>> 28);
        int i27 = i13 + (i21 >>> 28);
        iArr[0] = i24 & 268435455;
        iArr[1] = (i2 & 268435455) + (i24 >>> 28);
        iArr[2] = i15 & 268435455;
        iArr[3] = i19 & 268435455;
        iArr[4] = i25 & 268435455;
        iArr[5] = (i6 & 268435455) + (i25 >>> 28);
        iArr[6] = i16 & 268435455;
        iArr[7] = i20 & 268435455;
        iArr[8] = i26 & 268435455;
        iArr[9] = (i10 & 268435455) + (i26 >>> 28);
        iArr[10] = i17 & 268435455;
        iArr[11] = i21 & 268435455;
        iArr[12] = i27 & 268435455;
        iArr[13] = (i14 & 268435455) + (i27 >>> 28);
        iArr[14] = i18 & 268435455;
        iArr[15] = i22 & 268435455;
    }

    /* JADX INFO: renamed from: a */
    private static void m3332a(int[] iArr, int i) {
        int i2 = iArr[15];
        int i3 = i2 & 268435455;
        int i4 = (i2 >> 28) + i;
        iArr[8] = iArr[8] + i4;
        for (int i5 = 0; i5 < 15; i5++) {
            int i6 = i4 + iArr[i5];
            iArr[i5] = i6 & 268435455;
            i4 = i6 >> 28;
        }
        iArr[15] = i4 + i3;
    }

    /* JADX INFO: renamed from: a */
    private static void m3333a(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        m3340b(i3 | (i4 << 28), bArr, i2);
        m3327a(i4 >>> 4, bArr, i2 + 4);
    }

    /* JADX INFO: renamed from: a */
    public static void m3334a(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = iArr[15];
        long j = ((long) i3) * ((long) i);
        int i18 = ((int) j) & 268435455;
        long j2 = ((long) i7) * ((long) i);
        int i19 = ((int) j2) & 268435455;
        long j3 = ((long) i11) * ((long) i);
        int i20 = ((int) j3) & 268435455;
        long j4 = ((long) i15) * ((long) i);
        int i21 = ((int) j4) & 268435455;
        long j5 = (j >>> 28) + (((long) i4) * ((long) i));
        iArr2[2] = ((int) j5) & 268435455;
        long j6 = (j2 >>> 28) + (((long) i8) * ((long) i));
        iArr2[6] = ((int) j6) & 268435455;
        long j7 = (j3 >>> 28) + (((long) i12) * ((long) i));
        iArr2[10] = ((int) j7) & 268435455;
        long j8 = (j4 >>> 28) + (((long) i16) * ((long) i));
        iArr2[14] = ((int) j8) & 268435455;
        long j9 = (((long) i5) * ((long) i)) + (j5 >>> 28);
        iArr2[3] = ((int) j9) & 268435455;
        long j10 = (((long) i9) * ((long) i)) + (j6 >>> 28);
        iArr2[7] = ((int) j10) & 268435455;
        long j11 = (((long) i13) * ((long) i)) + (j7 >>> 28);
        iArr2[11] = ((int) j11) & 268435455;
        long j12 = (((long) i17) * ((long) i)) + (j8 >>> 28);
        iArr2[15] = ((int) j12) & 268435455;
        long j13 = j12 >>> 28;
        long j14 = (j9 >>> 28) + (((long) i6) * ((long) i));
        iArr2[4] = ((int) j14) & 268435455;
        long j15 = (j10 >>> 28) + j13 + (((long) i10) * ((long) i));
        iArr2[8] = ((int) j15) & 268435455;
        long j16 = (j11 >>> 28) + (((long) i14) * ((long) i));
        iArr2[12] = ((int) j16) & 268435455;
        long j17 = j13 + (((long) i2) * ((long) i));
        iArr2[0] = ((int) j17) & 268435455;
        iArr2[1] = i18 + ((int) (j17 >>> 28));
        iArr2[5] = ((int) (j14 >>> 28)) + i19;
        iArr2[9] = ((int) (j15 >>> 28)) + i20;
        iArr2[13] = ((int) (j16 >>> 28)) + i21;
    }

    /* JADX INFO: renamed from: a */
    public static void m3335a(int[] iArr, byte[] bArr, int i) {
        m3333a(iArr, 0, bArr, i);
        m3333a(iArr, 2, bArr, i + 7);
        m3333a(iArr, 4, bArr, i + 14);
        m3333a(iArr, 6, bArr, i + 21);
        m3333a(iArr, 8, bArr, i + 28);
        m3333a(iArr, 10, bArr, i + 35);
        m3333a(iArr, 12, bArr, i + 42);
        m3333a(iArr, 14, bArr, i + 49);
    }

    /* JADX INFO: renamed from: a */
    public static void m3337a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < 16; i2++) {
            iArr2[i + i2] = iArr[i2 + 0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3338a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m3339b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    /* JADX INFO: renamed from: b */
    private static void m3340b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: b */
    private static void m3341b(int[] iArr, int i, int[] iArr2) {
        m3346c(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                m3346c(iArr2, iArr2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3343b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        int i33 = i + i9;
        int i34 = i2 + i10;
        int i35 = i3 + i11;
        int i36 = i4 + i12;
        int i37 = i5 + i13;
        int i38 = i6 + i14;
        int i39 = i7 + i15;
        int i40 = i8 + i16;
        int i41 = i17 + i25;
        int i42 = i18 + i26;
        int i43 = i19 + i27;
        int i44 = i20 + i28;
        int i45 = i21 + i29;
        int i46 = i22 + i30;
        int i47 = i23 + i31;
        int i48 = i24 + i32;
        long j = ((long) i) * ((long) i17);
        long j2 = (((long) i40) * ((long) i42)) + (((long) i39) * ((long) i43)) + (((long) i38) * ((long) i44)) + (((long) i37) * ((long) i45)) + (((long) i36) * ((long) i46)) + (((long) i35) * ((long) i47)) + (((long) i34) * ((long) i48));
        long j3 = (((((long) i9) * ((long) i25)) + j) + j2) - (((((((((long) i8) * ((long) i18)) + (((long) i7) * ((long) i19))) + (((long) i6) * ((long) i20))) + (((long) i5) * ((long) i21))) + (((long) i4) * ((long) i22))) + (((long) i3) * ((long) i23))) + (((long) i2) * ((long) i24)));
        int i49 = ((int) j3) & 268435455;
        long j4 = (((((((((((long) i16) * ((long) i26)) + (((long) i15) * ((long) i27))) + (((long) i14) * ((long) i28))) + (((long) i13) * ((long) i29))) + (((long) i12) * ((long) i30))) + (((long) i11) * ((long) i31))) + (((long) i10) * ((long) i32))) + (((long) i33) * ((long) i41))) - j) + j2;
        int i50 = ((int) j4) & 268435455;
        long j5 = (((long) i2) * ((long) i17)) + (((long) i) * ((long) i18));
        long j6 = (((long) i40) * ((long) i43)) + (((long) i39) * ((long) i44)) + (((long) i38) * ((long) i45)) + (((long) i37) * ((long) i46)) + (((long) i36) * ((long) i47)) + (((long) i35) * ((long) i48));
        long j7 = (j3 >>> 28) + (((((((long) i10) * ((long) i25)) + (((long) i9) * ((long) i26))) + j5) + j6) - ((((((((long) i8) * ((long) i19)) + (((long) i7) * ((long) i20))) + (((long) i6) * ((long) i21))) + (((long) i5) * ((long) i22))) + (((long) i4) * ((long) i23))) + (((long) i3) * ((long) i24))));
        int i51 = ((int) j7) & 268435455;
        long j8 = (j4 >>> 28) + ((((((((((long) i16) * ((long) i27)) + (((long) i15) * ((long) i28))) + (((long) i14) * ((long) i29))) + (((long) i13) * ((long) i30))) + (((long) i12) * ((long) i31))) + (((long) i11) * ((long) i32))) + ((((long) i34) * ((long) i41)) + (((long) i33) * ((long) i42)))) - j5) + j6;
        int i52 = ((int) j8) & 268435455;
        long j9 = (((long) i3) * ((long) i17)) + (((long) i2) * ((long) i18)) + (((long) i) * ((long) i19));
        long j10 = (((long) i40) * ((long) i44)) + (((long) i39) * ((long) i45)) + (((long) i38) * ((long) i46)) + (((long) i37) * ((long) i47)) + (((long) i36) * ((long) i48));
        long j11 = (j7 >>> 28) + ((((((((long) i11) * ((long) i25)) + (((long) i10) * ((long) i26))) + (((long) i9) * ((long) i27))) + j9) + j10) - (((((((long) i8) * ((long) i20)) + (((long) i7) * ((long) i21))) + (((long) i6) * ((long) i22))) + (((long) i5) * ((long) i23))) + (((long) i4) * ((long) i24))));
        int i53 = ((int) j11) & 268435455;
        long j12 = (j8 >>> 28) + (((((((((long) i16) * ((long) i28)) + (((long) i15) * ((long) i29))) + (((long) i14) * ((long) i30))) + (((long) i13) * ((long) i31))) + (((long) i12) * ((long) i32))) + (((((long) i35) * ((long) i41)) + (((long) i34) * ((long) i42))) + (((long) i33) * ((long) i43)))) - j9) + j10;
        int i54 = ((int) j12) & 268435455;
        long j13 = (((long) i4) * ((long) i17)) + (((long) i3) * ((long) i18)) + (((long) i2) * ((long) i19)) + (((long) i) * ((long) i20));
        long j14 = (((long) i40) * ((long) i45)) + (((long) i39) * ((long) i46)) + (((long) i38) * ((long) i47)) + (((long) i37) * ((long) i48));
        long j15 = (j11 >>> 28) + (((((((((long) i12) * ((long) i25)) + (((long) i11) * ((long) i26))) + (((long) i10) * ((long) i27))) + (((long) i9) * ((long) i28))) + j13) + j14) - ((((((long) i8) * ((long) i21)) + (((long) i7) * ((long) i22))) + (((long) i6) * ((long) i23))) + (((long) i5) * ((long) i24))));
        int i55 = ((int) j15) & 268435455;
        long j16 = (j12 >>> 28) + ((((((((long) i16) * ((long) i29)) + (((long) i15) * ((long) i30))) + (((long) i14) * ((long) i31))) + (((long) i13) * ((long) i32))) + ((((((long) i36) * ((long) i41)) + (((long) i35) * ((long) i42))) + (((long) i34) * ((long) i43))) + (((long) i33) * ((long) i44)))) - j13) + j14;
        int i56 = ((int) j16) & 268435455;
        long j17 = (((long) i5) * ((long) i17)) + (((long) i4) * ((long) i18)) + (((long) i3) * ((long) i19)) + (((long) i2) * ((long) i20)) + (((long) i) * ((long) i21));
        long j18 = (((long) i40) * ((long) i46)) + (((long) i39) * ((long) i47)) + (((long) i38) * ((long) i48));
        long j19 = (j15 >>> 28) + ((((((((((long) i13) * ((long) i25)) + (((long) i12) * ((long) i26))) + (((long) i11) * ((long) i27))) + (((long) i10) * ((long) i28))) + (((long) i9) * ((long) i29))) + j17) + j18) - (((((long) i8) * ((long) i22)) + (((long) i7) * ((long) i23))) + (((long) i6) * ((long) i24))));
        int i57 = ((int) j19) & 268435455;
        long j20 = (j16 >>> 28) + (((((((long) i16) * ((long) i30)) + (((long) i15) * ((long) i31))) + (((long) i14) * ((long) i32))) + (((((((long) i37) * ((long) i41)) + (((long) i36) * ((long) i42))) + (((long) i35) * ((long) i43))) + (((long) i34) * ((long) i44))) + (((long) i33) * ((long) i45)))) - j17) + j18;
        int i58 = ((int) j20) & 268435455;
        long j21 = (((long) i6) * ((long) i17)) + (((long) i5) * ((long) i18)) + (((long) i4) * ((long) i19)) + (((long) i3) * ((long) i20)) + (((long) i2) * ((long) i21)) + (((long) i) * ((long) i22));
        long j22 = (((long) i40) * ((long) i47)) + (((long) i39) * ((long) i48));
        long j23 = (j19 >>> 28) + (((((((((((long) i14) * ((long) i25)) + (((long) i13) * ((long) i26))) + (((long) i12) * ((long) i27))) + (((long) i11) * ((long) i28))) + (((long) i10) * ((long) i29))) + (((long) i9) * ((long) i30))) + j21) + j22) - ((((long) i8) * ((long) i23)) + (((long) i7) * ((long) i24))));
        int i59 = ((int) j23) & 268435455;
        long j24 = (j20 >>> 28) + ((((((long) i16) * ((long) i31)) + (((long) i15) * ((long) i32))) + ((((((((long) i38) * ((long) i41)) + (((long) i37) * ((long) i42))) + (((long) i36) * ((long) i43))) + (((long) i35) * ((long) i44))) + (((long) i34) * ((long) i45))) + (((long) i33) * ((long) i46)))) - j21) + j22;
        int i60 = ((int) j24) & 268435455;
        long j25 = (((long) i7) * ((long) i17)) + (((long) i6) * ((long) i18)) + (((long) i5) * ((long) i19)) + (((long) i4) * ((long) i20)) + (((long) i3) * ((long) i21)) + (((long) i2) * ((long) i22)) + (((long) i) * ((long) i23));
        long j26 = ((long) i40) * ((long) i48);
        long j27 = (j23 >>> 28) + ((((((((((((long) i15) * ((long) i25)) + (((long) i14) * ((long) i26))) + (((long) i13) * ((long) i27))) + (((long) i12) * ((long) i28))) + (((long) i11) * ((long) i29))) + (((long) i10) * ((long) i30))) + (((long) i9) * ((long) i31))) + j25) + j26) - (((long) i8) * ((long) i24)));
        long j28 = (j24 >>> 28) + (((((long) i16) * ((long) i32)) + (((((((((long) i39) * ((long) i41)) + (((long) i38) * ((long) i42))) + (((long) i37) * ((long) i43))) + (((long) i36) * ((long) i44))) + (((long) i35) * ((long) i45))) + (((long) i34) * ((long) i46))) + (((long) i33) * ((long) i47)))) - j25) + j26;
        long j29 = (((long) i) * ((long) i24)) + (((long) i3) * ((long) i22)) + (((long) i5) * ((long) i20)) + (((long) i7) * ((long) i18)) + (((long) i8) * ((long) i17)) + (((long) i6) * ((long) i19)) + (((long) i4) * ((long) i21)) + (((long) i2) * ((long) i23));
        long j30 = (((long) i16) * ((long) i25)) + (((long) i15) * ((long) i26)) + (((long) i14) * ((long) i27)) + (((long) i13) * ((long) i28)) + (((long) i12) * ((long) i29)) + (((long) i11) * ((long) i30)) + (((long) i10) * ((long) i31)) + (((long) i9) * ((long) i32)) + j29 + (j27 >>> 28);
        int i61 = ((int) j30) & 268435455;
        long j31 = (((((((((((long) i40) * ((long) i41)) + (((long) i39) * ((long) i42))) + (((long) i38) * ((long) i43))) + (((long) i37) * ((long) i44))) + (((long) i36) * ((long) i45))) + (((long) i35) * ((long) i46))) + (((long) i34) * ((long) i47))) + (((long) i33) * ((long) i48))) - j29) + (j28 >>> 28);
        int i62 = ((int) j31) & 268435455;
        long j32 = j31 >>> 28;
        long j33 = (j30 >>> 28) + j32 + ((long) i50);
        long j34 = j32 + ((long) i49);
        iArr3[0] = ((int) j34) & 268435455;
        iArr3[1] = ((int) (j34 >>> 28)) + i51;
        iArr3[2] = i53;
        iArr3[3] = i55;
        iArr3[4] = i57;
        iArr3[5] = i59;
        iArr3[6] = ((int) j27) & 268435455;
        iArr3[7] = i61;
        iArr3[8] = ((int) j33) & 268435455;
        iArr3[9] = ((int) (j33 >>> 28)) + i52;
        iArr3[10] = i54;
        iArr3[11] = i56;
        iArr3[12] = i58;
        iArr3[13] = i60;
        iArr3[14] = ((int) j28) & 268435455;
        iArr3[15] = i62;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3344b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return i == 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m3345c(int[] iArr) {
        m3332a(iArr, 1);
        m3332a(iArr, -1);
    }

    /* JADX INFO: renamed from: c */
    public static void m3346c(int[] iArr, int[] iArr2) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i * 2;
        int i18 = i2 * 2;
        int i19 = i3 * 2;
        int i20 = i4 * 2;
        int i21 = i5 * 2;
        int i22 = i6 * 2;
        int i23 = i9 * 2;
        int i24 = i10 * 2;
        int i25 = i11 * 2;
        int i26 = i12 * 2;
        int i27 = i13 * 2;
        int i28 = i14 * 2;
        int i29 = i + i9;
        int i30 = i2 + i10;
        int i31 = i3 + i11;
        int i32 = i4 + i12;
        int i33 = i5 + i13;
        int i34 = i6 + i14;
        int i35 = i7 + i15;
        int i36 = i8 + i16;
        int i37 = i29 * 2;
        int i38 = i30 * 2;
        int i39 = i31 * 2;
        int i40 = i32 * 2;
        int i41 = i33 * 2;
        int i42 = i34 * 2;
        long j = ((long) i) * ((long) i);
        long j2 = (((long) i36) * ((long) i38)) + (((long) i35) * ((long) i39)) + (((long) i34) * ((long) i40)) + (((long) i33) * ((long) i33));
        long j3 = (((((long) i9) * ((long) i9)) + j) + j2) - ((((((long) i8) * ((long) i18)) + (((long) i7) * ((long) i19))) + (((long) i6) * ((long) i20))) + (((long) i5) * ((long) i5)));
        int i43 = ((int) j3) & 268435455;
        long j4 = ((((((((long) i16) * ((long) i24)) + (((long) i15) * ((long) i25))) + (((long) i14) * ((long) i26))) + (((long) i13) * ((long) i13))) + (((long) i29) * ((long) i29))) - j) + j2;
        int i44 = ((int) j4) & 268435455;
        long j5 = ((long) i2) * ((long) i17);
        long j6 = (((long) i36) * ((long) i39)) + (((long) i35) * ((long) i40)) + (((long) i34) * ((long) i41));
        long j7 = (j3 >>> 28) + ((((((long) i10) * ((long) i23)) + j5) + j6) - (((((long) i8) * ((long) i19)) + (((long) i7) * ((long) i20))) + (((long) i6) * ((long) i21))));
        int i45 = ((int) j7) & 268435455;
        long j8 = (j4 >>> 28) + (((((((long) i16) * ((long) i25)) + (((long) i15) * ((long) i26))) + (((long) i14) * ((long) i27))) + (((long) i30) * ((long) i37))) - j5) + j6;
        int i46 = ((int) j8) & 268435455;
        long j9 = (((long) i3) * ((long) i17)) + (((long) i2) * ((long) i2));
        long j10 = (((long) i36) * ((long) i40)) + (((long) i35) * ((long) i41)) + (((long) i34) * ((long) i34));
        long j11 = (j7 >>> 28) + (((((((long) i11) * ((long) i23)) + (((long) i10) * ((long) i10))) + j9) + j10) - (((((long) i8) * ((long) i20)) + (((long) i7) * ((long) i21))) + (((long) i6) * ((long) i6))));
        int i47 = ((int) j11) & 268435455;
        long j12 = (j8 >>> 28) + (((((((long) i16) * ((long) i26)) + (((long) i15) * ((long) i27))) + (((long) i14) * ((long) i14))) + ((((long) i31) * ((long) i37)) + (((long) i30) * ((long) i30)))) - j9) + j10;
        int i48 = ((int) j12) & 268435455;
        long j13 = (((long) i4) * ((long) i17)) + (((long) i3) * ((long) i18));
        long j14 = (((long) i36) * ((long) i41)) + (((long) i35) * ((long) i42));
        long j15 = (j11 >>> 28) + (((((((long) i12) * ((long) i23)) + (((long) i11) * ((long) i24))) + j13) + j14) - ((((long) i8) * ((long) i21)) + (((long) i7) * ((long) i22))));
        int i49 = ((int) j15) & 268435455;
        long j16 = (j12 >>> 28) + ((((((long) i16) * ((long) i27)) + (((long) i15) * ((long) i28))) + ((((long) i32) * ((long) i37)) + (((long) i31) * ((long) i38)))) - j13) + j14;
        int i50 = ((int) j16) & 268435455;
        long j17 = (((long) i5) * ((long) i17)) + (((long) i4) * ((long) i18)) + (((long) i3) * ((long) i3));
        long j18 = (((long) i42) * ((long) i36)) + (((long) i35) * ((long) i35));
        long j19 = (j15 >>> 28) + ((((((((long) i13) * ((long) i23)) + (((long) i12) * ((long) i24))) + (((long) i11) * ((long) i11))) + j17) + j18) - ((((long) i8) * ((long) i22)) + (((long) i7) * ((long) i7))));
        int i51 = ((int) j19) & 268435455;
        long j20 = j18 + ((((((long) i16) * ((long) i28)) + (((long) i15) * ((long) i15))) + (((((long) i33) * ((long) i37)) + (((long) i32) * ((long) i38))) + (((long) i31) * ((long) i31)))) - j17) + (j16 >>> 28);
        int i52 = ((int) j20) & 268435455;
        long j21 = (((long) i6) * ((long) i17)) + (((long) i5) * ((long) i18)) + (((long) i4) * ((long) i19));
        long j22 = ((long) i36) * ((long) (i35 * 2));
        long j23 = (j19 >>> 28) + ((((((((long) i14) * ((long) i23)) + (((long) i13) * ((long) i24))) + (((long) i12) * ((long) i25))) + j21) + j22) - (((long) i8) * ((long) (i7 * 2))));
        long j24 = (((((long) (i15 * 2)) * ((long) i16)) + (((((long) i34) * ((long) i37)) + (((long) i33) * ((long) i38))) + (((long) i32) * ((long) i39)))) - j21) + j22 + (j20 >>> 28);
        int i53 = ((int) j24) & 268435455;
        long j25 = (((long) i7) * ((long) i17)) + (((long) i6) * ((long) i18)) + (((long) i5) * ((long) i19)) + (((long) i4) * ((long) i4));
        long j26 = (((long) i32) * ((long) i32)) + (((long) i35) * ((long) i37)) + (((long) i34) * ((long) i38)) + (((long) i33) * ((long) i39));
        long j27 = ((long) i36) * ((long) i36);
        long j28 = (((((((((long) i15) * ((long) i23)) + (((long) i14) * ((long) i24))) + (((long) i13) * ((long) i25))) + (((long) i12) * ((long) i12))) + j25) + j27) - (((long) i8) * ((long) i8))) + (j23 >>> 28);
        long j29 = (j24 >>> 28) + ((j26 + (((long) i16) * ((long) i16))) - j25) + j27;
        long j30 = (((long) i5) * ((long) i20)) + (((long) i7) * ((long) i18)) + (((long) i8) * ((long) i17)) + (((long) i6) * ((long) i19));
        long j31 = (((long) i16) * ((long) i23)) + (((long) i15) * ((long) i24)) + (((long) i14) * ((long) i25)) + (((long) i13) * ((long) i26));
        long j32 = j31 + j30 + (j28 >>> 28);
        int i54 = ((int) j32) & 268435455;
        long j33 = (((((((long) i36) * ((long) i37)) + (((long) i35) * ((long) i38))) + (((long) i34) * ((long) i39))) + (((long) i33) * ((long) i40))) - j30) + (j29 >>> 28);
        int i55 = ((int) j33) & 268435455;
        long j34 = j33 >>> 28;
        long j35 = (j32 >>> 28) + j34 + ((long) i44);
        long j36 = j34 + ((long) i43);
        iArr2[0] = ((int) j36) & 268435455;
        iArr2[1] = ((int) (j36 >>> 28)) + i45;
        iArr2[2] = i47;
        iArr2[3] = i49;
        iArr2[4] = i51;
        iArr2[5] = ((int) j23) & 268435455;
        iArr2[6] = ((int) j28) & 268435455;
        iArr2[7] = i54;
        iArr2[8] = ((int) j35) & 268435455;
        iArr2[9] = ((int) (j35 >>> 28)) + i46;
        iArr2[10] = i48;
        iArr2[11] = i50;
        iArr2[12] = i52;
        iArr2[13] = i53;
        iArr2[14] = ((int) j29) & 268435455;
        iArr2[15] = i55;
    }

    /* JADX INFO: renamed from: d */
    public static void m3348d(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3350d(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = (i + 536870910) - i17;
        int i32 = (i2 + 536870910) - i18;
        int i33 = (i6 + 536870910) - i22;
        int i34 = (i10 + 536870910) - i26;
        int i35 = (i14 + 536870910) - i30;
        int i36 = ((i3 + 536870910) - i19) + (i32 >>> 28);
        int i37 = ((i7 + 536870910) - i23) + (i33 >>> 28);
        int i38 = ((i11 + 536870910) - i27) + (i34 >>> 28);
        int i39 = ((i15 + 536870910) - iArr2[14]) + (i35 >>> 28);
        int i40 = ((i4 + 536870910) - i20) + (i36 >>> 28);
        int i41 = ((i8 + 536870910) - i24) + (i37 >>> 28);
        int i42 = ((i12 + 536870910) - i28) + (i38 >>> 28);
        int i43 = ((i16 + 536870910) - iArr2[15]) + (i39 >>> 28);
        int i44 = i43 >>> 28;
        int i45 = i31 + i44;
        int i46 = ((i5 + 536870910) - i21) + (i40 >>> 28);
        int i47 = ((i9 + 536870908) - i25) + i44 + (i41 >>> 28);
        int i48 = ((i13 + 536870910) - i29) + (i42 >>> 28);
        iArr3[0] = i45 & 268435455;
        iArr3[1] = (i32 & 268435455) + (i45 >>> 28);
        iArr3[2] = i36 & 268435455;
        iArr3[3] = i40 & 268435455;
        iArr3[4] = i46 & 268435455;
        iArr3[5] = (i33 & 268435455) + (i46 >>> 28);
        iArr3[6] = i37 & 268435455;
        iArr3[7] = i41 & 268435455;
        iArr3[8] = i47 & 268435455;
        iArr3[9] = (i34 & 268435455) + (i47 >>> 28);
        iArr3[10] = i38 & 268435455;
        iArr3[11] = i42 & 268435455;
        iArr3[12] = i48 & 268435455;
        iArr3[13] = (i35 & 268435455) + (i48 >>> 28);
        iArr3[14] = i39 & 268435455;
        iArr3[15] = i43 & 268435455;
    }

    /* JADX INFO: renamed from: a */
    public static void m3336a(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        m3349d(iArr, iArr3);
        m3341b(iArr3, 2, iArr3);
        m3343b(iArr3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: b */
    public static void m3342b(int[] iArr, int[] iArr2) {
        m3350d(new int[16], iArr, iArr2);
    }

    /* JADX INFO: renamed from: d */
    private static void m3349d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        m3346c(iArr, iArr3);
        m3343b(iArr, iArr3, iArr3);
        int[] iArr4 = new int[16];
        m3346c(iArr3, iArr4);
        m3343b(iArr, iArr4, iArr4);
        int[] iArr5 = new int[16];
        m3341b(iArr4, 3, iArr5);
        m3343b(iArr4, iArr5, iArr5);
        int[] iArr6 = new int[16];
        m3341b(iArr5, 3, iArr6);
        m3343b(iArr4, iArr6, iArr6);
        int[] iArr7 = new int[16];
        m3341b(iArr6, 9, iArr7);
        m3343b(iArr6, iArr7, iArr7);
        int[] iArr8 = new int[16];
        m3346c(iArr7, iArr8);
        m3343b(iArr, iArr8, iArr8);
        int[] iArr9 = new int[16];
        m3341b(iArr8, 18, iArr9);
        m3343b(iArr7, iArr9, iArr9);
        int[] iArr10 = new int[16];
        m3341b(iArr9, 37, iArr10);
        m3343b(iArr9, iArr10, iArr10);
        int[] iArr11 = new int[16];
        m3341b(iArr10, 37, iArr11);
        m3343b(iArr9, iArr11, iArr11);
        int[] iArr12 = new int[16];
        m3341b(iArr11, 111, iArr12);
        m3343b(iArr11, iArr12, iArr12);
        int[] iArr13 = new int[16];
        m3346c(iArr12, iArr13);
        m3343b(iArr, iArr13, iArr13);
        int[] iArr14 = new int[16];
        m3341b(iArr13, 223, iArr14);
        m3343b(iArr14, iArr12, iArr2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3347c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        m3346c(iArr, iArr4);
        m3343b(iArr4, iArr2, iArr4);
        m3346c(iArr4, iArr5);
        m3343b(iArr4, iArr, iArr4);
        m3343b(iArr5, iArr, iArr5);
        m3343b(iArr5, iArr2, iArr5);
        int[] iArr6 = new int[16];
        m3349d(iArr5, iArr6);
        m3343b(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[16];
        m3346c(iArr6, iArr7);
        m3343b(iArr7, iArr2, iArr7);
        m3350d(iArr, iArr7, iArr7);
        m3345c(iArr7);
        if (!m3344b(iArr7)) {
            return false;
        }
        m3337a(iArr6, iArr3, 0);
        return true;
    }
}
