package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class o implements a {
    private org.bouncycastle.b.e a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private o$a l;
    private o$a m;
    private int n;

    public o(org.bouncycastle.b.e eVar) {
        this(eVar, (byte) 0);
    }

    private static void a(int i, byte[] bArr) {
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) (i >> 16);
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) i;
    }

    private void a(byte[] bArr, int i, int i2, int i3) {
        if (i2 + 0 < this.a.b()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i2 % this.a.b() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        System.arraycopy(this.g, 0, this.h, 0, (this.g.length - this.n) - 1);
        a(i3, this.i);
        System.arraycopy(this.i, 0, this.h, (this.g.length - this.n) - 1, 4);
        this.h[this.h.length - 1] = c(this.b);
        this.a.a(this.h, 0, this.f, 0);
        a(i2, this.i);
        if (i2 <= this.a.b() - this.n) {
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr2 = this.i;
                int i5 = this.n + i4;
                bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i4 + 0]);
            }
            for (int i6 = 0; i6 < this.a.b(); i6++) {
                byte[] bArr3 = this.f;
                bArr3[i6] = (byte) (bArr3[i6] ^ this.i[i6]);
            }
            this.a.a(this.f, 0, this.f, 0);
            return;
        }
        for (int i7 = 0; i7 < this.a.b(); i7++) {
            byte[] bArr4 = this.f;
            bArr4[i7] = (byte) (bArr4[i7] ^ this.i[i7]);
        }
        this.a.a(this.f, 0, this.f, 0);
        while (i2 != 0) {
            for (int i8 = 0; i8 < this.a.b(); i8++) {
                byte[] bArr5 = this.f;
                bArr5[i8] = (byte) (bArr5[i8] ^ bArr[i8 + i]);
            }
            this.a.a(this.f, 0, this.f, 0);
            i += this.a.b();
            i2 -= this.a.b();
        }
    }

    private void a(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < this.k.length; i3++) {
            byte[] bArr3 = this.j;
            bArr3[i3] = (byte) (bArr3[i3] + this.k[i3]);
        }
        this.a.a(this.j, 0, this.i, 0);
        for (int i4 = 0; i4 < this.a.b(); i4++) {
            bArr2[i2 + i4] = (byte) (this.i[i4] ^ bArr[i + i4]);
        }
    }

    private void b(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            for (int i3 = 0; i3 < this.a.b(); i3++) {
                byte[] bArr2 = this.f;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i + i3]);
            }
            this.a.a(this.f, 0, this.f, 0);
            i2 -= this.a.b();
            i += this.a.b();
        }
    }

    private byte c(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1");
        switch (i) {
            case 8:
                stringBuffer.append("010");
                break;
            case 16:
                stringBuffer.append("011");
                break;
            case 32:
                stringBuffer.append("100");
                break;
            case 48:
                stringBuffer.append("101");
                break;
            case 64:
                stringBuffer.append("110");
                break;
        }
        String binaryString = Integer.toBinaryString(this.n - 1);
        while (binaryString.length() < 4) {
            binaryString = new StringBuffer(binaryString).insert(0, "0").toString();
        }
        stringBuffer.append(binaryString);
        return (byte) Integer.parseInt(stringBuffer.toString(), 2);
    }

    private void c() {
        org.bouncycastle.f.a.a(this.h, (byte) 0);
        org.bouncycastle.f.a.a(this.i, (byte) 0);
        org.bouncycastle.f.a.a(this.k, (byte) 0);
        org.bouncycastle.f.a.a(this.f, (byte) 0);
        this.k[0] = 1;
        this.m.reset();
        this.l.reset();
        if (this.d != null) {
            a(this.d, 0, this.d.length);
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(int i) {
        return i;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        this.m.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.b.i.a
    public final org.bouncycastle.b.e a() {
        return this.a;
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        if (iVar instanceof org.bouncycastle.b.k.a) {
            org.bouncycastle.b.k.a aVar = (org.bouncycastle.b.k.a) iVar;
            if (aVar.b() > 512 || aVar.b() < 64 || aVar.b() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.g = aVar.d();
            this.b = aVar.b() / 8;
            this.d = aVar.c();
            iVarB = aVar.a();
        } else {
            if (!(iVar instanceof be)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            this.g = ((be) iVar).a();
            this.b = this.a.b();
            this.d = null;
            iVarB = ((be) iVar).b();
        }
        this.e = new byte[this.b];
        this.c = z;
        this.a.a(true, iVarB);
        this.k[0] = 1;
        if (this.d != null) {
            a(this.d, 0, this.d.length);
        }
    }

    @Override // org.bouncycastle.b.i.a
    public final void a(byte[] bArr, int i, int i2) {
        this.l.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.i.a
    public final int b(int i) {
        return this.b + i;
    }

    @Override // org.bouncycastle.b.i.a
    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.e);
    }

    private o(org.bouncycastle.b.e eVar, byte b) {
        this.l = new o$a(this);
        this.m = new o$a(this);
        this.n = 4;
        this.a = eVar;
        this.b = eVar.b();
        this.g = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
        this.e = new byte[eVar.b()];
        this.f = new byte[eVar.b()];
        this.h = new byte[eVar.b()];
        this.i = new byte[eVar.b()];
        this.j = new byte[eVar.b()];
        this.k = new byte[eVar.b()];
        this.n = 4;
    }

    @Override // org.bouncycastle.b.i.a
    public final int a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        int i2;
        int i3;
        byte[] bArrA = this.m.a();
        int size = this.m.size();
        if (bArrA.length + 0 < size) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (bArr.length - i < size) {
            throw new ac("output buffer too short");
        }
        if (this.l.size() > 0) {
            if (this.c) {
                a(this.l.a(), 0, this.l.size(), this.m.size());
            } else {
                a(this.l.a(), 0, this.l.size(), this.m.size() - this.b);
            }
        }
        if (this.c) {
            if (size % this.a.b() != 0) {
                throw new org.bouncycastle.b.o("partial blocks not supported");
            }
            b(bArrA, 0, size);
            this.a.a(this.g, 0, this.j, 0);
            int iB = size;
            int iB2 = 0;
            while (iB > 0) {
                a(bArrA, iB2, bArr, i);
                iB -= this.a.b();
                iB2 += this.a.b();
                i += this.a.b();
            }
            for (int i4 = 0; i4 < this.k.length; i4++) {
                byte[] bArr2 = this.j;
                bArr2[i4] = (byte) (bArr2[i4] + this.k[i4]);
            }
            this.a.a(this.j, 0, this.i, 0);
            for (int i5 = 0; i5 < this.b; i5++) {
                bArr[i + i5] = (byte) (this.i[i5] ^ this.f[i5]);
            }
            System.arraycopy(this.f, 0, this.e, 0, this.b);
            c();
            i3 = this.b + size;
        } else {
            if ((size - this.b) % this.a.b() != 0) {
                throw new org.bouncycastle.b.o("partial blocks not supported");
            }
            this.a.a(this.g, 0, this.j, 0);
            int iB3 = size / this.a.b();
            int iB4 = i;
            int iB5 = 0;
            for (int i6 = 0; i6 < iB3; i6++) {
                a(bArrA, iB5, bArr, iB4);
                iB5 += this.a.b();
                iB4 += this.a.b();
            }
            if (size > iB5) {
                for (int i7 = 0; i7 < this.k.length; i7++) {
                    byte[] bArr3 = this.j;
                    bArr3[i7] = (byte) (bArr3[i7] + this.k[i7]);
                }
                this.a.a(this.j, 0, this.i, 0);
                for (int i8 = 0; i8 < this.b; i8++) {
                    bArr[iB4 + i8] = (byte) (this.i[i8] ^ bArrA[iB5 + i8]);
                }
                i2 = this.b + iB4;
            } else {
                i2 = iB4;
            }
            for (int i9 = 0; i9 < this.k.length; i9++) {
                byte[] bArr4 = this.j;
                bArr4[i9] = (byte) (bArr4[i9] + this.k[i9]);
            }
            this.a.a(this.j, 0, this.i, 0);
            System.arraycopy(bArr, i2 - this.b, this.i, 0, this.b);
            b(bArr, 0, i2 - this.b);
            System.arraycopy(this.f, 0, this.e, 0, this.b);
            byte[] bArr5 = new byte[this.b];
            System.arraycopy(this.i, 0, bArr5, 0, this.b);
            if (!org.bouncycastle.f.a.b(this.e, bArr5)) {
                throw new org.bouncycastle.b.v("mac check failed");
            }
            c();
            i3 = size - this.b;
        }
        c();
        return i3;
    }
}
