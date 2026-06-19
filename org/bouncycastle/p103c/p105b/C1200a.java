package org.bouncycastle.p103c.p105b;

import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p129c.p131b.p132a.C1500e;
import org.bouncycastle.p118e.p129c.p131b.p132a.C1501f;
import org.bouncycastle.p118e.p129c.p131b.p133b.C1505c;
import org.bouncycastle.p118e.p129c.p131b.p134c.C1508c;
import org.bouncycastle.p118e.p129c.p131b.p135d.C1511c;
import org.bouncycastle.p118e.p129c.p131b.p136e.C1514c;
import org.bouncycastle.p118e.p129c.p131b.p138g.C1520e;
import org.bouncycastle.p118e.p129c.p131b.p138g.C1521f;

/* JADX INFO: renamed from: org.bouncycastle.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1200a extends Provider implements ConfigurableProvider {

    /* JADX INFO: renamed from: b */
    private static String f4678b = "BouncyCastle Security Provider v1.61";

    /* JADX INFO: renamed from: a */
    public static final ProviderConfiguration f4677a = new C1202c();

    /* JADX INFO: renamed from: c */
    private static final Map f4679c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static final String[] f4680d = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* JADX INFO: renamed from: e */
    private static final String[] f4681e = {"SipHash", "Poly1305"};

    /* JADX INFO: renamed from: f */
    private static final String[] f4682f = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015"};

    /* JADX INFO: renamed from: g */
    private static final String[] f4683g = {"X509", "IES"};

    /* JADX INFO: renamed from: h */
    private static final String[] f4684h = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* JADX INFO: renamed from: i */
    private static final String[] f4685i = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564"};

    /* JADX INFO: renamed from: j */
    private static final String[] f4686j = {"BC", "BCFKS", "PKCS12"};

    /* JADX INFO: renamed from: k */
    private static final String[] f4687k = {"DRBG"};

    public C1200a() {
        super("BC", 1.61d, f4678b);
        AccessController.doPrivileged(new C1201b(this));
    }

    /* JADX INFO: renamed from: a */
    public static PrivateKey m2848a(C0676p c0676p) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverterM2850a = m2850a(c0676p.m1658b().m1783a());
        if (asymmetricKeyInfoConverterM2850a == null) {
            return null;
        }
        return asymmetricKeyInfoConverterM2850a.mo3997a(c0676p);
    }

    /* JADX INFO: renamed from: a */
    public static PublicKey m2849a(C0780u c0780u) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverterM2850a = m2850a(c0780u.m1844a().m1783a());
        if (asymmetricKeyInfoConverterM2850a == null) {
            return null;
        }
        return asymmetricKeyInfoConverterM2850a.mo3998a(c0780u);
    }

    /* JADX INFO: renamed from: a */
    private static AsymmetricKeyInfoConverter m2850a(C0653p c0653p) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        synchronized (f4679c) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) f4679c.get(c0653p);
        }
        return asymmetricKeyInfoConverter;
    }

    /* JADX INFO: renamed from: a */
    private void m2851a(String str, String[] strArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == strArr.length) {
                return;
            }
            Class clsM4466a = ClassUtil.m4466a(C1200a.class, str + strArr[i2] + "$Mappings");
            if (clsM4466a != null) {
                try {
                    ((AlgorithmProvider) clsM4466a.newInstance()).mo4188a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i2] + "$Mappings : " + e);
                }
            }
            i = i2 + 1;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /* JADX INFO: renamed from: a */
    public final void mo2853a(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException("duplicate provider key (" + str + ") found");
        }
        put(str, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /* JADX INFO: renamed from: a */
    public final void mo2854a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /* JADX INFO: renamed from: a */
    public final void mo2855a(String str, C0653p c0653p, String str2) {
        mo2853a(str + "." + c0653p, str2);
        mo2853a(str + ".OID." + c0653p, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /* JADX INFO: renamed from: a */
    public final void mo2856a(C0653p c0653p, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        synchronized (f4679c) {
            f4679c.put(c0653p, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /* JADX INFO: renamed from: b */
    public final boolean mo2857b(String str, String str2) {
        return containsKey(new StringBuilder().append(str).append(".").append(str2).toString()) || containsKey(new StringBuilder("Alg.Alias.").append(str).append(".").append(str2).toString());
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m2852a(C1200a c1200a) {
        c1200a.m2851a("org.bouncycastle.jcajce.provider.digest.", f4685i);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.symmetric.", f4680d);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.symmetric.", f4681e);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.symmetric.", f4682f);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.asymmetric.", f4683g);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.asymmetric.", f4684h);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.keystore.", f4686j);
        c1200a.m2851a("org.bouncycastle.jcajce.provider.drbg.", f4687k);
        c1200a.mo2856a(InterfaceC1431e.f5187r, new C1514c());
        c1200a.mo2856a(InterfaceC1431e.f5191v, new C1505c());
        c1200a.mo2856a(InterfaceC1431e.f5192w, new C1520e());
        c1200a.mo2856a(InterfaceC1431e.f5147F, new C1521f());
        c1200a.mo2856a(InterfaceC1431e.f5182m, new C1501f());
        c1200a.mo2856a(InterfaceC1431e.f5183n, new C1500e());
        c1200a.mo2856a(InterfaceC1431e.f5168a, new C1511c());
        c1200a.mo2856a(InterfaceC1431e.f5165X, new C1508c());
        c1200a.mo2856a(InterfaceC1431e.f5166Y, new C1508c());
        c1200a.mo2856a(InterfaceC1431e.f5167Z, new C1508c());
        c1200a.mo2856a(InterfaceC1431e.f5169aa, new C1508c());
        c1200a.mo2856a(InterfaceC1431e.f5170ab, new C1508c());
        c1200a.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        c1200a.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        c1200a.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        c1200a.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        c1200a.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        c1200a.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        c1200a.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        c1200a.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        c1200a.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        c1200a.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        c1200a.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        c1200a.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        c1200a.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        c1200a.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        c1200a.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        c1200a.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        c1200a.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        c1200a.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        c1200a.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        c1200a.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        c1200a.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        c1200a.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        c1200a.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        c1200a.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        c1200a.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
