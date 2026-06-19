package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1080be;

/* JADX INFO: renamed from: org.bouncycastle.b.i.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1036u implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private byte[] f4353a;

    /* JADX INFO: renamed from: b */
    private byte[] f4354b;

    /* JADX INFO: renamed from: c */
    private byte[] f4355c;

    /* JADX INFO: renamed from: d */
    private byte[] f4356d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0890e f4357e;

    /* JADX INFO: renamed from: f */
    private int f4358f;

    /* JADX INFO: renamed from: g */
    private int f4359g;

    /* JADX INFO: renamed from: h */
    private boolean f4360h;

    /* JADX INFO: renamed from: i */
    private boolean f4361i;

    public C1036u(InterfaceC0890e interfaceC0890e, boolean z) {
        this.f4357e = interfaceC0890e;
        this.f4361i = z;
        this.f4359g = interfaceC0890e.mo2125b();
        this.f4353a = new byte[this.f4359g];
        this.f4354b = new byte[this.f4359g];
        this.f4355c = new byte[this.f4359g];
        this.f4356d = new byte[this.f4359g];
    }

    /* JADX INFO: renamed from: a */
    private byte m2554a(byte b, int i) {
        return (byte) (this.f4355c[i] ^ b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return this.f4361i ? this.f4357e.mo2123a() + "/PGPCFBwithIV" : this.f4357e.mo2123a() + "/PGPCFB";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4360h = z;
        if (!(interfaceC1003i instanceof C1080be)) {
            mo2126c();
            this.f4357e.mo2124a(true, interfaceC1003i);
            return;
        }
        C1080be c1080be = (C1080be) interfaceC1003i;
        byte[] bArrM2611a = c1080be.m2611a();
        if (bArrM2611a.length < this.f4353a.length) {
            System.arraycopy(bArrM2611a, 0, this.f4353a, this.f4353a.length - bArrM2611a.length, bArrM2611a.length);
            for (int i = 0; i < this.f4353a.length - bArrM2611a.length; i++) {
                this.f4353a[i] = 0;
            }
        } else {
            System.arraycopy(bArrM2611a, 0, this.f4353a, 0, this.f4353a.length);
        }
        mo2126c();
        this.f4357e.mo2124a(true, c1080be.m2612b());
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f4357e.mo2125b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
        this.f4358f = 0;
        for (int i = 0; i != this.f4354b.length; i++) {
            if (this.f4361i) {
                this.f4354b[i] = 0;
            } else {
                this.f4354b[i] = this.f4353a[i];
            }
        }
        this.f4357e.mo2126c();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        if (!this.f4361i) {
            if (this.f4360h) {
                if (this.f4359g + i > bArr.length) {
                    throw new C1163o("input buffer too short");
                }
                if (this.f4359g + i2 > bArr2.length) {
                    throw new C0803ac("output buffer too short");
                }
                this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
                for (int i4 = 0; i4 < this.f4359g; i4++) {
                    bArr2[i2 + i4] = m2554a(bArr[i + i4], i4);
                }
                while (i3 < this.f4359g) {
                    this.f4354b[i3] = bArr2[i2 + i3];
                    i3++;
                }
                return this.f4359g;
            }
            if (this.f4359g + i > bArr.length) {
                throw new C1163o("input buffer too short");
            }
            if (this.f4359g + i2 > bArr2.length) {
                throw new C0803ac("output buffer too short");
            }
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            for (int i5 = 0; i5 < this.f4359g; i5++) {
                bArr2[i2 + i5] = m2554a(bArr[i + i5], i5);
            }
            while (i3 < this.f4359g) {
                this.f4354b[i3] = bArr[i + i3];
                i3++;
            }
            return this.f4359g;
        }
        if (this.f4360h) {
            if (this.f4359g + i > bArr.length) {
                throw new C1163o("input buffer too short");
            }
            if (this.f4358f != 0) {
                if (this.f4358f >= this.f4359g + 2) {
                    if (this.f4359g + i2 > bArr2.length) {
                        throw new C0803ac("output buffer too short");
                    }
                    this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
                    for (int i6 = 0; i6 < this.f4359g; i6++) {
                        bArr2[i2 + i6] = m2554a(bArr[i + i6], i6);
                    }
                    System.arraycopy(bArr2, i2, this.f4354b, 0, this.f4359g);
                }
                return this.f4359g;
            }
            if ((this.f4359g * 2) + i2 + 2 > bArr2.length) {
                throw new C0803ac("output buffer too short");
            }
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            for (int i7 = 0; i7 < this.f4359g; i7++) {
                bArr2[i2 + i7] = m2554a(this.f4353a[i7], i7);
            }
            System.arraycopy(bArr2, i2, this.f4354b, 0, this.f4359g);
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            bArr2[this.f4359g + i2] = m2554a(this.f4353a[this.f4359g - 2], 0);
            bArr2[this.f4359g + i2 + 1] = m2554a(this.f4353a[this.f4359g - 1], 1);
            System.arraycopy(bArr2, i2 + 2, this.f4354b, 0, this.f4359g);
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            for (int i8 = 0; i8 < this.f4359g; i8++) {
                bArr2[this.f4359g + i2 + 2 + i8] = m2554a(bArr[i + i8], i8);
            }
            System.arraycopy(bArr2, this.f4359g + i2 + 2, this.f4354b, 0, this.f4359g);
            this.f4358f += (this.f4359g * 2) + 2;
            return (this.f4359g * 2) + 2;
        }
        if (this.f4359g + i > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (this.f4359g + i2 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f4358f == 0) {
            for (int i9 = 0; i9 < this.f4359g; i9++) {
                this.f4354b[i9] = bArr[i + i9];
            }
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            this.f4358f += this.f4359g;
            return 0;
        }
        if (this.f4358f == this.f4359g) {
            System.arraycopy(bArr, i, this.f4356d, 0, this.f4359g);
            System.arraycopy(this.f4354b, 2, this.f4354b, 0, this.f4359g - 2);
            this.f4354b[this.f4359g - 2] = this.f4356d[0];
            this.f4354b[this.f4359g - 1] = this.f4356d[1];
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            for (int i10 = 0; i10 < this.f4359g - 2; i10++) {
                bArr2[i2 + i10] = m2554a(this.f4356d[i10 + 2], i10);
            }
            System.arraycopy(this.f4356d, 2, this.f4354b, 0, this.f4359g - 2);
            this.f4358f += 2;
            return this.f4359g - 2;
        }
        if (this.f4358f >= this.f4359g + 2) {
            System.arraycopy(bArr, i, this.f4356d, 0, this.f4359g);
            bArr2[i2 + 0] = m2554a(this.f4356d[0], this.f4359g - 2);
            bArr2[i2 + 1] = m2554a(this.f4356d[1], this.f4359g - 1);
            System.arraycopy(this.f4356d, 0, this.f4354b, this.f4359g - 2, 2);
            this.f4357e.mo2122a(this.f4354b, 0, this.f4355c, 0);
            for (int i11 = 0; i11 < this.f4359g - 2; i11++) {
                bArr2[i2 + i11 + 2] = m2554a(this.f4356d[i11 + 2], i11);
            }
            System.arraycopy(this.f4356d, 2, this.f4354b, 0, this.f4359g - 2);
        }
        return this.f4359g;
    }
}
