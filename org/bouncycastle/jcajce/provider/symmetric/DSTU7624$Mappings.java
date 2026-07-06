package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.w.f;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = DSTU7624.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.DSTU7624", a + "$AlgParams128");
        configurableProvider.a("AlgorithmParameters", f.v, a + "$AlgParams");
        configurableProvider.a("AlgorithmParameters", f.w, a + "$AlgParams");
        configurableProvider.a("AlgorithmParameters", f.x, a + "$AlgParams");
        configurableProvider.a("AlgorithmParameterGenerator.DSTU7624", a + "$AlgParamGen128");
        configurableProvider.a("AlgorithmParameterGenerator", f.v, a + "$AlgParamGen128");
        configurableProvider.a("AlgorithmParameterGenerator", f.w, a + "$AlgParamGen256");
        configurableProvider.a("AlgorithmParameterGenerator", f.x, a + "$AlgParamGen512");
        configurableProvider.a("Cipher.DSTU7624", a + "$ECB_128");
        configurableProvider.a("Cipher.DSTU7624-128", a + "$ECB_128");
        configurableProvider.a("Cipher.DSTU7624-256", a + "$ECB_256");
        configurableProvider.a("Cipher.DSTU7624-512", a + "$ECB_512");
        configurableProvider.a("Cipher", f.j, a + "$ECB128");
        configurableProvider.a("Cipher", f.k, a + "$ECB256");
        configurableProvider.a("Cipher", f.l, a + "$ECB512");
        configurableProvider.a("Cipher", f.v, a + "$CBC128");
        configurableProvider.a("Cipher", f.w, a + "$CBC256");
        configurableProvider.a("Cipher", f.x, a + "$CBC512");
        configurableProvider.a("Cipher", f.y, a + "$OFB128");
        configurableProvider.a("Cipher", f.z, a + "$OFB256");
        configurableProvider.a("Cipher", f.A, a + "$OFB512");
        configurableProvider.a("Cipher", f.p, a + "$CFB128");
        configurableProvider.a("Cipher", f.q, a + "$CFB256");
        configurableProvider.a("Cipher", f.r, a + "$CFB512");
        configurableProvider.a("Cipher", f.m, a + "$CTR128");
        configurableProvider.a("Cipher", f.n, a + "$CTR256");
        configurableProvider.a("Cipher", f.o, a + "$CTR512");
        configurableProvider.a("Cipher", f.E, a + "$CCM128");
        configurableProvider.a("Cipher", f.F, a + "$CCM256");
        configurableProvider.a("Cipher", f.G, a + "$CCM512");
        configurableProvider.a("Cipher.DSTU7624KW", a + "$Wrap");
        configurableProvider.a("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
        configurableProvider.a("Cipher.DSTU7624-128KW", a + "$Wrap128");
        configurableProvider.a("Alg.Alias.Cipher." + f.K.b(), "DSTU7624-128KW");
        configurableProvider.a("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
        configurableProvider.a("Cipher.DSTU7624-256KW", a + "$Wrap256");
        configurableProvider.a("Alg.Alias.Cipher." + f.L.b(), "DSTU7624-256KW");
        configurableProvider.a("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
        configurableProvider.a("Cipher.DSTU7624-512KW", a + "$Wrap512");
        configurableProvider.a("Alg.Alias.Cipher." + f.M.b(), "DSTU7624-512KW");
        configurableProvider.a("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
        configurableProvider.a("Mac.DSTU7624GMAC", a + "$GMAC");
        configurableProvider.a("Mac.DSTU7624-128GMAC", a + "$GMAC128");
        configurableProvider.a("Alg.Alias.Mac." + f.B.b(), "DSTU7624-128GMAC");
        configurableProvider.a("Mac.DSTU7624-256GMAC", a + "$GMAC256");
        configurableProvider.a("Alg.Alias.Mac." + f.C.b(), "DSTU7624-256GMAC");
        configurableProvider.a("Mac.DSTU7624-512GMAC", a + "$GMAC512");
        configurableProvider.a("Alg.Alias.Mac." + f.D.b(), "DSTU7624-512GMAC");
        configurableProvider.a("KeyGenerator.DSTU7624", a + "$KeyGen");
        configurableProvider.a("KeyGenerator", f.K, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.L, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.M, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.j, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.k, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.l, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.v, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.w, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.x, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.y, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.z, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.A, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.p, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.q, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.r, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.m, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.n, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.o, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.E, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.F, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.G, a + "$KeyGen512");
        configurableProvider.a("KeyGenerator", f.B, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", f.C, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", f.D, a + "$KeyGen512");
    }
}
