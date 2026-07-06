package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ax;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Shacal2$CBC extends BaseBlockCipher {
    public Shacal2$CBC() {
        super(new b(new ax()), 256);
    }
}
