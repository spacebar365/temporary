package org.bouncycastle.b.f;

import org.bouncycastle.b.k.ax;
import org.bouncycastle.b.k.az;

/* JADX INFO: loaded from: classes.dex */
public class a implements org.bouncycastle.b.s {
    private int a = 1;
    private org.bouncycastle.b.r b;
    private byte[] c;
    private byte[] d;

    protected a(org.bouncycastle.b.r rVar) {
        this.b = rVar;
    }

    @Override // org.bouncycastle.b.p
    public final int a(byte[] bArr, int i, int i2) {
        if (bArr.length - i2 < 0) {
            throw new org.bouncycastle.b.ac("output buffer too small");
        }
        long j = i2;
        int iB = this.b.b();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        int i3 = (int) (((((long) iB) + j) - 1) / ((long) iB));
        byte[] bArr2 = new byte[this.b.b()];
        byte[] bArr3 = new byte[4];
        org.bouncycastle.f.g.a(this.a, bArr3, 0);
        int i4 = this.a & (-256);
        int i5 = i2;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            this.b.a(this.c, 0, this.c.length);
            this.b.a(bArr3, 0, 4);
            if (this.d != null) {
                this.b.a(this.d, 0, this.d.length);
            }
            this.b.a(bArr2, 0);
            if (i5 > iB) {
                System.arraycopy(bArr2, 0, bArr, i6, iB);
                i6 += iB;
                i5 -= iB;
            } else {
                System.arraycopy(bArr2, 0, bArr, i6, i5);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i4 += 256;
                org.bouncycastle.f.g.a(i4, bArr3, 0);
            }
        }
        this.b.c();
        return (int) j;
    }

    @Override // org.bouncycastle.b.p
    public final void a(org.bouncycastle.b.q qVar) {
        if (qVar instanceof az) {
            az azVar = (az) qVar;
            this.c = azVar.a();
            this.d = azVar.b();
        } else {
            if (!(qVar instanceof ax)) {
                throw new IllegalArgumentException("KDF parameters required for generator");
            }
            this.c = ((ax) qVar).a();
            this.d = null;
        }
    }
}
