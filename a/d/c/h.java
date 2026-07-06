package a.d.c;

/* JADX INFO: compiled from: FileInternalInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {
    private long a;

    @Override // a.d.c.g
    public final byte g() {
        return (byte) 6;
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
        return new String("SmbQueryFileInternalInfo[indexNumber=" + this.a + "]");
    }
}
