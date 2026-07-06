package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    private final int a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;

    public k(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = i;
        this.b = org.bouncycastle.f.a.b(bArr);
        this.c = org.bouncycastle.f.a.b(bArr2);
        this.d = org.bouncycastle.f.a.b(bArr3);
        this.e = org.bouncycastle.f.a.b(bArr4);
        this.f = org.bouncycastle.f.a.b(bArr5);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(0L));
        org.bouncycastle.a.g gVar2 = new org.bouncycastle.a.g();
        gVar2.a(new org.bouncycastle.a.m(this.a));
        gVar2.a(new be(this.b));
        gVar2.a(new be(this.c));
        gVar2.a(new be(this.d));
        gVar2.a(new be(this.e));
        gVar.a(new bi(gVar2));
        gVar.a(new bn(true, 0, new be(this.f)));
        return new bi(gVar);
    }
}
