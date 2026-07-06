package org.bouncycastle.b.n;

import java.math.BigInteger;
import org.bouncycastle.b.ak;
import org.bouncycastle.b.k.bm;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ak {
    private org.bouncycastle.b.r a;
    private org.bouncycastle.b.a b;
    private bm c;
    private int d;
    private int e;
    private byte[] f;

    private t(org.bouncycastle.b.a aVar, org.bouncycastle.b.r rVar) {
        this.b = aVar;
        this.a = rVar;
        Integer numA = n.a(rVar);
        if (numA == null) {
            throw new IllegalArgumentException("no valid trailer for digest: " + rVar.a());
        }
        this.d = numA.intValue();
    }

    public t(org.bouncycastle.b.a aVar, org.bouncycastle.b.r rVar, byte b) {
        this(aVar, rVar);
    }

    private void a(int i) {
        int length;
        int iB = this.a.b();
        if (i == 188) {
            length = (this.f.length - iB) - 1;
            this.a.a(this.f, length);
            this.f[this.f.length - 1] = -68;
        } else {
            length = (this.f.length - iB) - 2;
            this.a.a(this.f, length);
            this.f[this.f.length - 2] = (byte) (i >>> 8);
            this.f[this.f.length - 1] = (byte) i;
        }
        this.f[0] = 107;
        for (int i2 = length - 2; i2 != 0; i2--) {
            this.f[i2] = -69;
        }
        this.f[length - 1] = -70;
    }

    private static void b(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte b) {
        this.a.a(b);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.ak
    public final boolean a(byte[] bArr) {
        try {
            this.f = this.b.a(bArr, 0, bArr.length);
            BigInteger bigInteger = new BigInteger(1, this.f);
            if ((bigInteger.intValue() & 15) != 12) {
                bigInteger = this.c.b().subtract(bigInteger);
                if ((bigInteger.intValue() & 15) != 12) {
                    return false;
                }
            }
            a(this.d);
            byte[] bArrA = org.bouncycastle.f.b.a(this.f.length, bigInteger);
            boolean zB = org.bouncycastle.f.a.b(this.f, bArrA);
            if (this.d == 15052 && !zB) {
                this.f[this.f.length - 2] = 64;
                zB = org.bouncycastle.f.a.b(this.f, bArrA);
            }
            b(this.f);
            b(bArrA);
            return zB;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.b.ak
    public final byte[] a() {
        a(this.d);
        BigInteger bigInteger = new BigInteger(1, this.b.a(this.f, 0, this.f.length));
        b(this.f);
        return org.bouncycastle.f.b.a(org.bouncycastle.f.b.b(this.c.b()), bigInteger.min(this.c.b().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.b.ak
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.c = (bm) iVar;
        this.b.a(z, this.c);
        this.e = this.c.b().bitLength();
        this.f = new byte[(this.e + 7) / 8];
        this.a.c();
    }
}
