package a.d.c;

/* JADX INFO: compiled from: FileStandardInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements a {
    private long a;
    private long b;
    private int c;
    private boolean d;
    private boolean e;

    @Override // a.d.c.g
    public final byte g() {
        return (byte) 5;
    }

    @Override // a.d.i
    public final int b() {
        return 0;
    }

    @Override // a.d.i
    public final long b_() {
        return 0L;
    }

    @Override // a.d.i
    public final long d() {
        return 0L;
    }

    @Override // a.d.i
    public final long e() {
        return 0L;
    }

    @Override // a.d.i
    public final long c_() {
        return this.b;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.c(bArr, i);
        int i3 = i + 8;
        this.b = a.d.f.a.c(bArr, i3);
        int i4 = i3 + 8;
        this.c = a.d.f.a.b(bArr, i4);
        int i5 = i4 + 4;
        int i6 = i5 + 1;
        this.d = (bArr[i5] & 255) > 0;
        int i7 = i6 + 1;
        this.e = (bArr[i6] & 255) > 0;
        return i7 - i;
    }

    @Override // a.n
    public final int a() {
        return 22;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.c(this.a, bArr, i);
        int i2 = i + 8;
        a.d.f.a.c(this.b, bArr, i2);
        int i3 = i2 + 8;
        a.d.f.a.b(this.c, bArr, i3);
        int i4 = i3 + 4;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (this.d ? 1 : 0);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (this.e ? 1 : 0);
        return i6 - i;
    }

    public final String toString() {
        return new String("SmbQueryInfoStandard[allocationSize=" + this.a + ",endOfFile=" + this.b + ",numberOfLinks=" + this.c + ",deletePending=" + this.d + ",directory=" + this.e + "]");
    }
}
