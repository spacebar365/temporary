package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624$KeyGen extends BaseKeyGenerator {
    public DSTU7624$KeyGen() {
        this(256);
    }

    public DSTU7624$KeyGen(int i) {
        super("DSTU7624", i, new h());
    }
}
