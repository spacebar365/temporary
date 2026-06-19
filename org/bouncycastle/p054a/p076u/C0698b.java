package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0698b {

    /* JADX INFO: renamed from: a */
    static AbstractC0508ae f2883a = new C0699c();

    /* JADX INFO: renamed from: b */
    static AbstractC0508ae f2884b = new C0710n();

    /* JADX INFO: renamed from: c */
    static AbstractC0508ae f2885c = new C0721y();

    /* JADX INFO: renamed from: d */
    static AbstractC0508ae f2886d = new C0691ad();

    /* JADX INFO: renamed from: e */
    static AbstractC0508ae f2887e = new C0692ae();

    /* JADX INFO: renamed from: f */
    static AbstractC0508ae f2888f = new C0693af();

    /* JADX INFO: renamed from: g */
    static AbstractC0508ae f2889g = new C0694ag();

    /* JADX INFO: renamed from: h */
    static AbstractC0508ae f2890h = new C0695ah();

    /* JADX INFO: renamed from: i */
    static AbstractC0508ae f2891i = new C0696ai();

    /* JADX INFO: renamed from: j */
    static AbstractC0508ae f2892j = new C0700d();

    /* JADX INFO: renamed from: k */
    static AbstractC0508ae f2893k = new C0701e();

    /* JADX INFO: renamed from: l */
    static AbstractC0508ae f2894l = new C0702f();

    /* JADX INFO: renamed from: m */
    static AbstractC0508ae f2895m = new C0703g();

    /* JADX INFO: renamed from: n */
    static AbstractC0508ae f2896n = new C0704h();

    /* JADX INFO: renamed from: o */
    static AbstractC0508ae f2897o = new C0705i();

    /* JADX INFO: renamed from: p */
    static AbstractC0508ae f2898p = new C0706j();

    /* JADX INFO: renamed from: q */
    static AbstractC0508ae f2899q = new C0707k();

    /* JADX INFO: renamed from: r */
    static AbstractC0508ae f2900r = new C0708l();

    /* JADX INFO: renamed from: s */
    static AbstractC0508ae f2901s = new C0709m();

    /* JADX INFO: renamed from: t */
    static AbstractC0508ae f2902t = new C0711o();

    /* JADX INFO: renamed from: u */
    static AbstractC0508ae f2903u = new C0712p();

    /* JADX INFO: renamed from: v */
    static AbstractC0508ae f2904v = new C0713q();

    /* JADX INFO: renamed from: w */
    static AbstractC0508ae f2905w = new C0714r();

    /* JADX INFO: renamed from: x */
    static AbstractC0508ae f2906x = new C0715s();

    /* JADX INFO: renamed from: y */
    static AbstractC0508ae f2907y = new C0716t();

    /* JADX INFO: renamed from: z */
    static AbstractC0508ae f2908z = new C0717u();

    /* JADX INFO: renamed from: A */
    static AbstractC0508ae f2873A = new C0718v();

    /* JADX INFO: renamed from: B */
    static AbstractC0508ae f2874B = new C0719w();

    /* JADX INFO: renamed from: C */
    static AbstractC0508ae f2875C = new C0720x();

    /* JADX INFO: renamed from: D */
    static AbstractC0508ae f2876D = new C0722z();

    /* JADX INFO: renamed from: E */
    static AbstractC0508ae f2877E = new C0688aa();

    /* JADX INFO: renamed from: F */
    static AbstractC0508ae f2878F = new C0689ab();

    /* JADX INFO: renamed from: G */
    static AbstractC0508ae f2879G = new C0690ac();

    /* JADX INFO: renamed from: H */
    static final Hashtable f2880H = new Hashtable();

    /* JADX INFO: renamed from: I */
    static final Hashtable f2881I = new Hashtable();

    /* JADX INFO: renamed from: J */
    static final Hashtable f2882J = new Hashtable();

    static {
        m1703a("secp112r1", InterfaceC0697aj.f2853g, f2883a);
        m1703a("secp112r2", InterfaceC0697aj.f2854h, f2884b);
        m1703a("secp128r1", InterfaceC0697aj.f2867u, f2885c);
        m1703a("secp128r2", InterfaceC0697aj.f2868v, f2886d);
        m1703a("secp160k1", InterfaceC0697aj.f2856j, f2887e);
        m1703a("secp160r1", InterfaceC0697aj.f2855i, f2888f);
        m1703a("secp160r2", InterfaceC0697aj.f2869w, f2889g);
        m1703a("secp192k1", InterfaceC0697aj.f2870x, f2890h);
        m1703a("secp192r1", InterfaceC0697aj.f2828G, f2891i);
        m1703a("secp224k1", InterfaceC0697aj.f2871y, f2892j);
        m1703a("secp224r1", InterfaceC0697aj.f2872z, f2893k);
        m1703a("secp256k1", InterfaceC0697aj.f2857k, f2894l);
        m1703a("secp256r1", InterfaceC0697aj.f2829H, f2895m);
        m1703a("secp384r1", InterfaceC0697aj.f2822A, f2896n);
        m1703a("secp521r1", InterfaceC0697aj.f2823B, f2897o);
        m1703a("sect113r1", InterfaceC0697aj.f2851e, f2898p);
        m1703a("sect113r2", InterfaceC0697aj.f2852f, f2899q);
        m1703a("sect131r1", InterfaceC0697aj.f2861o, f2900r);
        m1703a("sect131r2", InterfaceC0697aj.f2862p, f2901s);
        m1703a("sect163k1", InterfaceC0697aj.f2848b, f2902t);
        m1703a("sect163r1", InterfaceC0697aj.f2849c, f2903u);
        m1703a("sect163r2", InterfaceC0697aj.f2858l, f2904v);
        m1703a("sect193r1", InterfaceC0697aj.f2863q, f2905w);
        m1703a("sect193r2", InterfaceC0697aj.f2864r, f2906x);
        m1703a("sect233k1", InterfaceC0697aj.f2865s, f2907y);
        m1703a("sect233r1", InterfaceC0697aj.f2866t, f2908z);
        m1703a("sect239k1", InterfaceC0697aj.f2850d, f2873A);
        m1703a("sect283k1", InterfaceC0697aj.f2859m, f2874B);
        m1703a("sect283r1", InterfaceC0697aj.f2860n, f2875C);
        m1703a("sect409k1", InterfaceC0697aj.f2824C, f2876D);
        m1703a("sect409r1", InterfaceC0697aj.f2825D, f2877E);
        m1703a("sect571k1", InterfaceC0697aj.f2826E, f2878F);
        m1703a("sect571r1", InterfaceC0697aj.f2827F, f2879G);
    }

    /* JADX INFO: renamed from: a */
    public static Enumeration m1698a() {
        return f2882J.elements();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1699a(String str) {
        C0653p c0653pM1705b = m1705b(str);
        if (c0653pM1705b == null) {
            return null;
        }
        return m1700a(c0653pM1705b);
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1700a(C0653p c0653p) {
        AbstractC0508ae abstractC0508ae = (AbstractC0508ae) f2881I.get(c0653p);
        if (abstractC0508ae == null) {
            return null;
        }
        return abstractC0508ae.m1371b();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ AbstractC1381d m1701a(AbstractC1381d abstractC1381d) {
        return abstractC1381d;
    }

    /* JADX INFO: renamed from: a */
    private static void m1703a(String str, C0653p c0653p, AbstractC0508ae abstractC0508ae) {
        f2880H.put(str, c0653p);
        f2882J.put(c0653p, str);
        f2881I.put(c0653p, abstractC0508ae);
    }

    /* JADX INFO: renamed from: b */
    public static String m1704b(C0653p c0653p) {
        return (String) f2882J.get(c0653p);
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1705b(String str) {
        return (C0653p) f2880H.get(C1560k.m4166c(str));
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ BigInteger m1706c(String str) {
        return new BigInteger(1, C1541f.m4106a(str));
    }
}
