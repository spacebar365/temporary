package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private int a;
    private byte[] b;
    private int c;

    public u(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public u(byte[] bArr, int i, int i2) {
        this.b = org.bouncycastle.f.a.b(bArr);
        this.c = i;
        this.a = i2;
    }

    public final int a() {
        return this.c;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.c == this.c) {
            return org.bouncycastle.f.a.a(this.b, uVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ org.bouncycastle.f.a.a(this.b);
    }
}
