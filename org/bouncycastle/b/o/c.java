package org.bouncycastle.b.o;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.ah;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.r;
import org.bouncycastle.b.k.t;
import org.bouncycastle.b.k.y;
import org.bouncycastle.d.a.a.c.ar;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static byte[] a(org.bouncycastle.b.k.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        }
        if (bVar instanceof bm) {
            if (bVar.a()) {
                throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
            }
            BigInteger bigIntegerC = ((bm) bVar).c();
            BigInteger bigIntegerB = ((bm) bVar).b();
            h hVar = new h();
            hVar.a("ssh-rsa");
            hVar.a(bigIntegerC.toByteArray());
            hVar.a(bigIntegerB.toByteArray());
            return hVar.a();
        }
        if (bVar instanceof ae) {
            h hVar2 = new h();
            if (!(((ae) bVar).b().a() instanceof ar)) {
                throw new IllegalArgumentException("unable to derive ssh curve name for " + ((ae) bVar).b().a().getClass().getName());
            }
            hVar2.a("ecdsa-sha2-".concat(String.valueOf("nistp256")));
            hVar2.a("nistp256");
            hVar2.a(((ae) bVar).c().a(false));
            return hVar2.a();
        }
        if (!(bVar instanceof t)) {
            if (!(bVar instanceof ah)) {
                throw new IllegalArgumentException("unable to convert " + bVar.getClass().getName() + " to private key");
            }
            h hVar3 = new h();
            hVar3.a("ssh-ed25519");
            hVar3.a(((ah) bVar).b());
            return hVar3.a();
        }
        h hVar4 = new h();
        hVar4.a("ssh-dss");
        hVar4.a(((t) bVar).b().a().toByteArray());
        hVar4.a(((t) bVar).b().b().toByteArray());
        hVar4.a(((t) bVar).b().c().toByteArray());
        hVar4.a(((t) bVar).c().toByteArray());
        return hVar4.a();
    }

    public static org.bouncycastle.b.k.b a(byte[] bArr) {
        g gVar = new g(bArr);
        org.bouncycastle.b.k.b ahVar = null;
        String strB = k.b(gVar.b());
        if ("ssh-rsa".equals(strB)) {
            ahVar = new bm(false, gVar.d(), gVar.d());
        } else if ("ssh-dss".equals(strB)) {
            ahVar = new t(gVar.d(), new r(gVar.d(), gVar.d(), gVar.d()));
        } else if (strB.startsWith("ecdsa")) {
            String strB2 = k.b(gVar.b());
            if (strB2.startsWith("nist")) {
                String strSubstring = strB2.substring(4);
                strB2 = strSubstring.substring(0, 1) + "-" + strSubstring.substring(1);
            }
            ad adVarA = org.bouncycastle.a.aa.b.a(strB2);
            if (adVarA == null) {
                throw new IllegalStateException("unable to find curve for " + strB + " using curve name " + strB2);
            }
            org.bouncycastle.d.a.d dVarA = adVarA.a();
            ahVar = new ae(dVarA.a(gVar.b()), new y(dVarA, adVarA.b(), adVarA.c(), adVarA.d(), adVarA.e()));
        } else if (strB.startsWith("ssh-ed25519")) {
            ahVar = new ah(gVar.b(), 0);
        }
        if (ahVar == null) {
            throw new IllegalArgumentException("unable to parse key");
        }
        if (gVar.e()) {
            throw new IllegalArgumentException("uncoded key has trailing data");
        }
        return ahVar;
    }
}
