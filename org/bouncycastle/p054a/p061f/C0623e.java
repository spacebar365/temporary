package org.bouncycastle.p054a.p061f;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.f.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0623e extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    int f2230a = 1024;

    /* JADX INFO: renamed from: b */
    C0640m f2231b;

    /* JADX INFO: renamed from: c */
    C0640m f2232c;

    /* JADX INFO: renamed from: d */
    C0640m f2233d;

    public C0623e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f2231b = new C0640m(bigInteger);
        this.f2232c = new C0640m(bigInteger2);
        this.f2233d = new C0640m(bigInteger3);
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1512a() {
        return this.f2231b.m1565c();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1513b() {
        return this.f2232c.m1565c();
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1514c() {
        return this.f2233d.m1565c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f2230a));
        c0625g.m1521a(this.f2231b);
        c0625g.m1521a(this.f2232c);
        c0625g.m1521a(this.f2233d);
        return new C0585bi(c0625g);
    }
}
