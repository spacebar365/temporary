package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.a;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.d;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class AES$CFB extends BaseBlockCipher {
    public AES$CFB() {
        super(new f(new d(new a(), 128)), 128);
    }
}
