package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class d$d extends d$a {
    private int i;
    private int j;
    private int k;
    private int l;
    private j$c m;

    public d$d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
        this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
    }

    public d$d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.m = new j$c(this, null, null, false);
        this.b = a(bigInteger);
        this.c = a(bigInteger2);
        this.f = 6;
    }

    private d$d(int i, int i2, int i3, int i4, g gVar, g gVar2, BigInteger bigInteger, BigInteger bigInteger2) {
        super(i, i2, i3, i4);
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.m = new j$c(this, null, null, false);
        this.b = gVar;
        this.c = gVar2;
        this.f = 6;
    }

    public d$d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    static /* synthetic */ int a(d$d d_d) {
        return d_d.i;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return this.i;
    }

    @Override // org.bouncycastle.d.a.d
    public final g a(BigInteger bigInteger) {
        return new g$c(this.i, this.j, this.k, this.l, bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(g gVar, g gVar2, boolean z) {
        return new j$c(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(g gVar, g gVar2, g[] gVarArr, boolean z) {
        return new j$c(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final d c() {
        return new d$d(this.i, this.j, this.k, this.l, this.b, this.c, this.d, this.e);
    }

    @Override // org.bouncycastle.d.a.d
    protected final i d() {
        return o() ? new ad() : super.d();
    }

    @Override // org.bouncycastle.d.a.d
    public final j e() {
        return this.m;
    }

    @Override // org.bouncycastle.d.a.d
    public final h a(j[] jVarArr, int i) {
        int i2 = (this.i + 63) >>> 6;
        int[] iArr = this.k == 0 && this.l == 0 ? new int[]{this.j} : new int[]{this.j, this.k, this.l};
        long[] jArr = new long[i * i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j jVar = jVarArr[i4 + 0];
            ((g$c) jVar.k()).a.a(jArr, i3);
            int i5 = i3 + i2;
            ((g$c) jVar.l()).a.a(jArr, i5);
            i3 = i5 + i2;
        }
        return new f(this, i, i2, jArr, iArr);
    }
}
