package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1060al;
import org.bouncycastle.p083b.p097k.C1062an;
import org.bouncycastle.p083b.p097k.C1063ao;
import org.bouncycastle.p083b.p097k.C1064ap;
import org.bouncycastle.p083b.p097k.C1106i;

/* JADX INFO: renamed from: org.bouncycastle.b.f.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0968o implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private C1060al f4026a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C0958e c0958e = C0958e.f3999a;
        C1062an c1062anM2577c = this.f4026a.m2577c();
        C1106i c1106i = new C1106i(c1062anM2577c.m2579a(), c1062anM2577c.m2580b(), c1062anM2577c.m2581c());
        BigInteger bigIntegerM2418a = C0958e.m2418a(c1106i, this.f4026a.m2824a());
        return new C0818b(new C1064ap(C0958e.m2417a(c1106i, bigIntegerM2418a), c1062anM2577c), new C1063ao(bigIntegerM2418a, c1062anM2577c));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f4026a = (C1060al) c1181x;
    }
}
