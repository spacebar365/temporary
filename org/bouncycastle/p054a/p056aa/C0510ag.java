package org.bouncycastle.p054a.p056aa;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p107d.p108a.AbstractC1386g;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C0510ag extends AbstractC0650o {

    /* JADX INFO: renamed from: b */
    private static C0512ai f1897b = new C0512ai();

    /* JADX INFO: renamed from: a */
    protected AbstractC1386g f1898a;

    public C0510ag(AbstractC1386g abstractC1386g) {
        this.f1898a = abstractC1386g;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0581be(C0512ai.m1377a(this.f1898a.mo2928a(), (this.f1898a.mo2930b() + 7) / 8));
    }
}
