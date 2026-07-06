package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u {
    private final byte[] e;
    private static final byte[] c = {-1};
    private static final byte[] d = {0};
    public static final d a = new d(false);
    public static final d b = new d(true);

    private d(boolean z) {
        this.e = z ? c : d;
    }

    private d(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (bArr[0] == 0) {
            this.e = d;
        } else if ((bArr[0] & 255) == 255) {
            this.e = c;
        } else {
            this.e = org.bouncycastle.f.a.b(bArr);
        }
    }

    public static d a(Object obj) {
        if (obj == null || (obj instanceof d)) {
            return (d) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static d a(ab abVar) {
        u uVarJ = abVar.j();
        return uVarJ instanceof d ? a((Object) uVarJ) : a(((q) uVarJ).c());
    }

    public static d a(boolean z) {
        return z ? b : a;
    }

    static d a(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        return bArr[0] == 0 ? a : (bArr[0] & 255) == 255 ? b : new d(bArr);
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(1, this.e);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    protected final boolean a(u uVar) {
        return (uVar instanceof d) && this.e[0] == ((d) uVar).e[0];
    }

    public final boolean b() {
        return this.e[0] != 0;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return 3;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return this.e[0];
    }

    public final String toString() {
        return this.e[0] != 0 ? "TRUE" : "FALSE";
    }
}
