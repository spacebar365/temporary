package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.a.n.c;
import org.bouncycastle.b.ae;
import org.bouncycastle.b.f.aa;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.spec.ScryptKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class SCRYPT$BasePBKDF2 extends BaseSecretKeyFactory {
    private int c;

    public SCRYPT$BasePBKDF2(String str) {
        super(str, c.L);
        this.c = 5;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof ScryptKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        ScryptKeySpec scryptKeySpec = (ScryptKeySpec) keySpec;
        if (scryptKeySpec.b() == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (scryptKeySpec.c() <= 1) {
            throw new IllegalArgumentException("Cost parameter N must be > 1.");
        }
        if (scryptKeySpec.f() <= 0) {
            throw new InvalidKeySpecException("positive key length required: " + scryptKeySpec.f());
        }
        if (scryptKeySpec.a().length == 0) {
            throw new IllegalArgumentException("password empty");
        }
        return new BCPBEKey(this.a, new ba(aa.a(ae.b.a(scryptKeySpec.a()), scryptKeySpec.b(), scryptKeySpec.c(), scryptKeySpec.d(), scryptKeySpec.e(), scryptKeySpec.f() / 8)));
    }
}
