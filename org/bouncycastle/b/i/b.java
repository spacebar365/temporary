package org.bouncycastle.b.i;

import org.bouncycastle.b.k.be;

/* JADX INFO: loaded from: classes.dex */
public final class b implements org.bouncycastle.b.e {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;
    private org.bouncycastle.b.e e;
    private boolean f;

    public b(org.bouncycastle.b.e eVar) {
        this.e = null;
        this.e = eVar;
        this.d = eVar.b();
        this.a = new byte[this.d];
        this.b = new byte[this.d];
        this.c = new byte[this.d];
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return this.e.a() + "/CBC";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        boolean z2 = this.f;
        this.f = z;
        if (!(iVar instanceof be)) {
            c();
            if (iVar != null) {
                this.e.a(z, iVar);
                return;
            } else {
                if (z2 != z) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        be beVar = (be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA.length != this.d) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(bArrA, 0, this.a, 0, bArrA.length);
        c();
        if (beVar.b() != null) {
            this.e.a(z, beVar.b());
        } else if (z2 != z) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.e.b();
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
        System.arraycopy(this.a, 0, this.b, 0, this.a.length);
        org.bouncycastle.f.a.a(this.c, (byte) 0);
        this.e.c();
    }

    public final org.bouncycastle.b.e d() {
        return this.e;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f) {
            if (this.d + i > bArr.length) {
                throw new org.bouncycastle.b.o("input buffer too short");
            }
            for (int i3 = 0; i3 < this.d; i3++) {
                byte[] bArr3 = this.b;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int iA = this.e.a(this.b, 0, bArr2, i2);
            System.arraycopy(bArr2, i2, this.b, 0, this.b.length);
            return iA;
        }
        if (this.d + i > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        System.arraycopy(bArr, i, this.c, 0, this.d);
        int iA2 = this.e.a(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < this.d; i4++) {
            int i5 = i2 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ this.b[i4]);
        }
        byte[] bArr4 = this.b;
        this.b = this.c;
        this.c = bArr4;
        return iA2;
    }
}
