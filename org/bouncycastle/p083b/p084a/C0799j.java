package org.bouncycastle.p083b.p084a;

import org.bouncycastle.p083b.InterfaceC0809ai;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1096bu;
import org.bouncycastle.p083b.p097k.C1097bv;

/* JADX INFO: renamed from: org.bouncycastle.b.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0799j implements InterfaceC0809ai {

    /* JADX INFO: renamed from: a */
    private C1096bu f3321a;

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final int mo1891a() {
        return 56;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final void mo1892a(InterfaceC1003i interfaceC1003i) {
        this.f3321a = (C1096bu) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final void mo1893a(InterfaceC1003i interfaceC1003i, byte[] bArr, int i) {
        this.f3321a.m2644a((C1097bv) interfaceC1003i, bArr, i);
    }
}
