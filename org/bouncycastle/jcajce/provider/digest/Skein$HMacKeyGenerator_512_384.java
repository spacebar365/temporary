package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_512_384 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_512_384() {
        super("HMACSkein-512-384", 384, new h());
    }
}
