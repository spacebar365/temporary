package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public class av implements org.bouncycastle.b.i {
    private byte[] a;
    private byte[] b;
    private int c;

    public av(byte[] bArr, byte[] bArr2, int i) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = org.bouncycastle.f.a.b(bArr2);
        this.c = i;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final int c() {
        return this.c;
    }
}
