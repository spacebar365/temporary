package org.bouncycastle.p054a.p055a;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0499a {

    /* JADX INFO: renamed from: a */
    static AbstractC0508ae f1872a = new C0500b();

    /* JADX INFO: renamed from: b */
    static final Hashtable f1873b = new Hashtable();

    /* JADX INFO: renamed from: c */
    static final Hashtable f1874c = new Hashtable();

    /* JADX INFO: renamed from: d */
    static final Hashtable f1875d = new Hashtable();

    /* JADX INFO: renamed from: a */
    public static Enumeration m1342a() {
        return f1875d.elements();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1343a(String str) {
        C0653p c0653pM1347b = m1347b(str);
        if (c0653pM1347b == null) {
            return null;
        }
        return m1344a(c0653pM1347b);
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1344a(C0653p c0653p) {
        AbstractC0508ae abstractC0508ae = (AbstractC0508ae) f1874c.get(c0653p);
        if (abstractC0508ae == null) {
            return null;
        }
        return abstractC0508ae.m1371b();
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ AbstractC1381d m1345a(AbstractC1381d abstractC1381d) {
        return abstractC1381d;
    }

    /* JADX INFO: renamed from: b */
    public static String m1346b(C0653p c0653p) {
        return (String) f1875d.get(c0653p);
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1347b(String str) {
        return (C0653p) f1873b.get(C1560k.m4166c(str));
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ BigInteger m1348c(String str) {
        return new BigInteger(1, C1541f.m4106a(str));
    }

    static {
        C0653p c0653p = InterfaceC0501c.f1876a;
        AbstractC0508ae abstractC0508ae = f1872a;
        f1873b.put(C1560k.m4166c("FRP256v1"), c0653p);
        f1875d.put(c0653p, "FRP256v1");
        f1874c.put(c0653p, abstractC0508ae);
    }
}
