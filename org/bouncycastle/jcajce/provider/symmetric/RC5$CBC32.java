package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ah;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class RC5$CBC32 extends BaseBlockCipher {
    public RC5$CBC32() {
        super(new b(new ah()), 64);
    }
}
