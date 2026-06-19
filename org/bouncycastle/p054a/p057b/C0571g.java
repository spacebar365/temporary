package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0571g extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0618f f2092a;

    /* JADX INFO: renamed from: b */
    private final C0573i f2093b;

    public C0571g(C0566b c0566b, C0573i c0573i) {
        this.f2092a = c0566b;
        this.f2093b = c0573i;
    }

    private C0571g(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 2) {
            throw new IllegalArgumentException("malformed sequence");
        }
        InterfaceC0618f interfaceC0618fMo1482a = abstractC0723v.mo1482a(0);
        if ((interfaceC0618fMo1482a instanceof C0566b) || (interfaceC0618fMo1482a instanceof C0572h)) {
            this.f2092a = interfaceC0618fMo1482a;
        } else {
            AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(interfaceC0618fMo1482a);
            if (abstractC0723vM1708a.mo1484d() == 2) {
                this.f2092a = C0566b.m1419a(abstractC0723vM1708a);
            } else {
                this.f2092a = C0572h.m1438a(abstractC0723vM1708a);
            }
        }
        this.f2093b = C0573i.m1443a(abstractC0723v.mo1482a(1));
    }

    /* JADX INFO: renamed from: a */
    public static C0571g m1435a(Object obj) {
        if (obj != null) {
            return new C0571g(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0573i m1436a() {
        return this.f2093b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1437b() {
        return this.f2092a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2092a);
        c0625g.m1521a(this.f2093b);
        return new C0585bi(c0625g);
    }
}
