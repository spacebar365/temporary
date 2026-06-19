package org.bouncycastle.p083b.p101n;

import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC0812al;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.n.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1155m implements InterfaceC0812al {

    /* JADX INFO: renamed from: a */
    private InterfaceC1175r f4608a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0786a f4609b;

    /* JADX INFO: renamed from: c */
    private int f4610c = 188;

    /* JADX INFO: renamed from: d */
    private int f4611d;

    /* JADX INFO: renamed from: e */
    private byte[] f4612e;

    /* JADX INFO: renamed from: f */
    private byte[] f4613f;

    /* JADX INFO: renamed from: g */
    private int f4614g;

    /* JADX INFO: renamed from: h */
    private boolean f4615h;

    /* JADX INFO: renamed from: i */
    private byte[] f4616i;

    /* JADX INFO: renamed from: j */
    private byte[] f4617j;

    /* JADX INFO: renamed from: k */
    private byte[] f4618k;

    public C1155m(InterfaceC0786a interfaceC0786a, InterfaceC1175r interfaceC1175r) {
        this.f4609b = interfaceC0786a;
        this.f4608a = interfaceC1175r;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2763a(byte[] bArr, byte[] bArr2) {
        boolean z;
        if (this.f4614g > this.f4613f.length) {
            z = this.f4613f.length <= bArr2.length;
            for (int i = 0; i != this.f4613f.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    z = false;
                }
            }
        } else {
            z = this.f4614g == bArr2.length;
            for (int i2 = 0; i2 != bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private static void m2764b(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m2765c(byte[] bArr) {
        this.f4614g = 0;
        m2764b(this.f4613f);
        m2764b(bArr);
        return false;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1903a(byte b) {
        this.f4608a.mo1928a(b);
        if (this.f4614g < this.f4613f.length) {
            this.f4613f[this.f4614g] = b;
        }
        this.f4614g++;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1905a(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.f4614g < this.f4613f.length) {
            mo1903a(bArr[i]);
            i++;
            i2--;
        }
        this.f4608a.mo1929a(bArr, i, i2);
        this.f4614g += i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final boolean mo1906a(byte[] bArr) {
        byte[] bArrMo1870a;
        int i;
        if (this.f4617j == null) {
            try {
                bArrMo1870a = this.f4609b.mo1870a(bArr, 0, bArr.length);
            } catch (Exception e) {
                return false;
            }
        } else {
            if (!C1535a.m4076a(this.f4617j, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrMo1870a = this.f4618k;
            this.f4617j = null;
            this.f4618k = null;
        }
        if (((bArrMo1870a[0] & 192) ^ 64) == 0 && ((bArrMo1870a[bArrMo1870a.length - 1] & 15) ^ 12) == 0) {
            if (((bArrMo1870a[bArrMo1870a.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                int i2 = ((bArrMo1870a[bArrMo1870a.length - 2] & 255) << 8) | (bArrMo1870a[bArrMo1870a.length - 1] & 255);
                Integer numM2766a = C1156n.m2766a(this.f4608a);
                if (numM2766a == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int iIntValue = numM2766a.intValue();
                if (i2 != iIntValue && (iIntValue != 15052 || i2 != 16588)) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer ".concat(String.valueOf(i2)));
                }
                i = 2;
            }
            int i3 = 0;
            while (i3 != bArrMo1870a.length && ((bArrMo1870a[i3] & 15) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            byte[] bArr2 = new byte[this.f4608a.mo1930b()];
            int length = (bArrMo1870a.length - i) - bArr2.length;
            if (length - i4 <= 0) {
                return m2765c(bArrMo1870a);
            }
            if ((bArrMo1870a[0] & 32) == 0) {
                this.f4615h = true;
                if (this.f4614g > length - i4) {
                    return m2765c(bArrMo1870a);
                }
                this.f4608a.mo1931c();
                this.f4608a.mo1929a(bArrMo1870a, i4, length - i4);
                this.f4608a.mo1926a(bArr2, 0);
                boolean z = true;
                for (int i5 = 0; i5 != bArr2.length; i5++) {
                    int i6 = length + i5;
                    bArrMo1870a[i6] = (byte) (bArrMo1870a[i6] ^ bArr2[i5]);
                    if (bArrMo1870a[length + i5] != 0) {
                        z = false;
                    }
                }
                if (!z) {
                    return m2765c(bArrMo1870a);
                }
                this.f4616i = new byte[length - i4];
                System.arraycopy(bArrMo1870a, i4, this.f4616i, 0, this.f4616i.length);
            } else {
                this.f4615h = false;
                this.f4608a.mo1926a(bArr2, 0);
                boolean z2 = true;
                for (int i7 = 0; i7 != bArr2.length; i7++) {
                    int i8 = length + i7;
                    bArrMo1870a[i8] = (byte) (bArrMo1870a[i8] ^ bArr2[i7]);
                    if (bArrMo1870a[length + i7] != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return m2765c(bArrMo1870a);
                }
                this.f4616i = new byte[length - i4];
                System.arraycopy(bArrMo1870a, i4, this.f4616i, 0, this.f4616i.length);
            }
            if (this.f4614g != 0 && !m2763a(this.f4613f, this.f4616i)) {
                return m2765c(bArrMo1870a);
            }
            m2764b(this.f4613f);
            m2764b(bArrMo1870a);
            this.f4614g = 0;
            return true;
        }
        return m2765c(bArrMo1870a);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final byte[] mo1907a() {
        int i;
        int length;
        byte b;
        int i2;
        int iMo1930b = this.f4608a.mo1930b();
        if (this.f4610c == 188) {
            i = 8;
            length = (this.f4612e.length - iMo1930b) - 1;
            this.f4608a.mo1926a(this.f4612e, length);
            this.f4612e[this.f4612e.length - 1] = -68;
        } else {
            i = 16;
            length = (this.f4612e.length - iMo1930b) - 2;
            this.f4608a.mo1926a(this.f4612e, length);
            this.f4612e[this.f4612e.length - 2] = (byte) (this.f4610c >>> 8);
            this.f4612e[this.f4612e.length - 1] = (byte) this.f4610c;
        }
        int i3 = ((i + ((iMo1930b + this.f4614g) * 8)) + 4) - this.f4611d;
        if (i3 > 0) {
            int i4 = this.f4614g - ((i3 + 7) / 8);
            b = 96;
            int i5 = length - i4;
            System.arraycopy(this.f4613f, 0, this.f4612e, i5, i4);
            this.f4616i = new byte[i4];
            i2 = i5;
        } else {
            b = 64;
            int i6 = length - this.f4614g;
            System.arraycopy(this.f4613f, 0, this.f4612e, i6, this.f4614g);
            this.f4616i = new byte[this.f4614g];
            i2 = i6;
        }
        if (i2 - 1 > 0) {
            for (int i7 = i2 - 1; i7 != 0; i7--) {
                this.f4612e[i7] = -69;
            }
            byte[] bArr = this.f4612e;
            int i8 = i2 - 1;
            bArr[i8] = (byte) (bArr[i8] ^ 1);
            this.f4612e[0] = 11;
            byte[] bArr2 = this.f4612e;
            bArr2[0] = (byte) (bArr2[0] | b);
        } else {
            this.f4612e[0] = 10;
            byte[] bArr3 = this.f4612e;
            bArr3[0] = (byte) (bArr3[0] | b);
        }
        byte[] bArrMo1870a = this.f4609b.mo1870a(this.f4612e, 0, this.f4612e.length);
        this.f4615h = (b & 32) == 0;
        System.arraycopy(this.f4613f, 0, this.f4616i, 0, this.f4616i.length);
        this.f4614g = 0;
        m2764b(this.f4613f);
        m2764b(this.f4612e);
        return bArrMo1870a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1904a(boolean z, InterfaceC1003i interfaceC1003i) {
        C1088bm c1088bm = (C1088bm) interfaceC1003i;
        this.f4609b.mo1869a(z, c1088bm);
        this.f4611d = c1088bm.m2625b().bitLength();
        this.f4612e = new byte[(this.f4611d + 7) / 8];
        if (this.f4610c == 188) {
            this.f4613f = new byte[(this.f4612e.length - this.f4608a.mo1930b()) - 2];
        } else {
            this.f4613f = new byte[(this.f4612e.length - this.f4608a.mo1930b()) - 3];
        }
        this.f4608a.mo1931c();
        this.f4614g = 0;
        m2764b(this.f4613f);
        if (this.f4616i != null) {
            m2764b(this.f4616i);
        }
        this.f4616i = null;
        this.f4615h = false;
        if (this.f4617j != null) {
            this.f4617j = null;
            m2764b(this.f4618k);
            this.f4618k = null;
        }
    }
}
