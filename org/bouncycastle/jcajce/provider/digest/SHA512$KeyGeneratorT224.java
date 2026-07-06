package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SHA512$KeyGeneratorT224 extends BaseKeyGenerator {
    public SHA512$KeyGeneratorT224() {
        super("HMACSHA512/224", 224, new h());
    }
}
