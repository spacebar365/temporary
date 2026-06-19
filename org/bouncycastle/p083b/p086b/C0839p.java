package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0839p extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3518a;

    /* JADX INFO: renamed from: b */
    private int f3519b;

    /* JADX INFO: renamed from: c */
    private int f3520c;

    /* JADX INFO: renamed from: d */
    private int f3521d;

    /* JADX INFO: renamed from: e */
    private int f3522e;

    /* JADX INFO: renamed from: f */
    private int[] f3523f;

    /* JADX INFO: renamed from: g */
    private int f3524g;

    public C0839p() {
        this.f3523f = new int[16];
        mo1931c();
    }

    public C0839p(C0839p c0839p) {
        super(c0839p);
        this.f3523f = new int[16];
        m2068a(c0839p);
    }

    /* JADX INFO: renamed from: a */
    private static int m2065a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2066a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2067a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2068a(C0839p c0839p) {
        super.m2016a((AbstractC0831h) c0839p);
        this.f3518a = c0839p.f3518a;
        this.f3519b = c0839p.f3519b;
        this.f3520c = c0839p.f3520c;
        this.f3521d = c0839p.f3521d;
        this.f3522e = c0839p.f3522e;
        System.arraycopy(c0839p.f3523f, 0, this.f3523f, 0, c0839p.f3523f.length);
        this.f3524g = c0839p.f3524g;
    }

    /* JADX INFO: renamed from: b */
    private static int m2069b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        m2067a(this.f3518a, bArr, i);
        m2067a(this.f3519b, bArr, i + 4);
        m2067a(this.f3520c, bArr, i + 8);
        m2067a(this.f3521d, bArr, i + 12);
        m2067a(this.f3522e, bArr, i + 16);
        mo1931c();
        return 20;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "RIPEMD160";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3524g > 14) {
            mo1942g();
        }
        this.f3523f[14] = (int) ((-1) & j);
        this.f3523f[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2068a((C0839p) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 20;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int[] iArr = this.f3523f;
        int i2 = this.f3524g;
        this.f3524g = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f3524g == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3518a = 1732584193;
        this.f3519b = -271733879;
        this.f3520c = -1732584194;
        this.f3521d = 271733878;
        this.f3522e = -1009589776;
        this.f3524g = 0;
        for (int i = 0; i != this.f3523f.length; i++) {
            this.f3523f[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0839p(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        int i = this.f3518a;
        int i2 = this.f3519b;
        int i3 = this.f3520c;
        int i4 = this.f3521d;
        int i5 = this.f3522e;
        int iM2065a = m2065a(((i2 ^ i3) ^ i4) + i + this.f3523f[0], 11) + i5;
        int iM2065a2 = m2065a(i3, 10);
        int iM2065a3 = m2065a(((iM2065a ^ i2) ^ iM2065a2) + i5 + this.f3523f[1], 14) + i4;
        int iM2065a4 = m2065a(i2, 10);
        int iM2065a5 = m2065a(((iM2065a3 ^ iM2065a) ^ iM2065a4) + i4 + this.f3523f[2], 15) + iM2065a2;
        int iM2065a6 = m2065a(iM2065a, 10);
        int iM2065a7 = m2065a(iM2065a2 + ((iM2065a5 ^ iM2065a3) ^ iM2065a6) + this.f3523f[3], 12) + iM2065a4;
        int iM2065a8 = m2065a(iM2065a3, 10);
        int iM2065a9 = m2065a(iM2065a4 + ((iM2065a7 ^ iM2065a5) ^ iM2065a8) + this.f3523f[4], 5) + iM2065a6;
        int iM2065a10 = m2065a(iM2065a5, 10);
        int iM2065a11 = m2065a(iM2065a6 + ((iM2065a9 ^ iM2065a7) ^ iM2065a10) + this.f3523f[5], 8) + iM2065a8;
        int iM2065a12 = m2065a(iM2065a7, 10);
        int iM2065a13 = m2065a(iM2065a8 + ((iM2065a11 ^ iM2065a9) ^ iM2065a12) + this.f3523f[6], 7) + iM2065a10;
        int iM2065a14 = m2065a(iM2065a9, 10);
        int iM2065a15 = m2065a(iM2065a10 + ((iM2065a13 ^ iM2065a11) ^ iM2065a14) + this.f3523f[7], 9) + iM2065a12;
        int iM2065a16 = m2065a(iM2065a11, 10);
        int iM2065a17 = m2065a(iM2065a12 + ((iM2065a15 ^ iM2065a13) ^ iM2065a16) + this.f3523f[8], 11) + iM2065a14;
        int iM2065a18 = m2065a(iM2065a13, 10);
        int iM2065a19 = m2065a(iM2065a14 + ((iM2065a17 ^ iM2065a15) ^ iM2065a18) + this.f3523f[9], 13) + iM2065a16;
        int iM2065a20 = m2065a(iM2065a15, 10);
        int iM2065a21 = m2065a(iM2065a16 + ((iM2065a19 ^ iM2065a17) ^ iM2065a20) + this.f3523f[10], 14) + iM2065a18;
        int iM2065a22 = m2065a(iM2065a17, 10);
        int iM2065a23 = m2065a(iM2065a18 + ((iM2065a21 ^ iM2065a19) ^ iM2065a22) + this.f3523f[11], 15) + iM2065a20;
        int iM2065a24 = m2065a(iM2065a19, 10);
        int iM2065a25 = m2065a(iM2065a20 + ((iM2065a23 ^ iM2065a21) ^ iM2065a24) + this.f3523f[12], 6) + iM2065a22;
        int iM2065a26 = m2065a(iM2065a21, 10);
        int iM2065a27 = m2065a(iM2065a22 + ((iM2065a25 ^ iM2065a23) ^ iM2065a26) + this.f3523f[13], 7) + iM2065a24;
        int iM2065a28 = m2065a(iM2065a23, 10);
        int iM2065a29 = m2065a(iM2065a24 + ((iM2065a27 ^ iM2065a25) ^ iM2065a28) + this.f3523f[14], 9) + iM2065a26;
        int iM2065a30 = m2065a(iM2065a25, 10);
        int iM2065a31 = m2065a(iM2065a26 + ((iM2065a29 ^ iM2065a27) ^ iM2065a30) + this.f3523f[15], 8) + iM2065a28;
        int iM2065a32 = m2065a(iM2065a27, 10);
        int iM2065a33 = m2065a(i + (((i4 ^ (-1)) | i3) ^ i2) + this.f3523f[5] + 1352829926, 8) + i5;
        int iM2065a34 = m2065a(i3, 10);
        int iM2065a35 = m2065a(i5 + (((iM2065a34 ^ (-1)) | i2) ^ iM2065a33) + this.f3523f[14] + 1352829926, 9) + i4;
        int iM2065a36 = m2065a(i2, 10);
        int iM2065a37 = m2065a(i4 + (((iM2065a36 ^ (-1)) | iM2065a33) ^ iM2065a35) + this.f3523f[7] + 1352829926, 9) + iM2065a34;
        int iM2065a38 = m2065a(iM2065a33, 10);
        int iM2065a39 = m2065a(iM2065a34 + (((iM2065a38 ^ (-1)) | iM2065a35) ^ iM2065a37) + this.f3523f[0] + 1352829926, 11) + iM2065a36;
        int iM2065a40 = m2065a(iM2065a35, 10);
        int iM2065a41 = m2065a(iM2065a36 + (((iM2065a40 ^ (-1)) | iM2065a37) ^ iM2065a39) + this.f3523f[9] + 1352829926, 13) + iM2065a38;
        int iM2065a42 = m2065a(iM2065a37, 10);
        int iM2065a43 = m2065a(iM2065a38 + (((iM2065a42 ^ (-1)) | iM2065a39) ^ iM2065a41) + this.f3523f[2] + 1352829926, 15) + iM2065a40;
        int iM2065a44 = m2065a(iM2065a39, 10);
        int iM2065a45 = m2065a(iM2065a40 + (((iM2065a44 ^ (-1)) | iM2065a41) ^ iM2065a43) + this.f3523f[11] + 1352829926, 15) + iM2065a42;
        int iM2065a46 = m2065a(iM2065a41, 10);
        int iM2065a47 = m2065a(iM2065a42 + (((iM2065a46 ^ (-1)) | iM2065a43) ^ iM2065a45) + this.f3523f[4] + 1352829926, 5) + iM2065a44;
        int iM2065a48 = m2065a(iM2065a43, 10);
        int iM2065a49 = m2065a(iM2065a44 + (((iM2065a48 ^ (-1)) | iM2065a45) ^ iM2065a47) + this.f3523f[13] + 1352829926, 7) + iM2065a46;
        int iM2065a50 = m2065a(iM2065a45, 10);
        int iM2065a51 = m2065a(iM2065a46 + (((iM2065a50 ^ (-1)) | iM2065a47) ^ iM2065a49) + this.f3523f[6] + 1352829926, 7) + iM2065a48;
        int iM2065a52 = m2065a(iM2065a47, 10);
        int iM2065a53 = m2065a(iM2065a48 + (((iM2065a52 ^ (-1)) | iM2065a49) ^ iM2065a51) + this.f3523f[15] + 1352829926, 8) + iM2065a50;
        int iM2065a54 = m2065a(iM2065a49, 10);
        int iM2065a55 = m2065a(iM2065a50 + (((iM2065a54 ^ (-1)) | iM2065a51) ^ iM2065a53) + this.f3523f[8] + 1352829926, 11) + iM2065a52;
        int iM2065a56 = m2065a(iM2065a51, 10);
        int iM2065a57 = m2065a(iM2065a52 + (((iM2065a56 ^ (-1)) | iM2065a53) ^ iM2065a55) + this.f3523f[1] + 1352829926, 14) + iM2065a54;
        int iM2065a58 = m2065a(iM2065a53, 10);
        int iM2065a59 = m2065a(iM2065a54 + (((iM2065a58 ^ (-1)) | iM2065a55) ^ iM2065a57) + this.f3523f[10] + 1352829926, 14) + iM2065a56;
        int iM2065a60 = m2065a(iM2065a55, 10);
        int iM2065a61 = m2065a(iM2065a56 + (((iM2065a60 ^ (-1)) | iM2065a57) ^ iM2065a59) + this.f3523f[3] + 1352829926, 12) + iM2065a58;
        int iM2065a62 = m2065a(iM2065a57, 10);
        int iM2065a63 = m2065a(iM2065a58 + (((iM2065a62 ^ (-1)) | iM2065a59) ^ iM2065a61) + this.f3523f[12] + 1352829926, 6) + iM2065a60;
        int iM2065a64 = m2065a(iM2065a59, 10);
        int iM2065a65 = m2065a(iM2065a28 + m2066a(iM2065a31, iM2065a29, iM2065a32) + this.f3523f[7] + 1518500249, 7) + iM2065a30;
        int iM2065a66 = m2065a(iM2065a29, 10);
        int iM2065a67 = m2065a(iM2065a30 + m2066a(iM2065a65, iM2065a31, iM2065a66) + this.f3523f[4] + 1518500249, 6) + iM2065a32;
        int iM2065a68 = m2065a(iM2065a31, 10);
        int iM2065a69 = m2065a(iM2065a32 + m2066a(iM2065a67, iM2065a65, iM2065a68) + this.f3523f[13] + 1518500249, 8) + iM2065a66;
        int iM2065a70 = m2065a(iM2065a65, 10);
        int iM2065a71 = m2065a(iM2065a66 + m2066a(iM2065a69, iM2065a67, iM2065a70) + this.f3523f[1] + 1518500249, 13) + iM2065a68;
        int iM2065a72 = m2065a(iM2065a67, 10);
        int iM2065a73 = m2065a(iM2065a68 + m2066a(iM2065a71, iM2065a69, iM2065a72) + this.f3523f[10] + 1518500249, 11) + iM2065a70;
        int iM2065a74 = m2065a(iM2065a69, 10);
        int iM2065a75 = m2065a(iM2065a70 + m2066a(iM2065a73, iM2065a71, iM2065a74) + this.f3523f[6] + 1518500249, 9) + iM2065a72;
        int iM2065a76 = m2065a(iM2065a71, 10);
        int iM2065a77 = m2065a(iM2065a72 + m2066a(iM2065a75, iM2065a73, iM2065a76) + this.f3523f[15] + 1518500249, 7) + iM2065a74;
        int iM2065a78 = m2065a(iM2065a73, 10);
        int iM2065a79 = m2065a(iM2065a74 + m2066a(iM2065a77, iM2065a75, iM2065a78) + this.f3523f[3] + 1518500249, 15) + iM2065a76;
        int iM2065a80 = m2065a(iM2065a75, 10);
        int iM2065a81 = m2065a(iM2065a76 + m2066a(iM2065a79, iM2065a77, iM2065a80) + this.f3523f[12] + 1518500249, 7) + iM2065a78;
        int iM2065a82 = m2065a(iM2065a77, 10);
        int iM2065a83 = m2065a(iM2065a78 + m2066a(iM2065a81, iM2065a79, iM2065a82) + this.f3523f[0] + 1518500249, 12) + iM2065a80;
        int iM2065a84 = m2065a(iM2065a79, 10);
        int iM2065a85 = m2065a(iM2065a80 + m2066a(iM2065a83, iM2065a81, iM2065a84) + this.f3523f[9] + 1518500249, 15) + iM2065a82;
        int iM2065a86 = m2065a(iM2065a81, 10);
        int iM2065a87 = m2065a(iM2065a82 + m2066a(iM2065a85, iM2065a83, iM2065a86) + this.f3523f[5] + 1518500249, 9) + iM2065a84;
        int iM2065a88 = m2065a(iM2065a83, 10);
        int iM2065a89 = m2065a(iM2065a84 + m2066a(iM2065a87, iM2065a85, iM2065a88) + this.f3523f[2] + 1518500249, 11) + iM2065a86;
        int iM2065a90 = m2065a(iM2065a85, 10);
        int iM2065a91 = m2065a(iM2065a86 + m2066a(iM2065a89, iM2065a87, iM2065a90) + this.f3523f[14] + 1518500249, 7) + iM2065a88;
        int iM2065a92 = m2065a(iM2065a87, 10);
        int iM2065a93 = m2065a(iM2065a88 + m2066a(iM2065a91, iM2065a89, iM2065a92) + this.f3523f[11] + 1518500249, 13) + iM2065a90;
        int iM2065a94 = m2065a(iM2065a89, 10);
        int iM2065a95 = m2065a(iM2065a90 + m2066a(iM2065a93, iM2065a91, iM2065a94) + this.f3523f[8] + 1518500249, 12) + iM2065a92;
        int iM2065a96 = m2065a(iM2065a91, 10);
        int iM2065a97 = m2065a(iM2065a60 + m2069b(iM2065a63, iM2065a61, iM2065a64) + this.f3523f[6] + 1548603684, 9) + iM2065a62;
        int iM2065a98 = m2065a(iM2065a61, 10);
        int iM2065a99 = m2065a(iM2065a62 + m2069b(iM2065a97, iM2065a63, iM2065a98) + this.f3523f[11] + 1548603684, 13) + iM2065a64;
        int iM2065a100 = m2065a(iM2065a63, 10);
        int iM2065a101 = m2065a(iM2065a64 + m2069b(iM2065a99, iM2065a97, iM2065a100) + this.f3523f[3] + 1548603684, 15) + iM2065a98;
        int iM2065a102 = m2065a(iM2065a97, 10);
        int iM2065a103 = m2065a(iM2065a98 + m2069b(iM2065a101, iM2065a99, iM2065a102) + this.f3523f[7] + 1548603684, 7) + iM2065a100;
        int iM2065a104 = m2065a(iM2065a99, 10);
        int iM2065a105 = m2065a(iM2065a100 + m2069b(iM2065a103, iM2065a101, iM2065a104) + this.f3523f[0] + 1548603684, 12) + iM2065a102;
        int iM2065a106 = m2065a(iM2065a101, 10);
        int iM2065a107 = m2065a(iM2065a102 + m2069b(iM2065a105, iM2065a103, iM2065a106) + this.f3523f[13] + 1548603684, 8) + iM2065a104;
        int iM2065a108 = m2065a(iM2065a103, 10);
        int iM2065a109 = m2065a(iM2065a104 + m2069b(iM2065a107, iM2065a105, iM2065a108) + this.f3523f[5] + 1548603684, 9) + iM2065a106;
        int iM2065a110 = m2065a(iM2065a105, 10);
        int iM2065a111 = m2065a(iM2065a106 + m2069b(iM2065a109, iM2065a107, iM2065a110) + this.f3523f[10] + 1548603684, 11) + iM2065a108;
        int iM2065a112 = m2065a(iM2065a107, 10);
        int iM2065a113 = m2065a(iM2065a108 + m2069b(iM2065a111, iM2065a109, iM2065a112) + this.f3523f[14] + 1548603684, 7) + iM2065a110;
        int iM2065a114 = m2065a(iM2065a109, 10);
        int iM2065a115 = m2065a(iM2065a110 + m2069b(iM2065a113, iM2065a111, iM2065a114) + this.f3523f[15] + 1548603684, 7) + iM2065a112;
        int iM2065a116 = m2065a(iM2065a111, 10);
        int iM2065a117 = m2065a(iM2065a112 + m2069b(iM2065a115, iM2065a113, iM2065a116) + this.f3523f[8] + 1548603684, 12) + iM2065a114;
        int iM2065a118 = m2065a(iM2065a113, 10);
        int iM2065a119 = m2065a(iM2065a114 + m2069b(iM2065a117, iM2065a115, iM2065a118) + this.f3523f[12] + 1548603684, 7) + iM2065a116;
        int iM2065a120 = m2065a(iM2065a115, 10);
        int iM2065a121 = m2065a(iM2065a116 + m2069b(iM2065a119, iM2065a117, iM2065a120) + this.f3523f[4] + 1548603684, 6) + iM2065a118;
        int iM2065a122 = m2065a(iM2065a117, 10);
        int iM2065a123 = m2065a(iM2065a118 + m2069b(iM2065a121, iM2065a119, iM2065a122) + this.f3523f[9] + 1548603684, 15) + iM2065a120;
        int iM2065a124 = m2065a(iM2065a119, 10);
        int iM2065a125 = m2065a(iM2065a120 + m2069b(iM2065a123, iM2065a121, iM2065a124) + this.f3523f[1] + 1548603684, 13) + iM2065a122;
        int iM2065a126 = m2065a(iM2065a121, 10);
        int iM2065a127 = m2065a(iM2065a122 + m2069b(iM2065a125, iM2065a123, iM2065a126) + this.f3523f[2] + 1548603684, 11) + iM2065a124;
        int iM2065a128 = m2065a(iM2065a123, 10);
        int iM2065a129 = m2065a(iM2065a92 + (((iM2065a93 ^ (-1)) | iM2065a95) ^ iM2065a96) + this.f3523f[3] + 1859775393, 11) + iM2065a94;
        int iM2065a130 = m2065a(iM2065a93, 10);
        int iM2065a131 = m2065a(iM2065a94 + (((iM2065a95 ^ (-1)) | iM2065a129) ^ iM2065a130) + this.f3523f[10] + 1859775393, 13) + iM2065a96;
        int iM2065a132 = m2065a(iM2065a95, 10);
        int iM2065a133 = m2065a(iM2065a96 + (((iM2065a129 ^ (-1)) | iM2065a131) ^ iM2065a132) + this.f3523f[14] + 1859775393, 6) + iM2065a130;
        int iM2065a134 = m2065a(iM2065a129, 10);
        int iM2065a135 = m2065a(iM2065a130 + (((iM2065a131 ^ (-1)) | iM2065a133) ^ iM2065a134) + this.f3523f[4] + 1859775393, 7) + iM2065a132;
        int iM2065a136 = m2065a(iM2065a131, 10);
        int iM2065a137 = m2065a(iM2065a132 + (((iM2065a133 ^ (-1)) | iM2065a135) ^ iM2065a136) + this.f3523f[9] + 1859775393, 14) + iM2065a134;
        int iM2065a138 = m2065a(iM2065a133, 10);
        int iM2065a139 = m2065a(iM2065a134 + (((iM2065a135 ^ (-1)) | iM2065a137) ^ iM2065a138) + this.f3523f[15] + 1859775393, 9) + iM2065a136;
        int iM2065a140 = m2065a(iM2065a135, 10);
        int iM2065a141 = m2065a(iM2065a136 + (((iM2065a137 ^ (-1)) | iM2065a139) ^ iM2065a140) + this.f3523f[8] + 1859775393, 13) + iM2065a138;
        int iM2065a142 = m2065a(iM2065a137, 10);
        int iM2065a143 = m2065a(iM2065a138 + (((iM2065a139 ^ (-1)) | iM2065a141) ^ iM2065a142) + this.f3523f[1] + 1859775393, 15) + iM2065a140;
        int iM2065a144 = m2065a(iM2065a139, 10);
        int iM2065a145 = m2065a(iM2065a140 + (((iM2065a141 ^ (-1)) | iM2065a143) ^ iM2065a144) + this.f3523f[2] + 1859775393, 14) + iM2065a142;
        int iM2065a146 = m2065a(iM2065a141, 10);
        int iM2065a147 = m2065a(iM2065a142 + (((iM2065a143 ^ (-1)) | iM2065a145) ^ iM2065a146) + this.f3523f[7] + 1859775393, 8) + iM2065a144;
        int iM2065a148 = m2065a(iM2065a143, 10);
        int iM2065a149 = m2065a(iM2065a144 + (((iM2065a145 ^ (-1)) | iM2065a147) ^ iM2065a148) + this.f3523f[0] + 1859775393, 13) + iM2065a146;
        int iM2065a150 = m2065a(iM2065a145, 10);
        int iM2065a151 = m2065a(iM2065a146 + (((iM2065a147 ^ (-1)) | iM2065a149) ^ iM2065a150) + this.f3523f[6] + 1859775393, 6) + iM2065a148;
        int iM2065a152 = m2065a(iM2065a147, 10);
        int iM2065a153 = m2065a(iM2065a148 + (((iM2065a149 ^ (-1)) | iM2065a151) ^ iM2065a152) + this.f3523f[13] + 1859775393, 5) + iM2065a150;
        int iM2065a154 = m2065a(iM2065a149, 10);
        int iM2065a155 = m2065a(iM2065a150 + (((iM2065a151 ^ (-1)) | iM2065a153) ^ iM2065a154) + this.f3523f[11] + 1859775393, 12) + iM2065a152;
        int iM2065a156 = m2065a(iM2065a151, 10);
        int iM2065a157 = m2065a(iM2065a152 + (((iM2065a153 ^ (-1)) | iM2065a155) ^ iM2065a156) + this.f3523f[5] + 1859775393, 7) + iM2065a154;
        int iM2065a158 = m2065a(iM2065a153, 10);
        int iM2065a159 = m2065a(iM2065a154 + (((iM2065a155 ^ (-1)) | iM2065a157) ^ iM2065a158) + this.f3523f[12] + 1859775393, 5) + iM2065a156;
        int iM2065a160 = m2065a(iM2065a155, 10);
        int iM2065a161 = m2065a(iM2065a124 + (((iM2065a125 ^ (-1)) | iM2065a127) ^ iM2065a128) + this.f3523f[15] + 1836072691, 9) + iM2065a126;
        int iM2065a162 = m2065a(iM2065a125, 10);
        int iM2065a163 = m2065a(iM2065a126 + (((iM2065a127 ^ (-1)) | iM2065a161) ^ iM2065a162) + this.f3523f[5] + 1836072691, 7) + iM2065a128;
        int iM2065a164 = m2065a(iM2065a127, 10);
        int iM2065a165 = m2065a(iM2065a128 + (((iM2065a161 ^ (-1)) | iM2065a163) ^ iM2065a164) + this.f3523f[1] + 1836072691, 15) + iM2065a162;
        int iM2065a166 = m2065a(iM2065a161, 10);
        int iM2065a167 = m2065a(iM2065a162 + (((iM2065a163 ^ (-1)) | iM2065a165) ^ iM2065a166) + this.f3523f[3] + 1836072691, 11) + iM2065a164;
        int iM2065a168 = m2065a(iM2065a163, 10);
        int iM2065a169 = m2065a(iM2065a164 + (((iM2065a165 ^ (-1)) | iM2065a167) ^ iM2065a168) + this.f3523f[7] + 1836072691, 8) + iM2065a166;
        int iM2065a170 = m2065a(iM2065a165, 10);
        int iM2065a171 = m2065a(iM2065a166 + (((iM2065a167 ^ (-1)) | iM2065a169) ^ iM2065a170) + this.f3523f[14] + 1836072691, 6) + iM2065a168;
        int iM2065a172 = m2065a(iM2065a167, 10);
        int iM2065a173 = m2065a(iM2065a168 + (((iM2065a169 ^ (-1)) | iM2065a171) ^ iM2065a172) + this.f3523f[6] + 1836072691, 6) + iM2065a170;
        int iM2065a174 = m2065a(iM2065a169, 10);
        int iM2065a175 = m2065a(iM2065a170 + (((iM2065a171 ^ (-1)) | iM2065a173) ^ iM2065a174) + this.f3523f[9] + 1836072691, 14) + iM2065a172;
        int iM2065a176 = m2065a(iM2065a171, 10);
        int iM2065a177 = m2065a(iM2065a172 + (((iM2065a173 ^ (-1)) | iM2065a175) ^ iM2065a176) + this.f3523f[11] + 1836072691, 12) + iM2065a174;
        int iM2065a178 = m2065a(iM2065a173, 10);
        int iM2065a179 = m2065a(iM2065a174 + (((iM2065a175 ^ (-1)) | iM2065a177) ^ iM2065a178) + this.f3523f[8] + 1836072691, 13) + iM2065a176;
        int iM2065a180 = m2065a(iM2065a175, 10);
        int iM2065a181 = m2065a(iM2065a176 + (((iM2065a177 ^ (-1)) | iM2065a179) ^ iM2065a180) + this.f3523f[12] + 1836072691, 5) + iM2065a178;
        int iM2065a182 = m2065a(iM2065a177, 10);
        int iM2065a183 = m2065a(iM2065a178 + (((iM2065a179 ^ (-1)) | iM2065a181) ^ iM2065a182) + this.f3523f[2] + 1836072691, 14) + iM2065a180;
        int iM2065a184 = m2065a(iM2065a179, 10);
        int iM2065a185 = m2065a(iM2065a180 + (((iM2065a181 ^ (-1)) | iM2065a183) ^ iM2065a184) + this.f3523f[10] + 1836072691, 13) + iM2065a182;
        int iM2065a186 = m2065a(iM2065a181, 10);
        int iM2065a187 = m2065a(iM2065a182 + (((iM2065a183 ^ (-1)) | iM2065a185) ^ iM2065a186) + this.f3523f[0] + 1836072691, 13) + iM2065a184;
        int iM2065a188 = m2065a(iM2065a183, 10);
        int iM2065a189 = m2065a(iM2065a184 + (((iM2065a185 ^ (-1)) | iM2065a187) ^ iM2065a188) + this.f3523f[4] + 1836072691, 7) + iM2065a186;
        int iM2065a190 = m2065a(iM2065a185, 10);
        int iM2065a191 = m2065a(iM2065a186 + (((iM2065a187 ^ (-1)) | iM2065a189) ^ iM2065a190) + this.f3523f[13] + 1836072691, 5) + iM2065a188;
        int iM2065a192 = m2065a(iM2065a187, 10);
        int iM2065a193 = m2065a(((iM2065a156 + m2069b(iM2065a159, iM2065a157, iM2065a160)) + this.f3523f[1]) - 1894007588, 11) + iM2065a158;
        int iM2065a194 = m2065a(iM2065a157, 10);
        int iM2065a195 = m2065a(((iM2065a158 + m2069b(iM2065a193, iM2065a159, iM2065a194)) + this.f3523f[9]) - 1894007588, 12) + iM2065a160;
        int iM2065a196 = m2065a(iM2065a159, 10);
        int iM2065a197 = m2065a(((iM2065a160 + m2069b(iM2065a195, iM2065a193, iM2065a196)) + this.f3523f[11]) - 1894007588, 14) + iM2065a194;
        int iM2065a198 = m2065a(iM2065a193, 10);
        int iM2065a199 = m2065a(((iM2065a194 + m2069b(iM2065a197, iM2065a195, iM2065a198)) + this.f3523f[10]) - 1894007588, 15) + iM2065a196;
        int iM2065a200 = m2065a(iM2065a195, 10);
        int iM2065a201 = m2065a(((iM2065a196 + m2069b(iM2065a199, iM2065a197, iM2065a200)) + this.f3523f[0]) - 1894007588, 14) + iM2065a198;
        int iM2065a202 = m2065a(iM2065a197, 10);
        int iM2065a203 = m2065a(((iM2065a198 + m2069b(iM2065a201, iM2065a199, iM2065a202)) + this.f3523f[8]) - 1894007588, 15) + iM2065a200;
        int iM2065a204 = m2065a(iM2065a199, 10);
        int iM2065a205 = m2065a(((iM2065a200 + m2069b(iM2065a203, iM2065a201, iM2065a204)) + this.f3523f[12]) - 1894007588, 9) + iM2065a202;
        int iM2065a206 = m2065a(iM2065a201, 10);
        int iM2065a207 = m2065a(((iM2065a202 + m2069b(iM2065a205, iM2065a203, iM2065a206)) + this.f3523f[4]) - 1894007588, 8) + iM2065a204;
        int iM2065a208 = m2065a(iM2065a203, 10);
        int iM2065a209 = m2065a(((iM2065a204 + m2069b(iM2065a207, iM2065a205, iM2065a208)) + this.f3523f[13]) - 1894007588, 9) + iM2065a206;
        int iM2065a210 = m2065a(iM2065a205, 10);
        int iM2065a211 = m2065a(((iM2065a206 + m2069b(iM2065a209, iM2065a207, iM2065a210)) + this.f3523f[3]) - 1894007588, 14) + iM2065a208;
        int iM2065a212 = m2065a(iM2065a207, 10);
        int iM2065a213 = m2065a(((iM2065a208 + m2069b(iM2065a211, iM2065a209, iM2065a212)) + this.f3523f[7]) - 1894007588, 5) + iM2065a210;
        int iM2065a214 = m2065a(iM2065a209, 10);
        int iM2065a215 = m2065a(((iM2065a210 + m2069b(iM2065a213, iM2065a211, iM2065a214)) + this.f3523f[15]) - 1894007588, 6) + iM2065a212;
        int iM2065a216 = m2065a(iM2065a211, 10);
        int iM2065a217 = m2065a(((iM2065a212 + m2069b(iM2065a215, iM2065a213, iM2065a216)) + this.f3523f[14]) - 1894007588, 8) + iM2065a214;
        int iM2065a218 = m2065a(iM2065a213, 10);
        int iM2065a219 = m2065a(((iM2065a214 + m2069b(iM2065a217, iM2065a215, iM2065a218)) + this.f3523f[5]) - 1894007588, 6) + iM2065a216;
        int iM2065a220 = m2065a(iM2065a215, 10);
        int iM2065a221 = m2065a(((iM2065a216 + m2069b(iM2065a219, iM2065a217, iM2065a220)) + this.f3523f[6]) - 1894007588, 5) + iM2065a218;
        int iM2065a222 = m2065a(iM2065a217, 10);
        int iM2065a223 = m2065a(((iM2065a218 + m2069b(iM2065a221, iM2065a219, iM2065a222)) + this.f3523f[2]) - 1894007588, 12) + iM2065a220;
        int iM2065a224 = m2065a(iM2065a219, 10);
        int iM2065a225 = m2065a(iM2065a188 + m2066a(iM2065a191, iM2065a189, iM2065a192) + this.f3523f[8] + 2053994217, 15) + iM2065a190;
        int iM2065a226 = m2065a(iM2065a189, 10);
        int iM2065a227 = m2065a(iM2065a190 + m2066a(iM2065a225, iM2065a191, iM2065a226) + this.f3523f[6] + 2053994217, 5) + iM2065a192;
        int iM2065a228 = m2065a(iM2065a191, 10);
        int iM2065a229 = m2065a(iM2065a192 + m2066a(iM2065a227, iM2065a225, iM2065a228) + this.f3523f[4] + 2053994217, 8) + iM2065a226;
        int iM2065a230 = m2065a(iM2065a225, 10);
        int iM2065a231 = m2065a(iM2065a226 + m2066a(iM2065a229, iM2065a227, iM2065a230) + this.f3523f[1] + 2053994217, 11) + iM2065a228;
        int iM2065a232 = m2065a(iM2065a227, 10);
        int iM2065a233 = m2065a(iM2065a228 + m2066a(iM2065a231, iM2065a229, iM2065a232) + this.f3523f[3] + 2053994217, 14) + iM2065a230;
        int iM2065a234 = m2065a(iM2065a229, 10);
        int iM2065a235 = m2065a(iM2065a230 + m2066a(iM2065a233, iM2065a231, iM2065a234) + this.f3523f[11] + 2053994217, 14) + iM2065a232;
        int iM2065a236 = m2065a(iM2065a231, 10);
        int iM2065a237 = m2065a(iM2065a232 + m2066a(iM2065a235, iM2065a233, iM2065a236) + this.f3523f[15] + 2053994217, 6) + iM2065a234;
        int iM2065a238 = m2065a(iM2065a233, 10);
        int iM2065a239 = m2065a(iM2065a234 + m2066a(iM2065a237, iM2065a235, iM2065a238) + this.f3523f[0] + 2053994217, 14) + iM2065a236;
        int iM2065a240 = m2065a(iM2065a235, 10);
        int iM2065a241 = m2065a(iM2065a236 + m2066a(iM2065a239, iM2065a237, iM2065a240) + this.f3523f[5] + 2053994217, 6) + iM2065a238;
        int iM2065a242 = m2065a(iM2065a237, 10);
        int iM2065a243 = m2065a(iM2065a238 + m2066a(iM2065a241, iM2065a239, iM2065a242) + this.f3523f[12] + 2053994217, 9) + iM2065a240;
        int iM2065a244 = m2065a(iM2065a239, 10);
        int iM2065a245 = m2065a(iM2065a240 + m2066a(iM2065a243, iM2065a241, iM2065a244) + this.f3523f[2] + 2053994217, 12) + iM2065a242;
        int iM2065a246 = m2065a(iM2065a241, 10);
        int iM2065a247 = m2065a(iM2065a242 + m2066a(iM2065a245, iM2065a243, iM2065a246) + this.f3523f[13] + 2053994217, 9) + iM2065a244;
        int iM2065a248 = m2065a(iM2065a243, 10);
        int iM2065a249 = m2065a(iM2065a244 + m2066a(iM2065a247, iM2065a245, iM2065a248) + this.f3523f[9] + 2053994217, 12) + iM2065a246;
        int iM2065a250 = m2065a(iM2065a245, 10);
        int iM2065a251 = m2065a(iM2065a246 + m2066a(iM2065a249, iM2065a247, iM2065a250) + this.f3523f[7] + 2053994217, 5) + iM2065a248;
        int iM2065a252 = m2065a(iM2065a247, 10);
        int iM2065a253 = m2065a(iM2065a248 + m2066a(iM2065a251, iM2065a249, iM2065a252) + this.f3523f[10] + 2053994217, 15) + iM2065a250;
        int iM2065a254 = m2065a(iM2065a249, 10);
        int iM2065a255 = m2065a(iM2065a250 + m2066a(iM2065a253, iM2065a251, iM2065a254) + this.f3523f[14] + 2053994217, 8) + iM2065a252;
        int iM2065a256 = m2065a(iM2065a251, 10);
        int iM2065a257 = m2065a(((iM2065a220 + (((iM2065a224 ^ (-1)) | iM2065a221) ^ iM2065a223)) + this.f3523f[4]) - 1454113458, 9) + iM2065a222;
        int iM2065a258 = m2065a(iM2065a221, 10);
        int iM2065a259 = m2065a(((iM2065a222 + (((iM2065a258 ^ (-1)) | iM2065a223) ^ iM2065a257)) + this.f3523f[0]) - 1454113458, 15) + iM2065a224;
        int iM2065a260 = m2065a(iM2065a223, 10);
        int iM2065a261 = m2065a(((iM2065a224 + (((iM2065a260 ^ (-1)) | iM2065a257) ^ iM2065a259)) + this.f3523f[5]) - 1454113458, 5) + iM2065a258;
        int iM2065a262 = m2065a(iM2065a257, 10);
        int iM2065a263 = m2065a(((iM2065a258 + (((iM2065a262 ^ (-1)) | iM2065a259) ^ iM2065a261)) + this.f3523f[9]) - 1454113458, 11) + iM2065a260;
        int iM2065a264 = m2065a(iM2065a259, 10);
        int iM2065a265 = m2065a(((iM2065a260 + (((iM2065a264 ^ (-1)) | iM2065a261) ^ iM2065a263)) + this.f3523f[7]) - 1454113458, 6) + iM2065a262;
        int iM2065a266 = m2065a(iM2065a261, 10);
        int iM2065a267 = m2065a(((iM2065a262 + (((iM2065a266 ^ (-1)) | iM2065a263) ^ iM2065a265)) + this.f3523f[12]) - 1454113458, 8) + iM2065a264;
        int iM2065a268 = m2065a(iM2065a263, 10);
        int iM2065a269 = m2065a(((iM2065a264 + (((iM2065a268 ^ (-1)) | iM2065a265) ^ iM2065a267)) + this.f3523f[2]) - 1454113458, 13) + iM2065a266;
        int iM2065a270 = m2065a(iM2065a265, 10);
        int iM2065a271 = m2065a(((iM2065a266 + (((iM2065a270 ^ (-1)) | iM2065a267) ^ iM2065a269)) + this.f3523f[10]) - 1454113458, 12) + iM2065a268;
        int iM2065a272 = m2065a(iM2065a267, 10);
        int iM2065a273 = m2065a(((iM2065a268 + (((iM2065a272 ^ (-1)) | iM2065a269) ^ iM2065a271)) + this.f3523f[14]) - 1454113458, 5) + iM2065a270;
        int iM2065a274 = m2065a(iM2065a269, 10);
        int iM2065a275 = m2065a(((iM2065a270 + (((iM2065a274 ^ (-1)) | iM2065a271) ^ iM2065a273)) + this.f3523f[1]) - 1454113458, 12) + iM2065a272;
        int iM2065a276 = m2065a(iM2065a271, 10);
        int iM2065a277 = m2065a(((iM2065a272 + (((iM2065a276 ^ (-1)) | iM2065a273) ^ iM2065a275)) + this.f3523f[3]) - 1454113458, 13) + iM2065a274;
        int iM2065a278 = m2065a(iM2065a273, 10);
        int iM2065a279 = m2065a(((iM2065a274 + (((iM2065a278 ^ (-1)) | iM2065a275) ^ iM2065a277)) + this.f3523f[8]) - 1454113458, 14) + iM2065a276;
        int iM2065a280 = m2065a(iM2065a275, 10);
        int iM2065a281 = m2065a(((iM2065a276 + (((iM2065a280 ^ (-1)) | iM2065a277) ^ iM2065a279)) + this.f3523f[11]) - 1454113458, 11) + iM2065a278;
        int iM2065a282 = m2065a(iM2065a277, 10);
        int iM2065a283 = m2065a(((iM2065a278 + (((iM2065a282 ^ (-1)) | iM2065a279) ^ iM2065a281)) + this.f3523f[6]) - 1454113458, 8) + iM2065a280;
        int iM2065a284 = m2065a(iM2065a279, 10);
        int iM2065a285 = m2065a(((iM2065a280 + (((iM2065a284 ^ (-1)) | iM2065a281) ^ iM2065a283)) + this.f3523f[15]) - 1454113458, 5) + iM2065a282;
        int iM2065a286 = m2065a(iM2065a281, 10);
        int iM2065a287 = m2065a(((iM2065a282 + (((iM2065a286 ^ (-1)) | iM2065a283) ^ iM2065a285)) + this.f3523f[13]) - 1454113458, 6) + iM2065a284;
        int iM2065a288 = m2065a(iM2065a283, 10);
        int iM2065a289 = m2065a(iM2065a252 + ((iM2065a255 ^ iM2065a253) ^ iM2065a256) + this.f3523f[12], 8) + iM2065a254;
        int iM2065a290 = m2065a(iM2065a253, 10);
        int iM2065a291 = m2065a(iM2065a254 + ((iM2065a289 ^ iM2065a255) ^ iM2065a290) + this.f3523f[15], 5) + iM2065a256;
        int iM2065a292 = m2065a(iM2065a255, 10);
        int iM2065a293 = m2065a(iM2065a256 + ((iM2065a291 ^ iM2065a289) ^ iM2065a292) + this.f3523f[10], 12) + iM2065a290;
        int iM2065a294 = m2065a(iM2065a289, 10);
        int iM2065a295 = m2065a(iM2065a290 + ((iM2065a293 ^ iM2065a291) ^ iM2065a294) + this.f3523f[4], 9) + iM2065a292;
        int iM2065a296 = m2065a(iM2065a291, 10);
        int iM2065a297 = m2065a(iM2065a292 + ((iM2065a295 ^ iM2065a293) ^ iM2065a296) + this.f3523f[1], 12) + iM2065a294;
        int iM2065a298 = m2065a(iM2065a293, 10);
        int iM2065a299 = m2065a(iM2065a294 + ((iM2065a297 ^ iM2065a295) ^ iM2065a298) + this.f3523f[5], 5) + iM2065a296;
        int iM2065a300 = m2065a(iM2065a295, 10);
        int iM2065a301 = m2065a(iM2065a296 + ((iM2065a299 ^ iM2065a297) ^ iM2065a300) + this.f3523f[8], 14) + iM2065a298;
        int iM2065a302 = m2065a(iM2065a297, 10);
        int iM2065a303 = m2065a(iM2065a298 + ((iM2065a301 ^ iM2065a299) ^ iM2065a302) + this.f3523f[7], 6) + iM2065a300;
        int iM2065a304 = m2065a(iM2065a299, 10);
        int iM2065a305 = m2065a(iM2065a300 + ((iM2065a303 ^ iM2065a301) ^ iM2065a304) + this.f3523f[6], 8) + iM2065a302;
        int iM2065a306 = m2065a(iM2065a301, 10);
        int iM2065a307 = m2065a(iM2065a302 + ((iM2065a305 ^ iM2065a303) ^ iM2065a306) + this.f3523f[2], 13) + iM2065a304;
        int iM2065a308 = m2065a(iM2065a303, 10);
        int iM2065a309 = m2065a(iM2065a304 + ((iM2065a307 ^ iM2065a305) ^ iM2065a308) + this.f3523f[13], 6) + iM2065a306;
        int iM2065a310 = m2065a(iM2065a305, 10);
        int iM2065a311 = m2065a(iM2065a306 + ((iM2065a309 ^ iM2065a307) ^ iM2065a310) + this.f3523f[14], 5) + iM2065a308;
        int iM2065a312 = m2065a(iM2065a307, 10);
        int iM2065a313 = m2065a(iM2065a308 + ((iM2065a311 ^ iM2065a309) ^ iM2065a312) + this.f3523f[0], 15) + iM2065a310;
        int iM2065a314 = m2065a(iM2065a309, 10);
        int iM2065a315 = m2065a(iM2065a310 + ((iM2065a313 ^ iM2065a311) ^ iM2065a314) + this.f3523f[3], 13) + iM2065a312;
        int iM2065a316 = m2065a(iM2065a311, 10);
        int iM2065a317 = m2065a(iM2065a312 + ((iM2065a315 ^ iM2065a313) ^ iM2065a316) + this.f3523f[9], 11) + iM2065a314;
        int iM2065a318 = m2065a(iM2065a313, 10);
        int iM2065a319 = m2065a(iM2065a314 + ((iM2065a317 ^ iM2065a315) ^ iM2065a318) + this.f3523f[11], 11) + iM2065a316;
        int iM2065a320 = m2065a(iM2065a315, 10) + iM2065a285 + this.f3519b;
        this.f3519b = iM2065a318 + this.f3520c + iM2065a288;
        this.f3520c = iM2065a316 + this.f3521d + iM2065a286;
        this.f3521d = this.f3522e + iM2065a284 + iM2065a319;
        this.f3522e = this.f3518a + iM2065a287 + iM2065a317;
        this.f3518a = iM2065a320;
        this.f3524g = 0;
        for (int i6 = 0; i6 != this.f3523f.length; i6++) {
            this.f3523f[i6] = 0;
        }
    }
}
