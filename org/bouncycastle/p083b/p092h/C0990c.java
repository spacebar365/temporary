package org.bouncycastle.p083b.p092h;

import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.C1041c;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0990c implements InterfaceC1183z {

    /* JADX INFO: renamed from: a */
    private byte[] f4071a;

    /* JADX INFO: renamed from: b */
    private byte[] f4072b;

    /* JADX INFO: renamed from: c */
    private byte[] f4073c;

    /* JADX INFO: renamed from: d */
    private byte[] f4074d;

    /* JADX INFO: renamed from: e */
    private int f4075e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0890e f4076f;

    /* JADX INFO: renamed from: g */
    private int f4077g;

    /* JADX INFO: renamed from: h */
    private byte[] f4078h;

    /* JADX INFO: renamed from: i */
    private byte[] f4079i;

    public C0990c(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, interfaceC0890e.mo2125b() * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final int mo2446a(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.f4075e == this.f4076f.mo2125b()) {
            bArr2 = this.f4078h;
        } else {
            new C1041c().mo2556a(this.f4074d, this.f4075e);
            bArr2 = this.f4079i;
        }
        for (int i2 = 0; i2 < this.f4073c.length; i2++) {
            byte[] bArr3 = this.f4074d;
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        this.f4076f.mo2122a(this.f4074d, 0, this.f4073c, 0);
        System.arraycopy(this.f4073c, 0, bArr, i, this.f4077g);
        mo2452c();
        return this.f4077g;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final String mo2447a() {
        return this.f4076f.mo2123a();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2448a(byte b) {
        if (this.f4075e == this.f4074d.length) {
            this.f4076f.mo2122a(this.f4074d, 0, this.f4073c, 0);
            this.f4075e = 0;
        }
        byte[] bArr = this.f4074d;
        int i = this.f4075e;
        this.f4075e = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2450a(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iMo2125b = this.f4076f.mo2125b();
        int i3 = iMo2125b - this.f4075e;
        if (i2 > i3) {
            System.arraycopy(bArr, i, this.f4074d, this.f4075e, i3);
            this.f4076f.mo2122a(this.f4074d, 0, this.f4073c, 0);
            this.f4075e = 0;
            i2 -= i3;
            i += i3;
            while (i2 > iMo2125b) {
                this.f4076f.mo2122a(bArr, i, this.f4073c, 0);
                i2 -= iMo2125b;
                i += iMo2125b;
            }
        }
        System.arraycopy(bArr, i, this.f4074d, this.f4075e, i2);
        this.f4075e += i2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: b */
    public final int mo2451b() {
        return this.f4077g;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: c */
    public final void mo2452c() {
        for (int i = 0; i < this.f4074d.length; i++) {
            this.f4074d[i] = 0;
        }
        this.f4075e = 0;
        this.f4076f.mo2126c();
    }

    private C0990c(InterfaceC0890e interfaceC0890e, int i) {
        int i2 = 27;
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > interfaceC0890e.mo2125b() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (interfaceC0890e.mo2125b() * 8));
        }
        this.f4076f = new C1010b(interfaceC0890e);
        this.f4077g = i / 8;
        int iMo2125b = interfaceC0890e.mo2125b();
        switch (iMo2125b * 8) {
            case 64:
            case 320:
                break;
            case 128:
                i2 = 135;
                break;
            case 160:
                i2 = 45;
                break;
            case 192:
                i2 = 135;
                break;
            case 224:
                i2 = 777;
                break;
            case 256:
                i2 = 1061;
                break;
            case 384:
                i2 = 4109;
                break;
            case 448:
                i2 = 2129;
                break;
            case 512:
                i2 = 293;
                break;
            case 768:
                i2 = 655377;
                break;
            case 1024:
                i2 = 524355;
                break;
            case 2048:
                i2 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + (iMo2125b * 8));
        }
        this.f4071a = AbstractC1556g.m4143a(i2);
        this.f4073c = new byte[interfaceC0890e.mo2125b()];
        this.f4074d = new byte[interfaceC0890e.mo2125b()];
        this.f4072b = new byte[interfaceC0890e.mo2125b()];
        this.f4075e = 0;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m2453a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                int i2 = (-i) & 255;
                int length2 = bArr.length - 3;
                bArr2[length2] = (byte) (bArr2[length2] ^ (this.f4071a[1] & i2));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) (bArr2[length3] ^ (this.f4071a[2] & i2));
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((i2 & this.f4071a[3]) ^ bArr2[length4]);
                return bArr2;
            }
            int i3 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i3 << 1));
            i = (i3 >>> 7) & 1;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1183z
    /* JADX INFO: renamed from: a */
    public final void mo2449a(InterfaceC1003i interfaceC1003i) {
        if (interfaceC1003i != null && !(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
        this.f4076f.mo2124a(true, interfaceC1003i);
        byte[] bArr = new byte[this.f4072b.length];
        this.f4076f.mo2122a(this.f4072b, 0, bArr, 0);
        this.f4078h = m2453a(bArr);
        this.f4079i = m2453a(this.f4078h);
        mo2452c();
    }
}
