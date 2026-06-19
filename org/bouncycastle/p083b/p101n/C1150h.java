package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.p090f.C0965l;
import org.bouncycastle.p083b.p097k.C1049aa;
import org.bouncycastle.p083b.p097k.C1050ab;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;

/* JADX INFO: renamed from: org.bouncycastle.b.n.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1150h implements InterfaceC1142n {

    /* JADX INFO: renamed from: a */
    private boolean f4589a;

    /* JADX INFO: renamed from: b */
    private C1050ab f4590b;

    /* JADX INFO: renamed from: c */
    private SecureRandom f4591c;

    @Override // org.bouncycastle.p083b.InterfaceC1142n
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2746a() {
        return this.f4590b.m2563b().m2701c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final void mo2715a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4589a = z;
        if (!z) {
            this.f4590b = (C1053ae) interfaceC1003i;
            return;
        }
        if (!(interfaceC1003i instanceof C1081bf)) {
            this.f4591c = C1124l.m2709a();
            this.f4590b = (C1052ad) interfaceC1003i;
        } else {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4591c = c1081bf.m2613a();
            this.f4590b = (C1052ad) c1081bf.m2614b();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final boolean mo2716a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.f4589a) {
            throw new IllegalStateException("not initialised for verifying");
        }
        C1053ae c1053ae = (C1053ae) this.f4590b;
        BigInteger bigIntegerM2701c = c1053ae.m2563b().m2701c();
        int iBitLength = bigIntegerM2701c.bitLength();
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.bitLength() > iBitLength) {
            throw new C1163o("input too large for ECNR key.");
        }
        if (bigInteger.compareTo(InterfaceC1376c.f4995d) < 0 || bigInteger.compareTo(bigIntegerM2701c) >= 0) {
            return false;
        }
        if (bigInteger2.compareTo(InterfaceC1376c.f4994c) < 0 || bigInteger2.compareTo(bigIntegerM2701c) >= 0) {
            return false;
        }
        AbstractC1389j abstractC1389jM3468o = C1371b.m3274a(c1053ae.m2563b().m2700b(), bigInteger2, c1053ae.m2566c(), bigInteger).m3468o();
        if (abstractC1389jM3468o.m3469p()) {
            return false;
        }
        return bigInteger.subtract(abstractC1389jM3468o.m3461g().mo2928a()).mod(bigIntegerM2701c).equals(bigInteger3);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2717a(byte[] bArr) {
        C0818b c0818bMo2108a;
        BigInteger bigIntegerMod;
        if (!this.f4589a) {
            throw new IllegalStateException("not initialised for signing");
        }
        BigInteger bigIntegerMo2746a = mo2746a();
        int iBitLength = bigIntegerMo2746a.bitLength();
        BigInteger bigInteger = new BigInteger(1, bArr);
        int iBitLength2 = bigInteger.bitLength();
        C1052ad c1052ad = (C1052ad) this.f4590b;
        if (iBitLength2 > iBitLength) {
            throw new C1163o("input too large for ECNR key.");
        }
        do {
            C0965l c0965l = new C0965l();
            c0965l.mo2109a(new C1049aa(c1052ad.m2563b(), this.f4591c));
            c0818bMo2108a = c0965l.mo2108a();
            bigIntegerMod = ((C1053ae) c0818bMo2108a.m1919a()).m2566c().m3461g().mo2928a().add(bigInteger).mod(bigIntegerMo2746a);
        } while (bigIntegerMod.equals(InterfaceC1376c.f4994c));
        return new BigInteger[]{bigIntegerMod, ((C1052ad) c0818bMo2108a.m1920b()).m2565c().subtract(bigIntegerMod.multiply(c1052ad.m2565c())).mod(bigIntegerMo2746a)};
    }
}
