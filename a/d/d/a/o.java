package a.d.d.a;

import java.util.Date;

/* JADX INFO: compiled from: SmbComQueryInformationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a.d.d.c implements a.d.i {
    private int n;
    private long o;
    private long p;
    private int q;

    public o(a.h hVar, long j) {
        super(hVar, (byte) 8);
        this.n = 0;
        this.o = 0L;
        this.q = 0;
        this.p = j;
    }

    @Override // a.d.i
    public final int b() {
        return this.n;
    }

    @Override // a.d.i
    public final long b_() {
        return this.o + this.p;
    }

    @Override // a.d.i
    public final long d() {
        return this.o + this.p;
    }

    @Override // a.d.i
    public final long e() {
        return this.o + this.p;
    }

    @Override // a.d.i
    public final long c_() {
        return this.q;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        if (this.i == 0) {
            return 0;
        }
        this.n = a.d.f.a.a(bArr, i);
        int i2 = i + 2;
        this.o = a.d.f.a.e(bArr, i2);
        this.q = a.d.f.a.b(bArr, i2 + 4);
        return 20;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    public final String toString() {
        return new String("SmbComQueryInformationResponse[" + super.toString() + ",fileAttributes=0x" + a.i.e.a(this.n, 4) + ",lastWriteTime=" + new Date(this.o) + ",fileSize=" + this.q + "]");
    }
}
