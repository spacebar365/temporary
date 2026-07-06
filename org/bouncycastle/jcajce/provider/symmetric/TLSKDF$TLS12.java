package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.z;
import org.bouncycastle.f.a;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public class TLSKDF$TLS12 extends TLSKDF$TLSKeyMaterialFactory {
    private final z c;

    protected TLSKDF$TLS12(String str, z zVar) {
        super(str);
        this.c = zVar;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof TLSKeyMaterialSpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        TLSKeyMaterialSpec tLSKeyMaterialSpec = (TLSKeyMaterialSpec) keySpec;
        z zVar = this.c;
        byte[] bArrD = a.d(k.d(tLSKeyMaterialSpec.a()), tLSKeyMaterialSpec.d());
        byte[] bArrC = tLSKeyMaterialSpec.c();
        byte[] bArr = new byte[tLSKeyMaterialSpec.b()];
        TLSKDF.a(zVar, bArrC, bArrD, bArr);
        return new SecretKeySpec(bArr, this.a);
    }
}
