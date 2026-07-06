package org.bouncycastle.b.h;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.r;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class k implements z {
    private r a;
    private int b;
    private byte[] c = new byte[64];
    private byte[] d = new byte[64];

    public k(r rVar) {
        this.a = rVar;
        this.b = rVar.b();
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.b];
        this.a.a(bArr2, 0);
        this.a.a(this.d, 0, this.d.length);
        this.a.a(bArr2, 0, bArr2.length);
        int iA = this.a.a(bArr, i);
        c();
        return iA;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.a.a() + "/HMAC";
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        this.a.c();
        byte[] bArrA = ((ba) iVar).a();
        if (bArrA.length > 64) {
            this.a.a(bArrA, 0, bArrA.length);
            this.a.a(this.c, 0);
            for (int i = this.b; i < this.c.length; i++) {
                this.c[i] = 0;
            }
        } else {
            System.arraycopy(bArrA, 0, this.c, 0, bArrA.length);
            for (int length = bArrA.length; length < this.c.length; length++) {
                this.c[length] = 0;
            }
        }
        this.d = new byte[this.c.length];
        System.arraycopy(this.c, 0, this.d, 0, this.c.length);
        for (int i2 = 0; i2 < this.c.length; i2++) {
            byte[] bArr = this.c;
            bArr[i2] = (byte) (bArr[i2] ^ 54);
        }
        for (int i3 = 0; i3 < this.d.length; i3++) {
            byte[] bArr2 = this.d;
            bArr2[i3] = (byte) (bArr2[i3] ^ 92);
        }
        this.a.a(this.c, 0, this.c.length);
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        this.a.c();
        this.a.a(this.c, 0, this.c.length);
    }
}
