package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.f;
import org.bouncycastle.b.i.d;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class ARIA$CFB extends BaseBlockCipher {
    public ARIA$CFB() {
        super(new f(new d(new org.bouncycastle.b.e.d(), 128)), 128);
    }
}
