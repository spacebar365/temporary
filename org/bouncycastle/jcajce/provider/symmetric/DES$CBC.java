package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.o;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DES$CBC extends BaseBlockCipher {
    public DES$CBC() {
        super(new b(new o()), 64);
    }
}
