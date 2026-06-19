package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0847x extends AbstractC0833j {
    public C0847x() {
    }

    public C0847x(C0847x c0847x) {
        super(c0847x);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2037f();
        AbstractC1556g.m4137a(this.f3478a, bArr, i);
        AbstractC1556g.m4137a(this.f3479b, bArr, i + 8);
        AbstractC1556g.m4137a(this.f3480c, bArr, i + 16);
        AbstractC1556g.m4137a(this.f3481d, bArr, i + 24);
        AbstractC1556g.m4137a(this.f3482e, bArr, i + 32);
        AbstractC1556g.m4137a(this.f3483f, bArr, i + 40);
        AbstractC1556g.m4137a(this.f3484g, bArr, i + 48);
        AbstractC1556g.m4137a(this.f3485h, bArr, i + 56);
        mo1931c();
        return 64;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2036a((AbstractC0833j) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 64;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0833j, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3478a = 7640891576956012808L;
        this.f3479b = -4942790177534073029L;
        this.f3480c = 4354685564936845355L;
        this.f3481d = -6534734903238641935L;
        this.f3482e = 5840696475078001361L;
        this.f3483f = -7276294671716946913L;
        this.f3484g = 2270897969802886507L;
        this.f3485h = 6620516959819538809L;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0847x(this);
    }
}
