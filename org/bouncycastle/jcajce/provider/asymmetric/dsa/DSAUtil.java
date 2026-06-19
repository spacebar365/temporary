package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1552c;

/* JADX INFO: loaded from: classes.dex */
public class DSAUtil {

    /* JADX INFO: renamed from: a */
    public static final C0653p[] f5648a = {InterfaceC0513aj.f1921U, InterfaceC0659b.f2576j, InterfaceC0513aj.f1922V};

    /* JADX INFO: renamed from: a */
    static String m4208a(BigInteger bigInteger, DSAParams dSAParams) {
        return new C1552c(C1535a.m4080a(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4209a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DSAPrivateKey)) {
            throw new InvalidKeyException("can't identify DSA private key.");
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
        return new C1116s(dSAPrivateKey.getX(), new C1115r(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4210a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).m4207a();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).m4207a();
        }
        try {
            return new BCDSAPublicKey(C0780u.m1843a(publicKey.getEncoded())).m4207a();
        } catch (Exception e) {
            throw new InvalidKeyException("can't identify DSA public key: " + publicKey.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: a */
    static C1115r m4211a(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new C1115r(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4212a(C0653p c0653p) {
        for (int i = 0; i != f5648a.length; i++) {
            if (c0653p.equals(f5648a[i])) {
                return true;
            }
        }
        return false;
    }
}
