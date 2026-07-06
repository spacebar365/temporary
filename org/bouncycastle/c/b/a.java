package org.bouncycastle.c.b;

import java.security.AccessController;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.a.e;
import org.bouncycastle.e.c.b.g.f;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Provider implements ConfigurableProvider {
    private static String b = "BouncyCastle Security Provider v1.61";
    public static final ProviderConfiguration a = new c();
    private static final Map c = new HashMap();
    private static final String[] d = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    private static final String[] e = {"SipHash", "Poly1305"};
    private static final String[] f = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015"};
    private static final String[] g = {"X509", "IES"};
    private static final String[] h = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    private static final String[] i = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564"};
    private static final String[] j = {"BC", "BCFKS", "PKCS12"};
    private static final String[] k = {"DRBG"};

    public a() {
        super("BC", 1.61d, b);
        AccessController.doPrivileged(new b(this));
    }

    public static PrivateKey a(p pVar) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverterA = a(pVar.b().a());
        if (asymmetricKeyInfoConverterA == null) {
            return null;
        }
        return asymmetricKeyInfoConverterA.a(pVar);
    }

    public static PublicKey a(u uVar) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverterA = a(uVar.a().a());
        if (asymmetricKeyInfoConverterA == null) {
            return null;
        }
        return asymmetricKeyInfoConverterA.a(uVar);
    }

    private static AsymmetricKeyInfoConverter a(org.bouncycastle.a.p pVar) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        synchronized (c) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) c.get(pVar);
        }
        return asymmetricKeyInfoConverter;
    }

    private void a(String str, String[] strArr) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 == strArr.length) {
                return;
            }
            Class clsA = ClassUtil.a(a.class, str + strArr[i3] + "$Mappings");
            if (clsA != null) {
                try {
                    ((AlgorithmProvider) clsA.newInstance()).a(this);
                } catch (Exception e2) {
                    throw new InternalError("cannot create instance of " + str + strArr[i3] + "$Mappings : " + e2);
                }
            }
            i2 = i3 + 1;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void a(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException("duplicate provider key (" + str + ") found");
        }
        put(str, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void a(String str, org.bouncycastle.a.p pVar, String str2) {
        a(str + "." + pVar, str2);
        a(str + ".OID." + pVar, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final void a(org.bouncycastle.a.p pVar, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        synchronized (c) {
            c.put(pVar, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public final boolean b(String str, String str2) {
        return containsKey(new StringBuilder().append(str).append(".").append(str2).toString()) || containsKey(new StringBuilder("Alg.Alias.").append(str).append(".").append(str2).toString());
    }

    static /* synthetic */ void a(a aVar) {
        aVar.a("org.bouncycastle.jcajce.provider.digest.", i);
        aVar.a("org.bouncycastle.jcajce.provider.symmetric.", d);
        aVar.a("org.bouncycastle.jcajce.provider.symmetric.", e);
        aVar.a("org.bouncycastle.jcajce.provider.symmetric.", f);
        aVar.a("org.bouncycastle.jcajce.provider.asymmetric.", g);
        aVar.a("org.bouncycastle.jcajce.provider.asymmetric.", h);
        aVar.a("org.bouncycastle.jcajce.provider.keystore.", j);
        aVar.a("org.bouncycastle.jcajce.provider.drbg.", k);
        aVar.a(e.r, new org.bouncycastle.e.c.b.e.c());
        aVar.a(e.v, new org.bouncycastle.e.c.b.b.c());
        aVar.a(e.w, new org.bouncycastle.e.c.b.g.e());
        aVar.a(e.F, new f());
        aVar.a(e.m, new org.bouncycastle.e.c.b.a.f());
        aVar.a(e.n, new org.bouncycastle.e.c.b.a.e());
        aVar.a(e.a, new org.bouncycastle.e.c.b.d.c());
        aVar.a(e.X, new org.bouncycastle.e.c.b.c.c());
        aVar.a(e.Y, new org.bouncycastle.e.c.b.c.c());
        aVar.a(e.Z, new org.bouncycastle.e.c.b.c.c());
        aVar.a(e.aa, new org.bouncycastle.e.c.b.c.c());
        aVar.a(e.ab, new org.bouncycastle.e.c.b.c.c());
        aVar.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        aVar.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        aVar.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        aVar.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        aVar.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        aVar.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        aVar.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        aVar.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        aVar.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        aVar.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        aVar.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        aVar.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        aVar.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        aVar.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        aVar.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        aVar.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        aVar.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        aVar.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        aVar.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        aVar.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        aVar.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        aVar.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        aVar.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        aVar.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        aVar.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
