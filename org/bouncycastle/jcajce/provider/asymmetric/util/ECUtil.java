package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Enumeration;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.b;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ac;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.c.e;
import org.bouncycastle.d.a.d;
import org.bouncycastle.d.a.j;
import org.bouncycastle.f.a;
import org.bouncycastle.f.c;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class ECUtil {
    public static int a(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        e eVarA = providerConfiguration.a();
        return eVarA == null ? bigInteger2.bitLength() : eVarA.d().bitLength();
    }

    public static String a(String str, j jVar, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(a(jVar, eVar)).append("]").append(strA);
        stringBuffer.append("            X: ").append(jVar.g().a().toString(16)).append(strA);
        stringBuffer.append("            Y: ").append(jVar.h().a().toString(16)).append(strA);
        return stringBuffer.toString();
    }

    private static String a(j jVar, e eVar) {
        d dVarB = eVar.b();
        return dVarB != null ? new c(a.a(jVar.a(false), dVarB.g().l(), dVarB.h().l(), eVar.c().a(false))).toString() : new c(jVar.a(false)).toString();
    }

    public static ad a(p pVar) {
        ad adVarA = org.bouncycastle.b.c.a.a(pVar);
        return adVarA == null ? b.b(pVar) : adVarA;
    }

    public static p a(String str) {
        int iIndexOf = str.indexOf(32);
        if (iIndexOf > 0) {
            str = str.substring(iIndexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new p(str);
            }
        } catch (IllegalArgumentException e) {
        }
        return b.b(str);
    }

    public static p a(e eVar) {
        Enumeration enumerationA = b.a();
        while (enumerationA.hasMoreElements()) {
            String str = (String) enumerationA.nextElement();
            ad adVarA = b.a(str);
            if (adVarA.c().equals(eVar.d()) && adVarA.d().equals(eVar.e()) && adVarA.a().a(eVar.b()) && adVarA.b().a(eVar.c())) {
                return b.b(str);
            }
        }
        return null;
    }

    public static org.bouncycastle.b.k.b a(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof org.bouncycastle.c.a.b) {
            org.bouncycastle.c.a.b bVar = (org.bouncycastle.c.a.b) privateKey;
            e eVarA = bVar.a();
            e eVarA2 = eVarA == null ? org.bouncycastle.c.b.a.a.a() : eVarA;
            if (bVar.a() instanceof org.bouncycastle.c.c.c) {
                return new org.bouncycastle.b.k.ad(bVar.c(), new ac(b.b(((org.bouncycastle.c.c.c) bVar.a()).a()), eVarA2.b(), eVarA2.c(), eVarA2.d(), eVarA2.e(), eVarA2.f()));
            }
            return new org.bouncycastle.b.k.ad(bVar.c(), new y(eVarA2.b(), eVarA2.c(), eVarA2.d(), eVarA2.e(), eVarA2.f()));
        }
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            e eVarA3 = EC5Util.a(eCPrivateKey.getParams());
            return new org.bouncycastle.b.k.ad(eCPrivateKey.getS(), new y(eVarA3.b(), eVarA3.c(), eVarA3.d(), eVarA3.e(), eVarA3.f()));
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC private key");
            }
            PrivateKey privateKeyA = org.bouncycastle.c.b.a.a(org.bouncycastle.a.s.p.a(encoded));
            if (privateKeyA instanceof ECPrivateKey) {
                return a(privateKeyA);
            }
            throw new InvalidKeyException("can't identify EC private key.");
        } catch (Exception e) {
            throw new InvalidKeyException("cannot identify EC private key: " + e.toString());
        }
    }

    public static org.bouncycastle.b.k.b a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.c.a.c) {
            org.bouncycastle.c.a.c cVar = (org.bouncycastle.c.a.c) publicKey;
            e eVarA = cVar.a();
            return new ae(cVar.c(), new y(eVarA.b(), eVarA.c(), eVarA.d(), eVarA.e(), eVarA.f()));
        }
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            e eVarA2 = EC5Util.a(eCPublicKey.getParams());
            return new ae(EC5Util.a(eCPublicKey.getParams(), eCPublicKey.getW()), new y(eVarA2.b(), eVarA2.c(), eVarA2.d(), eVarA2.e(), eVarA2.f()));
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC public key");
            }
            PublicKey publicKeyA = org.bouncycastle.c.b.a.a(u.a(encoded));
            if (publicKeyA instanceof ECPublicKey) {
                return a(publicKeyA);
            }
            throw new InvalidKeyException("cannot identify EC public key.");
        } catch (Exception e) {
            throw new InvalidKeyException("cannot identify EC public key: " + e.toString());
        }
    }

    public static y a(ProviderConfiguration providerConfiguration, ab abVar) {
        if (abVar.a()) {
            p pVarA = p.a((Object) abVar.c());
            ad adVarA = a(pVarA);
            ad adVar = adVarA == null ? (ad) providerConfiguration.c().get(pVarA) : adVarA;
            return new ac(pVarA, adVar.a(), adVar.b(), adVar.c(), adVar.d(), adVar.e());
        }
        if (abVar.b()) {
            e eVarA = providerConfiguration.a();
            return new y(eVarA.b(), eVarA.c(), eVarA.d(), eVarA.e(), eVarA.f());
        }
        ad adVarA2 = ad.a(abVar.c());
        return new y(adVarA2.a(), adVarA2.b(), adVarA2.c(), adVarA2.d(), adVarA2.e());
    }

    public static y a(ProviderConfiguration providerConfiguration, e eVar) {
        if (eVar instanceof org.bouncycastle.c.c.c) {
            org.bouncycastle.c.c.c cVar = (org.bouncycastle.c.c.c) eVar;
            return new ac(a(cVar.a()), cVar.b(), cVar.c(), cVar.d(), cVar.e(), cVar.f());
        }
        if (eVar != null) {
            return new y(eVar.b(), eVar.c(), eVar.d(), eVar.e(), eVar.f());
        }
        e eVarA = providerConfiguration.a();
        return new y(eVarA.b(), eVarA.c(), eVarA.d(), eVarA.e(), eVarA.f());
    }

    static int[] a(int[] iArr) {
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else {
            if (iArr.length != 3) {
                throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
            }
            if (iArr[0] < iArr[1] && iArr[0] < iArr[2]) {
                iArr2[0] = iArr[0];
                if (iArr[1] < iArr[2]) {
                    iArr2[1] = iArr[1];
                    iArr2[2] = iArr[2];
                } else {
                    iArr2[1] = iArr[2];
                    iArr2[2] = iArr[1];
                }
            } else if (iArr[1] < iArr[2]) {
                iArr2[0] = iArr[1];
                if (iArr[0] < iArr[2]) {
                    iArr2[1] = iArr[0];
                    iArr2[2] = iArr[2];
                } else {
                    iArr2[1] = iArr[2];
                    iArr2[2] = iArr[0];
                }
            } else {
                iArr2[0] = iArr[2];
                if (iArr[0] < iArr[1]) {
                    iArr2[1] = iArr[0];
                    iArr2[2] = iArr[1];
                } else {
                    iArr2[1] = iArr[1];
                    iArr2[2] = iArr[0];
                }
            }
        }
        return iArr2;
    }

    public static String b(p pVar) {
        return b.a(pVar);
    }

    public static ad b(String str) {
        ad adVarA = org.bouncycastle.b.c.a.a(str);
        return adVarA == null ? b.a(str) : adVarA;
    }

    public static String a(String str, BigInteger bigInteger, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        j jVarO = eVar.c().a(bigInteger).o();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(a(jVarO, eVar)).append("]").append(strA);
        stringBuffer.append("            X: ").append(jVarO.g().a().toString(16)).append(strA);
        stringBuffer.append("            Y: ").append(jVarO.h().a().toString(16)).append(strA);
        return stringBuffer.toString();
    }
}
