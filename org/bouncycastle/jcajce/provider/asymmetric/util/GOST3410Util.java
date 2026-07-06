package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.b.k.as;
import org.bouncycastle.b.k.at;
import org.bouncycastle.b.k.au;
import org.bouncycastle.b.k.b;
import org.bouncycastle.c.a.i;
import org.bouncycastle.c.a.j;
import org.bouncycastle.c.c.n;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410Util {
    public static b a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof i)) {
            throw new InvalidKeyException("can't identify GOST3410 private key.");
        }
        i iVar = (i) privateKey;
        n nVarD = iVar.a().d();
        return new at(iVar.c(), new as(nVarD.a(), nVarD.b(), nVarD.c()));
    }

    public static b a(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof j)) {
            throw new InvalidKeyException("can't identify GOST3410 public key: " + publicKey.getClass().getName());
        }
        j jVar = (j) publicKey;
        n nVarD = jVar.a().d();
        return new au(jVar.b(), new as(nVarD.a(), nVarD.b(), nVarD.c()));
    }
}
