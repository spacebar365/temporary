package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_1024_512() {
        super("HMACSkein-1024-512", 512, new h());
    }
}
