package org.bouncycastle.jcajce.provider.symmetric;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.b.f.b;
import org.bouncycastle.b.l;
import org.bouncycastle.b.x;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class DES$KeyGenerator extends BaseKeyGenerator {
    public DES$KeyGenerator() {
        super("DES", 64, new b());
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() {
        if (this.e) {
            this.d.a(new x(l.a(), this.c));
            this.e = false;
        }
        return new SecretKeySpec(this.d.a(), this.a);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        super.engineInit(i, secureRandom);
    }
}
