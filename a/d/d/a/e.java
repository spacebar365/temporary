package a.d.d.a;

/* JADX INFO: compiled from: SmbComFindClose2.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a.d.d.c {
    private int n;

    public e(a.h hVar, int i) {
        super(hVar, (byte) 52);
        this.n = i;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        return 2;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    public final String toString() {
        return new String("SmbComFindClose2[" + super.toString() + ",sid=" + this.n + "]");
    }
}
