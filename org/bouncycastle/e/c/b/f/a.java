package org.bouncycastle.e.c.b.f;

import org.bouncycastle.a.f;
import org.bouncycastle.a.z.u;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static byte[] a(org.bouncycastle.a.z.a aVar, f fVar) {
        try {
            return a(new u(aVar, fVar));
        } catch (Exception e) {
            return null;
        }
    }

    private static byte[] a(u uVar) {
        try {
            return uVar.a("DER");
        } catch (Exception e) {
            return null;
        }
    }
}
