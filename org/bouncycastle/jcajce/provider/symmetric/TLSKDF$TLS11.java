package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public final class TLSKDF$TLS11 extends TLSKDF$TLSKeyMaterialFactory {
    public TLSKDF$TLS11() {
        super("TLS11KDF");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof TLSKeyMaterialSpec) {
            return new SecretKeySpec(TLSKDF.a((TLSKeyMaterialSpec) keySpec), this.a);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}
