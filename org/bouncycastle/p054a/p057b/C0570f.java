package org.bouncycastle.p054a.p057b;

import java.util.Iterator;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1553d;

/* JADX INFO: renamed from: org.bouncycastle.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0570f extends AbstractC0650o implements InterfaceC1553d<InterfaceC0618f> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0618f[] f2091a;

    private C0570f(AbstractC0723v abstractC0723v) {
        this.f2091a = new InterfaceC0618f[abstractC0723v.mo1484d()];
        for (int i = 0; i != this.f2091a.length; i++) {
            this.f2091a[i] = C0569e.m1428a(abstractC0723v.mo1482a(i));
        }
    }

    public C0570f(C0569e[] c0569eArr) {
        this.f2091a = new InterfaceC0618f[c0569eArr.length];
        System.arraycopy(c0569eArr, 0, this.f2091a, 0, c0569eArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static C0570f m1434a(Object obj) {
        if (obj instanceof C0570f) {
            return (C0570f) obj;
        }
        if (obj != null) {
            return new C0570f(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0585bi(this.f2091a);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC0618f> iterator() {
        return new C1535a.a(this.f2091a);
    }
}
