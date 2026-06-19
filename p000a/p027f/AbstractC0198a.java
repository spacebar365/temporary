package p000a.p027f;

/* JADX INFO: renamed from: a.f.a */
/* JADX INFO: compiled from: NtlmMessage.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0198a {

    /* JADX INFO: renamed from: a */
    protected static final byte[] f919a = {78, 84, 76, 77, 83, 83, 80, 0};

    /* JADX INFO: renamed from: b */
    protected static final byte[] f920b = {6, 1, 0, 0, 0, 0, 0, 15};

    /* JADX INFO: renamed from: c */
    private int f921c;

    /* JADX INFO: renamed from: a */
    public final int m580a() {
        return this.f921c;
    }

    /* JADX INFO: renamed from: a */
    public final void m581a(int i) {
        this.f921c = i;
    }

    /* JADX INFO: renamed from: a */
    static int m574a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    static void m577a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX INFO: renamed from: b */
    private static void m578b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
    }

    /* JADX INFO: renamed from: a */
    static int m576a(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return i + 4;
        }
        m578b(bArr, i, length);
        m578b(bArr, i + 2, length);
        return i + 4;
    }

    /* JADX INFO: renamed from: a */
    static int m575a(byte[] bArr, int i, int i2, byte[] bArr2) {
        m577a(bArr, i2, i);
        if (bArr2 == null || bArr2.length <= 0) {
            return 0;
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        return bArr2.length;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m583b(int i) {
        return (this.f921c & i) != 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m582b() {
        this.f921c |= 8388608;
    }

    /* JADX INFO: renamed from: b */
    static byte[] m579b(byte[] bArr, int i) {
        int i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, m574a(bArr, i + 4), bArr2, 0, i2);
        return bArr2;
    }
}
