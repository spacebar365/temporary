package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: loaded from: classes.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    DigestAlgorithmProvider() {
    }

    /* JADX INFO: renamed from: a */
    protected static void m4367a(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strConcat = "HMAC".concat(String.valueOf(str));
        configurableProvider.mo2853a("Mac.".concat(String.valueOf(strConcat)), str2);
        configurableProvider.mo2853a("Alg.Alias.Mac.HMAC-".concat(String.valueOf(str)), strConcat);
        configurableProvider.mo2853a("Alg.Alias.Mac.HMAC/".concat(String.valueOf(str)), strConcat);
        configurableProvider.mo2853a("KeyGenerator.".concat(String.valueOf(strConcat)), str3);
        configurableProvider.mo2853a("Alg.Alias.KeyGenerator.HMAC-".concat(String.valueOf(str)), strConcat);
        configurableProvider.mo2853a("Alg.Alias.KeyGenerator.HMAC/".concat(String.valueOf(str)), strConcat);
    }

    /* JADX INFO: renamed from: a */
    protected static void m4368a(ConfigurableProvider configurableProvider, String str, C0653p c0653p) {
        String strConcat = "HMAC".concat(String.valueOf(str));
        configurableProvider.mo2853a("Alg.Alias.Mac.".concat(String.valueOf(c0653p)), strConcat);
        configurableProvider.mo2853a("Alg.Alias.KeyGenerator.".concat(String.valueOf(c0653p)), strConcat);
    }
}
