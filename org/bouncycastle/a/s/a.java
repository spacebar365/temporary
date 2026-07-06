package org.bouncycastle.a.s;

import org.bouncycastle.a.al;
import org.bouncycastle.a.bw;

/* JADX INFO: loaded from: classes.dex */
public final class a extends org.bouncycastle.a.o {
    private c[] a;
    private boolean b;

    private a(org.bouncycastle.a.v vVar) {
        this.b = true;
        this.a = new c[vVar.d()];
        for (int i = 0; i != this.a.length; i++) {
            this.a[i] = c.a(vVar.a(i));
        }
        this.b = vVar instanceof al;
    }

    public a(c[] cVarArr) {
        this.b = true;
        this.a = a(cVarArr);
    }

    public static a a(Object obj) {
        if (obj != null) {
            return new a(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    private static c[] a(c[] cVarArr) {
        c[] cVarArr2 = new c[cVarArr.length];
        System.arraycopy(cVarArr, 0, cVarArr2, 0, cVarArr2.length);
        return cVarArr2;
    }

    public final c[] a() {
        return a(this.a);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        for (int i = 0; i != this.a.length; i++) {
            gVar.a(this.a[i]);
        }
        return this.b ? new al(gVar) : new bw(gVar);
    }
}
