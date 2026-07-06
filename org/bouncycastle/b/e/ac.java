package org.bouncycastle.b.e;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ac {
    org.bouncycastle.b.d a;
    org.bouncycastle.b.p b;
    org.bouncycastle.b.z c;
    org.bouncycastle.b.f d;
    byte[] e;
    boolean f;
    org.bouncycastle.b.i g;
    org.bouncycastle.b.i h;
    org.bouncycastle.b.k.av i;
    byte[] j;
    private org.bouncycastle.b.f.q k;
    private org.bouncycastle.b.y l;
    private byte[] m;

    public ac(org.bouncycastle.b.d dVar, org.bouncycastle.b.p pVar, org.bouncycastle.b.z zVar) {
        this.a = dVar;
        this.b = pVar;
        this.c = zVar;
        this.e = new byte[zVar.b()];
        this.d = null;
    }

    public ac(org.bouncycastle.b.d dVar, org.bouncycastle.b.p pVar, org.bouncycastle.b.z zVar, org.bouncycastle.b.f fVar) {
        this.a = dVar;
        this.b = pVar;
        this.c = zVar;
        this.e = new byte[zVar.b()];
        this.d = fVar;
    }

    private void a(org.bouncycastle.b.i iVar) {
        if (iVar instanceof org.bouncycastle.b.k.be) {
            this.m = ((org.bouncycastle.b.k.be) iVar).a();
            this.i = (org.bouncycastle.b.k.av) ((org.bouncycastle.b.k.be) iVar).b();
        } else {
            this.m = null;
            this.i = (org.bouncycastle.b.k.av) iVar;
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            org.bouncycastle.f.g.a(((long) bArr.length) * 8, bArr2, 0);
        }
        return bArr2;
    }

    private byte[] b(byte[] bArr, int i) {
        byte[] bArr2;
        byte[] bArr3;
        if (this.d == null) {
            byte[] bArr4 = new byte[i];
            bArr3 = new byte[this.i.c() / 8];
            byte[] bArr5 = new byte[bArr4.length + bArr3.length];
            this.b.a(bArr5, 0, bArr5.length);
            if (this.j.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, bArr3.length);
                System.arraycopy(bArr5, bArr3.length, bArr4, 0, bArr4.length);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, bArr4.length);
                System.arraycopy(bArr5, i, bArr3, 0, bArr3.length);
            }
            bArr2 = new byte[i];
            for (int i2 = 0; i2 != i; i2++) {
                bArr2[i2] = (byte) (bArr[i2 + 0] ^ bArr4[i2]);
            }
        } else {
            byte[] bArr6 = new byte[((org.bouncycastle.b.k.aw) this.i).d() / 8];
            byte[] bArr7 = new byte[this.i.c() / 8];
            byte[] bArr8 = new byte[bArr6.length + bArr7.length];
            this.b.a(bArr8, 0, bArr8.length);
            System.arraycopy(bArr8, 0, bArr6, 0, bArr6.length);
            System.arraycopy(bArr8, bArr6.length, bArr7, 0, bArr7.length);
            if (this.m != null) {
                this.d.a(true, (org.bouncycastle.b.i) new org.bouncycastle.b.k.be(new org.bouncycastle.b.k.ba(bArr6), this.m));
            } else {
                this.d.a(true, (org.bouncycastle.b.i) new org.bouncycastle.b.k.ba(bArr6));
            }
            bArr2 = new byte[this.d.b(i)];
            int iA = this.d.a(bArr, 0, i, bArr2, 0);
            i = iA + this.d.a(bArr2, iA);
            bArr3 = bArr7;
        }
        byte[] bArrB = this.i.b();
        byte[] bArrA = this.j.length != 0 ? a(bArrB) : null;
        byte[] bArr9 = new byte[this.c.b()];
        this.c.a(new org.bouncycastle.b.k.ba(bArr3));
        this.c.a(bArr2, 0, bArr2.length);
        if (bArrB != null) {
            this.c.a(bArrB, 0, bArrB.length);
        }
        if (this.j.length != 0) {
            this.c.a(bArrA, 0, bArrA.length);
        }
        this.c.a(bArr9, 0);
        byte[] bArr10 = new byte[this.j.length + i + bArr9.length];
        System.arraycopy(this.j, 0, bArr10, 0, this.j.length);
        System.arraycopy(bArr2, 0, bArr10, this.j.length, i);
        System.arraycopy(bArr9, 0, bArr10, this.j.length + i, bArr9.length);
        return bArr10;
    }

    private byte[] c(byte[] bArr, int i) throws org.bouncycastle.b.v {
        byte[] bArr2;
        int iA;
        byte[] bArr3;
        if (i < this.j.length + this.c.b()) {
            throw new org.bouncycastle.b.v("Length of input must be greater than the MAC and V combined");
        }
        if (this.d == null) {
            byte[] bArr4 = new byte[(i - this.j.length) - this.c.b()];
            bArr3 = new byte[this.i.c() / 8];
            byte[] bArr5 = new byte[bArr4.length + bArr3.length];
            this.b.a(bArr5, 0, bArr5.length);
            if (this.j.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, bArr3.length);
                System.arraycopy(bArr5, bArr3.length, bArr4, 0, bArr4.length);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, bArr4.length);
                System.arraycopy(bArr5, bArr4.length, bArr3, 0, bArr3.length);
            }
            bArr2 = new byte[bArr4.length];
            for (int i2 = 0; i2 != bArr4.length; i2++) {
                bArr2[i2] = (byte) (bArr[(this.j.length + 0) + i2] ^ bArr4[i2]);
            }
            iA = 0;
        } else {
            byte[] bArr6 = new byte[((org.bouncycastle.b.k.aw) this.i).d() / 8];
            byte[] bArr7 = new byte[this.i.c() / 8];
            byte[] bArr8 = new byte[bArr6.length + bArr7.length];
            this.b.a(bArr8, 0, bArr8.length);
            System.arraycopy(bArr8, 0, bArr6, 0, bArr6.length);
            System.arraycopy(bArr8, bArr6.length, bArr7, 0, bArr7.length);
            org.bouncycastle.b.k.ba baVar = new org.bouncycastle.b.k.ba(bArr6);
            this.d.a(false, this.m != null ? new org.bouncycastle.b.k.be(baVar, this.m) : baVar);
            bArr2 = new byte[this.d.b((i - this.j.length) - this.c.b())];
            iA = this.d.a(bArr, this.j.length + 0, (i - this.j.length) - this.c.b(), bArr2, 0);
            bArr3 = bArr7;
        }
        byte[] bArrB = this.i.b();
        byte[] bArrA = this.j.length != 0 ? a(bArrB) : null;
        int i3 = i + 0;
        byte[] bArrC = org.bouncycastle.f.a.c(bArr, i3 - this.c.b(), i3);
        byte[] bArr9 = new byte[bArrC.length];
        this.c.a(new org.bouncycastle.b.k.ba(bArr3));
        this.c.a(bArr, this.j.length + 0, (i - this.j.length) - bArr9.length);
        if (bArrB != null) {
            this.c.a(bArrB, 0, bArrB.length);
        }
        if (this.j.length != 0) {
            this.c.a(bArrA, 0, bArrA.length);
        }
        this.c.a(bArr9, 0);
        if (org.bouncycastle.f.a.b(bArrC, bArr9)) {
            return this.d == null ? bArr2 : org.bouncycastle.f.a.c(bArr2, 0, iA + this.d.a(bArr2, iA));
        }
        throw new org.bouncycastle.b.v("invalid MAC");
    }

    public final org.bouncycastle.b.f a() {
        return this.d;
    }

    public final void a(org.bouncycastle.b.k.b bVar, org.bouncycastle.b.i iVar, org.bouncycastle.b.f.q qVar) {
        this.f = true;
        this.h = bVar;
        this.k = qVar;
        a(iVar);
    }

    public final void a(org.bouncycastle.b.k.b bVar, org.bouncycastle.b.i iVar, org.bouncycastle.b.y yVar) {
        this.f = false;
        this.g = bVar;
        this.l = yVar;
        a(iVar);
    }

    public final void a(boolean z, org.bouncycastle.b.i iVar, org.bouncycastle.b.i iVar2, org.bouncycastle.b.i iVar3) {
        this.f = z;
        this.g = iVar;
        this.h = iVar2;
        this.j = new byte[0];
        a(iVar3);
    }

    public final byte[] a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        if (this.f) {
            if (this.k != null) {
                org.bouncycastle.b.t tVarA = this.k.a();
                this.g = tVarA.a().b();
                this.j = tVarA.b();
            }
        } else if (this.l != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i);
            try {
                this.h = this.l.a(byteArrayInputStream);
                this.j = org.bouncycastle.f.a.c(bArr, 0, (i - byteArrayInputStream.available()) + 0);
            } catch (IOException e) {
                throw new org.bouncycastle.b.v("unable to recover ephemeral public key: " + e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                throw new org.bouncycastle.b.v("unable to recover ephemeral public key: " + e2.getMessage(), e2);
            }
        }
        this.a.a(this.g);
        byte[] bArrA = org.bouncycastle.f.b.a(this.a.a(), this.a.b(this.h));
        if (this.j.length != 0) {
            byte[] bArrD = org.bouncycastle.f.a.d(this.j, bArrA);
            org.bouncycastle.f.a.a(bArrA, (byte) 0);
            bArrA = bArrD;
        }
        try {
            this.b.a(new org.bouncycastle.b.k.az(bArrA, this.i.a()));
            return this.f ? b(bArr, i) : c(bArr, i);
        } finally {
            org.bouncycastle.f.a.a(bArrA, (byte) 0);
        }
    }

    public final org.bouncycastle.b.z b() {
        return this.c;
    }
}
