package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0836m extends AbstractC0831h {

    /* JADX INFO: renamed from: a */
    private int f3505a;

    /* JADX INFO: renamed from: b */
    private int f3506b;

    /* JADX INFO: renamed from: c */
    private int f3507c;

    /* JADX INFO: renamed from: d */
    private int f3508d;

    /* JADX INFO: renamed from: e */
    private int[] f3509e;

    /* JADX INFO: renamed from: f */
    private int f3510f;

    public C0836m() {
        this.f3509e = new int[16];
        mo1931c();
    }

    public C0836m(C0836m c0836m) {
        super(c0836m);
        this.f3509e = new int[16];
        m2049a(c0836m);
    }

    /* JADX INFO: renamed from: a */
    private static int m2046a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX INFO: renamed from: a */
    private static int m2047a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m2048a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a */
    private void m2049a(C0836m c0836m) {
        super.m2016a((AbstractC0831h) c0836m);
        this.f3505a = c0836m.f3505a;
        this.f3506b = c0836m.f3506b;
        this.f3507c = c0836m.f3507c;
        this.f3508d = c0836m.f3508d;
        System.arraycopy(c0836m.f3509e, 0, this.f3509e, 0, c0836m.f3509e.length);
        this.f3510f = c0836m.f3510f;
    }

    /* JADX INFO: renamed from: b */
    private static int m2050b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2017f();
        m2048a(this.f3505a, bArr, i);
        m2048a(this.f3506b, bArr, i + 4);
        m2048a(this.f3507c, bArr, i + 8);
        m2048a(this.f3508d, bArr, i + 12);
        mo1931c();
        return 16;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "MD5";
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: a */
    protected final void mo1938a(long j) {
        if (this.f3510f > 14) {
            mo1942g();
        }
        this.f3509e[14] = (int) ((-1) & j);
        this.f3509e[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        m2049a((C0836m) interfaceC1554e);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 16;
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: b */
    protected final void mo1940b(byte[] bArr, int i) {
        int[] iArr = this.f3509e;
        int i2 = this.f3510f;
        this.f3510f = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.f3510f == 16) {
            mo1942g();
        }
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        super.mo1931c();
        this.f3505a = 1732584193;
        this.f3506b = -271733879;
        this.f3507c = -1732584194;
        this.f3508d = 271733878;
        this.f3510f = 0;
        for (int i = 0; i != this.f3509e.length; i++) {
            this.f3509e[i] = 0;
        }
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0836m(this);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0831h
    /* JADX INFO: renamed from: g */
    protected final void mo1942g() {
        int i = this.f3505a;
        int i2 = this.f3506b;
        int i3 = this.f3507c;
        int i4 = this.f3508d;
        int iM2046a = m2046a(((i + m2047a(i2, i3, i4)) + this.f3509e[0]) - 680876936, 7) + i2;
        int iM2046a2 = m2046a(((i4 + m2047a(iM2046a, i2, i3)) + this.f3509e[1]) - 389564586, 12) + iM2046a;
        int iM2046a3 = m2046a(i3 + m2047a(iM2046a2, iM2046a, i2) + this.f3509e[2] + 606105819, 17) + iM2046a2;
        int iM2046a4 = m2046a(((i2 + m2047a(iM2046a3, iM2046a2, iM2046a)) + this.f3509e[3]) - 1044525330, 22) + iM2046a3;
        int iM2046a5 = m2046a(((iM2046a + m2047a(iM2046a4, iM2046a3, iM2046a2)) + this.f3509e[4]) - 176418897, 7) + iM2046a4;
        int iM2046a6 = m2046a(iM2046a2 + m2047a(iM2046a5, iM2046a4, iM2046a3) + this.f3509e[5] + 1200080426, 12) + iM2046a5;
        int iM2046a7 = m2046a(((iM2046a3 + m2047a(iM2046a6, iM2046a5, iM2046a4)) + this.f3509e[6]) - 1473231341, 17) + iM2046a6;
        int iM2046a8 = m2046a(((iM2046a4 + m2047a(iM2046a7, iM2046a6, iM2046a5)) + this.f3509e[7]) - 45705983, 22) + iM2046a7;
        int iM2046a9 = m2046a(iM2046a5 + m2047a(iM2046a8, iM2046a7, iM2046a6) + this.f3509e[8] + 1770035416, 7) + iM2046a8;
        int iM2046a10 = m2046a(((iM2046a6 + m2047a(iM2046a9, iM2046a8, iM2046a7)) + this.f3509e[9]) - 1958414417, 12) + iM2046a9;
        int iM2046a11 = m2046a(((iM2046a7 + m2047a(iM2046a10, iM2046a9, iM2046a8)) + this.f3509e[10]) - 42063, 17) + iM2046a10;
        int iM2046a12 = m2046a(((iM2046a8 + m2047a(iM2046a11, iM2046a10, iM2046a9)) + this.f3509e[11]) - 1990404162, 22) + iM2046a11;
        int iM2046a13 = m2046a(iM2046a9 + m2047a(iM2046a12, iM2046a11, iM2046a10) + this.f3509e[12] + 1804603682, 7) + iM2046a12;
        int iM2046a14 = m2046a(((iM2046a10 + m2047a(iM2046a13, iM2046a12, iM2046a11)) + this.f3509e[13]) - 40341101, 12) + iM2046a13;
        int iM2046a15 = m2046a(((iM2046a11 + m2047a(iM2046a14, iM2046a13, iM2046a12)) + this.f3509e[14]) - 1502002290, 17) + iM2046a14;
        int iM2046a16 = m2046a(iM2046a12 + m2047a(iM2046a15, iM2046a14, iM2046a13) + this.f3509e[15] + 1236535329, 22) + iM2046a15;
        int iM2046a17 = m2046a(((iM2046a13 + m2050b(iM2046a16, iM2046a15, iM2046a14)) + this.f3509e[1]) - 165796510, 5) + iM2046a16;
        int iM2046a18 = m2046a(((iM2046a14 + m2050b(iM2046a17, iM2046a16, iM2046a15)) + this.f3509e[6]) - 1069501632, 9) + iM2046a17;
        int iM2046a19 = m2046a(iM2046a15 + m2050b(iM2046a18, iM2046a17, iM2046a16) + this.f3509e[11] + 643717713, 14) + iM2046a18;
        int iM2046a20 = m2046a(((iM2046a16 + m2050b(iM2046a19, iM2046a18, iM2046a17)) + this.f3509e[0]) - 373897302, 20) + iM2046a19;
        int iM2046a21 = m2046a(((iM2046a17 + m2050b(iM2046a20, iM2046a19, iM2046a18)) + this.f3509e[5]) - 701558691, 5) + iM2046a20;
        int iM2046a22 = m2046a(iM2046a18 + m2050b(iM2046a21, iM2046a20, iM2046a19) + this.f3509e[10] + 38016083, 9) + iM2046a21;
        int iM2046a23 = m2046a(((iM2046a19 + m2050b(iM2046a22, iM2046a21, iM2046a20)) + this.f3509e[15]) - 660478335, 14) + iM2046a22;
        int iM2046a24 = m2046a(((iM2046a20 + m2050b(iM2046a23, iM2046a22, iM2046a21)) + this.f3509e[4]) - 405537848, 20) + iM2046a23;
        int iM2046a25 = m2046a(iM2046a21 + m2050b(iM2046a24, iM2046a23, iM2046a22) + this.f3509e[9] + 568446438, 5) + iM2046a24;
        int iM2046a26 = m2046a(((iM2046a22 + m2050b(iM2046a25, iM2046a24, iM2046a23)) + this.f3509e[14]) - 1019803690, 9) + iM2046a25;
        int iM2046a27 = m2046a(((iM2046a23 + m2050b(iM2046a26, iM2046a25, iM2046a24)) + this.f3509e[3]) - 187363961, 14) + iM2046a26;
        int iM2046a28 = m2046a(iM2046a24 + m2050b(iM2046a27, iM2046a26, iM2046a25) + this.f3509e[8] + 1163531501, 20) + iM2046a27;
        int iM2046a29 = m2046a(((iM2046a25 + m2050b(iM2046a28, iM2046a27, iM2046a26)) + this.f3509e[13]) - 1444681467, 5) + iM2046a28;
        int iM2046a30 = m2046a(((iM2046a26 + m2050b(iM2046a29, iM2046a28, iM2046a27)) + this.f3509e[2]) - 51403784, 9) + iM2046a29;
        int iM2046a31 = m2046a(iM2046a27 + m2050b(iM2046a30, iM2046a29, iM2046a28) + this.f3509e[7] + 1735328473, 14) + iM2046a30;
        int iM2046a32 = m2046a(((iM2046a28 + m2050b(iM2046a31, iM2046a30, iM2046a29)) + this.f3509e[12]) - 1926607734, 20) + iM2046a31;
        int iM2046a33 = m2046a(((iM2046a29 + ((iM2046a32 ^ iM2046a31) ^ iM2046a30)) + this.f3509e[5]) - 378558, 4) + iM2046a32;
        int iM2046a34 = m2046a(((iM2046a30 + ((iM2046a33 ^ iM2046a32) ^ iM2046a31)) + this.f3509e[8]) - 2022574463, 11) + iM2046a33;
        int iM2046a35 = m2046a(iM2046a31 + ((iM2046a34 ^ iM2046a33) ^ iM2046a32) + this.f3509e[11] + 1839030562, 16) + iM2046a34;
        int iM2046a36 = m2046a(((iM2046a32 + ((iM2046a35 ^ iM2046a34) ^ iM2046a33)) + this.f3509e[14]) - 35309556, 23) + iM2046a35;
        int iM2046a37 = m2046a(((iM2046a33 + ((iM2046a36 ^ iM2046a35) ^ iM2046a34)) + this.f3509e[1]) - 1530992060, 4) + iM2046a36;
        int iM2046a38 = m2046a(iM2046a34 + ((iM2046a37 ^ iM2046a36) ^ iM2046a35) + this.f3509e[4] + 1272893353, 11) + iM2046a37;
        int iM2046a39 = m2046a(((iM2046a35 + ((iM2046a38 ^ iM2046a37) ^ iM2046a36)) + this.f3509e[7]) - 155497632, 16) + iM2046a38;
        int iM2046a40 = m2046a(((iM2046a36 + ((iM2046a39 ^ iM2046a38) ^ iM2046a37)) + this.f3509e[10]) - 1094730640, 23) + iM2046a39;
        int iM2046a41 = m2046a(iM2046a37 + ((iM2046a40 ^ iM2046a39) ^ iM2046a38) + this.f3509e[13] + 681279174, 4) + iM2046a40;
        int iM2046a42 = m2046a(((iM2046a38 + ((iM2046a41 ^ iM2046a40) ^ iM2046a39)) + this.f3509e[0]) - 358537222, 11) + iM2046a41;
        int iM2046a43 = m2046a(((iM2046a39 + ((iM2046a42 ^ iM2046a41) ^ iM2046a40)) + this.f3509e[3]) - 722521979, 16) + iM2046a42;
        int iM2046a44 = m2046a(iM2046a40 + ((iM2046a43 ^ iM2046a42) ^ iM2046a41) + this.f3509e[6] + 76029189, 23) + iM2046a43;
        int iM2046a45 = m2046a(((iM2046a41 + ((iM2046a44 ^ iM2046a43) ^ iM2046a42)) + this.f3509e[9]) - 640364487, 4) + iM2046a44;
        int iM2046a46 = m2046a(((iM2046a42 + ((iM2046a45 ^ iM2046a44) ^ iM2046a43)) + this.f3509e[12]) - 421815835, 11) + iM2046a45;
        int iM2046a47 = m2046a(iM2046a43 + ((iM2046a46 ^ iM2046a45) ^ iM2046a44) + this.f3509e[15] + 530742520, 16) + iM2046a46;
        int iM2046a48 = m2046a(((iM2046a44 + ((iM2046a47 ^ iM2046a46) ^ iM2046a45)) + this.f3509e[2]) - 995338651, 23) + iM2046a47;
        int iM2046a49 = m2046a(((iM2046a45 + (((iM2046a46 ^ (-1)) | iM2046a48) ^ iM2046a47)) + this.f3509e[0]) - 198630844, 6) + iM2046a48;
        int iM2046a50 = m2046a(iM2046a46 + (((iM2046a47 ^ (-1)) | iM2046a49) ^ iM2046a48) + this.f3509e[7] + 1126891415, 10) + iM2046a49;
        int iM2046a51 = m2046a(((iM2046a47 + (((iM2046a48 ^ (-1)) | iM2046a50) ^ iM2046a49)) + this.f3509e[14]) - 1416354905, 15) + iM2046a50;
        int iM2046a52 = m2046a(((iM2046a48 + (((iM2046a49 ^ (-1)) | iM2046a51) ^ iM2046a50)) + this.f3509e[5]) - 57434055, 21) + iM2046a51;
        int iM2046a53 = m2046a(iM2046a49 + (((iM2046a50 ^ (-1)) | iM2046a52) ^ iM2046a51) + this.f3509e[12] + 1700485571, 6) + iM2046a52;
        int iM2046a54 = m2046a(((iM2046a50 + (((iM2046a51 ^ (-1)) | iM2046a53) ^ iM2046a52)) + this.f3509e[3]) - 1894986606, 10) + iM2046a53;
        int iM2046a55 = m2046a(((iM2046a51 + (((iM2046a52 ^ (-1)) | iM2046a54) ^ iM2046a53)) + this.f3509e[10]) - 1051523, 15) + iM2046a54;
        int iM2046a56 = m2046a(((iM2046a52 + (((iM2046a53 ^ (-1)) | iM2046a55) ^ iM2046a54)) + this.f3509e[1]) - 2054922799, 21) + iM2046a55;
        int iM2046a57 = m2046a(iM2046a53 + (((iM2046a54 ^ (-1)) | iM2046a56) ^ iM2046a55) + this.f3509e[8] + 1873313359, 6) + iM2046a56;
        int iM2046a58 = m2046a(((iM2046a54 + (((iM2046a55 ^ (-1)) | iM2046a57) ^ iM2046a56)) + this.f3509e[15]) - 30611744, 10) + iM2046a57;
        int iM2046a59 = m2046a(((iM2046a55 + (((iM2046a56 ^ (-1)) | iM2046a58) ^ iM2046a57)) + this.f3509e[6]) - 1560198380, 15) + iM2046a58;
        int iM2046a60 = m2046a(iM2046a56 + (((iM2046a57 ^ (-1)) | iM2046a59) ^ iM2046a58) + this.f3509e[13] + 1309151649, 21) + iM2046a59;
        int iM2046a61 = m2046a(((iM2046a57 + (((iM2046a58 ^ (-1)) | iM2046a60) ^ iM2046a59)) + this.f3509e[4]) - 145523070, 6) + iM2046a60;
        int iM2046a62 = m2046a(((iM2046a58 + (((iM2046a59 ^ (-1)) | iM2046a61) ^ iM2046a60)) + this.f3509e[11]) - 1120210379, 10) + iM2046a61;
        int iM2046a63 = m2046a(iM2046a59 + (((iM2046a60 ^ (-1)) | iM2046a62) ^ iM2046a61) + this.f3509e[2] + 718787259, 15) + iM2046a62;
        int iM2046a64 = m2046a(((iM2046a60 + (((iM2046a61 ^ (-1)) | iM2046a63) ^ iM2046a62)) + this.f3509e[9]) - 343485551, 21) + iM2046a63;
        this.f3505a = iM2046a61 + this.f3505a;
        this.f3506b += iM2046a64;
        this.f3507c += iM2046a63;
        this.f3508d += iM2046a62;
        this.f3510f = 0;
        for (int i5 = 0; i5 != this.f3509e.length; i5++) {
            this.f3509e[i5] = 0;
        }
    }
}
