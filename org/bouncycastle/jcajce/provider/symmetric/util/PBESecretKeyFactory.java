package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.a.p;

/* JADX INFO: loaded from: classes.dex */
public class PBESecretKeyFactory extends BaseSecretKeyFactory implements PBE {
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;

    public PBESecretKeyFactory(String str, p pVar, boolean z, int i, int i2, int i3, int i4) {
        super(str, pVar);
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new BCPBEKey(this.a, this.b, this.d, this.e, this.f, this.g, pBEKeySpec, null);
        }
        return new BCPBEKey(this.a, this.b, this.d, this.e, this.f, this.g, pBEKeySpec, this.c ? PBE$Util.a(pBEKeySpec, this.d, this.e, this.f, this.g) : PBE$Util.a(pBEKeySpec, this.d, this.e, this.f));
    }
}
