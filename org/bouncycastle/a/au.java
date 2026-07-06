package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public class au extends c {
    public au(int i) {
        super(b(i), a(i));
    }

    public au(f fVar) {
        super(fVar.i().a("DER"), 0);
    }

    public au(byte[] bArr) {
        this(bArr, 0);
    }

    public au(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static au a(Object obj) {
        if (obj == null || (obj instanceof au)) {
            return (au) obj;
        }
        if (obj instanceof bt) {
            return new au(((bt) obj).a, ((bt) obj).b);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (au) b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // org.bouncycastle.a.c, org.bouncycastle.a.u
    final void a(s sVar) {
        byte[] bArrA = a(this.a, this.b);
        byte[] bArr = new byte[bArrA.length + 1];
        bArr[0] = (byte) f();
        System.arraycopy(bArrA, 0, bArr, 1, bArr.length - 1);
        sVar.a(3, bArr);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length + 1) + 1 + this.a.length + 1;
    }

    public static au a(ab abVar, boolean z) {
        u uVarJ = abVar.j();
        if (z || (uVarJ instanceof au)) {
            return a((Object) uVarJ);
        }
        byte[] bArrC = ((q) uVarJ).c();
        if (bArrC.length <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b = bArrC[0];
        byte[] bArr = new byte[bArrC.length - 1];
        if (bArr.length != 0) {
            System.arraycopy(bArrC, 1, bArr, 0, bArrC.length - 1);
        }
        return new au(bArr, b);
    }
}
