package org.bouncycastle.jcajce.provider.symmetric;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.f.c;
import org.bouncycastle.b.l;
import org.bouncycastle.b.x;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class DESede$KeyGenerator extends BaseKeyGenerator {
    private boolean f;

    public DESede$KeyGenerator() {
        super("DESede", 192, new c());
        this.f = false;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
        if (this.e) {
            this.d.a(new x(l.a(), this.c));
            this.e = false;
        }
        if (this.f) {
            return new SecretKeySpec(this.d.a(), this.a);
        }
        byte[] bArrA = this.d.a();
        System.arraycopy(bArrA, 0, bArrA, 16, 8);
        return new SecretKeySpec(bArrA, this.a);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        super.engineInit(i, secureRandom);
        this.f = true;
    }
}
