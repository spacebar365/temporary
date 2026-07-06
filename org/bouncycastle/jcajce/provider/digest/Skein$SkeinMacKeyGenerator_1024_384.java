package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
    public Skein$SkeinMacKeyGenerator_1024_384() {
        super("Skein-MAC-1024-384", 384, new h());
    }
}
