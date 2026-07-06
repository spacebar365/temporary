package org.bouncycastle.jcajce.provider.keystore;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class BCFKS$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("KeyStore.BCFKS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$Std");
        configurableProvider.a("KeyStore.BCFKS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$Def");
        configurableProvider.a("KeyStore.IBCFKS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$StdShared");
        configurableProvider.a("KeyStore.IBCFKS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi$DefShared");
    }
}
