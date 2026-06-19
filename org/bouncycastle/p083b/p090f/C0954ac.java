package org.bouncycastle.p083b.p090f;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1096bu;

/* JADX INFO: renamed from: org.bouncycastle.b.f.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0954ac implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private SecureRandom f3997a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C1096bu c1096bu = new C1096bu(this.f3997a);
        return new C0818b(c1096bu.m2646c(), c1096bu);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f3997a = c1181x.m2824a();
    }
}
