package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class ARC4$Mappings extends AlgorithmProvider {
    private static final String a = ARC4.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.ARC4", a + "$Base");
        configurableProvider.a("Alg.Alias.Cipher", n.F, "ARC4");
        configurableProvider.a("Alg.Alias.Cipher.ARCFOUR", "ARC4");
        configurableProvider.a("Alg.Alias.Cipher.RC4", "ARC4");
        configurableProvider.a("KeyGenerator.ARC4", a + "$KeyGen");
        configurableProvider.a("Alg.Alias.KeyGenerator.RC4", "ARC4");
        configurableProvider.a("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAAND128BITRC4", a + "$PBEWithSHAAnd128BitKeyFactory");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAAND40BITRC4", a + "$PBEWithSHAAnd40BitKeyFactory");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.bD, "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.bE, "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
        configurableProvider.a("Cipher.PBEWITHSHAAND128BITRC4", a + "$PBEWithSHAAnd128Bit");
        configurableProvider.a("Cipher.PBEWITHSHAAND40BITRC4", a + "$PBEWithSHAAnd40Bit");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", n.bD, "PBEWITHSHAAND128BITRC4");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", n.bE, "PBEWITHSHAAND40BITRC4");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
        configurableProvider.a("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
        configurableProvider.a("Alg.Alias.Cipher", n.bD, "PBEWITHSHAAND128BITRC4");
        configurableProvider.a("Alg.Alias.Cipher", n.bE, "PBEWITHSHAAND40BITRC4");
    }
}
