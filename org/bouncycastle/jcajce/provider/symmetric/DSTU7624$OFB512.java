package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.r;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.s;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624$OFB512 extends BaseBlockCipher {
    public DSTU7624$OFB512() {
        super(new f(new s(new r(512), 512)), 512);
    }
}
