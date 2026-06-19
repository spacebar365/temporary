package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.am */
/* JADX INFO: loaded from: classes.dex */
public class C0904am implements InterfaceC0816ap {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f3721a;

    /* JADX INFO: renamed from: b */
    private C1076ba f3722b;

    /* JADX INFO: renamed from: c */
    private boolean f3723c;

    /* JADX INFO: renamed from: d */
    private byte[] f3724d = {-90, 89, 89, -90};

    /* JADX INFO: renamed from: e */
    private byte[] f3725e = this.f3724d;

    /* JADX INFO: renamed from: f */
    private byte[] f3726f = null;

    public C0904am(InterfaceC0890e interfaceC0890e) {
        this.f3721a = interfaceC0890e;
    }

    /* JADX INFO: renamed from: c */
    private byte[] m2184c(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i - 8];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, 8);
        System.arraycopy(bArr, 8, bArr2, 0, i - 8);
        this.f3721a.mo2124a(false, this.f3722b);
        int i2 = (i / 8) - 1;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = i2; i4 > 0; i4--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                System.arraycopy(bArr2, (i4 - 1) * 8, bArr4, 8, 8);
                int i5 = (i2 * i3) + i4;
                int i6 = 1;
                while (i5 != 0) {
                    int i7 = 8 - i6;
                    bArr4[i7] = (byte) (((byte) i5) ^ bArr4[i7]);
                    i5 >>>= 8;
                    i6++;
                }
                this.f3721a.mo2122a(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, (i4 - 1) * 8, 8);
            }
        }
        this.f3726f = bArr3;
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return this.f3721a.mo2123a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f3723c = z;
        InterfaceC1003i interfaceC1003iM2614b = interfaceC1003i instanceof C1081bf ? ((C1081bf) interfaceC1003i).m2614b() : interfaceC1003i;
        if (interfaceC1003iM2614b instanceof C1076ba) {
            this.f3722b = (C1076ba) interfaceC1003iM2614b;
            this.f3725e = this.f3724d;
        } else if (interfaceC1003iM2614b instanceof C1080be) {
            this.f3725e = ((C1080be) interfaceC1003iM2614b).m2611a();
            this.f3722b = (C1076ba) ((C1080be) interfaceC1003iM2614b).m2612b();
            if (this.f3725e.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) throws C1179v {
        byte[] bArrM2184c;
        if (this.f3723c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new C1179v("unwrap data must be a multiple of 8 bytes");
        }
        if (i2 == 1) {
            throw new C1179v("unwrap data must be at least 16 bytes");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[i];
        if (i2 == 2) {
            this.f3721a.mo2124a(false, this.f3722b);
            int iMo2125b = 0;
            while (iMo2125b < bArr2.length) {
                this.f3721a.mo2122a(bArr2, iMo2125b, bArr3, iMo2125b);
                iMo2125b += this.f3721a.mo2125b();
            }
            this.f3726f = new byte[8];
            System.arraycopy(bArr3, 0, this.f3726f, 0, this.f3726f.length);
            bArrM2184c = new byte[bArr3.length - this.f3726f.length];
            System.arraycopy(bArr3, this.f3726f.length, bArrM2184c, 0, bArrM2184c.length);
        } else {
            bArrM2184c = m2184c(bArr, i);
        }
        byte[] bArr4 = new byte[4];
        byte[] bArr5 = new byte[4];
        System.arraycopy(this.f3726f, 0, bArr4, 0, 4);
        System.arraycopy(this.f3726f, 4, bArr5, 0, 4);
        int iM4135a = AbstractC1556g.m4135a(bArr5, 0);
        boolean z = C1535a.m4085b(bArr4, this.f3725e);
        int length = bArrM2184c.length;
        if (iM4135a <= length - 8) {
            z = false;
        }
        if (iM4135a > length) {
            z = false;
        }
        int length2 = length - iM4135a;
        if (length2 >= bArrM2184c.length) {
            length2 = bArrM2184c.length;
            z = false;
        }
        byte[] bArr6 = new byte[length2];
        System.arraycopy(bArrM2184c, bArrM2184c.length - length2, bArr6, 0, length2);
        if (!C1535a.m4085b(bArr6, new byte[length2])) {
            z = false;
        }
        if (!z) {
            throw new C1179v("checksum failed");
        }
        byte[] bArr7 = new byte[iM4135a];
        System.arraycopy(bArrM2184c, 0, bArr7, 0, bArr7.length);
        return bArr7;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        int iMo2125b = 0;
        if (!this.f3723c) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] bArrM4143a = AbstractC1556g.m4143a(i);
        System.arraycopy(this.f3725e, 0, bArr2, 0, this.f3725e.length);
        System.arraycopy(bArrM4143a, 0, bArr2, this.f3725e.length, 4);
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr, 0, bArr3, 0, i);
        int length = bArr3.length;
        int i2 = (8 - (length % 8)) % 8;
        byte[] bArr4 = new byte[length + i2];
        System.arraycopy(bArr3, 0, bArr4, 0, length);
        if (i2 != 0) {
            System.arraycopy(new byte[i2], 0, bArr4, length, i2);
        }
        if (bArr4.length != 8) {
            C0903al c0903al = new C0903al(this.f3721a);
            c0903al.mo1915a(true, (InterfaceC1003i) new C1080be(this.f3722b, bArr2));
            return c0903al.mo1916a(bArr4, bArr4.length);
        }
        byte[] bArr5 = new byte[bArr4.length + 8];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(bArr4, 0, bArr5, 8, bArr4.length);
        this.f3721a.mo2124a(true, this.f3722b);
        while (iMo2125b < bArr5.length) {
            this.f3721a.mo2122a(bArr5, iMo2125b, bArr5, iMo2125b);
            iMo2125b += this.f3721a.mo2125b();
        }
        return bArr5;
    }
}
