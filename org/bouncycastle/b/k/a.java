package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements org.bouncycastle.b.i {
    private byte[] a;
    private byte[] b;
    private ba c;
    private int d;

    public a(ba baVar, int i, byte[] bArr) {
        this(baVar, i, bArr, null);
    }

    public a(ba baVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = baVar;
        this.b = org.bouncycastle.f.a.b(bArr);
        this.d = i;
        this.a = org.bouncycastle.f.a.b(bArr2);
    }

    public final ba a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final byte[] d() {
        return org.bouncycastle.f.a.b(this.b);
    }
}
