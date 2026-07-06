package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.b.e;
import org.bouncycastle.b.e.bc;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;

/* JADX INFO: loaded from: classes.dex */
class Twofish$ECB$1 implements BlockCipherProvider {
    Twofish$ECB$1() {
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
    public final e a() {
        return new bc();
    }
}
