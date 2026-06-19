package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1158p implements InterfaceC1143a {

    /* JADX INFO: renamed from: a */
    public static final C1158p f4633a = new C1158p();

    /* JADX INFO: renamed from: a */
    private static BigInteger m2770a(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    /* JADX INFO: renamed from: a */
    private static BigInteger m2771a(BigInteger bigInteger, byte[] bArr, int i, int i2) {
        return m2770a(bigInteger, new BigInteger(1, C1535a.m4090c(bArr, i, i + i2)));
    }

    /* JADX INFO: renamed from: a */
    private static void m2772a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i, int i2) {
        byte[] byteArray = m2770a(bigInteger, bigInteger2).toByteArray();
        int iMax = Math.max(0, byteArray.length - i2);
        int length = byteArray.length - iMax;
        int i3 = i2 - length;
        C1535a.m4084b(bArr, i, i + i3);
        System.arraycopy(byteArray, iMax, bArr, i3 + i, length);
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1143a
    /* JADX INFO: renamed from: a */
    public final byte[] mo2747a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int iM4119b = C1544b.m4119b(bigInteger);
        byte[] bArr = new byte[iM4119b * 2];
        m2772a(bigInteger, bigInteger2, bArr, 0, iM4119b);
        m2772a(bigInteger, bigInteger3, bArr, iM4119b, iM4119b);
        return bArr;
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1143a
    /* JADX INFO: renamed from: a */
    public final BigInteger[] mo2748a(BigInteger bigInteger, byte[] bArr) {
        int iM4119b = C1544b.m4119b(bigInteger);
        if (bArr.length != iM4119b * 2) {
            throw new IllegalArgumentException("Encoding has incorrect length");
        }
        return new BigInteger[]{m2771a(bigInteger, bArr, 0, iM4119b), m2771a(bigInteger, bArr, iM4119b, iM4119b)};
    }
}
