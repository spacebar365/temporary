package org.bouncycastle.b.m.a;

import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    private byte[] a;
    private byte[] b;
    private long c;
    private org.bouncycastle.b.m.d d;
    private z e;
    private int f;

    public a(z zVar, int i, org.bouncycastle.b.m.d dVar, byte[] bArr, byte[] bArr2) {
        if (i > d.a(zVar)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (dVar.b() < i) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f = i;
        this.d = dVar;
        this.e = zVar;
        byte[] bArrA = org.bouncycastle.f.a.a(b(), bArr2, bArr);
        this.a = new byte[zVar.b()];
        this.b = new byte[this.a.length];
        org.bouncycastle.f.a.a(this.b, (byte) 1);
        a(bArrA);
        this.c = 1L;
    }

    private void a(byte[] bArr) {
        a(bArr, (byte) 0);
        if (bArr != null) {
            a(bArr, (byte) 1);
        }
    }

    private void a(byte[] bArr, byte b) {
        this.e.a(new ba(this.a));
        this.e.a(this.b, 0, this.b.length);
        this.e.a(b);
        if (bArr != null) {
            this.e.a(bArr, 0, bArr.length);
        }
        this.e.a(this.a, 0);
        this.e.a(new ba(this.a));
        this.e.a(this.b, 0, this.b.length);
        this.e.a(this.b, 0);
    }

    private byte[] b() {
        byte[] bArrA = this.d.a();
        if (bArrA.length < (this.f + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        return bArrA;
    }

    @Override // org.bouncycastle.b.m.a.c
    public final int a(byte[] bArr, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.c > 140737488355328L) {
            return -1;
        }
        if (z) {
            a();
        }
        byte[] bArr2 = new byte[bArr.length];
        int length2 = bArr.length / this.b.length;
        this.e.a(new ba(this.a));
        for (int i = 0; i < length2; i++) {
            this.e.a(this.b, 0, this.b.length);
            this.e.a(this.b, 0);
            System.arraycopy(this.b, 0, bArr2, this.b.length * i, this.b.length);
        }
        if (this.b.length * length2 < bArr2.length) {
            this.e.a(this.b, 0, this.b.length);
            this.e.a(this.b, 0);
            System.arraycopy(this.b, 0, bArr2, this.b.length * length2, bArr2.length - (length2 * this.b.length));
        }
        a(null);
        this.c++;
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.b.m.a.c
    public final void a() {
        a(org.bouncycastle.f.a.d(b(), null));
        this.c = 1L;
    }
}
