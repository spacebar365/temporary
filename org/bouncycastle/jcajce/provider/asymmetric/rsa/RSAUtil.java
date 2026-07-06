package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;
import org.bouncycastle.f.c;

/* JADX INFO: loaded from: classes.dex */
public class RSAUtil {
    public static final p[] a = {n.f_, aa.m, n.h, n.k};

    static String a(BigInteger bigInteger) {
        return new c(bigInteger.toByteArray()).toString();
    }

    static bm a(RSAPrivateKey rSAPrivateKey) {
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new bm(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new bn(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    static bm a(RSAPublicKey rSAPublicKey) {
        return new bm(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static boolean a(p pVar) {
        for (int i = 0; i != a.length; i++) {
            if (pVar.equals(a[i])) {
                return true;
            }
        }
        return false;
    }

    static String b(BigInteger bigInteger) {
        return new c(bigInteger.toByteArray(), 32).toString();
    }
}
