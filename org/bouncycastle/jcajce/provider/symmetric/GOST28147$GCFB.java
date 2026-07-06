package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.u;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.k;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147$GCFB extends BaseBlockCipher {
    public GOST28147$GCFB() {
        super(new f(new k(new u())), 64);
    }
}
