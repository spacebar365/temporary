package org.bouncycastle.b.i.a;

import org.bouncycastle.f.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i = i4 + 1;
        } while (i < 16);
    }

    public static void a(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i4 + 1;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 = i5 + 1;
        } while (i2 < 16);
    }

    public static void a(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            }
        }
    }

    public static void a(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        int i3 = 0;
        do {
            bArr3[i2 + i3] = (byte) (bArr[i3 + 0] ^ bArr2[i + i3]);
            int i4 = i3 + 1;
            bArr3[i2 + i4] = (byte) (bArr[i4 + 0] ^ bArr2[i + i4]);
            int i5 = i4 + 1;
            bArr3[i2 + i5] = (byte) (bArr[i5 + 0] ^ bArr2[i + i5]);
            int i6 = i5 + 1;
            bArr3[i2 + i6] = (byte) (bArr[i6 + 0] ^ bArr2[i + i6]);
            i3 = i6 + 1;
        } while (i3 < 16);
    }

    public static void a(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        for (int i = 0; i < 64; i++) {
            long j8 = j >> 63;
            j <<= 1;
            j5 ^= j3 & j8;
            long j9 = j6 ^ (j8 & j4);
            long j10 = j2 >> 63;
            j2 <<= 1;
            j6 = j9 ^ (j3 & j10);
            j7 ^= j10 & j4;
            long j11 = (j4 << 63) >> 8;
            j4 = (j4 >>> 1) | (j3 << 63);
            j3 = (j3 >>> 1) ^ (j11 & (-2233785415175766016L));
        }
        jArr[0] = j5 ^ ((((j7 >>> 1) ^ j7) ^ (j7 >>> 2)) ^ (j7 >>> 7));
        jArr[1] = ((j7 << 57) ^ ((j7 << 63) ^ (j7 << 62))) ^ j6;
    }

    public static long[] a(byte[] bArr) {
        long[] jArr = new long[2];
        g.a(bArr, 0, jArr);
        return jArr;
    }

    public static void b(byte[] bArr, byte[] bArr2, int i) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            int i2 = i + 0;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + 0]);
        }
    }
}
