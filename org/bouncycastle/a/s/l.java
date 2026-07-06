package org.bouncycastle.a.s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class l extends org.bouncycastle.a.o {
    private static final org.bouncycastle.a.z.a a = new org.bouncycastle.a.z.a(n.K, bc.a);
    private final org.bouncycastle.a.q b;
    private final org.bouncycastle.a.m c;
    private final org.bouncycastle.a.m d;
    private final org.bouncycastle.a.z.a e;

    private l(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        this.b = (org.bouncycastle.a.q) enumerationC.nextElement();
        this.c = (org.bouncycastle.a.m) enumerationC.nextElement();
        if (!enumerationC.hasMoreElements()) {
            this.d = null;
            this.e = null;
            return;
        }
        Object objNextElement = enumerationC.nextElement();
        if (objNextElement instanceof org.bouncycastle.a.m) {
            this.d = org.bouncycastle.a.m.a(objNextElement);
            objNextElement = enumerationC.hasMoreElements() ? enumerationC.nextElement() : null;
        } else {
            this.d = null;
        }
        if (objNextElement != null) {
            this.e = org.bouncycastle.a.z.a.a(objNextElement);
        } else {
            this.e = null;
        }
    }

    public l(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    private l(byte[] bArr, int i, byte b) {
        this(bArr, i, 0, null);
    }

    public l(byte[] bArr, int i, int i2, org.bouncycastle.a.z.a aVar) {
        this.b = new be(org.bouncycastle.f.a.b(bArr));
        this.c = new org.bouncycastle.a.m(i);
        if (i2 > 0) {
            this.d = new org.bouncycastle.a.m(i2);
        } else {
            this.d = null;
        }
        this.e = aVar;
    }

    public static l a(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return this.b.c();
    }

    public final BigInteger b() {
        return this.c.b();
    }

    public final BigInteger c() {
        if (this.d != null) {
            return this.d.b();
        }
        return null;
    }

    public final boolean d() {
        return this.e == null || this.e.equals(a);
    }

    public final org.bouncycastle.a.z.a e() {
        return this.e != null ? this.e : a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.b);
        gVar.a(this.c);
        if (this.d != null) {
            gVar.a(this.d);
        }
        if (this.e != null && !this.e.equals(a)) {
            gVar.a(this.e);
        }
        return new bi(gVar);
    }
}
