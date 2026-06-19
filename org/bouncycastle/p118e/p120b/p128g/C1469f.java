package org.bouncycastle.p118e.p120b.p128g;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p086b.C0849z;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.f */
/* JADX INFO: loaded from: classes.dex */
final class C1469f {

    /* JADX INFO: renamed from: a */
    private static Map<String, C0653p> f5315a;

    static {
        HashMap map = new HashMap();
        f5315a = map;
        map.put("SHA-256", InterfaceC0652b.f2490c);
        f5315a.put("SHA-512", InterfaceC0652b.f2492e);
        f5315a.put("SHAKE128", InterfaceC0652b.f2500m);
        f5315a.put("SHAKE256", InterfaceC0652b.f2501n);
    }

    /* JADX INFO: renamed from: a */
    static C0653p m3863a(String str) {
        C0653p c0653p = f5315a.get(str);
        if (c0653p != null) {
            return c0653p;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC1175r m3864a(C0653p c0653p) {
        if (c0653p.equals(InterfaceC0652b.f2490c)) {
            return new C0844u();
        }
        if (c0653p.equals(InterfaceC0652b.f2492e)) {
            return new C0847x();
        }
        if (c0653p.equals(InterfaceC0652b.f2500m)) {
            return new C0849z(128);
        }
        if (c0653p.equals(InterfaceC0652b.f2501n)) {
            return new C0849z(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(c0653p)));
    }
}
