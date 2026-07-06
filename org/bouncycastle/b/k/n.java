package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    private byte[] a;
    private int b;

    public n(byte[] bArr, int i) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.b == this.b) {
            return org.bouncycastle.f.a.a(this.a, nVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ org.bouncycastle.f.a.a(this.a);
    }
}
