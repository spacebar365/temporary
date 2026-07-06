package org.bouncycastle.b.n;

import java.math.BigInteger;
import org.bouncycastle.b.ak;
import org.bouncycastle.b.b.aa;
import org.bouncycastle.b.k.ab;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bd;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ak, org.bouncycastle.d.a.c {
    private final b a;
    private final aa b;
    private final a i;
    private y j;
    private org.bouncycastle.d.a.j k;
    private ab l;
    private byte[] m;

    public r() {
        this(s.a);
    }

    private r(a aVar) {
        this.a = new q();
        this.b = new aa();
        this.i = aVar;
    }

    private static void a(org.bouncycastle.b.r rVar, org.bouncycastle.d.a.g gVar) {
        byte[] bArrL = gVar.l();
        rVar.a(bArrL, 0, bArrL.length);
    }

    private static BigInteger b(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    private void b() {
        this.b.c();
        if (this.m != null) {
            this.b.a(this.m, 0, this.m.length);
        }
    }

    private byte[] c() {
        byte[] bArr = new byte[this.b.b()];
        this.b.a(bArr, 0);
        b();
        return bArr;
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte b) {
        this.b.a(b);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(byte[] bArr, int i, int i2) {
        this.b.a(bArr, i, i2);
    }

    @Override // org.bouncycastle.b.ak
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        byte[] bArrA;
        if (iVar instanceof bd) {
            iVarB = ((bd) iVar).b();
            bArrA = ((bd) iVar).a();
        } else {
            iVarB = iVar;
            bArrA = org.bouncycastle.f.a.f.a("31323334353637383132333435363738");
        }
        if (z) {
            if (iVarB instanceof bf) {
                bf bfVar = (bf) iVarB;
                this.l = (ab) bfVar.b();
                this.j = this.l.b();
                this.a.a(this.j.c(), bfVar.a());
            } else {
                this.l = (ab) iVarB;
                this.j = this.l.b();
                this.a.a(this.j.c(), org.bouncycastle.b.l.a());
            }
            this.k = new org.bouncycastle.d.a.m().a(this.j.b(), ((ad) this.l).c()).o();
        } else {
            this.l = (ab) iVarB;
            this.j = this.l.b();
            this.k = ((ae) this.l).c();
        }
        this.b.c();
        aa aaVar = this.b;
        int length = bArrA.length * 8;
        aaVar.a((byte) ((length >> 8) & 255));
        aaVar.a((byte) (length & 255));
        aaVar.a(bArrA, 0, bArrA.length);
        a(this.b, this.j.a().g());
        a(this.b, this.j.a().h());
        a(this.b, this.j.b().g());
        a(this.b, this.j.b().h());
        a(this.b, this.k.g());
        a(this.b, this.k.h());
        byte[] bArr = new byte[this.b.b()];
        this.b.a(bArr, 0);
        this.m = bArr;
        this.b.a(this.m, 0, this.m.length);
    }

    @Override // org.bouncycastle.b.ak
    public final boolean a(byte[] bArr) {
        try {
            BigInteger[] bigIntegerArrA = this.i.a(this.j.c(), bArr);
            BigInteger bigInteger = bigIntegerArrA[0];
            BigInteger bigInteger2 = bigIntegerArrA[1];
            BigInteger bigIntegerC = this.j.c();
            if (bigInteger.compareTo(d) < 0 || bigInteger.compareTo(bigIntegerC) >= 0) {
                return false;
            }
            if (bigInteger2.compareTo(d) < 0 || bigInteger2.compareTo(bigIntegerC) >= 0) {
                return false;
            }
            BigInteger bigIntegerB = b(c());
            BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(bigIntegerC);
            if (bigIntegerMod.equals(c)) {
                return false;
            }
            org.bouncycastle.d.a.j jVarO = org.bouncycastle.d.a.b.a(this.j.b(), bigInteger2, ((ae) this.l).c(), bigIntegerMod).o();
            if (jVarO.p()) {
                return false;
            }
            return bigIntegerB.add(jVarO.g().a()).mod(bigIntegerC).equals(bigInteger);
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.b.ak
    public final byte[] a() throws org.bouncycastle.b.j {
        byte[] bArrC = c();
        BigInteger bigIntegerC = this.j.c();
        BigInteger bigIntegerB = b(bArrC);
        BigInteger bigIntegerC2 = ((ad) this.l).c();
        org.bouncycastle.d.a.m mVar = new org.bouncycastle.d.a.m();
        while (true) {
            BigInteger bigIntegerB2 = this.a.b();
            BigInteger bigIntegerMod = bigIntegerB.add(mVar.a(this.j.b(), bigIntegerB2).o().g().a()).mod(bigIntegerC);
            if (!bigIntegerMod.equals(c) && !bigIntegerMod.add(bigIntegerB2).equals(bigIntegerC)) {
                BigInteger bigIntegerMod2 = bigIntegerC2.add(d).modInverse(bigIntegerC).multiply(bigIntegerB2.subtract(bigIntegerMod.multiply(bigIntegerC2)).mod(bigIntegerC)).mod(bigIntegerC);
                if (!bigIntegerMod2.equals(c)) {
                    try {
                        return this.i.a(this.j.c(), bigIntegerMod, bigIntegerMod2);
                    } catch (Exception e) {
                        throw new org.bouncycastle.b.j("unable to encode signature: " + e.getMessage(), e);
                    }
                }
            }
        }
    }
}
