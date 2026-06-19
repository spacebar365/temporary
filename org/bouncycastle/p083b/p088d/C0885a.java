package org.bouncycastle.p083b.p088d;

import java.math.BigInteger;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0786a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1088bm;

/* JADX INFO: renamed from: org.bouncycastle.b.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0885a implements InterfaceC0786a {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f3622a = BigInteger.valueOf(16);

    /* JADX INFO: renamed from: b */
    private static final BigInteger f3623b = BigInteger.valueOf(6);

    /* JADX INFO: renamed from: c */
    private static byte[] f3624c = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};

    /* JADX INFO: renamed from: d */
    private static byte[] f3625d = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    /* JADX INFO: renamed from: e */
    private InterfaceC0786a f3626e;

    /* JADX INFO: renamed from: f */
    private boolean f3627f;

    /* JADX INFO: renamed from: g */
    private int f3628g;

    /* JADX INFO: renamed from: h */
    private int f3629h = 0;

    /* JADX INFO: renamed from: i */
    private BigInteger f3630i;

    public C0885a(InterfaceC0786a interfaceC0786a) {
        this.f3626e = interfaceC0786a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final int mo1868a() {
        int iMo1868a = this.f3626e.mo1868a();
        return this.f3627f ? (iMo1868a + 1) / 2 : iMo1868a;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final void mo1869a(boolean z, InterfaceC1003i interfaceC1003i) {
        C1088bm c1088bm = interfaceC1003i instanceof C1081bf ? (C1088bm) ((C1081bf) interfaceC1003i).m2614b() : (C1088bm) interfaceC1003i;
        this.f3626e.mo1869a(z, interfaceC1003i);
        this.f3630i = c1088bm.m2625b();
        this.f3628g = this.f3630i.bitLength();
        this.f3627f = z;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: b */
    public final int mo1871b() {
        int iMo1871b = this.f3626e.mo1871b();
        return this.f3627f ? iMo1871b : (iMo1871b + 1) / 2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0786a
    /* JADX INFO: renamed from: a */
    public final byte[] mo1870a(byte[] bArr, int i, int i2) throws C1179v {
        byte[] bArr2;
        int i3;
        if (this.f3627f) {
            byte[] bArr3 = new byte[(this.f3628g + 7) / 8];
            int i4 = this.f3629h + 1;
            int i5 = (this.f3628g + 13) / 16;
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
                byte b = bArr3[(bArr3.length - i5) + (length / 2)];
                bArr3[length] = (byte) ((f3624c[(b & 255) >>> 4] << 4) | f3624c[b & 15]);
                bArr3[length + 1] = b;
            }
            int length2 = bArr3.length - (i2 * 2);
            bArr3[length2] = (byte) (i4 ^ bArr3[length2]);
            bArr3[bArr3.length - 1] = (byte) ((bArr3[bArr3.length - 1] << 4) | 6);
            int i7 = 8 - ((this.f3628g - 1) % 8);
            if (i7 != 8) {
                bArr3[0] = (byte) (bArr3[0] & (255 >>> i7));
                bArr3[0] = (byte) ((128 >>> i7) | bArr3[0]);
                i3 = 0;
            } else {
                bArr3[0] = 0;
                bArr3[1] = (byte) (bArr3[1] | 128);
                i3 = 1;
            }
            return this.f3626e.mo1870a(bArr3, i3, bArr3.length - i3);
        }
        byte[] bArrMo1870a = this.f3626e.mo1870a(bArr, i, i2);
        int i8 = (this.f3628g + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrMo1870a);
        if (!bigInteger.mod(f3622a).equals(f3623b)) {
            if (!this.f3630i.subtract(bigInteger).mod(f3622a).equals(f3623b)) {
                throw new C1179v("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.f3630i.subtract(bigInteger);
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            bArr2 = new byte[byteArray.length - 1];
            System.arraycopy(byteArray, 1, bArr2, 0, bArr2.length);
        } else {
            bArr2 = byteArray;
        }
        if ((bArr2[bArr2.length - 1] & 15) != 6) {
            throw new C1179v("invalid forcing byte in block");
        }
        bArr2[bArr2.length - 1] = (byte) (((bArr2[bArr2.length - 1] & 255) >>> 4) | (f3625d[(bArr2[bArr2.length - 2] & 255) >> 4] << 4));
        bArr2[0] = (byte) ((f3624c[(bArr2[1] & 255) >>> 4] << 4) | f3624c[bArr2[1] & 15]);
        int i9 = 1;
        int i10 = 0;
        boolean z = false;
        for (int length3 = bArr2.length - 1; length3 >= bArr2.length - (i8 * 2); length3 -= 2) {
            int i11 = (f3624c[(bArr2[length3] & 255) >>> 4] << 4) | f3624c[bArr2[length3] & 15];
            if (((bArr2[length3 - 1] ^ i11) & 255) != 0) {
                if (z) {
                    throw new C1179v("invalid tsums in block");
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
        this.f3629h = i9 - 1;
        return bArr4;
    }
}
