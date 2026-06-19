package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class X509 {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyFactory.X.509", "org.bouncycastle.jcajce.provider.asymmetric.x509.KeyFactory");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.X509", "X.509");
            configurableProvider.mo2853a("CertificateFactory.X.509", "org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory");
            configurableProvider.mo2853a("Alg.Alias.CertificateFactory.X509", "X.509");
        }
    }
}
