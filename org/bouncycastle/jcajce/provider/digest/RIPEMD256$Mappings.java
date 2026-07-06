package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.v.p;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD256$Mappings extends DigestAlgorithmProvider {
    private static final String a = RIPEMD256.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.RIPEMD256", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest." + p.d, "RIPEMD256");
        a(configurableProvider, "RIPEMD256", a + "$HashMac", a + "$KeyGenerator");
    }
}
