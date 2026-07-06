package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.p.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class ARIA$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = ARIA.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.ARIA", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", a.h, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", a.m, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", a.r, "ARIA");
        configurableProvider.a("AlgorithmParameterGenerator.ARIA", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.h, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.m, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.r, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.j, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.o, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.t, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.i, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.n, "ARIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.s, "ARIA");
        configurableProvider.a("Cipher.ARIA", a + "$ECB");
        configurableProvider.a("Cipher", a.g, a + "$ECB");
        configurableProvider.a("Cipher", a.l, a + "$ECB");
        configurableProvider.a("Cipher", a.q, a + "$ECB");
        configurableProvider.a("Cipher", a.h, a + "$CBC");
        configurableProvider.a("Cipher", a.m, a + "$CBC");
        configurableProvider.a("Cipher", a.r, a + "$CBC");
        configurableProvider.a("Cipher", a.i, a + "$CFB");
        configurableProvider.a("Cipher", a.n, a + "$CFB");
        configurableProvider.a("Cipher", a.s, a + "$CFB");
        configurableProvider.a("Cipher", a.j, a + "$OFB");
        configurableProvider.a("Cipher", a.o, a + "$OFB");
        configurableProvider.a("Cipher", a.t, a + "$OFB");
        configurableProvider.a("Cipher.ARIARFC3211WRAP", a + "$RFC3211Wrap");
        configurableProvider.a("Cipher.ARIAWRAP", a + "$Wrap");
        configurableProvider.a("Alg.Alias.Cipher", a.H, "ARIAWRAP");
        configurableProvider.a("Alg.Alias.Cipher", a.I, "ARIAWRAP");
        configurableProvider.a("Alg.Alias.Cipher", a.J, "ARIAWRAP");
        configurableProvider.a("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
        configurableProvider.a("Cipher.ARIAWRAPPAD", a + "$WrapPad");
        configurableProvider.a("Alg.Alias.Cipher", a.K, "ARIAWRAPPAD");
        configurableProvider.a("Alg.Alias.Cipher", a.L, "ARIAWRAPPAD");
        configurableProvider.a("Alg.Alias.Cipher", a.M, "ARIAWRAPPAD");
        configurableProvider.a("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
        configurableProvider.a("KeyGenerator.ARIA", a + "$KeyGen");
        configurableProvider.a("KeyGenerator", a.H, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.I, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.J, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.K, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.L, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.M, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.g, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.l, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.q, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.h, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.m, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.r, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.i, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.n, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.s, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.j, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.o, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.t, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.E, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.F, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.G, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.B, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.C, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.D, a + "$KeyGen256");
        configurableProvider.a("SecretKeyFactory.ARIA", a + "$KeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.h, "ARIA");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.m, "ARIA");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.r, "ARIA");
        configurableProvider.a("AlgorithmParameterGenerator.ARIACCM", a + "$AlgParamGenCCM");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.E, "CCM");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.F, "CCM");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.G, "CCM");
        configurableProvider.a("Alg.Alias.Cipher", a.E, "CCM");
        configurableProvider.a("Alg.Alias.Cipher", a.F, "CCM");
        configurableProvider.a("Alg.Alias.Cipher", a.G, "CCM");
        configurableProvider.a("AlgorithmParameterGenerator.ARIAGCM", a + "$AlgParamGenGCM");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.B, "GCM");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.C, "GCM");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.D, "GCM");
        configurableProvider.a("Alg.Alias.Cipher", a.B, "GCM");
        configurableProvider.a("Alg.Alias.Cipher", a.C, "GCM");
        configurableProvider.a("Alg.Alias.Cipher", a.D, "GCM");
        b(configurableProvider, "ARIA", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "ARIA", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
