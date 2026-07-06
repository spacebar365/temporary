package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.r;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624$CBC256 extends BaseBlockCipher {
    public DSTU7624$CBC256() {
        super(new b(new r(256)), 256);
    }
}
