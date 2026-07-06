package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA512$KeyGeneratorT256 extends BaseKeyGenerator {
    public SHA512$KeyGeneratorT256() {
        super("HMACSHA512/256", 256, new h());
    }
}
