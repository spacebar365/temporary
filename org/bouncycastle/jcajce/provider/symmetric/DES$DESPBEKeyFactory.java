package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.a.p;
import org.bouncycastle.b.ae;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.c;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE$Util;

/* JADX INFO: loaded from: classes.dex */
public class DES$DESPBEKeyFactory extends BaseSecretKeyFactory {
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;

    public DES$DESPBEKeyFactory(String str, p pVar, int i, int i2, int i3) {
        super(str, pVar);
        this.c = true;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = 64;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() != null) {
            i iVarA = this.c ? PBE$Util.a(pBEKeySpec, this.d, this.e, this.f, this.g) : PBE$Util.a(pBEKeySpec, this.d, this.e, this.f);
            c.a((iVarA instanceof be ? (ba) ((be) iVarA).b() : (ba) iVarA).a());
            return new BCPBEKey(this.a, this.b, this.d, this.e, this.f, this.g, pBEKeySpec, iVarA);
        }
        if (this.d == 0 || this.d == 4) {
            return new PBKDF1Key(pBEKeySpec.getPassword(), this.d == 0 ? ae.a : ae.b);
        }
        return new BCPBEKey(this.a, this.b, this.d, this.e, this.f, this.g, pBEKeySpec, null);
    }
}
