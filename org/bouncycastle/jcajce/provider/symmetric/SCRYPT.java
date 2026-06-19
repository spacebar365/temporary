package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.ScryptKeySpec;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p083b.EnumC0805ae;
import org.bouncycastle.p083b.p090f.C0952aa;
import org.bouncycastle.p083b.p097k.C1076ba;

/* JADX INFO: loaded from: classes.dex */
public class SCRYPT {

    public static class BasePBKDF2 extends BaseSecretKeyFactory {

        /* JADX INFO: renamed from: c */
        private int f6129c;

        public BasePBKDF2(String str) {
            super(str, InterfaceC0645c.f2419L);
            this.f6129c = 5;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof ScryptKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            ScryptKeySpec scryptKeySpec = (ScryptKeySpec) keySpec;
            if (scryptKeySpec.m4507b() == null) {
                throw new IllegalArgumentException("Salt S must be provided.");
            }
            if (scryptKeySpec.m4508c() <= 1) {
                throw new IllegalArgumentException("Cost parameter N must be > 1.");
            }
            if (scryptKeySpec.m4511f() <= 0) {
                throw new InvalidKeySpecException("positive key length required: " + scryptKeySpec.m4511f());
            }
            if (scryptKeySpec.m4506a().length == 0) {
                throw new IllegalArgumentException("password empty");
            }
            return new BCPBEKey(this.f6188a, new C1076ba(C0952aa.m2413a(EnumC0805ae.f3328b.mo1902a(scryptKeySpec.m4506a()), scryptKeySpec.m4507b(), scryptKeySpec.m4508c(), scryptKeySpec.m4509d(), scryptKeySpec.m4510e(), scryptKeySpec.m4511f() / 8)));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6130a = SCRYPT.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("SecretKeyFactory.SCRYPT", f6130a + "$ScryptWithUTF8");
            configurableProvider.mo2855a("SecretKeyFactory", InterfaceC0645c.f2419L, f6130a + "$ScryptWithUTF8");
        }
    }

    public static class ScryptWithUTF8 extends BasePBKDF2 {
        public ScryptWithUTF8() {
            super("SCRYPT");
        }
    }

    private SCRYPT() {
    }
}
