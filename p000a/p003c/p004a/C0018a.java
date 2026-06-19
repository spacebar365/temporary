package p000a.p003c.p004a;

import p000a.p003c.AbstractC0037f;
import p000a.p003c.C0036e;
import p000a.p003c.C0043l;
import p000a.p029g.C0214ad;

/* JADX INFO: renamed from: a.c.a.a */
/* JADX INFO: compiled from: LsaPolicyHandle.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0018a extends C0043l.a implements AutoCloseable {

    /* JADX INFO: renamed from: c */
    private final AbstractC0037f f102c;

    /* JADX INFO: renamed from: d */
    private boolean f103d;

    public C0018a(AbstractC0037f abstractC0037f, String str) throws C0036e, C0214ad {
        this.f102c = abstractC0037f;
        C0023f c0023f = new C0023f(str == null ? "\\\\" : str, this);
        abstractC0037f.m162a(c0023f);
        if (c0023f.f120h != 0) {
            throw new C0214ad(c0023f.f120h, false);
        }
        this.f103d = true;
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f103d) {
            this.f103d = false;
            C0022e c0022e = new C0022e(this);
            this.f102c.m162a(c0022e);
            if (c0022e.f105h != 0) {
                throw new C0214ad(c0022e.f105h, false);
            }
        }
    }
}
