package org.bouncycastle.p083b.p089e;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.e.an */
/* JADX INFO: loaded from: classes.dex */
public final class C0905an implements InterfaceC0786a {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f3727a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b */
    private C0906ao f3728b = new C0906ao();

    /* JADX INFO: renamed from: c */
    private C1088bm f3729c;

    /* JADX INFO: renamed from: d */
    private SecureRandom f3730d;

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final int mo1868a() {
        return this.f3728b.m2185a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final void mo1869a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3728b.m2187a(z, interfaceC1003i);
        if (!(interfaceC1003i instanceof C1081bf)) {
            this.f3729c = (C1088bm) interfaceC1003i;
            this.f3730d = C1124l.m2709a();
        } else {
            C1081bf c1081bf = (C1081bf) interfaceC1003i;
            this.f3729c = (C1088bm) c1081bf.m2614b();
            this.f3730d = c1081bf.m2613a();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final byte[] mo1870a(byte[] bArr, int i, int i2) {
        BigInteger bigIntegerM2190b;
        C1089bn c1089bn;
        BigInteger bigIntegerM2627d;
        if (this.f3729c == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        BigInteger bigIntegerM2186a = this.f3728b.m2186a(bArr, i, i2);
        if (!(this.f3729c instanceof C1089bn) || (bigIntegerM2627d = (c1089bn = (C1089bn) this.f3729c).m2627d()) == null) {
            bigIntegerM2190b = this.f3728b.m2190b(bigIntegerM2186a);
        } else {
            BigInteger bigIntegerB = c1089bn.m2625b();
            BigInteger bigIntegerM4115a = C1544b.m4115a(f3727a, bigIntegerB.subtract(f3727a), this.f3730d);
            bigIntegerM2190b = this.f3728b.m2190b(bigIntegerM4115a.modPow(bigIntegerM2627d, bigIntegerB).multiply(bigIntegerM2186a).mod(bigIntegerB)).multiply(bigIntegerM4115a.modInverse(bigIntegerB)).mod(bigIntegerB);
            if (!bigIntegerM2186a.equals(bigIntegerM2190b.modPow(bigIntegerM2627d, bigIntegerB))) {
                throw new IllegalStateException("RSA engine faulty decryption/signing detected");
            }
        }
        return this.f3728b.m2188a(bigIntegerM2190b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: b */
    public final int mo1871b() {
        return this.f3728b.m2189b();
    }
}
