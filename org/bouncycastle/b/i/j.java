package org.bouncycastle.b.i;

import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class j extends an {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private org.bouncycastle.b.e f;
    private int g;
    private boolean h;

    public j(org.bouncycastle.b.e eVar) {
        super(eVar);
        this.h = false;
        this.b = eVar.b();
        this.f = eVar;
        this.e = new byte[this.b];
    }

    private void e() {
        this.c = new byte[this.a];
        this.d = new byte[this.a];
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.b, bArr2, i2);
        return this.b;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.f.a() + "/OFB";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        if (this.h) {
            System.arraycopy(this.d, 0, this.c, 0, this.d.length);
            org.bouncycastle.f.a.d(this.e);
            this.g = 0;
            this.f.c();
        }
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (iVar instanceof be) {
            be beVar = (be) iVar;
            byte[] bArrA = beVar.a();
            if (bArrA.length < this.b) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            this.a = bArrA.length;
            e();
            this.d = org.bouncycastle.f.a.b(bArrA);
            System.arraycopy(this.d, 0, this.c, 0, this.d.length);
            if (beVar.b() != null) {
                this.f.a(true, beVar.b());
            }
        } else {
            this.a = this.b * 2;
            e();
            System.arraycopy(this.d, 0, this.c, 0, this.d.length);
            if (iVar != null) {
                this.f.a(true, iVar);
            }
        }
        this.h = true;
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.g == 0) {
            this.f.a(org.bouncycastle.f.a.a(this.c, this.b), 0, this.e, 0);
        }
        byte b2 = (byte) (this.e[this.g] ^ b);
        this.g++;
        if (this.g == this.b) {
            this.g = 0;
            byte[] bArrA = n.a(this.c, this.a - this.b);
            System.arraycopy(bArrA, 0, this.c, 0, bArrA.length);
            System.arraycopy(this.e, 0, this.c, bArrA.length, this.a - bArrA.length);
        }
        return b2;
    }
}
