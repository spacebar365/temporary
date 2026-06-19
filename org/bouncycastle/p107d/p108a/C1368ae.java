package org.bouncycastle.p107d.p108a;

import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: renamed from: org.bouncycastle.d.a.ae */
/* JADX INFO: loaded from: classes.dex */
final class C1368ae implements InterfaceC1398s {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC1389j.a f4977a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ byte f4978b;

    C1368ae(AbstractC1389j.a aVar, byte b) {
        this.f4977a = aVar;
        this.f4978b = b;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1398s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1399t mo3266a(InterfaceC1399t interfaceC1399t) {
        if (interfaceC1399t instanceof C1369af) {
            return interfaceC1399t;
        }
        C1369af c1369af = new C1369af();
        c1369af.m3269a(C1402w.m3539a(this.f4977a, this.f4978b));
        return c1369af;
    }
}
