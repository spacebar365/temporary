package org.bouncycastle.b.a.a;

import org.bouncycastle.b.ac;
import org.bouncycastle.b.k.az;
import org.bouncycastle.b.p;
import org.bouncycastle.b.q;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p {
    private r a;
    private byte[] b;
    private byte[] c;
    private int d;

    public a(r rVar) {
        this.a = rVar;
        this.d = rVar.b();
    }

    private static void a(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    @Override // org.bouncycastle.b.p
    public final int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (bArr.length - i2 < 0) {
            throw new ac("output buffer too small");
        }
        byte[] bArr2 = new byte[this.d];
        byte[] bArr3 = new byte[4];
        int i5 = 1;
        this.a.c();
        if (i2 > this.d) {
            i3 = 0;
            while (true) {
                a(i5, bArr3);
                this.a.a(bArr3, 0, 4);
                this.a.a(this.b, 0, this.b.length);
                this.a.a(this.c, 0, this.c.length);
                this.a.a(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i3 + 0, this.d);
                i3 += this.d;
                i4 = i5 + 1;
                if (i5 >= i2 / this.d) {
                    break;
                }
                i5 = i4;
            }
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (i3 < i2) {
            a(i4, bArr3);
            this.a.a(bArr3, 0, 4);
            this.a.a(this.b, 0, this.b.length);
            this.a.a(this.c, 0, this.c.length);
            this.a.a(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i3 + 0, i2 - i3);
        }
        return i2;
    }

    @Override // org.bouncycastle.b.p
    public final void a(q qVar) {
        if (!(qVar instanceof az)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
        az azVar = (az) qVar;
        this.b = azVar.a();
        this.c = azVar.b();
    }
}
