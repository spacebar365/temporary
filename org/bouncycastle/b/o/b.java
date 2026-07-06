package org.bouncycastle.b.o;

import org.bouncycastle.a.bi;
import org.bouncycastle.a.m;
import org.bouncycastle.a.v;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ag;
import org.bouncycastle.b.k.bn;
import org.bouncycastle.b.k.s;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    static final byte[] a = k.d("openssh-key-v1\u0000");

    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.bouncycastle.b.k.b a(byte[] r9) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.b.o.b.a(byte[]):org.bouncycastle.b.k.b");
    }

    private static boolean a(v vVar) {
        for (int i = 0; i < vVar.d(); i++) {
            if (!(vVar.a(i) instanceof m)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] a(org.bouncycastle.b.k.b bVar) {
        if (!(bVar instanceof bn) && !(bVar instanceof ad)) {
            if (bVar instanceof s) {
                org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
                gVar.a(new m(0L));
                gVar.a(new m(((s) bVar).b().a()));
                gVar.a(new m(((s) bVar).b().b()));
                gVar.a(new m(((s) bVar).b().c()));
                gVar.a(new m(((s) bVar).b().c().modPow(((s) bVar).c(), ((s) bVar).b().a())));
                gVar.a(new m(((s) bVar).c()));
                try {
                    return new bi(gVar).k();
                } catch (Exception e) {
                    throw new IllegalStateException("unable to encode DSAPrivateKeyParameters " + e.getMessage());
                }
            }
            if (!(bVar instanceof ag)) {
                throw new IllegalArgumentException("unable to convert " + bVar.getClass().getName() + " to openssh private key");
            }
            h hVar = new h();
            hVar.b(a);
            hVar.a("none");
            hVar.a("none");
            hVar.a(0L);
            hVar.a(1L);
            hVar.a(c.a(((ag) bVar).c()));
            h hVar2 = new h();
            hVar2.a(16711935L);
            hVar2.a(16711935L);
            hVar2.a("ssh-ed25519");
            byte[] bArrB = ((ag) bVar).c().b();
            hVar2.a(bArrB);
            hVar2.a(org.bouncycastle.f.a.d(((ag) bVar).b(), bArrB));
            hVar2.a(0L);
            hVar.a(hVar2.a());
            return hVar.a();
        }
        return f.a(bVar).c().i().k();
    }
}
