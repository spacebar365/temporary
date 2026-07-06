package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class TEA$KeyGen extends BaseKeyGenerator {
    public TEA$KeyGen() {
        super("TEA", 128, new h());
    }
}
