package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ab;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class IDEA$CBC extends BaseBlockCipher {
    public IDEA$CBC() {
        super(new b(new ab()), 64);
    }
}
