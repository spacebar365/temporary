package org.bouncycastle.b.f;

import java.math.BigInteger;
import org.bouncycastle.b.k.ay;
import org.bouncycastle.b.k.ba;

/* JADX INFO: loaded from: classes.dex */
public final class t implements org.bouncycastle.b.aa {
    private static final BigInteger a = BigInteger.valueOf(2147483647L);
    private static final BigInteger b = BigInteger.valueOf(2);
    private final org.bouncycastle.b.z c;
    private final int d;
    private byte[] e;
    private byte[] f;
    private int g;
    private byte[] h;
    private int i;
    private byte[] j;

    public t(org.bouncycastle.b.z zVar) {
        this.c = zVar;
        this.d = zVar.b();
        this.j = new byte[this.d];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a() {
        int i = (this.i / this.d) + 1;
        switch (this.h.length) {
            case 1:
                this.h[this.h.length - 1] = (byte) i;
                this.c.a(this.e, 0, this.e.length);
                this.c.a(this.h, 0, this.h.length);
                this.c.a(this.f, 0, this.f.length);
                this.c.a(this.j, 0);
                return;
            case 2:
                this.h[this.h.length - 2] = (byte) (i >>> 8);
                this.h[this.h.length - 1] = (byte) i;
                this.c.a(this.e, 0, this.e.length);
                this.c.a(this.h, 0, this.h.length);
                this.c.a(this.f, 0, this.f.length);
                this.c.a(this.j, 0);
                return;
            case 3:
                this.h[this.h.length - 3] = (byte) (i >>> 16);
                this.h[this.h.length - 2] = (byte) (i >>> 8);
                this.h[this.h.length - 1] = (byte) i;
                this.c.a(this.e, 0, this.e.length);
                this.c.a(this.h, 0, this.h.length);
                this.c.a(this.f, 0, this.f.length);
                this.c.a(this.j, 0);
                return;
            case 4:
                this.h[0] = (byte) (i >>> 24);
                this.h[this.h.length - 3] = (byte) (i >>> 16);
                this.h[this.h.length - 2] = (byte) (i >>> 8);
                this.h[this.h.length - 1] = (byte) i;
                this.c.a(this.e, 0, this.e.length);
                this.c.a(this.h, 0, this.h.length);
                this.c.a(this.f, 0, this.f.length);
                this.c.a(this.j, 0);
                return;
            default:
                throw new IllegalStateException("Unsupported size of counter i");
        }
    }

    @Override // org.bouncycastle.b.p
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.i + i2;
        if (i3 < 0 || i3 >= this.g) {
            throw new org.bouncycastle.b.o("Current KDFCTR may only be used for " + this.g + " bytes");
        }
        if (this.i % this.d == 0) {
            a();
        }
        int i4 = this.i % this.d;
        int iMin = Math.min(this.d - (this.i % this.d), i2);
        System.arraycopy(this.j, i4, bArr, 0, iMin);
        this.i += iMin;
        int i5 = i2 - iMin;
        int i6 = iMin + 0;
        while (i5 > 0) {
            a();
            int iMin2 = Math.min(this.d, i5);
            System.arraycopy(this.j, 0, bArr, i6, iMin2);
            this.i += iMin2;
            i5 -= iMin2;
            i6 += iMin2;
        }
        return i2;
    }

    @Override // org.bouncycastle.b.p
    public final void a(org.bouncycastle.b.q qVar) {
        if (!(qVar instanceof ay)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        ay ayVar = (ay) qVar;
        this.c.a(new ba(ayVar.a()));
        this.e = ayVar.b();
        this.f = ayVar.c();
        int iD = ayVar.d();
        this.h = new byte[iD / 8];
        BigInteger bigIntegerMultiply = b.pow(iD).multiply(BigInteger.valueOf(this.d));
        this.g = bigIntegerMultiply.compareTo(a) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.i = 0;
    }
}
