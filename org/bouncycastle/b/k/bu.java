package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class bu extends b {
    private final byte[] b;

    public bu(byte[] bArr) {
        super(true);
        this.b = new byte[56];
        System.arraycopy(bArr, 0, this.b, 0, 56);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public bu(SecureRandom secureRandom) {
        super(true);
        this.b = new byte[56];
        byte[] bArr = this.b;
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public final bv c() {
        byte[] bArr = new byte[56];
        org.bouncycastle.d.a.c.c.a(this.b, bArr);
        return new bv(bArr, 0);
    }

    public final void a(bv bvVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[56];
        bvVar.a(bArr2, 0);
        byte[] bArr3 = this.b;
        int[] iArr = new int[14];
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = (i2 * 4) + 0;
            int i4 = bArr3[i3] & 255;
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr3[i5] & 255) << 8);
            int i7 = i5 + 1;
            iArr[i2] = (bArr3[i7 + 1] << 24) | i6 | ((bArr3[i7] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
        int[] iArr2 = new int[16];
        org.bouncycastle.d.a.c.d.a(bArr2, iArr2);
        int[] iArr3 = new int[16];
        org.bouncycastle.d.a.c.d.a(iArr2, iArr3, 0);
        int[] iArr4 = new int[16];
        iArr4[0] = 1;
        int[] iArr5 = new int[16];
        iArr5[0] = 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int i8 = 1;
        int i9 = 447;
        while (true) {
            org.bouncycastle.d.a.c.d.a(iArr5, iArr6, iArr7);
            org.bouncycastle.d.a.c.d.d(iArr5, iArr6, iArr5);
            org.bouncycastle.d.a.c.d.a(iArr3, iArr4, iArr6);
            org.bouncycastle.d.a.c.d.d(iArr3, iArr4, iArr3);
            org.bouncycastle.d.a.c.d.b(iArr7, iArr3, iArr7);
            org.bouncycastle.d.a.c.d.b(iArr5, iArr6, iArr5);
            org.bouncycastle.d.a.c.d.c(iArr6, iArr6);
            org.bouncycastle.d.a.c.d.c(iArr3, iArr3);
            org.bouncycastle.d.a.c.d.d(iArr6, iArr3, iArr8);
            org.bouncycastle.d.a.c.d.a(iArr8, 39082, iArr4);
            org.bouncycastle.d.a.c.d.a(iArr4, iArr3, iArr4);
            org.bouncycastle.d.a.c.d.b(iArr4, iArr8, iArr4);
            org.bouncycastle.d.a.c.d.b(iArr3, iArr6, iArr3);
            org.bouncycastle.d.a.c.d.d(iArr7, iArr5, iArr6);
            org.bouncycastle.d.a.c.d.a(iArr7, iArr5, iArr5);
            org.bouncycastle.d.a.c.d.c(iArr5, iArr5);
            org.bouncycastle.d.a.c.d.c(iArr6, iArr6);
            org.bouncycastle.d.a.c.d.b(iArr6, iArr2, iArr6);
            i9--;
            int i10 = (iArr[i9 >>> 5] >>> (i9 & 31)) & 1;
            int i11 = i8 ^ i10;
            org.bouncycastle.d.a.c.d.a(i11, iArr3, iArr5);
            org.bouncycastle.d.a.c.d.a(i11, iArr4, iArr6);
            if (i9 < 2) {
                break;
            } else {
                i8 = i10;
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            int[] iArr9 = new int[16];
            int[] iArr10 = new int[16];
            org.bouncycastle.d.a.c.d.a(iArr3, iArr4, iArr9);
            org.bouncycastle.d.a.c.d.d(iArr3, iArr4, iArr10);
            org.bouncycastle.d.a.c.d.c(iArr9, iArr9);
            org.bouncycastle.d.a.c.d.c(iArr10, iArr10);
            org.bouncycastle.d.a.c.d.b(iArr9, iArr10, iArr3);
            org.bouncycastle.d.a.c.d.d(iArr9, iArr10, iArr9);
            org.bouncycastle.d.a.c.d.a(iArr9, 39082, iArr4);
            org.bouncycastle.d.a.c.d.a(iArr4, iArr10, iArr4);
            org.bouncycastle.d.a.c.d.b(iArr4, iArr9, iArr4);
        }
        org.bouncycastle.d.a.c.d.a(iArr4, iArr4);
        org.bouncycastle.d.a.c.d.b(iArr3, iArr4, iArr3);
        org.bouncycastle.d.a.c.d.c(iArr3);
        org.bouncycastle.d.a.c.d.a(iArr3, bArr, i);
        if (!(!org.bouncycastle.f.a.a(bArr, i, 56))) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }
}
