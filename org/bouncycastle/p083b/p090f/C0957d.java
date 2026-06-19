package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1102e;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1108k;

/* JADX INFO: renamed from: org.bouncycastle.b.f.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0957d implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private C1102e f3998a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C0958e c0958e = C0958e.f3999a;
        C1106i c1106iM2657c = this.f3998a.m2657c();
        BigInteger bigIntegerM2418a = C0958e.m2418a(c1106iM2657c, this.f3998a.m2824a());
        return new C0818b(new C1108k(C0958e.m2417a(c1106iM2657c, bigIntegerM2418a), c1106iM2657c), new C1107j(bigIntegerM2418a, c1106iM2657c));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f3998a = (C1102e) c1181x;
    }
}
