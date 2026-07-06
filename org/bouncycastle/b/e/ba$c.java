package org.bouncycastle.b.e;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public final class ba$c extends ba$d {
    protected ba$c(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    @Override // org.bouncycastle.b.e.ba$d
    public final void a(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.b;
        long[] jArr4 = this.a;
        int[] iArrF = ba.f();
        int[] iArrE = ba.e();
        if (jArr3.length != 17) {
            throw new IllegalArgumentException();
        }
        if (jArr4.length != 5) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j + jArr3[0];
        long j10 = j2 + jArr3[1];
        long j11 = j3 + jArr3[2];
        long j12 = j4 + jArr3[3];
        long j13 = j5 + jArr3[4];
        long j14 = j6 + jArr3[5] + jArr4[0];
        long j15 = j7 + jArr3[6] + jArr4[1];
        long j16 = jArr3[7] + j8;
        for (int i = 1; i < 18; i += 2) {
            int i2 = iArrF[i];
            int i3 = iArrE[i];
            long j17 = j9 + j10;
            long jA = ba.a(j10, 46, j17);
            long j18 = j11 + j12;
            long jA2 = ba.a(j12, 36, j18);
            long j19 = j13 + j14;
            long jA3 = ba.a(j14, 19, j19);
            long j20 = j15 + j16;
            long jA4 = ba.a(j16, 37, j20);
            long j21 = j18 + jA;
            long jA5 = ba.a(jA, 33, j21);
            long j22 = j19 + jA4;
            long jA6 = ba.a(jA4, 27, j22);
            long j23 = j20 + jA3;
            long jA7 = ba.a(jA3, 14, j23);
            long j24 = j17 + jA2;
            long jA8 = ba.a(jA2, 42, j24);
            long j25 = j22 + jA5;
            long jA9 = ba.a(jA5, 17, j25);
            long j26 = j23 + jA8;
            long jA10 = ba.a(jA8, 49, j26);
            long j27 = j24 + jA7;
            long jA11 = ba.a(jA7, 36, j27);
            long j28 = j21 + jA6;
            long jA12 = ba.a(jA6, 39, j28);
            long j29 = j26 + jA9;
            long jA13 = ba.a(jA9, 44, j29);
            long j30 = j27 + jA12;
            long jA14 = ba.a(jA12, 9, j30);
            long j31 = j28 + jA11;
            long jA15 = ba.a(jA11, 54, j31);
            long j32 = j25 + jA10;
            long jA16 = ba.a(jA10, 56, j32);
            long j33 = j30 + jArr3[i2];
            long j34 = jA13 + jArr3[i2 + 1];
            long j35 = j31 + jArr3[i2 + 2];
            long j36 = jA16 + jArr3[i2 + 3];
            long j37 = j32 + jArr3[i2 + 4];
            long j38 = jA15 + jArr3[i2 + 5] + jArr4[i3];
            long j39 = j29 + jArr3[i2 + 6] + jArr4[i3 + 1];
            long j40 = jA14 + jArr3[i2 + 7] + ((long) i);
            long j41 = j33 + j34;
            long jA17 = ba.a(j34, 39, j41);
            long j42 = j35 + j36;
            long jA18 = ba.a(j36, 30, j42);
            long j43 = j37 + j38;
            long jA19 = ba.a(j38, 34, j43);
            long j44 = j39 + j40;
            long jA20 = ba.a(j40, 24, j44);
            long j45 = j42 + jA17;
            long jA21 = ba.a(jA17, 13, j45);
            long j46 = j43 + jA20;
            long jA22 = ba.a(jA20, 50, j46);
            long j47 = j44 + jA19;
            long jA23 = ba.a(jA19, 10, j47);
            long j48 = j41 + jA18;
            long jA24 = ba.a(jA18, 17, j48);
            long j49 = j46 + jA21;
            long jA25 = ba.a(jA21, 25, j49);
            long j50 = j47 + jA24;
            long jA26 = ba.a(jA24, 29, j50);
            long j51 = j48 + jA23;
            long jA27 = ba.a(jA23, 39, j51);
            long j52 = j45 + jA22;
            long jA28 = ba.a(jA22, 43, j52);
            long j53 = j50 + jA25;
            long jA29 = ba.a(jA25, 8, j53);
            long j54 = j51 + jA28;
            long jA30 = ba.a(jA28, 35, j54);
            long j55 = j52 + jA27;
            long jA31 = ba.a(jA27, 56, j55);
            long j56 = j49 + jA26;
            long jA32 = ba.a(jA26, 22, j56);
            j9 = j54 + jArr3[i2 + 1];
            j10 = jA29 + jArr3[i2 + 2];
            j11 = j55 + jArr3[i2 + 3];
            j12 = jA32 + jArr3[i2 + 4];
            j13 = j56 + jArr3[i2 + 5];
            j14 = jA31 + jArr3[i2 + 6] + jArr4[i3 + 1];
            j15 = j53 + jArr4[i3 + 2] + jArr3[i2 + 7];
            j16 = jA30 + jArr3[i2 + 8] + ((long) i) + 1;
        }
        jArr2[0] = j9;
        jArr2[1] = j10;
        jArr2[2] = j11;
        jArr2[3] = j12;
        jArr2[4] = j13;
        jArr2[5] = j14;
        jArr2[6] = j15;
        jArr2[7] = j16;
    }

    @Override // org.bouncycastle.b.e.ba$d
    public final void b(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.b;
        long[] jArr4 = this.a;
        int[] iArrF = ba.f();
        int[] iArrE = ba.e();
        if (jArr3.length != 17) {
            throw new IllegalArgumentException();
        }
        if (jArr4.length != 5) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        long jB = jArr[1];
        long j2 = jArr[2];
        long jB2 = jArr[3];
        long j3 = jArr[4];
        long jB3 = jArr[5];
        long j4 = jArr[6];
        long jB4 = jArr[7];
        for (int i = 17; i > 0; i -= 2) {
            int i2 = iArrF[i];
            int i3 = iArrE[i];
            long j5 = j - jArr3[i2 + 1];
            long j6 = jB - jArr3[i2 + 2];
            long j7 = j2 - jArr3[i2 + 3];
            long j8 = jB2 - jArr3[i2 + 4];
            long j9 = j3 - jArr3[i2 + 5];
            long j10 = jB3 - (jArr3[i2 + 6] + jArr4[i3 + 1]);
            long j11 = j4 - (jArr3[i2 + 7] + jArr4[i3 + 2]);
            long j12 = jB4 - ((jArr3[i2 + 8] + ((long) i)) + 1);
            long jB5 = ba.b(j6, 8, j11);
            long j13 = j11 - jB5;
            long jB6 = ba.b(j12, 35, j5);
            long j14 = j5 - jB6;
            long jB7 = ba.b(j10, 56, j7);
            long j15 = j7 - jB7;
            long jB8 = ba.b(j8, 22, j9);
            long j16 = j9 - jB8;
            long jB9 = ba.b(jB5, 25, j16);
            long j17 = j16 - jB9;
            long jB10 = ba.b(jB8, 29, j13);
            long j18 = j13 - jB10;
            long jB11 = ba.b(jB7, 39, j14);
            long j19 = j14 - jB11;
            long jB12 = ba.b(jB6, 43, j15);
            long j20 = j15 - jB12;
            long jB13 = ba.b(jB9, 13, j20);
            long j21 = j20 - jB13;
            long jB14 = ba.b(jB12, 50, j17);
            long j22 = j17 - jB14;
            long jB15 = ba.b(jB11, 10, j18);
            long j23 = j18 - jB15;
            long jB16 = ba.b(jB10, 17, j19);
            long j24 = j19 - jB16;
            long jB17 = ba.b(jB13, 39, j24);
            long jB18 = ba.b(jB16, 30, j21);
            long jB19 = ba.b(jB15, 34, j22);
            long jB20 = ba.b(jB14, 24, j23);
            long j25 = (j24 - jB17) - jArr3[i2];
            long j26 = jB17 - jArr3[i2 + 1];
            long j27 = (j21 - jB18) - jArr3[i2 + 2];
            long j28 = jB18 - jArr3[i2 + 3];
            long j29 = (j22 - jB19) - jArr3[i2 + 4];
            long j30 = jB19 - (jArr3[i2 + 5] + jArr4[i3]);
            long j31 = (j23 - jB20) - (jArr4[i3 + 1] + jArr3[i2 + 6]);
            long j32 = jB20 - (jArr3[i2 + 7] + ((long) i));
            long jB21 = ba.b(j26, 44, j31);
            long j33 = j31 - jB21;
            long jB22 = ba.b(j32, 9, j25);
            long j34 = j25 - jB22;
            long jB23 = ba.b(j30, 54, j27);
            long j35 = j27 - jB23;
            long jB24 = ba.b(j28, 56, j29);
            long j36 = j29 - jB24;
            long jB25 = ba.b(jB21, 17, j36);
            long j37 = j36 - jB25;
            long jB26 = ba.b(jB24, 49, j33);
            long j38 = j33 - jB26;
            long jB27 = ba.b(jB23, 36, j34);
            long j39 = j34 - jB27;
            long jB28 = ba.b(jB22, 39, j35);
            long j40 = j35 - jB28;
            long jB29 = ba.b(jB25, 33, j40);
            long j41 = j40 - jB29;
            long jB30 = ba.b(jB28, 27, j37);
            long j42 = j37 - jB30;
            long jB31 = ba.b(jB27, 14, j38);
            long j43 = j38 - jB31;
            long jB32 = ba.b(jB26, 42, j39);
            long j44 = j39 - jB32;
            jB = ba.b(jB29, 46, j44);
            j = j44 - jB;
            jB2 = ba.b(jB32, 36, j41);
            j2 = j41 - jB2;
            jB3 = ba.b(jB31, 19, j42);
            j3 = j42 - jB3;
            jB4 = ba.b(jB30, 37, j43);
            j4 = j43 - jB4;
        }
        long j45 = j - jArr3[0];
        long j46 = jB - jArr3[1];
        long j47 = j2 - jArr3[2];
        long j48 = jB2 - jArr3[3];
        long j49 = j3 - jArr3[4];
        long j50 = jB3 - (jArr3[5] + jArr4[0]);
        long j51 = j4 - (jArr4[1] + jArr3[6]);
        long j52 = jB4 - jArr3[7];
        jArr2[0] = j45;
        jArr2[1] = j46;
        jArr2[2] = j47;
        jArr2[3] = j48;
        jArr2[4] = j49;
        jArr2[5] = j50;
        jArr2[6] = j51;
        jArr2[7] = j52;
    }
}
