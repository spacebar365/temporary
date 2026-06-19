package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.p147dh.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;

/* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.DH */
/* JADX INFO: loaded from: classes.dex */
public class C1567DH {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f5586a;

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.DH$Mappings */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyPairGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
            configurableProvider.mo2854a("KeyAgreement.DH", C1567DH.f5586a);
            configurableProvider.mo2853a("KeyAgreement.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0674n.f2702bM, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0674n.f2703bN, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
            configurableProvider.mo2853a("KeyFactory.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
            configurableProvider.mo2853a("AlgorithmParameters.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
            configurableProvider.mo2853a("Cipher.IES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            configurableProvider.mo2853a("Cipher.IESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            configurableProvider.mo2853a("Cipher.IESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            configurableProvider.mo2853a("Cipher.IESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
            configurableProvider.mo2853a("Cipher.DHIES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            configurableProvider.mo2853a("Cipher.DHIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            configurableProvider.mo2853a("Cipher.DHIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            configurableProvider.mo2853a("Cipher.DHIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
            configurableProvider.mo2853a("KeyAgreement.DHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA1KDF");
            configurableProvider.mo2853a("KeyAgreement.DHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA224KDF");
            configurableProvider.mo2853a("KeyAgreement.DHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.DHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA384KDF");
            configurableProvider.mo2853a("KeyAgreement.DHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA512KDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1KDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224KDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384KDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512KDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1CKDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224CKDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256CKDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384CKDF");
            configurableProvider.mo2853a("KeyAgreement.DHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512CKDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1KDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224KDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384KDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512KDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1CKDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224CKDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256CKDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384CKDF");
            configurableProvider.mo2853a("KeyAgreement.MQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512CKDF");
            m4477a(configurableProvider, InterfaceC0674n.f2748s, "DH", new KeyFactorySpi());
            m4477a(configurableProvider, InterfaceC0513aj.f1929ab, "DH", new KeyFactorySpi());
        }
    }

    static {
        HashMap map = new HashMap();
        f5586a = map;
        map.put("SupportedKeyClasses", "javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey");
        f5586a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
