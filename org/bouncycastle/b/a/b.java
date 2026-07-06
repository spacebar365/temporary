package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.l;
import org.bouncycastle.b.k.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private l a;

    private int a() {
        return (this.a.a().b().a().bitLength() + 7) / 8;
    }

    public final void a(org.bouncycastle.b.i iVar) {
        this.a = (l) iVar;
    }

    public final byte[] b(org.bouncycastle.b.i iVar) {
        m mVar = (m) iVar;
        a aVar = new a();
        a aVar2 = new a();
        aVar.a(this.a.a());
        BigInteger bigIntegerB = aVar.b(mVar.a());
        aVar2.a(this.a.b());
        return org.bouncycastle.f.a.d(org.bouncycastle.f.b.a(a(), aVar2.b(mVar.b())), org.bouncycastle.f.b.a(a(), bigIntegerB));
    }
}
