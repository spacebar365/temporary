package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements org.bouncycastle.b.r {
    private n$a a = new n$a((byte) 0);

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "NULL";
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        this.a.write(b);
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return this.a.size();
    }

    @Override // org.bouncycastle.b.r
    public final void c() {
        this.a.reset();
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        int size = this.a.size();
        this.a.a(bArr, i);
        this.a.reset();
        return size;
    }
}
