package org.bouncycastle.jcajce.provider.drbg;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class DRBG$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("SecureRandom.DEFAULT", DRBG.c() + "$Default");
        configurableProvider.a("SecureRandom.NONCEANDIV", DRBG.c() + "$NonceAndIV");
    }
}
