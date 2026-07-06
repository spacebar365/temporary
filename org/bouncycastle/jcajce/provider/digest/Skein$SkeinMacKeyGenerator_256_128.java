package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
    public Skein$SkeinMacKeyGenerator_256_128() {
        super("Skein-MAC-256-128", 128, new h());
    }
}
