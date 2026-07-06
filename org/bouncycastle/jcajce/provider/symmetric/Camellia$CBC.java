package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.j;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Camellia$CBC extends BaseBlockCipher {
    public Camellia$CBC() {
        super(new b(new j()), 128);
    }
}
