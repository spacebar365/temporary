package org.bouncycastle.p118e.p129c.p131b.p137f;

import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1515a {
    /* JADX INFO: renamed from: a */
    public static byte[] m4011a(C0759a c0759a, InterfaceC0618f interfaceC0618f) {
        try {
            return m4012a(new C0780u(c0759a, interfaceC0618f));
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4012a(C0780u c0780u) {
        try {
            return c0780u.m1577a("DER");
        } catch (Exception e) {
            return null;
        }
    }
}
