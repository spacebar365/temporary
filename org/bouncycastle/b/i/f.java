package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {
    private v a;
    private boolean b;
    private int c;
    private z d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private int h;
    private byte[] i;
    private int j;
    private boolean k;
    private byte[] l;

    public f(org.bouncycastle.b.e eVar) {
        this.c = eVar.b();
        this.d = new org.bouncycastle.b.h.c(eVar);
        this.g = new byte[this.c];
        this.f = new byte[this.d.b()];
        this.e = new byte[this.d.b()];
        this.a = new v(eVar);
    }

    private void a(boolean z) {
        this.a.c();
        this.d.c();
        this.j = 0;
        org.bouncycastle.f.a.a(this.i, (byte) 0);
        if (z) {
            org.bouncycastle.f.a.a(this.g, (byte) 0);
        }
        byte[] bArr = new byte[this.c];
        bArr[this.c - 1] = 1;
        this.d.a(bArr, 0, this.c);
        this.k = false;
        if (this.l != null) {
            a(this.l, 0, this.l.length);
        }
    }

    private void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.d.a(this.f, 0);
        byte[] bArr = new byte[this.c];
        bArr[this.c - 1] = 2;
        this.d.a(bArr, 0, this.c);
    }

    private void d() {
        byte[] bArr = new byte[this.c];
        this.d.a(bArr, 0);
        for (int i = 0; i < this.g.length; i++) {
            this.g[i] = (byte) ((this.e[i] ^ this.f[i]) ^ bArr[i]);
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(int i) {
        int i2 = this.j + i;
        if (!this.b) {
            if (i2 < this.h) {
                return 0;
            }
            i2 -= this.h;
        }
        return i2 - (i2 % this.c);
    }

    @Override // org.bouncycastle.b.i.a
    public final org.bouncycastle.b.e a() {
        return this.a.d();
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(byte[] bArr, int i, int i2) {
        if (this.k) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.d.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.i.a
    public final int b(int i) {
        int i2 = this.j + i;
        if (this.b) {
            return i2 + this.h;
        }
        if (i2 < this.h) {
            return 0;
        }
        return i2 - this.h;
    }

    @Override // org.bouncycastle.b.i.a
    public final byte[] b() {
        byte[] bArr = new byte[this.h];
        System.arraycopy(this.g, 0, bArr, 0, this.h);
        return bArr;
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        byte[] bArrA;
        org.bouncycastle.b.i iVarB;
        this.b = z;
        if (iVar instanceof org.bouncycastle.b.k.a) {
            org.bouncycastle.b.k.a aVar = (org.bouncycastle.b.k.a) iVar;
            bArrA = aVar.d();
            this.l = aVar.c();
            this.h = aVar.b() / 8;
            iVarB = aVar.a();
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            be beVar = (be) iVar;
            bArrA = beVar.a();
            this.l = null;
            this.h = this.d.b() / 2;
            iVarB = beVar.b();
        }
        this.i = new byte[z ? this.c : this.c + this.h];
        byte[] bArr = new byte[this.c];
        this.d.a(iVarB);
        bArr[this.c - 1] = 0;
        this.d.a(bArr, 0, this.c);
        this.d.a(bArrA, 0, bArrA.length);
        this.d.a(this.e, 0);
        this.a.a(true, new be(null, this.e));
        a(true);
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int iA;
        c();
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            byte b = bArr[i + i5];
            int i6 = i3 + i4;
            byte[] bArr3 = this.i;
            int i7 = this.j;
            this.j = i7 + 1;
            bArr3[i7] = b;
            if (this.j != this.i.length) {
                iA = 0;
            } else {
                if (bArr2.length < this.c + i6) {
                    throw new ac("Output buffer is too short");
                }
                if (this.b) {
                    iA = this.a.a(this.i, 0, bArr2, i6);
                    this.d.a(bArr2, i6, this.c);
                } else {
                    this.d.a(this.i, 0, this.c);
                    iA = this.a.a(this.i, 0, bArr2, i6);
                }
                this.j = 0;
                if (!this.b) {
                    System.arraycopy(this.i, this.c, this.i, 0, this.h);
                    this.j = this.h;
                }
            }
            i4 += iA;
        }
        return i4;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        c();
        int i2 = this.j;
        byte[] bArr2 = new byte[this.i.length];
        this.j = 0;
        if (this.b) {
            if (bArr.length < i + i2 + this.h) {
                throw new ac("Output buffer too short");
            }
            this.a.a(this.i, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, i2);
            this.d.a(bArr2, 0, i2);
            d();
            System.arraycopy(this.g, 0, bArr, i + i2, this.h);
            a(false);
            return this.h + i2;
        }
        if (i2 < this.h) {
            throw new org.bouncycastle.b.v("data too short");
        }
        if (bArr.length < (i + i2) - this.h) {
            throw new ac("Output buffer too short");
        }
        if (i2 > this.h) {
            this.d.a(this.i, 0, i2 - this.h);
            this.a.a(this.i, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, i2 - this.h);
        }
        d();
        byte[] bArr3 = this.i;
        int i3 = i2 - this.h;
        int i4 = 0;
        for (int i5 = 0; i5 < this.h; i5++) {
            i4 |= this.g[i5] ^ bArr3[i3 + i5];
        }
        if (!(i4 == 0)) {
            throw new org.bouncycastle.b.v("mac check in EAX failed");
        }
        a(false);
        return i2 - this.h;
    }
}
