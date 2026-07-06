package org.bouncycastle.b.i;

import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class g implements org.bouncycastle.b.e {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private org.bouncycastle.b.e e;
    private boolean f = false;
    private boolean g;

    public g(org.bouncycastle.b.e eVar) {
        this.b = eVar.b();
        this.e = eVar;
    }

    private void a(byte[] bArr) {
        byte[] bArrA = n.a(this.c, this.a - this.b);
        System.arraycopy(bArrA, 0, this.c, 0, bArrA.length);
        System.arraycopy(bArr, 0, this.c, bArrA.length, this.a - bArrA.length);
    }

    private void d() {
        this.c = new byte[this.a];
        this.d = new byte[this.a];
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return this.e.a() + "/CBC";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
        if (this.f) {
            System.arraycopy(this.d, 0, this.c, 0, this.d.length);
            this.e.c();
        }
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.g = z;
        if (iVar instanceof be) {
            be beVar = (be) iVar;
            byte[] bArrA = beVar.a();
            if (bArrA.length < this.b) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.a = bArrA.length;
            d();
            this.d = org.bouncycastle.f.a.b(bArrA);
            System.arraycopy(this.d, 0, this.c, 0, this.d.length);
            if (beVar.b() != null) {
                this.e.a(z, beVar.b());
            }
        } else {
            this.a = this.b;
            d();
            System.arraycopy(this.d, 0, this.c, 0, this.d.length);
            if (iVar != null) {
                this.e.a(z, iVar);
            }
        }
        this.f = true;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.g) {
            byte[] bArrA = n.a(n.a(bArr, this.b, i), org.bouncycastle.f.a.a(this.c, this.b));
            byte[] bArr3 = new byte[bArrA.length];
            this.e.a(bArrA, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            if (bArr2.length > bArrA.length + i2) {
                a(bArr3);
            }
            return bArr3.length;
        }
        byte[] bArrA2 = org.bouncycastle.f.a.a(this.c, this.b);
        byte[] bArrA3 = n.a(bArr, this.b, i);
        byte[] bArr4 = new byte[bArrA3.length];
        this.e.a(bArrA3, 0, bArr4, 0);
        byte[] bArrA4 = n.a(bArr4, bArrA2);
        System.arraycopy(bArrA4, 0, bArr2, i2, bArrA4.length);
        if (bArr2.length > bArrA4.length + i2) {
            a(bArrA3);
        }
        return bArrA4.length;
    }
}
