package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.AbstractC0814an;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;

/* JADX INFO: renamed from: org.bouncycastle.b.i.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1020e extends C0950f {

    /* JADX INFO: renamed from: g */
    private int f4199g;

    public C1020e(InterfaceC0890e interfaceC0890e) {
        if (interfaceC0890e instanceof AbstractC0814an) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.f3989d = interfaceC0890e;
        this.f4199g = interfaceC0890e.mo2125b();
        this.f3986a = new byte[this.f4199g * 2];
        this.f3987b = 0;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final int mo2399a(int i) {
        int i2 = this.f3987b + i;
        int length = i2 % this.f3986a.length;
        return length == 0 ? i2 - this.f3986a.length : i2 - length;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final int mo2400a(byte[] bArr, int i) {
        if (this.f3987b + i > bArr.length) {
            throw new C0803ac("output buffer to small in doFinal");
        }
        int iMo2125b = this.f3989d.mo2125b();
        int i2 = this.f3987b - iMo2125b;
        byte[] bArr2 = new byte[iMo2125b];
        if (this.f3988c) {
            if (this.f3987b < iMo2125b) {
                throw new C1163o("need at least one block of input for CTS");
            }
            this.f3989d.mo2122a(this.f3986a, 0, bArr2, 0);
            if (this.f3987b > iMo2125b) {
                for (int i3 = this.f3987b; i3 != this.f3986a.length; i3++) {
                    this.f3986a[i3] = bArr2[i3 - iMo2125b];
                }
                for (int i4 = iMo2125b; i4 != this.f3987b; i4++) {
                    byte[] bArr3 = this.f3986a;
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr2[i4 - iMo2125b]);
                }
                if (this.f3989d instanceof C1010b) {
                    ((C1010b) this.f3989d).m2491d().mo2122a(this.f3986a, iMo2125b, bArr, i);
                } else {
                    this.f3989d.mo2122a(this.f3986a, iMo2125b, bArr, i);
                }
                System.arraycopy(bArr2, 0, bArr, i + iMo2125b, i2);
            } else {
                System.arraycopy(bArr2, 0, bArr, i, iMo2125b);
            }
        } else {
            if (this.f3987b < iMo2125b) {
                throw new C1163o("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[iMo2125b];
            if (this.f3987b > iMo2125b) {
                if (this.f3989d instanceof C1010b) {
                    ((C1010b) this.f3989d).m2491d().mo2122a(this.f3986a, 0, bArr2, 0);
                } else {
                    this.f3989d.mo2122a(this.f3986a, 0, bArr2, 0);
                }
                for (int i5 = iMo2125b; i5 != this.f3987b; i5++) {
                    bArr4[i5 - iMo2125b] = (byte) (bArr2[i5 - iMo2125b] ^ this.f3986a[i5]);
                }
                System.arraycopy(this.f3986a, iMo2125b, bArr2, 0, i2);
                this.f3989d.mo2122a(bArr2, 0, bArr, i);
                System.arraycopy(bArr4, 0, bArr, i + iMo2125b, i2);
            } else {
                this.f3989d.mo2122a(this.f3986a, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, iMo2125b);
            }
        }
        int i6 = this.f3987b;
        m2406c();
        return i6;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: a */
    public final int mo2401a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iMo2122a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iB = m2404b();
        int iMo2399a = mo2399a(i2);
        if (iMo2399a > 0 && iMo2399a + i3 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        int length = this.f3986a.length - this.f3987b;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.f3986a, this.f3987b, length);
            iMo2122a = this.f3989d.mo2122a(this.f3986a, 0, bArr2, i3) + 0;
            byte[] bArr3 = this.f3986a;
            System.arraycopy(bArr3, iB, bArr3, 0, iB);
            this.f3987b = iB;
            i2 -= length;
            i += length;
            while (i2 > iB) {
                System.arraycopy(bArr, i, this.f3986a, this.f3987b, iB);
                iMo2122a += this.f3989d.mo2122a(this.f3986a, 0, bArr2, i3 + iMo2122a);
                byte[] bArr4 = this.f3986a;
                System.arraycopy(bArr4, iB, bArr4, 0, iB);
                i2 -= iB;
                i += iB;
            }
        } else {
            iMo2122a = 0;
        }
        System.arraycopy(bArr, i, this.f3986a, this.f3987b, i2);
        this.f3987b += i2;
        return iMo2122a;
    }

    @Override // org.bouncycastle.p083b.C0950f
    /* JADX INFO: renamed from: b */
    public final int mo2405b(int i) {
        return this.f3987b + i;
    }
}
