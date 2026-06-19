package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.ab */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539ab extends AbstractC0686u implements InterfaceC0540ac {

    /* JADX INFO: renamed from: a */
    int f1996a;

    /* JADX INFO: renamed from: b */
    boolean f1997b = false;

    /* JADX INFO: renamed from: c */
    boolean f1998c;

    /* JADX INFO: renamed from: d */
    InterfaceC0618f f1999d;

    public AbstractC0539ab(boolean z, int i, InterfaceC0618f interfaceC0618f) {
        this.f1998c = true;
        this.f1999d = null;
        if (interfaceC0618f instanceof InterfaceC0616e) {
            this.f1998c = true;
        } else {
            this.f1998c = z;
        }
        this.f1996a = i;
        if (this.f1998c) {
            this.f1999d = interfaceC0618f;
        } else {
            interfaceC0618f.mo1358i();
            this.f1999d = interfaceC0618f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0539ab m1394a(Object obj) {
        if (obj == null || (obj instanceof AbstractC0539ab)) {
            return (AbstractC0539ab) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return m1394a((Object) m1692b((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0539ab m1395a(AbstractC0539ab abstractC0539ab) {
        return (AbstractC0539ab) abstractC0539ab.m1402j();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    abstract void mo1335a(C0660s c0660s);

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof AbstractC0539ab)) {
            return false;
        }
        AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0686u;
        if (this.f1996a != abstractC0539ab.f1996a || this.f1997b != abstractC0539ab.f1997b || this.f1998c != abstractC0539ab.f1998c) {
            return false;
        }
        if (this.f1999d == null) {
            if (abstractC0539ab.f1999d != null) {
                return false;
            }
        } else if (!this.f1999d.mo1358i().equals(abstractC0539ab.f1999d.mo1358i())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m1396b() {
        return this.f1996a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1397c() {
        return this.f1998c;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return mo1358i();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1399f() {
        return this.f1997b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        return new C0590bn(this.f1998c, this.f1996a, this.f1999d);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: h */
    final AbstractC0686u mo1401h() {
        return new C0601by(this.f1998c, this.f1996a, this.f1999d);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        int i = this.f1996a;
        return this.f1999d != null ? i ^ this.f1999d.hashCode() : i;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0686u m1402j() {
        if (this.f1999d != null) {
            return this.f1999d.mo1358i();
        }
        return null;
    }

    public String toString() {
        return "[" + this.f1996a + "]" + this.f1999d;
    }
}
