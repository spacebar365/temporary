package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static j a(d dVar, j jVar) {
        if (dVar.a(jVar.d())) {
            return dVar.a(jVar);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static j a(j jVar, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        j jVarE = jVar.d().e();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                jVarE = jVar;
            }
            for (int i = 1; i < iBitLength; i++) {
                jVar = jVar.t();
                if (bigIntegerAbs.testBit(i)) {
                    jVarE = jVarE.b(jVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? jVarE.s() : jVarE;
    }

    static j a(j jVar, BigInteger bigInteger, l lVar, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, aa.a(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        j jVarA = aa.a(jVar, iMax, lVar);
        z zVarA = aa.a(jVar);
        z zVarA2 = aa.a(jVarA);
        return a(z ? zVarA.b() : zVarA.a(), z ? zVarA.a() : zVarA.b(), aa.b(iMax, bigIntegerAbs), z2 ? zVarA2.b() : zVarA2.a(), z2 ? zVarA2.a() : zVarA2.b(), aa.b(iMax, bigIntegerAbs2));
    }

    private static j a(j[] jVarArr, j[] jVarArr2, byte[] bArr, j[] jVarArr3, j[] jVarArr4, byte[] bArr2) {
        j jVarB;
        int i;
        int iMax = Math.max(bArr.length, bArr2.length);
        j jVarE = jVarArr[0].d().e();
        int i2 = 0;
        j jVarD = jVarE;
        int i3 = iMax - 1;
        while (i3 >= 0) {
            byte b = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b2 = i3 < bArr2.length ? bArr2[i3] : (byte) 0;
            if ((b | b2) == 0) {
                i = i2 + 1;
            } else {
                if (b != 0) {
                    jVarB = jVarE.b((b < 0 ? jVarArr2 : jVarArr)[Math.abs((int) b) >>> 1]);
                } else {
                    jVarB = jVarE;
                }
                if (b2 != 0) {
                    jVarB = jVarB.b((b2 < 0 ? jVarArr4 : jVarArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    i = 0;
                    jVarD = jVarD.b(i2);
                } else {
                    i = i2;
                }
                jVarD = jVarD.d(jVarB);
            }
            i2 = i;
            i3--;
        }
        return i2 > 0 ? jVarD.b(i2) : jVarD;
    }

    public static void a(g[] gVarArr, int i, g gVar) {
        g[] gVarArr2 = new g[i];
        gVarArr2[0] = gVarArr[0];
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= i) {
                break;
            } else {
                gVarArr2[i2] = gVarArr2[i2 - 1].c(gVarArr[i2 + 0]);
            }
        }
        int i3 = i2 - 1;
        if (gVar != null) {
            gVarArr2[i3] = gVarArr2[i3].c(gVar);
        }
        g gVarF = gVarArr2[i3].f();
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = i3 + 0;
            g gVar2 = gVarArr[i5];
            gVarArr[i5] = gVarArr2[i4].c(gVarF);
            gVarF = gVarF.c(gVar2);
            i3 = i4;
        }
        gVarArr[0] = gVarF;
    }

    public static boolean a(org.bouncycastle.d.b.b bVar) {
        return bVar.b() > 1 && bVar.a().equals(c.e) && (bVar instanceof org.bouncycastle.d.b.g);
    }

    public static j b(d dVar, j jVar) {
        if (dVar.a(jVar.d())) {
            return dVar.a(jVar.a(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean b(org.bouncycastle.d.b.b bVar) {
        return bVar.b() == 1;
    }

    public static j a(j jVar, BigInteger bigInteger, j jVar2, BigInteger bigInteger2) {
        int i;
        j jVarB;
        d dVarD = jVar.d();
        j jVarA = a(dVarD, jVar2);
        if ((dVarD instanceof d$a) && ((d$a) dVarD).o()) {
            return a(jVar.a(bigInteger).b(jVarA.a(bigInteger2)));
        }
        org.bouncycastle.d.a.b.a aVarL = dVarD.l();
        if (!(aVarL instanceof org.bouncycastle.d.a.b.b)) {
            boolean z = bigInteger.signum() < 0;
            boolean z2 = bigInteger2.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMax = Math.max(2, Math.min(16, aa.a(bigIntegerAbs.bitLength())));
            int iMax2 = Math.max(2, Math.min(16, aa.a(bigIntegerAbs2.bitLength())));
            z zVarA = aa.a(jVar, iMax);
            z zVarA2 = aa.a(jVarA, iMax2);
            return a(a(z ? zVarA.b() : zVarA.a(), z ? zVarA.a() : zVarA.b(), aa.b(iMax, bigIntegerAbs), z2 ? zVarA2.b() : zVarA2.a(), z2 ? zVarA2.a() : zVarA2.b(), aa.b(iMax2, bigIntegerAbs2)));
        }
        j[] jVarArr = {jVar, jVarA};
        BigInteger[] bigIntegerArr = {bigInteger, bigInteger2};
        org.bouncycastle.d.a.b.b bVar = (org.bouncycastle.d.a.b.b) aVarL;
        BigInteger bigIntegerI = jVarArr[0].d().i();
        BigInteger[] bigIntegerArr2 = new BigInteger[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            BigInteger[] bigIntegerArrA = bVar.a(bigIntegerArr[i3].mod(bigIntegerI));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = bigIntegerArrA[0];
            i2 = i4 + 1;
            bigIntegerArr2[i4] = bigIntegerArrA[1];
        }
        l lVarA = bVar.a();
        boolean[] zArr = new boolean[4];
        z[] zVarArr = new z[4];
        byte[][] bArr = new byte[4][];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= 2) {
                break;
            }
            int i7 = i6 << 1;
            int i8 = i7 + 1;
            BigInteger bigInteger3 = bigIntegerArr2[i7];
            zArr[i7] = bigInteger3.signum() < 0;
            BigInteger bigIntegerAbs3 = bigInteger3.abs();
            BigInteger bigInteger4 = bigIntegerArr2[i8];
            zArr[i8] = bigInteger4.signum() < 0;
            BigInteger bigIntegerAbs4 = bigInteger4.abs();
            int iMax3 = Math.max(2, Math.min(16, aa.a(Math.max(bigIntegerAbs3.bitLength(), bigIntegerAbs4.bitLength()))));
            j jVar3 = jVarArr[i6];
            j jVarA2 = aa.a(jVar3, iMax3, lVarA);
            zVarArr[i7] = aa.a(jVar3);
            zVarArr[i8] = aa.a(jVarA2);
            bArr[i7] = aa.b(iMax3, bigIntegerAbs3);
            bArr[i8] = aa.b(iMax3, bigIntegerAbs4);
            i5 = i6 + 1;
        }
        int iMax4 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            iMax4 = Math.max(iMax4, bArr[i9].length);
        }
        j jVarE = zVarArr[0].a()[0].d().e();
        int i10 = 0;
        j jVarB2 = jVarE;
        int i11 = iMax4 - 1;
        while (i11 >= 0) {
            int i12 = 0;
            j jVar4 = jVarE;
            while (i12 < 4) {
                byte[] bArr2 = bArr[i12];
                byte b = i11 < bArr2.length ? bArr2[i11] : (byte) 0;
                if (b != 0) {
                    int iAbs = Math.abs((int) b);
                    z zVar = zVarArr[i12];
                    jVarB = jVar4.b(((b < 0) == zArr[i12] ? zVar.a() : zVar.b())[iAbs >>> 1]);
                } else {
                    jVarB = jVar4;
                }
                i12++;
                jVar4 = jVarB;
            }
            if (jVar4 == jVarE) {
                i = i10 + 1;
            } else {
                if (i10 > 0) {
                    i = 0;
                    jVarB2 = jVarB2.b(i10);
                } else {
                    i = i10;
                }
                jVarB2 = jVarB2.d(jVar4);
            }
            i10 = i;
            i11--;
        }
        if (i10 > 0) {
            jVarB2 = jVarB2.b(i10);
        }
        return a(jVarB2);
    }

    static j a(j jVar) {
        if (jVar.a(false, false)) {
            return jVar;
        }
        throw new IllegalStateException("Invalid result");
    }
}
