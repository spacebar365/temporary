package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.au */
/* JADX INFO: loaded from: classes.dex */
public class C0558au extends AbstractC0603c {
    public C0558au(int i) {
        super(m1472b(i), m1469a(i));
    }

    public C0558au(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f.mo1358i().m1577a("DER"), 0);
    }

    public C0558au(byte[] bArr) {
        this(bArr, 0);
    }

    public C0558au(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* JADX INFO: renamed from: a */
    public static C0558au m1414a(Object obj) {
        if (obj == null || (obj instanceof C0558au)) {
            return (C0558au) obj;
        }
        if (obj instanceof C0596bt) {
            return new C0558au(((C0596bt) obj).f2135a, ((C0596bt) obj).f2136b);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C0558au) m1692b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0603c, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        byte[] bArrA = m1471a(this.f2135a, this.f2136b);
        byte[] bArr = new byte[bArrA.length + 1];
        bArr[0] = (byte) m1475f();
        System.arraycopy(bArrA, 0, bArr, 1, bArr.length - 1);
        c0660s.m1605a(3, bArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2135a.length + 1) + 1 + this.f2135a.length + 1;
    }

    /* JADX INFO: renamed from: a */
    public static C0558au m1415a(AbstractC0539ab abstractC0539ab, boolean z) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        if (z || (abstractC0686uM1402j instanceof C0558au)) {
            return m1414a((Object) abstractC0686uM1402j);
        }
        byte[] bArrMo1410c = ((AbstractC0655q) abstractC0686uM1402j).mo1410c();
        if (bArrMo1410c.length <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b = bArrMo1410c[0];
        byte[] bArr = new byte[bArrMo1410c.length - 1];
        if (bArr.length != 0) {
            System.arraycopy(bArrMo1410c, 1, bArr, 0, bArrMo1410c.length - 1);
        }
        return new C0558au(bArr, b);
    }
}
