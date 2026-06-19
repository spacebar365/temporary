package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.f.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0977x extends AbstractC0804ad {

    /* JADX INFO: renamed from: d */
    private InterfaceC1183z f4048d;

    /* JADX INFO: renamed from: e */
    private byte[] f4049e;

    public C0977x(InterfaceC1175r interfaceC1175r) {
        this.f4048d = new C0994g(interfaceC1175r);
        this.f4049e = new byte[this.f4048d.mo2451b()];
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1897a(int i) {
        int i2 = i / 8;
        return new C1076ba(C1535a.m4090c(m2441c(i2), 0, i2), 0, i2);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1898a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrM2441c = m2441c(i3 + i4);
        return new C1080be(new C1076ba(bArrM2441c, 0, i3), bArrM2441c, i3, i4);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i mo1900b(int i) {
        return mo1897a(i);
    }

    public C0977x() {
        this(new C0842s());
    }

    /* JADX INFO: renamed from: c */
    private byte[] m2441c(int i) {
        int iMo2451b = this.f4048d.mo2451b();
        int i2 = ((i + iMo2451b) - 1) / iMo2451b;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i2 * iMo2451b];
        this.f4048d.mo2449a(new C1076ba(this.f3324a));
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = 3;
            while (true) {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != 0) {
                    break;
                }
                i5--;
            }
            byte[] bArr3 = this.f3325b;
            int i6 = this.f3326c;
            if (i6 == 0) {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
            if (bArr3 != null) {
                this.f4048d.mo2450a(bArr3, 0, bArr3.length);
            }
            this.f4048d.mo2450a(bArr, 0, 4);
            this.f4048d.mo2446a(this.f4049e, 0);
            System.arraycopy(this.f4049e, 0, bArr2, i4, this.f4049e.length);
            for (int i7 = 1; i7 < i6; i7++) {
                this.f4048d.mo2450a(this.f4049e, 0, this.f4049e.length);
                this.f4048d.mo2446a(this.f4049e, 0);
                for (int i8 = 0; i8 != this.f4049e.length; i8++) {
                    int i9 = i4 + i8;
                    bArr2[i9] = (byte) (bArr2[i9] ^ this.f4049e[i8]);
                }
            }
            i3++;
            i4 += iMo2451b;
        }
        return bArr2;
    }
}
