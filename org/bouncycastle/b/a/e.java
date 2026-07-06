package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.w;
import org.bouncycastle.b.k.x;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private w a;

    private int a() {
        return (this.a.a().b().a().a() + 7) / 8;
    }

    public final void a(org.bouncycastle.b.i iVar) {
        this.a = (w) iVar;
    }

    public final byte[] b(org.bouncycastle.b.i iVar) {
        x xVar = (x) iVar;
        d dVar = new d();
        d dVar2 = new d();
        dVar.a(this.a.a());
        BigInteger bigIntegerB = dVar.b(xVar.a());
        dVar2.a(this.a.b());
        return org.bouncycastle.f.a.d(org.bouncycastle.f.b.a(a(), dVar2.b(xVar.b())), org.bouncycastle.f.b.a(a(), bigIntegerB));
    }
}
