package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.i.d;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SM3$Mappings extends DigestAlgorithmProvider {
    private static final String a = SM3.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SM3", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.SM3", "SM3");
        configurableProvider.a("Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
        configurableProvider.a("Alg.Alias.MessageDigest." + d.ab, "SM3");
    }
}
