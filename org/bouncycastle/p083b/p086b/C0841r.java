package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0841r extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3535a;

    /* JADX INFO: renamed from: b */
    private int f3536b;

    /* JADX INFO: renamed from: c */
    private int f3537c;

    /* JADX INFO: renamed from: d */
    private int f3538d;

    /* JADX INFO: renamed from: e */
    private int f3539e;

    /* JADX INFO: renamed from: f */
    private int f3540f;

    /* JADX INFO: renamed from: g */
    private int f3541g;

    /* JADX INFO: renamed from: h */
    private int f3542h;

    /* JADX INFO: renamed from: i */
    private int f3543i;

    /* JADX INFO: renamed from: j */
    private int f3544j;

    /* JADX INFO: renamed from: k */
    private int[] f3545k;

    /* JADX INFO: renamed from: l */
    private int f3546l;

    public C0841r() {
        this.f3545k = new int[16];
        mo1931c();
    }

    public C0841r(C0841r c0841r) {
        super(c0841r);
        this.f3545k = new int[16];
        m2086a(c0841r);
    }

    /* JADX INFO: renamed from: a */
    private static int m2083a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2084a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2085a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2086a(C0841r c0841r) {
        super.m2016a((AbstractC0831h) c0841r);
        this.f3535a = c0841r.f3535a;
        this.f3536b = c0841r.f3536b;
        this.f3537c = c0841r.f3537c;
        this.f3538d = c0841r.f3538d;
        this.f3539e = c0841r.f3539e;
        this.f3540f = c0841r.f3540f;
        this.f3541g = c0841r.f3541g;
        this.f3542h = c0841r.f3542h;
        this.f3543i = c0841r.f3543i;
        this.f3544j = c0841r.f3544j;
        System.arraycopy(c0841r.f3545k, 0, this.f3545k, 0, c0841r.f3545k.length);
        this.f3546l = c0841r.f3546l;
    }

    /* JADX INFO: renamed from: b */
    private static int m2087b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        m2085a(this.f3535a, bArr, i);
        m2085a(this.f3536b, bArr, i + 4);
        m2085a(this.f3537c, bArr, i + 8);
        m2085a(this.f3538d, bArr, i + 12);
        m2085a(this.f3539e, bArr, i + 16);
        m2085a(this.f3540f, bArr, i + 20);
        m2085a(this.f3541g, bArr, i + 24);
        m2085a(this.f3542h, bArr, i + 28);
        m2085a(this.f3543i, bArr, i + 32);
        m2085a(this.f3544j, bArr, i + 36);
        mo1931c();
        return 40;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "RIPEMD320";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3546l > 14) {
            mo1942g();
        }
        this.f3545k[14] = (int) ((-1) & j);
        this.f3545k[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2086a((C0841r) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 40;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int[] iArr = this.f3545k;
        int i2 = this.f3546l;
        this.f3546l = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f3546l == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3535a = 1732584193;
        this.f3536b = -271733879;
        this.f3537c = -1732584194;
        this.f3538d = 271733878;
        this.f3539e = -1009589776;
        this.f3540f = 1985229328;
        this.f3541g = -19088744;
        this.f3542h = -1985229329;
        this.f3543i = 19088743;
        this.f3544j = 1009589775;
        this.f3546l = 0;
        for (int i = 0; i != this.f3545k.length; i++) {
            this.f3545k[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0841r(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        int i = this.f3535a;
        int i2 = this.f3536b;
        int i3 = this.f3537c;
        int i4 = this.f3538d;
        int i5 = this.f3539e;
        int i6 = this.f3540f;
        int i7 = this.f3541g;
        int i8 = this.f3542h;
        int i9 = this.f3543i;
        int i10 = this.f3544j;
        int iM2083a = m2083a(i + ((i2 ^ i3) ^ i4) + this.f3545k[0], 11) + i5;
        int iM2083a2 = m2083a(i3, 10);
        int iM2083a3 = m2083a(i5 + ((iM2083a ^ i2) ^ iM2083a2) + this.f3545k[1], 14) + i4;
        int iM2083a4 = m2083a(i2, 10);
        int iM2083a5 = m2083a(i4 + ((iM2083a3 ^ iM2083a) ^ iM2083a4) + this.f3545k[2], 15) + iM2083a2;
        int iM2083a6 = m2083a(iM2083a, 10);
        int iM2083a7 = m2083a(iM2083a2 + ((iM2083a5 ^ iM2083a3) ^ iM2083a6) + this.f3545k[3], 12) + iM2083a4;
        int iM2083a8 = m2083a(iM2083a3, 10);
        int iM2083a9 = m2083a(iM2083a4 + ((iM2083a7 ^ iM2083a5) ^ iM2083a8) + this.f3545k[4], 5) + iM2083a6;
        int iM2083a10 = m2083a(iM2083a5, 10);
        int iM2083a11 = m2083a(iM2083a6 + ((iM2083a9 ^ iM2083a7) ^ iM2083a10) + this.f3545k[5], 8) + iM2083a8;
        int iM2083a12 = m2083a(iM2083a7, 10);
        int iM2083a13 = m2083a(iM2083a8 + ((iM2083a11 ^ iM2083a9) ^ iM2083a12) + this.f3545k[6], 7) + iM2083a10;
        int iM2083a14 = m2083a(iM2083a9, 10);
        int iM2083a15 = m2083a(iM2083a10 + ((iM2083a13 ^ iM2083a11) ^ iM2083a14) + this.f3545k[7], 9) + iM2083a12;
        int iM2083a16 = m2083a(iM2083a11, 10);
        int iM2083a17 = m2083a(iM2083a12 + ((iM2083a15 ^ iM2083a13) ^ iM2083a16) + this.f3545k[8], 11) + iM2083a14;
        int iM2083a18 = m2083a(iM2083a13, 10);
        int iM2083a19 = m2083a(iM2083a14 + ((iM2083a17 ^ iM2083a15) ^ iM2083a18) + this.f3545k[9], 13) + iM2083a16;
        int iM2083a20 = m2083a(iM2083a15, 10);
        int iM2083a21 = m2083a(iM2083a16 + ((iM2083a19 ^ iM2083a17) ^ iM2083a20) + this.f3545k[10], 14) + iM2083a18;
        int iM2083a22 = m2083a(iM2083a17, 10);
        int iM2083a23 = m2083a(iM2083a18 + ((iM2083a21 ^ iM2083a19) ^ iM2083a22) + this.f3545k[11], 15) + iM2083a20;
        int iM2083a24 = m2083a(iM2083a19, 10);
        int iM2083a25 = m2083a(iM2083a20 + ((iM2083a23 ^ iM2083a21) ^ iM2083a24) + this.f3545k[12], 6) + iM2083a22;
        int iM2083a26 = m2083a(iM2083a21, 10);
        int iM2083a27 = m2083a(iM2083a22 + ((iM2083a25 ^ iM2083a23) ^ iM2083a26) + this.f3545k[13], 7) + iM2083a24;
        int iM2083a28 = m2083a(iM2083a23, 10);
        int iM2083a29 = m2083a(iM2083a24 + ((iM2083a27 ^ iM2083a25) ^ iM2083a28) + this.f3545k[14], 9) + iM2083a26;
        int iM2083a30 = m2083a(iM2083a25, 10);
        int iM2083a31 = m2083a(iM2083a26 + ((iM2083a29 ^ iM2083a27) ^ iM2083a30) + this.f3545k[15], 8) + iM2083a28;
        int iM2083a32 = m2083a(iM2083a27, 10);
        int iM2083a33 = m2083a(i6 + (((i9 ^ (-1)) | i8) ^ i7) + this.f3545k[5] + 1352829926, 8) + i10;
        int iM2083a34 = m2083a(i8, 10);
        int iM2083a35 = m2083a(i10 + (((iM2083a34 ^ (-1)) | i7) ^ iM2083a33) + this.f3545k[14] + 1352829926, 9) + i9;
        int iM2083a36 = m2083a(i7, 10);
        int iM2083a37 = m2083a(i9 + (((iM2083a36 ^ (-1)) | iM2083a33) ^ iM2083a35) + this.f3545k[7] + 1352829926, 9) + iM2083a34;
        int iM2083a38 = m2083a(iM2083a33, 10);
        int iM2083a39 = m2083a(iM2083a34 + (((iM2083a38 ^ (-1)) | iM2083a35) ^ iM2083a37) + this.f3545k[0] + 1352829926, 11) + iM2083a36;
        int iM2083a40 = m2083a(iM2083a35, 10);
        int iM2083a41 = m2083a(iM2083a36 + (((iM2083a40 ^ (-1)) | iM2083a37) ^ iM2083a39) + this.f3545k[9] + 1352829926, 13) + iM2083a38;
        int iM2083a42 = m2083a(iM2083a37, 10);
        int iM2083a43 = m2083a(iM2083a38 + (((iM2083a42 ^ (-1)) | iM2083a39) ^ iM2083a41) + this.f3545k[2] + 1352829926, 15) + iM2083a40;
        int iM2083a44 = m2083a(iM2083a39, 10);
        int iM2083a45 = m2083a(iM2083a40 + (((iM2083a44 ^ (-1)) | iM2083a41) ^ iM2083a43) + this.f3545k[11] + 1352829926, 15) + iM2083a42;
        int iM2083a46 = m2083a(iM2083a41, 10);
        int iM2083a47 = m2083a(iM2083a42 + (((iM2083a46 ^ (-1)) | iM2083a43) ^ iM2083a45) + this.f3545k[4] + 1352829926, 5) + iM2083a44;
        int iM2083a48 = m2083a(iM2083a43, 10);
        int iM2083a49 = m2083a(iM2083a44 + (((iM2083a48 ^ (-1)) | iM2083a45) ^ iM2083a47) + this.f3545k[13] + 1352829926, 7) + iM2083a46;
        int iM2083a50 = m2083a(iM2083a45, 10);
        int iM2083a51 = m2083a(iM2083a46 + (((iM2083a50 ^ (-1)) | iM2083a47) ^ iM2083a49) + this.f3545k[6] + 1352829926, 7) + iM2083a48;
        int iM2083a52 = m2083a(iM2083a47, 10);
        int iM2083a53 = m2083a(iM2083a48 + (((iM2083a52 ^ (-1)) | iM2083a49) ^ iM2083a51) + this.f3545k[15] + 1352829926, 8) + iM2083a50;
        int iM2083a54 = m2083a(iM2083a49, 10);
        int iM2083a55 = m2083a(iM2083a50 + (((iM2083a54 ^ (-1)) | iM2083a51) ^ iM2083a53) + this.f3545k[8] + 1352829926, 11) + iM2083a52;
        int iM2083a56 = m2083a(iM2083a51, 10);
        int iM2083a57 = m2083a(iM2083a52 + (((iM2083a56 ^ (-1)) | iM2083a53) ^ iM2083a55) + this.f3545k[1] + 1352829926, 14) + iM2083a54;
        int iM2083a58 = m2083a(iM2083a53, 10);
        int iM2083a59 = m2083a(iM2083a54 + (((iM2083a58 ^ (-1)) | iM2083a55) ^ iM2083a57) + this.f3545k[10] + 1352829926, 14) + iM2083a56;
        int iM2083a60 = m2083a(iM2083a55, 10);
        int iM2083a61 = m2083a(iM2083a56 + (((iM2083a60 ^ (-1)) | iM2083a57) ^ iM2083a59) + this.f3545k[3] + 1352829926, 12) + iM2083a58;
        int iM2083a62 = m2083a(iM2083a57, 10);
        int iM2083a63 = m2083a(iM2083a58 + (((iM2083a62 ^ (-1)) | iM2083a59) ^ iM2083a61) + this.f3545k[12] + 1352829926, 6) + iM2083a60;
        int iM2083a64 = m2083a(iM2083a59, 10);
        int iM2083a65 = m2083a(iM2083a28 + m2084a(iM2083a63, iM2083a29, iM2083a32) + this.f3545k[7] + 1518500249, 7) + iM2083a30;
        int iM2083a66 = m2083a(iM2083a29, 10);
        int iM2083a67 = m2083a(iM2083a30 + m2084a(iM2083a65, iM2083a63, iM2083a66) + this.f3545k[4] + 1518500249, 6) + iM2083a32;
        int iM2083a68 = m2083a(iM2083a63, 10);
        int iM2083a69 = m2083a(iM2083a32 + m2084a(iM2083a67, iM2083a65, iM2083a68) + this.f3545k[13] + 1518500249, 8) + iM2083a66;
        int iM2083a70 = m2083a(iM2083a65, 10);
        int iM2083a71 = m2083a(iM2083a66 + m2084a(iM2083a69, iM2083a67, iM2083a70) + this.f3545k[1] + 1518500249, 13) + iM2083a68;
        int iM2083a72 = m2083a(iM2083a67, 10);
        int iM2083a73 = m2083a(iM2083a68 + m2084a(iM2083a71, iM2083a69, iM2083a72) + this.f3545k[10] + 1518500249, 11) + iM2083a70;
        int iM2083a74 = m2083a(iM2083a69, 10);
        int iM2083a75 = m2083a(iM2083a70 + m2084a(iM2083a73, iM2083a71, iM2083a74) + this.f3545k[6] + 1518500249, 9) + iM2083a72;
        int iM2083a76 = m2083a(iM2083a71, 10);
        int iM2083a77 = m2083a(iM2083a72 + m2084a(iM2083a75, iM2083a73, iM2083a76) + this.f3545k[15] + 1518500249, 7) + iM2083a74;
        int iM2083a78 = m2083a(iM2083a73, 10);
        int iM2083a79 = m2083a(iM2083a74 + m2084a(iM2083a77, iM2083a75, iM2083a78) + this.f3545k[3] + 1518500249, 15) + iM2083a76;
        int iM2083a80 = m2083a(iM2083a75, 10);
        int iM2083a81 = m2083a(iM2083a76 + m2084a(iM2083a79, iM2083a77, iM2083a80) + this.f3545k[12] + 1518500249, 7) + iM2083a78;
        int iM2083a82 = m2083a(iM2083a77, 10);
        int iM2083a83 = m2083a(iM2083a78 + m2084a(iM2083a81, iM2083a79, iM2083a82) + this.f3545k[0] + 1518500249, 12) + iM2083a80;
        int iM2083a84 = m2083a(iM2083a79, 10);
        int iM2083a85 = m2083a(iM2083a80 + m2084a(iM2083a83, iM2083a81, iM2083a84) + this.f3545k[9] + 1518500249, 15) + iM2083a82;
        int iM2083a86 = m2083a(iM2083a81, 10);
        int iM2083a87 = m2083a(iM2083a82 + m2084a(iM2083a85, iM2083a83, iM2083a86) + this.f3545k[5] + 1518500249, 9) + iM2083a84;
        int iM2083a88 = m2083a(iM2083a83, 10);
        int iM2083a89 = m2083a(iM2083a84 + m2084a(iM2083a87, iM2083a85, iM2083a88) + this.f3545k[2] + 1518500249, 11) + iM2083a86;
        int iM2083a90 = m2083a(iM2083a85, 10);
        int iM2083a91 = m2083a(iM2083a86 + m2084a(iM2083a89, iM2083a87, iM2083a90) + this.f3545k[14] + 1518500249, 7) + iM2083a88;
        int iM2083a92 = m2083a(iM2083a87, 10);
        int iM2083a93 = m2083a(iM2083a88 + m2084a(iM2083a91, iM2083a89, iM2083a92) + this.f3545k[11] + 1518500249, 13) + iM2083a90;
        int iM2083a94 = m2083a(iM2083a89, 10);
        int iM2083a95 = m2083a(iM2083a90 + m2084a(iM2083a93, iM2083a91, iM2083a94) + this.f3545k[8] + 1518500249, 12) + iM2083a92;
        int iM2083a96 = m2083a(iM2083a91, 10);
        int iM2083a97 = m2083a(iM2083a60 + m2087b(iM2083a31, iM2083a61, iM2083a64) + this.f3545k[6] + 1548603684, 9) + iM2083a62;
        int iM2083a98 = m2083a(iM2083a61, 10);
        int iM2083a99 = m2083a(iM2083a62 + m2087b(iM2083a97, iM2083a31, iM2083a98) + this.f3545k[11] + 1548603684, 13) + iM2083a64;
        int iM2083a100 = m2083a(iM2083a31, 10);
        int iM2083a101 = m2083a(iM2083a64 + m2087b(iM2083a99, iM2083a97, iM2083a100) + this.f3545k[3] + 1548603684, 15) + iM2083a98;
        int iM2083a102 = m2083a(iM2083a97, 10);
        int iM2083a103 = m2083a(iM2083a98 + m2087b(iM2083a101, iM2083a99, iM2083a102) + this.f3545k[7] + 1548603684, 7) + iM2083a100;
        int iM2083a104 = m2083a(iM2083a99, 10);
        int iM2083a105 = m2083a(iM2083a100 + m2087b(iM2083a103, iM2083a101, iM2083a104) + this.f3545k[0] + 1548603684, 12) + iM2083a102;
        int iM2083a106 = m2083a(iM2083a101, 10);
        int iM2083a107 = m2083a(iM2083a102 + m2087b(iM2083a105, iM2083a103, iM2083a106) + this.f3545k[13] + 1548603684, 8) + iM2083a104;
        int iM2083a108 = m2083a(iM2083a103, 10);
        int iM2083a109 = m2083a(iM2083a104 + m2087b(iM2083a107, iM2083a105, iM2083a108) + this.f3545k[5] + 1548603684, 9) + iM2083a106;
        int iM2083a110 = m2083a(iM2083a105, 10);
        int iM2083a111 = m2083a(iM2083a106 + m2087b(iM2083a109, iM2083a107, iM2083a110) + this.f3545k[10] + 1548603684, 11) + iM2083a108;
        int iM2083a112 = m2083a(iM2083a107, 10);
        int iM2083a113 = m2083a(iM2083a108 + m2087b(iM2083a111, iM2083a109, iM2083a112) + this.f3545k[14] + 1548603684, 7) + iM2083a110;
        int iM2083a114 = m2083a(iM2083a109, 10);
        int iM2083a115 = m2083a(iM2083a110 + m2087b(iM2083a113, iM2083a111, iM2083a114) + this.f3545k[15] + 1548603684, 7) + iM2083a112;
        int iM2083a116 = m2083a(iM2083a111, 10);
        int iM2083a117 = m2083a(iM2083a112 + m2087b(iM2083a115, iM2083a113, iM2083a116) + this.f3545k[8] + 1548603684, 12) + iM2083a114;
        int iM2083a118 = m2083a(iM2083a113, 10);
        int iM2083a119 = m2083a(iM2083a114 + m2087b(iM2083a117, iM2083a115, iM2083a118) + this.f3545k[12] + 1548603684, 7) + iM2083a116;
        int iM2083a120 = m2083a(iM2083a115, 10);
        int iM2083a121 = m2083a(iM2083a116 + m2087b(iM2083a119, iM2083a117, iM2083a120) + this.f3545k[4] + 1548603684, 6) + iM2083a118;
        int iM2083a122 = m2083a(iM2083a117, 10);
        int iM2083a123 = m2083a(iM2083a118 + m2087b(iM2083a121, iM2083a119, iM2083a122) + this.f3545k[9] + 1548603684, 15) + iM2083a120;
        int iM2083a124 = m2083a(iM2083a119, 10);
        int iM2083a125 = m2083a(iM2083a120 + m2087b(iM2083a123, iM2083a121, iM2083a124) + this.f3545k[1] + 1548603684, 13) + iM2083a122;
        int iM2083a126 = m2083a(iM2083a121, 10);
        int iM2083a127 = m2083a(iM2083a122 + m2087b(iM2083a125, iM2083a123, iM2083a126) + this.f3545k[2] + 1548603684, 11) + iM2083a124;
        int iM2083a128 = m2083a(iM2083a123, 10);
        int iM2083a129 = m2083a(iM2083a92 + (((iM2083a93 ^ (-1)) | iM2083a95) ^ iM2083a128) + this.f3545k[3] + 1859775393, 11) + iM2083a94;
        int iM2083a130 = m2083a(iM2083a93, 10);
        int iM2083a131 = m2083a(iM2083a94 + (((iM2083a95 ^ (-1)) | iM2083a129) ^ iM2083a130) + this.f3545k[10] + 1859775393, 13) + iM2083a128;
        int iM2083a132 = m2083a(iM2083a95, 10);
        int iM2083a133 = m2083a(iM2083a128 + (((iM2083a129 ^ (-1)) | iM2083a131) ^ iM2083a132) + this.f3545k[14] + 1859775393, 6) + iM2083a130;
        int iM2083a134 = m2083a(iM2083a129, 10);
        int iM2083a135 = m2083a(iM2083a130 + (((iM2083a131 ^ (-1)) | iM2083a133) ^ iM2083a134) + this.f3545k[4] + 1859775393, 7) + iM2083a132;
        int iM2083a136 = m2083a(iM2083a131, 10);
        int iM2083a137 = m2083a(iM2083a132 + (((iM2083a133 ^ (-1)) | iM2083a135) ^ iM2083a136) + this.f3545k[9] + 1859775393, 14) + iM2083a134;
        int iM2083a138 = m2083a(iM2083a133, 10);
        int iM2083a139 = m2083a(iM2083a134 + (((iM2083a135 ^ (-1)) | iM2083a137) ^ iM2083a138) + this.f3545k[15] + 1859775393, 9) + iM2083a136;
        int iM2083a140 = m2083a(iM2083a135, 10);
        int iM2083a141 = m2083a(iM2083a136 + (((iM2083a137 ^ (-1)) | iM2083a139) ^ iM2083a140) + this.f3545k[8] + 1859775393, 13) + iM2083a138;
        int iM2083a142 = m2083a(iM2083a137, 10);
        int iM2083a143 = m2083a(iM2083a138 + (((iM2083a139 ^ (-1)) | iM2083a141) ^ iM2083a142) + this.f3545k[1] + 1859775393, 15) + iM2083a140;
        int iM2083a144 = m2083a(iM2083a139, 10);
        int iM2083a145 = m2083a(iM2083a140 + (((iM2083a141 ^ (-1)) | iM2083a143) ^ iM2083a144) + this.f3545k[2] + 1859775393, 14) + iM2083a142;
        int iM2083a146 = m2083a(iM2083a141, 10);
        int iM2083a147 = m2083a(iM2083a142 + (((iM2083a143 ^ (-1)) | iM2083a145) ^ iM2083a146) + this.f3545k[7] + 1859775393, 8) + iM2083a144;
        int iM2083a148 = m2083a(iM2083a143, 10);
        int iM2083a149 = m2083a(iM2083a144 + (((iM2083a145 ^ (-1)) | iM2083a147) ^ iM2083a148) + this.f3545k[0] + 1859775393, 13) + iM2083a146;
        int iM2083a150 = m2083a(iM2083a145, 10);
        int iM2083a151 = m2083a(iM2083a146 + (((iM2083a147 ^ (-1)) | iM2083a149) ^ iM2083a150) + this.f3545k[6] + 1859775393, 6) + iM2083a148;
        int iM2083a152 = m2083a(iM2083a147, 10);
        int iM2083a153 = m2083a(iM2083a148 + (((iM2083a149 ^ (-1)) | iM2083a151) ^ iM2083a152) + this.f3545k[13] + 1859775393, 5) + iM2083a150;
        int iM2083a154 = m2083a(iM2083a149, 10);
        int iM2083a155 = m2083a(iM2083a150 + (((iM2083a151 ^ (-1)) | iM2083a153) ^ iM2083a154) + this.f3545k[11] + 1859775393, 12) + iM2083a152;
        int iM2083a156 = m2083a(iM2083a151, 10);
        int iM2083a157 = m2083a(iM2083a152 + (((iM2083a153 ^ (-1)) | iM2083a155) ^ iM2083a156) + this.f3545k[5] + 1859775393, 7) + iM2083a154;
        int iM2083a158 = m2083a(iM2083a153, 10);
        int iM2083a159 = m2083a(iM2083a154 + (((iM2083a155 ^ (-1)) | iM2083a157) ^ iM2083a158) + this.f3545k[12] + 1859775393, 5) + iM2083a156;
        int iM2083a160 = m2083a(iM2083a155, 10);
        int iM2083a161 = m2083a(iM2083a124 + (((iM2083a125 ^ (-1)) | iM2083a127) ^ iM2083a96) + this.f3545k[15] + 1836072691, 9) + iM2083a126;
        int iM2083a162 = m2083a(iM2083a125, 10);
        int iM2083a163 = m2083a(iM2083a126 + (((iM2083a127 ^ (-1)) | iM2083a161) ^ iM2083a162) + this.f3545k[5] + 1836072691, 7) + iM2083a96;
        int iM2083a164 = m2083a(iM2083a127, 10);
        int iM2083a165 = m2083a(iM2083a96 + (((iM2083a161 ^ (-1)) | iM2083a163) ^ iM2083a164) + this.f3545k[1] + 1836072691, 15) + iM2083a162;
        int iM2083a166 = m2083a(iM2083a161, 10);
        int iM2083a167 = m2083a(iM2083a162 + (((iM2083a163 ^ (-1)) | iM2083a165) ^ iM2083a166) + this.f3545k[3] + 1836072691, 11) + iM2083a164;
        int iM2083a168 = m2083a(iM2083a163, 10);
        int iM2083a169 = m2083a(iM2083a164 + (((iM2083a165 ^ (-1)) | iM2083a167) ^ iM2083a168) + this.f3545k[7] + 1836072691, 8) + iM2083a166;
        int iM2083a170 = m2083a(iM2083a165, 10);
        int iM2083a171 = m2083a(iM2083a166 + (((iM2083a167 ^ (-1)) | iM2083a169) ^ iM2083a170) + this.f3545k[14] + 1836072691, 6) + iM2083a168;
        int iM2083a172 = m2083a(iM2083a167, 10);
        int iM2083a173 = m2083a(iM2083a168 + (((iM2083a169 ^ (-1)) | iM2083a171) ^ iM2083a172) + this.f3545k[6] + 1836072691, 6) + iM2083a170;
        int iM2083a174 = m2083a(iM2083a169, 10);
        int iM2083a175 = m2083a(iM2083a170 + (((iM2083a171 ^ (-1)) | iM2083a173) ^ iM2083a174) + this.f3545k[9] + 1836072691, 14) + iM2083a172;
        int iM2083a176 = m2083a(iM2083a171, 10);
        int iM2083a177 = m2083a(iM2083a172 + (((iM2083a173 ^ (-1)) | iM2083a175) ^ iM2083a176) + this.f3545k[11] + 1836072691, 12) + iM2083a174;
        int iM2083a178 = m2083a(iM2083a173, 10);
        int iM2083a179 = m2083a(iM2083a174 + (((iM2083a175 ^ (-1)) | iM2083a177) ^ iM2083a178) + this.f3545k[8] + 1836072691, 13) + iM2083a176;
        int iM2083a180 = m2083a(iM2083a175, 10);
        int iM2083a181 = m2083a(iM2083a176 + (((iM2083a177 ^ (-1)) | iM2083a179) ^ iM2083a180) + this.f3545k[12] + 1836072691, 5) + iM2083a178;
        int iM2083a182 = m2083a(iM2083a177, 10);
        int iM2083a183 = m2083a(iM2083a178 + (((iM2083a179 ^ (-1)) | iM2083a181) ^ iM2083a182) + this.f3545k[2] + 1836072691, 14) + iM2083a180;
        int iM2083a184 = m2083a(iM2083a179, 10);
        int iM2083a185 = m2083a(iM2083a180 + (((iM2083a181 ^ (-1)) | iM2083a183) ^ iM2083a184) + this.f3545k[10] + 1836072691, 13) + iM2083a182;
        int iM2083a186 = m2083a(iM2083a181, 10);
        int iM2083a187 = m2083a(iM2083a182 + (((iM2083a183 ^ (-1)) | iM2083a185) ^ iM2083a186) + this.f3545k[0] + 1836072691, 13) + iM2083a184;
        int iM2083a188 = m2083a(iM2083a183, 10);
        int iM2083a189 = m2083a(iM2083a184 + (((iM2083a185 ^ (-1)) | iM2083a187) ^ iM2083a188) + this.f3545k[4] + 1836072691, 7) + iM2083a186;
        int iM2083a190 = m2083a(iM2083a185, 10);
        int iM2083a191 = m2083a(iM2083a186 + (((iM2083a187 ^ (-1)) | iM2083a189) ^ iM2083a190) + this.f3545k[13] + 1836072691, 5) + iM2083a188;
        int iM2083a192 = m2083a(iM2083a187, 10);
        int iM2083a193 = m2083a(((iM2083a188 + m2087b(iM2083a159, iM2083a157, iM2083a160)) + this.f3545k[1]) - 1894007588, 11) + iM2083a158;
        int iM2083a194 = m2083a(iM2083a157, 10);
        int iM2083a195 = m2083a(((iM2083a158 + m2087b(iM2083a193, iM2083a159, iM2083a194)) + this.f3545k[9]) - 1894007588, 12) + iM2083a160;
        int iM2083a196 = m2083a(iM2083a159, 10);
        int iM2083a197 = m2083a(((iM2083a160 + m2087b(iM2083a195, iM2083a193, iM2083a196)) + this.f3545k[11]) - 1894007588, 14) + iM2083a194;
        int iM2083a198 = m2083a(iM2083a193, 10);
        int iM2083a199 = m2083a(((iM2083a194 + m2087b(iM2083a197, iM2083a195, iM2083a198)) + this.f3545k[10]) - 1894007588, 15) + iM2083a196;
        int iM2083a200 = m2083a(iM2083a195, 10);
        int iM2083a201 = m2083a(((iM2083a196 + m2087b(iM2083a199, iM2083a197, iM2083a200)) + this.f3545k[0]) - 1894007588, 14) + iM2083a198;
        int iM2083a202 = m2083a(iM2083a197, 10);
        int iM2083a203 = m2083a(((iM2083a198 + m2087b(iM2083a201, iM2083a199, iM2083a202)) + this.f3545k[8]) - 1894007588, 15) + iM2083a200;
        int iM2083a204 = m2083a(iM2083a199, 10);
        int iM2083a205 = m2083a(((iM2083a200 + m2087b(iM2083a203, iM2083a201, iM2083a204)) + this.f3545k[12]) - 1894007588, 9) + iM2083a202;
        int iM2083a206 = m2083a(iM2083a201, 10);
        int iM2083a207 = m2083a(((iM2083a202 + m2087b(iM2083a205, iM2083a203, iM2083a206)) + this.f3545k[4]) - 1894007588, 8) + iM2083a204;
        int iM2083a208 = m2083a(iM2083a203, 10);
        int iM2083a209 = m2083a(((iM2083a204 + m2087b(iM2083a207, iM2083a205, iM2083a208)) + this.f3545k[13]) - 1894007588, 9) + iM2083a206;
        int iM2083a210 = m2083a(iM2083a205, 10);
        int iM2083a211 = m2083a(((iM2083a206 + m2087b(iM2083a209, iM2083a207, iM2083a210)) + this.f3545k[3]) - 1894007588, 14) + iM2083a208;
        int iM2083a212 = m2083a(iM2083a207, 10);
        int iM2083a213 = m2083a(((iM2083a208 + m2087b(iM2083a211, iM2083a209, iM2083a212)) + this.f3545k[7]) - 1894007588, 5) + iM2083a210;
        int iM2083a214 = m2083a(iM2083a209, 10);
        int iM2083a215 = m2083a(((iM2083a210 + m2087b(iM2083a213, iM2083a211, iM2083a214)) + this.f3545k[15]) - 1894007588, 6) + iM2083a212;
        int iM2083a216 = m2083a(iM2083a211, 10);
        int iM2083a217 = m2083a(((iM2083a212 + m2087b(iM2083a215, iM2083a213, iM2083a216)) + this.f3545k[14]) - 1894007588, 8) + iM2083a214;
        int iM2083a218 = m2083a(iM2083a213, 10);
        int iM2083a219 = m2083a(((iM2083a214 + m2087b(iM2083a217, iM2083a215, iM2083a218)) + this.f3545k[5]) - 1894007588, 6) + iM2083a216;
        int iM2083a220 = m2083a(iM2083a215, 10);
        int iM2083a221 = m2083a(((iM2083a216 + m2087b(iM2083a219, iM2083a217, iM2083a220)) + this.f3545k[6]) - 1894007588, 5) + iM2083a218;
        int iM2083a222 = m2083a(iM2083a217, 10);
        int iM2083a223 = m2083a(((iM2083a218 + m2087b(iM2083a221, iM2083a219, iM2083a222)) + this.f3545k[2]) - 1894007588, 12) + iM2083a220;
        int iM2083a224 = m2083a(iM2083a219, 10);
        int iM2083a225 = m2083a(iM2083a156 + m2084a(iM2083a191, iM2083a189, iM2083a192) + this.f3545k[8] + 2053994217, 15) + iM2083a190;
        int iM2083a226 = m2083a(iM2083a189, 10);
        int iM2083a227 = m2083a(iM2083a190 + m2084a(iM2083a225, iM2083a191, iM2083a226) + this.f3545k[6] + 2053994217, 5) + iM2083a192;
        int iM2083a228 = m2083a(iM2083a191, 10);
        int iM2083a229 = m2083a(iM2083a192 + m2084a(iM2083a227, iM2083a225, iM2083a228) + this.f3545k[4] + 2053994217, 8) + iM2083a226;
        int iM2083a230 = m2083a(iM2083a225, 10);
        int iM2083a231 = m2083a(iM2083a226 + m2084a(iM2083a229, iM2083a227, iM2083a230) + this.f3545k[1] + 2053994217, 11) + iM2083a228;
        int iM2083a232 = m2083a(iM2083a227, 10);
        int iM2083a233 = m2083a(iM2083a228 + m2084a(iM2083a231, iM2083a229, iM2083a232) + this.f3545k[3] + 2053994217, 14) + iM2083a230;
        int iM2083a234 = m2083a(iM2083a229, 10);
        int iM2083a235 = m2083a(iM2083a230 + m2084a(iM2083a233, iM2083a231, iM2083a234) + this.f3545k[11] + 2053994217, 14) + iM2083a232;
        int iM2083a236 = m2083a(iM2083a231, 10);
        int iM2083a237 = m2083a(iM2083a232 + m2084a(iM2083a235, iM2083a233, iM2083a236) + this.f3545k[15] + 2053994217, 6) + iM2083a234;
        int iM2083a238 = m2083a(iM2083a233, 10);
        int iM2083a239 = m2083a(iM2083a234 + m2084a(iM2083a237, iM2083a235, iM2083a238) + this.f3545k[0] + 2053994217, 14) + iM2083a236;
        int iM2083a240 = m2083a(iM2083a235, 10);
        int iM2083a241 = m2083a(iM2083a236 + m2084a(iM2083a239, iM2083a237, iM2083a240) + this.f3545k[5] + 2053994217, 6) + iM2083a238;
        int iM2083a242 = m2083a(iM2083a237, 10);
        int iM2083a243 = m2083a(iM2083a238 + m2084a(iM2083a241, iM2083a239, iM2083a242) + this.f3545k[12] + 2053994217, 9) + iM2083a240;
        int iM2083a244 = m2083a(iM2083a239, 10);
        int iM2083a245 = m2083a(iM2083a240 + m2084a(iM2083a243, iM2083a241, iM2083a244) + this.f3545k[2] + 2053994217, 12) + iM2083a242;
        int iM2083a246 = m2083a(iM2083a241, 10);
        int iM2083a247 = m2083a(iM2083a242 + m2084a(iM2083a245, iM2083a243, iM2083a246) + this.f3545k[13] + 2053994217, 9) + iM2083a244;
        int iM2083a248 = m2083a(iM2083a243, 10);
        int iM2083a249 = m2083a(iM2083a244 + m2084a(iM2083a247, iM2083a245, iM2083a248) + this.f3545k[9] + 2053994217, 12) + iM2083a246;
        int iM2083a250 = m2083a(iM2083a245, 10);
        int iM2083a251 = m2083a(iM2083a246 + m2084a(iM2083a249, iM2083a247, iM2083a250) + this.f3545k[7] + 2053994217, 5) + iM2083a248;
        int iM2083a252 = m2083a(iM2083a247, 10);
        int iM2083a253 = m2083a(iM2083a248 + m2084a(iM2083a251, iM2083a249, iM2083a252) + this.f3545k[10] + 2053994217, 15) + iM2083a250;
        int iM2083a254 = m2083a(iM2083a249, 10);
        int iM2083a255 = m2083a(iM2083a250 + m2084a(iM2083a253, iM2083a251, iM2083a254) + this.f3545k[14] + 2053994217, 8) + iM2083a252;
        int iM2083a256 = m2083a(iM2083a251, 10);
        int iM2083a257 = m2083a(((iM2083a220 + (((iM2083a224 ^ (-1)) | iM2083a253) ^ iM2083a223)) + this.f3545k[4]) - 1454113458, 9) + iM2083a222;
        int iM2083a258 = m2083a(iM2083a253, 10);
        int iM2083a259 = m2083a(((iM2083a222 + (((iM2083a258 ^ (-1)) | iM2083a223) ^ iM2083a257)) + this.f3545k[0]) - 1454113458, 15) + iM2083a224;
        int iM2083a260 = m2083a(iM2083a223, 10);
        int iM2083a261 = m2083a(((iM2083a224 + (((iM2083a260 ^ (-1)) | iM2083a257) ^ iM2083a259)) + this.f3545k[5]) - 1454113458, 5) + iM2083a258;
        int iM2083a262 = m2083a(iM2083a257, 10);
        int iM2083a263 = m2083a(((iM2083a258 + (((iM2083a262 ^ (-1)) | iM2083a259) ^ iM2083a261)) + this.f3545k[9]) - 1454113458, 11) + iM2083a260;
        int iM2083a264 = m2083a(iM2083a259, 10);
        int iM2083a265 = m2083a(((iM2083a260 + (((iM2083a264 ^ (-1)) | iM2083a261) ^ iM2083a263)) + this.f3545k[7]) - 1454113458, 6) + iM2083a262;
        int iM2083a266 = m2083a(iM2083a261, 10);
        int iM2083a267 = m2083a(((iM2083a262 + (((iM2083a266 ^ (-1)) | iM2083a263) ^ iM2083a265)) + this.f3545k[12]) - 1454113458, 8) + iM2083a264;
        int iM2083a268 = m2083a(iM2083a263, 10);
        int iM2083a269 = m2083a(((iM2083a264 + (((iM2083a268 ^ (-1)) | iM2083a265) ^ iM2083a267)) + this.f3545k[2]) - 1454113458, 13) + iM2083a266;
        int iM2083a270 = m2083a(iM2083a265, 10);
        int iM2083a271 = m2083a(((iM2083a266 + (((iM2083a270 ^ (-1)) | iM2083a267) ^ iM2083a269)) + this.f3545k[10]) - 1454113458, 12) + iM2083a268;
        int iM2083a272 = m2083a(iM2083a267, 10);
        int iM2083a273 = m2083a(((iM2083a268 + (((iM2083a272 ^ (-1)) | iM2083a269) ^ iM2083a271)) + this.f3545k[14]) - 1454113458, 5) + iM2083a270;
        int iM2083a274 = m2083a(iM2083a269, 10);
        int iM2083a275 = m2083a(((iM2083a270 + (((iM2083a274 ^ (-1)) | iM2083a271) ^ iM2083a273)) + this.f3545k[1]) - 1454113458, 12) + iM2083a272;
        int iM2083a276 = m2083a(iM2083a271, 10);
        int iM2083a277 = m2083a(((iM2083a272 + (((iM2083a276 ^ (-1)) | iM2083a273) ^ iM2083a275)) + this.f3545k[3]) - 1454113458, 13) + iM2083a274;
        int iM2083a278 = m2083a(iM2083a273, 10);
        int iM2083a279 = m2083a(((iM2083a274 + (((iM2083a278 ^ (-1)) | iM2083a275) ^ iM2083a277)) + this.f3545k[8]) - 1454113458, 14) + iM2083a276;
        int iM2083a280 = m2083a(iM2083a275, 10);
        int iM2083a281 = m2083a(((iM2083a276 + (((iM2083a280 ^ (-1)) | iM2083a277) ^ iM2083a279)) + this.f3545k[11]) - 1454113458, 11) + iM2083a278;
        int iM2083a282 = m2083a(iM2083a277, 10);
        int iM2083a283 = m2083a(((iM2083a278 + (((iM2083a282 ^ (-1)) | iM2083a279) ^ iM2083a281)) + this.f3545k[6]) - 1454113458, 8) + iM2083a280;
        int iM2083a284 = m2083a(iM2083a279, 10);
        int iM2083a285 = m2083a(((iM2083a280 + (((iM2083a284 ^ (-1)) | iM2083a281) ^ iM2083a283)) + this.f3545k[15]) - 1454113458, 5) + iM2083a282;
        int iM2083a286 = m2083a(iM2083a281, 10);
        int iM2083a287 = m2083a(((iM2083a282 + (((iM2083a286 ^ (-1)) | iM2083a283) ^ iM2083a285)) + this.f3545k[13]) - 1454113458, 6) + iM2083a284;
        int iM2083a288 = m2083a(iM2083a283, 10);
        int iM2083a289 = m2083a(iM2083a252 + ((iM2083a255 ^ iM2083a221) ^ iM2083a256) + this.f3545k[12], 8) + iM2083a254;
        int iM2083a290 = m2083a(iM2083a221, 10);
        int iM2083a291 = m2083a(iM2083a254 + ((iM2083a289 ^ iM2083a255) ^ iM2083a290) + this.f3545k[15], 5) + iM2083a256;
        int iM2083a292 = m2083a(iM2083a255, 10);
        int iM2083a293 = m2083a(iM2083a256 + ((iM2083a291 ^ iM2083a289) ^ iM2083a292) + this.f3545k[10], 12) + iM2083a290;
        int iM2083a294 = m2083a(iM2083a289, 10);
        int iM2083a295 = m2083a(iM2083a290 + ((iM2083a293 ^ iM2083a291) ^ iM2083a294) + this.f3545k[4], 9) + iM2083a292;
        int iM2083a296 = m2083a(iM2083a291, 10);
        int iM2083a297 = m2083a(iM2083a292 + ((iM2083a295 ^ iM2083a293) ^ iM2083a296) + this.f3545k[1], 12) + iM2083a294;
        int iM2083a298 = m2083a(iM2083a293, 10);
        int iM2083a299 = m2083a(iM2083a294 + ((iM2083a297 ^ iM2083a295) ^ iM2083a298) + this.f3545k[5], 5) + iM2083a296;
        int iM2083a300 = m2083a(iM2083a295, 10);
        int iM2083a301 = m2083a(iM2083a296 + ((iM2083a299 ^ iM2083a297) ^ iM2083a300) + this.f3545k[8], 14) + iM2083a298;
        int iM2083a302 = m2083a(iM2083a297, 10);
        int iM2083a303 = m2083a(iM2083a298 + ((iM2083a301 ^ iM2083a299) ^ iM2083a302) + this.f3545k[7], 6) + iM2083a300;
        int iM2083a304 = m2083a(iM2083a299, 10);
        int iM2083a305 = m2083a(iM2083a300 + ((iM2083a303 ^ iM2083a301) ^ iM2083a304) + this.f3545k[6], 8) + iM2083a302;
        int iM2083a306 = m2083a(iM2083a301, 10);
        int iM2083a307 = m2083a(iM2083a302 + ((iM2083a305 ^ iM2083a303) ^ iM2083a306) + this.f3545k[2], 13) + iM2083a304;
        int iM2083a308 = m2083a(iM2083a303, 10);
        int iM2083a309 = m2083a(iM2083a304 + ((iM2083a307 ^ iM2083a305) ^ iM2083a308) + this.f3545k[13], 6) + iM2083a306;
        int iM2083a310 = m2083a(iM2083a305, 10);
        int iM2083a311 = m2083a(iM2083a306 + ((iM2083a309 ^ iM2083a307) ^ iM2083a310) + this.f3545k[14], 5) + iM2083a308;
        int iM2083a312 = m2083a(iM2083a307, 10);
        int iM2083a313 = m2083a(iM2083a308 + ((iM2083a311 ^ iM2083a309) ^ iM2083a312) + this.f3545k[0], 15) + iM2083a310;
        int iM2083a314 = m2083a(iM2083a309, 10);
        int iM2083a315 = m2083a(iM2083a310 + ((iM2083a313 ^ iM2083a311) ^ iM2083a314) + this.f3545k[3], 13) + iM2083a312;
        int iM2083a316 = m2083a(iM2083a311, 10);
        int iM2083a317 = m2083a(iM2083a312 + ((iM2083a315 ^ iM2083a313) ^ iM2083a316) + this.f3545k[9], 11) + iM2083a314;
        int iM2083a318 = m2083a(iM2083a313, 10);
        int iM2083a319 = m2083a(iM2083a314 + ((iM2083a317 ^ iM2083a315) ^ iM2083a318) + this.f3545k[11], 11) + iM2083a316;
        int iM2083a320 = m2083a(iM2083a315, 10);
        this.f3535a = iM2083a284 + this.f3535a;
        this.f3536b += iM2083a287;
        this.f3537c += iM2083a285;
        this.f3538d += iM2083a288;
        this.f3539e += iM2083a318;
        this.f3540f = iM2083a316 + this.f3540f;
        this.f3541g += iM2083a319;
        this.f3542h += iM2083a317;
        this.f3543i += iM2083a320;
        this.f3544j += iM2083a286;
        this.f3546l = 0;
        for (int i11 = 0; i11 != this.f3545k.length; i11++) {
            this.f3545k[i11] = 0;
        }
    }
}
