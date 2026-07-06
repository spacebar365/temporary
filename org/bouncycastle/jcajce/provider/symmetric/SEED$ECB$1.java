package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e;
import org.bouncycastle.b.e.aq;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;

/* JADX INFO: loaded from: classes.dex */
class SEED$ECB$1 implements BlockCipherProvider {
    SEED$ECB$1() {
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
    public final e a() {
        return new aq();
    }
}
