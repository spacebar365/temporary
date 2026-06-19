package p000a.p003c;

import p000a.p003c.p005b.C0029a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.c.a */
/* JADX INFO: compiled from: DcerpcBind.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0017a extends AbstractC0038g {

    /* JADX INFO: renamed from: h */
    private static final String[] f98h = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};

    /* JADX INFO: renamed from: i */
    private C0028b f99i;

    /* JADX INFO: renamed from: j */
    private int f100j;

    /* JADX INFO: renamed from: k */
    private int f101k;

    @Override // p000a.p003c.AbstractC0038g
    /* JADX INFO: renamed from: a */
    public final C0036e mo123a() {
        if (this.f202g != 0) {
            int i = this.f202g;
            return new C0036e(i < 4 ? f98h[i] : "0x" + C0284e.m947a(i, 4));
        }
        return null;
    }

    public C0017a() {
    }

    C0017a(C0028b c0028b, AbstractC0037f abstractC0037f) {
        this.f99i = c0028b;
        this.f100j = abstractC0037f.m165c();
        this.f101k = abstractC0037f.m164b();
        this.f197b = 11;
        this.f198c = 3;
    }

    @Override // p000a.p003c.AbstractC0038g
    /* JADX INFO: renamed from: b */
    public final int mo125b() {
        return 0;
    }

    @Override // p000a.p003c.AbstractC0038g
    /* JADX INFO: renamed from: a */
    public final void mo124a(C0029a c0029a) {
        c0029a.m149f(this.f100j);
        c0029a.m149f(this.f101k);
        c0029a.m150g(0);
        c0029a.m148e(1);
        c0029a.m148e(0);
        c0029a.m149f(0);
        c0029a.m149f(0);
        c0029a.m148e(1);
        c0029a.m148e(0);
        this.f99i.m134c().mo128e(c0029a);
        c0029a.m149f(this.f99i.m135d());
        c0029a.m149f(this.f99i.m136e());
        f186a.mo128e(c0029a);
        c0029a.m150g(2);
    }

    @Override // p000a.p003c.AbstractC0038g
    /* JADX INFO: renamed from: b */
    public final void mo126b(C0029a c0029a) {
        c0029a.m143c();
        c0029a.m143c();
        c0029a.m145d();
        c0029a.m144c(c0029a.m143c());
        c0029a.m146d(4);
        c0029a.m141b();
        c0029a.m146d(4);
        this.f202g = c0029a.m143c();
        c0029a.m143c();
        c0029a.m144c(20);
    }
}
