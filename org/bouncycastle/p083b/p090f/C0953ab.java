package org.bouncycastle.p083b.p090f;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1093br;

/* JADX INFO: renamed from: org.bouncycastle.b.f.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0953ab implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private SecureRandom f3996a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C1093br c1093br = new C1093br(this.f3996a);
        return new C0818b(c1093br.m2641c(), c1093br);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f3996a = c1181x.m2824a();
    }
}
