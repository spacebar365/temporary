package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class RC2$Mappings extends AlgorithmProvider {
    private static final String a = RC2.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameterGenerator.RC2", a + "$AlgParamGen");
        configurableProvider.a("AlgorithmParameterGenerator.1.2.840.113549.3.2", a + "$AlgParamGen");
        configurableProvider.a("KeyGenerator.RC2", a + "$KeyGenerator");
        configurableProvider.a("KeyGenerator.1.2.840.113549.3.2", a + "$KeyGenerator");
        configurableProvider.a("AlgorithmParameters.RC2", a + "$AlgParams");
        configurableProvider.a("AlgorithmParameters.1.2.840.113549.3.2", a + "$AlgParams");
        configurableProvider.a("Cipher.RC2", a + "$ECB");
        configurableProvider.a("Cipher.RC2WRAP", a + "$Wrap");
        configurableProvider.a("Alg.Alias.Cipher", n.bL, "RC2WRAP");
        configurableProvider.a("Cipher", n.E, a + "$CBC");
        configurableProvider.a("Mac.RC2MAC", a + "$CBCMAC");
        configurableProvider.a("Alg.Alias.Mac.RC2", "RC2MAC");
        configurableProvider.a("Mac.RC2MAC/CFB8", a + "$CFB8MAC");
        configurableProvider.a("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", n.v, "PBEWITHMD2ANDRC2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", n.x, "PBEWITHMD5ANDRC2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", n.z, "PBEWITHSHA1ANDRC2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
        configurableProvider.a("SecretKeyFactory.PBEWITHMD2ANDRC2", a + "$PBEWithMD2KeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHMD5ANDRC2", a + "$PBEWithMD5KeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHA1ANDRC2", a + "$PBEWithSHA1KeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", a + "$PBEWithSHAAnd128BitKeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", a + "$PBEWithSHAAnd40BitKeyFactory");
        configurableProvider.a("Alg.Alias.Cipher", n.v, "PBEWITHMD2ANDRC2");
        configurableProvider.a("Alg.Alias.Cipher", n.x, "PBEWITHMD5ANDRC2");
        configurableProvider.a("Alg.Alias.Cipher", n.z, "PBEWITHSHA1ANDRC2");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.Cipher", n.bH, "PBEWITHSHAAND128BITRC2-CBC");
        configurableProvider.a("Alg.Alias.Cipher", n.bI, "PBEWITHSHAAND40BITRC2-CBC");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
        configurableProvider.a("Cipher.PBEWITHSHA1ANDRC2", a + "$PBEWithSHA1AndRC2");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHAANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
        configurableProvider.a("Cipher.PBEWITHSHAAND128BITRC2-CBC", a + "$PBEWithSHAAnd128BitRC2");
        configurableProvider.a("Cipher.PBEWITHSHAAND40BITRC2-CBC", a + "$PBEWithSHAAnd40BitRC2");
        configurableProvider.a("Cipher.PBEWITHMD5ANDRC2", a + "$PBEWithMD5AndRC2");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
    }
}
