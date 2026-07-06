package org.bouncycastle.b.k;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final SecureRandom e;

    public q(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, (byte) 0);
    }

    private q(int i, int i2, int i3, SecureRandom secureRandom, byte b) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = -1;
        this.e = secureRandom;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final SecureRandom d() {
        return this.e;
    }

    public final int e() {
        return this.c;
    }
}
