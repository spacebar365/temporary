package org.bouncycastle.a.n;

import java.math.BigInteger;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o {
    private final byte[] a;
    private final BigInteger b;
    private final BigInteger c;
    private final BigInteger d;
    private final BigInteger e;

    private f(v vVar) {
        if (vVar.d() != 4 && vVar.d() != 5) {
            throw new IllegalArgumentException("invalid sequence: size = " + vVar.d());
        }
        this.a = org.bouncycastle.f.a.b(q.a(vVar.a(0)).c());
        this.b = m.a(vVar.a(1)).b();
        this.c = m.a(vVar.a(2)).b();
        this.d = m.a(vVar.a(3)).b();
        if (vVar.d() == 5) {
            this.e = m.a(vVar.a(4)).b();
        } else {
            this.e = null;
        }
    }

    public f(byte[] bArr, int i, int i2, int i3) {
        this(bArr, BigInteger.valueOf(i), BigInteger.valueOf(i2), BigInteger.valueOf(i3), BigInteger.valueOf(64L));
    }

    public f(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
    }

    public static f a(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final BigInteger b() {
        return this.b;
    }

    public final BigInteger c() {
        return this.c;
    }

    public final BigInteger d() {
        return this.d;
    }

    public final BigInteger e() {
        return this.e;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new be(this.a));
        gVar.a(new m(this.b));
        gVar.a(new m(this.c));
        gVar.a(new m(this.d));
        if (this.e != null) {
            gVar.a(new m(this.e));
        }
        return new bi(gVar);
    }
}
