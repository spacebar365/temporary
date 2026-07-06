package org.bouncycastle.b.e;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class ak implements org.bouncycastle.b.ap {
    private org.bouncycastle.b.i.b a;
    private org.bouncycastle.b.k.be b;
    private boolean c;
    private SecureRandom d;

    public ak(org.bouncycastle.b.e eVar) {
        this.a = new org.bouncycastle.b.i.b(eVar);
    }

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return this.a.d().a() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.c = z;
        if (iVar instanceof org.bouncycastle.b.k.bf) {
            org.bouncycastle.b.k.bf bfVar = (org.bouncycastle.b.k.bf) iVar;
            this.d = bfVar.a();
            if (!(bfVar.b() instanceof org.bouncycastle.b.k.be)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.b = (org.bouncycastle.b.k.be) bfVar.b();
            return;
        }
        if (z) {
            this.d = org.bouncycastle.b.l.a();
        }
        if (!(iVar instanceof org.bouncycastle.b.k.be)) {
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.b = (org.bouncycastle.b.k.be) iVar;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i) {
        if (!this.c) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i > 255 || i < 0) {
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        }
        this.a.a(true, this.b);
        int iB = this.a.b();
        byte[] bArr2 = new byte[i + 4 < iB * 2 ? iB * 2 : (i + 4) % iB == 0 ? i + 4 : (((i + 4) / iB) + 1) * iB];
        bArr2[0] = (byte) i;
        System.arraycopy(bArr, 0, bArr2, 4, i);
        byte[] bArr3 = new byte[bArr2.length - (i + 4)];
        this.d.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i + 4, bArr3.length);
        bArr2[1] = (byte) (bArr2[4] ^ (-1));
        bArr2[2] = (byte) (bArr2[5] ^ (-1));
        bArr2[3] = (byte) (bArr2[6] ^ (-1));
        for (int i2 = 0; i2 < bArr2.length; i2 += iB) {
            this.a.a(bArr2, i2, bArr2, i2);
        }
        for (int i3 = 0; i3 < bArr2.length; i3 += iB) {
            this.a.a(bArr2, i3, bArr2, i3);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i) throws org.bouncycastle.b.v {
        if (this.c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int iB = this.a.b();
        if (i < iB * 2) {
            throw new org.bouncycastle.b.v("input too short");
        }
        byte[] bArr2 = new byte[i];
        byte[] bArr3 = new byte[iB];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(bArr, 0, bArr3, 0, bArr3.length);
        this.a.a(false, new org.bouncycastle.b.k.be(this.b.b(), bArr3));
        for (int i2 = iB; i2 < bArr2.length; i2 += iB) {
            this.a.a(bArr2, i2, bArr2, i2);
        }
        System.arraycopy(bArr2, bArr2.length - bArr3.length, bArr3, 0, bArr3.length);
        this.a.a(false, new org.bouncycastle.b.k.be(this.b.b(), bArr3));
        this.a.a(bArr2, 0, bArr2, 0);
        this.a.a(false, this.b);
        for (int i3 = 0; i3 < bArr2.length; i3 += iB) {
            this.a.a(bArr2, i3, bArr2, i3);
        }
        boolean z = (bArr2[0] & 255) > bArr2.length + (-4);
        byte[] bArr4 = z ? new byte[bArr2.length - 4] : new byte[bArr2[0] & 255];
        System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
        int i4 = 0;
        for (int i5 = 0; i5 != 3; i5++) {
            i4 |= ((byte) (bArr2[i5 + 1] ^ (-1))) ^ bArr2[i5 + 4];
        }
        org.bouncycastle.f.a.d(bArr2);
        if ((i4 != 0) || z) {
            throw new org.bouncycastle.b.v("wrapped key corrupted");
        }
        return bArr4;
    }
}
