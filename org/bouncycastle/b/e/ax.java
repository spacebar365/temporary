package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class ax implements org.bouncycastle.b.e {
    private static final int[] a = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private boolean b = false;
    private int[] c = null;

    private void a(byte[] bArr) {
        if (bArr.length == 0 || bArr.length > 64 || bArr.length < 16 || bArr.length % 8 != 0) {
            throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
        }
        b(bArr, this.c, 0);
        for (int i = 16; i < 64; i++) {
            int[] iArr = this.c;
            iArr[i] = ((((iArr[i - 2] >>> 17) | (this.c[i - 2] << (-17))) ^ ((this.c[i - 2] >>> 19) | (this.c[i - 2] << (-19)))) ^ (this.c[i - 2] >>> 10)) + this.c[i - 7] + ((((this.c[i - 15] >>> 7) | (this.c[i - 15] << (-7))) ^ ((this.c[i - 15] >>> 18) | (this.c[i - 15] << (-18)))) ^ (this.c[i - 15] >>> 3)) + this.c[i - 16];
        }
    }

    private static void a(byte[] bArr, int[] iArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i3] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i6 = i4 + 1;
            i = i6 + 1;
            iArr[i2] = i5 | ((bArr[i4] & 255) << 8) | (bArr[i6] & 255);
        }
    }

    private static void a(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i + 1;
            bArr[i] = (byte) (iArr[i2] >>> 24);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (iArr[i2] >>> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (iArr[i2] >>> 8);
            i = i5 + 1;
            bArr[i5] = (byte) iArr[i2];
        }
    }

    private void b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[8];
        a(bArr, iArr, i);
        for (int i3 = 0; i3 < 64; i3++) {
            int i4 = ((((iArr[4] >>> 6) | (iArr[4] << (-6))) ^ ((iArr[4] >>> 11) | (iArr[4] << (-11)))) ^ ((iArr[4] >>> 25) | (iArr[4] << (-25)))) + ((iArr[4] & iArr[5]) ^ ((iArr[4] ^ (-1)) & iArr[6])) + iArr[7] + a[i3] + this.c[i3];
            iArr[7] = iArr[6];
            iArr[6] = iArr[5];
            iArr[5] = iArr[4];
            iArr[4] = iArr[3] + i4;
            iArr[3] = iArr[2];
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i4 + ((((iArr[0] >>> 2) | (iArr[0] << (-2))) ^ ((iArr[0] >>> 13) | (iArr[0] << (-13)))) ^ ((iArr[0] >>> 22) | (iArr[0] << (-22)))) + (((iArr[0] & iArr[2]) ^ (iArr[0] & iArr[3])) ^ (iArr[2] & iArr[3]));
        }
        a(iArr, bArr2, i2);
    }

    private static void b(byte[] bArr, int[] iArr, int i) {
        for (int i2 = 0; i2 < bArr.length / 4; i2++) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i3] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i6 = i4 + 1;
            i = i6 + 1;
            iArr[i2] = i5 | ((bArr[i4] & 255) << 8) | (bArr[i6] & 255);
        }
    }

    private void c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[8];
        a(bArr, iArr, i);
        for (int i3 = 63; i3 >= 0; i3--) {
            int i4 = (iArr[0] - ((((iArr[1] >>> 2) | (iArr[1] << (-2))) ^ ((iArr[1] >>> 13) | (iArr[1] << (-13)))) ^ ((iArr[1] >>> 22) | (iArr[1] << (-22))))) - (((iArr[1] & iArr[2]) ^ (iArr[1] & iArr[3])) ^ (iArr[2] & iArr[3]));
            iArr[0] = iArr[1];
            iArr[1] = iArr[2];
            iArr[2] = iArr[3];
            iArr[3] = iArr[4] - i4;
            iArr[4] = iArr[5];
            iArr[5] = iArr[6];
            iArr[6] = iArr[7];
            iArr[7] = (((i4 - a[i3]) - this.c[i3]) - ((((iArr[4] >>> 6) | (iArr[4] << (-6))) ^ ((iArr[4] >>> 11) | (iArr[4] << (-11)))) ^ ((iArr[4] >>> 25) | (iArr[4] << (-25))))) - ((iArr[4] & iArr[5]) ^ ((iArr[4] ^ (-1)) & iArr[6]));
        }
        a(iArr, bArr2, i2);
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.c == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i + 32 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 32 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        if (this.b) {
            b(bArr, i, bArr2, i2);
            return 32;
        }
        c(bArr, i, bArr2, i2);
        return 32;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "Shacal2";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.b = z;
        this.c = new int[64];
        a(((org.bouncycastle.b.k.ba) iVar).a());
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 32;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }
}
