package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e.av;
import org.bouncycastle.b.f;
import org.bouncycastle.b.i.d;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class Serpent$CFB extends BaseBlockCipher {
    public Serpent$CFB() {
        super(new f(new d(new av(), 128)), 128);
    }
}
