package a.d.c;

/* JADX INFO: compiled from: SmbInfoAllocation.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a.d.a {
    private long a;
    private long b;
    private int c;
    private int d;

    @Override // a.d.a
    public final long a() {
        return this.a * ((long) this.c) * ((long) this.d);
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = i + 4;
        this.c = a.d.f.a.b(bArr, i3);
        this.a = a.d.f.a.b(bArr, r0);
        this.b = a.d.f.a.b(bArr, r0);
        int i4 = i3 + 4 + 4 + 4;
        this.d = a.d.f.a.a(bArr, i4);
        return (i4 + 4) - i;
    }

    public final String toString() {
        return new String("SmbInfoAllocation[alloc=" + this.a + ",free=" + this.b + ",sectPerAlloc=" + this.c + ",bytesPerSect=" + this.d + "]");
    }
}
