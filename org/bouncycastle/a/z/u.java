package org.bouncycastle.a.z;

import java.util.Enumeration;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class u extends org.bouncycastle.a.o {
    private a a;
    private au b;

    private u(org.bouncycastle.a.v vVar) {
        if (vVar.d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        Enumeration enumerationC = vVar.c();
        this.a = a.a(enumerationC.nextElement());
        this.b = au.a(enumerationC.nextElement());
    }

    public u(a aVar, org.bouncycastle.a.f fVar) {
        this.b = new au(fVar);
        this.a = aVar;
    }

    public u(a aVar, byte[] bArr) {
        this.b = new au(bArr);
        this.a = aVar;
    }

    public static u a(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj != null) {
            return new u(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final a a() {
        return this.a;
    }

    public final org.bouncycastle.a.u b() {
        return org.bouncycastle.a.u.b(this.b.c());
    }

    public final au c() {
        return this.b;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
