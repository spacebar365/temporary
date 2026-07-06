package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.h.a;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED25519;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED448;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class EdEC$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("KeyFactory.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$XDH");
        configurableProvider.a("KeyFactory.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448");
        configurableProvider.a("KeyFactory.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519");
        configurableProvider.a("KeyFactory.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$EDDSA");
        configurableProvider.a("KeyFactory.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED448");
        configurableProvider.a("KeyFactory.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED25519");
        configurableProvider.a("Signature.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$EdDSA");
        configurableProvider.a("Signature.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
        configurableProvider.a("Signature.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
        configurableProvider.a("Signature", a.e, "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
        configurableProvider.a("Signature", a.d, "org.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
        configurableProvider.a("KeyPairGenerator.EDDSA", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$EdDSA");
        configurableProvider.a("KeyPairGenerator.ED448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
        configurableProvider.a("KeyPairGenerator.ED25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
        configurableProvider.a("KeyPairGenerator", a.e, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
        configurableProvider.a("KeyPairGenerator", a.d, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
        configurableProvider.a("KeyAgreement.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$XDH");
        configurableProvider.a("KeyAgreement.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
        configurableProvider.a("KeyAgreement.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
        configurableProvider.a("KeyAgreement", a.c, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
        configurableProvider.a("KeyAgreement", a.b, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
        configurableProvider.a("KeyAgreement.X25519WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256CKDF");
        configurableProvider.a("KeyAgreement.X25519WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA384CKDF");
        configurableProvider.a("KeyAgreement.X25519WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA512CKDF");
        configurableProvider.a("KeyAgreement.X448WITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA256CKDF");
        configurableProvider.a("KeyAgreement.X448WITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA384CKDF");
        configurableProvider.a("KeyAgreement.X448WITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512CKDF");
        configurableProvider.a("KeyAgreement.X25519WITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256KDF");
        configurableProvider.a("KeyAgreement.X448WITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512KDF");
        configurableProvider.a("KeyAgreement.X25519UWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519UwithSHA256KDF");
        configurableProvider.a("KeyAgreement.X448UWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448UwithSHA512KDF");
        configurableProvider.a("KeyPairGenerator.XDH", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$XDH");
        configurableProvider.a("KeyPairGenerator.X448", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
        configurableProvider.a("KeyPairGenerator.X25519", "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
        configurableProvider.a("KeyPairGenerator", a.c, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpiSpi$X448");
        configurableProvider.a("KeyPairGenerator", a.b, "org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpiSpi$X25519");
        a(configurableProvider, a.c, "XDH", new KeyFactorySpi$X448());
        a(configurableProvider, a.b, "XDH", new KeyFactorySpi$X25519());
        a(configurableProvider, a.e, "EDDSA", new KeyFactorySpi$ED448());
        a(configurableProvider, a.d, "EDDSA", new KeyFactorySpi$ED25519());
    }
}
