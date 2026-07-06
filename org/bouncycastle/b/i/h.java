package org.bouncycastle.b.i;

import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class h extends an {
    private final int a;
    private int b;
    private int c;
    private byte[] d;
    private byte[] e;
    private org.bouncycastle.b.e f;
    private boolean g;
    private boolean h;
    private byte[] i;
    private byte[] j;
    private int k;

    public h(org.bouncycastle.b.e eVar) {
        this(eVar, eVar.b() * 8);
    }

    private void e() {
        this.d = new byte[this.b];
        this.e = new byte[this.b];
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.f.a() + "/CFB" + (this.c * 8);
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.a;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        this.k = 0;
        org.bouncycastle.f.a.d(this.j);
        org.bouncycastle.f.a.d(this.i);
        if (this.h) {
            System.arraycopy(this.e, 0, this.d, 0, this.e.length);
            this.f.c();
        }
    }

    public h(org.bouncycastle.b.e eVar, int i) {
        super(eVar);
        this.h = false;
        if (i < 0 || i > eVar.b() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (eVar.b() * 8));
        }
        this.c = eVar.b();
        this.f = eVar;
        this.a = i / 8;
        this.j = new byte[this.a];
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.g = z;
        if (iVar instanceof be) {
            be beVar = (be) iVar;
            byte[] bArrA = beVar.a();
            if (bArrA.length < this.c) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.b = bArrA.length;
            e();
            this.e = org.bouncycastle.f.a.b(bArrA);
            System.arraycopy(this.e, 0, this.d, 0, this.e.length);
            if (beVar.b() != null) {
                this.f.a(true, beVar.b());
            }
        } else {
            this.b = this.c * 2;
            e();
            System.arraycopy(this.e, 0, this.d, 0, this.e.length);
            if (iVar != null) {
                this.f.a(true, iVar);
            }
        }
        this.h = true;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.a, bArr2, i2);
        return this.a;
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.k == 0) {
            byte[] bArrA = org.bouncycastle.f.a.a(this.d, this.c);
            byte[] bArr = new byte[bArrA.length];
            this.f.a(bArrA, 0, bArr, 0);
            this.i = org.bouncycastle.f.a.a(bArr, this.a);
        }
        byte b2 = (byte) (this.i[this.k] ^ b);
        byte[] bArr2 = this.j;
        int i = this.k;
        this.k = i + 1;
        if (this.g) {
            b = b2;
        }
        bArr2[i] = b;
        if (this.k == this.a) {
            this.k = 0;
            byte[] bArr3 = this.j;
            byte[] bArrA2 = n.a(this.d, this.b - this.a);
            System.arraycopy(bArrA2, 0, this.d, 0, bArrA2.length);
            System.arraycopy(bArr3, 0, this.d, bArrA2.length, this.b - bArrA2.length);
        }
        return b2;
    }
}
