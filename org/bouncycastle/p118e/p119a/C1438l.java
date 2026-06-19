package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1438l extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final byte[] f5225a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5226b;

    public C1438l(byte[] bArr, byte[] bArr2) {
        this.f5225a = C1535a.m4086b(bArr);
        this.f5226b = C1535a.m4086b(bArr2);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(0L));
        c0625g.m1521a(new C0581be(this.f5225a));
        c0625g.m1521a(new C0581be(this.f5226b));
        return new C0585bi(c0625g);
    }
}
