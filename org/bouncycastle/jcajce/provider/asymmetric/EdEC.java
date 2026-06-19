package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;

/* JADX INFO: loaded from: classes.dex */
public class EdEC {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f5588a;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyFactory.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$XDH");
            configurableProvider.mo2853a("KeyFactory.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448");
            configurableProvider.mo2853a("KeyFactory.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519");
            configurableProvider.mo2853a("KeyFactory.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$EDDSA");
            configurableProvider.mo2853a("KeyFactory.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED448");
            configurableProvider.mo2853a("KeyFactory.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED25519");
            configurableProvider.mo2853a("Signature.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$EdDSA");
            configurableProvider.mo2853a("Signature.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
            configurableProvider.mo2853a("Signature.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
            configurableProvider.mo2855a("Signature", InterfaceC0628a.f2268e, "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
            configurableProvider.mo2855a("Signature", InterfaceC0628a.f2267d, "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
            configurableProvider.mo2853a("KeyPairGenerator.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$EdDSA");
            configurableProvider.mo2853a("KeyPairGenerator.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            configurableProvider.mo2853a("KeyPairGenerator.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            configurableProvider.mo2855a("KeyPairGenerator", InterfaceC0628a.f2268e, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            configurableProvider.mo2855a("KeyPairGenerator", InterfaceC0628a.f2267d, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            configurableProvider.mo2853a("KeyAgreement.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$XDH");
            configurableProvider.mo2853a("KeyAgreement.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            configurableProvider.mo2853a("KeyAgreement.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0628a.f2266c, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            configurableProvider.mo2855a("KeyAgreement", InterfaceC0628a.f2265b, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            configurableProvider.mo2853a("KeyAgreement.X25519WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256CKDF");
            configurableProvider.mo2853a("KeyAgreement.X25519WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA384CKDF");
            configurableProvider.mo2853a("KeyAgreement.X25519WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA512CKDF");
            configurableProvider.mo2853a("KeyAgreement.X448WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA256CKDF");
            configurableProvider.mo2853a("KeyAgreement.X448WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA384CKDF");
            configurableProvider.mo2853a("KeyAgreement.X448WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512CKDF");
            configurableProvider.mo2853a("KeyAgreement.X25519WITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.X448WITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512KDF");
            configurableProvider.mo2853a("KeyAgreement.X25519UWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519UwithSHA256KDF");
            configurableProvider.mo2853a("KeyAgreement.X448UWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448UwithSHA512KDF");
            configurableProvider.mo2853a("KeyPairGenerator.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$XDH");
            configurableProvider.mo2853a("KeyPairGenerator.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
            configurableProvider.mo2853a("KeyPairGenerator.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
            configurableProvider.mo2855a("KeyPairGenerator", InterfaceC0628a.f2266c, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpiSpi$X448");
            configurableProvider.mo2855a("KeyPairGenerator", InterfaceC0628a.f2265b, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpiSpi$X25519");
            m4477a(configurableProvider, InterfaceC0628a.f2266c, "XDH", new KeyFactorySpi.X448());
            m4477a(configurableProvider, InterfaceC0628a.f2265b, "XDH", new KeyFactorySpi.X25519());
            m4477a(configurableProvider, InterfaceC0628a.f2268e, "EDDSA", new KeyFactorySpi.ED448());
            m4477a(configurableProvider, InterfaceC0628a.f2267d, "EDDSA", new KeyFactorySpi.ED25519());
        }
    }

    static {
        HashMap map = new HashMap();
        f5588a = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        f5588a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
