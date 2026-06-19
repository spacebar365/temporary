package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.s.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0670j extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f2601a;

    /* JADX INFO: renamed from: b */
    AbstractC0655q f2602b;

    private C0670j(AbstractC0723v abstractC0723v) {
        this.f2602b = (AbstractC0655q) abstractC0723v.mo1482a(0);
        this.f2601a = (C0640m) abstractC0723v.mo1482a(1);
    }

    public C0670j(byte[] bArr, int i) {
        if (bArr.length != 8) {
            throw new IllegalArgumentException("salt length must be 8");
        }
        this.f2602b = new C0581be(bArr);
        this.f2601a = new C0640m(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0670j m1638a(Object obj) {
        if (obj != null) {
            return new C0670j(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1639a() {
        return this.f2601a.m1564b();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1640b() {
        return this.f2602b.mo1410c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2602b);
        c0625g.m1521a(this.f2601a);
        return new C0585bi(c0625g);
    }
}
