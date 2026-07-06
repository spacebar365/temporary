package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;

/* JADX INFO: loaded from: classes.dex */
public final class t implements org.bouncycastle.b.e {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private org.bouncycastle.b.e d;
    private int e;
    private int f;
    private boolean g;

    public t(org.bouncycastle.b.e eVar) {
        this.d = eVar;
        this.f = eVar.b();
        this.a = new byte[this.f];
        this.b = new byte[this.f];
        this.c = new byte[this.f];
    }

    private byte a(byte b, int i) {
        return (byte) (this.c[i] ^ b);
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return this.d.a() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.g = z;
        c();
        this.d.a(true, iVar);
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.d.b();
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
        this.e = 0;
        System.arraycopy(this.a, 0, this.b, 0, this.b.length);
        this.d.c();
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 2;
        if (!this.g) {
            if (this.f + i > bArr.length) {
                throw new org.bouncycastle.b.o("input buffer too short");
            }
            if (this.f + i2 > bArr2.length) {
                throw new ac("output buffer too short");
            }
            if (this.e > this.f) {
                byte b = bArr[i];
                this.b[this.f - 2] = b;
                bArr2[i2] = a(b, this.f - 2);
                byte b2 = bArr[i + 1];
                this.b[this.f - 1] = b2;
                bArr2[i2 + 1] = a(b2, this.f - 1);
                this.d.a(this.b, 0, this.c, 0);
                while (i3 < this.f) {
                    byte b3 = bArr[i + i3];
                    this.b[i3 - 2] = b3;
                    bArr2[i2 + i3] = a(b3, i3 - 2);
                    i3++;
                }
            } else if (this.e == 0) {
                this.d.a(this.b, 0, this.c, 0);
                for (int i4 = 0; i4 < this.f; i4++) {
                    this.b[i4] = bArr[i + i4];
                    bArr2[i4] = a(bArr[i + i4], i4);
                }
                this.e += this.f;
            } else if (this.e == this.f) {
                this.d.a(this.b, 0, this.c, 0);
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                bArr2[i2] = a(b4, 0);
                bArr2[i2 + 1] = a(b5, 1);
                System.arraycopy(this.b, 2, this.b, 0, this.f - 2);
                this.b[this.f - 2] = b4;
                this.b[this.f - 1] = b5;
                this.d.a(this.b, 0, this.c, 0);
                while (i3 < this.f) {
                    byte b6 = bArr[i + i3];
                    this.b[i3 - 2] = b6;
                    bArr2[i2 + i3] = a(b6, i3 - 2);
                    i3++;
                }
                this.e += this.f;
            }
            return this.f;
        }
        if (this.f + i > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (this.f + i2 > bArr2.length) {
            throw new ac("output buffer too short");
        }
        if (this.e > this.f) {
            byte[] bArr3 = this.b;
            int i5 = this.f - 2;
            byte bA = a(bArr[i], this.f - 2);
            bArr2[i2] = bA;
            bArr3[i5] = bA;
            byte[] bArr4 = this.b;
            int i6 = this.f - 1;
            byte bA2 = a(bArr[i + 1], this.f - 1);
            bArr2[i2 + 1] = bA2;
            bArr4[i6] = bA2;
            this.d.a(this.b, 0, this.c, 0);
            while (i3 < this.f) {
                byte bA3 = a(bArr[i + i3], i3 - 2);
                bArr2[i2 + i3] = bA3;
                this.b[i3 - 2] = bA3;
                i3++;
            }
        } else if (this.e == 0) {
            this.d.a(this.b, 0, this.c, 0);
            for (int i7 = 0; i7 < this.f; i7++) {
                byte[] bArr5 = this.b;
                byte bA4 = a(bArr[i + i7], i7);
                bArr2[i2 + i7] = bA4;
                bArr5[i7] = bA4;
            }
            this.e += this.f;
        } else if (this.e == this.f) {
            this.d.a(this.b, 0, this.c, 0);
            bArr2[i2] = a(bArr[i], 0);
            bArr2[i2 + 1] = a(bArr[i + 1], 1);
            System.arraycopy(this.b, 2, this.b, 0, this.f - 2);
            System.arraycopy(bArr2, i2, this.b, this.f - 2, 2);
            this.d.a(this.b, 0, this.c, 0);
            while (i3 < this.f) {
                byte bA5 = a(bArr[i + i3], i3 - 2);
                bArr2[i2 + i3] = bA5;
                this.b[i3 - 2] = bA5;
                i3++;
            }
            this.e += this.f;
        }
        return this.f;
    }
}
