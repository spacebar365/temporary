package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.av;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.s;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$OFB extends BaseBlockCipher {
    public Serpent$OFB() {
        super(new f(new s(new av(), 128)), 128);
    }
}
