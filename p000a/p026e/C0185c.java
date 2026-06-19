package p000a.p026e;

import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.e.c */
/* JADX INFO: compiled from: NameQueryRequest.java */
/* JADX INFO: loaded from: classes.dex */
final class C0185c extends AbstractC0189g {
    C0185c(InterfaceC0267h interfaceC0267h, C0184b c0184b) {
        super(interfaceC0267h);
        this.f884q = c0184b;
        this.f886s = 32;
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo532a(byte[] bArr) {
        return m567c(bArr);
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo533a(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p026e.AbstractC0189g
    public final String toString() {
        return new String("NameQueryRequest[" + super.toString() + "]");
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: b */
    final int mo534b(byte[] bArr) {
        int iM526a = this.f884q.m526a(bArr) + 12;
        this.f886s = AbstractC0189g.m565b(bArr, iM526a);
        this.f887t = AbstractC0189g.m565b(bArr, iM526a + 2);
        return (r0 + 2) - 12;
    }
}
