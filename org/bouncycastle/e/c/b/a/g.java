package org.bouncycastle.e.c.b.a;

import org.bouncycastle.a.bc;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.b.t;
import org.bouncycastle.b.b.u;
import org.bouncycastle.b.b.v;
import org.bouncycastle.b.b.x;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
final class g {
    static org.bouncycastle.a.z.a a(String str) {
        if (str.equals("SHA-1")) {
            return new org.bouncycastle.a.z.a(org.bouncycastle.a.r.b.i, bc.a);
        }
        if (str.equals("SHA-224")) {
            return new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.f, bc.a);
        }
        if (str.equals("SHA-256")) {
            return new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.c, bc.a);
        }
        if (str.equals("SHA-384")) {
            return new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.d, bc.a);
        }
        if (str.equals("SHA-512")) {
            return new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.e, bc.a);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(String.valueOf(str)));
    }

    static r a(org.bouncycastle.a.z.a aVar) {
        if (aVar.a().equals(org.bouncycastle.a.r.b.i)) {
            return new s();
        }
        if (aVar.a().equals(org.bouncycastle.a.o.b.f)) {
            return new t();
        }
        if (aVar.a().equals(org.bouncycastle.a.o.b.c)) {
            return new u();
        }
        if (aVar.a().equals(org.bouncycastle.a.o.b.d)) {
            return new v();
        }
        if (aVar.a().equals(org.bouncycastle.a.o.b.e)) {
            return new x();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + aVar.a());
    }
}
