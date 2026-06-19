package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1077bb;
import org.bouncycastle.p083b.p097k.C1078bc;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.C1557h;

/* JADX INFO: renamed from: org.bouncycastle.b.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0795f implements InterfaceC0884d {

    /* JADX INFO: renamed from: a */
    C1077bb f3314a;

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final int mo1872a() {
        return (this.f3314a.m2604a().m2563b().m2699a().mo2905a() + 7) / 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final void mo1873a(InterfaceC1003i interfaceC1003i) {
        this.f3314a = (C1077bb) interfaceC1003i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: b */
    public final BigInteger mo1874b(InterfaceC1003i interfaceC1003i) {
        if (C1557h.m4155a("org.bouncycastle.ec.disable_mqv")) {
            throw new IllegalStateException("ECMQV explicitly disabled");
        }
        C1078bc c1078bc = (C1078bc) interfaceC1003i;
        C1052ad c1052adM2604a = this.f3314a.m2604a();
        C1122y c1122yB = c1052adM2604a.m2563b();
        if (!c1122yB.equals(c1078bc.m2607a().m2563b())) {
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        C1052ad c1052adM2605b = this.f3314a.m2605b();
        C1053ae c1053aeM2606c = this.f3314a.m2606c();
        C1053ae c1053aeM2607a = c1078bc.m2607a();
        C1053ae c1053aeM2608b = c1078bc.m2608b();
        BigInteger bigIntegerM2701c = c1122yB.m2701c();
        int iBitLength = (bigIntegerM2701c.bitLength() + 1) / 2;
        BigInteger bigIntegerShiftLeft = InterfaceC1376c.f4995d.shiftLeft(iBitLength);
        AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
        AbstractC1389j abstractC1389jM3279b = C1371b.m3279b(abstractC1381dM2699a, c1053aeM2606c.m2566c());
        AbstractC1389j abstractC1389jM3279b2 = C1371b.m3279b(abstractC1381dM2699a, c1053aeM2607a.m2566c());
        AbstractC1389j abstractC1389jM3279b3 = C1371b.m3279b(abstractC1381dM2699a, c1053aeM2608b.m2566c());
        BigInteger bigIntegerMod = c1052adM2604a.m2565c().multiply(abstractC1389jM3279b.m3461g().mo2928a().mod(bigIntegerShiftLeft).setBit(iBitLength)).add(c1052adM2605b.m2565c()).mod(bigIntegerM2701c);
        BigInteger bit = abstractC1389jM3279b3.m3461g().mo2928a().mod(bigIntegerShiftLeft).setBit(iBitLength);
        BigInteger bigIntegerMod2 = c1122yB.m2702d().multiply(bigIntegerMod).mod(bigIntegerM2701c);
        AbstractC1389j abstractC1389jM3468o = C1371b.m3274a(abstractC1389jM3279b2, bit.multiply(bigIntegerMod2).mod(bigIntegerM2701c), abstractC1389jM3279b3, bigIntegerMod2).m3468o();
        if (abstractC1389jM3468o.m3469p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        }
        return abstractC1389jM3468o.m3461g().mo2928a();
    }
}
