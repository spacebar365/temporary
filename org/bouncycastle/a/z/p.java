package org.bouncycastle.a.z;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class p extends org.bouncycastle.a.o {
    private final o[] a;

    private p(org.bouncycastle.a.v vVar) {
        this.a = new o[vVar.d()];
        for (int i = 0; i != vVar.d(); i++) {
            this.a[i] = o.a(vVar.a(i));
        }
    }

    public static p a(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj != null) {
            return new p(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public static p a(ab abVar) {
        return a(org.bouncycastle.a.v.a(abVar, false));
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return new bi(this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = org.bouncycastle.f.k.a();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(strA);
        for (int i = 0; i != this.a.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.a[i]);
            stringBuffer.append(strA);
        }
        return stringBuffer.toString();
    }

    public final o[] a() {
        o[] oVarArr = this.a;
        o[] oVarArr2 = new o[oVarArr.length];
        System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr2.length);
        return oVarArr2;
    }
}
