package org.bouncycastle.a.w;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.d.a.g;
import org.bouncycastle.d.a.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private static g a(org.bouncycastle.d.a.d dVar, g gVar) {
        g gVarA;
        if (gVar.j()) {
            return gVar;
        }
        g gVarA2 = dVar.a(org.bouncycastle.d.a.c.c);
        Random random = new Random();
        int iB = gVar.b();
        do {
            g gVarA3 = dVar.a(new BigInteger(iB, random));
            g gVarA4 = gVar;
            gVarA = gVarA2;
            for (int i = 1; i <= iB - 1; i++) {
                g gVarE = gVarA4.e();
                gVarA = gVarA.e().a(gVarE.c(gVarA3));
                gVarA4 = gVarE.a(gVar);
            }
            if (!gVarA4.j()) {
                return null;
            }
        } while (gVarA.e().a(gVarA).j());
        return gVarA;
    }

    private static g a(g gVar) {
        g gVarA = gVar;
        for (int i = 1; i < gVar.b(); i++) {
            gVarA = gVarA.e().a(gVar);
        }
        return gVarA;
    }

    public static j a(org.bouncycastle.d.a.d dVar, byte[] bArr) {
        g gVarC;
        g gVarA = dVar.a(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        g gVarA2 = dVar.a(new BigInteger(1, bArr));
        if (!a(gVarA2).equals(dVar.g())) {
            gVarA2 = gVarA2.c();
        }
        if (gVarA2.j()) {
            gVarC = dVar.h().g();
        } else {
            g gVarA3 = a(dVar, gVarA2.e().f().c(dVar.h()).a(dVar.g()).a(gVarA2));
            if (gVarA3 != null) {
                if (!a(gVarA3).equals(gVarA)) {
                    gVarA3 = gVarA3.c();
                }
                gVarC = gVarA2.c(gVarA3);
            } else {
                gVarC = null;
            }
        }
        if (gVarC == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        return dVar.a(gVarA2.a(), gVarC.a());
    }

    public static byte[] a(j jVar) {
        j jVarO = jVar.o();
        g gVarG = jVarO.g();
        byte[] bArrL = gVarG.l();
        if (!gVarG.j()) {
            if (a(jVarO.h().d(gVarG)).i()) {
                int length = bArrL.length - 1;
                bArrL[length] = (byte) (bArrL[length] | 1);
            } else {
                int length2 = bArrL.length - 1;
                bArrL[length2] = (byte) (bArrL[length2] & 254);
            }
        }
        return bArrL;
    }
}
