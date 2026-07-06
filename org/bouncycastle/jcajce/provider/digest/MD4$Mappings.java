package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class MD4$Mappings extends DigestAlgorithmProvider {
    private static final String a = MD4.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.MD4", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest." + n.I, "MD4");
        a(configurableProvider, "MD4", a + "$HashMac", a + "$KeyGenerator");
    }
}
