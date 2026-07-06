package org.bouncycastle.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
    }

    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void a(long j, byte[] bArr, int i) {
        a((int) (j >>> 32), bArr, i);
        a((int) (4294967295L & j), bArr, i + 4);
    }

    public static void a(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = c(bArr, i);
            i += 4;
        }
    }

    public static void a(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = b(bArr, i);
            i += 8;
        }
    }

    public static void a(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            b(i2, bArr, i);
            i += 4;
        }
    }

    public static void a(long[] jArr, int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            b(jArr[i3 + 0], bArr, i2);
            i2 += 8;
        }
    }

    public static void a(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            a(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[4];
        a(i, bArr, 0);
        return bArr;
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        a(j, bArr, 0);
        return bArr;
    }

    public static byte[] a(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        b(jArr, bArr, 0);
        return bArr;
    }

    public static long b(byte[] bArr, int i) {
        return (((long) a(bArr, i + 4)) & 4294967295L) | ((((long) a(bArr, i)) & 4294967295L) << 32);
    }

    public static void b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void b(long j, byte[] bArr, int i) {
        b((int) (4294967295L & j), bArr, i);
        b((int) (j >>> 32), bArr, i + 4);
    }

    public static void b(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = d(bArr, i);
            i += 8;
        }
    }

    public static void b(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            b(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] b(long j) {
        byte[] bArr = new byte[8];
        b(j, bArr, 0);
        return bArr;
    }

    public static int c(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    public static long d(byte[] bArr, int i) {
        return (((long) c(bArr, i)) & 4294967295L) | ((((long) c(bArr, i + 4)) & 4294967295L) << 32);
    }
}
