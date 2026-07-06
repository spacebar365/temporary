package org.bouncycastle.b.h;

import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class a implements z {
    private byte[] a;
    private byte[] b;
    private int c;
    private org.bouncycastle.b.e d;
    private org.bouncycastle.b.j.a e;
    private int f;

    public a(org.bouncycastle.b.e eVar) {
        this(eVar, (eVar.b() * 8) / 2, null);
    }

    public a(org.bouncycastle.b.e eVar, int i) {
        this(eVar, i, null);
    }

    public a(org.bouncycastle.b.e eVar, int i, org.bouncycastle.b.j.a aVar) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.d = new org.bouncycastle.b.i.b(eVar);
        this.e = aVar;
        this.f = i / 8;
        this.a = new byte[eVar.b()];
        this.b = new byte[eVar.b()];
        this.c = 0;
    }

    @Override // org.bouncycastle.b.z
    public final int a(byte[] bArr, int i) {
        int iB = this.d.b();
        if (this.e == null) {
            while (this.c < iB) {
                this.b[this.c] = 0;
                this.c++;
            }
        } else {
            if (this.c == iB) {
                this.d.a(this.b, 0, this.a, 0);
                this.c = 0;
            }
            this.e.a(this.b, this.c);
        }
        this.d.a(this.b, 0, this.a, 0);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        c();
        return this.f;
    }

    @Override // org.bouncycastle.b.z
    public final String a() {
        return this.d.a();
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte b) {
        if (this.c == this.b.length) {
            this.d.a(this.b, 0, this.a, 0);
            this.c = 0;
        }
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.b.z
    public final void a(org.bouncycastle.b.i iVar) {
        c();
        this.d.a(true, iVar);
    }

    @Override // org.bouncycastle.b.z
    public final void a(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iB = this.d.b();
        int i3 = iB - this.c;
        if (i2 > i3) {
            System.arraycopy(bArr, i, this.b, this.c, i3);
            this.d.a(this.b, 0, this.a, 0);
            this.c = 0;
            i2 -= i3;
            i += i3;
            while (i2 > iB) {
                this.d.a(bArr, i, this.a, 0);
                i2 -= iB;
                i += iB;
            }
        }
        System.arraycopy(bArr, i, this.b, this.c, i2);
        this.c += i2;
    }

    @Override // org.bouncycastle.b.z
    public final int b() {
        return this.f;
    }

    @Override // org.bouncycastle.b.z
    public final void c() {
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = 0;
        }
        this.c = 0;
        this.d.c();
    }
}
