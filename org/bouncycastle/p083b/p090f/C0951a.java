package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.InterfaceC1174q;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1176s;
import org.bouncycastle.p083b.p097k.C1072ax;
import org.bouncycastle.p083b.p097k.C1074az;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.f.a */
/* JADX INFO: loaded from: classes.dex */
public class C0951a implements InterfaceC1176s {

    /* JADX INFO: renamed from: a */
    private int f3992a = 1;

    /* JADX INFO: renamed from: b */
    private InterfaceC1175r f3993b;

    /* JADX INFO: renamed from: c */
    private byte[] f3994c;

    /* JADX INFO: renamed from: d */
    private byte[] f3995d;

    protected C0951a(InterfaceC1175r interfaceC1175r) {
        this.f3993b = interfaceC1175r;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final int mo1876a(byte[] bArr, int i, int i2) {
        if (bArr.length - i2 < 0) {
            throw new C0803ac("output buffer too small");
        }
        long j = i2;
        int iMo1930b = this.f3993b.mo1930b();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int i3 = (int) (((((long) iMo1930b) + j) - 1) / ((long) iMo1930b));
        byte[] bArr2 = new byte[this.f3993b.mo1930b()];
        byte[] bArr3 = new byte[4];
        AbstractC1556g.m4136a(this.f3992a, bArr3, 0);
        int i4 = this.f3992a & (-256);
        int i5 = i2;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            this.f3993b.mo1929a(this.f3994c, 0, this.f3994c.length);
            this.f3993b.mo1929a(bArr3, 0, 4);
            if (this.f3995d != null) {
                this.f3993b.mo1929a(this.f3995d, 0, this.f3995d.length);
            }
            this.f3993b.mo1926a(bArr2, 0);
            if (i5 > iMo1930b) {
                System.arraycopy(bArr2, 0, bArr, i6, iMo1930b);
                i6 += iMo1930b;
                i5 -= iMo1930b;
            } else {
                System.arraycopy(bArr2, 0, bArr, i6, i5);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i4 += 256;
                AbstractC1556g.m4136a(i4, bArr3, 0);
            }
        }
        this.f3993b.mo1931c();
        return (int) j;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1173p
    /* JADX INFO: renamed from: a */
    public final void mo1877a(InterfaceC1174q interfaceC1174q) {
        if (interfaceC1174q instanceof C1074az) {
            C1074az c1074az = (C1074az) interfaceC1174q;
            this.f3994c = c1074az.m2600a();
            this.f3995d = c1074az.m2601b();
        } else {
            if (!(interfaceC1174q instanceof C1072ax)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.f3994c = ((C1072ax) interfaceC1174q).m2595a();
            this.f3995d = null;
        }
    }
}
