package org.p044b.p045a.p046a.p048b;

/* JADX INFO: renamed from: org.b.a.a.b.a */
/* JADX INFO: compiled from: Method.java */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0479a {
    GET,
    PUT,
    POST,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    CONNECT,
    PATCH,
    PROPFIND,
    PROPPATCH,
    MKCOL,
    MOVE,
    COPY,
    LOCK,
    UNLOCK,
    NOTIFY,
    SUBSCRIBE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0479a[] valuesCustom() {
        EnumC0479a[] enumC0479aArrValuesCustom = values();
        int length = enumC0479aArrValuesCustom.length;
        EnumC0479a[] enumC0479aArr = new EnumC0479a[length];
        System.arraycopy(enumC0479aArrValuesCustom, 0, enumC0479aArr, 0, length);
        return enumC0479aArr;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0479a m1297a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
