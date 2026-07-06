package a.d.d.c;

/* JADX INFO: compiled from: TransCallNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    private static final org.c.b n = org.c.c.a((Class<?>) c.class);
    private byte[] o;
    private int p;
    private int q;

    public c(a.h hVar, String str, byte[] bArr, int i, int i2) {
        super(hVar, (byte) 37, (byte) 84);
        this.G = str;
        this.o = bArr;
        this.p = i;
        this.q = i2;
        this.E = -1;
        this.B = 0;
        this.C = 65535;
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
        if (bArr.length - i < this.q) {
            n.b("TransCallNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.o, this.p, bArr, i, this.q);
        return this.q;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public String toString() {
        return new String("TransCallNamedPipe[" + super.toString() + ",pipeName=" + this.G + "]");
    }
}
