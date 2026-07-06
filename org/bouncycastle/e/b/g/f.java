package org.bouncycastle.e.b.g;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class f {
    private static Map<String, org.bouncycastle.a.p> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("SHA-256", org.bouncycastle.a.o.b.c);
        a.put("SHA-512", org.bouncycastle.a.o.b.e);
        a.put("SHAKE128", org.bouncycastle.a.o.b.m);
        a.put("SHAKE256", org.bouncycastle.a.o.b.n);
    }

    static org.bouncycastle.a.p a(String str) {
        org.bouncycastle.a.p pVar = a.get(str);
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(String.valueOf(str)));
    }

    static org.bouncycastle.b.r a(org.bouncycastle.a.p pVar) {
        if (pVar.equals(org.bouncycastle.a.o.b.c)) {
            return new org.bouncycastle.b.b.u();
        }
        if (pVar.equals(org.bouncycastle.a.o.b.e)) {
            return new org.bouncycastle.b.b.x();
        }
        if (pVar.equals(org.bouncycastle.a.o.b.m)) {
            return new org.bouncycastle.b.b.z(128);
        }
        if (pVar.equals(org.bouncycastle.a.o.b.n)) {
            return new org.bouncycastle.b.b.z(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(pVar)));
    }
}
