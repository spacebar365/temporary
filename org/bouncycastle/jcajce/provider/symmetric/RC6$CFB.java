package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.aj;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.d;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class RC6$CFB extends BaseBlockCipher {
    public RC6$CFB() {
        super(new f(new d(new aj(), 128)), 128);
    }
}
