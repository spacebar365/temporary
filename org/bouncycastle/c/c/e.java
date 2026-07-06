package org.bouncycastle.c.c;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class e implements AlgorithmParameterSpec {
    private org.bouncycastle.d.a.d a;
    private byte[] b;
    private org.bouncycastle.d.a.j c;
    private BigInteger d;
    private BigInteger e;

    public e(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger) {
        this.a = dVar;
        this.c = jVar.o();
        this.d = bigInteger;
        this.e = BigInteger.valueOf(1L);
        this.b = null;
    }

    public e(org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.a = dVar;
        this.c = jVar.o();
        this.d = bigInteger;
        this.e = bigInteger2;
        this.b = bArr;
    }

    public final org.bouncycastle.d.a.d b() {
        return this.a;
    }

    public final org.bouncycastle.d.a.j c() {
        return this.c;
    }

    public final BigInteger d() {
        return this.d;
    }

    public final BigInteger e() {
        return this.e;
    }

    public final byte[] f() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.a(eVar.a) && this.c.a(eVar.c);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.c.hashCode();
    }
}
