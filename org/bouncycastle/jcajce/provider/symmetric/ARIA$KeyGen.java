package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class ARIA$KeyGen extends BaseKeyGenerator {
    public ARIA$KeyGen() {
        this(256);
    }

    public ARIA$KeyGen(int i) {
        super("ARIA", i, new h());
    }
}
