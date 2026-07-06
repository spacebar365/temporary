package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7564$KeyGenerator384 extends BaseKeyGenerator {
    public DSTU7564$KeyGenerator384() {
        super("HMACDSTU7564-384", 384, new h());
    }
}
