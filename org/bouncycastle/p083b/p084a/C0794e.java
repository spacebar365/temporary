package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1120w;
import org.bouncycastle.p083b.p097k.C1121x;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0794e {

    /* JADX INFO: renamed from: a */
    private C1120w f3313a;

    /* JADX INFO: renamed from: a */
    private int m1885a() {
        return (this.f3313a.m2694a().m2563b().m2699a().mo2905a() + 7) / 8;
    }

    /* JADX INFO: renamed from: a */
    public final void m1886a(InterfaceC1003i interfaceC1003i) {
        this.f3313a = (C1120w) interfaceC1003i;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1887b(InterfaceC1003i interfaceC1003i) {
        C1121x c1121x = (C1121x) interfaceC1003i;
        C0793d c0793d = new C0793d();
        C0793d c0793d2 = new C0793d();
        c0793d.mo1873a(this.f3313a.m2694a());
        BigInteger bigIntegerMo1874b = c0793d.mo1874b(c1121x.m2696a());
        c0793d2.mo1873a(this.f3313a.m2695b());
        return C1535a.m4095d(C1544b.m4117a(m1885a(), c0793d2.mo1874b(c1121x.m2697b())), C1544b.m4117a(m1885a(), bigIntegerMo1874b));
    }
}
