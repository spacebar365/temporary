package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class be extends bd {
    @Override // org.bouncycastle.b.e.bd, org.bouncycastle.b.ao
    public final String a() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.b.e.bd
    protected final void a(byte[] bArr, byte[] bArr2) {
        this.c = (byte) 0;
        this.b = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.b[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            this.c = this.b[(this.c + this.b[i2 & 255] + bArr[i2 % bArr.length]) & 255];
            byte b = this.b[i2 & 255];
            this.b[i2 & 255] = this.b[this.c & 255];
            this.b[this.c & 255] = b;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.c = this.b[(this.c + this.b[i3 & 255] + bArr2[i3 % bArr2.length]) & 255];
            byte b2 = this.b[i3 & 255];
            this.b[i3 & 255] = this.b[this.c & 255];
            this.b[this.c & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            this.c = this.b[(this.c + this.b[i4 & 255] + bArr[i4 % bArr.length]) & 255];
            byte b3 = this.b[i4 & 255];
            this.b[i4 & 255] = this.b[this.c & 255];
            this.b[this.c & 255] = b3;
        }
        this.a = (byte) 0;
    }
}
