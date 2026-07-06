package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.g;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Blowfish$CBC extends BaseBlockCipher {
    public Blowfish$CBC() {
        super(new b(new g()), 64);
    }
}
