package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.p097k.C1062an;

/* JADX INFO: renamed from: org.bouncycastle.b.f.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0969p {

    /* JADX INFO: renamed from: a */
    private int f4027a;

    /* JADX INFO: renamed from: b */
    private int f4028b;

    /* JADX INFO: renamed from: c */
    private SecureRandom f4029c;

    /* JADX INFO: renamed from: a */
    public final C1062an m2433a() {
        BigInteger bigInteger = C0961h.m2422a(this.f4027a, this.f4028b, this.f4029c)[0];
        return new C1062an(bigInteger, C0961h.m2421a(bigInteger, this.f4029c));
    }

    /* JADX INFO: renamed from: a */
    public final void m2434a(int i, int i2, SecureRandom secureRandom) {
        this.f4027a = i;
        this.f4028b = i2;
        this.f4029c = secureRandom;
    }
}
