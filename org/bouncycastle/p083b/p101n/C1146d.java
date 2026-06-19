package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.p097k.C1050ab;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.C1392m;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1146d implements InterfaceC1142n {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4579a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b */
    private C1050ab f4580b;

    /* JADX INFO: renamed from: c */
    private SecureRandom f4581c;

    /* JADX INFO: renamed from: a */
    private static BigInteger m2754a(BigInteger bigInteger, int i) {
        return bigInteger.bitLength() > i ? bigInteger.mod(f4579a.shiftLeft(i)) : bigInteger;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2755a(BigInteger bigInteger, AbstractC1386g abstractC1386g) {
        return m2754a(abstractC1386g.mo2928a(), bigInteger.bitLength() - 1);
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1386g m2756a(AbstractC1381d abstractC1381d, byte[] bArr) {
        return abstractC1381d.mo2906a(m2754a(new BigInteger(1, C1535a.m4089c(bArr)), abstractC1381d.mo2905a()));
    }

    @Override // org.bouncycastle.p083b.InterfaceC1142n
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2746a() {
        return this.f4580b.m2563b().m2701c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final void mo2715a(boolean z, InterfaceC1003i interfaceC1003i) {
        InterfaceC1003i interfaceC1003iM2614b;
        if (!z) {
            this.f4580b = (C1053ae) interfaceC1003i;
            return;
        }
        if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4581c = c1081bf.m2613a();
            interfaceC1003iM2614b = c1081bf.m2614b();
        } else {
            this.f4581c = C1124l.m2709a();
            interfaceC1003iM2614b = interfaceC1003i;
        }
        this.f4580b = (C1052ad) interfaceC1003iM2614b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final boolean mo2716a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        C1122y c1122yM2563b = this.f4580b.m2563b();
        BigInteger bigIntegerM2701c = c1122yM2563b.m2701c();
        if (bigInteger.compareTo(bigIntegerM2701c) >= 0 || bigInteger2.compareTo(bigIntegerM2701c) >= 0) {
            return false;
        }
        AbstractC1381d abstractC1381dM2699a = c1122yM2563b.m2699a();
        AbstractC1386g abstractC1386gM2756a = m2756a(abstractC1381dM2699a, bArr);
        AbstractC1386g abstractC1386gMo2906a = abstractC1386gM2756a.mo2940j() ? abstractC1381dM2699a.mo2906a(f4579a) : abstractC1386gM2756a;
        AbstractC1389j abstractC1389jM3468o = C1371b.m3274a(c1122yM2563b.m2700b(), bigInteger2, ((C1053ae) this.f4580b).m2566c(), bigInteger).m3468o();
        return !abstractC1389jM3468o.m3469p() && m2755a(bigIntegerM2701c, abstractC1386gMo2906a.mo2933c(abstractC1389jM3468o.m3461g())).compareTo(bigInteger) == 0;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2717a(byte[] bArr) {
        C1122y c1122yM2563b = this.f4580b.m2563b();
        AbstractC1381d abstractC1381dM2699a = c1122yM2563b.m2699a();
        AbstractC1386g abstractC1386gM2756a = m2756a(abstractC1381dM2699a, bArr);
        AbstractC1386g abstractC1386gMo2906a = abstractC1386gM2756a.mo2940j() ? abstractC1381dM2699a.mo2906a(f4579a) : abstractC1386gM2756a;
        BigInteger bigIntegerM2701c = c1122yM2563b.m2701c();
        BigInteger bigIntegerM2565c = ((C1052ad) this.f4580b).m2565c();
        C1392m c1392m = new C1392m();
        while (true) {
            BigInteger bigIntegerM4114a = C1544b.m4114a(bigIntegerM2701c.bitLength() - 1, this.f4581c);
            AbstractC1386g abstractC1386gM3461g = c1392m.mo2903a(c1122yM2563b.m2700b(), bigIntegerM4114a).m3468o().m3461g();
            if (!abstractC1386gM3461g.mo2940j()) {
                BigInteger bigIntegerM2755a = m2755a(bigIntegerM2701c, abstractC1386gMo2906a.mo2933c(abstractC1386gM3461g));
                if (bigIntegerM2755a.signum() != 0) {
                    BigInteger bigIntegerMod = bigIntegerM2755a.multiply(bigIntegerM2565c).add(bigIntegerM4114a).mod(bigIntegerM2701c);
                    if (bigIntegerMod.signum() != 0) {
                        return new BigInteger[]{bigIntegerM2755a, bigIntegerMod};
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
