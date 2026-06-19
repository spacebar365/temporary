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

/* JADX INFO: renamed from: org.bouncycastle.a.s.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0673m extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f2610a;

    /* JADX INFO: renamed from: b */
    AbstractC0655q f2611b;

    private C0673m(AbstractC0723v abstractC0723v) {
        this.f2611b = (AbstractC0655q) abstractC0723v.mo1482a(0);
        this.f2610a = C0640m.m1561a(abstractC0723v.mo1482a(1));
    }

    public C0673m(byte[] bArr, int i) {
        this.f2611b = new C0581be(bArr);
        this.f2610a = new C0640m(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0673m m1650a(Object obj) {
        if (obj instanceof C0673m) {
            return (C0673m) obj;
        }
        if (obj != null) {
            return new C0673m(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1651a() {
        return this.f2610a.m1564b();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1652b() {
        return this.f2611b.mo1410c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2611b);
        c0625g.m1521a(this.f2610a);
        return new C0585bi(c0625g);
    }
}
