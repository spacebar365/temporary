package org.bouncycastle.d.a.a.a;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$b;
import org.bouncycastle.d.a.g;
import org.bouncycastle.d.a.j;
import org.bouncycastle.d.c.h;
import org.bouncycastle.f.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d$b {
    public static final BigInteger i = h.c(c.a);
    protected e j;

    public a() {
        super(i);
        this.j = new e(this, null, null);
        this.b = a(new BigInteger(1, f.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.c = a(new BigInteger(1, f.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.d = new BigInteger(1, f.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return i.bitLength();
    }

    @Override // org.bouncycastle.d.a.d
    public final g a(BigInteger bigInteger) {
        return new d(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(j[] jVarArr, int i2) {
        int[] iArr = new int[i2 * 8 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j jVar = jVarArr[i4 + 0];
            h.a(((d) jVar.k()).b, iArr, i3);
            int i5 = i3 + 8;
            h.a(((d) jVar.l()).b, iArr, i5);
            i3 = i5 + 8;
        }
        return new b(this, i2, iArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(g gVar, g gVar2, boolean z) {
        return new e(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(g gVar, g gVar2, g[] gVarArr, boolean z) {
        return new e(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i2) {
        switch (i2) {
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.d c() {
        return new a();
    }

    @Override // org.bouncycastle.d.a.d
    public final j e() {
        return this.j;
    }
}
