package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.p;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class DES$Mappings extends AlgorithmProvider {
    private static final String a = DES.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.DES", a + "$ECB");
        configurableProvider.a("Cipher", b.e, a + "$CBC");
        p pVar = b.e;
        configurableProvider.a("Alg.Alias.KeyGenerator." + pVar.b(), "DES");
        configurableProvider.a("Alg.Alias.KeyFactory." + pVar.b(), "DES");
        configurableProvider.a("Cipher.DESRFC3211WRAP", a + "$RFC3211");
        configurableProvider.a("KeyGenerator.DES", a + "$KeyGenerator");
        configurableProvider.a("SecretKeyFactory.DES", a + "$KeyFactory");
        configurableProvider.a("Mac.DESCMAC", a + "$CMAC");
        configurableProvider.a("Mac.DESMAC", a + "$CBCMAC");
        configurableProvider.a("Alg.Alias.Mac.DES", "DESMAC");
        configurableProvider.a("Mac.DESMAC/CFB8", a + "$DESCFB8");
        configurableProvider.a("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
        configurableProvider.a("Mac.DESMAC64", a + "$DES64");
        configurableProvider.a("Alg.Alias.Mac.DES64", "DESMAC64");
        configurableProvider.a("Mac.DESMAC64WITHISO7816-4PADDING", a + "$DES64with7816d4");
        configurableProvider.a("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableProvider.a("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableProvider.a("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableProvider.a("Mac.DESWITHISO9797", a + "$DES9797Alg3");
        configurableProvider.a("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
        configurableProvider.a("Mac.ISO9797ALG3MAC", a + "$DES9797Alg3");
        configurableProvider.a("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
        configurableProvider.a("Mac.ISO9797ALG3WITHISO7816-4PADDING", a + "$DES9797Alg3with7816d4");
        configurableProvider.a("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
        configurableProvider.a("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", b.e, "DES");
        configurableProvider.a("AlgorithmParameterGenerator.DES", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + b.e, "DES");
        configurableProvider.a("Cipher.PBEWITHMD2ANDDES", a + "$PBEWithMD2");
        configurableProvider.a("Cipher.PBEWITHMD5ANDDES", a + "$PBEWithMD5");
        configurableProvider.a("Cipher.PBEWITHSHA1ANDDES", a + "$PBEWithSHA1");
        configurableProvider.a("Alg.Alias.Cipher", n.t_, "PBEWITHMD2ANDDES");
        configurableProvider.a("Alg.Alias.Cipher", n.w, "PBEWITHMD5ANDDES");
        configurableProvider.a("Alg.Alias.Cipher", n.y, "PBEWITHSHA1ANDDES");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        configurableProvider.a("SecretKeyFactory.PBEWITHMD2ANDDES", a + "$PBEWithMD2KeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHMD5ANDDES", a + "$PBEWithMD5KeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHA1ANDDES", a + "$PBEWithSHA1KeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + n.t_, "PBEWITHMD2ANDDES");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + n.w, "PBEWITHMD5ANDDES");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + n.y, "PBEWITHSHA1ANDDES");
    }
}
