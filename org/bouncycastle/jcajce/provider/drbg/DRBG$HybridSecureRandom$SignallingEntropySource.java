package org.bouncycastle.jcajce.provider.drbg;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.b.m.d;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class DRBG$HybridSecureRandom$SignallingEntropySource implements d {
    final /* synthetic */ DRBG$HybridSecureRandom a;
    private final int b;
    private final AtomicReference c = new AtomicReference();
    private final AtomicBoolean d = new AtomicBoolean(false);

    DRBG$HybridSecureRandom$SignallingEntropySource(DRBG$HybridSecureRandom dRBG$HybridSecureRandom, int i) {
        this.a = dRBG$HybridSecureRandom;
        this.b = (i + 7) / 8;
    }

    static /* synthetic */ AtomicReference a(DRBG$HybridSecureRandom$SignallingEntropySource dRBG$HybridSecureRandom$SignallingEntropySource) {
        return dRBG$HybridSecureRandom$SignallingEntropySource.c;
    }

    @Override // org.bouncycastle.b.m.d
    public final byte[] a() {
        byte[] bArrGenerateSeed = (byte[]) this.c.getAndSet(null);
        if (bArrGenerateSeed == null || bArrGenerateSeed.length != this.b) {
            bArrGenerateSeed = DRBG$HybridSecureRandom.a(this.a).generateSeed(this.b);
        } else {
            this.d.set(false);
        }
        if (!this.d.getAndSet(true)) {
            new Thread(new DRBG$HybridSecureRandom$SignallingEntropySource$EntropyGatherer(this, this.b)).start();
        }
        return bArrGenerateSeed;
    }

    @Override // org.bouncycastle.b.m.d
    public final int b() {
        return this.b * 8;
    }
}
