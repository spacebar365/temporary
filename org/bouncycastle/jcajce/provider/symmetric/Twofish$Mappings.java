package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Twofish$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = Twofish.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.Twofish", a + "$ECB");
        configurableProvider.a("KeyGenerator.Twofish", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.Twofish", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
        configurableProvider.a("Cipher.PBEWITHSHAANDTWOFISH-CBC", a + "$PBEWithSHA");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", a + "$PBEWithSHAKeyFactory");
        b(configurableProvider, "Twofish", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "Twofish", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
