package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    SymmetricAlgorithmProvider() {
    }

    protected static void a(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.a("Mac." + str + "-CMAC", str2);
        configurableProvider.a("Alg.Alias.Mac." + str + "CMAC", str + "-CMAC");
        configurableProvider.a("KeyGenerator." + str + "-CMAC", str3);
        configurableProvider.a("Alg.Alias.KeyGenerator." + str + "CMAC", str + "-CMAC");
    }

    protected static void b(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.a("Mac." + str + "-GMAC", str2);
        configurableProvider.a("Alg.Alias.Mac." + str + "GMAC", str + "-GMAC");
        configurableProvider.a("KeyGenerator." + str + "-GMAC", str3);
        configurableProvider.a("Alg.Alias.KeyGenerator." + str + "GMAC", str + "-GMAC");
    }

    protected static void c(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.a("Mac.POLY1305-".concat(String.valueOf(str)), str2);
        configurableProvider.a("Alg.Alias.Mac.POLY1305".concat(String.valueOf(str)), "POLY1305-".concat(String.valueOf(str)));
        configurableProvider.a("KeyGenerator.POLY1305-".concat(String.valueOf(str)), str3);
        configurableProvider.a("Alg.Alias.KeyGenerator.POLY1305".concat(String.valueOf(str)), "POLY1305-".concat(String.valueOf(str)));
    }
}
