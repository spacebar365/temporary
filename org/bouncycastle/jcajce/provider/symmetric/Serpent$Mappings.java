package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.j.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = Serpent.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.Serpent", a + "$ECB");
        configurableProvider.a("KeyGenerator.Serpent", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.Serpent", a + "$AlgParams");
        configurableProvider.a("Cipher.Tnepres", a + "$TECB");
        configurableProvider.a("KeyGenerator.Tnepres", a + "$TKeyGen");
        configurableProvider.a("AlgorithmParameters.Tnepres", a + "$TAlgParams");
        configurableProvider.a("Cipher", a.j, a + "$ECB");
        configurableProvider.a("Cipher", a.n, a + "$ECB");
        configurableProvider.a("Cipher", a.r, a + "$ECB");
        configurableProvider.a("Cipher", a.k, a + "$CBC");
        configurableProvider.a("Cipher", a.o, a + "$CBC");
        configurableProvider.a("Cipher", a.s, a + "$CBC");
        configurableProvider.a("Cipher", a.m, a + "$CFB");
        configurableProvider.a("Cipher", a.q, a + "$CFB");
        configurableProvider.a("Cipher", a.u, a + "$CFB");
        configurableProvider.a("Cipher", a.l, a + "$OFB");
        configurableProvider.a("Cipher", a.p, a + "$OFB");
        configurableProvider.a("Cipher", a.t, a + "$OFB");
        b(configurableProvider, "SERPENT", a + "$SerpentGMAC", a + "$KeyGen");
        b(configurableProvider, "TNEPRES", a + "$TSerpentGMAC", a + "$TKeyGen");
        c(configurableProvider, "SERPENT", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
