package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.v.p;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD128$Mappings extends DigestAlgorithmProvider {
    private static final String a = RIPEMD128.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.RIPEMD128", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest." + p.c, "RIPEMD128");
        a(configurableProvider, "RIPEMD128", a + "$HashMac", a + "$KeyGenerator");
    }
}
