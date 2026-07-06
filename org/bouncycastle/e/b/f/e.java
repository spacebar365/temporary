package org.bouncycastle.e.b.f;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.p;
import org.bouncycastle.b.b.u;
import org.bouncycastle.b.b.x;
import org.bouncycastle.b.b.z;
import org.bouncycastle.b.r;
import org.bouncycastle.e.a.h;

/* JADX INFO: loaded from: classes.dex */
final class e {
    static final org.bouncycastle.a.z.a a = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.X);
    static final org.bouncycastle.a.z.a b = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.Y);
    static final org.bouncycastle.a.z.a c = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.Z);
    static final org.bouncycastle.a.z.a d = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.aa);
    static final org.bouncycastle.a.z.a e = new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.ab);
    static final org.bouncycastle.a.z.a f = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.j);
    static final org.bouncycastle.a.z.a g = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.h);
    static final org.bouncycastle.a.z.a h = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.c);
    static final org.bouncycastle.a.z.a i = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.e);
    static final org.bouncycastle.a.z.a j = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.m);
    static final org.bouncycastle.a.z.a k = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.n);
    static final Map l;

    static int a(org.bouncycastle.a.z.a aVar) {
        return ((Integer) l.get(aVar.a())).intValue();
    }

    static String a(h hVar) {
        org.bouncycastle.a.z.a aVarA = hVar.a();
        if (aVarA.a().equals(f.a())) {
            return "SHA3-256";
        }
        if (aVarA.a().equals(g.a())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + aVarA.a());
    }

    static org.bouncycastle.a.z.a a(int i2) {
        switch (i2) {
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
            case 4:
                return e;
            default:
                throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i2)));
        }
    }

    static org.bouncycastle.a.z.a a(String str) {
        if (str.equals("SHA3-256")) {
            return f;
        }
        if (str.equals("SHA-512/256")) {
            return g;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(String.valueOf(str)));
    }

    static r a(p pVar) {
        if (pVar.equals(org.bouncycastle.a.o.b.c)) {
            return new u();
        }
        if (pVar.equals(org.bouncycastle.a.o.b.e)) {
            return new x();
        }
        if (pVar.equals(org.bouncycastle.a.o.b.m)) {
            return new z(128);
        }
        if (pVar.equals(org.bouncycastle.a.o.b.n)) {
            return new z(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(pVar)));
    }

    static org.bouncycastle.a.z.a b(String str) {
        if (str.equals("SHA-256")) {
            return h;
        }
        if (str.equals("SHA-512")) {
            return i;
        }
        if (str.equals("SHAKE128")) {
            return j;
        }
        if (str.equals("SHAKE256")) {
            return k;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(String.valueOf(str)));
    }

    static {
        HashMap map = new HashMap();
        l = map;
        map.put(org.bouncycastle.e.a.e.X, 0);
        l.put(org.bouncycastle.e.a.e.Y, 1);
        l.put(org.bouncycastle.e.a.e.Z, 2);
        l.put(org.bouncycastle.e.a.e.aa, 3);
        l.put(org.bouncycastle.e.a.e.ab, 4);
    }
}
