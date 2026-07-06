package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e;
import org.bouncycastle.b.e.bb;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;

/* JADX INFO: loaded from: classes.dex */
class Serpent$TECB$1 implements BlockCipherProvider {
    Serpent$TECB$1() {
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
    public final e a() {
        return new bb();
    }
}
