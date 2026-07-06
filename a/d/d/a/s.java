package a.d.d.a;

/* JADX INFO: compiled from: SmbComSeekResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class s extends a.d.d.c {
    private long n;

    public s(a.h hVar) {
        super(hVar);
    }

    public final long q() {
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
        this.n = a.d.f.a.b(bArr, i);
        return 4;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }
}
