package org.bouncycastle.p083b.p090f;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1055ag;

/* JADX INFO: renamed from: org.bouncycastle.b.f.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0966m implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private SecureRandom f4024a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C1055ag c1055ag = new C1055ag(this.f4024a);
        return new C0818b(c1055ag.m2569c(), c1055ag);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f4024a = c1181x.m2824a();
    }
}
