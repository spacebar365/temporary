package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.h;
import org.bouncycastle.b.l;
import org.bouncycastle.b.x;

/* JADX INFO: loaded from: classes.dex */
public class BaseKeyGenerator extends KeyGeneratorSpi {
    protected String a;
    protected int b;
    protected int c;
    protected h d;
    protected boolean e = true;

    protected BaseKeyGenerator(String str, int i, h hVar) {
        this.a = str;
        this.c = i;
        this.b = i;
        this.d = hVar;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
        if (this.e) {
            this.d.a(new x(l.a(), this.c));
            this.e = false;
        }
        return new SecretKeySpec(this.d.a(), this.a);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = l.a();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.d.a(new x(secureRandom, i));
        this.e = false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.d.a(new x(secureRandom, this.c));
            this.e = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
