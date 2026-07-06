package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.p;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class RSA$Mappings extends AsymmetricAlgorithmProvider {
    private static void a(ConfigurableProvider configurableProvider, String str, String str2) {
        configurableProvider.a("Alg.Alias.Signature." + str + "withRSA/ISO9796-2", str + "WITHRSA/ISO9796-2");
        configurableProvider.a("Alg.Alias.Signature." + str + "WithRSA/ISO9796-2", str + "WITHRSA/ISO9796-2");
        configurableProvider.a("Signature." + str + "WITHRSA/ISO9796-2", str2);
    }

    private static void a(ConfigurableProvider configurableProvider, String str, String str2, p pVar) {
        String str3 = str + "WITHRSA";
        configurableProvider.a("Signature.".concat(String.valueOf(str3)), str2);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "withRSA")), str3);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "WithRSA")), str3);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "WITHRSAENCRYPTION")), str3);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "withRSAEncryption")), str3);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "WithRSAEncryption")), str3);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "/RSA")), str3);
        if (pVar != null) {
            configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(pVar)), str3);
            configurableProvider.a("Alg.Alias.Signature.OID.".concat(String.valueOf(pVar)), str3);
        }
    }

    private static void b(ConfigurableProvider configurableProvider, String str, String str2) {
        configurableProvider.a("Alg.Alias.Signature." + str + "withRSA/PSS", str + "WITHRSAANDMGF1");
        configurableProvider.a("Alg.Alias.Signature." + str + "WithRSA/PSS", str + "WITHRSAANDMGF1");
        configurableProvider.a("Alg.Alias.Signature." + str + "withRSAandMGF1", str + "WITHRSAANDMGF1");
        configurableProvider.a("Alg.Alias.Signature." + str + "WithRSAAndMGF1", str + "WITHRSAANDMGF1");
        configurableProvider.a("Signature." + str + "WITHRSAANDMGF1", str2);
    }

    private static void c(ConfigurableProvider configurableProvider, String str, String str2) {
        configurableProvider.a("Alg.Alias.Signature." + str + "withRSA/X9.31", str + "WITHRSA/X9.31");
        configurableProvider.a("Alg.Alias.Signature." + str + "WithRSA/X9.31", str + "WITHRSA/X9.31");
        configurableProvider.a("Signature." + str + "WITHRSA/X9.31", str2);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
        configurableProvider.a("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
        configurableProvider.a("Cipher.RSA", RSA.a());
        configurableProvider.a("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        configurableProvider.a("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        configurableProvider.a("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableProvider.a("Cipher", n.f_, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableProvider.a("Cipher", aa.m, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableProvider.a("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
        configurableProvider.a("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
        configurableProvider.a("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        configurableProvider.a("Cipher", n.h, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        configurableProvider.a("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
        configurableProvider.a("Alg.Alias.Cipher.RSA//RAW", "RSA");
        configurableProvider.a("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
        configurableProvider.a("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
        configurableProvider.a("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
        configurableProvider.a("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
        configurableProvider.a("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
        configurableProvider.a("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
        KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
        a(configurableProvider, n.f_, "RSA", keyFactorySpi);
        a(configurableProvider, aa.m, "RSA", keyFactorySpi);
        a(configurableProvider, n.h, "RSA", keyFactorySpi);
        a(configurableProvider, n.k, "RSA", keyFactorySpi);
        a(configurableProvider, n.f_, "RSA");
        a(configurableProvider, aa.m, "RSA");
        a(configurableProvider, n.h, "OAEP");
        a(configurableProvider, n.k, "PSS");
        configurableProvider.a("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableProvider.a("Signature." + n.k, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableProvider.a("Signature.OID." + n.k, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableProvider.a("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
        configurableProvider.a("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
        configurableProvider.a("Alg.Alias.Signature.RAWRSA", "RSA");
        configurableProvider.a("Alg.Alias.Signature.NONEWITHRSA", "RSA");
        configurableProvider.a("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
        configurableProvider.a("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
        configurableProvider.a("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
        configurableProvider.a("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
        configurableProvider.a("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
        b(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
        b(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
        b(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
        b(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
        b(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
        b(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
        b(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
        b(configurableProvider, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
        b(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
        b(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
        if (configurableProvider.b("MessageDigest", "MD2")) {
            a(configurableProvider, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", n.g_);
        }
        if (configurableProvider.b("MessageDigest", "MD4")) {
            a(configurableProvider, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", n.d);
        }
        if (configurableProvider.b("MessageDigest", "MD5")) {
            a(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", n.e);
            a(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
        }
        if (configurableProvider.b("MessageDigest", "SHA1")) {
            configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
            configurableProvider.a("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
            b(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
            a(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", n.h_);
            a(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
            configurableProvider.a("Alg.Alias.Signature." + b.k, "SHA1WITHRSA");
            configurableProvider.a("Alg.Alias.Signature.OID." + b.k, "SHA1WITHRSA");
            c(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
        }
        a(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", n.o_);
        a(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", n.l_);
        a(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", n.m_);
        a(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", n.n_);
        a(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", n.p_);
        a(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", n.q_);
        a(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", org.bouncycastle.a.o.b.af);
        a(configurableProvider, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", org.bouncycastle.a.o.b.ag);
        a(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", org.bouncycastle.a.o.b.ah);
        a(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", org.bouncycastle.a.o.b.ai);
        a(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
        a(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
        a(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
        a(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
        a(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
        a(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
        c(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
        c(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
        c(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
        c(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
        c(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
        c(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
        if (configurableProvider.b("MessageDigest", "RIPEMD128")) {
            a(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", org.bouncycastle.a.v.p.g);
            a(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", (p) null);
            c(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            c(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
        }
        if (configurableProvider.b("MessageDigest", "RIPEMD160")) {
            a(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", org.bouncycastle.a.v.p.f);
            a(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", (p) null);
            configurableProvider.a("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
            configurableProvider.a("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
            c(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            c(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
        }
        if (configurableProvider.b("MessageDigest", "RIPEMD256")) {
            a(configurableProvider, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", org.bouncycastle.a.v.p.h);
            a(configurableProvider, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", (p) null);
        }
        if (configurableProvider.b("MessageDigest", "WHIRLPOOL")) {
            a(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
            a(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
            c(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            c(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
        }
    }
}
