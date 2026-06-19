package p000a.p029g;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0003aa;
import p000a.InterfaceC0004ab;
import p000a.InterfaceC0197f;
import p000a.InterfaceC0296t;
import p000a.p006d.p010d.p012b.C0098a;
import p000a.p006d.p010d.p012b.C0099b;

/* JADX INFO: renamed from: a.g.m */
/* JADX INFO: compiled from: NetServerEnumIterator.java */
/* JADX INFO: loaded from: classes.dex */
public class C0253m implements InterfaceC0197f<InterfaceC0250j> {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1165a = C1620c.m4563a((Class<?>) C0253m.class);

    /* JADX INFO: renamed from: b */
    private final C0098a f1166b;

    /* JADX INFO: renamed from: c */
    private final C0099b f1167c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0003aa f1168d;

    /* JADX INFO: renamed from: e */
    private final C0235ay f1169e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0296t f1170f = null;

    /* JADX INFO: renamed from: g */
    private final boolean f1171g;

    /* JADX INFO: renamed from: h */
    private int f1172h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0250j f1173i;

    public C0253m(C0215ae c0215ae, C0235ay c0235ay) throws Exception {
        this.f1168d = c0215ae;
        InterfaceC0004ab interfaceC0004abMo82a = c0215ae.mo82a();
        this.f1171g = interfaceC0004abMo82a.mo92i() == 2;
        if (interfaceC0004abMo82a.mo89f().getHost().isEmpty()) {
            this.f1166b = new C0098a(c0235ay.mo102a(), c0235ay.m799k(), Integer.MIN_VALUE);
            this.f1167c = new C0099b(c0235ay.mo102a());
        } else if (this.f1171g) {
            this.f1166b = new C0098a(c0235ay.mo102a(), interfaceC0004abMo82a.mo89f().getHost(), -1);
            this.f1167c = new C0099b(c0235ay.mo102a());
        } else {
            throw new C0214ad("The requested list operations is invalid: " + interfaceC0004abMo82a.mo89f());
        }
        this.f1169e = c0235ay.m796h();
        try {
            this.f1169e.m789a(this.f1166b, this.f1167c, new EnumC0261u[0]);
            m878a();
            InterfaceC0250j interfaceC0250jM879b = m879b();
            if (interfaceC0250jM879b == null) {
                m882e();
            }
            this.f1173i = interfaceC0250jM879b;
        } catch (Exception e) {
            this.f1169e.m797i();
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m878a() throws C0214ad {
        int iZ = this.f1167c.m392Z();
        if (iZ == 2184) {
            throw new C0240bc();
        }
        if (iZ != 0 && iZ != 234) {
            throw new C0214ad(iZ, true);
        }
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0250j m879b() throws C0214ad {
        while (true) {
            int iAa = this.f1167c.m392Z() == 234 ? this.f1167c.m394aa() - 1 : this.f1167c.m394aa();
            while (this.f1172h < iAa) {
                InterfaceC0250j interfaceC0250j = this.f1167c.m395ab()[this.f1172h];
                this.f1172h++;
                if (m880c()) {
                    return interfaceC0250j;
                }
            }
            if (!this.f1171g || this.f1167c.m392Z() != 234) {
                break;
            }
            this.f1166b.mo318a(0, this.f1167c.m324q());
            this.f1167c.mo217e_();
            this.f1166b.m382Y();
            this.f1169e.m789a(this.f1166b, this.f1167c, new EnumC0261u[0]);
            m878a();
            this.f1172h = 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m880c() {
        if (this.f1170f == null) {
            return true;
        }
        try {
            return this.f1170f.m965a();
        } catch (C0044d e) {
            f1165a.mo4544e("Failed to apply name filter", e);
            return false;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1173i != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC0250j next() {
        InterfaceC0250j interfaceC0250j = this.f1173i;
        try {
            InterfaceC0250j interfaceC0250jM879b = m879b();
            if (interfaceC0250jM879b == null) {
                m882e();
            } else {
                this.f1173i = interfaceC0250jM879b;
            }
        } catch (C0044d e) {
            f1165a.mo4541d("Enumeration failed", e);
            this.f1173i = null;
        }
        return interfaceC0250j;
    }

    @Override // p000a.InterfaceC0197f, java.lang.AutoCloseable
    public void close() {
        if (this.f1173i != null) {
            m882e();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m882e() {
        this.f1169e.m797i();
        this.f1173i = null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
