package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.p097k.C1066ar;
import org.bouncycastle.p083b.p097k.C1067as;
import org.bouncycastle.p083b.p097k.C1068at;
import org.bouncycastle.p083b.p097k.C1069au;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1153k implements InterfaceC1142n {

    /* JADX INFO: renamed from: a */
    C1066ar f4601a;

    /* JADX INFO: renamed from: b */
    SecureRandom f4602b;

    @Override // org.bouncycastle.p083b.InterfaceC1142n
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2746a() {
        return this.f4601a.m2585b().m2587b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final void mo2715a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!z) {
            this.f4601a = (C1069au) interfaceC1003i;
            return;
        }
        if (!(interfaceC1003i instanceof C1081bf)) {
            this.f4602b = C1124l.m2709a();
            this.f4601a = (C1068at) interfaceC1003i;
        } else {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f4602b = c1081bf.m2613a();
            this.f4601a = (C1068at) c1081bf.m2614b();
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
        C1067as c1067asM2585b = this.f4601a.m2585b();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || c1067asM2585b.m2587b().compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || c1067asM2585b.m2587b().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModPow = bigInteger3.modPow(c1067asM2585b.m2587b().subtract(new BigInteger("2")), c1067asM2585b.m2587b());
        return c1067asM2585b.m2588c().modPow(bigInteger2.multiply(bigIntegerModPow).mod(c1067asM2585b.m2587b()), c1067asM2585b.m2586a()).multiply(((C1069au) this.f4601a).m2590c().modPow(c1067asM2585b.m2587b().subtract(bigInteger).multiply(bigIntegerModPow).mod(c1067asM2585b.m2587b()), c1067asM2585b.m2586a())).mod(c1067asM2585b.m2586a()).mod(c1067asM2585b.m2587b()).equals(bigInteger);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1127m
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2717a(byte[] bArr) {
        BigInteger bigIntegerM4114a;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i != bArr2.length; i++) {
            bArr2[i] = bArr[(bArr2.length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        C1067as c1067asM2585b = this.f4601a.m2585b();
        do {
            bigIntegerM4114a = C1544b.m4114a(c1067asM2585b.m2587b().bitLength(), this.f4602b);
        } while (bigIntegerM4114a.compareTo(c1067asM2585b.m2587b()) >= 0);
        BigInteger bigIntegerMod = c1067asM2585b.m2588c().modPow(bigIntegerM4114a, c1067asM2585b.m2586a()).mod(c1067asM2585b.m2587b());
        return new BigInteger[]{bigIntegerMod, bigIntegerM4114a.multiply(bigInteger).add(((C1068at) this.f4601a).m2589c().multiply(bigIntegerMod)).mod(c1067asM2585b.m2587b())};
    }
}
