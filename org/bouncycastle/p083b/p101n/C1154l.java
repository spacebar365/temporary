package org.bouncycastle.p083b.p101n;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.n.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1154l implements InterfaceC1144b {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4603a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b */
    private final C0994g f4604b;

    /* JADX INFO: renamed from: c */
    private final byte[] f4605c;

    /* JADX INFO: renamed from: d */
    private final byte[] f4606d;

    /* JADX INFO: renamed from: e */
    private BigInteger f4607e;

    public C1154l(InterfaceC1175r interfaceC1175r) {
        this.f4604b = new C0994g(interfaceC1175r);
        this.f4606d = new byte[this.f4604b.mo2451b()];
        this.f4605c = new byte[this.f4604b.mo2451b()];
    }

    /* JADX INFO: renamed from: a */
    private BigInteger m2762a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f4607e.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f4607e.bitLength()) : bigInteger;
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: a */
    public final void mo2749a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f4607e = bigInteger;
        C1535a.m4071a(this.f4606d, (byte) 1);
        C1535a.m4071a(this.f4605c, (byte) 0);
        int iM4119b = C1544b.m4119b(bigInteger);
        byte[] bArr2 = new byte[iM4119b];
        byte[] bArrM4118a = C1544b.m4118a(bigInteger2);
        System.arraycopy(bArrM4118a, 0, bArr2, bArr2.length - bArrM4118a.length, bArrM4118a.length);
        byte[] bArr3 = new byte[iM4119b];
        BigInteger bigIntegerM2762a = m2762a(bArr);
        if (bigIntegerM2762a.compareTo(bigInteger) >= 0) {
            bigIntegerM2762a = bigIntegerM2762a.subtract(bigInteger);
        }
        byte[] bArrM4118a2 = C1544b.m4118a(bigIntegerM2762a);
        System.arraycopy(bArrM4118a2, 0, bArr3, bArr3.length - bArrM4118a2.length, bArrM4118a2.length);
        this.f4604b.mo2449a(new C1076ba(this.f4605c));
        this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
        this.f4604b.mo2448a((byte) 0);
        this.f4604b.mo2450a(bArr2, 0, bArr2.length);
        this.f4604b.mo2450a(bArr3, 0, bArr3.length);
        this.f4604b.mo2446a(this.f4605c, 0);
        this.f4604b.mo2449a(new C1076ba(this.f4605c));
        this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
        this.f4604b.mo2446a(this.f4606d, 0);
        this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
        this.f4604b.mo2448a((byte) 1);
        this.f4604b.mo2450a(bArr2, 0, bArr2.length);
        this.f4604b.mo2450a(bArr3, 0, bArr3.length);
        this.f4604b.mo2446a(this.f4605c, 0);
        this.f4604b.mo2449a(new C1076ba(this.f4605c));
        this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
        this.f4604b.mo2446a(this.f4606d, 0);
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: a */
    public final void mo2750a(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: a */
    public final boolean mo2751a() {
        return true;
    }

    @Override // org.bouncycastle.p083b.p101n.InterfaceC1144b
    /* JADX INFO: renamed from: b */
    public final BigInteger mo2752b() {
        byte[] bArr = new byte[C1544b.m4119b(this.f4607e)];
        while (true) {
            int i = 0;
            while (i < bArr.length) {
                this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
                this.f4604b.mo2446a(this.f4606d, 0);
                int iMin = Math.min(bArr.length - i, this.f4606d.length);
                System.arraycopy(this.f4606d, 0, bArr, i, iMin);
                i += iMin;
            }
            BigInteger bigIntegerM2762a = m2762a(bArr);
            if (bigIntegerM2762a.compareTo(f4603a) > 0 && bigIntegerM2762a.compareTo(this.f4607e) < 0) {
                return bigIntegerM2762a;
            }
            this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
            this.f4604b.mo2448a((byte) 0);
            this.f4604b.mo2446a(this.f4605c, 0);
            this.f4604b.mo2449a(new C1076ba(this.f4605c));
            this.f4604b.mo2450a(this.f4606d, 0, this.f4606d.length);
            this.f4604b.mo2446a(this.f4606d, 0);
        }
    }
}
