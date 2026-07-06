package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.d;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class ARIA$CBC extends BaseBlockCipher {
    public ARIA$CBC() {
        super(new b(new d()), 128);
    }
}
