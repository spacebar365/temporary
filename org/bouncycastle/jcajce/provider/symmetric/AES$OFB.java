package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.a;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.s;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class AES$OFB extends BaseBlockCipher {
    public AES$OFB() {
        super(new f(new s(new a(), 128)), 128);
    }
}
