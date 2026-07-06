package org.bouncycastle.e.b.f;

import java.io.IOException;
import org.bouncycastle.a.q;
import org.bouncycastle.a.s.p;
import org.bouncycastle.e.a.h;
import org.bouncycastle.e.a.i;
import org.bouncycastle.e.a.j;
import org.bouncycastle.e.a.m;
import org.bouncycastle.e.b.g.aa;
import org.bouncycastle.e.b.g.r;
import org.bouncycastle.e.b.g.s$a;
import org.bouncycastle.e.b.g.x;
import org.bouncycastle.e.b.g.y$a;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static org.bouncycastle.b.k.b a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (pVarA.a(org.bouncycastle.a.b.a.W)) {
            return new org.bouncycastle.e.b.c.a(e.a(pVar.b()), q.a(pVar.c()).c());
        }
        if (pVarA.equals(org.bouncycastle.a.b.a.s)) {
            return new org.bouncycastle.e.b.e.b(q.a(pVar.c()).c(), e.a(h.a(pVar.b().b())));
        }
        if (pVarA.equals(org.bouncycastle.a.b.a.ad)) {
            return new org.bouncycastle.e.b.b.a(a(q.a(pVar.c()).c()));
        }
        if (pVarA.equals(org.bouncycastle.a.b.a.w)) {
            i iVarA = i.a(pVar.b().b());
            org.bouncycastle.a.p pVarA2 = iVarA.b().a();
            m mVarA = m.a(pVar.c());
            try {
                y$a y_aD = new y$a(new x(iVarA.a(), e.a(pVarA2))).a(mVarA.a()).a(mVarA.b()).b(mVarA.c()).c(mVarA.d()).d(mVarA.e());
                if (mVarA.f() != null) {
                    y_aD.a(((org.bouncycastle.e.b.g.a) aa.a(mVarA.f(), org.bouncycastle.e.b.g.a.class)).a(pVarA2));
                }
                return y_aD.a();
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
            }
        }
        if (!pVarA.equals(org.bouncycastle.e.a.e.F)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        j jVarA = j.a(pVar.b().b());
        org.bouncycastle.a.p pVarA3 = jVarA.c().a();
        try {
            m mVarA2 = m.a(pVar.c());
            s$a s_aD = new s$a(new r(jVarA.a(), jVarA.b(), e.a(pVarA3))).a(mVarA2.a()).a(mVarA2.b()).b(mVarA2.c()).c(mVarA2.d()).d(mVarA2.e());
            if (mVarA2.f() != null) {
                s_aD.a(((org.bouncycastle.e.b.g.b) aa.a(mVarA2.f(), org.bouncycastle.e.b.g.b.class)).a(pVarA3));
            }
            return s_aD.a();
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }

    private static short[] a(byte[] bArr) {
        short[] sArr = new short[bArr.length / 2];
        for (int i = 0; i != sArr.length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
        }
        return sArr;
    }
}
