package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class bo extends u implements aa {
    private final byte[] a;

    public bo(String str) {
        this.a = org.bouncycastle.f.k.a(str);
    }

    bo(byte[] bArr) {
        this.a = bArr;
    }

    public static bo a(Object obj) {
        if (obj == null || (obj instanceof bo)) {
            return (bo) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(12, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof bo) {
            return org.bouncycastle.f.a.a(this.a, ((bo) uVar).a);
        }
        return false;
    }

    @Override // org.bouncycastle.a.aa
    public final String b() {
        return org.bouncycastle.f.k.a(this.a);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length) + 1 + this.a.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return org.bouncycastle.f.a.a(this.a);
    }

    public final String toString() {
        return b();
    }
}
