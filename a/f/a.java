package a.f;

/* JADX INFO: compiled from: NtlmMessage.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected static final byte[] a = {78, 84, 76, 77, 83, 83, 80, 0};
    protected static final byte[] b = {6, 1, 0, 0, 0, 0, 0, 15};
    private int c;

    public final int a() {
        return this.c;
    }

    public final void a(int i) {
        this.c = i;
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    private static void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
    }

    static int a(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return i + 4;
        }
        b(bArr, i, length);
        b(bArr, i + 2, length);
        return i + 4;
    }

    static int a(byte[] bArr, int i, int i2, byte[] bArr2) {
        a(bArr, i2, i);
        if (bArr2 == null || bArr2.length <= 0) {
            return 0;
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        return bArr2.length;
    }

    public final boolean b(int i) {
        return (this.c & i) != 0;
    }

    public final void b() {
        this.c |= 8388608;
    }

    static byte[] b(byte[] bArr, int i) {
        int i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, a(bArr, i + 4), bArr2, 0, i2);
        return bArr2;
    }
}
