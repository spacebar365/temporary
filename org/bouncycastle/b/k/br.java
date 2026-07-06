package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class br extends b {
    private final byte[] b;

    public br(byte[] bArr) {
        super(true);
        this.b = new byte[32];
        System.arraycopy(bArr, 0, this.b, 0, 32);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public br(SecureRandom secureRandom) {
        super(true);
        this.b = new byte[32];
        byte[] bArr = this.b;
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        bArr[31] = (byte) (bArr[31] & 127);
        bArr[31] = (byte) (bArr[31] | 64);
    }

    public final bs c() {
        byte[] bArr = new byte[32];
        org.bouncycastle.d.a.c.a.a(this.b, bArr);
        return new bs(bArr, 0);
    }

    public final void a(bs bsVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        bsVar.a(bArr2, 0);
        byte[] bArr3 = this.b;
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = (i2 * 4) + 0;
            int i4 = bArr3[i3] & 255;
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr3[i5] & 255) << 8);
            int i7 = i5 + 1;
            iArr[i2] = (bArr3[i7 + 1] << 24) | i6 | ((bArr3[i7] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = iArr[7] | 1073741824;
        int[] iArrA = org.bouncycastle.d.a.c.b.a();
        org.bouncycastle.d.a.c.b.a(bArr2, iArrA);
        int[] iArrA2 = org.bouncycastle.d.a.c.b.a();
        org.bouncycastle.d.a.c.b.a(iArrA, iArrA2, 0);
        int[] iArrA3 = org.bouncycastle.d.a.c.b.a();
        iArrA3[0] = 1;
        int[] iArrA4 = org.bouncycastle.d.a.c.b.a();
        iArrA4[0] = 1;
        int[] iArrA5 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA6 = org.bouncycastle.d.a.c.b.a();
        int[] iArrA7 = org.bouncycastle.d.a.c.b.a();
        int i8 = 1;
        int i9 = 254;
        while (true) {
            org.bouncycastle.d.a.c.b.a(iArrA4, iArrA5, iArrA6, iArrA4);
            org.bouncycastle.d.a.c.b.a(iArrA2, iArrA3, iArrA5, iArrA2);
            org.bouncycastle.d.a.c.b.b(iArrA6, iArrA2, iArrA6);
            org.bouncycastle.d.a.c.b.b(iArrA4, iArrA5, iArrA4);
            org.bouncycastle.d.a.c.b.d(iArrA5, iArrA5);
            org.bouncycastle.d.a.c.b.d(iArrA2, iArrA2);
            org.bouncycastle.d.a.c.b.d(iArrA5, iArrA2, iArrA7);
            org.bouncycastle.d.a.c.b.b(iArrA7, iArrA3);
            org.bouncycastle.d.a.c.b.a(iArrA3, iArrA2, iArrA3);
            org.bouncycastle.d.a.c.b.b(iArrA3, iArrA7, iArrA3);
            org.bouncycastle.d.a.c.b.b(iArrA2, iArrA5, iArrA2);
            org.bouncycastle.d.a.c.b.a(iArrA6, iArrA4, iArrA4, iArrA5);
            org.bouncycastle.d.a.c.b.d(iArrA4, iArrA4);
            org.bouncycastle.d.a.c.b.d(iArrA5, iArrA5);
            org.bouncycastle.d.a.c.b.b(iArrA5, iArrA, iArrA5);
            i9--;
            int i10 = (iArr[i9 >>> 5] >>> (i9 & 31)) & 1;
            int i11 = i8 ^ i10;
            org.bouncycastle.d.a.c.b.a(i11, iArrA2, iArrA4);
            org.bouncycastle.d.a.c.b.a(i11, iArrA3, iArrA5);
            if (i9 < 3) {
                break;
            } else {
                i8 = i10;
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int[] iArrA8 = org.bouncycastle.d.a.c.b.a();
            int[] iArrA9 = org.bouncycastle.d.a.c.b.a();
            org.bouncycastle.d.a.c.b.a(iArrA2, iArrA3, iArrA8, iArrA9);
            org.bouncycastle.d.a.c.b.d(iArrA8, iArrA8);
            org.bouncycastle.d.a.c.b.d(iArrA9, iArrA9);
            org.bouncycastle.d.a.c.b.b(iArrA8, iArrA9, iArrA2);
            org.bouncycastle.d.a.c.b.d(iArrA8, iArrA9, iArrA8);
            org.bouncycastle.d.a.c.b.b(iArrA8, iArrA3);
            org.bouncycastle.d.a.c.b.a(iArrA3, iArrA9, iArrA3);
            org.bouncycastle.d.a.c.b.b(iArrA3, iArrA8, iArrA3);
        }
        org.bouncycastle.d.a.c.b.a(iArrA3, iArrA3);
        org.bouncycastle.d.a.c.b.b(iArrA2, iArrA3, iArrA2);
        org.bouncycastle.d.a.c.b.d(iArrA2);
        org.bouncycastle.d.a.c.b.a(iArrA2, bArr, i);
        if (!(!org.bouncycastle.f.a.a(bArr, i, 32))) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }
}
