package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.f.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0975v extends AbstractC0804ad {

    /* JADX INFO: renamed from: d */
    private InterfaceC1175r f4044d;

    /* JADX INFO: renamed from: e */
    private int f4045e;

    /* JADX INFO: renamed from: f */
    private int f4046f;

    public C0975v(InterfaceC1175r interfaceC1175r) {
        this.f4044d = interfaceC1175r;
        this.f4045e = interfaceC1175r.mo1930b();
        this.f4046f = ((InterfaceC1178u) interfaceC1175r).mo1932d();
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1897a(int i) {
        int i2 = i / 8;
        return new C1076ba(m2439b(1, i2), 0, i2);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC1003i mo1898a(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] bArrM2439b = m2439b(1, i3);
        return new C1080be(new C1076ba(bArrM2439b, 0, i3), m2439b(2, i4), 0, i4);
    }

    @Override // org.bouncycastle.p083b.AbstractC0804ad
    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i mo1900b(int i) {
        int i2 = i / 8;
        return new C1076ba(m2439b(3, i2), 0, i2);
    }

    /* JADX INFO: renamed from: b */
    private byte[] m2439b(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = new byte[this.f4046f];
        byte[] bArr4 = new byte[i2];
        for (int i3 = 0; i3 != bArr3.length; i3++) {
            bArr3[i3] = (byte) i;
        }
        if (this.f3325b == null || this.f3325b.length == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr5 = new byte[this.f4046f * (((this.f3325b.length + this.f4046f) - 1) / this.f4046f)];
            for (int i4 = 0; i4 != bArr5.length; i4++) {
                byte[] bArr6 = this.f3325b;
                bArr5[i4] = bArr6[i4 % bArr6.length];
            }
            bArr = bArr5;
        }
        if (this.f3324a == null || this.f3324a.length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr7 = new byte[this.f4046f * (((this.f3324a.length + this.f4046f) - 1) / this.f4046f)];
            for (int i5 = 0; i5 != bArr7.length; i5++) {
                byte[] bArr8 = this.f3324a;
                bArr7[i5] = bArr8[i5 % bArr8.length];
            }
            bArr2 = bArr7;
        }
        byte[] bArr9 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        byte[] bArr10 = new byte[this.f4046f];
        int i6 = ((this.f4045e + i2) - 1) / this.f4045e;
        byte[] bArr11 = new byte[this.f4045e];
        for (int i7 = 1; i7 <= i6; i7++) {
            this.f4044d.mo1929a(bArr3, 0, bArr3.length);
            this.f4044d.mo1929a(bArr9, 0, bArr9.length);
            this.f4044d.mo1926a(bArr11, 0);
            for (int i8 = 1; i8 < this.f3326c; i8++) {
                this.f4044d.mo1929a(bArr11, 0, bArr11.length);
                this.f4044d.mo1926a(bArr11, 0);
            }
            for (int i9 = 0; i9 != bArr10.length; i9++) {
                bArr10[i9] = bArr11[i9 % bArr11.length];
            }
            for (int i10 = 0; i10 != bArr9.length / this.f4046f; i10++) {
                int i11 = i10 * this.f4046f;
                int i12 = (bArr10[bArr10.length - 1] & 255) + (bArr9[(bArr10.length + i11) - 1] & 255) + 1;
                bArr9[(bArr10.length + i11) - 1] = (byte) i12;
                int i13 = i12 >>> 8;
                for (int length = bArr10.length - 2; length >= 0; length--) {
                    int i14 = i13 + (bArr10[length] & 255) + (bArr9[i11 + length] & 255);
                    bArr9[i11 + length] = (byte) i14;
                    i13 = i14 >>> 8;
                }
            }
            if (i7 == i6) {
                System.arraycopy(bArr11, 0, bArr4, (i7 - 1) * this.f4045e, bArr4.length - ((i7 - 1) * this.f4045e));
            } else {
                System.arraycopy(bArr11, 0, bArr4, (i7 - 1) * this.f4045e, bArr11.length);
            }
        }
        return bArr4;
    }
}
