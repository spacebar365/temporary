package org.bouncycastle.b.o;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.m;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.s.s;
import org.bouncycastle.a.x;
import org.bouncycastle.b.k.ac;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ag;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;
import org.bouncycastle.b.k.br;
import org.bouncycastle.b.k.bu;
import org.bouncycastle.b.k.r;
import org.bouncycastle.b.k.y;
import org.bouncycastle.b.k.z;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static Set a;

    static {
        HashSet hashSet = new HashSet(5);
        a = hashSet;
        hashSet.add(org.bouncycastle.a.f.a.x);
        a.add(org.bouncycastle.a.f.a.y);
        a.add(org.bouncycastle.a.f.a.z);
        a.add(org.bouncycastle.a.f.a.A);
        a.add(org.bouncycastle.a.f.a.B);
    }

    public static p a(org.bouncycastle.b.k.b bVar) {
        return a(bVar, null);
    }

    public static p a(org.bouncycastle.b.k.b bVar, x xVar) {
        ab abVar;
        int iBitLength;
        org.bouncycastle.a.p pVar;
        int i = 32;
        if (bVar instanceof bm) {
            bn bnVar = (bn) bVar;
            return new p(new org.bouncycastle.a.z.a(n.f_, bc.a), new s(bnVar.b(), bnVar.d(), bnVar.c(), bnVar.e(), bnVar.f(), bnVar.g(), bnVar.h(), bnVar.i()), xVar);
        }
        if (bVar instanceof org.bouncycastle.b.k.s) {
            org.bouncycastle.b.k.s sVar = (org.bouncycastle.b.k.s) bVar;
            r rVarB = sVar.b();
            return new p(new org.bouncycastle.a.z.a(aj.U, new org.bouncycastle.a.z.i(rVarB.a(), rVarB.b(), rVarB.c())), new m(sVar.c()), xVar);
        }
        if (!(bVar instanceof ad)) {
            if (bVar instanceof bu) {
                bu buVar = (bu) bVar;
                return new p(new org.bouncycastle.a.z.a(org.bouncycastle.a.h.a.c), new be(buVar.b()), xVar, buVar.c().b());
            }
            if (bVar instanceof br) {
                br brVar = (br) bVar;
                return new p(new org.bouncycastle.a.z.a(org.bouncycastle.a.h.a.b), new be(brVar.b()), xVar, brVar.c().b());
            }
            if (bVar instanceof org.bouncycastle.b.k.aj) {
                org.bouncycastle.b.k.aj ajVar = (org.bouncycastle.b.k.aj) bVar;
                return new p(new org.bouncycastle.a.z.a(org.bouncycastle.a.h.a.e), new be(ajVar.b()), xVar, ajVar.c().b());
            }
            if (!(bVar instanceof ag)) {
                throw new IOException("key parameters not recognized");
            }
            ag agVar = (ag) bVar;
            return new p(new org.bouncycastle.a.z.a(org.bouncycastle.a.h.a.d), new be(agVar.b()), xVar, agVar.c().b());
        }
        ad adVar = (ad) bVar;
        y yVarB = adVar.b();
        if (yVarB == null) {
            abVar = new ab((org.bouncycastle.a.n) bc.a);
            iBitLength = adVar.c().bitLength();
        } else {
            if (yVarB instanceof z) {
                org.bouncycastle.a.f.f fVar = new org.bouncycastle.a.f.f(((z) yVarB).g(), ((z) yVarB).h(), ((z) yVarB).i());
                if (a.contains(fVar.a())) {
                    pVar = org.bouncycastle.a.f.a.m;
                } else {
                    boolean z = adVar.c().bitLength() > 256;
                    pVar = z ? org.bouncycastle.a.t.a.h : org.bouncycastle.a.t.a.g;
                    i = z ? 64 : 32;
                }
                byte[] bArr = new byte[i];
                a(bArr, i, adVar.c());
                return new p(new org.bouncycastle.a.z.a(pVar, fVar), new be(bArr));
            }
            if (yVarB instanceof ac) {
                abVar = new ab(((ac) yVarB).j());
                iBitLength = yVarB.c().bitLength();
            } else {
                abVar = new ab(new org.bouncycastle.a.aa.ad(yVarB.a(), yVarB.b(), yVarB.c(), yVarB.d(), yVarB.f()));
                iBitLength = yVarB.c().bitLength();
            }
        }
        return new p(new org.bouncycastle.a.z.a(aj.k, abVar), new org.bouncycastle.a.u.a(iBitLength, adVar.c(), new au(yVarB.b().a(adVar.c()).a(false)), abVar), xVar);
    }

    private static void a(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] bArr2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, bArr2.length - byteArray.length, byteArray.length);
        } else {
            bArr2 = byteArray;
        }
        for (int i2 = 0; i2 != i; i2++) {
            bArr[i2 + 0] = bArr2[(bArr2.length - 1) - i2];
        }
    }
}
