package org.bouncycastle.b.e;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s implements org.bouncycastle.b.ap {
    private boolean a;
    private r b;
    private byte[] c;
    private byte[] e;
    private byte[] f;
    private ArrayList<byte[]> g = new ArrayList<>();
    private byte[] d = new byte[4];

    public s(int i) {
        this.b = new r(i);
        this.c = new byte[this.b.b() / 2];
        this.e = new byte[this.b.b()];
        this.f = new byte[this.b.b()];
    }

    private static void a(int i, byte[] bArr) {
        bArr[3] = (byte) (i >> 24);
        bArr[2] = (byte) (i >> 16);
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) i;
    }

    @Override // org.bouncycastle.b.ap
    public final String a() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (iVar instanceof org.bouncycastle.b.k.bf) {
            iVar = ((org.bouncycastle.b.k.bf) iVar).b();
        }
        this.a = z;
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
        }
        this.b.a(z, iVar);
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] a(byte[] bArr, int i) {
        if (!this.a) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i % this.b.b() != 0) {
            throw new org.bouncycastle.b.o("wrap data must be a multiple of " + this.b.b() + " bytes");
        }
        if (i + 0 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        int iB = ((i / this.b.b()) + 1) * 2;
        int i2 = (iB - 1) * 6;
        byte[] bArr2 = new byte[this.b.b() + i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        System.arraycopy(bArr2, 0, this.c, 0, this.b.b() / 2);
        this.g.clear();
        int length = bArr2.length - (this.b.b() / 2);
        int iB2 = this.b.b() / 2;
        while (length != 0) {
            byte[] bArr3 = new byte[this.b.b() / 2];
            System.arraycopy(bArr2, iB2, bArr3, 0, this.b.b() / 2);
            this.g.add(bArr3);
            length -= this.b.b() / 2;
            iB2 += this.b.b() / 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(this.c, 0, bArr2, 0, this.b.b() / 2);
            System.arraycopy(this.g.get(0), 0, bArr2, this.b.b() / 2, this.b.b() / 2);
            this.b.a(bArr2, 0, bArr2, 0);
            a(i3 + 1, this.d);
            for (int i4 = 0; i4 < 4; i4++) {
                int iB3 = (this.b.b() / 2) + i4;
                bArr2[iB3] = (byte) (bArr2[iB3] ^ this.d[i4]);
            }
            System.arraycopy(bArr2, this.b.b() / 2, this.c, 0, this.b.b() / 2);
            for (int i5 = 2; i5 < iB; i5++) {
                System.arraycopy(this.g.get(i5 - 1), 0, this.g.get(i5 - 2), 0, this.b.b() / 2);
            }
            System.arraycopy(bArr2, 0, this.g.get(iB - 2), 0, this.b.b() / 2);
        }
        System.arraycopy(this.c, 0, bArr2, 0, this.b.b() / 2);
        int iB4 = this.b.b() / 2;
        for (int i6 = 0; i6 < iB - 1; i6++) {
            System.arraycopy(this.g.get(i6), 0, bArr2, iB4, this.b.b() / 2);
            iB4 += this.b.b() / 2;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.b.ap
    public final byte[] b(byte[] bArr, int i) throws org.bouncycastle.b.v {
        if (this.a) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i % this.b.b() != 0) {
            throw new org.bouncycastle.b.o("unwrap data must be a multiple of " + this.b.b() + " bytes");
        }
        int iB = (i * 2) / this.b.b();
        int i2 = (iB - 1) * 6;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[this.b.b() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, this.b.b() / 2);
        this.g.clear();
        int length = bArr2.length - (this.b.b() / 2);
        int iB2 = this.b.b() / 2;
        while (length != 0) {
            byte[] bArr4 = new byte[this.b.b() / 2];
            System.arraycopy(bArr2, iB2, bArr4, 0, this.b.b() / 2);
            this.g.add(bArr4);
            length -= this.b.b() / 2;
            iB2 += this.b.b() / 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(this.g.get(iB - 2), 0, bArr2, 0, this.b.b() / 2);
            System.arraycopy(bArr3, 0, bArr2, this.b.b() / 2, this.b.b() / 2);
            a(i2 - i3, this.d);
            for (int i4 = 0; i4 < 4; i4++) {
                int iB3 = (this.b.b() / 2) + i4;
                bArr2[iB3] = (byte) (bArr2[iB3] ^ this.d[i4]);
            }
            this.b.a(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, this.b.b() / 2);
            for (int i5 = 2; i5 < iB; i5++) {
                System.arraycopy(this.g.get((iB - i5) - 1), 0, this.g.get(iB - i5), 0, this.b.b() / 2);
            }
            System.arraycopy(bArr2, this.b.b() / 2, this.g.get(0), 0, this.b.b() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, this.b.b() / 2);
        int iB4 = this.b.b() / 2;
        for (int i6 = 0; i6 < iB - 1; i6++) {
            System.arraycopy(this.g.get(i6), 0, bArr2, iB4, this.b.b() / 2);
            iB4 += this.b.b() / 2;
        }
        System.arraycopy(bArr2, bArr2.length - this.b.b(), this.e, 0, this.b.b());
        byte[] bArr5 = new byte[bArr2.length - this.b.b()];
        if (!org.bouncycastle.f.a.a(this.e, this.f)) {
            throw new org.bouncycastle.b.v("checksum failed");
        }
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length - this.b.b());
        return bArr5;
    }
}
