package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {
    private final byte[] a;
    private final byte[] b;

    public l(byte[] bArr, byte[] bArr2) {
        this.a = org.bouncycastle.f.a.b(bArr);
        this.b = org.bouncycastle.f.a.b(bArr2);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(0L));
        gVar.a(new be(this.a));
        gVar.a(new be(this.b));
        return new bi(gVar);
    }
}
