package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.p;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.r;
import org.bouncycastle.b.k.s;
import org.bouncycastle.f.a;
import org.bouncycastle.f.c;

/* JADX INFO: loaded from: classes.dex */
public class DSAUtil {
    public static final p[] a = {aj.U, b.j, aj.V};

    static String a(BigInteger bigInteger, DSAParams dSAParams) {
        return new c(a.a(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static org.bouncycastle.b.k.b a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DSAPrivateKey)) {
            throw new InvalidKeyException("can't identify DSA private key.");
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
        return new s(dSAPrivateKey.getX(), new r(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
    }

    public static org.bouncycastle.b.k.b a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).a();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).a();
        }
        try {
            return new BCDSAPublicKey(u.a(publicKey.getEncoded())).a();
        } catch (Exception e) {
            throw new InvalidKeyException("can't identify DSA public key: " + publicKey.getClass().getName());
        }
    }

    static r a(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new r(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }

    public static boolean a(p pVar) {
        for (int i = 0; i != a.length; i++) {
            if (pVar.equals(a[i])) {
                return true;
            }
        }
        return false;
    }
}
