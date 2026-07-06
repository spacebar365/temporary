package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class DESede$KeyFactory extends BaseSecretKeyFactory {
    public DESede$KeyFactory() {
        super("DESede", null);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) {
        return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        DESedeKeySpec dESedeKeySpec;
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.a);
        }
        if (!DESedeKeySpec.class.isAssignableFrom(cls)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        byte[] encoded = secretKey.getEncoded();
        try {
            if (encoded.length == 16) {
                byte[] bArr = new byte[24];
                System.arraycopy(encoded, 0, bArr, 0, 16);
                System.arraycopy(encoded, 0, bArr, 16, 8);
                dESedeKeySpec = new DESedeKeySpec(bArr);
            } else {
                dESedeKeySpec = new DESedeKeySpec(encoded);
            }
            return dESedeKeySpec;
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }
}
