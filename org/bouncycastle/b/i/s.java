package org.bouncycastle.b.i;

import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class s extends an {
    private int a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private final int e;
    private final org.bouncycastle.b.e f;

    public s(org.bouncycastle.b.e eVar, int i) {
        super(eVar);
        this.f = eVar;
        this.e = i / 8;
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
        this.d = new byte[eVar.b()];
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.a == 0) {
            this.f.a(this.c, 0, this.d, 0);
        }
        byte[] bArr = this.d;
        int i = this.a;
        this.a = i + 1;
        byte b2 = (byte) (bArr[i] ^ b);
        if (this.a == this.e) {
            this.a = 0;
            System.arraycopy(this.c, this.e, this.c, 0, this.c.length - this.e);
            System.arraycopy(this.d, 0, this.c, this.c.length - this.e, this.e);
        }
        return b2;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.e, bArr2, i2);
        return this.e;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.f.a() + "/OFB" + (this.e * 8);
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
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
        if (bArrA.length < this.b.length) {
            System.arraycopy(bArrA, 0, this.b, this.b.length - bArrA.length, bArrA.length);
            for (int i = 0; i < this.b.length - bArrA.length; i++) {
                this.b[i] = 0;
            }
        } else {
            System.arraycopy(bArrA, 0, this.b, 0, this.b.length);
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
        System.arraycopy(this.b, 0, this.c, 0, this.b.length);
        this.a = 0;
        this.f.c();
    }
}
