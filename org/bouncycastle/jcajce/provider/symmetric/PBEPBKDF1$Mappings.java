package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class PBEPBKDF1$Mappings extends AlgorithmProvider {
    private static final String a = PBEPBKDF1.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.PBKDF1", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.t_, "PBKDF1");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.w, "PBKDF1");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.x, "PBKDF1");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.y, "PBKDF1");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.z, "PBKDF1");
    }
}
