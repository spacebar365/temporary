package org.b.a.a.b;

/* JADX INFO: compiled from: Method.java */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k,
    l,
    m,
    n,
    o,
    p,
    q,
    r;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        int length = aVarArrValuesCustom.length;
        a[] aVarArr = new a[length];
        System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
        return aVarArr;
    }

    public static a a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e2) {
            return null;
        }
    }
}
