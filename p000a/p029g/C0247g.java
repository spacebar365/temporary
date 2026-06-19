package p000a.p029g;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0003aa;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.p017a.C0130c;
import p000a.p006d.p016e.p017a.C0132e;
import p000a.p006d.p016e.p017a.C0133f;
import p000a.p006d.p016e.p018b.C0135a;
import p000a.p006d.p016e.p018b.C0136b;

/* JADX INFO: renamed from: a.g.g */
/* JADX INFO: compiled from: DirFileEntryEnumIterator2.java */
/* JADX INFO: loaded from: classes.dex */
public class C0247g extends AbstractC0248h {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1143a = C1620c.m4563a((Class<?>) C0247g.class);

    /* JADX INFO: renamed from: b */
    private byte[] f1144b;

    /* JADX INFO: renamed from: c */
    private C0136b f1145c;

    public C0247g(C0235ay c0235ay, InterfaceC0003aa interfaceC0003aa, String str) {
        super(c0235ay, interfaceC0003aa, str);
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: b */
    protected final InterfaceC0250j[] mo864b() {
        InterfaceC0250j[] interfaceC0250jArrM458e = this.f1145c.m458e();
        if (interfaceC0250jArrM458e == null) {
            return new InterfaceC0250j[0];
        }
        return interfaceC0250jArrM458e;
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: a */
    protected final InterfaceC0250j mo863a() throws C0214ad {
        C0235ay c0235ayF = m871f();
        C0132e c0132e = new C0132e(c0235ayF.mo102a(), m874i().mo82a().mo85b());
        c0132e.m419n(1);
        C0135a c0135a = new C0135a(c0235ayF.mo102a());
        c0135a.m455a(m873h());
        c0132e.mo437a((AbstractC0134b) c0135a);
        try {
            this.f1144b = ((C0133f) c0235ayF.m790a(c0132e, new EnumC0261u[0])).m421h();
            this.f1145c = c0135a.mo218f_();
            InterfaceC0250j interfaceC0250jA = m870a(false);
            if (interfaceC0250jA == null) {
                m875j();
                return interfaceC0250jA;
            }
            return interfaceC0250jA;
        } catch (C0214ad e) {
            C0133f c0133f = (C0133f) c0132e.mo218f_();
            if (c0133f != null && c0133f.mo328D() && c0133f.m425A() == 0) {
                try {
                    c0235ayF.m790a(new C0130c(c0235ayF.mo102a(), c0133f.m421h()), new EnumC0261u[0]);
                } catch (C0214ad e2) {
                    e.addSuppressed(e2);
                }
            }
            C0136b c0136bL = c0135a.mo218f_();
            if (c0136bL != null && c0136bL.mo328D() && c0136bL.m425A() == -1073741809) {
                m875j();
                return null;
            }
            throw e;
        }
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: c */
    protected final boolean mo865c() throws C0214ad {
        InterfaceC0250j[] interfaceC0250jArrM458e = this.f1145c.m458e();
        C0235ay c0235ayF = m871f();
        C0135a c0135a = new C0135a(c0235ayF.mo102a(), this.f1144b);
        c0135a.m455a(m873h());
        c0135a.m457k(interfaceC0250jArrM458e[interfaceC0250jArrM458e.length - 1].mo235c());
        c0135a.m456k();
        try {
            C0136b c0136b = (C0136b) c0235ayF.m790a(c0135a, new EnumC0261u[0]);
            if (c0136b.m425A() == -2147483642) {
                return false;
            }
            this.f1145c = c0136b;
            return true;
        } catch (C0214ad e) {
            if (e.m614b() == -2147483642) {
                f1143a.mo4535b("End of listing", e);
                return false;
            }
            throw e;
        }
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: d */
    protected final boolean mo866d() {
        return false;
    }

    @Override // p000a.p029g.AbstractC0248h
    /* JADX INFO: renamed from: e */
    protected final void mo867e() {
        try {
            C0235ay c0235ayF = m871f();
            if (this.f1144b != null && c0235ayF.m794f()) {
                c0235ayF.m790a(new C0130c(c0235ayF.mo102a(), this.f1144b), new EnumC0261u[0]);
            }
        } finally {
            this.f1144b = null;
        }
    }
}
