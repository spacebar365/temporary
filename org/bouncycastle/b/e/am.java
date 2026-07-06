package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public class am implements org.bouncycastle.b.ap {
    private org.bouncycastle.b.e a;
    private org.bouncycastle.b.k.ba b;
    private boolean c;
    private byte[] d = {-90, 89, 89, -90};
    private byte[] e = this.d;
    private byte[] f = null;

    public am(org.bouncycastle.b.e eVar) {
        this.a = eVar;
    }

    private byte[] c(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i - 8];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, 8);
        System.arraycopy(bArr, 8, bArr2, 0, i - 8);
        this.a.a(false, this.b);
        int i2 = (i / 8) - 1;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = i2; i4 > 0; i4--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                System.arraycopy(bArr2, (i4 - 1) * 8, bArr4, 8, 8);
                int i5 = (i2 * i3) + i4;
                int i6 = 1;
                while (i5 != 0) {
                    int i7 = 8 - i6;
                    bArr4[i7] = (byte) (((byte) i5) ^ bArr4[i7]);
                    i5 >>>= 8;
                    i6++;
                }
                this.a.a(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, (i4 - 1) * 8, 8);
            }
        }
        this.f = bArr3;
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return this.a.a();
    }

    @Override // org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.c = z;
        org.bouncycastle.b.i iVarB = iVar instanceof org.bouncycastle.b.k.bf ? ((org.bouncycastle.b.k.bf) iVar).b() : iVar;
        if (iVarB instanceof org.bouncycastle.b.k.ba) {
            this.b = (org.bouncycastle.b.k.ba) iVarB;
            this.e = this.d;
        } else if (iVarB instanceof org.bouncycastle.b.k.be) {
            this.e = ((org.bouncycastle.b.k.be) iVarB).a();
            this.b = (org.bouncycastle.b.k.ba) ((org.bouncycastle.b.k.be) iVarB).b();
            if (this.e.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i) throws org.bouncycastle.b.v {
        byte[] bArrC;
        if (this.c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new org.bouncycastle.b.v("unwrap data must be a multiple of 8 bytes");
        }
        if (i2 == 1) {
            throw new org.bouncycastle.b.v("unwrap data must be at least 16 bytes");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[i];
        if (i2 == 2) {
            this.a.a(false, this.b);
            int iB = 0;
            while (iB < bArr2.length) {
                this.a.a(bArr2, iB, bArr3, iB);
                iB += this.a.b();
            }
            this.f = new byte[8];
            System.arraycopy(bArr3, 0, this.f, 0, this.f.length);
            bArrC = new byte[bArr3.length - this.f.length];
            System.arraycopy(bArr3, this.f.length, bArrC, 0, bArrC.length);
        } else {
            bArrC = c(bArr, i);
        }
        byte[] bArr4 = new byte[4];
        byte[] bArr5 = new byte[4];
        System.arraycopy(this.f, 0, bArr4, 0, 4);
        System.arraycopy(this.f, 4, bArr5, 0, 4);
        int iA = org.bouncycastle.f.g.a(bArr5, 0);
        boolean z = org.bouncycastle.f.a.b(bArr4, this.e);
        int length = bArrC.length;
        if (iA <= length - 8) {
            z = false;
        }
        if (iA > length) {
            z = false;
        }
        int length2 = length - iA;
        if (length2 >= bArrC.length) {
            length2 = bArrC.length;
            z = false;
        }
        byte[] bArr6 = new byte[length2];
        System.arraycopy(bArrC, bArrC.length - length2, bArr6, 0, length2);
        if (!org.bouncycastle.f.a.b(bArr6, new byte[length2])) {
            z = false;
        }
        if (!z) {
            throw new org.bouncycastle.b.v("checksum failed");
        }
        byte[] bArr7 = new byte[iA];
        System.arraycopy(bArrC, 0, bArr7, 0, bArr7.length);
        return bArr7;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i) {
        int iB = 0;
        if (!this.c) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] bArrA = org.bouncycastle.f.g.a(i);
        System.arraycopy(this.e, 0, bArr2, 0, this.e.length);
        System.arraycopy(bArrA, 0, bArr2, this.e.length, 4);
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr, 0, bArr3, 0, i);
        int length = bArr3.length;
        int i2 = (8 - (length % 8)) % 8;
        byte[] bArr4 = new byte[length + i2];
        System.arraycopy(bArr3, 0, bArr4, 0, length);
        if (i2 != 0) {
            System.arraycopy(new byte[i2], 0, bArr4, length, i2);
        }
        if (bArr4.length != 8) {
            al alVar = new al(this.a);
            alVar.a(true, (org.bouncycastle.b.i) new org.bouncycastle.b.k.be(this.b, bArr2));
            return alVar.a(bArr4, bArr4.length);
        }
        byte[] bArr5 = new byte[bArr4.length + 8];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(bArr4, 0, bArr5, 8, bArr4.length);
        this.a.a(true, this.b);
        while (iB < bArr5.length) {
            this.a.a(bArr5, iB, bArr5, iB);
            iB += this.a.b();
        }
        return bArr5;
    }
}
