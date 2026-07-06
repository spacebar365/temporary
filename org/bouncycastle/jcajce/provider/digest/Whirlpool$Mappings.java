package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.l.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Whirlpool$Mappings extends DigestAlgorithmProvider {
    private static final String a = Whirlpool.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.WHIRLPOOL", a + "$Digest");
        configurableProvider.a("MessageDigest", a.e, a + "$Digest");
        a(configurableProvider, "WHIRLPOOL", a + "$HashMac", a + "$KeyGenerator");
    }
}
