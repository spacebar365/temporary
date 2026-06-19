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

/* JADX INFO: renamed from: org.bouncycastle.a.s.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0677q extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f2763a;

    /* JADX INFO: renamed from: b */
    AbstractC0655q f2764b;

    public C0677q(int i, byte[] bArr) {
        this.f2763a = new C0640m(i);
        this.f2764b = new C0581be(bArr);
    }

    private C0677q(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() == 1) {
            this.f2763a = null;
            this.f2764b = (AbstractC0655q) abstractC0723v.mo1482a(0);
        } else {
            this.f2763a = (C0640m) abstractC0723v.mo1482a(0);
            this.f2764b = (AbstractC0655q) abstractC0723v.mo1482a(1);
        }
    }

    public C0677q(byte[] bArr) {
        this.f2763a = null;
        this.f2764b = new C0581be(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0677q m1661a(Object obj) {
        if (obj != null) {
            return new C0677q(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1662a() {
        if (this.f2763a == null) {
            return null;
        }
        return this.f2763a.m1564b();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1663b() {
        return this.f2764b.mo1410c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f2763a != null) {
            c0625g.m1521a(this.f2763a);
        }
        c0625g.m1521a(this.f2764b);
        return new C0585bi(c0625g);
    }
}
