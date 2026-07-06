package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.a.f;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.u;

/* JADX INFO: loaded from: classes.dex */
public class KeyUtil {
    private static byte[] a(p pVar) {
        try {
            return pVar.a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] a(a aVar, f fVar) {
        try {
            return a(new u(aVar, fVar));
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] a(u uVar) {
        try {
            return uVar.a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] b(a aVar, f fVar) {
        try {
            return a(new p(aVar, fVar.i()));
        } catch (Exception e) {
            return null;
        }
    }
}
