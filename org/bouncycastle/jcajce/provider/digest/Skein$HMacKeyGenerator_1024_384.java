package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_1024_384() {
        super("HMACSkein-1024-384", 384, new h());
    }
}
