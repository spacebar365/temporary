package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class IES {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.IES", "org.bouncycastle.jcajce.provider.asymmetric.ies.AlgorithmParametersSpi");
            configurableProvider.mo2853a("AlgorithmParameters.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ies.AlgorithmParametersSpi");
        }
    }
}
