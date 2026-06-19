package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1159q implements InterfaceC1144b {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4634a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b */
    private BigInteger f4635b;

    /* JADX INFO: renamed from: c */
    private SecureRandom f4636c;

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: a */
    public final void mo2749a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: a */
    public final void mo2750a(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f4635b = bigInteger;
        this.f4636c = secureRandom;
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: a */
    public final boolean mo2751a() {
        return false;
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: b */
    public final BigInteger mo2752b() {
        int iBitLength = this.f4635b.bitLength();
        while (true) {
            BigInteger bigIntegerM4114a = C1544b.m4114a(iBitLength, this.f4636c);
            if (!bigIntegerM4114a.equals(f4634a) && bigIntegerM4114a.compareTo(this.f4635b) < 0) {
                return bigIntegerM4114a;
            }
        }
    }
}
