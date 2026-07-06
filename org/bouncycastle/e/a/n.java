package org.bouncycastle.e.a;

import java.math.BigInteger;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {
    private final byte[] a;
    private final byte[] b;

    private n(v vVar) {
        if (!org.bouncycastle.a.m.a(vVar.a(0)).b().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = org.bouncycastle.f.a.b(be.a(vVar.a(1)).c());
        this.b = org.bouncycastle.f.a.b(be.a(vVar.a(2)).c());
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = org.bouncycastle.f.a.b(bArr2);
    }

    public static n a(Object obj) {
        if (obj != null) {
            return new n(v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(0L));
        gVar.a(new be(this.a));
        gVar.a(new be(this.b));
        return new bi(gVar);
    }
}
