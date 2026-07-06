package a.d.c;

import a.n;

/* JADX INFO: compiled from: FileEndOfFileInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g, n {
    private long a;

    public d() {
    }

    @Override // a.d.c.g
    public final byte g() {
        return (byte) 20;
    }

    public d(byte b) {
        this.a = 0L;
    }

    @Override // a.j
    public final int a(byte[] bArr, int i, int i2) {
        this.a = a.d.f.a.c(bArr, i);
        return 8;
    }

    @Override // a.n
    public final int a() {
        return 8;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.c(this.a, bArr, i);
        return 8;
    }

    public final String toString() {
        return new String("EndOfFileInformation[endOfFile=" + this.a + "]");
    }
}
