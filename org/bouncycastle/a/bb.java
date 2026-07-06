package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public class bb extends u implements aa {
    private final byte[] a;

    public bb(String str) {
        this(str, (byte) 0);
    }

    private bb(String str, byte b) {
        if (str == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.a = org.bouncycastle.f.k.d(str);
    }

    bb(byte[] bArr) {
        this.a = bArr;
    }

    public static bb a(Object obj) {
        if (obj == null || (obj instanceof bb)) {
            return (bb) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static bb a(ab abVar) {
        u uVarJ = abVar.j();
        return uVarJ instanceof bb ? a((Object) uVarJ) : new bb(((q) uVarJ).c());
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(22, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof bb) {
            return org.bouncycastle.f.a.a(this.a, ((bb) uVar).a);
        }
        return false;
    }

    @Override // org.bouncycastle.a.aa
    public final String b() {
        return org.bouncycastle.f.k.b(this.a);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length) + 1 + this.a.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        return org.bouncycastle.f.a.a(this.a);
    }

    public String toString() {
        return b();
    }
}
