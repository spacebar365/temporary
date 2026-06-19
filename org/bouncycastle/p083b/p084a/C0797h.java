package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1104g;
import org.bouncycastle.p083b.p097k.C1105h;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1108k;

/* JADX INFO: renamed from: org.bouncycastle.b.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0797h implements InterfaceC0884d {

    /* JADX INFO: renamed from: b */
    private static final BigInteger f3318b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a */
    C1104g f3319a;

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final int mo1872a() {
        return (this.f3319a.m2659a().m2658b().m2664a().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final void mo1873a(InterfaceC1003i interfaceC1003i) {
        this.f3319a = (C1104g) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: b */
    public final BigInteger mo1874b(InterfaceC1003i interfaceC1003i) {
        C1105h c1105h = (C1105h) interfaceC1003i;
        C1107j c1107jM2659a = this.f3319a.m2659a();
        if (!this.f3319a.m2659a().m2658b().equals(c1105h.m2662a().m2658b())) {
            throw new IllegalStateException("MQV public key components have wrong domain parameters");
        }
        if (this.f3319a.m2659a().m2658b().m2666c() == null) {
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
        C1106i c1106iB = c1107jM2659a.m2658b();
        C1108k c1108kM2662a = c1105h.m2662a();
        C1107j c1107jM2660b = this.f3319a.m2660b();
        C1108k c1108kM2661c = this.f3319a.m2661c();
        C1108k c1108kM2663b = c1105h.m2663b();
        BigInteger bigIntegerM2666c = c1106iB.m2666c();
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow((bigIntegerM2666c.bitLength() + 1) / 2);
        BigInteger bigIntegerModPow = c1108kM2663b.m2672c().multiply(c1108kM2662a.m2672c().modPow(c1108kM2663b.m2672c().mod(bigIntegerPow).add(bigIntegerPow), c1106iB.m2664a())).modPow(c1107jM2660b.m2671c().add(c1108kM2661c.m2672c().mod(bigIntegerPow).add(bigIntegerPow).multiply(c1107jM2659a.m2671c())).mod(bigIntegerM2666c), c1106iB.m2664a());
        if (bigIntegerModPow.equals(f3318b)) {
            throw new IllegalStateException("1 is not a valid agreement value for MQV");
        }
        return bigIntegerModPow;
    }
}
