package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_256_160 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_256_160() {
        super("HMACSkein-256-160", 160, new h());
    }
}
