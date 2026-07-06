package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o {
    private org.bouncycastle.a.m a;
    private p b;
    private org.bouncycastle.a.m c;
    private byte[][] d;
    private byte[][] e;
    private byte[] f;

    public g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.a = new org.bouncycastle.a.m(0L);
        this.c = new org.bouncycastle.a.m(i);
        this.d = org.bouncycastle.e.b.d.a.a.a(sArr);
        this.e = org.bouncycastle.e.b.d.a.a.a(sArr2);
        this.f = org.bouncycastle.e.b.d.a.a.a(sArr3);
    }

    private g(v vVar) {
        if (vVar.a(0) instanceof org.bouncycastle.a.m) {
            this.a = org.bouncycastle.a.m.a(vVar.a(0));
        } else {
            this.b = p.a(vVar.a(0));
        }
        this.c = org.bouncycastle.a.m.a(vVar.a(1));
        v vVarA = v.a(vVar.a(2));
        this.d = new byte[vVarA.d()][];
        for (int i = 0; i < vVarA.d(); i++) {
            this.d[i] = q.a(vVarA.a(i)).c();
        }
        v vVar2 = (v) vVar.a(3);
        this.e = new byte[vVar2.d()][];
        for (int i2 = 0; i2 < vVar2.d(); i2++) {
            this.e[i2] = q.a(vVar2.a(i2)).c();
        }
        this.f = q.a(((v) vVar.a(4)).a(0)).c();
    }

    public static g a(Object obj) {
        if (obj != null) {
            return new g(v.a(obj));
        }
        return null;
    }

    public final int a() {
        return this.c.b().intValue();
    }

    public final short[][] b() {
        return org.bouncycastle.e.b.d.a.a.a(this.d);
    }

    public final short[][] c() {
        return org.bouncycastle.e.b.d.a.a.a(this.e);
    }

    public final short[] d() {
        return org.bouncycastle.e.b.d.a.a.a(this.f);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(this.a);
        } else {
            gVar.a(this.b);
        }
        gVar.a(this.c);
        org.bouncycastle.a.g gVar2 = new org.bouncycastle.a.g();
        for (int i = 0; i < this.d.length; i++) {
            gVar2.a(new be(this.d[i]));
        }
        gVar.a(new bi(gVar2));
        org.bouncycastle.a.g gVar3 = new org.bouncycastle.a.g();
        for (int i2 = 0; i2 < this.e.length; i2++) {
            gVar3.a(new be(this.e[i2]));
        }
        gVar.a(new bi(gVar3));
        org.bouncycastle.a.g gVar4 = new org.bouncycastle.a.g();
        gVar4.a(new be(this.f));
        gVar.a(new bi(gVar4));
        return new bi(gVar);
    }
}
