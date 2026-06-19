package p000a.p003c;

import p000a.p003c.p005b.AbstractC0032d;
import p000a.p003c.p005b.C0029a;
import p000a.p003c.p005b.C0030b;

/* JADX INFO: renamed from: a.c.g */
/* JADX INFO: compiled from: DcerpcMessage.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0038g extends AbstractC0032d implements InterfaceC0034c {

    /* JADX INFO: renamed from: b */
    protected int f197b = -1;

    /* JADX INFO: renamed from: c */
    protected int f198c = 0;

    /* JADX INFO: renamed from: d */
    protected int f199d = 0;

    /* JADX INFO: renamed from: e */
    protected int f200e = 0;

    /* JADX INFO: renamed from: f */
    protected int f201f = 0;

    /* JADX INFO: renamed from: g */
    protected int f202g = 0;

    /* JADX INFO: renamed from: a */
    public abstract void mo124a(C0029a c0029a);

    /* JADX INFO: renamed from: b */
    public abstract int mo125b();

    /* JADX INFO: renamed from: b */
    public abstract void mo126b(C0029a c0029a);

    /* JADX INFO: renamed from: c */
    public final boolean m167c() {
        return (this.f198c & 2) == 2;
    }

    /* JADX INFO: renamed from: a */
    public C0036e mo123a() {
        if (this.f202g != 0) {
            return new C0036e(this.f202g);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    final void m166c(C0029a c0029a) {
        c0029a.m148e(5);
        c0029a.m148e(0);
        c0029a.m148e(this.f197b);
        c0029a.m148e(this.f198c);
        c0029a.m150g(16);
        c0029a.m149f(this.f199d);
        c0029a.m149f(0);
        c0029a.m150g(this.f200e);
    }

    /* JADX INFO: renamed from: d */
    final void m168d(C0029a c0029a) throws C0030b {
        if (c0029a.m141b() != 5 || c0029a.m141b() != 0) {
            throw new C0030b("DCERPC version not supported");
        }
        this.f197b = c0029a.m141b();
        this.f198c = c0029a.m141b();
        if (c0029a.m145d() != 16) {
            throw new C0030b("Data representation not supported");
        }
        this.f199d = c0029a.m143c();
        if (c0029a.m143c() != 0) {
            throw new C0030b("DCERPC authentication not supported");
        }
        this.f200e = c0029a.m145d();
    }

    @Override // p000a.p003c.p005b.AbstractC0032d
    /* JADX INFO: renamed from: f */
    public final void mo129f(C0029a c0029a) throws C0030b {
        m168d(c0029a);
        if (this.f197b != 12 && this.f197b != 2 && this.f197b != 3 && this.f197b != 13) {
            throw new C0030b("Unexpected ptype: " + this.f197b);
        }
        if (this.f197b == 2 || this.f197b == 3) {
            this.f201f = c0029a.m145d();
            c0029a.m143c();
            c0029a.m143c();
        }
        if (this.f197b == 3 || this.f197b == 13) {
            this.f202g = c0029a.m145d();
        } else {
            mo126b(c0029a);
        }
    }

    @Override // p000a.p003c.p005b.AbstractC0032d
    /* JADX INFO: renamed from: e */
    public final void mo128e(C0029a c0029a) {
        int i;
        int i2 = c0029a.f181c;
        c0029a.m144c(16);
        if (this.f197b == 0) {
            i = c0029a.f181c;
            c0029a.m150g(0);
            c0029a.m149f(0);
            c0029a.m149f(mo125b());
        } else {
            i = 0;
        }
        mo124a(c0029a);
        this.f199d = c0029a.f181c - i2;
        if (this.f197b == 0) {
            c0029a.f181c = i;
            this.f201f = this.f199d - i;
            c0029a.m150g(this.f201f);
        }
        c0029a.f181c = i2;
        m166c(c0029a);
        c0029a.f181c = this.f199d + i2;
    }
}
