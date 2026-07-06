package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class Skein$HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
    public Skein$HMacKeyGenerator_1024_1024() {
        super("HMACSkein-1024-1024", 1024, new h());
    }
}
