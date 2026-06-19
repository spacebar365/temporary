package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C1181x;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bl */
/* JADX INFO: loaded from: classes.dex */
public final class C1087bl extends C1181x {

    /* JADX INFO: renamed from: a */
    private BigInteger f4432a;

    /* JADX INFO: renamed from: b */
    private int f4433b;

    public C1087bl(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.f4432a = bigInteger;
        this.f4433b = i2;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2623c() {
        return this.f4432a;
    }

    /* JADX INFO: renamed from: d */
    public final int m2624d() {
        return this.f4433b;
    }
}
