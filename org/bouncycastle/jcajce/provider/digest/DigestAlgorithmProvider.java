package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.p;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    DigestAlgorithmProvider() {
    }

    protected static void a(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strConcat = "HMAC".concat(String.valueOf(str));
        configurableProvider.a("Mac.".concat(String.valueOf(strConcat)), str2);
        configurableProvider.a("Alg.Alias.Mac.HMAC-".concat(String.valueOf(str)), strConcat);
        configurableProvider.a("Alg.Alias.Mac.HMAC/".concat(String.valueOf(str)), strConcat);
        configurableProvider.a("KeyGenerator.".concat(String.valueOf(strConcat)), str3);
        configurableProvider.a("Alg.Alias.KeyGenerator.HMAC-".concat(String.valueOf(str)), strConcat);
        configurableProvider.a("Alg.Alias.KeyGenerator.HMAC/".concat(String.valueOf(str)), strConcat);
    }

    protected static void a(ConfigurableProvider configurableProvider, String str, p pVar) {
        String strConcat = "HMAC".concat(String.valueOf(str));
        configurableProvider.a("Alg.Alias.Mac.".concat(String.valueOf(pVar)), strConcat);
        configurableProvider.a("Alg.Alias.KeyGenerator.".concat(String.valueOf(pVar)), strConcat);
    }
}
