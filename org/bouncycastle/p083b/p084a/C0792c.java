package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;

/* JADX INFO: renamed from: org.bouncycastle.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0792c implements InterfaceC0884d {

    /* JADX INFO: renamed from: a */
    private C1052ad f3311a;

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final int mo1872a() {
        return (this.f3311a.m2563b().m2699a().mo2905a() + 7) / 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final void mo1873a(InterfaceC1003i interfaceC1003i) {
        this.f3311a = (C1052ad) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: b */
    public final BigInteger mo1874b(InterfaceC1003i interfaceC1003i) {
        C1053ae c1053ae = (C1053ae) interfaceC1003i;
        C1122y c1122yB = this.f3311a.m2563b();
        if (!c1122yB.equals(c1053ae.m2563b())) {
            throw new IllegalStateException("ECDH public key has wrong domain parameters");
        }
        BigInteger bigIntegerM2565c = this.f3311a.m2565c();
        AbstractC1389j abstractC1389jM3279b = C1371b.m3279b(c1122yB.m2699a(), c1053ae.m2566c());
        if (abstractC1389jM3279b.m3469p()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        BigInteger bigIntegerM2702d = c1122yB.m2702d();
        if (!bigIntegerM2702d.equals(InterfaceC1376c.f4995d)) {
            bigIntegerM2565c = c1122yB.m2703e().multiply(bigIntegerM2565c).mod(c1122yB.m2701c());
            abstractC1389jM3279b = C1371b.m3273a(abstractC1389jM3279b, bigIntegerM2702d);
        }
        AbstractC1389j abstractC1389jM3468o = abstractC1389jM3279b.m3447a(bigIntegerM2565c).m3468o();
        if (abstractC1389jM3468o.m3469p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
        }
        return abstractC1389jM3468o.m3461g().mo2928a();
    }
}
