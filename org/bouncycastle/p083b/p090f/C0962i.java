package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1112o;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p083b.p097k.C1117t;
import org.bouncycastle.p107d.p108a.AbstractC1364aa;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.f.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0962i implements InterfaceC0850c {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4009a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b */
    private C1112o f4010b;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        this.f4010b = (C1112o) c1181x;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final C0818b mo2108a() {
        BigInteger bigIntegerM4115a;
        C1115r c1115rM2679c = this.f4010b.m2679c();
        BigInteger bigIntegerM2687b = c1115rM2679c.m2687b();
        SecureRandom secureRandomA = this.f4010b.m2824a();
        int iBitLength = bigIntegerM2687b.bitLength() >>> 2;
        do {
            bigIntegerM4115a = C1544b.m4115a(f4009a, bigIntegerM2687b.subtract(f4009a), secureRandomA);
        } while (AbstractC1364aa.m3257a(bigIntegerM4115a) < iBitLength);
        return new C0818b(new C1117t(c1115rM2679c.m2688c().modPow(bigIntegerM4115a, c1115rM2679c.m2686a()), c1115rM2679c), new C1116s(bigIntegerM4115a, c1115rM2679c));
    }
}
