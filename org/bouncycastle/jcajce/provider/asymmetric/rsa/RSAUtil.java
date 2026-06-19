package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p142f.C1552c;

/* JADX INFO: loaded from: classes.dex */
public class RSAUtil {

    /* JADX INFO: renamed from: a */
    public static final C0653p[] f5897a = {InterfaceC0674n.f2733f_, InterfaceC0760aa.f3125m, InterfaceC0674n.f2735h, InterfaceC0674n.f2739k};

    /* JADX INFO: renamed from: a */
    static String m4296a(BigInteger bigInteger) {
        return new C1552c(bigInteger.toByteArray()).toString();
    }

    /* JADX INFO: renamed from: a */
    static C1088bm m4297a(RSAPrivateKey rSAPrivateKey) {
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new C1088bm(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new C1089bn(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    /* JADX INFO: renamed from: a */
    static C1088bm m4298a(RSAPublicKey rSAPublicKey) {
        return new C1088bm(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4299a(C0653p c0653p) {
        for (int i = 0; i != f5897a.length; i++) {
            if (c0653p.equals(f5897a[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static String m4300b(BigInteger bigInteger) {
        return new C1552c(bigInteger.toByteArray(), 32).toString();
    }
}
