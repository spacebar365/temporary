package org.bouncycastle.b.d;

import java.security.SecureRandom;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.l;
import org.bouncycastle.b.o;
import org.bouncycastle.b.r;
import org.bouncycastle.b.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements org.bouncycastle.b.a {
    private byte[] a;
    private r b;
    private org.bouncycastle.b.a c;
    private SecureRandom d;
    private boolean e;

    public b(org.bouncycastle.b.a aVar, r rVar, r rVar2, byte[] bArr) {
        this.c = aVar;
        this.b = rVar2;
        this.a = new byte[rVar.b()];
        rVar.c();
        if (bArr != null) {
            rVar.a(bArr, 0, bArr.length);
        }
        rVar.a(this.a, 0);
    }

    public b(org.bouncycastle.b.a aVar, r rVar, byte[] bArr) {
        this(aVar, rVar, rVar, bArr);
    }

    private static void a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    private byte[] a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.b.b()];
        byte[] bArr4 = new byte[4];
        this.b.c();
        int i4 = 0;
        while (i4 < i3 / bArr3.length) {
            a(i4, bArr4);
            this.b.a(bArr, i, i2);
            this.b.a(bArr4, 0, 4);
            this.b.a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, bArr3.length * i4, bArr3.length);
            i4++;
        }
        if (bArr3.length * i4 < i3) {
            a(i4, bArr4);
            this.b.a(bArr, i, i2);
            this.b.a(bArr4, 0, 4);
            this.b.a(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, bArr3.length * i4, bArr2.length - (i4 * bArr3.length));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.b.a
    public final int a() {
        int iA = this.c.a();
        return this.e ? (iA - 1) - (this.a.length * 2) : iA;
    }

    @Override // org.bouncycastle.b.a
    public final void a(boolean z, i iVar) {
        if (iVar instanceof bf) {
            this.d = ((bf) iVar).a();
        } else {
            this.d = l.a();
        }
        this.c.a(z, iVar);
        this.e = z;
    }

    @Override // org.bouncycastle.b.a
    public final int b() {
        int iB = this.c.b();
        return this.e ? iB : (iB - 1) - (this.a.length * 2);
    }

    @Override // org.bouncycastle.b.a
    public final byte[] a(byte[] bArr, int i, int i2) throws v {
        if (this.e) {
            if (i2 > a()) {
                throw new o("input data too long");
            }
            byte[] bArr2 = new byte[a() + 1 + (this.a.length * 2)];
            System.arraycopy(bArr, i, bArr2, bArr2.length - i2, i2);
            bArr2[(bArr2.length - i2) - 1] = 1;
            System.arraycopy(this.a, 0, bArr2, this.a.length, this.a.length);
            byte[] bArr3 = new byte[this.a.length];
            this.d.nextBytes(bArr3);
            byte[] bArrA = a(bArr3, 0, bArr3.length, bArr2.length - this.a.length);
            for (int length = this.a.length; length != bArr2.length; length++) {
                bArr2[length] = (byte) (bArr2[length] ^ bArrA[length - this.a.length]);
            }
            System.arraycopy(bArr3, 0, bArr2, 0, this.a.length);
            byte[] bArrA2 = a(bArr2, this.a.length, bArr2.length - this.a.length, this.a.length);
            for (int i3 = 0; i3 != this.a.length; i3++) {
                bArr2[i3] = (byte) (bArr2[i3] ^ bArrA2[i3]);
            }
            return this.c.a(bArr2, 0, bArr2.length);
        }
        byte[] bArrA3 = this.c.a(bArr, i, i2);
        byte[] bArr4 = new byte[this.c.b()];
        boolean z = bArr4.length < (this.a.length * 2) + 1;
        if (bArrA3.length <= bArr4.length) {
            System.arraycopy(bArrA3, 0, bArr4, bArr4.length - bArrA3.length, bArrA3.length);
        } else {
            System.arraycopy(bArrA3, 0, bArr4, 0, bArr4.length);
            z = true;
        }
        byte[] bArrA4 = a(bArr4, this.a.length, bArr4.length - this.a.length, this.a.length);
        for (int i4 = 0; i4 != this.a.length; i4++) {
            bArr4[i4] = (byte) (bArr4[i4] ^ bArrA4[i4]);
        }
        byte[] bArrA5 = a(bArr4, 0, this.a.length, bArr4.length - this.a.length);
        for (int length2 = this.a.length; length2 != bArr4.length; length2++) {
            bArr4[length2] = (byte) (bArr4[length2] ^ bArrA5[length2 - this.a.length]);
        }
        boolean z2 = false;
        for (int i5 = 0; i5 != this.a.length; i5++) {
            if (this.a[i5] != bArr4[this.a.length + i5]) {
                z2 = true;
            }
        }
        int length3 = bArr4.length;
        for (int length4 = this.a.length * 2; length4 != bArr4.length; length4++) {
            if ((bArr4[length4] != 0) & (length3 == bArr4.length)) {
                length3 = length4;
            }
        }
        boolean z3 = length3 > bArr4.length + (-1);
        boolean z4 = bArr4[length3] != 1;
        int i6 = length3 + 1;
        if ((z | z2) || (z4 | z3)) {
            org.bouncycastle.f.a.a(bArr4, (byte) 0);
            throw new v("data wrong");
        }
        byte[] bArr5 = new byte[bArr4.length - i6];
        System.arraycopy(bArr4, i6, bArr5, 0, bArr5.length);
        return bArr5;
    }
}
