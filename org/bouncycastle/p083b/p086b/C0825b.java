package org.bouncycastle.p083b.p086b;

import android.R;
import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0825b implements InterfaceC1178u {

    /* JADX INFO: renamed from: a */
    private static final int[] f3406a = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* JADX INFO: renamed from: b */
    private static final byte[][] f3407b = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};

    /* JADX INFO: renamed from: c */
    private int f3408c;

    /* JADX INFO: renamed from: d */
    private int f3409d;

    /* JADX INFO: renamed from: e */
    private byte[] f3410e;

    /* JADX INFO: renamed from: f */
    private byte[] f3411f;

    /* JADX INFO: renamed from: g */
    private byte[] f3412g;

    /* JADX INFO: renamed from: h */
    private byte[] f3413h;

    /* JADX INFO: renamed from: i */
    private int f3414i;

    /* JADX INFO: renamed from: j */
    private int[] f3415j;

    /* JADX INFO: renamed from: k */
    private int[] f3416k;

    /* JADX INFO: renamed from: l */
    private int f3417l;

    /* JADX INFO: renamed from: m */
    private int f3418m;

    /* JADX INFO: renamed from: n */
    private int f3419n;

    public C0825b() {
        this(256);
    }

    public C0825b(int i) {
        this.f3408c = 32;
        this.f3409d = 0;
        this.f3410e = null;
        this.f3411f = null;
        this.f3412g = null;
        this.f3413h = null;
        this.f3414i = 0;
        this.f3415j = new int[16];
        this.f3416k = null;
        this.f3417l = 0;
        this.f3418m = 0;
        this.f3419n = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.f3413h = new byte[64];
        this.f3409d = 0;
        this.f3408c = i / 8;
        m1992e();
    }

    public C0825b(C0825b c0825b) {
        this.f3408c = 32;
        this.f3409d = 0;
        this.f3410e = null;
        this.f3411f = null;
        this.f3412g = null;
        this.f3413h = null;
        this.f3414i = 0;
        this.f3415j = new int[16];
        this.f3416k = null;
        this.f3417l = 0;
        this.f3418m = 0;
        this.f3419n = 0;
        this.f3414i = c0825b.f3414i;
        this.f3413h = C1535a.m4086b(c0825b.f3413h);
        this.f3409d = c0825b.f3409d;
        this.f3412g = C1535a.m4086b(c0825b.f3412g);
        this.f3408c = c0825b.f3408c;
        this.f3416k = C1535a.m4092c(c0825b.f3416k);
        this.f3411f = C1535a.m4086b(c0825b.f3411f);
    }

    /* JADX INFO: renamed from: a */
    private static int m1989a(int i, int i2) {
        return (i >>> i2) | (i << (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private void m1990a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f3415j;
        iArr[i3] = iArr[i3] + this.f3415j[i4] + i;
        int[] iArr2 = this.f3415j;
        iArr2[i6] = m1989a(iArr2[i6] ^ this.f3415j[i3], 16);
        int[] iArr3 = this.f3415j;
        iArr3[i5] = iArr3[i5] + this.f3415j[i6];
        int[] iArr4 = this.f3415j;
        iArr4[i4] = m1989a(iArr4[i4] ^ this.f3415j[i5], 12);
        int[] iArr5 = this.f3415j;
        iArr5[i3] = iArr5[i3] + this.f3415j[i4] + i2;
        int[] iArr6 = this.f3415j;
        iArr6[i6] = m1989a(iArr6[i6] ^ this.f3415j[i3], 8);
        int[] iArr7 = this.f3415j;
        iArr7[i5] = iArr7[i5] + this.f3415j[i6];
        int[] iArr8 = this.f3415j;
        iArr8[i4] = m1989a(iArr8[i4] ^ this.f3415j[i5], 7);
    }

    /* JADX INFO: renamed from: b */
    private void m1991b(byte[] bArr, int i) {
        m1993f();
        int[] iArr = new int[16];
        for (int i2 = 0; i2 < 16; i2++) {
            iArr[i2] = AbstractC1556g.m4152c(bArr, (i2 * 4) + i);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 10) {
                break;
            }
            m1990a(iArr[f3407b[i4][0]], iArr[f3407b[i4][1]], 0, 4, 8, 12);
            m1990a(iArr[f3407b[i4][2]], iArr[f3407b[i4][3]], 1, 5, 9, 13);
            m1990a(iArr[f3407b[i4][4]], iArr[f3407b[i4][5]], 2, 6, 10, 14);
            m1990a(iArr[f3407b[i4][6]], iArr[f3407b[i4][7]], 3, 7, 11, 15);
            m1990a(iArr[f3407b[i4][8]], iArr[f3407b[i4][9]], 0, 5, 10, 15);
            m1990a(iArr[f3407b[i4][10]], iArr[f3407b[i4][11]], 1, 6, 11, 12);
            m1990a(iArr[f3407b[i4][12]], iArr[f3407b[i4][13]], 2, 7, 8, 13);
            m1990a(iArr[f3407b[i4][14]], iArr[f3407b[i4][15]], 3, 4, 9, 14);
            i3 = i4 + 1;
        }
        for (int i5 = 0; i5 < this.f3416k.length; i5++) {
            int[] iArr2 = this.f3416k;
            iArr2[i5] = (iArr2[i5] ^ this.f3415j[i5]) ^ this.f3415j[i5 + 8];
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1992e() {
        if (this.f3416k == null) {
            this.f3416k = new int[8];
            this.f3416k[0] = f3406a[0] ^ ((this.f3408c | (this.f3409d << 8)) | R.attr.theme);
            this.f3416k[1] = f3406a[1];
            this.f3416k[2] = f3406a[2];
            this.f3416k[3] = f3406a[3];
            this.f3416k[4] = f3406a[4];
            this.f3416k[5] = f3406a[5];
            if (this.f3410e != null) {
                int[] iArr = this.f3416k;
                iArr[4] = iArr[4] ^ AbstractC1556g.m4152c(this.f3410e, 0);
                int[] iArr2 = this.f3416k;
                iArr2[5] = iArr2[5] ^ AbstractC1556g.m4152c(this.f3410e, 4);
            }
            this.f3416k[6] = f3406a[6];
            this.f3416k[7] = f3406a[7];
            if (this.f3411f != null) {
                int[] iArr3 = this.f3416k;
                iArr3[6] = iArr3[6] ^ AbstractC1556g.m4152c(this.f3411f, 0);
                int[] iArr4 = this.f3416k;
                iArr4[7] = iArr4[7] ^ AbstractC1556g.m4152c(this.f3411f, 4);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m1993f() {
        System.arraycopy(this.f3416k, 0, this.f3415j, 0, this.f3416k.length);
        System.arraycopy(f3406a, 0, this.f3415j, this.f3416k.length, 4);
        this.f3415j[12] = this.f3417l ^ f3406a[4];
        this.f3415j[13] = this.f3418m ^ f3406a[5];
        this.f3415j[14] = this.f3419n ^ f3406a[6];
        this.f3415j[15] = f3406a[7];
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        if (64 - this.f3414i != 0) {
            this.f3413h[this.f3414i] = b;
            this.f3414i++;
            return;
        }
        this.f3417l += 64;
        if (this.f3417l == 0) {
            this.f3418m++;
        }
        m1991b(this.f3413h, 0);
        C1535a.m4071a(this.f3413h, (byte) 0);
        this.f3413h[0] = b;
        this.f3414i = 1;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.f3414i != 0) {
            i3 = 64 - this.f3414i;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.f3413h, this.f3414i, i2);
                this.f3414i += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f3413h, this.f3414i, i3);
            this.f3417l += 64;
            if (this.f3417l == 0) {
                this.f3418m++;
            }
            m1991b(this.f3413h, 0);
            this.f3414i = 0;
            C1535a.m4071a(this.f3413h, (byte) 0);
        } else {
            i3 = 0;
        }
        int i4 = (i + i2) - 64;
        int i5 = i3 + i;
        while (i5 < i4) {
            this.f3417l += 64;
            if (this.f3417l == 0) {
                this.f3418m++;
            }
            m1991b(bArr, i5);
            i5 += 64;
        }
        System.arraycopy(bArr, i5, this.f3413h, 0, (i + i2) - i5);
        this.f3414i = ((i + i2) - i5) + this.f3414i;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return this.f3408c;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3414i = 0;
        this.f3419n = 0;
        this.f3417l = 0;
        this.f3418m = 0;
        this.f3416k = null;
        C1535a.m4071a(this.f3413h, (byte) 0);
        if (this.f3412g != null) {
            System.arraycopy(this.f3412g, 0, this.f3413h, 0, this.f3412g.length);
            this.f3414i = 64;
        }
        m1992e();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 64;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        this.f3419n = -1;
        this.f3417l += this.f3414i;
        if (this.f3417l < 0 && this.f3414i > (-this.f3417l)) {
            this.f3418m++;
        }
        m1991b(this.f3413h, 0);
        C1535a.m4071a(this.f3413h, (byte) 0);
        C1535a.m4072a(this.f3415j);
        for (int i2 = 0; i2 < this.f3416k.length && i2 * 4 < this.f3408c; i2++) {
            byte[] bArr2 = new byte[4];
            AbstractC1556g.m4147b(this.f3416k[i2], bArr2, 0);
            if (i2 * 4 < this.f3408c - 4) {
                System.arraycopy(bArr2, 0, bArr, (i2 * 4) + i, 4);
            } else {
                System.arraycopy(bArr2, 0, bArr, (i2 * 4) + i, this.f3408c - (i2 * 4));
            }
        }
        C1535a.m4072a(this.f3416k);
        mo1931c();
        return this.f3408c;
    }
}
