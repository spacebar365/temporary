package org.bouncycastle.b.d;

import java.security.AccessController;
import java.security.SecureRandom;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.l;
import org.bouncycastle.b.v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements org.bouncycastle.b.a {
    private SecureRandom a;
    private org.bouncycastle.b.a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f = -1;
    private byte[] g = null;
    private byte[] h;

    private static int a(byte b, byte[] bArr) {
        boolean z = false;
        int i = -1;
        for (int i2 = 1; i2 != bArr.length; i2++) {
            byte b2 = bArr[i2];
            if ((i < 0) & (b2 == 0)) {
                i = i2;
            }
            z |= (b2 != -1) & (b == 1) & (i < 0);
        }
        if (z) {
            return -1;
        }
        return i;
    }

    @Override // org.bouncycastle.b.a
    public final int a() {
        int iA = this.b.a();
        return this.c ? iA - 10 : iA;
    }

    @Override // org.bouncycastle.b.a
    public final void a(boolean z, i iVar) {
        org.bouncycastle.b.k.b bVar;
        if (iVar instanceof bf) {
            bf bfVar = (bf) iVar;
            this.a = bfVar.a();
            bVar = (org.bouncycastle.b.k.b) bfVar.b();
        } else {
            bVar = (org.bouncycastle.b.k.b) iVar;
            if (!bVar.a() && z) {
                this.a = l.a();
            }
        }
        this.b.a(z, iVar);
        this.d = bVar.a();
        this.c = z;
        this.h = new byte[this.b.b()];
        if (this.f > 0 && this.g == null && this.a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.b.a
    public final int b() {
        int iB = this.b.b();
        return this.c ? iB : iB - 10;
    }

    public c(org.bouncycastle.b.a aVar) {
        this.b = aVar;
        String str = (String) AccessController.doPrivileged(new d(this));
        String str2 = (String) AccessController.doPrivileged(new e(this));
        this.e = str2 != null ? !str2.equals("true") : str == null || str.equals("true");
    }

    @Override // org.bouncycastle.b.a
    public final byte[] a(byte[] bArr, int i, int i2) throws v {
        if (this.c) {
            if (i2 > a()) {
                throw new IllegalArgumentException("input data too large");
            }
            byte[] bArr2 = new byte[this.b.a()];
            if (this.d) {
                bArr2[0] = 1;
                while (i != (bArr2.length - i2) - 1) {
                    bArr2[i] = -1;
                    i++;
                }
            } else {
                this.a.nextBytes(bArr2);
                bArr2[0] = 2;
                while (i != (bArr2.length - i2) - 1) {
                    while (bArr2[i] == 0) {
                        bArr2[i] = (byte) this.a.nextInt();
                    }
                    i++;
                }
            }
            bArr2[(bArr2.length - i2) - 1] = 0;
            System.arraycopy(bArr, i, bArr2, bArr2.length - i2, i2);
            return this.b.a(bArr2, 0, bArr2.length);
        }
        if (this.f != -1) {
            return b(bArr, i, i2);
        }
        byte[] bArrA = this.b.a(bArr, i, i2);
        boolean z = this.e & (bArrA.length != this.b.b());
        byte[] bArr3 = bArrA.length < b() ? this.h : bArrA;
        byte b = bArr3[0];
        int i3 = this.d ? b != 2 ? 1 : 0 : b != 1 ? 1 : 0;
        int iA = a(b, bArr3) + 1;
        if (((iA >= 10 ? 0 : 1) | i3) != 0) {
            org.bouncycastle.f.a.a(bArr3, (byte) 0);
            throw new v("block incorrect");
        }
        if (z) {
            org.bouncycastle.f.a.a(bArr3, (byte) 0);
            throw new v("block incorrect size");
        }
        byte[] bArr4 = new byte[bArr3.length - iA];
        System.arraycopy(bArr3, iA, bArr4, 0, bArr4.length);
        return bArr4;
    }

    private byte[] b(byte[] bArr, int i, int i2) throws v {
        byte[] bArr2;
        if (!this.d) {
            throw new v("sorry, this method is only for decryption, not for signing");
        }
        byte[] bArrA = this.b.a(bArr, i, i2);
        if (this.g == null) {
            bArr2 = new byte[this.f];
            this.a.nextBytes(bArr2);
        } else {
            bArr2 = this.g;
        }
        if ((bArrA.length != this.b.b()) & this.e) {
            bArrA = this.h;
        }
        int i3 = this.f;
        int i4 = (bArrA[0] ^ 2) | 0;
        int length = bArrA.length - (i3 + 1);
        for (int i5 = 1; i5 < length; i5++) {
            byte b = bArrA[i5];
            int i6 = b | (b >> 1);
            int i7 = i6 | (i6 >> 2);
            i4 |= ((i7 | (i7 >> 4)) & 1) - 1;
        }
        int i8 = bArrA[bArrA.length - (i3 + 1)] | i4;
        int i9 = i8 | (i8 >> 1);
        int i10 = i9 | (i9 >> 2);
        int i11 = (((i10 | (i10 >> 4)) & 1) - 1) ^ (-1);
        byte[] bArr3 = new byte[this.f];
        for (int i12 = 0; i12 < this.f; i12++) {
            bArr3[i12] = (byte) ((bArrA[(bArrA.length - this.f) + i12] & (i11 ^ (-1))) | (bArr2[i12] & i11));
        }
        org.bouncycastle.f.a.a(bArrA, (byte) 0);
        return bArr3;
    }
}
