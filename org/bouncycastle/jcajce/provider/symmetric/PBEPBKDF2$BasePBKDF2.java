package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;
import org.bouncycastle.b.ae;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE$Util;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;

/* JADX INFO: loaded from: classes.dex */
public class PBEPBKDF2$BasePBKDF2 extends BaseSecretKeyFactory {
    private int c;
    private int d;

    public PBEPBKDF2$BasePBKDF2(String str, int i) {
        this(str, i, 1);
    }

    public PBEPBKDF2$BasePBKDF2(String str, int i, int i2) {
        super(str, n.B);
        this.c = i;
        this.d = i2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new PBKDF2Key(((PBEKeySpec) keySpec).getPassword(), this.c == 1 ? ae.a : ae.b);
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
        if (!(pBEKeySpec instanceof PBKDF2KeySpec)) {
            int i = this.d;
            int keyLength = pBEKeySpec.getKeyLength();
            return new BCPBEKey(this.a, this.b, this.c, i, keyLength, -1, pBEKeySpec, PBE$Util.a(pBEKeySpec, this.c, i, keyLength));
        }
        p pVarA = ((PBKDF2KeySpec) pBEKeySpec).a().a();
        Integer num = (Integer) PBEPBKDF2.a().get(pVarA);
        if (num == null) {
            throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm ".concat(String.valueOf(pVarA)));
        }
        int iIntValue = num.intValue();
        int keyLength2 = pBEKeySpec.getKeyLength();
        return new BCPBEKey(this.a, this.b, this.c, iIntValue, keyLength2, -1, pBEKeySpec, PBE$Util.a(pBEKeySpec, this.c, iIntValue, keyLength2));
    }
}
