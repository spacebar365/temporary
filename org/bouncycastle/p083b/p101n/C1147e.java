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
import org.bouncycastle.p107d.p108a.InterfaceC1376c;

/* JADX INFO: renamed from: org.bouncycastle.b.n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1147e implements InterfaceC1142n, InterfaceC1376c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1144b f4582a;

    /* JADX INFO: renamed from: b */
    private C1050ab f4583b;

    /* JADX INFO: renamed from: i */
    private SecureRandom f4584i;

    public C1147e() {
        this.f4582a = new C1159q();
    }

    public C1147e(InterfaceC1144b interfaceC1144b) {
        this.f4582a = interfaceC1144b;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2757a(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1142n
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2746a() {
        return this.f4583b.m2563b().m2701c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final void mo2715a(boolean z, InterfaceC1003i interfaceC1003i) {
        SecureRandom secureRandomM2709a;
        if (!z) {
            this.f4583b = (C1053ae) interfaceC1003i;
            secureRandomM2709a = null;
        } else if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4583b = (C1052ad) c1081bf.m2614b();
            secureRandomM2709a = c1081bf.m2613a();
        } else {
            this.f4583b = (C1052ad) interfaceC1003i;
            secureRandomM2709a = null;
        }
        if (!(z && !this.f4582a.mo2751a())) {
            secureRandomM2709a = null;
        } else if (secureRandomM2709a == null) {
            secureRandomM2709a = C1124l.m2709a();
        }
        this.f4584i = secureRandomM2709a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2717a(byte[] bArr) {
        C1122y c1122yM2563b = this.f4583b.m2563b();
        BigInteger bigIntegerM2701c = c1122yM2563b.m2701c();
        BigInteger bigIntegerM2757a = m2757a(bigIntegerM2701c, bArr);
        BigInteger bigIntegerM2565c = ((C1052ad) this.f4583b).m2565c();
        if (this.f4582a.mo2751a()) {
            this.f4582a.mo2749a(bigIntegerM2701c, bigIntegerM2565c, bArr);
        } else {
            this.f4582a.mo2750a(bigIntegerM2701c, this.f4584i);
        }
        C1392m c1392m = new C1392m();
        while (true) {
            BigInteger bigIntegerMo2752b = this.f4582a.mo2752b();
            BigInteger bigIntegerMod = c1392m.mo2903a(c1122yM2563b.m2700b(), bigIntegerMo2752b).m3468o().m3461g().mo2928a().mod(bigIntegerM2701c);
            if (!bigIntegerMod.equals(f4994c)) {
                BigInteger bigIntegerMod2 = bigIntegerMo2752b.modInverse(bigIntegerM2701c).multiply(bigIntegerM2757a.add(bigIntegerM2565c.multiply(bigIntegerMod))).mod(bigIntegerM2701c);
                if (!bigIntegerMod2.equals(f4994c)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final boolean mo2716a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerM3369j;
        AbstractC1386g abstractC1386gMo2936e;
        C1122y c1122yM2563b = this.f4583b.m2563b();
        BigInteger bigIntegerM2701c = c1122yM2563b.m2701c();
        BigInteger bigIntegerM2757a = m2757a(bigIntegerM2701c, bArr);
        if (bigInteger.compareTo(f4995d) < 0 || bigInteger.compareTo(bigIntegerM2701c) >= 0) {
            return false;
        }
        if (bigInteger2.compareTo(f4995d) < 0 || bigInteger2.compareTo(bigIntegerM2701c) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(bigIntegerM2701c);
        AbstractC1389j abstractC1389jM3274a = C1371b.m3274a(c1122yM2563b.m2700b(), bigIntegerM2757a.multiply(bigIntegerModInverse).mod(bigIntegerM2701c), ((C1053ae) this.f4583b).m2566c(), bigInteger.multiply(bigIntegerModInverse).mod(bigIntegerM2701c));
        if (abstractC1389jM3274a.m3469p()) {
            return false;
        }
        AbstractC1381d abstractC1381dM3459d = abstractC1389jM3274a.m3459d();
        if (abstractC1381dM3459d != null && (bigIntegerM3369j = abstractC1381dM3459d.m3369j()) != null && bigIntegerM3369j.compareTo(f4999h) <= 0) {
            switch (abstractC1381dM3459d.m3370k()) {
                case 1:
                case 6:
                case 7:
                    abstractC1386gMo2936e = abstractC1389jM3274a.mo2945a(0);
                    break;
                case 2:
                case 3:
                case 4:
                    abstractC1386gMo2936e = abstractC1389jM3274a.mo2945a(0).mo2936e();
                    break;
                case 5:
                default:
                    abstractC1386gMo2936e = null;
                    break;
            }
            if (abstractC1386gMo2936e != null && !abstractC1386gMo2936e.mo2940j()) {
                AbstractC1386g abstractC1386gM3463i = abstractC1389jM3274a.m3463i();
                while (abstractC1381dM3459d.mo3364b(bigInteger)) {
                    if (abstractC1381dM3459d.mo2906a(bigInteger).mo2933c(abstractC1386gMo2936e).equals(abstractC1386gM3463i)) {
                        return true;
                    }
                    bigInteger = bigInteger.add(bigIntegerM2701c);
                }
                return false;
            }
        }
        return abstractC1389jM3274a.m3468o().m3461g().mo2928a().mod(bigIntegerM2701c).equals(bigInteger);
    }
}
