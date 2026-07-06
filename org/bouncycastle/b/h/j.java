package org.bouncycastle.b.h;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
final class j {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d = 1;
    private org.bouncycastle.b.e e;

    public j(org.bouncycastle.b.e eVar) {
        this.e = null;
        this.e = eVar;
        this.a = new byte[eVar.b()];
        this.b = new byte[eVar.b()];
        this.c = new byte[eVar.b()];
    }

    public final int a(byte[] bArr, int i, byte[] bArr2) {
        if (this.d + i > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (this.d + 0 > bArr2.length) {
            throw new ac("output buffer too short");
        }
        this.e.a(this.b, 0, this.c, 0);
        for (int i2 = 0; i2 < this.d; i2++) {
            bArr2[i2 + 0] = (byte) (this.c[i2] ^ bArr[i + i2]);
        }
        System.arraycopy(this.b, this.d, this.b, 0, this.b.length - this.d);
        System.arraycopy(bArr2, 0, this.b, this.b.length - this.d, this.d);
        return this.d;
    }

    public final String a() {
        return this.e.a() + "/CFB" + (this.d * 8);
    }

    public final void a(org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof be)) {
            c();
            this.e.a(true, iVar);
            return;
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA.length < this.a.length) {
            System.arraycopy(bArrA, 0, this.a, this.a.length - bArrA.length, bArrA.length);
        } else {
            System.arraycopy(bArrA, 0, this.a, 0, this.a.length);
        }
        c();
        this.e.a(true, beVar.b());
    }

    final void a(byte[] bArr) {
        this.e.a(this.b, 0, bArr, 0);
    }

    public final int b() {
        return this.d;
    }

    public final void c() {
        System.arraycopy(this.a, 0, this.b, 0, this.a.length);
        this.e.c();
    }
}
