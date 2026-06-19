package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;

/* JADX INFO: loaded from: classes.dex */
public class KeyUtil {
    /* JADX INFO: renamed from: a */
    private static byte[] m4338a(C0676p c0676p) {
        try {
            return c0676p.m1577a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4339a(C0759a c0759a, InterfaceC0618f interfaceC0618f) {
        try {
            return m4340a(new C0780u(c0759a, interfaceC0618f));
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4340a(C0780u c0780u) {
        try {
            return c0780u.m1577a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4341b(C0759a c0759a, InterfaceC0618f interfaceC0618f) {
        try {
            return m4338a(new C0676p(c0759a, interfaceC0618f.mo1358i()));
        } catch (Exception e) {
            return null;
        }
    }
}
