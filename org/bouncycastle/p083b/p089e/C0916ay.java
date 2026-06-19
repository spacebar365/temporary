package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ay */
/* JADX INFO: loaded from: classes.dex */
public final class C0916ay implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    static short[] f3792a = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};

    /* JADX INFO: renamed from: b */
    private int[] f3793b;

    /* JADX INFO: renamed from: c */
    private int[] f3794c;

    /* JADX INFO: renamed from: d */
    private int[] f3795d;

    /* JADX INFO: renamed from: e */
    private int[] f3796e;

    /* JADX INFO: renamed from: f */
    private boolean f3797f;

    /* JADX INFO: renamed from: a */
    private int m2260a(int i, int i2) {
        int i3 = i2 & 255;
        int i4 = ((i2 >> 8) & 255) ^ f3792a[this.f3793b[i] ^ i3];
        int i5 = i3 ^ f3792a[this.f3794c[i] ^ i4];
        int i6 = i4 ^ f3792a[this.f3795d[i] ^ i5];
        return (i6 << 8) + (i5 ^ f3792a[this.f3796e[i] ^ i6]);
    }

    /* JADX INFO: renamed from: b */
    private int m2261b(int i, int i2) {
        int i3 = (i2 >> 8) & 255;
        int i4 = (i2 & 255) ^ f3792a[this.f3796e[i] ^ i3];
        int i5 = i3 ^ f3792a[this.f3795d[i] ^ i4];
        int i6 = i4 ^ f3792a[this.f3794c[i] ^ i5];
        return i6 + ((i5 ^ f3792a[this.f3793b[i] ^ i6]) << 8);
    }

    /* JADX INFO: renamed from: b */
    private int m2262b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i + 0] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 5] & 255) + (bArr[i + 4] << 8);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 0;
        int i8 = 0;
        while (i7 < 2) {
            int i9 = 0;
            while (i9 < 8) {
                int iM2260a = m2260a(i8, i3);
                i3 = (iM2260a ^ i6) ^ (i8 + 1);
                i8++;
                i9++;
                i6 = i5;
                i5 = i4;
                i4 = iM2260a;
            }
            int i10 = 0;
            int iM2260a2 = i4;
            while (i10 < 8) {
                int i11 = (i3 ^ iM2260a2) ^ (i8 + 1);
                iM2260a2 = m2260a(i8, i3);
                i8++;
                i10++;
                i3 = i6;
                i6 = i5;
                i5 = i11;
            }
            i7++;
            i4 = iM2260a2;
        }
        bArr2[i2 + 0] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    /* JADX INFO: renamed from: c */
    private int m2263c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iM2261b = (bArr[i + 0] << 8) + (bArr[i + 1] & 255);
        int i3 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i4 = (bArr[i + 5] & 255) + (bArr[i + 4] << 8);
        int i5 = (bArr[i + 7] & 255) + (bArr[i + 6] << 8);
        int i6 = 31;
        for (int i7 = 0; i7 < 2; i7++) {
            int i8 = 0;
            while (i8 < 8) {
                int iM2261b2 = m2261b(i6, i3);
                i3 = (i6 + 1) ^ (i4 ^ iM2261b2);
                i6--;
                i8++;
                i4 = i5;
                i5 = iM2261b;
                iM2261b = iM2261b2;
            }
            int i9 = 0;
            while (i9 < 8) {
                int i10 = (i6 + 1) ^ (iM2261b ^ i3);
                iM2261b = m2261b(i6, i3);
                i6--;
                i9++;
                i3 = i4;
                i4 = i5;
                i5 = i10;
            }
        }
        bArr2[i2 + 0] = (byte) (iM2261b >> 8);
        bArr2[i2 + 1] = (byte) iM2261b;
        bArr2[i2 + 2] = (byte) (i3 >> 8);
        bArr2[i2 + 3] = (byte) i3;
        bArr2[i2 + 4] = (byte) (i4 >> 8);
        bArr2[i2 + 5] = (byte) i4;
        bArr2[i2 + 6] = (byte) (i5 >> 8);
        bArr2[i2 + 7] = (byte) i5;
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3794c == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new C1163o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new C0803ac("output buffer too short");
        }
        if (this.f3797f) {
            m2262b(bArr, i, bArr2, i2);
            return 8;
        }
        m2263c(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        if (!(interfaceC1003i instanceof C1076ba)) {
            throw new IllegalArgumentException("invalid parameter passed to SKIPJACK init - " + interfaceC1003i.getClass().getName());
        }
        byte[] bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        this.f3797f = z;
        this.f3793b = new int[32];
        this.f3794c = new int[32];
        this.f3795d = new int[32];
        this.f3796e = new int[32];
        for (int i = 0; i < 32; i++) {
            this.f3793b[i] = bArrM2603a[(i * 4) % 10] & 255;
            this.f3794c[i] = bArrM2603a[((i * 4) + 1) % 10] & 255;
            this.f3795d[i] = bArrM2603a[((i * 4) + 2) % 10] & 255;
            this.f3796e[i] = bArrM2603a[((i * 4) + 3) % 10] & 255;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }
}
