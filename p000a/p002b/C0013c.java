package p000a.p002b;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0272i;
import p000a.p029g.AbstractC0256p;
import p000a.p029g.C0212ab;
import p000a.p029g.InterfaceC0224an;
import p000a.p029g.InterfaceC0237b;

/* JADX INFO: renamed from: a.b.c */
/* JADX INFO: compiled from: CIFSContextCredentialWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0013c extends C0014d implements InterfaceC0016c {

    /* JADX INFO: renamed from: a */
    private InterfaceC0272i f93a;

    public C0013c(AbstractC0011a abstractC0011a, InterfaceC0272i interfaceC0272i) {
        super(abstractC0011a);
        this.f93a = interfaceC0272i;
    }

    @Override // p000a.p002b.C0014d, p000a.InterfaceC0016c
    /* JADX INFO: renamed from: g */
    public final InterfaceC0272i mo109g() {
        return this.f93a;
    }

    @Override // p000a.p002b.C0014d, p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public final boolean mo108a(String str, Throwable th) {
        InterfaceC0237b interfaceC0237bM670d;
        InterfaceC0272i interfaceC0272i = this.f93a;
        if ((interfaceC0272i instanceof InterfaceC0224an) && (interfaceC0237bM670d = ((InterfaceC0224an) interfaceC0272i).m670d()) != null) {
            this.f93a = interfaceC0237bM670d;
            return true;
        }
        AbstractC0256p abstractC0256pM883a = AbstractC0256p.m883a();
        if (abstractC0256pM883a != null) {
            AbstractC0256p.m884a(abstractC0256pM883a, str, th instanceof C0212ab ? (C0212ab) th : null);
        }
        return false;
    }
}
