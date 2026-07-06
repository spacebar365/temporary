package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.aj;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class RC6$CBC extends BaseBlockCipher {
    public RC6$CBC() {
        super(new b(new aj()), 128);
    }
}
