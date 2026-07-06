package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.h;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public class CAST5$KeyGen extends BaseKeyGenerator {
    public CAST5$KeyGen() {
        super("CAST5", 128, new h());
    }
}
