package org.bouncycastle.p083b.p093i;

import java.util.Vector;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1048a;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1033r implements InterfaceC1004a {

    /* JADX INFO: renamed from: a */
    private InterfaceC0890e f4318a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0890e f4319b;

    /* JADX INFO: renamed from: c */
    private boolean f4320c;

    /* JADX INFO: renamed from: d */
    private int f4321d;

    /* JADX INFO: renamed from: e */
    private byte[] f4322e;

    /* JADX INFO: renamed from: f */
    private Vector f4323f;

    /* JADX INFO: renamed from: g */
    private byte[] f4324g;

    /* JADX INFO: renamed from: h */
    private byte[] f4325h;

    /* JADX INFO: renamed from: l */
    private byte[] f4329l;

    /* JADX INFO: renamed from: m */
    private byte[] f4330m;

    /* JADX INFO: renamed from: n */
    private int f4331n;

    /* JADX INFO: renamed from: o */
    private int f4332o;

    /* JADX INFO: renamed from: p */
    private long f4333p;

    /* JADX INFO: renamed from: q */
    private long f4334q;

    /* JADX INFO: renamed from: r */
    private byte[] f4335r;

    /* JADX INFO: renamed from: s */
    private byte[] f4336s;

    /* JADX INFO: renamed from: u */
    private byte[] f4338u;

    /* JADX INFO: renamed from: v */
    private byte[] f4339v;

    /* JADX INFO: renamed from: i */
    private byte[] f4326i = null;

    /* JADX INFO: renamed from: j */
    private byte[] f4327j = new byte[24];

    /* JADX INFO: renamed from: k */
    private byte[] f4328k = new byte[16];

    /* JADX INFO: renamed from: t */
    private byte[] f4337t = new byte[16];

    public C1033r(InterfaceC0890e interfaceC0890e, InterfaceC0890e interfaceC0890e2) {
        if (interfaceC0890e == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (interfaceC0890e.mo2125b() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (interfaceC0890e2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (interfaceC0890e2.mo2125b() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!interfaceC0890e.mo2123a().equals(interfaceC0890e2.mo2123a())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.f4318a = interfaceC0890e;
        this.f4319b = interfaceC0890e2;
    }

    /* JADX INFO: renamed from: a */
    private static int m2544a(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>>= 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int m2545a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.f4321d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & 192);
        if (this.f4326i == null || !C1535a.m4076a(bArr2, this.f4326i)) {
            byte[] bArr3 = new byte[16];
            this.f4326i = bArr2;
            this.f4318a.mo2122a(this.f4326i, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, this.f4327j, 0, 16);
            for (int i2 = 0; i2 < 8; i2++) {
                this.f4327j[i2 + 16] = (byte) (bArr3[i2] ^ bArr3[i2 + 1]);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static int m2546a(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2547b(byte[] bArr) {
        if (bArr != null) {
            C1535a.m4071a(bArr, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2548b(byte[] bArr, int i) {
        bArr[i] = -128;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m2549b(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2550c(byte[] bArr) {
        m2549b(this.f4335r, bArr);
        m2549b(this.f4329l, this.f4335r);
        this.f4318a.mo2122a(this.f4329l, 0, this.f4329l, 0);
        m2549b(this.f4336s, this.f4329l);
    }

    /* JADX INFO: renamed from: c */
    private byte[] m2551c(int i) {
        while (i >= this.f4323f.size()) {
            this.f4323f.addElement(m2552d((byte[]) this.f4323f.lastElement()));
        }
        return (byte[]) this.f4323f.elementAt(i);
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m2552d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - m2546a(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2472a(int i) {
        int i2 = this.f4332o + i;
        if (!this.f4320c) {
            if (i2 < this.f4321d) {
                return 0;
            }
            i2 -= this.f4321d;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final InterfaceC0890e mo2475a() {
        return this.f4319b;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2476a(boolean z, InterfaceC1003i interfaceC1003i) {
        byte[] bArrM2611a;
        C1076ba c1076baM2558a;
        boolean z2 = this.f4320c;
        this.f4320c = z;
        this.f4339v = null;
        if (interfaceC1003i instanceof C1048a) {
            C1048a c1048a = (C1048a) interfaceC1003i;
            byte[] bArrM2561d = c1048a.m2561d();
            this.f4322e = c1048a.m2560c();
            int iM2559b = c1048a.m2559b();
            if (iM2559b < 64 || iM2559b > 128 || iM2559b % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iM2559b)));
            }
            this.f4321d = iM2559b / 8;
            c1076baM2558a = c1048a.m2558a();
            bArrM2611a = bArrM2561d;
        } else {
            if (!(interfaceC1003i instanceof C1080be)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            C1080be c1080be = (C1080be) interfaceC1003i;
            bArrM2611a = c1080be.m2611a();
            this.f4322e = null;
            this.f4321d = 16;
            c1076baM2558a = (C1076ba) c1080be.m2612b();
        }
        this.f4329l = new byte[16];
        this.f4330m = new byte[z ? 16 : this.f4321d + 16];
        if (bArrM2611a == null) {
            bArrM2611a = new byte[0];
        }
        if (bArrM2611a.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (c1076baM2558a != null) {
            this.f4318a.mo2124a(true, c1076baM2558a);
            this.f4319b.mo2124a(z, c1076baM2558a);
            this.f4326i = null;
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        this.f4324g = new byte[16];
        this.f4318a.mo2122a(this.f4324g, 0, this.f4324g, 0);
        this.f4325h = m2552d(this.f4324g);
        this.f4323f = new Vector();
        this.f4323f.addElement(m2552d(this.f4325h));
        int iM2545a = m2545a(bArrM2611a);
        int i = iM2545a % 8;
        int i2 = iM2545a / 8;
        if (i == 0) {
            System.arraycopy(this.f4327j, i2, this.f4328k, 0, 16);
        } else {
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = this.f4327j[i2] & 255;
                i2++;
                this.f4328k[i3] = (byte) ((i4 << i) | ((this.f4327j[i2] & 255) >>> (8 - i)));
            }
        }
        this.f4331n = 0;
        this.f4332o = 0;
        this.f4333p = 0L;
        this.f4334q = 0L;
        this.f4335r = new byte[16];
        this.f4336s = new byte[16];
        System.arraycopy(this.f4328k, 0, this.f4337t, 0, 16);
        this.f4338u = new byte[16];
        if (this.f4322e != null) {
            mo2477a(this.f4322e, 0, this.f4322e.length);
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final int mo2478b(int i) {
        int i2 = this.f4332o + i;
        if (this.f4320c) {
            return i2 + this.f4321d;
        }
        if (i2 < this.f4321d) {
            return 0;
        }
        return i2 - this.f4321d;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: b */
    public final byte[] mo2479b() {
        return this.f4339v == null ? new byte[this.f4321d] : C1535a.m4086b(this.f4339v);
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final void mo2477a(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4329l[this.f4331n] = bArr[i + i3];
            int i4 = this.f4331n + 1;
            this.f4331n = i4;
            if (i4 == this.f4329l.length) {
                long j = this.f4333p + 1;
                this.f4333p = j;
                m2550c(m2551c(m2544a(j)));
                this.f4331n = 0;
            }
        }
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2474a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new C1163o("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f4330m[this.f4332o] = bArr[i + i5];
            int i6 = this.f4332o + 1;
            this.f4332o = i6;
            if (i6 == this.f4330m.length) {
                int i7 = i3 + i4;
                if (bArr2.length < i7 + 16) {
                    throw new C0803ac("Output buffer too short");
                }
                if (this.f4320c) {
                    m2549b(this.f4338u, this.f4330m);
                    this.f4332o = 0;
                }
                byte[] bArr3 = this.f4337t;
                long j = this.f4334q + 1;
                this.f4334q = j;
                m2549b(bArr3, m2551c(m2544a(j)));
                m2549b(this.f4330m, this.f4337t);
                this.f4319b.mo2122a(this.f4330m, 0, this.f4330m, 0);
                m2549b(this.f4330m, this.f4337t);
                System.arraycopy(this.f4330m, 0, bArr2, i7, 16);
                if (!this.f4320c) {
                    m2549b(this.f4338u, this.f4330m);
                    System.arraycopy(this.f4330m, 16, this.f4330m, 0, this.f4321d);
                    this.f4332o = this.f4321d;
                }
                i4 += 16;
            }
        }
        return i4;
    }

    @Override // org.bouncycastle.p083b.p093i.InterfaceC1004a
    /* JADX INFO: renamed from: a */
    public final int mo2473a(byte[] bArr, int i) throws C1179v {
        int i2;
        byte[] bArr2 = null;
        if (!this.f4320c) {
            if (this.f4332o < this.f4321d) {
                throw new C1179v("data too short");
            }
            this.f4332o -= this.f4321d;
            bArr2 = new byte[this.f4321d];
            System.arraycopy(this.f4330m, this.f4332o, bArr2, 0, this.f4321d);
        }
        if (this.f4331n > 0) {
            m2548b(this.f4329l, this.f4331n);
            m2550c(this.f4324g);
        }
        if (this.f4332o > 0) {
            if (this.f4320c) {
                m2548b(this.f4330m, this.f4332o);
                m2549b(this.f4338u, this.f4330m);
            }
            m2549b(this.f4337t, this.f4324g);
            byte[] bArr3 = new byte[16];
            this.f4318a.mo2122a(this.f4337t, 0, bArr3, 0);
            m2549b(this.f4330m, bArr3);
            if (bArr.length < this.f4332o + i) {
                throw new C0803ac("Output buffer too short");
            }
            System.arraycopy(this.f4330m, 0, bArr, i, this.f4332o);
            if (!this.f4320c) {
                m2548b(this.f4330m, this.f4332o);
                m2549b(this.f4338u, this.f4330m);
            }
        }
        m2549b(this.f4338u, this.f4337t);
        m2549b(this.f4338u, this.f4325h);
        this.f4318a.mo2122a(this.f4338u, 0, this.f4338u, 0);
        m2549b(this.f4338u, this.f4336s);
        this.f4339v = new byte[this.f4321d];
        System.arraycopy(this.f4338u, 0, this.f4339v, 0, this.f4321d);
        int i3 = this.f4332o;
        if (this.f4320c) {
            if (bArr.length < i + i3 + this.f4321d) {
                throw new C0803ac("Output buffer too short");
            }
            System.arraycopy(this.f4339v, 0, bArr, i + i3, this.f4321d);
            i2 = this.f4321d + i3;
        } else {
            if (!C1535a.m4085b(this.f4339v, bArr2)) {
                throw new C1179v("mac check in OCB failed");
            }
            i2 = i3;
        }
        this.f4318a.mo2126c();
        this.f4319b.mo2126c();
        m2547b(this.f4329l);
        m2547b(this.f4330m);
        this.f4331n = 0;
        this.f4332o = 0;
        this.f4333p = 0L;
        this.f4334q = 0L;
        m2547b(this.f4335r);
        m2547b(this.f4336s);
        System.arraycopy(this.f4328k, 0, this.f4337t, 0, 16);
        m2547b(this.f4338u);
        if (this.f4322e != null) {
            mo2477a(this.f4322e, 0, this.f4322e.length);
        }
        return i2;
    }
}
