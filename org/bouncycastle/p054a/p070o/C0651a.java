package org.bouncycastle.p054a.p070o;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p076u.C0698b;
import org.bouncycastle.p054a.p076u.InterfaceC0697aj;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.o.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0651a {

    /* JADX INFO: renamed from: a */
    static final Hashtable f2451a = new Hashtable();

    /* JADX INFO: renamed from: b */
    static final Hashtable f2452b = new Hashtable();

    static {
        m1582a("B-571", InterfaceC0697aj.f2827F);
        m1582a("B-409", InterfaceC0697aj.f2825D);
        m1582a("B-283", InterfaceC0697aj.f2860n);
        m1582a("B-233", InterfaceC0697aj.f2866t);
        m1582a("B-163", InterfaceC0697aj.f2858l);
        m1582a("K-571", InterfaceC0697aj.f2826E);
        m1582a("K-409", InterfaceC0697aj.f2824C);
        m1582a("K-283", InterfaceC0697aj.f2859m);
        m1582a("K-233", InterfaceC0697aj.f2865s);
        m1582a("K-163", InterfaceC0697aj.f2848b);
        m1582a("P-521", InterfaceC0697aj.f2823B);
        m1582a("P-384", InterfaceC0697aj.f2822A);
        m1582a("P-256", InterfaceC0697aj.f2829H);
        m1582a("P-224", InterfaceC0697aj.f2872z);
        m1582a("P-192", InterfaceC0697aj.f2828G);
    }

    /* JADX INFO: renamed from: a */
    public static String m1579a(C0653p c0653p) {
        return (String) f2452b.get(c0653p);
    }

    /* JADX INFO: renamed from: a */
    public static Enumeration m1580a() {
        return f2451a.keys();
    }

    /* JADX INFO: renamed from: a */
    private static void m1582a(String str, C0653p c0653p) {
        f2451a.put(str, c0653p);
        f2452b.put(c0653p, str);
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1583b(String str) {
        return (C0653p) f2451a.get(C1560k.m4163b(str));
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1581a(String str) {
        C0653p c0653p = (C0653p) f2451a.get(C1560k.m4163b(str));
        if (c0653p != null) {
            return C0698b.m1700a(c0653p);
        }
        return null;
    }
}
