package org.bouncycastle.p083b.p084a;

import org.bouncycastle.p083b.InterfaceC0809ai;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1093br;
import org.bouncycastle.p083b.p097k.C1094bs;

/* JADX INFO: renamed from: org.bouncycastle.b.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0798i implements InterfaceC0809ai {

    /* JADX INFO: renamed from: a */
    private C1093br f3320a;

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final int mo1891a() {
        return 32;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final void mo1892a(InterfaceC1003i interfaceC1003i) {
        this.f3320a = (C1093br) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0809ai
    /* JADX INFO: renamed from: a */
    public final void mo1893a(InterfaceC1003i interfaceC1003i, byte[] bArr, int i) {
        this.f3320a.m2639a((C1094bs) interfaceC1003i, bArr, i);
    }
}
