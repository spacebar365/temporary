package org.bouncycastle.a.z;

/* JADX INFO: loaded from: classes.dex */
public final class d extends org.bouncycastle.a.o {
    org.bouncycastle.a.v a;

    private d(org.bouncycastle.a.v vVar) {
        this.a = null;
        this.a = vVar;
    }

    public static d a(Object obj) {
        if (obj != null) {
            return new d(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = org.bouncycastle.f.k.a();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(strA);
        k[] kVarArrA = a();
        for (int i = 0; i != kVarArrA.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(kVarArrA[i]);
            stringBuffer.append(strA);
        }
        return stringBuffer.toString();
    }

    private k[] a() {
        k kVar;
        k[] kVarArr = new k[this.a.d()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == this.a.d()) {
                return kVarArr;
            }
            org.bouncycastle.a.f fVarA = this.a.a(i2);
            if (fVarA == null || (fVarA instanceof k)) {
                kVar = (k) fVarA;
            } else {
                if (!(fVarA instanceof org.bouncycastle.a.v)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: " + fVarA.getClass().getName());
                }
                kVar = new k((org.bouncycastle.a.v) fVarA);
            }
            kVarArr[i2] = kVar;
            i = i2 + 1;
        }
    }
}
