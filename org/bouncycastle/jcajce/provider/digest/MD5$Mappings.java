package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.k.a;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class MD5$Mappings extends DigestAlgorithmProvider {
    private static final String a = MD5.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.MD5", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest." + n.J, "MD5");
        a(configurableProvider, "MD5", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "MD5", a.n);
    }
}
