package org.bouncycastle.b.h;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class o implements z {
    private byte a;
    private byte b = 0;
    private byte[] c = null;
    private byte d = 0;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte h;
    private byte i;
    private byte j;
    private byte k;

    private void a(byte[] bArr, byte[] bArr2) {
        this.d = (byte) 0;
        this.c = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.c[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            this.d = this.c[(this.d + this.c[i2 & 255] + bArr[i2 % bArr.length]) & 255];
            byte b = this.c[i2 & 255];
            this.c[i2 & 255] = this.c[this.d & 255];
            this.c[this.d & 255] = b;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.d = this.c[(this.d + this.c[i3 & 255] + bArr2[i3 % bArr2.length]) & 255];
            byte b2 = this.c[i3 & 255];
            this.c[i3 & 255] = this.c[this.d & 255];
            this.c[this.d & 255] = b2;
        }
        this.b = (byte) 0;
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        for (int i2 = 1; i2 < 25; i2++) {
            this.d = this.c[(this.d + this.c[this.b & 255]) & 255];
            this.k = this.c[(this.k + this.j + i2) & 255];
            this.j = this.c[(this.j + this.i + i2) & 255];
            this.i = this.c[(this.i + this.h + i2) & 255];
            this.h = this.c[(this.h + this.d + i2) & 255];
            this.e[this.a & 31] = (byte) (this.e[this.a & 31] ^ this.h);
            this.e[(this.a + 1) & 31] = (byte) (this.e[(this.a + 1) & 31] ^ this.i);
            this.e[(this.a + 2) & 31] = (byte) (this.e[(this.a + 2) & 31] ^ this.j);
            this.e[(this.a + 3) & 31] = (byte) (this.e[(this.a + 3) & 31] ^ this.k);
            this.a = (byte) ((this.a + 4) & 31);
            byte b = this.c[this.b & 255];
            this.c[this.b & 255] = this.c[this.d & 255];
            this.c[this.d & 255] = b;
            this.b = (byte) ((this.b + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            this.d = this.c[(this.d + this.c[i3 & 255] + this.e[i3 & 31]) & 255];
            byte b2 = this.c[i3 & 255];
            this.c[i3 & 255] = this.c[this.d & 255];
            this.c[this.d & 255] = b2;
        }
        byte[] bArr2 = new byte[20];
        for (int i4 = 0; i4 < 20; i4++) {
            this.d = this.c[(this.d + this.c[i4 & 255]) & 255];
            bArr2[i4] = this.c[(this.c[this.c[this.d & 255] & 255] + 1) & 255];
            byte b3 = this.c[i4 & 255];
            this.c[i4 & 255] = this.c[this.d & 255];
            this.c[this.d & 255] = b3;
        }
        System.arraycopy(bArr2, 0, bArr, i, 20);
        c();
        return 20;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.d = this.c[(this.d + this.c[this.b & 255]) & 255];
        byte b2 = (byte) (this.c[(this.c[this.c[this.d & 255] & 255] + 1) & 255] ^ b);
        this.k = this.c[(this.k + this.j) & 255];
        this.j = this.c[(this.j + this.i) & 255];
        this.i = this.c[(this.i + this.h) & 255];
        this.h = this.c[(b2 + this.h + this.d) & 255];
        this.e[this.a & 31] = (byte) (this.e[this.a & 31] ^ this.h);
        this.e[(this.a + 1) & 31] = (byte) (this.e[(this.a + 1) & 31] ^ this.i);
        this.e[(this.a + 2) & 31] = (byte) (this.e[(this.a + 2) & 31] ^ this.j);
        this.e[(this.a + 3) & 31] = (byte) (this.e[(this.a + 3) & 31] ^ this.k);
        this.a = (byte) ((this.a + 4) & 31);
        byte b3 = this.c[this.b & 255];
        this.c[this.b & 255] = this.c[this.d & 255];
        this.c[this.d & 255] = b3;
        this.b = (byte) ((this.b + 1) & 255);
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof be)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        be beVar = (be) iVar;
        ba baVar = (ba) beVar.b();
        if (!(beVar.b() instanceof ba)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        this.f = beVar.a();
        if (this.f == null || this.f.length <= 0 || this.f.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.g = baVar.a();
        c();
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            a(bArr[i + i3]);
        }
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return 20;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        a(this.g, this.f);
        this.b = (byte) 0;
        this.k = (byte) 0;
        this.j = (byte) 0;
        this.i = (byte) 0;
        this.h = (byte) 0;
        this.a = (byte) 0;
        this.e = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.e[i] = 0;
        }
    }
}
