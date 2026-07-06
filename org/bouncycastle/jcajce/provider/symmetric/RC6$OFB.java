package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.aj;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.s;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class RC6$OFB extends BaseBlockCipher {
    public RC6$OFB() {
        super(new f(new s(new aj(), 128)), 128);
    }
}
