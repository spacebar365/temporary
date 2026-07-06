package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.b.b.x;
import org.bouncycastle.b.m.g;
import org.bouncycastle.b.m.h;
import org.bouncycastle.f.k;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class DRBG$HybridSecureRandom extends SecureRandom {
    private final AtomicBoolean a;
    private final AtomicInteger b;
    private final SecureRandom c;
    private final g d;

    DRBG$HybridSecureRandom() {
        super(null, new DRBG$HybridRandomProvider());
        this.a = new AtomicBoolean(false);
        this.b = new AtomicInteger(0);
        this.c = DRBG.d();
        this.d = new h(new DRBG$HybridSecureRandom$1(this)).a(k.d("Bouncy Castle Hybrid Entropy Source")).a(new org.bouncycastle.b.h.g(new x()), this.c.generateSeed(32));
    }

    static /* synthetic */ SecureRandom a(DRBG$HybridSecureRandom dRBG$HybridSecureRandom) {
        return dRBG$HybridSecureRandom.c;
    }

    static /* synthetic */ AtomicBoolean b(DRBG$HybridSecureRandom dRBG$HybridSecureRandom) {
        return dRBG$HybridSecureRandom.a;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        if (this.b.getAndIncrement() > 20 && this.a.getAndSet(false)) {
            this.b.set(0);
            this.d.a();
        }
        this.d.nextBytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        if (this.d != null) {
            this.d.setSeed(j);
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        if (this.d != null) {
            this.d.setSeed(bArr);
        }
    }
}
