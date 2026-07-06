package org.bouncycastle.a.d;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.g;
import org.bouncycastle.a.m;
import org.bouncycastle.a.o;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    private byte[] a;
    private int b;

    private a(v vVar) {
        this.a = q.a(vVar.a(0)).c();
        if (vVar.d() == 2) {
            this.b = m.a(vVar.a(1)).b().intValue();
        } else {
            this.b = 12;
        }
    }

    public a(byte[] bArr, int i) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = i;
    }

    public static a a(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.a);
    }

    public final int b() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        g gVar = new g();
        gVar.a(new be(this.a));
        if (this.b != 12) {
            gVar.a(new m(this.b));
        }
        return new bi(gVar);
    }
}
