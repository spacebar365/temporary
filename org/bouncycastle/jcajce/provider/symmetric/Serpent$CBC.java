package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.av;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$CBC extends BaseBlockCipher {
    public Serpent$CBC() {
        super(new b(new av()), 128);
    }
}
