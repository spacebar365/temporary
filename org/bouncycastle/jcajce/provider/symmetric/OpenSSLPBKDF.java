package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.p090f.C0974u;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public final class OpenSSLPBKDF {

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6109a = OpenSSLPBKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF-OPENSSL", f6109a + "$PBKDF");
        }
    }

    public static class PBKDF extends BaseSecretKeyFactory {
        public PBKDF() {
            super("PBKDF-OpenSSL", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                throw new InvalidKeySpecException("missing required salt");
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new IllegalArgumentException("password empty");
            }
            C0974u c0974u = new C0974u();
            c0974u.m2438a(C1560k.m4165b(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
            return new SecretKeySpec(((C1076ba) c0974u.mo1897a(pBEKeySpec.getKeyLength())).m2603a(), "OpenSSLPBKDF");
        }
    }

    private OpenSSLPBKDF() {
    }
}
