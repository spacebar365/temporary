package org.bouncycastle.p083b.p099m;

import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.b.m.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1141j extends SecureRandom {

    /* JADX INFO: renamed from: a */
    private final boolean f4573a;

    /* JADX INFO: renamed from: b */
    private final SecureRandom f4574b;

    /* JADX INFO: renamed from: c */
    private final C1140i f4575c;

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        return C1137f.m2735a(this.f4575c.m2745b(), i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.f4575c.m2743a(bArr, this.f4573a) < 0) {
                this.f4575c.m2744a();
                this.f4575c.m2743a(bArr, this.f4573a);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            if (this.f4574b != null) {
                this.f4574b.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            if (this.f4574b != null) {
                this.f4574b.setSeed(bArr);
            }
        }
    }
}
