package org.bouncycastle.jcajce.provider.drbg;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class DRBG$HybridSecureRandom$SignallingEntropySource$EntropyGatherer implements Runnable {
    final /* synthetic */ DRBG$HybridSecureRandom$SignallingEntropySource a;
    private final int b;

    DRBG$HybridSecureRandom$SignallingEntropySource$EntropyGatherer(DRBG$HybridSecureRandom$SignallingEntropySource dRBG$HybridSecureRandom$SignallingEntropySource, int i) {
        this.a = dRBG$HybridSecureRandom$SignallingEntropySource;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        DRBG$HybridSecureRandom$SignallingEntropySource.a(this.a).set(DRBG$HybridSecureRandom.a(this.a.a).generateSeed(this.b));
        DRBG$HybridSecureRandom.b(this.a.a).set(true);
    }
}
