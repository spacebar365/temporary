package org.bouncycastle.jcajce.provider.drbg;

import org.bouncycastle.b.m.d;
import org.bouncycastle.b.m.e;

/* JADX INFO: loaded from: classes.dex */
class DRBG$HybridSecureRandom$1 implements e {
    final /* synthetic */ DRBG$HybridSecureRandom a;

    DRBG$HybridSecureRandom$1(DRBG$HybridSecureRandom dRBG$HybridSecureRandom) {
        this.a = dRBG$HybridSecureRandom;
    }

    @Override // org.bouncycastle.b.m.e
    public final d a(int i) {
        return new DRBG$HybridSecureRandom$SignallingEntropySource(this.a, i);
    }
}
