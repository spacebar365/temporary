package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class u implements org.bouncycastle.b.e {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private org.bouncycastle.b.e e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public u(org.bouncycastle.b.e eVar, boolean z) {
        this.e = eVar;
        this.i = z;
        this.g = eVar.b();
        this.a = new byte[this.g];
        this.b = new byte[this.g];
        this.c = new byte[this.g];
        this.d = new byte[this.g];
    }

    private byte a(byte b, int i) {
        return (byte) (this.c[i] ^ b);
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return this.i ? this.e.a() + "/PGPCFBwithIV" : this.e.a() + "/PGPCFB";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.h = z;
        if (!(iVar instanceof be)) {
            c();
            this.e.a(true, iVar);
            return;
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA.length < this.a.length) {
            System.arraycopy(bArrA, 0, this.a, this.a.length - bArrA.length, bArrA.length);
            for (int i = 0; i < this.a.length - bArrA.length; i++) {
                this.a[i] = 0;
            }
        } else {
            System.arraycopy(bArrA, 0, this.a, 0, this.a.length);
        }
        c();
        this.e.a(true, beVar.b());
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.e.b();
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
        this.f = 0;
        for (int i = 0; i != this.b.length; i++) {
            if (this.i) {
                this.b[i] = 0;
            } else {
                this.b[i] = this.a[i];
            }
        }
        this.e.c();
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        if (!this.i) {
            if (this.h) {
                if (this.g + i > bArr.length) {
                    throw new org.bouncycastle.b.o("input buffer too short");
                }
                if (this.g + i2 > bArr2.length) {
                    throw new ac("output buffer too short");
                }
                this.e.a(this.b, 0, this.c, 0);
                for (int i4 = 0; i4 < this.g; i4++) {
                    bArr2[i2 + i4] = a(bArr[i + i4], i4);
                }
                while (i3 < this.g) {
                    this.b[i3] = bArr2[i2 + i3];
                    i3++;
                }
                return this.g;
            }
            if (this.g + i > bArr.length) {
                throw new org.bouncycastle.b.o("input buffer too short");
            }
            if (this.g + i2 > bArr2.length) {
                throw new ac("output buffer too short");
            }
            this.e.a(this.b, 0, this.c, 0);
            for (int i5 = 0; i5 < this.g; i5++) {
                bArr2[i2 + i5] = a(bArr[i + i5], i5);
            }
            while (i3 < this.g) {
                this.b[i3] = bArr[i + i3];
                i3++;
            }
            return this.g;
        }
        if (this.h) {
            if (this.g + i > bArr.length) {
                throw new org.bouncycastle.b.o("input buffer too short");
            }
            if (this.f != 0) {
                if (this.f >= this.g + 2) {
                    if (this.g + i2 > bArr2.length) {
                        throw new ac("output buffer too short");
                    }
                    this.e.a(this.b, 0, this.c, 0);
                    for (int i6 = 0; i6 < this.g; i6++) {
                        bArr2[i2 + i6] = a(bArr[i + i6], i6);
                    }
                    System.arraycopy(bArr2, i2, this.b, 0, this.g);
                }
                return this.g;
            }
            if ((this.g * 2) + i2 + 2 > bArr2.length) {
                throw new ac("output buffer too short");
            }
            this.e.a(this.b, 0, this.c, 0);
            for (int i7 = 0; i7 < this.g; i7++) {
                bArr2[i2 + i7] = a(this.a[i7], i7);
            }
            System.arraycopy(bArr2, i2, this.b, 0, this.g);
            this.e.a(this.b, 0, this.c, 0);
            bArr2[this.g + i2] = a(this.a[this.g - 2], 0);
            bArr2[this.g + i2 + 1] = a(this.a[this.g - 1], 1);
            System.arraycopy(bArr2, i2 + 2, this.b, 0, this.g);
            this.e.a(this.b, 0, this.c, 0);
            for (int i8 = 0; i8 < this.g; i8++) {
                bArr2[this.g + i2 + 2 + i8] = a(bArr[i + i8], i8);
            }
            System.arraycopy(bArr2, this.g + i2 + 2, this.b, 0, this.g);
            this.f += (this.g * 2) + 2;
            return (this.g * 2) + 2;
        }
        if (this.g + i > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (this.g + i2 > bArr2.length) {
            throw new ac("output buffer too short");
        }
        if (this.f == 0) {
            for (int i9 = 0; i9 < this.g; i9++) {
                this.b[i9] = bArr[i + i9];
            }
            this.e.a(this.b, 0, this.c, 0);
            this.f += this.g;
            return 0;
        }
        if (this.f == this.g) {
            System.arraycopy(bArr, i, this.d, 0, this.g);
            System.arraycopy(this.b, 2, this.b, 0, this.g - 2);
            this.b[this.g - 2] = this.d[0];
            this.b[this.g - 1] = this.d[1];
            this.e.a(this.b, 0, this.c, 0);
            for (int i10 = 0; i10 < this.g - 2; i10++) {
                bArr2[i2 + i10] = a(this.d[i10 + 2], i10);
            }
            System.arraycopy(this.d, 2, this.b, 0, this.g - 2);
            this.f += 2;
            return this.g - 2;
        }
        if (this.f >= this.g + 2) {
            System.arraycopy(bArr, i, this.d, 0, this.g);
            bArr2[i2 + 0] = a(this.d[0], this.g - 2);
            bArr2[i2 + 1] = a(this.d[1], this.g - 1);
            System.arraycopy(this.d, 0, this.b, this.g - 2, 2);
            this.e.a(this.b, 0, this.c, 0);
            for (int i11 = 0; i11 < this.g - 2; i11++) {
                bArr2[i2 + i11 + 2] = a(this.d[i11 + 2], i11);
            }
            System.arraycopy(this.d, 2, this.b, 0, this.g - 2);
        }
        return this.g;
    }
}
