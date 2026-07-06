package org.bouncycastle.b.e;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class q implements org.bouncycastle.b.ap {
    private static final byte[] h = {74, -35, -94, 44, 121, -24, 33, 5};
    org.bouncycastle.b.r a = new org.bouncycastle.b.b.s();
    byte[] b = new byte[20];
    private org.bouncycastle.b.i.b c;
    private org.bouncycastle.b.k.ba d;
    private org.bouncycastle.b.k.be e;
    private byte[] f;
    private boolean g;

    private byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.a.a(bArr, 0, bArr.length);
        this.a.a(this.b, 0);
        System.arraycopy(this.b, 0, bArr2, 0, 8);
        return bArr2;
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[bArr.length - (i + 1)];
        }
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return "DESede";
    }

    @Override // org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        SecureRandom secureRandomA;
        org.bouncycastle.b.i iVarB;
        this.g = z;
        this.c = new org.bouncycastle.b.i.b(new p());
        if (iVar instanceof org.bouncycastle.b.k.bf) {
            org.bouncycastle.b.k.bf bfVar = (org.bouncycastle.b.k.bf) iVar;
            iVarB = bfVar.b();
            secureRandomA = bfVar.a();
        } else {
            secureRandomA = org.bouncycastle.b.l.a();
            iVarB = iVar;
        }
        if (iVarB instanceof org.bouncycastle.b.k.ba) {
            this.d = (org.bouncycastle.b.k.ba) iVarB;
            if (this.g) {
                this.f = new byte[8];
                secureRandomA.nextBytes(this.f);
                this.e = new org.bouncycastle.b.k.be(this.d, this.f);
                return;
            }
            return;
        }
        if (iVarB instanceof org.bouncycastle.b.k.be) {
            this.e = (org.bouncycastle.b.k.be) iVarB;
            this.f = this.e.a();
            this.d = (org.bouncycastle.b.k.ba) this.e.b();
            if (!this.g) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            if (this.f == null || this.f.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i) {
        if (!this.g) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArrA = a(bArr2);
        byte[] bArr3 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArrA, 0, bArr3, bArr2.length, 8);
        int iB = this.c.b();
        if (bArr3.length % iB != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.c.a(true, this.e);
        byte[] bArr4 = new byte[bArr3.length];
        for (int i2 = 0; i2 != bArr3.length; i2 += iB) {
            this.c.a(bArr3, i2, bArr4, i2);
        }
        byte[] bArr5 = new byte[this.f.length + bArr4.length];
        System.arraycopy(this.f, 0, bArr5, 0, this.f.length);
        System.arraycopy(bArr4, 0, bArr5, this.f.length, bArr4.length);
        byte[] bArrB = b(bArr5);
        this.c.a(true, new org.bouncycastle.b.k.be(this.d, h));
        for (int i3 = 0; i3 != bArrB.length; i3 += iB) {
            this.c.a(bArrB, i3, bArrB, i3);
        }
        return bArrB;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i) throws org.bouncycastle.b.v {
        if (this.g) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new org.bouncycastle.b.v("Null pointer as ciphertext");
        }
        int iB = this.c.b();
        if (i % iB != 0) {
            throw new org.bouncycastle.b.v("Ciphertext not multiple of ".concat(String.valueOf(iB)));
        }
        this.c.a(false, new org.bouncycastle.b.k.be(this.d, h));
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 != i; i2 += iB) {
            this.c.a(bArr, i2 + 0, bArr2, i2);
        }
        byte[] bArrB = b(bArr2);
        this.f = new byte[8];
        byte[] bArr3 = new byte[bArrB.length - 8];
        System.arraycopy(bArrB, 0, this.f, 0, 8);
        System.arraycopy(bArrB, 8, bArr3, 0, bArrB.length - 8);
        this.e = new org.bouncycastle.b.k.be(this.d, this.f);
        this.c.a(false, this.e);
        byte[] bArr4 = new byte[bArr3.length];
        for (int i3 = 0; i3 != bArr4.length; i3 += iB) {
            this.c.a(bArr3, i3, bArr4, i3);
        }
        byte[] bArr5 = new byte[bArr4.length - 8];
        byte[] bArr6 = new byte[8];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 8);
        System.arraycopy(bArr4, bArr4.length - 8, bArr6, 0, 8);
        if (org.bouncycastle.f.a.b(a(bArr5), bArr6)) {
            return bArr5;
        }
        throw new org.bouncycastle.b.v("Checksum inside ciphertext is corrupted");
    }
}
