package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class MD2$Mappings extends DigestAlgorithmProvider {
    private static final String a = MD2.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.MD2", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest." + n.H, "MD2");
        a(configurableProvider, "MD2", a + "$HashMac", a + "$KeyGenerator");
    }
}
