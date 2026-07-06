package org.bouncycastle.b.i;

import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class i extends an {
    private final int a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private final int e;
    private final org.bouncycastle.b.e f;
    private int g;
    private boolean h;

    public i(org.bouncycastle.b.e eVar) {
        this(eVar, eVar.b() * 8);
    }

    private i(org.bouncycastle.b.e eVar, int i) {
        super(eVar);
        this.g = 0;
        if (i < 0 || i > eVar.b() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (eVar.b() * 8));
        }
        this.f = eVar;
        this.e = eVar.b();
        this.a = i / 8;
        this.b = new byte[this.e];
    }

    private void e() {
        this.c = new byte[this.e / 2];
        this.b = new byte[this.e];
        this.d = new byte[this.a];
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.a, bArr2, i2);
        return this.a;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.f.a() + "/GCTR";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (iVar instanceof be) {
            be beVar = (be) iVar;
            e();
            this.c = org.bouncycastle.f.a.b(beVar.a());
            if (this.c.length != this.e / 2) {
                throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
            }
            System.arraycopy(this.c, 0, this.b, 0, this.c.length);
            for (int length = this.c.length; length < this.e; length++) {
                this.b[length] = 0;
            }
            if (beVar.b() != null) {
                this.f.a(true, beVar.b());
            }
        } else {
            e();
            if (iVar != null) {
                this.f.a(true, iVar);
            }
        }
        this.h = true;
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.a;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        if (this.h) {
            System.arraycopy(this.c, 0, this.b, 0, this.c.length);
            for (int length = this.c.length; length < this.e; length++) {
                this.b[length] = 0;
            }
            this.g = 0;
            this.f.c();
        }
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.g == 0) {
            byte[] bArr = new byte[this.b.length];
            this.f.a(this.b, 0, bArr, 0);
            this.d = org.bouncycastle.f.a.a(bArr, this.a);
        }
        byte b2 = (byte) (this.d[this.g] ^ b);
        this.g++;
        if (this.g == this.a) {
            this.g = 0;
            byte[] bArr2 = this.b;
            int length = this.b.length - 1;
            bArr2[length] = (byte) (bArr2[length] + 1);
        }
        return b2;
    }
}
