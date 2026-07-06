package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.j;
import org.bouncycastle.b.k.k;
import org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey;

/* JADX INFO: loaded from: classes.dex */
public class DHUtil {
    public static b a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify DH private key.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new j(dHPrivateKey.getX(), new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), dHPrivateKey.getParams().getL()));
    }

    public static b a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).a();
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify DH public key.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new k(dHPublicKey.getY(), new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), dHPublicKey.getParams().getL()));
    }
}
