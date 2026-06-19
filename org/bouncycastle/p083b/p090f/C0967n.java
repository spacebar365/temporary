package org.bouncycastle.p083b.p090f;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1058aj;

/* JADX INFO: renamed from: org.bouncycastle.b.f.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0967n implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private SecureRandom f4025a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C1058aj c1058aj = new C1058aj(this.f4025a);
        return new C0818b(c1058aj.m2574c(), c1058aj);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f4025a = c1181x.m2824a();
    }
}
