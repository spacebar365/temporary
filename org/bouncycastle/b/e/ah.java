package org.bouncycastle.b.e;

import org.bouncycastle.b.k.bj;

/* JADX INFO: loaded from: classes.dex */
public final class ah implements org.bouncycastle.b.e {
    private int a = 12;
    private int[] b = null;
    private boolean c;

    private static int a(int i, int i2) {
        return (i << (i2 & 31)) | (i >>> (32 - (i2 & 31)));
    }

    private static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private void a(byte[] bArr) {
        int[] iArr = new int[(bArr.length + 3) / 4];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr[i2] = iArr[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        this.b = new int[(this.a + 1) * 2];
        this.b[0] = -1209970333;
        for (int i3 = 1; i3 < this.b.length; i3++) {
            this.b[i3] = r2[i3 - 1] - 1640531527;
        }
        int length = iArr.length > this.b.length ? iArr.length * 3 : this.b.length * 3;
        int length2 = 0;
        int length3 = 0;
        int iA = 0;
        int iA2 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr2 = this.b;
            iA2 = a(iA2 + iArr2[length3] + iA, 3);
            iArr2[length3] = iA2;
            iA = a(iArr[length2] + iA2 + iA, iA + iA2);
            iArr[length2] = iA;
            length3 = (length3 + 1) % this.b.length;
            length2 = (length2 + 1) % iArr.length;
        }
    }

    private static int b(int i, int i2) {
        return (i >>> (i2 & 31)) | (i << (32 - (i2 & 31)));
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (iVar instanceof bj) {
            bj bjVar = (bj) iVar;
            this.a = bjVar.b();
            a(bjVar.a());
        } else {
            if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
                throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + iVar.getClass().getName());
            }
            a(((org.bouncycastle.b.k.ba) iVar).a());
        }
        this.c = z;
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.c) {
            int iA = a(bArr, i) + this.b[0];
            int iA2 = a(bArr, i + 4) + this.b[1];
            for (int i3 = 1; i3 <= this.a; i3++) {
                iA = a(iA ^ iA2, iA2) + this.b[i3 * 2];
                iA2 = a(iA2 ^ iA, iA) + this.b[(i3 * 2) + 1];
            }
            a(iA, bArr2, i2);
            a(iA2, bArr2, i2 + 4);
        } else {
            int iA3 = a(bArr, i);
            int iA4 = a(bArr, i + 4);
            for (int i4 = this.a; i4 > 0; i4--) {
                iA4 = b(iA4 - this.b[(i4 * 2) + 1], iA3) ^ iA3;
                iA3 = b(iA3 - this.b[i4 * 2], iA4) ^ iA4;
            }
            a(iA3 - this.b[0], bArr2, i2);
            a(iA4 - this.b[1], bArr2, i2 + 4);
        }
        return 8;
    }
}
