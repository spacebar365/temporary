package p000a.p002b;

import java.net.URLStreamHandler;
import p000a.InterfaceC0007ae;
import p000a.InterfaceC0010b;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0272i;
import p000a.InterfaceC0288l;
import p000a.InterfaceC0291o;
import p000a.InterfaceC0299w;
import p000a.p029g.C0252l;

/* JADX INFO: renamed from: a.b.d */
/* JADX INFO: compiled from: CIFSContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class C0014d implements InterfaceC0016c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0016c f94a;

    /* JADX INFO: renamed from: b */
    private C0252l f95b;

    public C0014d(InterfaceC0016c interfaceC0016c) {
        this.f94a = interfaceC0016c;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public final InterfaceC0267h mo114a() {
        return this.f94a.mo114a();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: e */
    public final InterfaceC0288l mo118e() {
        return this.f94a.mo118e();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: g */
    public InterfaceC0272i mo109g() {
        return this.f94a.mo109g();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: h */
    public final URLStreamHandler mo120h() {
        if (this.f95b == null) {
            this.f95b = new C0252l(this);
        }
        return this.f95b;
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: f */
    public final InterfaceC0299w mo119f() {
        return this.f94a.mo119f();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public final InterfaceC0016c mo107a(InterfaceC0272i interfaceC0272i) {
        return this.f94a.mo107a(interfaceC0272i);
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: i */
    public final InterfaceC0016c mo110i() {
        return this.f94a.mo110i();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: j */
    public final InterfaceC0016c mo111j() {
        return this.f94a.mo111j();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public boolean mo108a(String str, Throwable th) {
        return this.f94a.mo108a(str, th);
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: b */
    public final InterfaceC0291o mo115b() {
        return this.f94a.mo115b();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: c */
    public final InterfaceC0010b mo116c() {
        return this.f94a.mo116c();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: d */
    public final InterfaceC0007ae mo117d() {
        return this.f94a.mo117d();
    }
}
