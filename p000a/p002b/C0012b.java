package p000a.p002b;

import java.net.URLStreamHandler;
import p000a.InterfaceC0007ae;
import p000a.InterfaceC0010b;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0272i;
import p000a.InterfaceC0288l;
import p000a.InterfaceC0291o;
import p000a.InterfaceC0299w;
import p000a.p026e.RunnableC0187e;
import p000a.p029g.C0210a;
import p000a.p029g.C0231au;
import p000a.p029g.C0243c;
import p000a.p029g.C0252l;
import p000a.p029g.C0259s;
import p000a.p029g.C0263w;
import p000a.p029g.InterfaceC0237b;

/* JADX INFO: renamed from: a.b.b */
/* JADX INFO: compiled from: BaseContext.java */
/* JADX INFO: loaded from: classes.dex */
public class C0012b extends AbstractC0011a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0267h f85a;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0010b f90f;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0288l f86b = new C0243c();

    /* JADX INFO: renamed from: c */
    private final InterfaceC0299w f87c = new C0263w();

    /* JADX INFO: renamed from: d */
    private final C0252l f88d = new C0252l(this);

    /* JADX INFO: renamed from: e */
    private final InterfaceC0291o f89e = new RunnableC0187e(this);

    /* JADX INFO: renamed from: g */
    private final InterfaceC0007ae f91g = new C0231au();

    /* JADX INFO: renamed from: h */
    private final InterfaceC0237b f92h = new C0259s();

    public C0012b(InterfaceC0267h interfaceC0267h) {
        this.f85a = interfaceC0267h;
        this.f90f = new C0210a(this.f85a);
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: d */
    public final InterfaceC0007ae mo117d() {
        return this.f91g;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public final InterfaceC0267h mo114a() {
        return this.f85a;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: e */
    public final InterfaceC0288l mo118e() {
        return this.f86b;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: b */
    public final InterfaceC0291o mo115b() {
        return this.f89e;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: c */
    public final InterfaceC0010b mo116c() {
        return this.f90f;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: h */
    public final URLStreamHandler mo120h() {
        return this.f88d;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: f */
    public final InterfaceC0299w mo119f() {
        return this.f87c;
    }

    @Override // p000a.p002b.AbstractC0011a
    /* JADX INFO: renamed from: k */
    protected final InterfaceC0272i mo112k() {
        return this.f92h;
    }

    @Override // p000a.p002b.AbstractC0011a
    /* JADX INFO: renamed from: l */
    public final boolean mo113l() {
        return super.mo113l() | this.f91g.mo100a();
    }
}
