package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.f.u;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class OpenSSLPBKDF$PBKDF extends BaseSecretKeyFactory {
    public OpenSSLPBKDF$PBKDF() {
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
        u uVar = new u();
        uVar.a(k.b(pBEKeySpec.getPassword()), pBEKeySpec.getSalt());
        return new SecretKeySpec(((ba) uVar.a(pBEKeySpec.getKeyLength())).a(), "OpenSSLPBKDF");
    }
}
