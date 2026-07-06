package org.bouncycastle.e.b.f;

import java.io.IOException;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.a.h;
import org.bouncycastle.e.a.i;
import org.bouncycastle.e.a.j;
import org.bouncycastle.e.a.l;
import org.bouncycastle.e.a.n;
import org.bouncycastle.e.b.g.t;
import org.bouncycastle.e.b.g.z;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static u a(org.bouncycastle.b.k.b bVar) throws IOException {
        if (bVar instanceof org.bouncycastle.e.b.c.b) {
            org.bouncycastle.e.b.c.b bVar2 = (org.bouncycastle.e.b.c.b) bVar;
            return new u(e.a(bVar2.b()), bVar2.c());
        }
        if (bVar instanceof org.bouncycastle.e.b.e.c) {
            org.bouncycastle.e.b.e.c cVar = (org.bouncycastle.e.b.e.c) bVar;
            return new u(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.r, new h(e.a(cVar.b()))), cVar.c());
        }
        if (bVar instanceof org.bouncycastle.e.b.b.b) {
            return new u(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.v), ((org.bouncycastle.e.b.b.b) bVar).b());
        }
        if (bVar instanceof z) {
            z zVar = (z) bVar;
            return new u(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.w, new i(zVar.f().d(), e.b(zVar.b()))), new n(zVar.e(), zVar.d()));
        }
        if (!(bVar instanceof t)) {
            throw new IOException("key parameters not recognized");
        }
        t tVar = (t) bVar;
        return new u(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.F, new j(tVar.f().a(), tVar.f().b(), e.b(tVar.b()))), new l(tVar.e(), tVar.d()));
    }
}
