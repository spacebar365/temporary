package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.aq;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class SEED$CBC extends BaseBlockCipher {
    public SEED$CBC() {
        super(new b(new aq()), 128);
    }
}
