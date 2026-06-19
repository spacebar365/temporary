package org.bouncycastle.p083b.p093i;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p093i.p094a.AbstractC1008d;
import org.bouncycastle.p083b.p093i.p094a.C1005a;
import org.bouncycastle.p083b.p093i.p094a.C1009e;
import org.bouncycastle.p083b.p093i.p094a.InterfaceC1006b;
import org.bouncycastle.p083b.p093i.p094a.InterfaceC1007c;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1027l implements InterfaceC1004a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f4251a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1007c f4252b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1006b f4253c;

    /* JADX INFO: renamed from: d */
    private boolean f4254d;

    /* JADX INFO: renamed from: e */
    private boolean f4255e;

    /* JADX INFO: renamed from: f */
    private int f4256f;

    /* JADX INFO: renamed from: g */
    private byte[] f4257g;

    /* JADX INFO: renamed from: h */
    private byte[] f4258h;

    /* JADX INFO: renamed from: i */
    private byte[] f4259i;

    /* JADX INFO: renamed from: j */
    private byte[] f4260j;

    /* JADX INFO: renamed from: k */
    private byte[] f4261k;

    /* JADX INFO: renamed from: l */
    private byte[] f4262l;

    /* JADX INFO: renamed from: m */
    private byte[] f4263m;

    /* JADX INFO: renamed from: n */
    private byte[] f4264n;

    /* JADX INFO: renamed from: o */
    private byte[] f4265o;

    /* JADX INFO: renamed from: p */
    private byte[] f4266p;

    /* JADX INFO: renamed from: q */
    private byte[] f4267q;

    /* JADX INFO: renamed from: r */
    private int f4268r;

    /* JADX INFO: renamed from: s */
    private int f4269s;

    /* JADX INFO: renamed from: t */
    private long f4270t;

    /* JADX INFO: renamed from: u */
    private byte[] f4271u;

    /* JADX INFO: renamed from: v */
    private int f4272v;

    /* JADX INFO: renamed from: w */
    private long f4273w;

    /* JADX INFO: renamed from: x */
    private long f4274x;

    public C1027l(InterfaceC0890e interfaceC0890e) {
        this(interfaceC0890e, (byte) 0);
    }

    private C1027l(InterfaceC0890e interfaceC0890e, byte b) {
        if (interfaceC0890e.mo2125b() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        C1009e c1009e = new C1009e();
        this.f4251a = interfaceC0890e;
        this.f4252b = c1009e;
    }

    /* JADX INFO: renamed from: a */
    private void m2516a(boolean z) {
        this.f4251a.mo2126c();
        this.f4264n = new byte[16];
        this.f4265o = new byte[16];
        this.f4266p = new byte[16];
        this.f4271u = new byte[16];
        this.f4272v = 0;
        this.f4273w = 0L;
        this.f4274x = 0L;
        this.f4267q = C1535a.m4086b(this.f4261k);
        this.f4268r = -2;
        this.f4269s = 0;
        this.f4270t = 0L;
        if (this.f4262l != null) {
            C1535a.m4071a(this.f4262l, (byte) 0);
        }
        if (z) {
            this.f4263m = null;
        }
        if (this.f4254d) {
            this.f4255e = false;
        } else if (this.f4259i != null) {
            mo2477a(this.f4259i, 0, this.f4259i.length);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2517a(byte[] bArr) {
        if (this.f4268r == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f4268r--;
        int i = (this.f4267q[15] & 255) + 1;
        this.f4267q[15] = (byte) i;
        int i2 = (i >>> 8) + (this.f4267q[14] & 255);
        this.f4267q[14] = (byte) i2;
        int i3 = (i2 >>> 8) + (this.f4267q[13] & 255);
        this.f4267q[13] = (byte) i3;
        this.f4267q[12] = (byte) ((i3 >>> 8) + (this.f4267q[12] & 255));
        this.f4251a.mo2122a(this.f4267q, 0, bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    private void m2518a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new C0803ac("Output buffer too short");
        }
        if (this.f4270t == 0) {
            m2523d();
        }
        byte[] bArr3 = new byte[16];
        m2517a(bArr3);
        if (this.f4254d) {
            AbstractC1008d.m2485a(bArr3, bArr, i);
            m2519a(this.f4264n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            m2522b(this.f4264n, bArr, i);
            AbstractC1008d.m2487a(bArr3, bArr, i, bArr2, i2);
        }
        this.f4270t += 16;
    }

    /* JADX INFO: renamed from: a */
    private void m2519a(byte[] bArr, byte[] bArr2) {
        AbstractC1008d.m2484a(bArr, bArr2);
        this.f4252b.mo2483b(bArr);
    }

    /* JADX INFO: renamed from: a */
    private void m2520a(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            m2521a(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2521a(byte[] bArr, byte[] bArr2, int i, int i2) {
        AbstractC1008d.m2486a(bArr, bArr2, i, i2);
        this.f4252b.mo2483b(bArr);
    }

    /* JADX INFO: renamed from: b */
    private void m2522b(byte[] bArr, byte[] bArr2, int i) {
        AbstractC1008d.m2485a(bArr, bArr2, i);
        this.f4252b.mo2483b(bArr);
    }

    /* JADX INFO: renamed from: d */
    private void m2523d() {
        if (this.f4273w > 0) {
            System.arraycopy(this.f4265o, 0, this.f4266p, 0, 16);
            this.f4274x = this.f4273w;
        }
        if (this.f4272v > 0) {
            m2521a(this.f4266p, this.f4271u, 0, this.f4272v);
            this.f4274x += (long) this.f4272v;
        }
        if (this.f4274x > 0) {
            System.arraycopy(this.f4266p, 0, this.f4264n, 0, 16);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2524e() {
        if (this.f4255e) {
            return;
        }
        if (!this.f4254d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2472a(int i) {
        int i2 = this.f4269s + i;
        if (!this.f4254d) {
            if (i2 < this.f4256f) {
                return 0;
            }
            i2 -= this.f4256f;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2474a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        m2524e();
        if (bArr.length - i < i2) {
            throw new C1163o("Input buffer too short");
        }
        if (this.f4254d) {
            if (this.f4269s != 0) {
                while (true) {
                    int i5 = i;
                    if (i2 <= 0) {
                        i4 = 0;
                        i = i5;
                        break;
                    }
                    i2--;
                    i = i5 + 1;
                    this.f4262l[this.f4269s] = bArr[i5];
                    int i6 = this.f4269s + 1;
                    this.f4269s = i6;
                    if (i6 == 16) {
                        m2518a(this.f4262l, 0, bArr2, i3);
                        this.f4269s = 0;
                        i4 = 16;
                        break;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i2 >= 16) {
                m2518a(bArr, i, bArr2, i3 + i4);
                i += 16;
                i2 -= 16;
                i4 += 16;
            }
            if (i2 > 0) {
                System.arraycopy(bArr, i, this.f4262l, 0, i2);
                this.f4269s = i2;
            }
        } else {
            i4 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                this.f4262l[this.f4269s] = bArr[i + i7];
                int i8 = this.f4269s + 1;
                this.f4269s = i8;
                if (i8 == this.f4262l.length) {
                    m2518a(this.f4262l, 0, bArr2, i3 + i4);
                    System.arraycopy(this.f4262l, 16, this.f4262l, 0, this.f4256f);
                    this.f4269s = this.f4256f;
                    i4 += 16;
                }
            }
        }
        return i4;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e mo2475a() {
        return this.f4251a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2525a(byte b) {
        m2524e();
        this.f4271u[this.f4272v] = b;
        int i = this.f4272v + 1;
        this.f4272v = i;
        if (i == 16) {
            m2519a(this.f4265o, this.f4271u);
            this.f4272v = 0;
            this.f4273w += 16;
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2476a(boolean z, InterfaceC1003i interfaceC1003i) {
        byte[] bArrM2611a;
        C1076ba c1076baM2558a;
        this.f4254d = z;
        this.f4263m = null;
        this.f4255e = true;
        if (interfaceC1003i instanceof C1048a) {
            C1048a c1048a = (C1048a) interfaceC1003i;
            byte[] bArrM2561d = c1048a.m2561d();
            this.f4259i = c1048a.m2560c();
            int iM2559b = c1048a.m2559b();
            if (iM2559b < 32 || iM2559b > 128 || iM2559b % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iM2559b)));
            }
            this.f4256f = iM2559b / 8;
            c1076baM2558a = c1048a.m2558a();
            bArrM2611a = bArrM2561d;
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            bArrM2611a = c1080be.m2611a();
            this.f4259i = null;
            this.f4256f = 16;
            c1076baM2558a = (C1076ba) c1080be.m2612b();
        }
        this.f4262l = new byte[z ? 16 : this.f4256f + 16];
        if (bArrM2611a == null || bArrM2611a.length <= 0) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && this.f4258h != null && C1535a.m4076a(this.f4258h, bArrM2611a)) {
            if (c1076baM2558a == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            if (this.f4257g != null && C1535a.m4076a(this.f4257g, c1076baM2558a.m2603a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.f4258h = bArrM2611a;
        if (c1076baM2558a != null) {
            this.f4257g = c1076baM2558a.m2603a();
        }
        if (c1076baM2558a != null) {
            this.f4251a.mo2124a(true, c1076baM2558a);
            this.f4260j = new byte[16];
            this.f4251a.mo2122a(this.f4260j, 0, this.f4260j, 0);
            this.f4252b.mo2482a(this.f4260j);
            this.f4253c = null;
        } else if (this.f4260j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        this.f4261k = new byte[16];
        if (this.f4258h.length == 12) {
            System.arraycopy(this.f4258h, 0, this.f4261k, 0, this.f4258h.length);
            this.f4261k[15] = 1;
        } else {
            m2520a(this.f4261k, this.f4258h, this.f4258h.length);
            byte[] bArr = new byte[16];
            AbstractC1556g.m4137a(((long) this.f4258h.length) * 8, bArr, 8);
            m2519a(this.f4261k, bArr);
        }
        this.f4264n = new byte[16];
        this.f4265o = new byte[16];
        this.f4266p = new byte[16];
        this.f4271u = new byte[16];
        this.f4272v = 0;
        this.f4273w = 0L;
        this.f4274x = 0L;
        this.f4267q = C1535a.m4086b(this.f4261k);
        this.f4268r = -2;
        this.f4269s = 0;
        this.f4270t = 0L;
        if (this.f4259i != null) {
            mo2477a(this.f4259i, 0, this.f4259i.length);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2477a(byte[] bArr, int i, int i2) {
        m2524e();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4271u[this.f4272v] = bArr[i + i3];
            int i4 = this.f4272v + 1;
            this.f4272v = i4;
            if (i4 == 16) {
                m2519a(this.f4265o, this.f4271u);
                this.f4272v = 0;
                this.f4273w += 16;
            }
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final int mo2478b(int i) {
        int i2 = this.f4269s + i;
        if (this.f4254d) {
            return i2 + this.f4256f;
        }
        if (i2 < this.f4256f) {
            return 0;
        }
        return i2 - this.f4256f;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final byte[] mo2479b() {
        return this.f4263m == null ? new byte[this.f4256f] : C1535a.m4086b(this.f4263m);
    }

    /* JADX INFO: renamed from: c */
    public final void m2526c() {
        m2516a(true);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2473a(byte[] bArr, int i) throws C1179v {
        m2524e();
        if (this.f4270t == 0) {
            m2523d();
        }
        int i2 = this.f4269s;
        if (this.f4254d) {
            if (bArr.length - i < this.f4256f + i2) {
                throw new C0803ac("Output buffer too short");
            }
        } else {
            if (i2 < this.f4256f) {
                throw new C1179v("data too short");
            }
            i2 -= this.f4256f;
            if (bArr.length - i < i2) {
                throw new C0803ac("Output buffer too short");
            }
        }
        if (i2 > 0) {
            byte[] bArr2 = this.f4262l;
            byte[] bArr3 = new byte[16];
            m2517a(bArr3);
            if (this.f4254d) {
                AbstractC1008d.m2490b(bArr2, bArr3, i2);
                m2521a(this.f4264n, bArr2, 0, i2);
            } else {
                m2521a(this.f4264n, bArr2, 0, i2);
                AbstractC1008d.m2490b(bArr2, bArr3, i2);
            }
            System.arraycopy(bArr2, 0, bArr, i, i2);
            this.f4270t += (long) i2;
        }
        this.f4273w += (long) this.f4272v;
        if (this.f4273w > this.f4274x) {
            if (this.f4272v > 0) {
                m2521a(this.f4265o, this.f4271u, 0, this.f4272v);
            }
            if (this.f4274x > 0) {
                AbstractC1008d.m2484a(this.f4265o, this.f4266p);
            }
            long j = ((this.f4270t * 8) + 127) >>> 7;
            byte[] bArr4 = new byte[16];
            if (this.f4253c == null) {
                this.f4253c = new C1005a();
                this.f4253c.mo2481a(this.f4260j);
            }
            this.f4253c.mo2480a(j, bArr4);
            byte[] bArr5 = this.f4265o;
            long[] jArrM2489a = AbstractC1008d.m2489a(bArr5);
            AbstractC1008d.m2488a(jArrM2489a, AbstractC1008d.m2489a(bArr4));
            AbstractC1556g.m4142a(jArrM2489a, bArr5, 0);
            AbstractC1008d.m2484a(this.f4264n, this.f4265o);
        }
        byte[] bArr6 = new byte[16];
        AbstractC1556g.m4137a(this.f4273w * 8, bArr6, 0);
        AbstractC1556g.m4137a(this.f4270t * 8, bArr6, 8);
        m2519a(this.f4264n, bArr6);
        byte[] bArr7 = new byte[16];
        this.f4251a.mo2122a(this.f4261k, 0, bArr7, 0);
        AbstractC1008d.m2484a(bArr7, this.f4264n);
        this.f4263m = new byte[this.f4256f];
        System.arraycopy(bArr7, 0, this.f4263m, 0, this.f4256f);
        if (this.f4254d) {
            System.arraycopy(this.f4263m, 0, bArr, this.f4269s + i, this.f4256f);
            i2 += this.f4256f;
        } else {
            byte[] bArr8 = new byte[this.f4256f];
            System.arraycopy(this.f4262l, i2, bArr8, 0, this.f4256f);
            if (!C1535a.m4085b(this.f4263m, bArr8)) {
                throw new C1179v("mac check in GCM failed");
            }
        }
        m2516a(false);
        return i2;
    }
}
