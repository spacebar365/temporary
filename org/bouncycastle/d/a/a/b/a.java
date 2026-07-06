package org.bouncycastle.d.a.a.b;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$b;
import org.bouncycastle.d.a.g;
import org.bouncycastle.d.a.h;
import org.bouncycastle.d.a.j;
import org.bouncycastle.f.a.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d$b {
    public static final BigInteger i = new BigInteger(1, f.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    protected e j;

    public a() {
        super(i);
        this.j = new e(this, null, null);
        this.b = a(new BigInteger(1, f.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.c = a(new BigInteger(1, f.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.d = new BigInteger(1, f.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
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
    public final h a(j[] jVarArr, int i2) {
        int[] iArr = new int[i2 * 8 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j jVar = jVarArr[i4 + 0];
            org.bouncycastle.d.c.h.a(((d) jVar.k()).b, iArr, i3);
            int i5 = i3 + 8;
            org.bouncycastle.d.c.h.a(((d) jVar.l()).b, iArr, i5);
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
            case 2:
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
