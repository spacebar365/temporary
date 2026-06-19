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
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.C1392m;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1148f implements InterfaceC1142n {

    /* JADX INFO: renamed from: a */
    C1050ab f4585a;

    /* JADX INFO: renamed from: b */
    SecureRandom f4586b;

    @Override // org.bouncycastle.p083b.InterfaceC1142n
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2746a() {
        return this.f4585a.m2563b().m2701c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final void mo2715a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!z) {
            this.f4585a = (C1053ae) interfaceC1003i;
            return;
        }
        if (!(interfaceC1003i instanceof C1081bf)) {
            this.f4586b = C1124l.m2709a();
            this.f4585a = (C1052ad) interfaceC1003i;
        } else {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4586b = c1081bf.m2613a();
            this.f4585a = (C1052ad) c1081bf.m2614b();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final boolean mo2716a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        BigInteger bigIntegerM2701c = this.f4585a.m2563b().m2701c();
        if (bigInteger.compareTo(InterfaceC1376c.f4995d) < 0 || bigInteger.compareTo(bigIntegerM2701c) >= 0 || bigInteger2.compareTo(InterfaceC1376c.f4995d) < 0 || bigInteger2.compareTo(bigIntegerM2701c) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(bigIntegerM2701c);
        AbstractC1389j abstractC1389jM3468o = C1371b.m3274a(this.f4585a.m2563b().m2700b(), bigInteger2.multiply(bigIntegerModInverse).mod(bigIntegerM2701c), ((C1053ae) this.f4585a).m2566c(), bigIntegerM2701c.subtract(bigInteger).multiply(bigIntegerModInverse).mod(bigIntegerM2701c)).m3468o();
        if (abstractC1389jM3468o.m3469p()) {
            return false;
        }
        return abstractC1389jM3468o.m3461g().mo2928a().mod(bigIntegerM2701c).equals(bigInteger);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2717a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        C1122y c1122yM2563b = this.f4585a.m2563b();
        BigInteger bigIntegerM2701c = c1122yM2563b.m2701c();
        BigInteger bigIntegerM2565c = ((C1052ad) this.f4585a).m2565c();
        C1392m c1392m = new C1392m();
        while (true) {
            BigInteger bigIntegerM4114a = C1544b.m4114a(bigIntegerM2701c.bitLength(), this.f4586b);
            if (!bigIntegerM4114a.equals(InterfaceC1376c.f4994c)) {
                BigInteger bigIntegerMod = c1392m.mo2903a(c1122yM2563b.m2700b(), bigIntegerM4114a).m3468o().m3461g().mo2928a().mod(bigIntegerM2701c);
                if (bigIntegerMod.equals(InterfaceC1376c.f4994c)) {
                    continue;
                } else {
                    BigInteger bigIntegerMod2 = bigIntegerM4114a.multiply(bigInteger).add(bigIntegerM2565c.multiply(bigIntegerMod)).mod(bigIntegerM2701c);
                    if (!bigIntegerMod2.equals(InterfaceC1376c.f4994c)) {
                        return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                    }
                }
            }
        }
    }
}
