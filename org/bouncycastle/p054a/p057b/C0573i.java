package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.InterfaceC0616e;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.b.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0573i extends AbstractC0650o implements InterfaceC0616e {

    /* JADX INFO: renamed from: a */
    private final int f2100a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0650o f2101b;

    public C0573i(C0574j c0574j) {
        this((InterfaceC0618f) c0574j);
    }

    public C0573i(C0576l c0576l) {
        this(new C0590bn(c0576l));
    }

    private C0573i(InterfaceC0618f interfaceC0618f) {
        if ((interfaceC0618f instanceof AbstractC0723v) || (interfaceC0618f instanceof C0574j)) {
            this.f2100a = 0;
            this.f2101b = C0574j.m1446a(interfaceC0618f);
        } else {
            if (!(interfaceC0618f instanceof AbstractC0539ab)) {
                throw new IllegalArgumentException("Unknown check object in integrity check.");
            }
            this.f2100a = 1;
            this.f2101b = C0576l.m1453a(((AbstractC0539ab) interfaceC0618f).m1402j());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0573i m1443a(Object obj) {
        if (obj instanceof C0573i) {
            return (C0573i) obj;
        }
        if (obj != null) {
            return new C0573i((InterfaceC0618f) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m1444a() {
        return this.f2100a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0650o m1445b() {
        return this.f2101b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f2101b instanceof C0576l ? new C0590bn(this.f2101b) : this.f2101b.mo1358i();
    }
}
