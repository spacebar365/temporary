package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SEED$KeyGen extends BaseKeyGenerator {
    public SEED$KeyGen() {
        super("SEED", 128, new h());
    }
}
