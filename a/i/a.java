package a.i;

import a.n;

/* JADX INFO: compiled from: ByteEncodable.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    private byte[] a;
    private int b;
    private int c;

    public a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // a.n
    public final int a() {
        return this.c;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        System.arraycopy(this.a, this.b, bArr, i, this.c);
        return this.c;
    }
}
