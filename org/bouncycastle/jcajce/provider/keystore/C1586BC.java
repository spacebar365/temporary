package org.bouncycastle.jcajce.provider.keystore;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.keystore.BC */
/* JADX INFO: loaded from: classes.dex */
public class C1586BC {

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.keystore.BC$Mappings */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyStore.BKS", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$Std");
            configurableProvider.mo2853a("KeyStore.BKS-V1", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$Version1");
            configurableProvider.mo2853a("KeyStore.BouncyCastle", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$BouncyCastleStore");
            configurableProvider.mo2853a("Alg.Alias.KeyStore.UBER", "BouncyCastle");
            configurableProvider.mo2853a("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
            configurableProvider.mo2853a("Alg.Alias.KeyStore.bouncycastle", "BouncyCastle");
        }
    }
}
