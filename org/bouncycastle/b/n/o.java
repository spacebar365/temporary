package org.bouncycastle.b.n;

import java.security.SecureRandom;
import org.bouncycastle.b.ak;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.bk;
import org.bouncycastle.b.k.bm;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ak {
    private org.bouncycastle.b.r a;
    private org.bouncycastle.b.r b;
    private org.bouncycastle.b.a c;
    private SecureRandom d;
    private int e;
    private int f;
    private boolean g = false;
    private int h;
    private int i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte m;

    public o(org.bouncycastle.b.a aVar, org.bouncycastle.b.r rVar, org.bouncycastle.b.r rVar2, int i, byte b) {
        this.c = aVar;
        this.a = rVar;
        this.b = rVar2;
        this.e = rVar.b();
        this.f = rVar2.b();
        this.h = i;
        this.j = new byte[i];
        this.k = new byte[i + 8 + this.e];
        this.m = b;
    }

    private static void a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    private byte[] a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.f];
        byte[] bArr4 = new byte[4];
        this.b.c();
        int i4 = 0;
        while (i4 < i3 / this.f) {
            a(i4, bArr4);
            this.b.a(bArr, i, i2);
            this.b.a(bArr4, 0, 4);
            this.b.a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, this.f * i4, this.f);
            i4++;
        }
        if (this.f * i4 < i3) {
            a(i4, bArr4);
            this.b.a(bArr, i, i2);
            this.b.a(bArr4, 0, 4);
            this.b.a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, this.f * i4, bArr2.length - (i4 * this.f));
        }
        return bArr2;
    }

    private static void b(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.ak
    public final boolean a(byte[] bArr) {
        this.a.a(this.k, (this.k.length - this.e) - this.h);
        try {
            byte[] bArrA = this.c.a(bArr, 0, bArr.length);
            System.arraycopy(bArrA, 0, this.l, this.l.length - bArrA.length, bArrA.length);
            if (this.l[this.l.length - 1] != this.m) {
                b(this.l);
                return false;
            }
            byte[] bArrA2 = a(this.l, (this.l.length - this.e) - 1, this.e, (this.l.length - this.e) - 1);
            for (int i = 0; i != bArrA2.length; i++) {
                byte[] bArr2 = this.l;
                bArr2[i] = (byte) (bArr2[i] ^ bArrA2[i]);
            }
            byte[] bArr3 = this.l;
            bArr3[0] = (byte) (bArr3[0] & (255 >> ((this.l.length * 8) - this.i)));
            for (int i2 = 0; i2 != ((this.l.length - this.e) - this.h) - 2; i2++) {
                if (this.l[i2] != 0) {
                    b(this.l);
                    return false;
                }
            }
            if (this.l[((this.l.length - this.e) - this.h) - 2] != 1) {
                b(this.l);
                return false;
            }
            if (this.g) {
                System.arraycopy(this.j, 0, this.k, this.k.length - this.h, this.h);
            } else {
                System.arraycopy(this.l, ((this.l.length - this.h) - this.e) - 1, this.k, this.k.length - this.h, this.h);
            }
            this.a.a(this.k, 0, this.k.length);
            this.a.a(this.k, this.k.length - this.e);
            int length = (this.l.length - this.e) - 1;
            for (int length2 = this.k.length - this.e; length2 != this.k.length; length2++) {
                if ((this.l[length] ^ this.k[length2]) != 0) {
                    b(this.k);
                    b(this.l);
                    return false;
                }
                length++;
            }
            b(this.k);
            b(this.l);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.b.ak
    public final byte[] a() {
        this.a.a(this.k, (this.k.length - this.e) - this.h);
        if (this.h != 0) {
            if (!this.g) {
                this.d.nextBytes(this.j);
            }
            System.arraycopy(this.j, 0, this.k, this.k.length - this.h, this.h);
        }
        byte[] bArr = new byte[this.e];
        this.a.a(this.k, 0, this.k.length);
        this.a.a(bArr, 0);
        this.l[(((this.l.length - this.h) - 1) - this.e) - 1] = 1;
        System.arraycopy(this.j, 0, this.l, ((this.l.length - this.h) - this.e) - 1, this.h);
        byte[] bArrA = a(bArr, 0, bArr.length, (this.l.length - this.e) - 1);
        for (int i = 0; i != bArrA.length; i++) {
            byte[] bArr2 = this.l;
            bArr2[i] = (byte) (bArr2[i] ^ bArrA[i]);
        }
        byte[] bArr3 = this.l;
        bArr3[0] = (byte) (bArr3[0] & (255 >> ((this.l.length * 8) - this.i)));
        System.arraycopy(bArr, 0, this.l, (this.l.length - this.e) - 1, this.e);
        this.l[this.l.length - 1] = this.m;
        byte[] bArrA2 = this.c.a(this.l, 0, this.l.length);
        b(this.l);
        return bArrA2;
    }

    @Override // org.bouncycastle.b.ak
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVar2;
        bm bmVarA;
        if (iVar instanceof bf) {
            bf bfVar = (bf) iVar;
            org.bouncycastle.b.i iVarB = bfVar.b();
            this.d = bfVar.a();
            iVar2 = iVarB;
        } else {
            if (z) {
                this.d = org.bouncycastle.b.l.a();
            }
            iVar2 = iVar;
        }
        if (iVar2 instanceof bk) {
            bmVarA = ((bk) iVar2).a();
            this.c.a(z, iVar);
        } else {
            bmVarA = (bm) iVar2;
            this.c.a(z, iVar2);
        }
        this.i = bmVarA.b().bitLength() - 1;
        if (this.i < (this.e * 8) + (this.h * 8) + 9) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.l = new byte[(this.i + 7) / 8];
        this.a.c();
    }
}
