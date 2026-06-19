package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.n.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1161s implements InterfaceC1143a {

    /* JADX INFO: renamed from: a */
    public static final C1161s f4644a = new C1161s();

    /* JADX INFO: renamed from: a */
    private static BigInteger m2777a(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2778a(BigInteger bigInteger, AbstractC0723v abstractC0723v, int i) {
        return m2777a(bigInteger, ((C0640m) abstractC0723v.mo1482a(i)).m1564b());
    }

    /* JADX INFO: renamed from: a */
    private static void m2779a(BigInteger bigInteger, C0625g c0625g, BigInteger bigInteger2) {
        c0625g.m1521a(new C0640m(m2777a(bigInteger, bigInteger2)));
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1143a
    /* JADX INFO: renamed from: a */
    public final byte[] mo2747a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        C0625g c0625g = new C0625g();
        m2779a(bigInteger, c0625g, bigInteger2);
        m2779a(bigInteger, c0625g, bigInteger3);
        return new C0585bi(c0625g).m1577a("DER");
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1143a
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2748a(BigInteger bigInteger, byte[] bArr) {
        AbstractC0723v abstractC0723v = (AbstractC0723v) AbstractC0686u.m1692b(bArr);
        if (abstractC0723v.mo1484d() == 2) {
            BigInteger bigIntegerM2778a = m2778a(bigInteger, abstractC0723v, 0);
            BigInteger bigIntegerM2778a2 = m2778a(bigInteger, abstractC0723v, 1);
            if (C1535a.m4076a(mo2747a(bigInteger, bigIntegerM2778a, bigIntegerM2778a2), bArr)) {
                return new BigInteger[]{bigIntegerM2778a, bigIntegerM2778a2};
            }
        }
        throw new IllegalArgumentException("Malformed signature");
    }
}
