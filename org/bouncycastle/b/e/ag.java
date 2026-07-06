package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class ag implements org.bouncycastle.b.ao {
    private byte[] a = null;
    private int b = 0;
    private int c = 0;
    private byte[] d = null;

    private void a(byte[] bArr) {
        this.d = bArr;
        this.b = 0;
        this.c = 0;
        if (this.a == null) {
            this.a = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        while (i2 < 256) {
            int i4 = ((bArr[length] & 255) + this.a[i2] + i3) & 255;
            byte b = this.a[i2];
            byte[] bArr2 = this.a;
            bArr2[i2] = bArr2[i4];
            this.a[i4] = b;
            length = (length + 1) % bArr.length;
            i2++;
            i3 = i4;
        }
    }

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            this.b = (this.b + 1) & 255;
            this.c = (this.a[this.b] + this.c) & 255;
            byte b = this.a[this.b];
            this.a[this.b] = this.a[this.c];
            this.a[this.c] = b;
            bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ this.a[(this.a[this.b] + this.a[this.c]) & 255]);
        }
        return i2;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return "RC4";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + iVar.getClass().getName());
        }
        this.d = ((org.bouncycastle.b.k.ba) iVar).a();
        a(this.d);
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        a(this.d);
    }
}
