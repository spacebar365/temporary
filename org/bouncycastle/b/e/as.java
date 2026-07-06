package org.bouncycastle.b.e;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class as {
    private final org.bouncycastle.b.r a;
    private boolean b;
    private org.bouncycastle.b.k.ab c;
    private org.bouncycastle.b.k.y d;
    private int e;
    private SecureRandom f;

    public as() {
        this(new org.bouncycastle.b.b.aa());
    }

    public as(org.bouncycastle.b.r rVar) {
        this.a = rVar;
    }

    private void a(org.bouncycastle.b.r rVar, org.bouncycastle.d.a.g gVar) {
        byte[] bArrA = org.bouncycastle.f.b.a(this.e, gVar.a());
        rVar.a(bArrA, 0, bArrA.length);
    }

    private void a(org.bouncycastle.b.r rVar, org.bouncycastle.d.a.j jVar, byte[] bArr) {
        org.bouncycastle.f.e eVarE;
        org.bouncycastle.f.e eVar;
        int iB = rVar.b();
        byte[] bArr2 = new byte[Math.max(4, iB)];
        if (rVar instanceof org.bouncycastle.f.e) {
            a(rVar, jVar.g());
            a(rVar, jVar.h());
            org.bouncycastle.f.e eVar2 = (org.bouncycastle.f.e) rVar;
            eVarE = eVar2.e();
            eVar = eVar2;
        } else {
            eVarE = null;
            eVar = null;
        }
        int i = 0;
        int i2 = 0;
        while (i2 < bArr.length) {
            if (eVar != null) {
                eVar.a(eVarE);
            } else {
                a(rVar, jVar.g());
                a(rVar, jVar.h());
            }
            i++;
            org.bouncycastle.f.g.a(i, bArr2, 0);
            rVar.a(bArr2, 0, 4);
            rVar.a(bArr2, 0);
            int iMin = Math.min(iB, bArr.length - i2);
            a(bArr, bArr2, i2, iMin);
            i2 += iMin;
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            int i4 = i + i3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3]);
        }
    }

    public final int a(int i) {
        return (this.e * 2) + 1 + i + this.a.b();
    }

    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.b = z;
        if (z) {
            org.bouncycastle.b.k.bf bfVar = (org.bouncycastle.b.k.bf) iVar;
            this.c = (org.bouncycastle.b.k.ab) bfVar.b();
            this.d = this.c.b();
            if (((org.bouncycastle.b.k.ae) this.c).c().a(this.d.d()).p()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.f = bfVar.a();
        } else {
            this.c = (org.bouncycastle.b.k.ab) iVar;
            this.d = this.c.b();
        }
        this.e = (this.d.a().a() + 7) / 8;
    }

    public final byte[] a(byte[] bArr, int i) throws org.bouncycastle.b.v {
        BigInteger bigIntegerA;
        byte[] bArrA;
        org.bouncycastle.d.a.j jVarO;
        boolean z;
        if (!this.b) {
            byte[] bArr2 = new byte[(this.e * 2) + 1];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            org.bouncycastle.d.a.j jVarA = this.d.a().a(bArr2);
            if (jVarA.a(this.d.d()).p()) {
                throw new org.bouncycastle.b.v("[h]C1 at infinity");
            }
            org.bouncycastle.d.a.j jVarO2 = jVarA.a(((org.bouncycastle.b.k.ad) this.c).c()).o();
            byte[] bArr3 = new byte[(i - bArr2.length) - this.a.b()];
            System.arraycopy(bArr, bArr2.length + 0, bArr3, 0, bArr3.length);
            a(this.a, jVarO2, bArr3);
            byte[] bArr4 = new byte[this.a.b()];
            a(this.a, jVarO2.g());
            this.a.a(bArr3, 0, bArr3.length);
            a(this.a, jVarO2.h());
            this.a.a(bArr4, 0);
            int i2 = 0;
            for (int i3 = 0; i3 != bArr4.length; i3++) {
                i2 |= bArr4[i3] ^ bArr[((bArr2.length + 0) + bArr3.length) + i3];
            }
            org.bouncycastle.f.a.a(bArr2, (byte) 0);
            org.bouncycastle.f.a.a(bArr4, (byte) 0);
            if (i2 == 0) {
                return bArr3;
            }
            org.bouncycastle.f.a.a(bArr3, (byte) 0);
            throw new org.bouncycastle.b.v("invalid cipher text");
        }
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr, 0, bArr5, 0, bArr5.length);
        org.bouncycastle.d.a.m mVar = new org.bouncycastle.d.a.m();
        do {
            int iBitLength = this.d.c().bitLength();
            while (true) {
                bigIntegerA = org.bouncycastle.f.b.a(iBitLength, this.f);
                if (!bigIntegerA.equals(org.bouncycastle.d.a.c.c) && bigIntegerA.compareTo(this.d.c()) < 0) {
                    break;
                }
            }
            bArrA = mVar.a(this.d.b(), bigIntegerA).o().a(false);
            jVarO = ((org.bouncycastle.b.k.ae) this.c).c().a(bigIntegerA).o();
            a(this.a, jVarO, bArr5);
            int i4 = 0;
            while (true) {
                if (i4 == bArr5.length) {
                    z = true;
                    break;
                }
                if (bArr5[i4] != bArr[0]) {
                    z = false;
                    break;
                }
                i4++;
            }
        } while (z);
        byte[] bArr6 = new byte[this.a.b()];
        a(this.a, jVarO.g());
        this.a.a(bArr, 0, i);
        a(this.a, jVarO.h());
        this.a.a(bArr6, 0);
        return org.bouncycastle.f.a.a(bArrA, bArr5, bArr6);
    }
}
