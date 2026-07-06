package org.bouncycastle.b.m;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class j extends SecureRandom {
    private final boolean a;
    private final SecureRandom b;
    private final i c;

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        return f.a(this.c.b(), i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.c.a(bArr, this.a) < 0) {
                this.c.a();
                this.c.a(bArr, this.a);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            if (this.b != null) {
                this.b.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            if (this.b != null) {
                this.b.setSeed(bArr);
            }
        }
    }
}
