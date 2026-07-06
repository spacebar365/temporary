package org.bouncycastle.b.d;

import java.math.BigInteger;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.v;

/* JADX INFO: loaded from: classes.dex */
public final class a implements org.bouncycastle.b.a {
    private static final BigInteger a = BigInteger.valueOf(16);
    private static final BigInteger b = BigInteger.valueOf(6);
    private static byte[] c = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] d = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};
    private org.bouncycastle.b.a e;
    private boolean f;
    private int g;
    private int h = 0;
    private BigInteger i;

    public a(org.bouncycastle.b.a aVar) {
        this.e = aVar;
    }

    @Override // org.bouncycastle.b.a
    public final int a() {
        int iA = this.e.a();
        return this.f ? (iA + 1) / 2 : iA;
    }

    @Override // org.bouncycastle.b.a
    public final void a(boolean z, i iVar) {
        bm bmVar = iVar instanceof bf ? (bm) ((bf) iVar).b() : (bm) iVar;
        this.e.a(z, iVar);
        this.i = bmVar.b();
        this.g = this.i.bitLength();
        this.f = z;
    }

    @Override // org.bouncycastle.b.a
    public final int b() {
        int iB = this.e.b();
        return this.f ? iB : (iB + 1) / 2;
    }

    @Override // org.bouncycastle.b.a
    public final byte[] a(byte[] bArr, int i, int i2) throws v {
        byte[] bArr2;
        int i3;
        if (this.f) {
            byte[] bArr3 = new byte[(this.g + 7) / 8];
            int i4 = this.h + 1;
            int i5 = (this.g + 13) / 16;
            int i6 = 0;
            while (i6 < i5) {
                if (i6 > i5 - i2) {
                    System.arraycopy(bArr, (i + i2) - (i5 - i6), bArr3, bArr3.length - i5, i5 - i6);
                } else {
                    System.arraycopy(bArr, i, bArr3, bArr3.length - (i6 + i2), i2);
                }
                i6 += i2;
            }
            for (int length = bArr3.length - (i5 * 2); length != bArr3.length; length += 2) {
                byte b2 = bArr3[(bArr3.length - i5) + (length / 2)];
                bArr3[length] = (byte) ((c[(b2 & 255) >>> 4] << 4) | c[b2 & 15]);
                bArr3[length + 1] = b2;
            }
            int length2 = bArr3.length - (i2 * 2);
            bArr3[length2] = (byte) (i4 ^ bArr3[length2]);
            bArr3[bArr3.length - 1] = (byte) ((bArr3[bArr3.length - 1] << 4) | 6);
            int i7 = 8 - ((this.g - 1) % 8);
            if (i7 != 8) {
                bArr3[0] = (byte) (bArr3[0] & (255 >>> i7));
                bArr3[0] = (byte) ((128 >>> i7) | bArr3[0]);
                i3 = 0;
            } else {
                bArr3[0] = 0;
                bArr3[1] = (byte) (bArr3[1] | 128);
                i3 = 1;
            }
            return this.e.a(bArr3, i3, bArr3.length - i3);
        }
        byte[] bArrA = this.e.a(bArr, i, i2);
        int i8 = (this.g + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrA);
        if (!bigInteger.mod(a).equals(b)) {
            if (!this.i.subtract(bigInteger).mod(a).equals(b)) {
                throw new v("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.i.subtract(bigInteger);
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            bArr2 = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr2, 0, bArr2.length);
        } else {
            bArr2 = byteArray;
        }
        if ((bArr2[bArr2.length - 1] & 15) != 6) {
            throw new v("invalid forcing byte in block");
        }
        bArr2[bArr2.length - 1] = (byte) (((bArr2[bArr2.length - 1] & 255) >>> 4) | (d[(bArr2[bArr2.length - 2] & 255) >> 4] << 4));
        bArr2[0] = (byte) ((c[(bArr2[1] & 255) >>> 4] << 4) | c[bArr2[1] & 15]);
        int i9 = 1;
        int i10 = 0;
        boolean z = false;
        for (int length3 = bArr2.length - 1; length3 >= bArr2.length - (i8 * 2); length3 -= 2) {
            int i11 = (c[(bArr2[length3] & 255) >>> 4] << 4) | c[bArr2[length3] & 15];
            if (((bArr2[length3 - 1] ^ i11) & 255) != 0) {
                if (z) {
                    throw new v("invalid tsums in block");
                }
                i9 = (bArr2[length3 - 1] ^ i11) & 255;
                i10 = length3 - 1;
                z = true;
            }
        }
        bArr2[i10] = 0;
        byte[] bArr4 = new byte[(bArr2.length - i10) / 2];
        for (int i12 = 0; i12 < bArr4.length; i12++) {
            bArr4[i12] = bArr2[(i12 * 2) + i10 + 1];
        }
        this.h = i9 - 1;
        return bArr4;
    }
}
