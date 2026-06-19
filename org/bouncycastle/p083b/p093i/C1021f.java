package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1021f implements InterfaceC1004a {

    /* JADX INFO: renamed from: a */
    private C1037v f4200a;

    /* JADX INFO: renamed from: b */
    private boolean f4201b;

    /* JADX INFO: renamed from: c */
    private int f4202c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1183z f4203d;

    /* JADX INFO: renamed from: e */
    private byte[] f4204e;

    /* JADX INFO: renamed from: f */
    private byte[] f4205f;

    /* JADX INFO: renamed from: g */
    private byte[] f4206g;

    /* JADX INFO: renamed from: h */
    private int f4207h;

    /* JADX INFO: renamed from: i */
    private byte[] f4208i;

    /* JADX INFO: renamed from: j */
    private int f4209j;

    /* JADX INFO: renamed from: k */
    private boolean f4210k;

    /* JADX INFO: renamed from: l */
    private byte[] f4211l;

    public C1021f(InterfaceC0890e interfaceC0890e) {
        this.f4202c = interfaceC0890e.mo2125b();
        this.f4203d = new C0990c(interfaceC0890e);
        this.f4206g = new byte[this.f4202c];
        this.f4205f = new byte[this.f4203d.mo2451b()];
        this.f4204e = new byte[this.f4203d.mo2451b()];
        this.f4200a = new C1037v(interfaceC0890e);
    }

    /* JADX INFO: renamed from: a */
    private void m2508a(boolean z) {
        this.f4200a.mo1913c();
        this.f4203d.mo2452c();
        this.f4209j = 0;
        C1535a.m4071a(this.f4208i, (byte) 0);
        if (z) {
            C1535a.m4071a(this.f4206g, (byte) 0);
        }
        byte[] bArr = new byte[this.f4202c];
        bArr[this.f4202c - 1] = 1;
        this.f4203d.mo2450a(bArr, 0, this.f4202c);
        this.f4210k = false;
        if (this.f4211l != null) {
            mo2477a(this.f4211l, 0, this.f4211l.length);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2509c() {
        if (this.f4210k) {
            return;
        }
        this.f4210k = true;
        this.f4203d.mo2446a(this.f4205f, 0);
        byte[] bArr = new byte[this.f4202c];
        bArr[this.f4202c - 1] = 2;
        this.f4203d.mo2450a(bArr, 0, this.f4202c);
    }

    /* JADX INFO: renamed from: d */
    private void m2510d() {
        byte[] bArr = new byte[this.f4202c];
        this.f4203d.mo2446a(bArr, 0);
        for (int i = 0; i < this.f4206g.length; i++) {
            this.f4206g[i] = (byte) ((this.f4204e[i] ^ this.f4205f[i]) ^ bArr[i]);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2472a(int i) {
        int i2 = this.f4209j + i;
        if (!this.f4201b) {
            if (i2 < this.f4207h) {
                return 0;
            }
            i2 -= this.f4207h;
        }
        return i2 - (i2 % this.f4202c);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e mo2475a() {
        return this.f4200a.m1910d();
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2477a(byte[] bArr, int i, int i2) {
        if (this.f4210k) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.f4203d.mo2450a(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final int mo2478b(int i) {
        int i2 = this.f4209j + i;
        if (this.f4201b) {
            return i2 + this.f4207h;
        }
        if (i2 < this.f4207h) {
            return 0;
        }
        return i2 - this.f4207h;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final byte[] mo2479b() {
        byte[] bArr = new byte[this.f4207h];
        System.arraycopy(this.f4206g, 0, bArr, 0, this.f4207h);
        return bArr;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2476a(boolean z, InterfaceC1003i interfaceC1003i) {
        byte[] bArrM2611a;
        InterfaceC1003i interfaceC1003iM2612b;
        this.f4201b = z;
        if (interfaceC1003i instanceof C1048a) {
            C1048a c1048a = (C1048a) interfaceC1003i;
            bArrM2611a = c1048a.m2561d();
            this.f4211l = c1048a.m2560c();
            this.f4207h = c1048a.m2559b() / 8;
            interfaceC1003iM2612b = c1048a.m2558a();
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            bArrM2611a = c1080be.m2611a();
            this.f4211l = null;
            this.f4207h = this.f4203d.mo2451b() / 2;
            interfaceC1003iM2612b = c1080be.m2612b();
        }
        this.f4208i = new byte[z ? this.f4202c : this.f4202c + this.f4207h];
        byte[] bArr = new byte[this.f4202c];
        this.f4203d.mo2449a(interfaceC1003iM2612b);
        bArr[this.f4202c - 1] = 0;
        this.f4203d.mo2450a(bArr, 0, this.f4202c);
        this.f4203d.mo2450a(bArrM2611a, 0, bArrM2611a.length);
        this.f4203d.mo2446a(this.f4204e, 0);
        this.f4200a.mo1912a(true, new C1080be(null, this.f4204e));
        m2508a(true);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2474a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iMo2122a;
        m2509c();
        if (bArr.length < i + i2) {
            throw new C1163o("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            byte b = bArr[i + i5];
            int i6 = i3 + i4;
            byte[] bArr3 = this.f4208i;
            int i7 = this.f4209j;
            this.f4209j = i7 + 1;
            bArr3[i7] = b;
            if (this.f4209j != this.f4208i.length) {
                iMo2122a = 0;
            } else {
                if (bArr2.length < this.f4202c + i6) {
                    throw new C0803ac("Output buffer is too short");
                }
                if (this.f4201b) {
                    iMo2122a = this.f4200a.mo2122a(this.f4208i, 0, bArr2, i6);
                    this.f4203d.mo2450a(bArr2, i6, this.f4202c);
                } else {
                    this.f4203d.mo2450a(this.f4208i, 0, this.f4202c);
                    iMo2122a = this.f4200a.mo2122a(this.f4208i, 0, bArr2, i6);
                }
                this.f4209j = 0;
                if (!this.f4201b) {
                    System.arraycopy(this.f4208i, this.f4202c, this.f4208i, 0, this.f4207h);
                    this.f4209j = this.f4207h;
                }
            }
            i4 += iMo2122a;
        }
        return i4;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2473a(byte[] bArr, int i) throws C1179v {
        m2509c();
        int i2 = this.f4209j;
        byte[] bArr2 = new byte[this.f4208i.length];
        this.f4209j = 0;
        if (this.f4201b) {
            if (bArr.length < i + i2 + this.f4207h) {
                throw new C0803ac("Output buffer too short");
            }
            this.f4200a.mo2122a(this.f4208i, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, i2);
            this.f4203d.mo2450a(bArr2, 0, i2);
            m2510d();
            System.arraycopy(this.f4206g, 0, bArr, i + i2, this.f4207h);
            m2508a(false);
            return this.f4207h + i2;
        }
        if (i2 < this.f4207h) {
            throw new C1179v("data too short");
        }
        if (bArr.length < (i + i2) - this.f4207h) {
            throw new C0803ac("Output buffer too short");
        }
        if (i2 > this.f4207h) {
            this.f4203d.mo2450a(this.f4208i, 0, i2 - this.f4207h);
            this.f4200a.mo2122a(this.f4208i, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, i2 - this.f4207h);
        }
        m2510d();
        byte[] bArr3 = this.f4208i;
        int i3 = i2 - this.f4207h;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f4207h; i5++) {
            i4 |= this.f4206g[i5] ^ bArr3[i3 + i5];
        }
        if (!(i4 == 0)) {
            throw new C1179v("mac check in EAX failed");
        }
        m2508a(false);
        return i2 - this.f4207h;
    }
}
