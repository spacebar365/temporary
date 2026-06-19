package p000a.p026e;

import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.e.j */
/* JADX INFO: compiled from: NodeStatusRequest.java */
/* JADX INFO: loaded from: classes.dex */
final class C0192j extends AbstractC0189g {
    C0192j(InterfaceC0267h interfaceC0267h, C0184b c0184b) {
        super(interfaceC0267h);
        this.f884q = c0184b;
        this.f886s = 33;
        this.f881n = false;
        this.f883p = false;
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo532a(byte[] bArr) {
        int i = this.f884q.f828c;
        this.f884q.f828c = 0;
        int iC = m567c(bArr);
        this.f884q.f828c = i;
        return iC;
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: b */
    final int mo534b(byte[] bArr) {
        return 0;
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo533a(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p026e.AbstractC0189g
    public final String toString() {
        return new String("NodeStatusRequest[" + super.toString() + "]");
    }
}
