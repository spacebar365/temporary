package org.bouncycastle.p054a.p077v;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.v.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0724a {

    /* JADX INFO: renamed from: a */
    static AbstractC0508ae f2910a = new C0725b();

    /* JADX INFO: renamed from: b */
    static AbstractC0508ae f2911b = new C0731h();

    /* JADX INFO: renamed from: c */
    static AbstractC0508ae f2912c = new C0732i();

    /* JADX INFO: renamed from: d */
    static AbstractC0508ae f2913d = new C0733j();

    /* JADX INFO: renamed from: e */
    static AbstractC0508ae f2914e = new C0734k();

    /* JADX INFO: renamed from: f */
    static AbstractC0508ae f2915f = new C0735l();

    /* JADX INFO: renamed from: g */
    static AbstractC0508ae f2916g = new C0736m();

    /* JADX INFO: renamed from: h */
    static AbstractC0508ae f2917h = new C0737n();

    /* JADX INFO: renamed from: i */
    static AbstractC0508ae f2918i = new C0738o();

    /* JADX INFO: renamed from: j */
    static AbstractC0508ae f2919j = new C0726c();

    /* JADX INFO: renamed from: k */
    static AbstractC0508ae f2920k = new C0727d();

    /* JADX INFO: renamed from: l */
    static AbstractC0508ae f2921l = new C0728e();

    /* JADX INFO: renamed from: m */
    static AbstractC0508ae f2922m = new C0729f();

    /* JADX INFO: renamed from: n */
    static AbstractC0508ae f2923n = new C0730g();

    /* JADX INFO: renamed from: o */
    static final Hashtable f2924o = new Hashtable();

    /* JADX INFO: renamed from: p */
    static final Hashtable f2925p = new Hashtable();

    /* JADX INFO: renamed from: q */
    static final Hashtable f2926q = new Hashtable();

    static {
        m1715a("brainpoolP160r1", InterfaceC0739p.f2943o, f2910a);
        m1715a("brainpoolP160t1", InterfaceC0739p.f2944p, f2911b);
        m1715a("brainpoolP192r1", InterfaceC0739p.f2945q, f2912c);
        m1715a("brainpoolP192t1", InterfaceC0739p.f2946r, f2913d);
        m1715a("brainpoolP224r1", InterfaceC0739p.f2947s, f2914e);
        m1715a("brainpoolP224t1", InterfaceC0739p.f2948t, f2915f);
        m1715a("brainpoolP256r1", InterfaceC0739p.f2949u, f2916g);
        m1715a("brainpoolP256t1", InterfaceC0739p.f2950v, f2917h);
        m1715a("brainpoolP320r1", InterfaceC0739p.f2951w, f2918i);
        m1715a("brainpoolP320t1", InterfaceC0739p.f2952x, f2919j);
        m1715a("brainpoolP384r1", InterfaceC0739p.f2953y, f2920k);
        m1715a("brainpoolP384t1", InterfaceC0739p.f2954z, f2921l);
        m1715a("brainpoolP512r1", InterfaceC0739p.f2927A, f2922m);
        m1715a("brainpoolP512t1", InterfaceC0739p.f2928B, f2923n);
    }

    /* JADX INFO: renamed from: a */
    public static Enumeration m1711a() {
        return f2926q.elements();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1712a(String str) {
        C0653p c0653p = (C0653p) f2924o.get(C1560k.m4166c(str));
        if (c0653p != null) {
            return m1713a(c0653p);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1713a(C0653p c0653p) {
        AbstractC0508ae abstractC0508ae = (AbstractC0508ae) f2925p.get(c0653p);
        if (abstractC0508ae != null) {
            return abstractC0508ae.m1371b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ AbstractC1381d m1714a(AbstractC1381d abstractC1381d) {
        return abstractC1381d;
    }

    /* JADX INFO: renamed from: a */
    private static void m1715a(String str, C0653p c0653p, AbstractC0508ae abstractC0508ae) {
        f2924o.put(C1560k.m4166c(str), c0653p);
        f2926q.put(c0653p, str);
        f2925p.put(c0653p, abstractC0508ae);
    }

    /* JADX INFO: renamed from: b */
    public static String m1716b(C0653p c0653p) {
        return (String) f2926q.get(c0653p);
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1717b(String str) {
        return (C0653p) f2924o.get(C1560k.m4166c(str));
    }
}
