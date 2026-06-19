package p000a.p031i;

/* JADX INFO: renamed from: a.i.c */
/* JADX INFO: compiled from: Encdec.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0282c {
    /* JADX INFO: renamed from: a */
    public static int m940a(int i, byte[] bArr) {
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return 4;
    }

    /* JADX INFO: renamed from: a */
    public static int m942a(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public static int m941a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        bArr[i4] = (byte) ((i >> 16) & 255);
        bArr[i4 + 1] = (byte) ((i >> 24) & 255);
        return 4;
    }

    /* JADX INFO: renamed from: a */
    public static short m943a(byte[] bArr) {
        return (short) (((bArr[2] & 255) << 8) | (bArr[3] & 255));
    }

    /* JADX INFO: renamed from: a */
    public static short m944a(byte[] bArr, int i) {
        return (short) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
    }

    /* JADX INFO: renamed from: b */
    public static int m945b(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: b */
    public static long m946b(byte[] bArr) {
        return ((((long) m945b(bArr, 32)) & 4294967295L) << 32) | (((long) m945b(bArr, 28)) & 4294967295L);
    }
}
