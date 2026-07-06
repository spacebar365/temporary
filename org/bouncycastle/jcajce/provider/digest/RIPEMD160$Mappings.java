package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.k.a;
import org.bouncycastle.a.v.p;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD160$Mappings extends DigestAlgorithmProvider {
    private static final String a = RIPEMD160.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.RIPEMD160", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest." + p.b, "RIPEMD160");
        a(configurableProvider, "RIPEMD160", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "RIPEMD160", a.q);
        configurableProvider.a("SecretKeyFactory.PBEWITHHMACRIPEMD160", a + "$PBEWithHmacKeyFactory");
        configurableProvider.a("Mac.PBEWITHHMACRIPEMD160", a + "$PBEWithHmac");
    }
}
