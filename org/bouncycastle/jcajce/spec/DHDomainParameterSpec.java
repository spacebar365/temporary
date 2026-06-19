package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1111n;

/* JADX INFO: loaded from: classes.dex */
public class DHDomainParameterSpec extends DHParameterSpec {

    /* JADX INFO: renamed from: a */
    private final BigInteger f6233a;

    /* JADX INFO: renamed from: b */
    private final BigInteger f6234b;

    /* JADX INFO: renamed from: c */
    private final int f6235c;

    /* JADX INFO: renamed from: d */
    private C1111n f6236d;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, 0);
    }

    private DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2) {
        super(bigInteger, bigInteger3, i2);
        this.f6233a = bigInteger2;
        this.f6234b = bigInteger4;
        this.f6235c = i;
    }

    public DHDomainParameterSpec(C1106i c1106i) {
        this(c1106i.m2664a(), c1106i.m2666c(), c1106i.m2665b(), c1106i.m2667d(), c1106i.m2668e(), c1106i.m2669f());
        this.f6236d = c1106i.m2670g();
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m4484a() {
        return this.f6233a;
    }

    /* JADX INFO: renamed from: b */
    public final C1106i m4485b() {
        return new C1106i(getP(), getG(), this.f6233a, this.f6235c, getL(), this.f6234b, this.f6236d);
    }
}
