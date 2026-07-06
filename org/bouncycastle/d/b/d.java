package org.bouncycastle.d.b;

/* JADX INFO: loaded from: classes.dex */
final class d implements f {
    protected final int[] a;

    d(int[] iArr) {
        this.a = org.bouncycastle.f.a.c(iArr);
    }

    @Override // org.bouncycastle.d.b.f
    public final int a() {
        return this.a[this.a.length - 1];
    }

    @Override // org.bouncycastle.d.b.f
    public final int[] b() {
        return org.bouncycastle.f.a.c(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return org.bouncycastle.f.a.a(this.a, ((d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return org.bouncycastle.f.a.b(this.a);
    }
}
