package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
    public Skein$SkeinMacKeyGenerator_512_384() {
        super("Skein-MAC-512-384", 384, new h());
    }
}
