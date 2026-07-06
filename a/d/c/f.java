package a.d.c;

/* JADX INFO: compiled from: FileFsSizeInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a.d.a {
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
        this.a = a.d.f.a.c(bArr, i);
        int i3 = i + 8;
        this.b = a.d.f.a.c(bArr, i3);
        int i4 = i3 + 8;
        this.c = a.d.f.a.b(bArr, i4);
        int i5 = i4 + 4;
        this.d = a.d.f.a.b(bArr, i5);
        return (i5 + 4) - i;
    }

    public final String toString() {
        return new String("SmbInfoAllocation[alloc=" + this.a + ",free=" + this.b + ",sectPerAlloc=" + this.c + ",bytesPerSect=" + this.d + "]");
    }
}
