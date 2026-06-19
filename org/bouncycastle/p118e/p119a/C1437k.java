package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1437k extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final int f5219a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5220b;

    /* JADX INFO: renamed from: c */
    private final byte[] f5221c;

    /* JADX INFO: renamed from: d */
    private final byte[] f5222d;

    /* JADX INFO: renamed from: e */
    private final byte[] f5223e;

    /* JADX INFO: renamed from: f */
    private final byte[] f5224f;

    public C1437k(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f5219a = i;
        this.f5220b = C1535a.m4086b(bArr);
        this.f5221c = C1535a.m4086b(bArr2);
        this.f5222d = C1535a.m4086b(bArr3);
        this.f5223e = C1535a.m4086b(bArr4);
        this.f5224f = C1535a.m4086b(bArr5);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(0L));
        C0625g c0625g2 = new C0625g();
        c0625g2.m1521a(new C0640m(this.f5219a));
        c0625g2.m1521a(new C0581be(this.f5220b));
        c0625g2.m1521a(new C0581be(this.f5221c));
        c0625g2.m1521a(new C0581be(this.f5222d));
        c0625g2.m1521a(new C0581be(this.f5223e));
        c0625g.m1521a(new C0585bi(c0625g2));
        c0625g.m1521a(new C0590bn(true, 0, new C0581be(this.f5224f)));
        return new C0585bi(c0625g);
    }
}
