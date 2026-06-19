package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p107d.p108a.AbstractC1364aa;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.f.e */
/* JADX INFO: loaded from: classes.dex */
final class C0958e {

    /* JADX INFO: renamed from: a */
    static final C0958e f3999a = new C0958e();

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4000b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c */
    private static final BigInteger f4001c = BigInteger.valueOf(2);

    private C0958e() {
    }

    /* JADX INFO: renamed from: a */
    static BigInteger m2417a(C1106i c1106i, BigInteger bigInteger) {
        return c1106i.m2665b().modPow(bigInteger, c1106i.m2664a());
    }

    /* JADX INFO: renamed from: a */
    static BigInteger m2418a(C1106i c1106i, SecureRandom secureRandom) {
        BigInteger bigIntegerM4115a;
        BigInteger bit;
        int iM2669f = c1106i.m2669f();
        if (iM2669f != 0) {
            int i = iM2669f >>> 2;
            do {
                bit = C1544b.m4114a(iM2669f, secureRandom).setBit(iM2669f - 1);
            } while (AbstractC1364aa.m3257a(bit) < i);
            return bit;
        }
        BigInteger bigIntegerShiftLeft = f4001c;
        int iM2668e = c1106i.m2668e();
        if (iM2668e != 0) {
            bigIntegerShiftLeft = f4000b.shiftLeft(iM2668e - 1);
        }
        BigInteger bigIntegerM2666c = c1106i.m2666c();
        if (bigIntegerM2666c == null) {
            bigIntegerM2666c = c1106i.m2664a();
        }
        BigInteger bigIntegerSubtract = bigIntegerM2666c.subtract(f4001c);
        int iBitLength = bigIntegerSubtract.bitLength() >>> 2;
        do {
            bigIntegerM4115a = C1544b.m4115a(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
        } while (AbstractC1364aa.m3257a(bigIntegerM4115a) < iBitLength);
        return bigIntegerM4115a;
    }
}
