package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class ah extends org.bouncycastle.a.o implements aj {
    private org.bouncycastle.a.p ap;
    private org.bouncycastle.a.u aq;

    public ah(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public ah(int i, int i2, int i3, int i4) {
        this.ap = d;
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            gVar.a(f);
            gVar.a(new org.bouncycastle.a.m(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            gVar.a(g);
            org.bouncycastle.a.g gVar2 = new org.bouncycastle.a.g();
            gVar2.a(new org.bouncycastle.a.m(i2));
            gVar2.a(new org.bouncycastle.a.m(i3));
            gVar2.a(new org.bouncycastle.a.m(i4));
            gVar.a(new bi(gVar2));
        }
        this.aq = new bi(gVar);
    }

    public ah(BigInteger bigInteger) {
        this.ap = c;
        this.aq = new org.bouncycastle.a.m(bigInteger);
    }

    private ah(org.bouncycastle.a.v vVar) {
        this.ap = org.bouncycastle.a.p.a(vVar.a(0));
        this.aq = vVar.a(1).i();
    }

    public static ah a(Object obj) {
        if (obj instanceof ah) {
            return (ah) obj;
        }
        if (obj != null) {
            return new ah(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final org.bouncycastle.a.p a() {
        return this.ap;
    }

    public final org.bouncycastle.a.u b() {
        return this.aq;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.ap);
        gVar.a(this.aq);
        return new bi(gVar);
    }
}
