package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class PBEPBKDF2$Mappings extends AlgorithmProvider {
    private static final String a = PBEPBKDF2.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.PBKDF2", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + n.B, "PBKDF2");
        configurableProvider.a("SecretKeyFactory.PBKDF2", a + "$PBKDF2withUTF8");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + n.B, "PBKDF2");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHASCII", a + "$PBKDF2with8BIT");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA224", a + "$PBKDF2withSHA224");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA256", a + "$PBKDF2withSHA256");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA384", a + "$PBKDF2withSHA384");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA512", a + "$PBKDF2withSHA512");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA3-224", a + "$PBKDF2withSHA3_224");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA3-256", a + "$PBKDF2withSHA3_256");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA3-384", a + "$PBKDF2withSHA3_384");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACSHA3-512", a + "$PBKDF2withSHA3_512");
        configurableProvider.a("SecretKeyFactory.PBKDF2WITHHMACGOST3411", a + "$PBKDF2withGOST3411");
    }
}
