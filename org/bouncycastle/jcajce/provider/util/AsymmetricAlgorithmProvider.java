package org.bouncycastle.jcajce.provider.util;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    /* JADX INFO: renamed from: a */
    protected static void m4475a(ConfigurableProvider configurableProvider, String str, String str2, String str3, C0653p c0653p) {
        String str4 = str + "WITH" + str2;
        configurableProvider.mo2853a("Signature.".concat(String.valueOf(str4)), str3);
        configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "with" + str2)), str4);
        configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "With" + str2)), str4);
        configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(str + "/" + str2)), str4);
        configurableProvider.mo2853a("Alg.Alias.Signature.".concat(String.valueOf(c0653p)), str4);
        configurableProvider.mo2853a("Alg.Alias.Signature.OID.".concat(String.valueOf(c0653p)), str4);
    }

    /* JADX INFO: renamed from: a */
    protected static void m4476a(ConfigurableProvider configurableProvider, C0653p c0653p, String str) {
        configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(c0653p)), str);
    }

    /* JADX INFO: renamed from: a */
    protected static void m4477a(ConfigurableProvider configurableProvider, C0653p c0653p, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.mo2853a("Alg.Alias.KeyFactory.".concat(String.valueOf(c0653p)), str);
        configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.".concat(String.valueOf(c0653p)), str);
        configurableProvider.mo2856a(c0653p, asymmetricKeyInfoConverter);
    }

    /* JADX INFO: renamed from: b */
    protected static void m4478b(ConfigurableProvider configurableProvider, C0653p c0653p, String str) {
        configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.".concat(String.valueOf(c0653p)), str);
        configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(c0653p)), str);
    }
}
