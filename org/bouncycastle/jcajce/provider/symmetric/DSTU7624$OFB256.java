package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.r;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.s;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624$OFB256 extends BaseBlockCipher {
    public DSTU7624$OFB256() {
        super(new f(new s(new r(256), 256)), 256);
    }
}
