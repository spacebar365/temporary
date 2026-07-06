package a.d.d.a;

/* JADX INFO: compiled from: SmbComQueryInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a.d.d.c {
    public n(a.h hVar, String str) {
        super(hVar, (byte) 8, str);
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + a(this.l, bArr, i2)) - i;
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
        return new String("SmbComQueryInformation[" + super.toString() + ",filename=" + this.l + "]");
    }
}
