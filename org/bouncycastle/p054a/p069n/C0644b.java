package org.bouncycastle.p054a.p069n;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.n.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0644b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    AbstractC0655q f2407a;

    private C0644b(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() == 1) {
            this.f2407a = (AbstractC0655q) abstractC0723v.mo1482a(0);
        } else {
            this.f2407a = null;
        }
    }

    public C0644b(byte[] bArr) {
        this.f2407a = new C0581be(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0644b m1569a(Object obj) {
        if (obj != null) {
            return new C0644b(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1570a() {
        if (this.f2407a != null) {
            return C1535a.m4086b(this.f2407a.mo1410c());
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f2407a != null) {
            c0625g.m1521a(this.f2407a);
        }
        return new C0585bi(c0625g);
    }
}
