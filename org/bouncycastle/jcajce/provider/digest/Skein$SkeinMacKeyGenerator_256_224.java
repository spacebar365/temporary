package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
    public Skein$SkeinMacKeyGenerator_256_224() {
        super("Skein-MAC-256-224", 224, new h());
    }
}
