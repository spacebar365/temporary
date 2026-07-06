package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.r;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.d;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624$CFB128 extends BaseBlockCipher {
    public DSTU7624$CFB128() {
        super(new f(new d(new r(128), 128)), 128);
    }
}
