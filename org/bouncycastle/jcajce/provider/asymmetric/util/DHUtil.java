package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.p147dh.BCDHPublicKey;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1108k;

/* JADX INFO: loaded from: classes.dex */
public class DHUtil {
    /* JADX INFO: renamed from: a */
    public static C1075b m4307a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify DH private key.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new C1107j(dHPrivateKey.getX(), new C1106i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), dHPrivateKey.getParams().getL()));
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4308a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).m4197a();
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify DH public key.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new C1108k(dHPublicKey.getY(), new C1106i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), dHPublicKey.getParams().getL()));
    }
}
