package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Poly1305$Mappings extends AlgorithmProvider {
    private static final String a = Poly1305.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Mac.POLY1305", a + "$Mac");
        configurableProvider.a("KeyGenerator.POLY1305", a + "$KeyGen");
    }
}
