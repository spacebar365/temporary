package org.bouncycastle.p107d.p108a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.ab */
/* JADX INFO: loaded from: classes.dex */
final class C1365ab implements InterfaceC1398s {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1405z f4970a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC1391l f4971b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f4972c = true;

    C1365ab(C1405z c1405z, InterfaceC1391l interfaceC1391l) {
        this.f4970a = c1405z;
        this.f4971b = interfaceC1391l;
    }

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1398s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1399t mo3266a(InterfaceC1399t interfaceC1399t) {
        C1405z c1405z = new C1405z();
        AbstractC1389j abstractC1389jM3551c = this.f4970a.m3551c();
        if (abstractC1389jM3551c != null) {
            c1405z.m3546a(this.f4971b.mo3478a(abstractC1389jM3551c));
        }
        AbstractC1389j[] abstractC1389jArrM3548a = this.f4970a.m3548a();
        AbstractC1389j[] abstractC1389jArr = new AbstractC1389j[abstractC1389jArrM3548a.length];
        for (int i = 0; i < abstractC1389jArrM3548a.length; i++) {
            abstractC1389jArr[i] = this.f4971b.mo3478a(abstractC1389jArrM3548a[i]);
        }
        c1405z.m3547a(abstractC1389jArr);
        if (this.f4972c) {
            AbstractC1389j[] abstractC1389jArr2 = new AbstractC1389j[abstractC1389jArr.length];
            for (int i2 = 0; i2 < abstractC1389jArr2.length; i2++) {
                abstractC1389jArr2[i2] = abstractC1389jArr[i2].mo2949s();
            }
            c1405z.m3549b(abstractC1389jArr2);
        }
        return c1405z;
    }
}
