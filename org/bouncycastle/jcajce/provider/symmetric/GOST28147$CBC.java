package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.u;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147$CBC extends BaseBlockCipher {
    public GOST28147$CBC() {
        super(new b(new u()), 64);
    }
}
