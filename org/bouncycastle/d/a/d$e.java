package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class d$e extends d$b {
    BigInteger i;
    BigInteger j;
    j$d k;

    public d$e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, null);
    }

    public d$e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(bigInteger);
        this.i = bigInteger;
        this.j = g$d.a(bigInteger);
        this.k = new j$d(this, null, null, false);
        this.b = a(bigInteger2);
        this.c = a(bigInteger3);
        this.d = bigInteger4;
        this.e = bigInteger5;
        this.f = 4;
    }

    private d$e(BigInteger bigInteger, BigInteger bigInteger2, g gVar, g gVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(bigInteger);
        this.i = bigInteger;
        this.j = bigInteger2;
        this.k = new j$d(this, null, null, false);
        this.b = gVar;
        this.c = gVar2;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.f = 4;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return this.i.bitLength();
    }

    @Override // org.bouncycastle.d.a.d
    public final g a(BigInteger bigInteger) {
        return new g$d(this.i, this.j, bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(g gVar, g gVar2, boolean z) {
        return new j$d(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(g gVar, g gVar2, g[] gVarArr, boolean z) {
        return new j$d(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final j a(j jVar) {
        if (this != jVar.d() && k() == 2 && !jVar.p()) {
            switch (jVar.d().k()) {
                case 2:
                case 3:
                case 4:
                    return new j$d(this, a(jVar.c.a()), a(jVar.d.a()), new g[]{a(jVar.e[0].a())}, jVar.f);
            }
        }
        return super.a(jVar);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 4:
                return true;
            case 3:
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final d c() {
        return new d$e(this.i, this.j, this.b, this.c, this.d, this.e);
    }

    @Override // org.bouncycastle.d.a.d
    public final j e() {
        return this.k;
    }
}
