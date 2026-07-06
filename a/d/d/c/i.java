package a.d.d.c;

/* JADX INFO: compiled from: TransWaitNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {
    public i(a.h hVar, String str) {
        super(hVar, (byte) 37, (byte) 83);
        this.G = str;
        this.E = -1;
        this.B = 0;
        this.C = 0;
        this.D = (byte) 0;
        this.F = 2;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = X();
        int i3 = i2 + 1;
        bArr[i2] = 0;
        bArr[i3] = 0;
        bArr[i3 + 1] = 0;
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
        return new String("TransWaitNamedPipe[" + super.toString() + ",pipeName=" + this.G + "]");
    }
}
