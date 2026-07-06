package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7564$KeyGenerator256 extends BaseKeyGenerator {
    public DSTU7564$KeyGenerator256() {
        super("HMACDSTU7564-256", 256, new h());
    }
}
