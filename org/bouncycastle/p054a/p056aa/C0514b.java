package org.bouncycastle.p054a.p056aa;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p055a.C0499a;
import org.bouncycastle.p054a.p061f.C0620b;
import org.bouncycastle.p054a.p064i.C0630a;
import org.bouncycastle.p054a.p070o.C0651a;
import org.bouncycastle.p054a.p076u.C0698b;
import org.bouncycastle.p054a.p077v.C0724a;
import org.bouncycastle.p083b.p087c.C0851a;
import org.bouncycastle.p083b.p097k.C1122y;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0514b {
    /* JADX INFO: renamed from: a */
    public static String m1378a(C0653p c0653p) {
        String strM1392b = C0516d.m1392b(c0653p);
        if (strM1392b == null) {
            strM1392b = C0698b.m1704b(c0653p);
        }
        if (strM1392b == null) {
            strM1392b = C0651a.m1579a(c0653p);
        }
        if (strM1392b == null) {
            strM1392b = C0724a.m1716b(c0653p);
        }
        if (strM1392b == null) {
            strM1392b = C0499a.m1346b(c0653p);
        }
        if (strM1392b == null) {
            strM1392b = C0620b.m1505b(c0653p);
        }
        if (strM1392b == null) {
            strM1392b = C0630a.m1531b(c0653p);
        }
        return strM1392b == null ? C0851a.m2117b(c0653p) : strM1392b;
    }

    /* JADX INFO: renamed from: a */
    public static Enumeration m1379a() {
        Vector vector = new Vector();
        m1382a(vector, C0516d.m1388a());
        m1382a(vector, C0698b.m1698a());
        m1382a(vector, C0651a.m1580a());
        m1382a(vector, C0724a.m1711a());
        m1382a(vector, C0499a.m1342a());
        m1382a(vector, C0620b.m1502a());
        m1382a(vector, C0630a.m1526a());
        return vector.elements();
    }

    /* JADX INFO: renamed from: a */
    public static C0507ad m1380a(String str) {
        C0507ad c0507adM1389a = C0516d.m1389a(str);
        if (c0507adM1389a == null) {
            c0507adM1389a = C0698b.m1699a(str);
        }
        if (c0507adM1389a == null) {
            c0507adM1389a = C0651a.m1581a(str);
        }
        if (c0507adM1389a == null) {
            c0507adM1389a = C0724a.m1712a(str);
        }
        if (c0507adM1389a == null) {
            c0507adM1389a = C0499a.m1343a(str);
        }
        if (c0507adM1389a == null) {
            c0507adM1389a = m1381a(C0620b.m1503a(str));
        }
        return c0507adM1389a == null ? C0630a.m1527a(str) : c0507adM1389a;
    }

    /* JADX INFO: renamed from: a */
    private static C0507ad m1381a(C1122y c1122y) {
        if (c1122y == null) {
            return null;
        }
        return new C0507ad(c1122y.m2699a(), c1122y.m2700b(), c1122y.m2701c(), c1122y.m2702d(), c1122y.m2704f());
    }

    /* JADX INFO: renamed from: a */
    private static void m1382a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0507ad m1383b(C0653p c0653p) {
        C0507ad c0507adM1390a = C0516d.m1390a(c0653p);
        if (c0507adM1390a == null) {
            c0507adM1390a = C0698b.m1700a(c0653p);
        }
        if (c0507adM1390a == null) {
            c0507adM1390a = C0724a.m1713a(c0653p);
        }
        if (c0507adM1390a == null) {
            c0507adM1390a = C0499a.m1344a(c0653p);
        }
        if (c0507adM1390a == null) {
            c0507adM1390a = m1381a(C0620b.m1504a(c0653p));
        }
        return c0507adM1390a == null ? C0630a.m1528a(c0653p) : c0507adM1390a;
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m1384b(String str) {
        C0653p c0653pM1393b = C0516d.m1393b(str);
        if (c0653pM1393b == null) {
            c0653pM1393b = C0698b.m1705b(str);
        }
        if (c0653pM1393b == null) {
            c0653pM1393b = C0651a.m1583b(str);
        }
        if (c0653pM1393b == null) {
            c0653pM1393b = C0724a.m1717b(str);
        }
        if (c0653pM1393b == null) {
            c0653pM1393b = C0499a.m1347b(str);
        }
        if (c0653pM1393b == null) {
            c0653pM1393b = C0620b.m1506b(str);
        }
        return c0653pM1393b == null ? C0630a.m1532b(str) : c0653pM1393b;
    }
}
