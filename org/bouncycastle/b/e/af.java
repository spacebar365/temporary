package org.bouncycastle.b.e;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class af implements org.bouncycastle.b.ap {
    private static final byte[] i = {74, -35, -94, 44, 121, -24, 33, 5};
    org.bouncycastle.b.r a = new org.bouncycastle.b.b.s();
    byte[] b = new byte[20];
    private org.bouncycastle.b.i.b c;
    private org.bouncycastle.b.i d;
    private org.bouncycastle.b.k.be e;
    private byte[] f;
    private boolean g;
    private SecureRandom h;

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.a.a(bArr, 0, bArr.length);
        this.a.a(this.b, 0);
        System.arraycopy(this.b, 0, bArr2, 0, 8);
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return "RC2";
    }

    @Override // org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        this.g = z;
        this.c = new org.bouncycastle.b.i.b(new ae());
        if (iVar instanceof org.bouncycastle.b.k.bf) {
            org.bouncycastle.b.k.bf bfVar = (org.bouncycastle.b.k.bf) iVar;
            this.h = bfVar.a();
            iVarB = bfVar.b();
        } else {
            this.h = org.bouncycastle.b.l.a();
            iVarB = iVar;
        }
        if (!(iVarB instanceof org.bouncycastle.b.k.be)) {
            this.d = iVarB;
            if (this.g) {
                this.f = new byte[8];
                this.h.nextBytes(this.f);
                this.e = new org.bouncycastle.b.k.be(this.d, this.f);
                return;
            }
            return;
        }
        this.e = (org.bouncycastle.b.k.be) iVarB;
        this.f = this.e.a();
        this.d = this.e.b();
        if (!this.g) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        if (this.f == null || this.f.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i2) {
        if (!this.g) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i3 = i2 + 1;
        if (i3 % 8 != 0) {
            i3 += 8 - (i3 % 8);
        }
        byte[] bArr2 = new byte[i3];
        bArr2[0] = (byte) i2;
        System.arraycopy(bArr, 0, bArr2, 1, i2);
        byte[] bArr3 = new byte[(bArr2.length - i2) - 1];
        if (bArr3.length > 0) {
            this.h.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2 + 1, bArr3.length);
        }
        byte[] bArrA = a(bArr2);
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        System.arraycopy(bArrA, 0, bArr4, bArr2.length, 8);
        byte[] bArr5 = new byte[bArr4.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        int length = bArr4.length / this.c.b();
        if (bArr4.length % this.c.b() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.c.a(true, this.e);
        for (int i4 = 0; i4 < length; i4++) {
            int iB = this.c.b() * i4;
            this.c.a(bArr5, iB, bArr5, iB);
        }
        byte[] bArr6 = new byte[this.f.length + bArr5.length];
        System.arraycopy(this.f, 0, bArr6, 0, this.f.length);
        System.arraycopy(bArr5, 0, bArr6, this.f.length, bArr5.length);
        byte[] bArr7 = new byte[bArr6.length];
        for (int i5 = 0; i5 < bArr6.length; i5++) {
            bArr7[i5] = bArr6[bArr6.length - (i5 + 1)];
        }
        this.c.a(true, new org.bouncycastle.b.k.be(this.d, i));
        for (int i6 = 0; i6 < length + 1; i6++) {
            int iB2 = this.c.b() * i6;
            this.c.a(bArr7, iB2, bArr7, iB2);
        }
        return bArr7;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i2) throws org.bouncycastle.b.v {
        if (this.g) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new org.bouncycastle.b.v("Null pointer as ciphertext");
        }
        if (i2 % this.c.b() != 0) {
            throw new org.bouncycastle.b.v("Ciphertext not multiple of " + this.c.b());
        }
        this.c.a(false, new org.bouncycastle.b.k.be(this.d, i));
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (int i3 = 0; i3 < bArr2.length / this.c.b(); i3++) {
            int iB = this.c.b() * i3;
            this.c.a(bArr2, iB, bArr2, iB);
        }
        byte[] bArr3 = new byte[bArr2.length];
        for (int i4 = 0; i4 < bArr2.length; i4++) {
            bArr3[i4] = bArr2[bArr2.length - (i4 + 1)];
        }
        this.f = new byte[8];
        byte[] bArr4 = new byte[bArr3.length - 8];
        System.arraycopy(bArr3, 0, this.f, 0, 8);
        System.arraycopy(bArr3, 8, bArr4, 0, bArr3.length - 8);
        this.e = new org.bouncycastle.b.k.be(this.d, this.f);
        this.c.a(false, this.e);
        byte[] bArr5 = new byte[bArr4.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        for (int i5 = 0; i5 < bArr5.length / this.c.b(); i5++) {
            int iB2 = this.c.b() * i5;
            this.c.a(bArr5, iB2, bArr5, iB2);
        }
        byte[] bArr6 = new byte[bArr5.length - 8];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length - 8);
        System.arraycopy(bArr5, bArr5.length - 8, bArr7, 0, 8);
        if (!org.bouncycastle.f.a.b(a(bArr6), bArr7)) {
            throw new org.bouncycastle.b.v("Checksum inside ciphertext is corrupted");
        }
        if (bArr6.length - ((bArr6[0] & 255) + 1) > 7) {
            throw new org.bouncycastle.b.v("too many pad bytes (" + (bArr6.length - ((bArr6[0] & 255) + 1)) + ")");
        }
        byte[] bArr8 = new byte[bArr6[0]];
        System.arraycopy(bArr6, 1, bArr8, 0, bArr8.length);
        return bArr8;
    }
}
