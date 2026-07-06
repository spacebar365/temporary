package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class ay implements org.bouncycastle.b.q {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;

    public ay(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = new byte[0];
        this.c = org.bouncycastle.f.a.b(bArr2);
        this.d = 32;
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.c);
    }

    public final int d() {
        return this.d;
    }
}
