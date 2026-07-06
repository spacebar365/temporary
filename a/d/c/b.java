package a.d.c;

import java.util.Date;

/* JADX INFO: compiled from: FileBasicInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    private long a;
    private long b;
    private long c;
    private long d;
    private int e;

    @Override // a.d.c.g
    public final byte g() {
        return (byte) 4;
    }

    @Override // a.d.i
    public final int b() {
        return this.e;
    }

    @Override // a.d.i
    public final long b_() {
        return this.a;
    }

    @Override // a.d.i
    public final long d() {
        return this.c;
    }

    @Override // a.d.i
    public final long e() {
        return this.b;
    }

    @Override // a.d.i
    public final long c_() {
        return 0L;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.d(bArr, i);
        int i3 = i + 8;
        this.b = a.d.f.a.d(bArr, i3);
        int i4 = i3 + 8;
        this.c = a.d.f.a.d(bArr, i4);
        int i5 = i4 + 8;
        this.d = a.d.f.a.d(bArr, i5);
        int i6 = i5 + 8;
        this.e = a.d.f.a.b(bArr, i6);
        return (i6 + 4) - i;
    }

    @Override // a.n
    public final int a() {
        return 40;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.d(this.a, bArr, i);
        int i2 = i + 8;
        a.d.f.a.d(this.b, bArr, i2);
        int i3 = i2 + 8;
        a.d.f.a.d(this.c, bArr, i3);
        int i4 = i3 + 8;
        a.d.f.a.d(this.d, bArr, i4);
        int i5 = i4 + 8;
        a.d.f.a.b(this.e, bArr, i5);
        return ((i5 + 4) + 4) - i;
    }

    public final String toString() {
        return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.a) + ",lastAccessTime=" + new Date(this.b) + ",lastWriteTime=" + new Date(this.c) + ",changeTime=" + new Date(this.d) + ",attributes=0x" + a.i.e.a(this.e, 4) + "]");
    }
}
