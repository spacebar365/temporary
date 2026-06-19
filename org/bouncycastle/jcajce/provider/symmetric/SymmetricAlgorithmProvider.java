package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    SymmetricAlgorithmProvider() {
    }

    /* JADX INFO: renamed from: a */
    protected static void m4442a(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.mo2853a("Mac." + str + "-CMAC", str2);
        configurableProvider.mo2853a("Alg.Alias.Mac." + str + "CMAC", str + "-CMAC");
        configurableProvider.mo2853a("KeyGenerator." + str + "-CMAC", str3);
        configurableProvider.mo2853a("Alg.Alias.KeyGenerator." + str + "CMAC", str + "-CMAC");
    }

    /* JADX INFO: renamed from: b */
    protected static void m4443b(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.mo2853a("Mac." + str + "-GMAC", str2);
        configurableProvider.mo2853a("Alg.Alias.Mac." + str + "GMAC", str + "-GMAC");
        configurableProvider.mo2853a("KeyGenerator." + str + "-GMAC", str3);
        configurableProvider.mo2853a("Alg.Alias.KeyGenerator." + str + "GMAC", str + "-GMAC");
    }

    /* JADX INFO: renamed from: c */
    protected static void m4444c(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.mo2853a("Mac.POLY1305-".concat(String.valueOf(str)), str2);
        configurableProvider.mo2853a("Alg.Alias.Mac.POLY1305".concat(String.valueOf(str)), "POLY1305-".concat(String.valueOf(str)));
        configurableProvider.mo2853a("KeyGenerator.POLY1305-".concat(String.valueOf(str)), str3);
        configurableProvider.mo2853a("Alg.Alias.KeyGenerator.POLY1305".concat(String.valueOf(str)), "POLY1305-".concat(String.valueOf(str)));
    }
}
