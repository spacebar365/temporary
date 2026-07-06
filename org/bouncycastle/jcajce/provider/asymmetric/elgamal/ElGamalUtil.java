package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.b.k.an;
import org.bouncycastle.b.k.ao;
import org.bouncycastle.b.k.ap;
import org.bouncycastle.b.k.b;
import org.bouncycastle.c.a.e;
import org.bouncycastle.c.a.f;

/* JADX INFO: loaded from: classes.dex */
public class ElGamalUtil {
    public static b a(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof e) {
            e eVar = (e) privateKey;
            return new ao(eVar.getX(), new an(eVar.a().a(), eVar.a().b()));
        }
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new ao(dHPrivateKey.getX(), new an(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
    }

    public static b a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof f) {
            f fVar = (f) publicKey;
            return new ap(fVar.getY(), new an(fVar.a().a(), fVar.a().b()));
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new ap(dHPublicKey.getY(), new an(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
    }
}
