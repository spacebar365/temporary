package p000a.p029g;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0003aa;
import p000a.InterfaceC0004ab;
import p000a.p006d.p010d.p011a.C0073c;
import p000a.p006d.p010d.p011a.C0075e;
import p000a.p006d.p010d.p015d.C0117a;
import p000a.p006d.p010d.p015d.C0118b;
import p000a.p006d.p010d.p015d.C0119c;

/* JADX INFO: renamed from: a.g.f */
/* JADX INFO: compiled from: DirFileEntryEnumIterator1.java */
/* JADX INFO: loaded from: classes.dex */
class C0246f extends AbstractC0248h {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1140a = C1620c.m4563a((Class<?>) C0246f.class);

    /* JADX INFO: renamed from: b */
    private C0119c f1141b;

    /* JADX INFO: renamed from: c */
    private C0118b f1142c;

    public C0246f(C0235ay c0235ay, InterfaceC0003aa interfaceC0003aa, String str) {
        super(c0235ay, interfaceC0003aa, str);
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: a */
    protected final InterfaceC0250j mo863a() throws C0214ad {
        InterfaceC0004ab interfaceC0004abMo82a = m874i().mo82a();
        String strMo85b = interfaceC0004abMo82a.mo85b();
        if (interfaceC0004abMo82a.mo89f().getPath().lastIndexOf(47) != r1.length() - 1) {
            throw new C0214ad(interfaceC0004abMo82a.mo89f() + " directory must end with '/'");
        }
        if (strMo85b.lastIndexOf(92) != strMo85b.length() - 1) {
            throw new C0214ad(strMo85b + " UNC must end with '\\'");
        }
        C0235ay c0235ayF = m871f();
        this.f1142c = new C0118b(c0235ayF.mo102a());
        try {
            c0235ayF.m789a(new C0117a(c0235ayF.mo102a(), strMo85b, m873h(), m872g(), c0235ayF.mo102a().mo43ah(), c0235ayF.mo102a().mo44ai()), this.f1142c, new EnumC0261u[0]);
            this.f1141b = new C0119c(c0235ayF.mo102a(), this.f1142c.m404q(), this.f1142c.m403ae(), this.f1142c.m402ad(), c0235ayF.mo102a().mo43ah(), c0235ayF.mo102a().mo44ai());
            this.f1142c.m396b((byte) 2);
            InterfaceC0250j interfaceC0250jA = m870a(false);
            if (interfaceC0250jA == null) {
                m875j();
                return interfaceC0250jA;
            }
            return interfaceC0250jA;
        } catch (C0214ad e) {
            if (this.f1142c != null && this.f1142c.mo328D() && e.m614b() == -1073741809) {
                m875j();
                return null;
            }
            throw e;
        }
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: b */
    protected final InterfaceC0250j[] mo864b() {
        return this.f1142c.m395ab();
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: c */
    protected final boolean mo865c() throws C0214ad {
        this.f1141b.mo318a(this.f1142c.m403ae(), this.f1142c.m402ad());
        this.f1142c.mo217e_();
        try {
            m871f().m789a(this.f1141b, this.f1142c, new EnumC0261u[0]);
            return this.f1142c.m392Z() != -2147483642;
        } catch (C0214ad e) {
            if (e.m614b() == -2147483642) {
                f1140a.mo4535b("No more entries", e);
                return false;
            }
            throw e;
        }
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: d */
    protected final boolean mo866d() {
        return this.f1142c.m401ac();
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: e */
    protected final void mo867e() {
        try {
            C0235ay c0235ayF = m871f();
            if (this.f1142c != null) {
                c0235ayF.m789a(new C0075e(c0235ayF.mo102a(), this.f1142c.m404q()), new C0073c(c0235ayF.mo102a()), new EnumC0261u[0]);
            }
        } catch (C0214ad e) {
            f1140a.mo4535b("SmbComFindClose2 failed", e);
        }
    }
}
