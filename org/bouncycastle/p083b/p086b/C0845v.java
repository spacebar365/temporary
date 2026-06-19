package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0845v extends AbstractC0833j {
    public C0845v() {
    }

    public C0845v(C0845v c0845v) {
        super(c0845v);
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
        mo1931c();
        return 48;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA-384";
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        super.m2036a((AbstractC0833j) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 48;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0833j, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3478a = -3766243637369397544L;
        this.f3479b = 7105036623409894663L;
        this.f3480c = -7973340178411365097L;
        this.f3481d = 1526699215303891257L;
        this.f3482e = 7436329637833083697L;
        this.f3483f = -8163818279084223215L;
        this.f3484g = -2662702644619276377L;
        this.f3485h = 5167115440072839076L;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0845v(this);
    }
}
