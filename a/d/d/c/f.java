package a.d.d.c;

/* JADX INFO: compiled from: TransPeekNamedPipeResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    private int C;

    public f(a.h hVar) {
        super(hVar);
    }

    public final int q() {
        return this.C;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        this.C = a.d.f.a.a(bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(bArr, i2);
        j(a.d.f.a.a(bArr, i2 + 2));
        return 6;
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public final String toString() {
        return new String("TransPeekNamedPipeResponse[" + super.toString() + "]");
    }
}
