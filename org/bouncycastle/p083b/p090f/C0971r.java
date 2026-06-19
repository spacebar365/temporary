package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1065aq;
import org.bouncycastle.p083b.p097k.C1067as;
import org.bouncycastle.p083b.p097k.C1068at;
import org.bouncycastle.p083b.p097k.C1069au;
import org.bouncycastle.p107d.p108a.AbstractC1364aa;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.f.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0971r implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private C1065aq f4032a;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        C1067as c1067asM2584c = this.f4032a.m2584c();
        SecureRandom secureRandomA = this.f4032a.m2824a();
        BigInteger bigIntegerM2587b = c1067asM2584c.m2587b();
        BigInteger bigIntegerM2586a = c1067asM2584c.m2586a();
        BigInteger bigIntegerM2588c = c1067asM2584c.m2588c();
        while (true) {
            BigInteger bigIntegerM4114a = C1544b.m4114a(256, secureRandomA);
            if (bigIntegerM4114a.signum() > 0 && bigIntegerM4114a.compareTo(bigIntegerM2587b) < 0 && AbstractC1364aa.m3257a(bigIntegerM4114a) >= 64) {
                return new C0818b(new C1069au(bigIntegerM2588c.modPow(bigIntegerM4114a, bigIntegerM2586a), c1067asM2584c), new C1068at(bigIntegerM4114a, c1067asM2584c));
            }
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f4032a = (C1065aq) c1181x;
    }
}
