package org.bouncycastle.b.i;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.an;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class p extends an {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private boolean e;
    private org.bouncycastle.b.e f;

    public p(org.bouncycastle.b.e eVar) {
        super(eVar);
        this.f = eVar;
        this.a = new byte[eVar.b()];
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length - i < b()) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (bArr2.length - i2 < b()) {
            throw new ac("output buffer too short");
        }
        a(bArr, i, b(), bArr2, i2);
        return b();
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return this.f.a() + "/KCTR";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.e = true;
        if (!(iVar instanceof be)) {
            throw new IllegalArgumentException("invalid parameter passed");
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        int length = this.a.length - bArrA.length;
        org.bouncycastle.f.a.a(this.a, (byte) 0);
        System.arraycopy(bArrA, 0, this.a, length, bArrA.length);
        org.bouncycastle.b.i iVarB = beVar.b();
        if (iVarB != null) {
            this.f.a(true, iVarB);
        }
        c();
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.f.b();
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        if (this.e) {
            this.f.a(this.a, 0, this.b, 0);
        }
        this.f.c();
        this.d = 0;
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.d != 0) {
            byte[] bArr = this.c;
            int i = this.d;
            this.d = i + 1;
            byte b2 = (byte) (bArr[i] ^ b);
            if (this.d != this.b.length) {
                return b2;
            }
            this.d = 0;
            return b2;
        }
        int i2 = 0;
        while (i2 < this.b.length) {
            byte[] bArr2 = this.b;
            int i3 = i2 + 1;
            byte b3 = (byte) (bArr2[i2] + 1);
            bArr2[i2] = b3;
            if (b3 != 0) {
                break;
            }
            i2 = i3;
        }
        this.f.a(this.b, 0, this.c, 0);
        byte[] bArr3 = this.c;
        int i4 = this.d;
        this.d = i4 + 1;
        return (byte) (bArr3[i4] ^ b);
    }
}
