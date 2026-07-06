package a.d.f;

/* JADX INFO: compiled from: SMBUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final byte[] a = {-1, 83, 77, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final byte[] b = {-2, 83, 77, 66, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void a(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
    }

    public static void b(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        int i2 = i + 1;
        long j2 = j >> 8;
        bArr[i2] = (byte) j2;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (j2 >> 8);
        bArr[i3 + 1] = (byte) (r2 >> 8);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    public static long c(byte[] bArr, int i) {
        return (((long) b(bArr, i)) & 4294967295L) + (((long) b(bArr, i + 4)) << 32);
    }

    public static void c(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        int i2 = i + 1;
        long j2 = j >> 8;
        bArr[i2] = (byte) j2;
        int i3 = i2 + 1;
        long j3 = j2 >> 8;
        bArr[i3] = (byte) j3;
        int i4 = i3 + 1;
        long j4 = j3 >> 8;
        bArr[i4] = (byte) j4;
        int i5 = i4 + 1;
        long j5 = j4 >> 8;
        bArr[i5] = (byte) j5;
        int i6 = i5 + 1;
        long j6 = j5 >> 8;
        bArr[i6] = (byte) j6;
        int i7 = i6 + 1;
        bArr[i7] = (byte) (j6 >> 8);
        bArr[i7 + 1] = (byte) (r2 >> 8);
    }

    public static long d(byte[] bArr, int i) {
        return (((((long) b(bArr, i)) & 4294967295L) | (((long) b(bArr, i + 4)) << 32)) / 10000) - 11644473600000L;
    }

    public static void d(long j, byte[] bArr, int i) {
        if (j != 0) {
            j = (11644473600000L + j) * 10000;
        }
        c(j, bArr, i);
    }

    public static long e(byte[] bArr, int i) {
        return (((long) b(bArr, i)) & 4294967295L) * 1000;
    }
}
