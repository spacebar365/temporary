package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.n;

/* JADX INFO: loaded from: classes.dex */
public class DHDomainParameterSpec extends DHParameterSpec {
    private final BigInteger a;
    private final BigInteger b;
    private final int c;
    private n d;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, 0);
    }

    private DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2) {
        super(bigInteger, bigInteger3, i2);
        this.a = bigInteger2;
        this.b = bigInteger4;
        this.c = i;
    }

    public DHDomainParameterSpec(i iVar) {
        this(iVar.a(), iVar.c(), iVar.b(), iVar.d(), iVar.e(), iVar.f());
        this.d = iVar.g();
    }

    public final BigInteger a() {
        return this.a;
    }

    public final i b() {
        return new i(getP(), getG(), this.a, this.c, getL(), this.b, this.d);
    }
}
