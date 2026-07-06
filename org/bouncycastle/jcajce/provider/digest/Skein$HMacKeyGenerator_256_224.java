package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_256_224 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_256_224() {
        super("HMACSkein-256-224", 224, new h());
    }
}
