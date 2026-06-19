package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1113p;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p083b.p097k.C1117t;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1145c implements InterfaceC1142n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1144b f4576a;

    /* JADX INFO: renamed from: b */
    private C1113p f4577b;

    /* JADX INFO: renamed from: c */
    private SecureRandom f4578c;

    public C1145c() {
        this.f4576a = new C1159q();
    }

    public C1145c(InterfaceC1144b interfaceC1144b) {
        this.f4576a = interfaceC1144b;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2753a(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        byte[] bArr2 = new byte[bigInteger.bitLength() / 8];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return new BigInteger(1, bArr2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1142n
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2746a() {
        return this.f4577b.m2680b().m2687b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final boolean mo2716a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        C1115r c1115rM2680b = this.f4577b.m2680b();
        BigInteger bigIntegerM2687b = c1115rM2680b.m2687b();
        BigInteger bigIntegerM2753a = m2753a(bigIntegerM2687b, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || bigIntegerM2687b.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || bigIntegerM2687b.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(bigIntegerM2687b);
        BigInteger bigIntegerMod = bigIntegerM2753a.multiply(bigIntegerModInverse).mod(bigIntegerM2687b);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModInverse).mod(bigIntegerM2687b);
        BigInteger bigIntegerM2686a = c1115rM2680b.m2686a();
        return c1115rM2680b.m2688c().modPow(bigIntegerMod, bigIntegerM2686a).multiply(((C1117t) this.f4577b).m2691c().modPow(bigIntegerMod2, bigIntegerM2686a)).mod(bigIntegerM2686a).mod(bigIntegerM2687b).equals(bigInteger);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final void mo2715a(boolean z, InterfaceC1003i interfaceC1003i) {
        SecureRandom secureRandomM2709a;
        if (!z) {
            this.f4577b = (C1117t) interfaceC1003i;
            secureRandomM2709a = null;
        } else if (interfaceC1003i instanceof C1081bf) {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4577b = (C1116s) c1081bf.m2614b();
            secureRandomM2709a = c1081bf.m2613a();
        } else {
            this.f4577b = (C1116s) interfaceC1003i;
            secureRandomM2709a = null;
        }
        if (!(z && !this.f4576a.mo2751a())) {
            secureRandomM2709a = null;
        } else if (secureRandomM2709a == null) {
            secureRandomM2709a = C1124l.m2709a();
        }
        this.f4578c = secureRandomM2709a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2717a(byte[] bArr) {
        C1115r c1115rM2680b = this.f4577b.m2680b();
        BigInteger bigIntegerM2687b = c1115rM2680b.m2687b();
        BigInteger bigIntegerM2753a = m2753a(bigIntegerM2687b, bArr);
        BigInteger bigIntegerM2690c = ((C1116s) this.f4577b).m2690c();
        if (this.f4576a.mo2751a()) {
            this.f4576a.mo2749a(bigIntegerM2687b, bigIntegerM2690c, bArr);
        } else {
            this.f4576a.mo2750a(bigIntegerM2687b, this.f4578c);
        }
        BigInteger bigIntegerMo2752b = this.f4576a.mo2752b();
        BigInteger bigIntegerM2688c = c1115rM2680b.m2688c();
        SecureRandom secureRandomM2709a = this.f4578c;
        if (secureRandomM2709a == null) {
            secureRandomM2709a = C1124l.m2709a();
        }
        BigInteger bigIntegerMod = bigIntegerM2688c.modPow(bigIntegerMo2752b.add(C1544b.m4114a(7, secureRandomM2709a).add(BigInteger.valueOf(128L)).multiply(bigIntegerM2687b)), c1115rM2680b.m2686a()).mod(bigIntegerM2687b);
        return new BigInteger[]{bigIntegerMod, bigIntegerMo2752b.modInverse(bigIntegerM2687b).multiply(bigIntegerM2753a.add(bigIntegerM2690c.multiply(bigIntegerMod))).mod(bigIntegerM2687b)};
    }
}
