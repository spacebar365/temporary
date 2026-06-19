package org.bouncycastle.p118e.p129c.p131b.p132a;

import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.g */
/* JADX INFO: loaded from: classes.dex */
final class C1502g {
    /* JADX INFO: renamed from: a */
    static C0759a m3999a(String str) {
        if (str.equals("SHA-1")) {
            return new C0759a(InterfaceC0659b.f2575i, C0579bc.f2112a);
        }
        if (str.equals("SHA-224")) {
            return new C0759a(InterfaceC0652b.f2493f, C0579bc.f2112a);
        }
        if (str.equals("SHA-256")) {
            return new C0759a(InterfaceC0652b.f2490c, C0579bc.f2112a);
        }
        if (str.equals("SHA-384")) {
            return new C0759a(InterfaceC0652b.f2491d, C0579bc.f2112a);
        }
        if (str.equals("SHA-512")) {
            return new C0759a(InterfaceC0652b.f2492e, C0579bc.f2112a);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC1175r m4000a(C0759a c0759a) {
        if (c0759a.m1783a().equals(InterfaceC0659b.f2575i)) {
            return new C0842s();
        }
        if (c0759a.m1783a().equals(InterfaceC0652b.f2493f)) {
            return new C0843t();
        }
        if (c0759a.m1783a().equals(InterfaceC0652b.f2490c)) {
            return new C0844u();
        }
        if (c0759a.m1783a().equals(InterfaceC0652b.f2491d)) {
            return new C0845v();
        }
        if (c0759a.m1783a().equals(InterfaceC0652b.f2492e)) {
            return new C0847x();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + c0759a.m1783a());
    }
}
