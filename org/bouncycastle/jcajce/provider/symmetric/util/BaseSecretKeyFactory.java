package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: loaded from: classes.dex */
public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {

    /* JADX INFO: renamed from: a */
    protected String f6188a;

    /* JADX INFO: renamed from: b */
    protected C0653p f6189b;

    protected BaseSecretKeyFactory(String str, C0653p c0653p) {
        this.f6188a = str;
        this.f6189b = c0653p;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec) keySpec).getEncoded(), this.f6188a);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretKey == null) {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (SecretKeySpec.class.isAssignableFrom(cls)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.f6188a);
        }
        try {
            return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("key parameter is null");
        }
        if (secretKey.getAlgorithm().equalsIgnoreCase(this.f6188a)) {
            return new SecretKeySpec(secretKey.getEncoded(), this.f6188a);
        }
        throw new InvalidKeyException("Key not of type " + this.f6188a + ".");
    }
}
