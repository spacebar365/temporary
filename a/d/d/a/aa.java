package a.d.d.a;

/* JADX INFO: compiled from: SmbComWriteAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class aa extends a.d.d.a {
    private long n;

    public aa(a.h hVar) {
        super(hVar);
    }

    public final long W() {
        return this.n;
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
        this.n = ((long) a.d.f.a.a(bArr, i)) & 65535;
        return 8;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComWriteAndXResponse[" + super.toString() + ",count=" + this.n + "]");
    }
}
