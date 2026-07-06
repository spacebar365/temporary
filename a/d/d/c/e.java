package a.d.d.c;

/* JADX INFO: compiled from: TransPeekNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    private int n;

    public e(a.h hVar, String str, int i) {
        super(hVar, (byte) 37, (byte) 35);
        this.G = str;
        this.n = i;
        this.E = -1;
        this.B = 6;
        this.C = 1;
        this.D = (byte) 0;
        this.F = 2;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = X();
        bArr[i2] = 0;
        a.d.f.a.a(this.n, bArr, i2 + 1);
        return 4;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("TransPeekNamedPipe[" + super.toString() + ",pipeName=" + this.G + "]");
    }
}
