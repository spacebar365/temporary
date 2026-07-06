package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class CAST6$KeyGen extends BaseKeyGenerator {
    public CAST6$KeyGen() {
        super("CAST6", 256, new h());
    }
}
