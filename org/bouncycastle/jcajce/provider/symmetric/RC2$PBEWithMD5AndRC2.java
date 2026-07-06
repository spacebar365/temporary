package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.ae;
import org.bouncycastle.b.i.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class RC2$PBEWithMD5AndRC2 extends BaseBlockCipher {
    public RC2$PBEWithMD5AndRC2() {
        super(new b(new ae()), 0, 0, 64, 8);
    }
}
