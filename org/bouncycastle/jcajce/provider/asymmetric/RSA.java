package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p077v.InterfaceC0739p;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;

/* JADX INFO: loaded from: classes.dex */
public class RSA {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f5590a;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        /* JADX INFO: renamed from: a */
        private static void m4191a(ConfigurableProvider configurableProvider, String str, String str2) {
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "withRSA/ISO9796-2", str + "WITHRSA/ISO9796-2");
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "WithRSA/ISO9796-2", str + "WITHRSA/ISO9796-2");
            configurableProvider.mo2853a("Signature." + str + "WITHRSA/ISO9796-2", str2);
        }

        /* JADX INFO: renamed from: a */
        private static void m4192a(ConfigurableProvider configurableProvider, String str, String str2, C0653p c0653p) {
            String str3 = str + "WITHRSA";
            configurableProvider.mo2853a("Signature.".concat(String.valueOf(str3)), str2);
            configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "withRSA")), str3);
            configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "WithRSA")), str3);
            configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "WITHRSAENCRYPTION")), str3);
            configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "withRSAEncryption")), str3);
            configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "WithRSAEncryption")), str3);
            configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "/RSA")), str3);
            if (c0653p != null) {
                configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(c0653p)), str3);
                configurableProvider.mo2853a("Alg.Alias.Signature.OID.".concat(String.valueOf(c0653p)), str3);
            }
        }

        /* JADX INFO: renamed from: b */
        private static void m4193b(ConfigurableProvider configurableProvider, String str, String str2) {
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "withRSA/PSS", str + "WITHRSAANDMGF1");
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "WithRSA/PSS", str + "WITHRSAANDMGF1");
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "withRSAandMGF1", str + "WITHRSAANDMGF1");
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "WithRSAAndMGF1", str + "WITHRSAANDMGF1");
            configurableProvider.mo2853a("Signature." + str + "WITHRSAANDMGF1", str2);
        }

        /* JADX INFO: renamed from: c */
        private static void m4194c(ConfigurableProvider configurableProvider, String str, String str2) {
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "withRSA/X9.31", str + "WITHRSA/X9.31");
            configurableProvider.mo2853a("Alg.Alias.Signature." + str + "WithRSA/X9.31", str + "WITHRSA/X9.31");
            configurableProvider.mo2853a("Signature." + str + "WITHRSA/X9.31", str2);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
            configurableProvider.mo2853a("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
            configurableProvider.mo2854a("Cipher.RSA", RSA.f5590a);
            configurableProvider.mo2853a("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.mo2853a("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.mo2853a("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.mo2855a("Cipher", InterfaceC0674n.f2733f_, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.mo2855a("Cipher", InterfaceC0760aa.f3125m, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.mo2853a("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
            configurableProvider.mo2853a("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
            configurableProvider.mo2853a("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            configurableProvider.mo2855a("Cipher", InterfaceC0674n.f2735h, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            configurableProvider.mo2853a("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RSA//RAW", "RSA");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
            configurableProvider.mo2853a("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            configurableProvider.mo2853a("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            m4477a(configurableProvider, InterfaceC0674n.f2733f_, "RSA", keyFactorySpi);
            m4477a(configurableProvider, InterfaceC0760aa.f3125m, "RSA", keyFactorySpi);
            m4477a(configurableProvider, InterfaceC0674n.f2735h, "RSA", keyFactorySpi);
            m4477a(configurableProvider, InterfaceC0674n.f2739k, "RSA", keyFactorySpi);
            m4476a(configurableProvider, InterfaceC0674n.f2733f_, "RSA");
            m4476a(configurableProvider, InterfaceC0760aa.f3125m, "RSA");
            m4476a(configurableProvider, InterfaceC0674n.f2735h, "OAEP");
            m4476a(configurableProvider, InterfaceC0674n.f2739k, "PSS");
            configurableProvider.mo2853a("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            configurableProvider.mo2853a("Signature." + InterfaceC0674n.f2739k, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            configurableProvider.mo2853a("Signature.OID." + InterfaceC0674n.f2739k, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            configurableProvider.mo2853a("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
            configurableProvider.mo2853a("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
            configurableProvider.mo2853a("Alg.Alias.Signature.RAWRSA", "RSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.NONEWITHRSA", "RSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.mo2853a("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.mo2853a("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
            configurableProvider.mo2853a("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
            configurableProvider.mo2853a("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
            m4193b(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
            m4193b(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
            m4193b(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
            m4193b(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
            m4193b(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
            m4193b(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
            m4193b(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
            m4193b(configurableProvider, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
            m4193b(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
            m4193b(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
            if (configurableProvider.mo2857b("MessageDigest", "MD2")) {
                m4192a(configurableProvider, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", InterfaceC0674n.f2734g_);
            }
            if (configurableProvider.mo2857b("MessageDigest", "MD4")) {
                m4192a(configurableProvider, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", InterfaceC0674n.f2730d);
            }
            if (configurableProvider.mo2857b("MessageDigest", "MD5")) {
                m4192a(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", InterfaceC0674n.f2731e);
                m4191a(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            }
            if (configurableProvider.mo2857b("MessageDigest", "SHA1")) {
                configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
                configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
                m4193b(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
                m4192a(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", InterfaceC0674n.f2736h_);
                m4191a(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
                configurableProvider.mo2853a("Alg.Alias.Signature." + InterfaceC0659b.f2577k, "SHA1WITHRSA");
                configurableProvider.mo2853a("Alg.Alias.Signature.OID." + InterfaceC0659b.f2577k, "SHA1WITHRSA");
                m4194c(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
            }
            m4192a(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", InterfaceC0674n.f2744o_);
            m4192a(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", InterfaceC0674n.f2741l_);
            m4192a(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", InterfaceC0674n.f2742m_);
            m4192a(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", InterfaceC0674n.f2743n_);
            m4192a(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", InterfaceC0674n.f2745p_);
            m4192a(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", InterfaceC0674n.f2746q_);
            m4192a(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", InterfaceC0652b.f2485af);
            m4192a(configurableProvider, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", InterfaceC0652b.f2486ag);
            m4192a(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", InterfaceC0652b.f2487ah);
            m4192a(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", InterfaceC0652b.f2488ai);
            m4191a(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
            m4191a(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
            m4191a(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
            m4191a(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
            m4191a(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
            m4191a(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
            m4194c(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
            m4194c(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
            m4194c(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
            m4194c(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
            m4194c(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
            m4194c(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
            if (configurableProvider.mo2857b("MessageDigest", "RIPEMD128")) {
                m4192a(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", InterfaceC0739p.f2935g);
                m4192a(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", (C0653p) null);
                m4194c(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
                m4194c(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            }
            if (configurableProvider.mo2857b("MessageDigest", "RIPEMD160")) {
                m4192a(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", InterfaceC0739p.f2934f);
                m4192a(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", (C0653p) null);
                configurableProvider.mo2853a("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
                configurableProvider.mo2853a("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
                m4194c(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
                m4194c(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            }
            if (configurableProvider.mo2857b("MessageDigest", "RIPEMD256")) {
                m4192a(configurableProvider, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", InterfaceC0739p.f2936h);
                m4192a(configurableProvider, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", (C0653p) null);
            }
            if (configurableProvider.mo2857b("MessageDigest", "WHIRLPOOL")) {
                m4191a(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                m4191a(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                m4194c(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
                m4194c(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f5590a = map;
        map.put("SupportedKeyClasses", "javax.crypto.interfaces.RSAPublicKey|javax.crypto.interfaces.RSAPrivateKey");
        f5590a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
