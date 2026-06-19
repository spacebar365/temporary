package org.bouncycastle.p083b.p084a;

import org.bouncycastle.p083b.InterfaceC0809ai;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1098bw;
import org.bouncycastle.p083b.p097k.C1099bx;

/* JADX INFO: renamed from: org.bouncycastle.b.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0800k implements InterfaceC0809ai {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0809ai f3322a;

    /* JADX INFO: renamed from: b */
    private C1098bw f3323b;

    public C0800k(InterfaceC0809ai interfaceC0809ai) {
        this.f3322a = interfaceC0809ai;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final int mo1891a() {
        return this.f3322a.mo1891a() * 2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final void mo1892a(InterfaceC1003i interfaceC1003i) {
        this.f3323b = (C1098bw) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final void mo1893a(InterfaceC1003i interfaceC1003i, byte[] bArr, int i) {
        C1099bx c1099bx = (C1099bx) interfaceC1003i;
        this.f3322a.mo1892a(this.f3323b.m2650b());
        this.f3322a.mo1893a(c1099bx.m2652b(), bArr, i);
        this.f3322a.mo1892a(this.f3323b.m2649a());
        this.f3322a.mo1893a(c1099bx.m2651a(), bArr, this.f3322a.mo1891a() + i);
    }
}
