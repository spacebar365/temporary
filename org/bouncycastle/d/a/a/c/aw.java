package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$b;

/* JADX INFO: loaded from: classes.dex */
public final class aw extends d$b {
    public static final BigInteger i = new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    protected ba j;

    public aw() {
        super(i);
        this.j = new ba(this, null, null);
        this.b = a(new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.c = a(new BigInteger(1, org.bouncycastle.f.a.f.a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return i.bitLength();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new az(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i2) {
        int[] iArr = new int[i2 * 12 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i4 + 0];
            org.bouncycastle.d.c.c.b(12, ((az) jVar.k()).b, iArr, i3);
            int i5 = i3 + 12;
            org.bouncycastle.d.c.c.b(12, ((az) jVar.l()).b, iArr, i5);
            i3 = i5 + 12;
        }
        return new ax(this, i2, iArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new ba(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new ba(this, gVar, gVar2, gVarArr, z);
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
        return new aw();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.j e() {
        return this.j;
    }
}
