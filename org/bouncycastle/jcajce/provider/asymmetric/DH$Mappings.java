package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class DH$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("KeyPairGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        configurableProvider.a("KeyAgreement.DH", DH.a());
        configurableProvider.a("KeyAgreement.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
        configurableProvider.a("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        configurableProvider.a("KeyAgreement", n.bM, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
        configurableProvider.a("KeyAgreement", n.bN, "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
        configurableProvider.a("KeyFactory.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
        configurableProvider.a("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        configurableProvider.a("AlgorithmParameters.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        configurableProvider.a("AlgorithmParameterGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
        configurableProvider.a("Cipher.IES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
        configurableProvider.a("Cipher.IESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider.a("Cipher.IESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider.a("Cipher.IESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
        configurableProvider.a("Cipher.DHIES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
        configurableProvider.a("Cipher.DHIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider.a("Cipher.DHIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
        configurableProvider.a("Cipher.DHIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
        configurableProvider.a("KeyAgreement.DHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA1KDF");
        configurableProvider.a("KeyAgreement.DHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA224KDF");
        configurableProvider.a("KeyAgreement.DHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA256KDF");
        configurableProvider.a("KeyAgreement.DHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA384KDF");
        configurableProvider.a("KeyAgreement.DHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA512KDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1KDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224KDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256KDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384KDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512KDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1CKDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224CKDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256CKDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384CKDF");
        configurableProvider.a("KeyAgreement.DHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512CKDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1KDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224KDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256KDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384KDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512KDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1CKDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224CKDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256CKDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384CKDF");
        configurableProvider.a("KeyAgreement.MQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512CKDF");
        a(configurableProvider, n.s, "DH", new KeyFactorySpi());
        a(configurableProvider, aj.ab, "DH", new KeyFactorySpi());
    }
}
