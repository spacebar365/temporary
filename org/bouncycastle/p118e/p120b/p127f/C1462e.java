package org.bouncycastle.p118e.p120b.p127f;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p086b.C0849z;
import org.bouncycastle.p118e.p119a.C1434h;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;

/* JADX INFO: renamed from: org.bouncycastle.e.b.f.e */
/* JADX INFO: loaded from: classes.dex */
final class C1462e {

    /* JADX INFO: renamed from: a */
    static final C0759a f5276a = new C0759a(InterfaceC1431e.f5165X);

    /* JADX INFO: renamed from: b */
    static final C0759a f5277b = new C0759a(InterfaceC1431e.f5166Y);

    /* JADX INFO: renamed from: c */
    static final C0759a f5278c = new C0759a(InterfaceC1431e.f5167Z);

    /* JADX INFO: renamed from: d */
    static final C0759a f5279d = new C0759a(InterfaceC1431e.f5169aa);

    /* JADX INFO: renamed from: e */
    static final C0759a f5280e = new C0759a(InterfaceC1431e.f5170ab);

    /* JADX INFO: renamed from: f */
    static final C0759a f5281f = new C0759a(InterfaceC0652b.f2497j);

    /* JADX INFO: renamed from: g */
    static final C0759a f5282g = new C0759a(InterfaceC0652b.f2495h);

    /* JADX INFO: renamed from: h */
    static final C0759a f5283h = new C0759a(InterfaceC0652b.f2490c);

    /* JADX INFO: renamed from: i */
    static final C0759a f5284i = new C0759a(InterfaceC0652b.f2492e);

    /* JADX INFO: renamed from: j */
    static final C0759a f5285j = new C0759a(InterfaceC0652b.f2500m);

    /* JADX INFO: renamed from: k */
    static final C0759a f5286k = new C0759a(InterfaceC0652b.f2501n);

    /* JADX INFO: renamed from: l */
    static final Map f5287l;

    /* JADX INFO: renamed from: a */
    static int m3821a(C0759a c0759a) {
        return ((Integer) f5287l.get(c0759a.m1783a())).intValue();
    }

    /* JADX INFO: renamed from: a */
    static String m3822a(C1434h c1434h) {
        C0759a c0759aM3754a = c1434h.m3754a();
        if (c0759aM3754a.m1783a().equals(f5281f.m1783a())) {
            return "SHA3-256";
        }
        if (c0759aM3754a.m1783a().equals(f5282g.m1783a())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + c0759aM3754a.m1783a());
    }

    /* JADX INFO: renamed from: a */
    static C0759a m3823a(int i) {
        switch (i) {
            case 0:
                return f5276a;
            case 1:
                return f5277b;
            case 2:
                return f5278c;
            case 3:
                return f5279d;
            case 4:
                return f5280e;
            default:
                throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    static C0759a m3824a(String str) {
        if (str.equals("SHA3-256")) {
            return f5281f;
        }
        if (str.equals("SHA-512/256")) {
            return f5282g;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC1175r m3825a(C0653p c0653p) {
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

    /* JADX INFO: renamed from: b */
    static C0759a m3826b(String str) {
        if (str.equals("SHA-256")) {
            return f5283h;
        }
        if (str.equals("SHA-512")) {
            return f5284i;
        }
        if (str.equals("SHAKE128")) {
            return f5285j;
        }
        if (str.equals("SHAKE256")) {
            return f5286k;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(String.valueOf(str)));
    }

    static {
        HashMap map = new HashMap();
        f5287l = map;
        map.put(InterfaceC1431e.f5165X, 0);
        f5287l.put(InterfaceC1431e.f5166Y, 1);
        f5287l.put(InterfaceC1431e.f5167Z, 2);
        f5287l.put(InterfaceC1431e.f5169aa, 3);
        f5287l.put(InterfaceC1431e.f5170ab, 4);
    }
}
