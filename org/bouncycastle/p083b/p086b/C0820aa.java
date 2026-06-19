package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0820aa extends AbstractC0831h {

    /* JADX INFO: renamed from: e */
    private static final int[] f3349e = new int[64];

    /* JADX INFO: renamed from: a */
    private int[] f3350a;

    /* JADX INFO: renamed from: b */
    private int[] f3351b;

    /* JADX INFO: renamed from: c */
    private int f3352c;

    /* JADX INFO: renamed from: d */
    private int[] f3353d;

    static {
        for (int i = 0; i < 16; i++) {
            f3349e[i] = (2043430169 << i) | (2043430169 >>> (32 - i));
        }
        for (int i2 = 16; i2 < 64; i2++) {
            int i3 = i2 % 32;
            f3349e[i2] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public C0820aa() {
        this.f3350a = new int[8];
        this.f3351b = new int[16];
        this.f3353d = new int[68];
        mo1931c();
    }

    public C0820aa(C0820aa c0820aa) {
        super(c0820aa);
        this.f3350a = new int[8];
        this.f3351b = new int[16];
        this.f3353d = new int[68];
        m1935a(c0820aa);
    }

    /* JADX INFO: renamed from: a */
    private static int m1933a(int i) {
        return (((i << 9) | (i >>> 23)) ^ i) ^ ((i << 17) | (i >>> 15));
    }

    /* JADX INFO: renamed from: a */
    private static int m1934a(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    /* JADX INFO: renamed from: a */
    private void m1935a(C0820aa c0820aa) {
        System.arraycopy(c0820aa.f3350a, 0, this.f3350a, 0, this.f3350a.length);
        System.arraycopy(c0820aa.f3351b, 0, this.f3351b, 0, this.f3351b.length);
        this.f3352c = c0820aa.f3352c;
    }

    /* JADX INFO: renamed from: b */
    private static int m1936b(int i) {
        return (((i << 15) | (i >>> 17)) ^ i) ^ ((i << 23) | (i >>> 9));
    }

    /* JADX INFO: renamed from: b */
    private static int m1937b(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SM3";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3352c > 14) {
            this.f3351b[this.f3352c] = 0;
            this.f3352c++;
            mo1942g();
        }
        while (this.f3352c < 14) {
            this.f3351b[this.f3352c] = 0;
            this.f3352c++;
        }
        int[] iArr = this.f3351b;
        int i = this.f3352c;
        this.f3352c = i + 1;
        iArr[i] = (int) (j >>> 32);
        int[] iArr2 = this.f3351b;
        int i2 = this.f3352c;
        this.f3352c = i2 + 1;
        iArr2[i2] = (int) j;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        C0820aa c0820aa = (C0820aa) interfaceC1554e;
        super.m2016a((AbstractC0831h) c0820aa);
        m1935a(c0820aa);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 32;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i2 + 1;
        this.f3351b[this.f3352c] = i3 | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
        this.f3352c++;
        if (this.f3352c >= 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3350a[0] = 1937774191;
        this.f3350a[1] = 1226093241;
        this.f3350a[2] = 388252375;
        this.f3350a[3] = -628488704;
        this.f3350a[4] = -1452330820;
        this.f3350a[5] = 372324522;
        this.f3350a[6] = -477237683;
        this.f3350a[7] = -1325724082;
        this.f3352c = 0;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0820aa(this);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        for (int i2 : this.f3350a) {
            AbstractC1556g.m4136a(i2, bArr, i);
            i += 4;
        }
        mo1931c();
        return 32;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        for (int i = 0; i < 16; i++) {
            this.f3353d[i] = this.f3351b[i];
        }
        for (int i2 = 16; i2 < 68; i2++) {
            int i3 = this.f3353d[i2 - 3];
            int i4 = this.f3353d[i2 - 13];
            int i5 = (i4 >>> 25) | (i4 << 7);
            int[] iArr = this.f3353d;
            iArr[i2] = (m1936b(((i3 >>> 17) | (i3 << 15)) ^ (iArr[i2 - 16] ^ this.f3353d[i2 - 9])) ^ i5) ^ this.f3353d[i2 - 6];
        }
        int i6 = this.f3350a[0];
        int i7 = this.f3350a[1];
        int i8 = this.f3350a[2];
        int i9 = this.f3350a[3];
        int i10 = this.f3350a[4];
        int i11 = this.f3350a[5];
        int i12 = this.f3350a[6];
        int i13 = this.f3350a[7];
        int i14 = 0;
        while (i14 < 16) {
            int i15 = (i6 << 12) | (i6 >>> 20);
            int i16 = i15 + i10 + f3349e[i14];
            int i17 = (i16 >>> 25) | (i16 << 7);
            int i18 = this.f3353d[i14];
            int i19 = (this.f3353d[i14 + 4] ^ i18) + (i15 ^ i17) + i9 + ((i6 ^ i7) ^ i8);
            int i20 = i13 + ((i10 ^ i11) ^ i12) + i17 + i18;
            int i21 = (i7 << 9) | (i7 >>> 23);
            int i22 = (i11 << 19) | (i11 >>> 13);
            int iM1933a = m1933a(i20);
            i14++;
            i13 = i12;
            i11 = i10;
            i9 = i8;
            i7 = i6;
            i12 = i22;
            i8 = i21;
            i10 = iM1933a;
            i6 = i19;
        }
        int i23 = 16;
        int i24 = i11;
        int i25 = i9;
        int i26 = i7;
        while (i23 < 64) {
            int i27 = (i6 << 12) | (i6 >>> 20);
            int i28 = i27 + i10 + f3349e[i23];
            int i29 = (i28 >>> 25) | (i28 << 7);
            int i30 = this.f3353d[i23];
            int iM1934a = (this.f3353d[i23 + 4] ^ i30) + (i27 ^ i29) + i25 + m1934a(i6, i26, i8);
            int iM1937b = i13 + m1937b(i10, i24, i12) + i29 + i30;
            int i31 = (i26 << 9) | (i26 >>> 23);
            int i32 = (i24 << 19) | (i24 >>> 13);
            int iM1933a2 = m1933a(iM1937b);
            i23++;
            i13 = i12;
            i24 = i10;
            i25 = i8;
            i26 = i6;
            i12 = i32;
            i8 = i31;
            i10 = iM1933a2;
            i6 = iM1934a;
        }
        int[] iArr2 = this.f3350a;
        iArr2[0] = iArr2[0] ^ i6;
        int[] iArr3 = this.f3350a;
        iArr3[1] = iArr3[1] ^ i26;
        int[] iArr4 = this.f3350a;
        iArr4[2] = iArr4[2] ^ i8;
        int[] iArr5 = this.f3350a;
        iArr5[3] = iArr5[3] ^ i25;
        int[] iArr6 = this.f3350a;
        iArr6[4] = i10 ^ iArr6[4];
        int[] iArr7 = this.f3350a;
        iArr7[5] = i24 ^ iArr7[5];
        int[] iArr8 = this.f3350a;
        iArr8[6] = i12 ^ iArr8[6];
        int[] iArr9 = this.f3350a;
        iArr9[7] = i13 ^ iArr9[7];
        this.f3352c = 0;
    }
}
