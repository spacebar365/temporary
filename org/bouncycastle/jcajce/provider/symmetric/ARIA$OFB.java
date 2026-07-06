package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.d;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.s;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class ARIA$OFB extends BaseBlockCipher {
    public ARIA$OFB() {
        super(new f(new s(new d(), 128)), 128);
    }
}
