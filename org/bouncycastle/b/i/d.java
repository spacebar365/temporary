package org.bouncycastle.b.i;

import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class d extends an {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private org.bouncycastle.b.e f;
    private boolean g;
    private int h;

    public d(org.bouncycastle.b.e eVar, int i) {
        super(eVar);
        this.f = null;
        this.f = eVar;
        this.e = i / 8;
        this.a = new byte[eVar.b()];
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
        this.d = new byte[this.e];
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.e, bArr2, i2);
        return this.e;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.f.a() + "/CFB" + (this.e * 8);
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.g = z;
        if (!(iVar instanceof be)) {
            c();
            if (iVar != null) {
                this.f.a(true, iVar);
                return;
            }
            return;
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA.length < this.a.length) {
            System.arraycopy(bArrA, 0, this.a, this.a.length - bArrA.length, bArrA.length);
            for (int i = 0; i < this.a.length - bArrA.length; i++) {
                this.a[i] = 0;
            }
        } else {
            System.arraycopy(bArrA, 0, this.a, 0, this.a.length);
        }
        c();
        if (beVar.b() != null) {
            this.f.a(true, beVar.b());
        }
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.e;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        System.arraycopy(this.a, 0, this.b, 0, this.a.length);
        org.bouncycastle.f.a.a(this.d, (byte) 0);
        this.h = 0;
        this.f.c();
    }

    public final byte[] e() {
        return org.bouncycastle.f.a.b(this.b);
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        byte b2;
        if (this.g) {
            if (this.h == 0) {
                this.f.a(this.b, 0, this.c, 0);
            }
            b2 = (byte) (this.c[this.h] ^ b);
            byte[] bArr = this.d;
            int i = this.h;
            this.h = i + 1;
            bArr[i] = b2;
            if (this.h == this.e) {
                this.h = 0;
                System.arraycopy(this.b, this.e, this.b, 0, this.b.length - this.e);
                System.arraycopy(this.d, 0, this.b, this.b.length - this.e, this.e);
            }
        } else {
            if (this.h == 0) {
                this.f.a(this.b, 0, this.c, 0);
            }
            this.d[this.h] = b;
            byte[] bArr2 = this.c;
            int i2 = this.h;
            this.h = i2 + 1;
            b2 = (byte) (bArr2[i2] ^ b);
            if (this.h == this.e) {
                this.h = 0;
                System.arraycopy(this.b, this.e, this.b, 0, this.b.length - this.e);
                System.arraycopy(this.d, 0, this.b, this.b.length - this.e, this.e);
            }
        }
        return b2;
    }
}
