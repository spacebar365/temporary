package org.bouncycastle.jcajce.provider.util;

import org.bouncycastle.a.p;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    protected static void a(ConfigurableProvider configurableProvider, String str, String str2, String str3, p pVar) {
        String str4 = str + "WITH" + str2;
        configurableProvider.a("Signature.".concat(String.valueOf(str4)), str3);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "with" + str2)), str4);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "With" + str2)), str4);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(str + "/" + str2)), str4);
        configurableProvider.a("Alg.Alias.Signature.".concat(String.valueOf(pVar)), str4);
        configurableProvider.a("Alg.Alias.Signature.OID.".concat(String.valueOf(pVar)), str4);
    }

    protected static void a(ConfigurableProvider configurableProvider, p pVar, String str) {
        configurableProvider.a("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(pVar)), str);
    }

    protected static void a(ConfigurableProvider configurableProvider, p pVar, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.a("Alg.Alias.KeyFactory.".concat(String.valueOf(pVar)), str);
        configurableProvider.a("Alg.Alias.KeyPairGenerator.".concat(String.valueOf(pVar)), str);
        configurableProvider.a(pVar, asymmetricKeyInfoConverter);
    }

    protected static void b(ConfigurableProvider configurableProvider, p pVar, String str) {
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator.".concat(String.valueOf(pVar)), str);
        configurableProvider.a("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(pVar)), str);
    }
}
