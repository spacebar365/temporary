package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.be */
/* JADX INFO: loaded from: classes.dex */
public final class C0581be extends AbstractC0655q {
    public C0581be(InterfaceC0618f interfaceC0618f) {
        super(interfaceC0618f.mo1358i().m1577a("DER"));
    }

    public C0581be(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0655q, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(4, this.f2558a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2558a.length) + 1 + this.f2558a.length;
    }
}
