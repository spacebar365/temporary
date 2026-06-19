package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.b.k.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1114q {

    /* JADX INFO: renamed from: a */
    private final int f4484a;

    /* JADX INFO: renamed from: b */
    private final int f4485b;

    /* JADX INFO: renamed from: c */
    private final int f4486c;

    /* JADX INFO: renamed from: d */
    private final int f4487d;

    /* JADX INFO: renamed from: e */
    private final SecureRandom f4488e;

    public C1114q(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, (byte) 0);
    }

    private C1114q(int i, int i2, int i3, SecureRandom secureRandom, byte b) {
        this.f4484a = i;
        this.f4485b = i2;
        this.f4487d = i3;
        this.f4486c = -1;
        this.f4488e = secureRandom;
    }

    /* JADX INFO: renamed from: a */
    public final int m2681a() {
        return this.f4484a;
    }

    /* JADX INFO: renamed from: b */
    public final int m2682b() {
        return this.f4485b;
    }

    /* JADX INFO: renamed from: c */
    public final int m2683c() {
        return this.f4487d;
    }

    /* JADX INFO: renamed from: d */
    public final SecureRandom m2684d() {
        return this.f4488e;
    }

    /* JADX INFO: renamed from: e */
    public final int m2685e() {
        return this.f4486c;
    }
}
