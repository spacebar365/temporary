package org.bouncycastle.b;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class x {
    private SecureRandom a;
    private int b;

    public x(SecureRandom secureRandom, int i) {
        this.a = secureRandom;
        this.b = i;
    }

    public final SecureRandom a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
