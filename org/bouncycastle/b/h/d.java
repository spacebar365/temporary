package org.bouncycastle.b.h;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements z {
    private org.bouncycastle.b.b.c a;
    private int b;
    private byte[] c = null;
    private byte[] d = null;
    private long e;

    public d(int i) {
        this.a = new org.bouncycastle.b.b.c(i);
        this.b = i / 8;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return "DSTU7564Mac";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.a.a(b);
        this.e++;
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        if (bArr.length - i < i2) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        if (this.c == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
        this.a.a(bArr, i, i2);
        this.e += (long) i2;
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.e = 0L;
        this.a.c();
        if (this.c != null) {
            this.a.a(this.c, 0, this.c.length);
        }
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof ba)) {
            throw new IllegalArgumentException("Bad parameter passed");
        }
        byte[] bArrA = ((ba) iVar).a();
        this.d = new byte[bArrA.length];
        int length = (((bArrA.length + this.a.d()) - 1) / this.a.d()) * this.a.d();
        if (this.a.d() - (bArrA.length % this.a.d()) < 13) {
            length += this.a.d();
        }
        byte[] bArr = new byte[length];
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        bArr[bArrA.length] = -128;
        org.bouncycastle.f.g.b(bArrA.length * 8, bArr, bArr.length - 12);
        this.c = bArr;
        for (int i = 0; i < this.d.length; i++) {
            this.d[i] = (byte) (bArrA[i] ^ (-1));
        }
        this.a.a(this.c, 0, this.c.length);
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        if (this.c == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
        if (bArr.length - i < this.b) {
            throw new ac("Output buffer too short");
        }
        int iD = this.a.d() - ((int) (this.e % ((long) this.a.d())));
        if (iD < 13) {
            iD += this.a.d();
        }
        byte[] bArr2 = new byte[iD];
        bArr2[0] = -128;
        org.bouncycastle.f.g.b(this.e * 8, bArr2, bArr2.length - 12);
        this.a.a(bArr2, 0, bArr2.length);
        this.a.a(this.d, 0, this.d.length);
        this.e = 0L;
        return this.a.a(bArr, i);
    }
}
