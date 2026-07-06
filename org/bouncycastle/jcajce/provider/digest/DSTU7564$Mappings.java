package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.w.f;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7564$Mappings extends DigestAlgorithmProvider {
    private static final String a = DSTU7564.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.DSTU7564-256", a + "$Digest256");
        configurableProvider.a("MessageDigest.DSTU7564-384", a + "$Digest384");
        configurableProvider.a("MessageDigest.DSTU7564-512", a + "$Digest512");
        configurableProvider.a("MessageDigest", f.d, a + "$Digest256");
        configurableProvider.a("MessageDigest", f.e, a + "$Digest384");
        configurableProvider.a("MessageDigest", f.f, a + "$Digest512");
        a(configurableProvider, "DSTU7564-256", a + "$HashMac256", a + "$KeyGenerator256");
        a(configurableProvider, "DSTU7564-384", a + "$HashMac384", a + "$KeyGenerator384");
        a(configurableProvider, "DSTU7564-512", a + "$HashMac512", a + "$KeyGenerator512");
        a(configurableProvider, "DSTU7564-256", f.g);
        a(configurableProvider, "DSTU7564-384", f.h);
        a(configurableProvider, "DSTU7564-512", f.i);
    }
}
