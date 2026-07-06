package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    private org.bouncycastle.b.e a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private int f;
    private org.bouncycastle.b.i g;
    private byte[] h;
    private c$a i = new c$a(this);
    private c$a j = new c$a(this);

    public c(org.bouncycastle.b.e eVar) {
        this.a = eVar;
        this.b = eVar.b();
        this.h = new byte[this.b];
        if (this.b != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int a(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        int i4 = 1;
        org.bouncycastle.b.h.a aVar = new org.bouncycastle.b.h.a(this.a, this.f * 8);
        aVar.a(this.g);
        byte[] bArr3 = new byte[16];
        if (f()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        bArr3[0] = (byte) (bArr3[0] | ((((aVar.b() - 2) / 2) & 7) << 3));
        bArr3[0] = (byte) (bArr3[0] | (((15 - this.d.length) - 1) & 7));
        System.arraycopy(this.d, 0, bArr3, 1, this.d.length);
        int i5 = i2;
        while (i5 > 0) {
            bArr3[16 - i4] = (byte) (i5 & 255);
            i5 >>>= 8;
            i4++;
        }
        aVar.a(bArr3, 0, 16);
        if (f()) {
            int iE = e();
            if (iE < 65280) {
                aVar.a((byte) (iE >> 8));
                aVar.a((byte) iE);
                i3 = 2;
            } else {
                aVar.a((byte) -1);
                aVar.a((byte) -2);
                aVar.a((byte) (iE >> 24));
                aVar.a((byte) (iE >> 16));
                aVar.a((byte) (iE >> 8));
                aVar.a((byte) iE);
                i3 = 6;
            }
            if (this.e != null) {
                aVar.a(this.e, 0, this.e.length);
            }
            if (this.i.size() > 0) {
                aVar.a(this.i.a(), 0, this.i.size());
            }
            int i6 = (i3 + iE) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    aVar.a((byte) 0);
                    i6++;
                }
            }
        }
        aVar.a(bArr, i, i2);
        return aVar.a(bArr2, 0);
    }

    private int e() {
        return (this.e == null ? 0 : this.e.length) + this.i.size();
    }

    private boolean f() {
        return e() > 0;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(int i) {
        return 0;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        this.j.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.b.i.a
    public final org.bouncycastle.b.e a() {
        return this.a;
    }

    public final void a(byte b) {
        this.i.write(b);
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        this.c = z;
        if (iVar instanceof org.bouncycastle.b.k.a) {
            org.bouncycastle.b.k.a aVar = (org.bouncycastle.b.k.a) iVar;
            this.d = aVar.d();
            this.e = aVar.c();
            this.f = aVar.b() / 8;
            iVarB = aVar.a();
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + iVar.getClass().getName());
            }
            be beVar = (be) iVar;
            this.d = beVar.a();
            this.e = null;
            this.f = this.h.length / 2;
            iVarB = beVar.b();
        }
        if (iVarB != null) {
            this.g = iVarB;
        }
        if (this.d == null || this.d.length < 7 || this.d.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        d();
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(byte[] bArr, int i, int i2) {
        this.i.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.i.a
    public final int b(int i) {
        int size = this.j.size() + i;
        if (this.c) {
            return size + this.f;
        }
        if (size < this.f) {
            return 0;
        }
        return size - this.f;
    }

    @Override // org.bouncycastle.b.i.a
    public final byte[] b() {
        byte[] bArr = new byte[this.f];
        System.arraycopy(this.h, 0, bArr, 0, bArr.length);
        return bArr;
    }

    public final String c() {
        return this.a.a() + "/CCM";
    }

    public final void d() {
        this.a.c();
        this.i.reset();
        this.j.reset();
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        int i2;
        byte[] bArrA = this.j.a();
        int size = this.j.size();
        if (this.g == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        int length = 15 - this.d.length;
        if (length < 4 && size >= (1 << (length * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr2 = new byte[this.b];
        bArr2[0] = (byte) ((length - 1) & 7);
        System.arraycopy(this.d, 0, bArr2, 1, this.d.length);
        v vVar = new v(this.a);
        vVar.a(this.c, new be(this.g, bArr2));
        if (this.c) {
            int i3 = size + this.f;
            if (bArr.length < i3 + i) {
                throw new ac("Output buffer too short.");
            }
            a(bArrA, 0, size, this.h);
            byte[] bArr3 = new byte[this.b];
            vVar.a(this.h, 0, bArr3, 0);
            int i4 = i;
            int i5 = 0;
            while (i5 < (size + 0) - this.b) {
                vVar.a(bArrA, i5, bArr, i4);
                i4 += this.b;
                i5 += this.b;
            }
            byte[] bArr4 = new byte[this.b];
            System.arraycopy(bArrA, i5, bArr4, 0, (size + 0) - i5);
            vVar.a(bArr4, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr, i4, (size + 0) - i5);
            System.arraycopy(bArr3, 0, bArr, i + size, this.f);
            i2 = i3;
        } else {
            if (size < this.f) {
                throw new org.bouncycastle.b.v("data too short");
            }
            int i6 = size - this.f;
            if (bArr.length < i6 + i) {
                throw new ac("Output buffer too short.");
            }
            System.arraycopy(bArrA, i6 + 0, this.h, 0, this.f);
            vVar.a(this.h, 0, this.h, 0);
            for (int i7 = this.f; i7 != this.h.length; i7++) {
                this.h[i7] = 0;
            }
            int i8 = i;
            int i9 = 0;
            while (i9 < (i6 + 0) - this.b) {
                vVar.a(bArrA, i9, bArr, i8);
                i8 += this.b;
                i9 += this.b;
            }
            byte[] bArr5 = new byte[this.b];
            System.arraycopy(bArrA, i9, bArr5, 0, i6 - (i9 + 0));
            vVar.a(bArr5, 0, bArr5, 0);
            System.arraycopy(bArr5, 0, bArr, i8, i6 - (i9 + 0));
            byte[] bArr6 = new byte[this.b];
            a(bArr, i, i6, bArr6);
            if (!org.bouncycastle.f.a.b(this.h, bArr6)) {
                throw new org.bouncycastle.b.v("mac check in CCM failed");
            }
            i2 = i6;
        }
        d();
        return i2;
    }
}
