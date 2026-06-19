package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.p148ec.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p058c.InterfaceC0604a;
import org.bouncycastle.p054a.p062g.InterfaceC0626a;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p076u.InterfaceC0697aj;
import org.bouncycastle.p054a.p077v.InterfaceC0739p;
import org.bouncycastle.p142f.C1557h;

/* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.EC */
/* JADX INFO: loaded from: classes.dex */
public class C1568EC {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f5587a;

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.EC$Mappings */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            configurableProvider.mo2854a("KeyAgreement.ECDH", C1568EC.f5587a);
            configurableProvider.mo2853a("KeyAgreement.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH");
            configurableProvider.mo2854a("KeyAgreement.ECDHC", C1568EC.f5587a);
            configurableProvider.mo2853a("KeyAgreement.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
            configurableProvider.mo2854a("KeyAgreement.ECCDH", C1568EC.f5587a);
            configurableProvider.mo2853a("KeyAgreement.ECCDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
            configurableProvider.mo2854a("KeyAgreement.ECCDHU", C1568EC.f5587a);
            configurableProvider.mo2853a("KeyAgreement.ECCDHU", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUC");
            configurableProvider.mo2853a("KeyAgreement.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0513aj.f1924X, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0513aj.f1925Y, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2831J, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2835N, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2832K, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2836O, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2833L, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2837P, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2834M, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0697aj.f2838Q, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512CKDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1KDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224KDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384KDF");
            configurableProvider.mo2853a("KeyAgreement.ECCDHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512KDF");
            configurableProvider.mo2853a("KeyAgreement.ECKAEGWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF");
            configurableProvider.mo2853a("KeyAgreement.ECKAEGWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF");
            configurableProvider.mo2853a("KeyAgreement.ECKAEGWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.ECKAEGWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF");
            configurableProvider.mo2853a("KeyAgreement.ECKAEGWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0604a.f2149m, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0604a.f2150n, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0604a.f2151o, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0604a.f2152p, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0604a.f2153q, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0604a.f2154r, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF");
            configurableProvider.mo2853a("KeyAgreement.ECKAEGWITHRIPEMD160KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF");
            m4477a(configurableProvider, InterfaceC0513aj.f1952k, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0513aj.f1925Y, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0513aj.f1926Z, "ECMQV", new KeyFactorySpi.ECMQV());
            m4477a(configurableProvider, InterfaceC0697aj.f2831J, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2835N, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2832K, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2836O, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2833L, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2837P, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2834M, "EC", new KeyFactorySpi.C1575EC());
            m4477a(configurableProvider, InterfaceC0697aj.f2838Q, "EC", new KeyFactorySpi.C1575EC());
            m4476a(configurableProvider, InterfaceC0513aj.f1952k, "EC");
            m4476a(configurableProvider, InterfaceC0513aj.f1924X, "EC");
            m4476a(configurableProvider, InterfaceC0513aj.f1925Y, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2831J, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2835N, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2832K, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2836O, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2833L, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2837P, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2834M, "EC");
            m4476a(configurableProvider, InterfaceC0697aj.f2838Q, "EC");
            if (!C1557h.m4155a("org.bouncycastle.ec.disable_mqv")) {
                configurableProvider.mo2853a("KeyAgreement.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQV");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1CKDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224CKDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256CKDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384CKDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512CKDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDF");
                configurableProvider.mo2853a("KeyAgreement.ECMQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDF");
                configurableProvider.mo2853a("KeyAgreement." + InterfaceC0513aj.f1926Z, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDFAndSharedInfo");
                configurableProvider.mo2853a("KeyAgreement." + InterfaceC0697aj.f2839R, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDFAndSharedInfo");
                configurableProvider.mo2853a("KeyAgreement." + InterfaceC0697aj.f2840S, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDFAndSharedInfo");
                configurableProvider.mo2853a("KeyAgreement." + InterfaceC0697aj.f2841T, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDFAndSharedInfo");
                configurableProvider.mo2853a("KeyAgreement." + InterfaceC0697aj.f2842U, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDFAndSharedInfo");
                m4477a(configurableProvider, InterfaceC0513aj.f1924X, "EC", new KeyFactorySpi.C1575EC());
                m4476a(configurableProvider, InterfaceC0513aj.f1926Z, "EC");
                m4477a(configurableProvider, InterfaceC0697aj.f2839R, "ECMQV", new KeyFactorySpi.ECMQV());
                m4476a(configurableProvider, InterfaceC0697aj.f2840S, "EC");
                m4477a(configurableProvider, InterfaceC0697aj.f2840S, "ECMQV", new KeyFactorySpi.ECMQV());
                m4476a(configurableProvider, InterfaceC0697aj.f2839R, "EC");
                m4477a(configurableProvider, InterfaceC0697aj.f2841T, "ECMQV", new KeyFactorySpi.ECMQV());
                m4476a(configurableProvider, InterfaceC0697aj.f2841T, "EC");
                m4477a(configurableProvider, InterfaceC0697aj.f2842U, "ECMQV", new KeyFactorySpi.ECMQV());
                m4476a(configurableProvider, InterfaceC0697aj.f2842U, "EC");
                configurableProvider.mo2853a("KeyFactory.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECMQV");
                configurableProvider.mo2853a("KeyPairGenerator.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECMQV");
            }
            configurableProvider.mo2853a("KeyFactory.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC");
            configurableProvider.mo2853a("KeyFactory.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDSA");
            configurableProvider.mo2853a("KeyFactory.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDH");
            configurableProvider.mo2853a("KeyFactory.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDHC");
            configurableProvider.mo2853a("KeyPairGenerator.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC");
            configurableProvider.mo2853a("KeyPairGenerator.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDSA");
            configurableProvider.mo2853a("KeyPairGenerator.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.mo2853a("KeyPairGenerator.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.mo2853a("KeyPairGenerator.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDHC");
            configurableProvider.mo2853a("KeyPairGenerator.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.mo2853a("Cipher.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES");
            configurableProvider.mo2853a("Cipher.ECIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            configurableProvider.mo2853a("Cipher.ECIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            configurableProvider.mo2853a("Cipher.ECIESwithDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            configurableProvider.mo2853a("Cipher.ECIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            configurableProvider.mo2853a("Signature.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA");
            configurableProvider.mo2853a("Signature.NONEwithECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature." + InterfaceC0739p.f2938j, "ECDSA");
            configurableProvider.mo2853a("Signature.ECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA");
            configurableProvider.mo2853a("Signature.SHA1WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA");
            configurableProvider.mo2853a("Signature.SHA224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA224");
            configurableProvider.mo2853a("Signature.SHA256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA256");
            configurableProvider.mo2853a("Signature.SHA384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA384");
            configurableProvider.mo2853a("Signature.SHA512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA512");
            configurableProvider.mo2853a("Signature.SHA3-224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_224");
            configurableProvider.mo2853a("Signature.SHA3-256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_256");
            configurableProvider.mo2853a("Signature.SHA3-384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_384");
            configurableProvider.mo2853a("Signature.SHA3-512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_512");
            configurableProvider.mo2853a("Alg.Alias.Signature.DETECDSA", "ECDDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1WITHDETECDSA", "SHA1WITHECDDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA224WITHDETECDSA", "SHA224WITHECDDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA256WITHDETECDSA", "SHA256WITHECDDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA384WITHDETECDSA", "SHA384WITHECDDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA512WITHDETECDSA", "SHA512WITHECDDSA");
            m4475a(configurableProvider, "SHA224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224", InterfaceC0513aj.f1954m);
            m4475a(configurableProvider, "SHA256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256", InterfaceC0513aj.f1955n);
            m4475a(configurableProvider, "SHA384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384", InterfaceC0513aj.f1956o);
            m4475a(configurableProvider, "SHA512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512", InterfaceC0513aj.f1957p);
            m4475a(configurableProvider, "SHA3-224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_224", InterfaceC0652b.f2481ab);
            m4475a(configurableProvider, "SHA3-256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_256", InterfaceC0652b.f2482ac);
            m4475a(configurableProvider, "SHA3-384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_384", InterfaceC0652b.f2483ad);
            m4475a(configurableProvider, "SHA3-512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_512", InterfaceC0652b.f2484ae);
            m4475a(configurableProvider, "RIPEMD160", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160", InterfaceC0739p.f2939k);
            configurableProvider.mo2853a("Signature.SHA1WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR");
            configurableProvider.mo2853a("Signature.SHA224WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224");
            configurableProvider.mo2853a("Signature.SHA256WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256");
            configurableProvider.mo2853a("Signature.SHA384WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384");
            configurableProvider.mo2853a("Signature.SHA512WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512");
            m4475a(configurableProvider, "SHA1", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", InterfaceC0626a.f2256s);
            m4475a(configurableProvider, "SHA224", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", InterfaceC0626a.f2257t);
            m4475a(configurableProvider, "SHA256", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", InterfaceC0626a.f2258u);
            m4475a(configurableProvider, "SHA384", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", InterfaceC0626a.f2259v);
            m4475a(configurableProvider, "SHA512", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", InterfaceC0626a.f2260w);
            m4475a(configurableProvider, "SHA1", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", InterfaceC0604a.f2140d);
            m4475a(configurableProvider, "SHA224", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", InterfaceC0604a.f2141e);
            m4475a(configurableProvider, "SHA256", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", InterfaceC0604a.f2142f);
            m4475a(configurableProvider, "SHA384", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", InterfaceC0604a.f2143g);
            m4475a(configurableProvider, "SHA512", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", InterfaceC0604a.f2144h);
            m4475a(configurableProvider, "RIPEMD160", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecPlainDSARP160", InterfaceC0604a.f2145i);
        }
    }

    static {
        HashMap map = new HashMap();
        f5587a = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        f5587a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
