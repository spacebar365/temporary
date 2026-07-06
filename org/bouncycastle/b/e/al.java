package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public class al implements org.bouncycastle.b.ap {
    private org.bouncycastle.b.e a;
    private boolean b;
    private org.bouncycastle.b.k.ba c;
    private boolean d;
    private byte[] e;

    public al(org.bouncycastle.b.e eVar) {
        this(eVar, (byte) 0);
    }

    private al(org.bouncycastle.b.e eVar, byte b) {
        this.e = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.a = eVar;
        this.b = true;
    }

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return this.a.a();
    }

    @Override // org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.d = z;
        org.bouncycastle.b.i iVarB = iVar instanceof org.bouncycastle.b.k.bf ? ((org.bouncycastle.b.k.bf) iVar).b() : iVar;
        if (iVarB instanceof org.bouncycastle.b.k.ba) {
            this.c = (org.bouncycastle.b.k.ba) iVarB;
        } else if (iVarB instanceof org.bouncycastle.b.k.be) {
            this.e = ((org.bouncycastle.b.k.be) iVarB).a();
            this.c = (org.bouncycastle.b.k.ba) ((org.bouncycastle.b.k.be) iVarB).b();
            if (this.e.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i) {
        if (!this.d) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new org.bouncycastle.b.o("wrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = new byte[this.e.length + i];
        byte[] bArr3 = new byte[this.e.length + 8];
        System.arraycopy(this.e, 0, bArr2, 0, this.e.length);
        System.arraycopy(bArr, 0, bArr2, this.e.length, i);
        this.a.a(this.b, this.c);
        for (int i3 = 0; i3 != 6; i3++) {
            for (int i4 = 1; i4 <= i2; i4++) {
                System.arraycopy(bArr2, 0, bArr3, 0, this.e.length);
                System.arraycopy(bArr2, i4 * 8, bArr3, this.e.length, 8);
                this.a.a(bArr3, 0, bArr3, 0);
                int i5 = (i2 * i3) + i4;
                int i6 = 1;
                while (i5 != 0) {
                    int length = this.e.length - i6;
                    bArr3[length] = (byte) (((byte) i5) ^ bArr3[length]);
                    i5 >>>= 8;
                    i6++;
                }
                System.arraycopy(bArr3, 0, bArr2, 0, 8);
                System.arraycopy(bArr3, 8, bArr2, i4 * 8, 8);
            }
        }
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i) throws org.bouncycastle.b.v {
        if (this.d) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i2 = i / 8;
        if (i2 * 8 != i) {
            throw new org.bouncycastle.b.v("unwrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = new byte[i - this.e.length];
        byte[] bArr3 = new byte[this.e.length];
        byte[] bArr4 = new byte[this.e.length + 8];
        System.arraycopy(bArr, 0, bArr3, 0, this.e.length);
        System.arraycopy(bArr, this.e.length + 0, bArr2, 0, i - this.e.length);
        this.a.a(!this.b, this.c);
        int i3 = i2 - 1;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i3; i5 > 0; i5--) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.e.length);
                System.arraycopy(bArr2, (i5 - 1) * 8, bArr4, this.e.length, 8);
                int i6 = (i3 * i4) + i5;
                int i7 = 1;
                while (i6 != 0) {
                    int length = this.e.length - i7;
                    bArr4[length] = (byte) (((byte) i6) ^ bArr4[length]);
                    i6 >>>= 8;
                    i7++;
                }
                this.a.a(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, (i5 - 1) * 8, 8);
            }
        }
        if (org.bouncycastle.f.a.b(bArr3, this.e)) {
            return bArr2;
        }
        throw new org.bouncycastle.b.v("checksum failed");
    }
}
