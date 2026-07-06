package org.bouncycastle.a.w;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {
    private static final byte[] a = {-87, -42, -21, 69, -15, 60, 112, -126, -128, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    private p b;
    private b c;
    private byte[] d = a;

    public d(p pVar) {
        this.b = pVar;
    }

    private d(b bVar) {
        this.c = bVar;
    }

    public static d a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        v vVarA = v.a(obj);
        d dVar = vVarA.a(0) instanceof p ? new d(p.a(vVarA.a(0))) : new d(b.a(vVarA.a(0)));
        if (vVarA.d() == 2) {
            dVar.d = q.a(vVarA.a(1)).c();
            if (dVar.d.length != a.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return dVar;
    }

    public static byte[] d() {
        return org.bouncycastle.f.a.b(a);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final b b() {
        return this.c;
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.d);
    }

    public final p e() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        if (this.b != null) {
            gVar.a(this.b);
        } else {
            gVar.a(this.c);
        }
        if (!org.bouncycastle.f.a.a(this.d, a)) {
            gVar.a(new be(this.d));
        }
        return new bi(gVar);
    }
}
