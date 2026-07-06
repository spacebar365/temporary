package org.bouncycastle.b.e;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public final class ba$b extends ba$d {
    public ba$b(long[] jArr, long[] jArr2) {
        super(jArr, jArr2);
    }

    @Override // org.bouncycastle.b.e.ba$d
    final void a(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.b;
        long[] jArr4 = this.a;
        int[] iArrD = ba.d();
        int[] iArrE = ba.e();
        if (jArr3.length != 9) {
            throw new IllegalArgumentException();
        }
        if (jArr4.length != 5) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j + jArr3[0];
        long j6 = j2 + jArr3[1] + jArr4[0];
        long j7 = j3 + jArr3[2] + jArr4[1];
        long j8 = jArr3[3] + j4;
        for (int i = 1; i < 18; i += 2) {
            int i2 = iArrD[i];
            int i3 = iArrE[i];
            long j9 = j5 + j6;
            long jA = ba.a(j6, 14, j9);
            long j10 = j7 + j8;
            long jA2 = ba.a(j8, 16, j10);
            long j11 = j9 + jA2;
            long jA3 = ba.a(jA2, 52, j11);
            long j12 = j10 + jA;
            long jA4 = ba.a(jA, 57, j12);
            long j13 = j11 + jA4;
            long jA5 = ba.a(jA4, 23, j13);
            long j14 = j12 + jA3;
            long jA6 = ba.a(jA3, 40, j14);
            long j15 = j13 + jA6;
            long jA7 = ba.a(jA6, 5, j15);
            long j16 = j14 + jA5;
            long jA8 = ba.a(jA5, 37, j16);
            long j17 = j15 + jArr3[i2];
            long j18 = jA8 + jArr3[i2 + 1] + jArr4[i3];
            long j19 = j16 + jArr3[i2 + 2] + jArr4[i3 + 1];
            long j20 = jA7 + jArr3[i2 + 3] + ((long) i);
            long j21 = j17 + j18;
            long jA9 = ba.a(j18, 25, j21);
            long j22 = j19 + j20;
            long jA10 = ba.a(j20, 33, j22);
            long j23 = j21 + jA10;
            long jA11 = ba.a(jA10, 46, j23);
            long j24 = j22 + jA9;
            long jA12 = ba.a(jA9, 12, j24);
            long j25 = j23 + jA12;
            long jA13 = ba.a(jA12, 58, j25);
            long j26 = j24 + jA11;
            long jA14 = ba.a(jA11, 22, j26);
            long j27 = j25 + jA14;
            long jA15 = ba.a(jA14, 32, j27);
            long j28 = j26 + jA13;
            long jA16 = ba.a(jA13, 32, j28);
            j5 = j27 + jArr3[i2 + 1];
            j6 = jA16 + jArr3[i2 + 2] + jArr4[i3 + 1];
            j7 = j28 + jArr4[i3 + 2] + jArr3[i2 + 3];
            j8 = jA15 + jArr3[i2 + 4] + ((long) i) + 1;
        }
        jArr2[0] = j5;
        jArr2[1] = j6;
        jArr2[2] = j7;
        jArr2[3] = j8;
    }

    @Override // org.bouncycastle.b.e.ba$d
    final void b(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.b;
        long[] jArr4 = this.a;
        int[] iArrD = ba.d();
        int[] iArrE = ba.e();
        if (jArr3.length != 9) {
            throw new IllegalArgumentException();
        }
        if (jArr4.length != 5) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        long jB = jArr[1];
        long j2 = jArr[2];
        long jB2 = jArr[3];
        for (int i = 17; i > 0; i -= 2) {
            int i2 = iArrD[i];
            int i3 = iArrE[i];
            long j3 = j - jArr3[i2 + 1];
            long j4 = jB - (jArr3[i2 + 2] + jArr4[i3 + 1]);
            long j5 = j2 - (jArr3[i2 + 3] + jArr4[i3 + 2]);
            long jB3 = ba.b(jB2 - ((jArr3[i2 + 4] + ((long) i)) + 1), 32, j3);
            long j6 = j3 - jB3;
            long jB4 = ba.b(j4, 32, j5);
            long j7 = j5 - jB4;
            long jB5 = ba.b(jB4, 58, j6);
            long j8 = j6 - jB5;
            long jB6 = ba.b(jB3, 22, j7);
            long j9 = j7 - jB6;
            long jB7 = ba.b(jB6, 46, j8);
            long j10 = j8 - jB7;
            long jB8 = ba.b(jB5, 12, j9);
            long j11 = j9 - jB8;
            long jB9 = ba.b(jB8, 25, j10);
            long jB10 = ba.b(jB7, 33, j11);
            long j12 = (j10 - jB9) - jArr3[i2];
            long j13 = jB9 - (jArr3[i2 + 1] + jArr4[i3]);
            long j14 = (j11 - jB10) - (jArr4[i3 + 1] + jArr3[i2 + 2]);
            long jB11 = ba.b(jB10 - (jArr3[i2 + 3] + ((long) i)), 5, j12);
            long j15 = j12 - jB11;
            long jB12 = ba.b(j13, 37, j14);
            long j16 = j14 - jB12;
            long jB13 = ba.b(jB12, 23, j15);
            long j17 = j15 - jB13;
            long jB14 = ba.b(jB11, 40, j16);
            long j18 = j16 - jB14;
            long jB15 = ba.b(jB14, 52, j17);
            long j19 = j17 - jB15;
            long jB16 = ba.b(jB13, 57, j18);
            long j20 = j18 - jB16;
            jB = ba.b(jB16, 14, j19);
            j = j19 - jB;
            jB2 = ba.b(jB15, 16, j20);
            j2 = j20 - jB2;
        }
        long j21 = j - jArr3[0];
        long j22 = jB - (jArr3[1] + jArr4[0]);
        long j23 = j2 - (jArr4[1] + jArr3[2]);
        long j24 = jB2 - jArr3[3];
        jArr2[0] = j21;
        jArr2[1] = j22;
        jArr2[2] = j23;
        jArr2[3] = j24;
    }
}
