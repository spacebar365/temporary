package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA3$KeyGeneratorSHA3 extends BaseKeyGenerator {
    public SHA3$KeyGeneratorSHA3(int i) {
        super("HMACSHA3-".concat(String.valueOf(i)), i, new h());
    }
}
