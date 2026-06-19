package org.bouncycastle.p054a.p064i;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0630a {

    /* JADX INFO: renamed from: a */
    static AbstractC0508ae f2270a = new C0631b();

    /* JADX INFO: renamed from: b */
    static AbstractC0508ae f2271b = new C0632c();

    /* JADX INFO: renamed from: c */
    static final Hashtable f2272c = new Hashtable();

    /* JADX INFO: renamed from: d */
    static final Hashtable f2273d = new Hashtable();

    /* JADX INFO: renamed from: e */
    static final Hashtable f2274e = new Hashtable();

    static {
        m1530a("wapip192v1", InterfaceC0633d.f2284J, f2271b);
        m1530a("sm2p256v1", InterfaceC0633d.f2280F, f2270a);
    }

    /* JADX INFO: renamed from: a */
    public static Enumeration m1526a() {
        return f2274e.elements();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1527a(String str) {
        C0653p c0653pM1532b = m1532b(str);
        if (c0653pM1532b == null) {
            return null;
        }
        return m1528a(c0653pM1532b);
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1528a(C0653p c0653p) {
        AbstractC0508ae abstractC0508ae = (AbstractC0508ae) f2273d.get(c0653p);
        if (abstractC0508ae == null) {
            return null;
        }
        return abstractC0508ae.m1371b();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ AbstractC1381d m1529a(AbstractC1381d abstractC1381d) {
        return abstractC1381d;
    }

    /* JADX INFO: renamed from: a */
    private static void m1530a(String str, C0653p c0653p, AbstractC0508ae abstractC0508ae) {
        f2272c.put(C1560k.m4166c(str), c0653p);
        f2274e.put(c0653p, str);
        f2273d.put(c0653p, abstractC0508ae);
    }

    /* JADX INFO: renamed from: b */
    public static String m1531b(C0653p c0653p) {
        return (String) f2274e.get(c0653p);
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1532b(String str) {
        return (C0653p) f2272c.get(C1560k.m4166c(str));
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ BigInteger m1533c(String str) {
        return new BigInteger(1, C1541f.m4106a(str));
    }
}
