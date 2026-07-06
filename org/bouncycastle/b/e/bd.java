package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public class bd implements org.bouncycastle.b.ao {
    protected byte a = 0;
    protected byte[] b = null;
    protected byte c = 0;
    protected byte[] d;
    protected byte[] e;

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            this.c = this.b[(this.c + this.b[this.a & 255]) & 255];
            byte b = this.b[(this.b[this.b[this.c & 255] & 255] + 1) & 255];
            byte b2 = this.b[this.a & 255];
            this.b[this.a & 255] = this.b[this.c & 255];
            this.b[this.c & 255] = b2;
            this.a = (byte) ((this.a + 1) & 255);
            bArr2[i4 + i3] = (byte) (b ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // org.bouncycastle.b.ao
    public String a() {
        return "VMPC";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.be)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        org.bouncycastle.b.k.be beVar = (org.bouncycastle.b.k.be) iVar;
        if (!(beVar.b() instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        org.bouncycastle.b.k.ba baVar = (org.bouncycastle.b.k.ba) beVar.b();
        this.d = beVar.a();
        if (this.d == null || this.d.length <= 0 || this.d.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        this.e = baVar.a();
        a(this.e, this.d);
    }

    protected void a(byte[] bArr, byte[] bArr2) {
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
        this.a = (byte) 0;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        a(this.e, this.d);
    }
}
