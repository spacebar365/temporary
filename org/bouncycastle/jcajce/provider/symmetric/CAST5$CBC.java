package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.h;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class CAST5$CBC extends BaseBlockCipher {
    public CAST5$CBC() {
        super(new b(new h()), 64);
    }
}
