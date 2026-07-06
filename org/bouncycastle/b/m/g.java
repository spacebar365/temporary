package org.bouncycastle.b.m;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class g extends SecureRandom {
    private final c a;
    private final boolean b;
    private final SecureRandom c;
    private final d d;
    private org.bouncycastle.b.m.a.c e;

    g(SecureRandom secureRandom, d dVar, c cVar, boolean z) {
        this.c = secureRandom;
        this.d = dVar;
        this.a = cVar;
        this.b = z;
    }

    public final void a() {
        synchronized (this) {
            if (this.e == null) {
                this.e = this.a.a(this.d);
            }
            this.e.a();
        }
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        return f.a(this.d, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.e == null) {
                this.e = this.a.a(this.d);
            }
            if (this.e.a(bArr, this.b) < 0) {
                this.e.a();
                this.e.a(bArr, this.b);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            if (this.c != null) {
                this.c.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            if (this.c != null) {
                this.c.setSeed(bArr);
            }
        }
    }
}
