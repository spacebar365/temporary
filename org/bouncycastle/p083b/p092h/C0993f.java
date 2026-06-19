package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1082bg;

/* JADX INFO: renamed from: org.bouncycastle.b.h.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0993f implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private int f4087a = 8;

    /* JADX INFO: renamed from: b */
    private int f4088b = 4;

    /* JADX INFO: renamed from: f */
    private boolean f4092f = true;

    /* JADX INFO: renamed from: g */
    private int[] f4093g = null;

    /* JADX INFO: renamed from: h */
    private byte[] f4094h = null;

    /* JADX INFO: renamed from: i */
    private byte[] f4095i = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    /* JADX INFO: renamed from: e */
    private byte[] f4091e = new byte[this.f4087a];

    /* JADX INFO: renamed from: d */
    private byte[] f4090d = new byte[this.f4087a];

    /* JADX INFO: renamed from: c */
    private int f4089c = 0;

    /* JADX INFO: renamed from: a */
    private static void m2454a(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m2456a(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    private static int[] m2457a(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = m2458b(bArr, i * 4);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m2458b(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        while (this.f4089c < this.f4087a) {
            this.f4090d[this.f4089c] = 0;
            this.f4089c++;
        }
        byte[] bArrM2456a = new byte[this.f4090d.length];
        System.arraycopy(this.f4090d, 0, bArrM2456a, 0, this.f4091e.length);
        if (this.f4092f) {
            this.f4092f = false;
        } else {
            bArrM2456a = m2456a(this.f4090d, 0, this.f4091e);
        }
        m2455a(this.f4093g, bArrM2456a, this.f4091e);
        System.arraycopy(this.f4091e, (this.f4091e.length / 2) - this.f4088b, bArr, i, this.f4088b);
        mo2452c();
        return this.f4088b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        if (this.f4089c == this.f4090d.length) {
            byte[] bArrM2456a = new byte[this.f4090d.length];
            System.arraycopy(this.f4090d, 0, bArrM2456a, 0, this.f4091e.length);
            if (this.f4092f) {
                this.f4092f = false;
                if (this.f4094h != null) {
                    bArrM2456a = m2456a(this.f4090d, 0, this.f4094h);
                }
            } else {
                bArrM2456a = m2456a(this.f4090d, 0, this.f4091e);
            }
            m2455a(this.f4093g, bArrM2456a, this.f4091e);
            this.f4089c = 0;
        }
        byte[] bArr = this.f4090d;
        int i = this.f4089c;
        this.f4089c = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        mo2452c();
        this.f4090d = new byte[this.f4087a];
        this.f4094h = null;
        if (interfaceC1003i instanceof C1082bg) {
            C1082bg c1082bg = (C1082bg) interfaceC1003i;
            System.arraycopy(c1082bg.m2615a(), 0, this.f4095i, 0, c1082bg.m2615a().length);
            if (c1082bg.m2616b() != null) {
                this.f4093g = m2457a(((C1076ba) c1082bg.m2616b()).m2603a());
                return;
            }
            return;
        }
        if (interfaceC1003i instanceof C1076ba) {
            this.f4093g = m2457a(((C1076ba) interfaceC1003i).m2603a());
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + interfaceC1003i.getClass().getName());
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            this.f4093g = m2457a(((C1076ba) c1080be.m2612b()).m2603a());
            System.arraycopy(c1080be.m2611a(), 0, this.f4091e, 0, this.f4091e.length);
            this.f4094h = c1080be.m2611a();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i5 = this.f4087a - this.f4089c;
        if (i2 > i5) {
            System.arraycopy(bArr, i, this.f4090d, this.f4089c, i5);
            byte[] bArrM2456a = new byte[this.f4090d.length];
            System.arraycopy(this.f4090d, 0, bArrM2456a, 0, this.f4091e.length);
            if (this.f4092f) {
                this.f4092f = false;
                if (this.f4094h != null) {
                    bArrM2456a = m2456a(this.f4090d, 0, this.f4094h);
                }
            } else {
                bArrM2456a = m2456a(this.f4090d, 0, this.f4091e);
            }
            m2455a(this.f4093g, bArrM2456a, this.f4091e);
            this.f4089c = 0;
            i3 = i2 - i5;
            i4 = i5 + i;
            while (i3 > this.f4087a) {
                m2455a(this.f4093g, m2456a(bArr, i4, this.f4091e), this.f4091e);
                i3 -= this.f4087a;
                i4 += this.f4087a;
            }
        } else {
            i3 = i2;
            i4 = i;
        }
        System.arraycopy(bArr, i4, this.f4090d, this.f4089c, i3);
        this.f4089c = i3 + this.f4089c;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4088b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        for (int i = 0; i < this.f4090d.length; i++) {
            this.f4090d[i] = 0;
        }
        this.f4089c = 0;
        this.f4092f = true;
    }

    /* JADX INFO: renamed from: a */
    private void m2455a(int[] iArr, byte[] bArr, byte[] bArr2) {
        int iM2458b = m2458b(bArr, 0);
        int iM2458b2 = m2458b(bArr, 4);
        int i = 0;
        while (i < 2) {
            int i2 = 0;
            int i3 = iM2458b2;
            while (i2 < 8) {
                int i4 = iArr[i2] + iM2458b;
                int i5 = (this.f4095i[((i4 >> 28) & 15) + 112] << 28) + (this.f4095i[((i4 >> 0) & 15) + 0] << 0) + (this.f4095i[((i4 >> 4) & 15) + 16] << 4) + (this.f4095i[((i4 >> 8) & 15) + 32] << 8) + (this.f4095i[((i4 >> 12) & 15) + 48] << 12) + (this.f4095i[((i4 >> 16) & 15) + 64] << 16) + (this.f4095i[((i4 >> 20) & 15) + 80] << 20) + (this.f4095i[((i4 >> 24) & 15) + 96] << 24);
                int i6 = ((i5 >>> 21) | (i5 << 11)) ^ i3;
                i2++;
                i3 = iM2458b;
                iM2458b = i6;
            }
            i++;
            iM2458b2 = i3;
        }
        m2454a(iM2458b, bArr2, 0);
        m2454a(iM2458b2, bArr2, 4);
    }
}
