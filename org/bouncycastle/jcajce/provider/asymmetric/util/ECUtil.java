package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0514b;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p087c.C0851a;
import org.bouncycastle.p083b.p097k.C1051ac;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1186b;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1206c;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1552c;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class ECUtil {
    /* JADX INFO: renamed from: a */
    public static int m4321a(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        C1208e c1208eMo2859a = providerConfiguration.mo2859a();
        return c1208eMo2859a == null ? bigInteger2.bitLength() : c1208eMo2859a.m2871d().bitLength();
    }

    /* JADX INFO: renamed from: a */
    public static String m4323a(String str, AbstractC1389j abstractC1389j, C1208e c1208e) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(m4324a(abstractC1389j, c1208e)).append("]").append(strM4158a);
        stringBuffer.append("            X: ").append(abstractC1389j.m3461g().mo2928a().toString(16)).append(strM4158a);
        stringBuffer.append("            Y: ").append(abstractC1389j.m3462h().mo2928a().toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m4324a(AbstractC1389j abstractC1389j, C1208e c1208e) {
        AbstractC1381d abstractC1381dM2869b = c1208e.m2869b();
        return abstractC1381dM2869b != null ? new C1552c(C1535a.m4080a(abstractC1389j.m3452a(false), abstractC1381dM2869b.m3366g().m3436l(), abstractC1381dM2869b.m3367h().m3436l(), c1208e.m2870c().m3452a(false))).toString() : new C1552c(abstractC1389j.m3452a(false)).toString();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m4325a(C0653p c0653p) {
        C0507ad c0507adM2112a = C0851a.m2112a(c0653p);
        return c0507adM2112a == null ? C0514b.m1383b(c0653p) : c0507adM2112a;
    }

    /* JADX INFO: renamed from: a */
    public static C0653p m4326a(String str) {
        int iIndexOf = str.indexOf(32);
        if (iIndexOf > 0) {
            str = str.substring(iIndexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new C0653p(str);
            }
        } catch (IllegalArgumentException e) {
        }
        return C0514b.m1384b(str);
    }

    /* JADX INFO: renamed from: a */
    public static C0653p m4327a(C1208e c1208e) {
        Enumeration enumerationM1379a = C0514b.m1379a();
        while (enumerationM1379a.hasMoreElements()) {
            String str = (String) enumerationM1379a.nextElement();
            C0507ad c0507adM1380a = C0514b.m1380a(str);
            if (c0507adM1380a.m1368c().equals(c1208e.m2871d()) && c0507adM1380a.m1369d().equals(c1208e.m2872e()) && c0507adM1380a.m1366a().m3362a(c1208e.m2869b()) && c0507adM1380a.m1367b().m3450a(c1208e.m2870c())) {
                return C0514b.m1384b(str);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4328a(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof InterfaceC1186b) {
            InterfaceC1186b interfaceC1186b = (InterfaceC1186b) privateKey;
            C1208e c1208eA = interfaceC1186b.mo2827a();
            C1208e c1208eMo2859a = c1208eA == null ? C1200a.f4677a.mo2859a() : c1208eA;
            if (interfaceC1186b.mo2827a() instanceof C1206c) {
                return new C1052ad(interfaceC1186b.mo2828c(), new C1051ac(C0514b.m1384b(((C1206c) interfaceC1186b.mo2827a()).m2867a()), c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e(), c1208eMo2859a.m2873f()));
            }
            return new C1052ad(interfaceC1186b.mo2828c(), new C1122y(c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e(), c1208eMo2859a.m2873f()));
        }
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            C1208e c1208eM4316a = EC5Util.m4316a(eCPrivateKey.getParams());
            return new C1052ad(eCPrivateKey.getS(), new C1122y(c1208eM4316a.m2869b(), c1208eM4316a.m2870c(), c1208eM4316a.m2871d(), c1208eM4316a.m2872e(), c1208eM4316a.m2873f()));
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC private key");
            }
            PrivateKey privateKeyM2848a = C1200a.m2848a(C0676p.m1656a(encoded));
            if (privateKeyM2848a instanceof ECPrivateKey) {
                return m4328a(privateKeyM2848a);
            }
            throw new InvalidKeyException("can't identify EC private key.");
        } catch (Exception e) {
            throw new InvalidKeyException("cannot identify EC private key: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4329a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof InterfaceC1187c) {
            InterfaceC1187c interfaceC1187c = (InterfaceC1187c) publicKey;
            C1208e c1208eA = interfaceC1187c.mo2827a();
            return new C1053ae(interfaceC1187c.mo2829c(), new C1122y(c1208eA.m2869b(), c1208eA.m2870c(), c1208eA.m2871d(), c1208eA.m2872e(), c1208eA.m2873f()));
        }
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            C1208e c1208eM4316a = EC5Util.m4316a(eCPublicKey.getParams());
            return new C1053ae(EC5Util.m4319a(eCPublicKey.getParams(), eCPublicKey.getW()), new C1122y(c1208eM4316a.m2869b(), c1208eM4316a.m2870c(), c1208eM4316a.m2871d(), c1208eM4316a.m2872e(), c1208eM4316a.m2873f()));
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC public key");
            }
            PublicKey publicKeyM2849a = C1200a.m2849a(C0780u.m1843a(encoded));
            if (publicKeyM2849a instanceof ECPublicKey) {
                return m4329a(publicKeyM2849a);
            }
            throw new InvalidKeyException("cannot identify EC public key.");
        } catch (Exception e) {
            throw new InvalidKeyException("cannot identify EC public key: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1122y m4330a(ProviderConfiguration providerConfiguration, C0505ab c0505ab) {
        if (c0505ab.m1360a()) {
            C0653p c0653pM1584a = C0653p.m1584a((Object) c0505ab.m1362c());
            C0507ad c0507adM4325a = m4325a(c0653pM1584a);
            C0507ad c0507ad = c0507adM4325a == null ? (C0507ad) providerConfiguration.mo2862c().get(c0653pM1584a) : c0507adM4325a;
            return new C1051ac(c0653pM1584a, c0507ad.m1366a(), c0507ad.m1367b(), c0507ad.m1368c(), c0507ad.m1369d(), c0507ad.m1370e());
        }
        if (c0505ab.m1361b()) {
            C1208e c1208eMo2859a = providerConfiguration.mo2859a();
            return new C1122y(c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e(), c1208eMo2859a.m2873f());
        }
        C0507ad c0507adM1365a = C0507ad.m1365a(c0505ab.m1362c());
        return new C1122y(c0507adM1365a.m1366a(), c0507adM1365a.m1367b(), c0507adM1365a.m1368c(), c0507adM1365a.m1369d(), c0507adM1365a.m1370e());
    }

    /* JADX INFO: renamed from: a */
    public static C1122y m4331a(ProviderConfiguration providerConfiguration, C1208e c1208e) {
        if (c1208e instanceof C1206c) {
            C1206c c1206c = (C1206c) c1208e;
            return new C1051ac(m4326a(c1206c.m2867a()), c1206c.m2869b(), c1206c.m2870c(), c1206c.m2871d(), c1206c.m2872e(), c1206c.m2873f());
        }
        if (c1208e != null) {
            return new C1122y(c1208e.m2869b(), c1208e.m2870c(), c1208e.m2871d(), c1208e.m2872e(), c1208e.m2873f());
        }
        C1208e c1208eMo2859a = providerConfiguration.mo2859a();
        return new C1122y(c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e(), c1208eMo2859a.m2873f());
    }

    /* JADX INFO: renamed from: a */
    static int[] m4332a(int[] iArr) {
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

    /* JADX INFO: renamed from: b */
    public static String m4333b(C0653p c0653p) {
        return C0514b.m1378a(c0653p);
    }

    /* JADX INFO: renamed from: b */
    public static C0507ad m4334b(String str) {
        C0507ad c0507adM2111a = C0851a.m2111a(str);
        return c0507adM2111a == null ? C0514b.m1380a(str) : c0507adM2111a;
    }

    /* JADX INFO: renamed from: a */
    public static String m4322a(String str, BigInteger bigInteger, C1208e c1208e) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        AbstractC1389j abstractC1389jM3468o = c1208e.m2870c().m3447a(bigInteger).m3468o();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(m4324a(abstractC1389jM3468o, c1208e)).append("]").append(strM4158a);
        stringBuffer.append("            X: ").append(abstractC1389jM3468o.m3461g().mo2928a().toString(16)).append(strM4158a);
        stringBuffer.append("            Y: ").append(abstractC1389jM3468o.m3462h().mo2928a().toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }
}
