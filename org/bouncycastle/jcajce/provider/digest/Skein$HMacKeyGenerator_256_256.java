package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_256_256 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_256_256() {
        super("HMACSkein-256-256", 256, new h());
    }
}
