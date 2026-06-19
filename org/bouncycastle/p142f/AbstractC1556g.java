package org.bouncycastle.p142f;

/* JADX INFO: renamed from: org.bouncycastle.f.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1556g {
    /* JADX INFO: renamed from: a */
    public static int m4135a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
    }

    /* JADX INFO: renamed from: a */
    public static void m4136a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    public static void m4137a(long j, byte[] bArr, int i) {
        m4136a((int) (j >>> 32), bArr, i);
        m4136a((int) (4294967295L & j), bArr, i + 4);
    }

    /* JADX INFO: renamed from: a */
    public static void m4138a(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = m4152c(bArr, i);
            i += 4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4139a(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = m4146b(bArr, i);
            i += 8;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4140a(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            m4147b(i2, bArr, i);
            i += 4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4141a(long[] jArr, int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            m4148b(jArr[i3 + 0], bArr, i2);
            i2 += 8;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4142a(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            m4137a(j, bArr, i);
            i += 8;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4143a(int i) {
        byte[] bArr = new byte[4];
        m4136a(i, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4144a(long j) {
        byte[] bArr = new byte[8];
        m4137a(j, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4145a(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        m4150b(jArr, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static long m4146b(byte[] bArr, int i) {
        return (((long) m4135a(bArr, i + 4)) & 4294967295L) | ((((long) m4135a(bArr, i)) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static void m4147b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: b */
    public static void m4148b(long j, byte[] bArr, int i) {
        m4147b((int) (4294967295L & j), bArr, i);
        m4147b((int) (j >>> 32), bArr, i + 4);
    }

    /* JADX INFO: renamed from: b */
    public static void m4149b(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = m4153d(bArr, i);
            i += 8;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4150b(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            m4148b(j, bArr, i);
            i += 8;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4151b(long j) {
        byte[] bArr = new byte[8];
        m4148b(j, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m4152c(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i2 + 1;
        return i3 | ((bArr[i4] & 255) << 16) | (bArr[i4 + 1] << 24);
    }

    /* JADX INFO: renamed from: d */
    public static long m4153d(byte[] bArr, int i) {
        return (((long) m4152c(bArr, i)) & 4294967295L) | ((((long) m4152c(bArr, i + 4)) & 4294967295L) << 32);
    }
}
