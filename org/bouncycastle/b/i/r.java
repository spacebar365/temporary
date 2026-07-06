package org.bouncycastle.b.i;

import java.util.Vector;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class r implements a {
    private org.bouncycastle.b.e a;
    private org.bouncycastle.b.e b;
    private boolean c;
    private int d;
    private byte[] e;
    private Vector f;
    private byte[] g;
    private byte[] h;
    private byte[] l;
    private byte[] m;
    private int n;
    private int o;
    private long p;
    private long q;
    private byte[] r;
    private byte[] s;
    private byte[] u;
    private byte[] v;
    private byte[] i = null;
    private byte[] j = new byte[24];
    private byte[] k = new byte[16];
    private byte[] t = new byte[16];

    public r(org.bouncycastle.b.e eVar, org.bouncycastle.b.e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (eVar.b() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (eVar2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (eVar2.b() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!eVar.a().equals(eVar2.a())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.a = eVar;
        this.b = eVar2;
    }

    private static int a(long j) {
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

    private int a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        int i = bArr2[15] & 63;
        bArr2[15] = (byte) (bArr2[15] & 192);
        if (this.i == null || !org.bouncycastle.f.a.a(bArr2, this.i)) {
            byte[] bArr3 = new byte[16];
            this.i = bArr2;
            this.a.a(this.i, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, this.j, 0, 16);
            for (int i2 = 0; i2 < 8; i2++) {
                this.j[i2 + 16] = (byte) (bArr3[i2] ^ bArr3[i2 + 1]);
            }
        }
        return i;
    }

    private static int a(byte[] bArr, byte[] bArr2) {
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

    private static void b(byte[] bArr) {
        if (bArr != null) {
            org.bouncycastle.f.a.a(bArr, (byte) 0);
        }
    }

    private static void b(byte[] bArr, int i) {
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

    private static void b(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private void c(byte[] bArr) {
        b(this.r, bArr);
        b(this.l, this.r);
        this.a.a(this.l, 0, this.l, 0);
        b(this.s, this.l);
    }

    private byte[] c(int i) {
        while (i >= this.f.size()) {
            this.f.addElement(d((byte[]) this.f.lastElement()));
        }
        return (byte[]) this.f.elementAt(i);
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - a(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(int i) {
        int i2 = this.o + i;
        if (!this.c) {
            if (i2 < this.d) {
                return 0;
            }
            i2 -= this.d;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.b.i.a
    public final org.bouncycastle.b.e a() {
        return this.b;
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        byte[] bArrA;
        ba baVarA;
        boolean z2 = this.c;
        this.c = z;
        this.v = null;
        if (iVar instanceof org.bouncycastle.b.k.a) {
            org.bouncycastle.b.k.a aVar = (org.bouncycastle.b.k.a) iVar;
            byte[] bArrD = aVar.d();
            this.e = aVar.c();
            int iB = aVar.b();
            if (iB < 64 || iB > 128 || iB % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iB)));
            }
            this.d = iB / 8;
            baVarA = aVar.a();
            bArrA = bArrD;
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            be beVar = (be) iVar;
            bArrA = beVar.a();
            this.e = null;
            this.d = 16;
            baVarA = (ba) beVar.b();
        }
        this.l = new byte[16];
        this.m = new byte[z ? 16 : this.d + 16];
        if (bArrA == null) {
            bArrA = new byte[0];
        }
        if (bArrA.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (baVarA != null) {
            this.a.a(true, baVarA);
            this.b.a(z, baVarA);
            this.i = null;
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        this.g = new byte[16];
        this.a.a(this.g, 0, this.g, 0);
        this.h = d(this.g);
        this.f = new Vector();
        this.f.addElement(d(this.h));
        int iA = a(bArrA);
        int i = iA % 8;
        int i2 = iA / 8;
        if (i == 0) {
            System.arraycopy(this.j, i2, this.k, 0, 16);
        } else {
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = this.j[i2] & 255;
                i2++;
                this.k[i3] = (byte) ((i4 << i) | ((this.j[i2] & 255) >>> (8 - i)));
            }
        }
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.q = 0L;
        this.r = new byte[16];
        this.s = new byte[16];
        System.arraycopy(this.k, 0, this.t, 0, 16);
        this.u = new byte[16];
        if (this.e != null) {
            a(this.e, 0, this.e.length);
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final int b(int i) {
        int i2 = this.o + i;
        if (this.c) {
            return i2 + this.d;
        }
        if (i2 < this.d) {
            return 0;
        }
        return i2 - this.d;
    }

    @Override // org.bouncycastle.b.i.a
    public final byte[] b() {
        return this.v == null ? new byte[this.d] : org.bouncycastle.f.a.b(this.v);
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.l[this.n] = bArr[i + i3];
            int i4 = this.n + 1;
            this.n = i4;
            if (i4 == this.l.length) {
                long j = this.p + 1;
                this.p = j;
                c(c(a(j)));
                this.n = 0;
            }
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            this.m[this.o] = bArr[i + i5];
            int i6 = this.o + 1;
            this.o = i6;
            if (i6 == this.m.length) {
                int i7 = i3 + i4;
                if (bArr2.length < i7 + 16) {
                    throw new ac("Output buffer too short");
                }
                if (this.c) {
                    b(this.u, this.m);
                    this.o = 0;
                }
                byte[] bArr3 = this.t;
                long j = this.q + 1;
                this.q = j;
                b(bArr3, c(a(j)));
                b(this.m, this.t);
                this.b.a(this.m, 0, this.m, 0);
                b(this.m, this.t);
                System.arraycopy(this.m, 0, bArr2, i7, 16);
                if (!this.c) {
                    b(this.u, this.m);
                    System.arraycopy(this.m, 16, this.m, 0, this.d);
                    this.o = this.d;
                }
                i4 += 16;
            }
        }
        return i4;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        int i2;
        byte[] bArr2 = null;
        if (!this.c) {
            if (this.o < this.d) {
                throw new org.bouncycastle.b.v("data too short");
            }
            this.o -= this.d;
            bArr2 = new byte[this.d];
            System.arraycopy(this.m, this.o, bArr2, 0, this.d);
        }
        if (this.n > 0) {
            b(this.l, this.n);
            c(this.g);
        }
        if (this.o > 0) {
            if (this.c) {
                b(this.m, this.o);
                b(this.u, this.m);
            }
            b(this.t, this.g);
            byte[] bArr3 = new byte[16];
            this.a.a(this.t, 0, bArr3, 0);
            b(this.m, bArr3);
            if (bArr.length < this.o + i) {
                throw new ac("Output buffer too short");
            }
            System.arraycopy(this.m, 0, bArr, i, this.o);
            if (!this.c) {
                b(this.m, this.o);
                b(this.u, this.m);
            }
        }
        b(this.u, this.t);
        b(this.u, this.h);
        this.a.a(this.u, 0, this.u, 0);
        b(this.u, this.s);
        this.v = new byte[this.d];
        System.arraycopy(this.u, 0, this.v, 0, this.d);
        int i3 = this.o;
        if (this.c) {
            if (bArr.length < i + i3 + this.d) {
                throw new ac("Output buffer too short");
            }
            System.arraycopy(this.v, 0, bArr, i + i3, this.d);
            i2 = this.d + i3;
        } else {
            if (!org.bouncycastle.f.a.b(this.v, bArr2)) {
                throw new org.bouncycastle.b.v("mac check in OCB failed");
            }
            i2 = i3;
        }
        this.a.c();
        this.b.c();
        b(this.l);
        b(this.m);
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.q = 0L;
        b(this.r);
        b(this.s);
        System.arraycopy(this.k, 0, this.t, 0, 16);
        b(this.u);
        if (this.e != null) {
            a(this.e, 0, this.e.length);
        }
        return i2;
    }
}
