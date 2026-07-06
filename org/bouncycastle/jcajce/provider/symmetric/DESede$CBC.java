package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.p;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DESede$CBC extends BaseBlockCipher {
    public DESede$CBC() {
        super(new b(new p()), 64);
    }
}
