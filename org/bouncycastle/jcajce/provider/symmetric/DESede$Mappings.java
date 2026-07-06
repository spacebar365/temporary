package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class DESede$Mappings extends AlgorithmProvider {
    private static final String a = DESede.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.DESEDE", a + "$ECB");
        configurableProvider.a("Cipher", n.D, a + "$CBC");
        configurableProvider.a("Cipher.DESEDEWRAP", a + "$Wrap");
        configurableProvider.a("Cipher", n.bK, a + "$Wrap");
        configurableProvider.a("Cipher.DESEDERFC3211WRAP", a + "$RFC3211");
        configurableProvider.a("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
        configurableProvider.a("Alg.Alias.Cipher.TDEA", "DESEDE");
        configurableProvider.a("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
        configurableProvider.a("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
        if (configurableProvider.b("MessageDigest", "SHA-1")) {
            configurableProvider.a("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", a + "$PBEWithSHAAndDES3Key");
            configurableProvider.a("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", a + "$BrokePBEWithSHAAndDES3Key");
            configurableProvider.a("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", a + "$OldPBEWithSHAAndDES3Key");
            configurableProvider.a("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", a + "$PBEWithSHAAndDES2Key");
            configurableProvider.a("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", a + "$BrokePBEWithSHAAndDES2Key");
            configurableProvider.a("Alg.Alias.Cipher", n.bF, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher", n.bG, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
        configurableProvider.a("KeyGenerator.DESEDE", a + "$KeyGenerator");
        configurableProvider.a("KeyGenerator." + n.D, a + "$KeyGenerator3");
        configurableProvider.a("KeyGenerator.DESEDEWRAP", a + "$KeyGenerator");
        configurableProvider.a("SecretKeyFactory.DESEDE", a + "$KeyFactory");
        configurableProvider.a("SecretKeyFactory", b.h, a + "$KeyFactory");
        configurableProvider.a("Mac.DESEDECMAC", a + "$CMAC");
        configurableProvider.a("Mac.DESEDEMAC", a + "$CBCMAC");
        configurableProvider.a("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
        configurableProvider.a("Mac.DESEDEMAC/CFB8", a + "$DESedeCFB8");
        configurableProvider.a("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
        configurableProvider.a("Mac.DESEDEMAC64", a + "$DESede64");
        configurableProvider.a("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
        configurableProvider.a("Mac.DESEDEMAC64WITHISO7816-4PADDING", a + "$DESede64with7816d4");
        configurableProvider.a("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableProvider.a("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableProvider.a("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableProvider.a("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.D, "DESEDE");
        configurableProvider.a("AlgorithmParameterGenerator.DESEDE", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + n.D, "DESEDE");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", a + "$PBEWithSHAAndDES3KeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", a + "$PBEWithSHAAndDES2KeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
    }
}
