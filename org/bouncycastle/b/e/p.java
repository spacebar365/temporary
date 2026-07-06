package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {
    private int[] a = null;
    private int[] b = null;
    private int[] c = null;
    private boolean d;

    @Override // org.bouncycastle.b.e.o, org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.a == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.d) {
            a(this.a, bArr, i, bArr3, 0);
            a(this.b, bArr3, 0, bArr3, 0);
            a(this.c, bArr3, 0, bArr2, i2);
        } else {
            a(this.c, bArr, i, bArr3, 0);
            a(this.b, bArr3, 0, bArr3, 0);
            a(this.a, bArr3, 0, bArr2, i2);
        }
        return 8;
    }

    @Override // org.bouncycastle.b.e.o, org.bouncycastle.b.e
    public final String a() {
        return "DESede";
    }

    @Override // org.bouncycastle.b.e.o, org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + iVar.getClass().getName());
        }
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        if (bArrA.length != 24 && bArrA.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.d = z;
        byte[] bArr = new byte[8];
        System.arraycopy(bArrA, 0, bArr, 0, 8);
        this.a = a(z, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArrA, 8, bArr2, 0, 8);
        this.b = a(!z, bArr2);
        if (bArrA.length != 24) {
            this.c = this.a;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArrA, 16, bArr3, 0, 8);
        this.c = a(z, bArr3);
    }

    @Override // org.bouncycastle.b.e.o, org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e.o, org.bouncycastle.b.e
    public final void c() {
    }
}
