package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0801aa;
import org.bouncycastle.p083b.InterfaceC1174q;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1073ay;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.f.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0973t implements InterfaceC0801aa {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f4033a = BigInteger.valueOf(2147483647L);

    /* JADX INFO: renamed from: b */
    private static final BigInteger f4034b = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: c */
    private final InterfaceC1183z f4035c;

    /* JADX INFO: renamed from: d */
    private final int f4036d;

    /* JADX INFO: renamed from: e */
    private byte[] f4037e;

    /* JADX INFO: renamed from: f */
    private byte[] f4038f;

    /* JADX INFO: renamed from: g */
    private int f4039g;

    /* JADX INFO: renamed from: h */
    private byte[] f4040h;

    /* JADX INFO: renamed from: i */
    private int f4041i;

    /* JADX INFO: renamed from: j */
    private byte[] f4042j;

    public C0973t(InterfaceC1183z interfaceC1183z) {
        this.f4035c = interfaceC1183z;
        this.f4036d = interfaceC1183z.mo2451b();
        this.f4042j = new byte[this.f4036d];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    private void m2436a() {
        int i = (this.f4041i / this.f4036d) + 1;
        switch (this.f4040h.length) {
            case 1:
                this.f4040h[this.f4040h.length - 1] = (byte) i;
                this.f4035c.mo2450a(this.f4037e, 0, this.f4037e.length);
                this.f4035c.mo2450a(this.f4040h, 0, this.f4040h.length);
                this.f4035c.mo2450a(this.f4038f, 0, this.f4038f.length);
                this.f4035c.mo2446a(this.f4042j, 0);
                return;
            case 2:
                this.f4040h[this.f4040h.length - 2] = (byte) (i >>> 8);
                this.f4040h[this.f4040h.length - 1] = (byte) i;
                this.f4035c.mo2450a(this.f4037e, 0, this.f4037e.length);
                this.f4035c.mo2450a(this.f4040h, 0, this.f4040h.length);
                this.f4035c.mo2450a(this.f4038f, 0, this.f4038f.length);
                this.f4035c.mo2446a(this.f4042j, 0);
                return;
            case 3:
                this.f4040h[this.f4040h.length - 3] = (byte) (i >>> 16);
                this.f4040h[this.f4040h.length - 2] = (byte) (i >>> 8);
                this.f4040h[this.f4040h.length - 1] = (byte) i;
                this.f4035c.mo2450a(this.f4037e, 0, this.f4037e.length);
                this.f4035c.mo2450a(this.f4040h, 0, this.f4040h.length);
                this.f4035c.mo2450a(this.f4038f, 0, this.f4038f.length);
                this.f4035c.mo2446a(this.f4042j, 0);
                return;
            case 4:
                this.f4040h[0] = (byte) (i >>> 24);
                this.f4040h[this.f4040h.length - 3] = (byte) (i >>> 16);
                this.f4040h[this.f4040h.length - 2] = (byte) (i >>> 8);
                this.f4040h[this.f4040h.length - 1] = (byte) i;
                this.f4035c.mo2450a(this.f4037e, 0, this.f4037e.length);
                this.f4035c.mo2450a(this.f4040h, 0, this.f4040h.length);
                this.f4035c.mo2450a(this.f4038f, 0, this.f4038f.length);
                this.f4035c.mo2446a(this.f4042j, 0);
                return;
            default:
                throw new IllegalStateException("Unsupported size of counter i");
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final int mo1876a(byte[] bArr, int i, int i2) {
        int i3 = this.f4041i + i2;
        if (i3 < 0 || i3 >= this.f4039g) {
            throw new C1163o("Current KDFCTR may only be used for " + this.f4039g + " bytes");
        }
        if (this.f4041i % this.f4036d == 0) {
            m2436a();
        }
        int i4 = this.f4041i % this.f4036d;
        int iMin = Math.min(this.f4036d - (this.f4041i % this.f4036d), i2);
        System.arraycopy(this.f4042j, i4, bArr, 0, iMin);
        this.f4041i += iMin;
        int i5 = i2 - iMin;
        int i6 = iMin + 0;
        while (i5 > 0) {
            m2436a();
            int iMin2 = Math.min(this.f4036d, i5);
            System.arraycopy(this.f4042j, 0, bArr, i6, iMin2);
            this.f4041i += iMin2;
            i5 -= iMin2;
            i6 += iMin2;
        }
        return i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final void mo1877a(InterfaceC1174q interfaceC1174q) {
        if (!(interfaceC1174q instanceof C1073ay)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        C1073ay c1073ay = (C1073ay) interfaceC1174q;
        this.f4035c.mo2449a(new C1076ba(c1073ay.m2596a()));
        this.f4037e = c1073ay.m2597b();
        this.f4038f = c1073ay.m2598c();
        int iM2599d = c1073ay.m2599d();
        this.f4040h = new byte[iM2599d / 8];
        BigInteger bigIntegerMultiply = f4034b.pow(iM2599d).multiply(BigInteger.valueOf(this.f4036d));
        this.f4039g = bigIntegerMultiply.compareTo(f4033a) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.f4041i = 0;
    }
}
