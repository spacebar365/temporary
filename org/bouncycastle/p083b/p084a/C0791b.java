package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1109l;
import org.bouncycastle.p083b.p097k.C1110m;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0791b {

    /* JADX INFO: renamed from: a */
    private C1109l f3310a;

    /* JADX INFO: renamed from: a */
    private int m1882a() {
        return (this.f3310a.m2673a().m2658b().m2664a().bitLength() + 7) / 8;
    }

    /* JADX INFO: renamed from: a */
    public final void m1883a(InterfaceC1003i interfaceC1003i) {
        this.f3310a = (C1109l) interfaceC1003i;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1884b(InterfaceC1003i interfaceC1003i) {
        C1110m c1110m = (C1110m) interfaceC1003i;
        C0787a c0787a = new C0787a();
        C0787a c0787a2 = new C0787a();
        c0787a.mo1873a(this.f3310a.m2673a());
        BigInteger bigIntegerMo1874b = c0787a.mo1874b(c1110m.m2675a());
        c0787a2.mo1873a(this.f3310a.m2674b());
        return C1535a.m4095d(C1544b.m4117a(m1882a(), c0787a2.mo1874b(c1110m.m2676b())), C1544b.m4117a(m1882a(), bigIntegerMo1874b));
    }
}
