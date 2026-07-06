package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$b;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d$b {
    public static final BigInteger i = new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    protected w j;

    public s() {
        super(i);
        this.j = new w(this, null, null);
        this.b = a(org.bouncycastle.d.a.c.c);
        this.c = a(BigInteger.valueOf(3L));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return i.bitLength();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new v(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i2) {
        int[] iArr = new int[i2 * 6 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i4 + 0];
            org.bouncycastle.d.c.f.a(((v) jVar.k()).b, iArr, i3);
            int i5 = i3 + 6;
            org.bouncycastle.d.c.f.a(((v) jVar.l()).b, iArr, i5);
            i3 = i5 + 6;
        }
        return new t(this, i2, iArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new w(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new w(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i2) {
        switch (i2) {
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.d c() {
        return new s();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.j e() {
        return this.j;
    }
}
