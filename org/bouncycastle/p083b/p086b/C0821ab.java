package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p083b.p097k.C1090bo;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0821ab implements InterfaceC1178u, InterfaceC1554e {

    /* JADX INFO: renamed from: a */
    private C0822ac f3354a;

    public C0821ab(C0821ab c0821ab) {
        this.f3354a = new C0822ac(c0821ab.f3354a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        return this.f3354a.m1955a(bArr, i);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        this.f3354a.m1956a(b);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        this.f3354a.mo1939a((InterfaceC1554e) ((C0821ab) interfaceC1554e).f3354a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        this.f3354a.m1958a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return this.f3354a.m1954a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3354a.m1960c();
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0821ab(this);
    }

    public C0821ab(int i, int i2) {
        this.f3354a = new C0822ac(i, i2);
        this.f3354a.m1957a((C1090bo) null);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "Skein-" + (this.f3354a.f3356a.mo2125b() * 8) + "-" + (this.f3354a.m1954a() * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return this.f3354a.f3356a.mo2125b();
    }
}
