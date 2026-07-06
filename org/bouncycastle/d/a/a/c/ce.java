package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$a;

/* JADX INFO: loaded from: classes.dex */
public final class ce extends d$a {
    protected cg i;

    public ce() {
        super(163, 3, 6, 7);
        this.i = new cg(this, null, null);
        this.b = a(BigInteger.valueOf(1L));
        this.c = a(new BigInteger(1, org.bouncycastle.f.a.f.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("040000000000000000000292FE77E70C12A4234C33"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return 163;
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new bx(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i) {
        long[] jArr = new long[i * 3 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i3 + 0];
            org.bouncycastle.d.c.f.a(((bx) jVar.k()).a, jArr, i2);
            int i4 = i2 + 3;
            org.bouncycastle.d.c.f.a(((bx) jVar.l()).a, jArr, i4);
            i2 = i4 + 3;
        }
        return new cf(this, i, jArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new cg(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new cg(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i) {
        switch (i) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.d c() {
        return new ce();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.j e() {
        return this.i;
    }

    @Override // org.bouncycastle.d.a.d$a
    public final boolean o() {
        return false;
    }
}
