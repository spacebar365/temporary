package a.d.d.a;

/* JADX INFO: compiled from: LockingAndXRange.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a.j, a.n {
    private final boolean a;
    private int b;
    private long c;
    private long d;

    public a(boolean z) {
        this.a = z;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        if (this.a) {
            this.b = a.d.f.a.a(bArr, i);
            this.c = (a.d.f.a.b(bArr, i + 4) << 32) | a.d.f.a.b(bArr, i + 8);
            this.d = (a.d.f.a.b(bArr, i + 12) << 32) | a.d.f.a.b(bArr, i + 16);
            return 20;
        }
        this.b = a.d.f.a.a(bArr, i);
        this.c = a.d.f.a.b(bArr, i + 2);
        this.d = a.d.f.a.b(bArr, i + 6);
        return 10;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        if (this.a) {
            a.d.f.a.a(this.b, bArr, i);
            a.d.f.a.b(this.c >> 32, bArr, i + 4);
            a.d.f.a.b(this.c & (-1), bArr, i + 8);
            a.d.f.a.b(this.d >> 32, bArr, i + 12);
            a.d.f.a.b(this.d & (-1), bArr, i + 16);
            return 20;
        }
        a.d.f.a.a(this.b, bArr, i);
        a.d.f.a.b(this.c, bArr, i + 2);
        a.d.f.a.b(this.d, bArr, i + 6);
        return 10;
    }

    @Override // a.n
    public final int a() {
        return this.a ? 20 : 10;
    }
}
