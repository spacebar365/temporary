package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.an;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    private int a;
    private int b;
    private SecureRandom c;

    public final an a() {
        BigInteger bigInteger = h.a(this.a, this.b, this.c)[0];
        return new an(bigInteger, h.a(bigInteger, this.c));
    }

    public final void a(int i, int i2, SecureRandom secureRandom) {
        this.a = i;
        this.b = i2;
        this.c = secureRandom;
    }
}
