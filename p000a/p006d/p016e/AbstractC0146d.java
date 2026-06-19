package p000a.p006d.p016e;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;

/* JADX INFO: renamed from: a.d.e.d */
/* JADX INFO: compiled from: ServerMessageBlock2Response.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0146d extends AbstractC0134b implements InterfaceC0067d {

    /* JADX INFO: renamed from: a */
    private boolean f721a;

    /* JADX INFO: renamed from: b */
    private boolean f722b;

    /* JADX INFO: renamed from: c */
    private Long f723c;

    /* JADX INFO: renamed from: d */
    private boolean f724d;

    /* JADX INFO: renamed from: e */
    private Exception f725e;

    /* JADX INFO: renamed from: f */
    private boolean f726f;

    public AbstractC0146d(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    @Override // p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: k */
    public final InterfaceC0067d mo244k() {
        return (InterfaceC0067d) mo430K();
    }

    @Override // p000a.p006d.p016e.AbstractC0134b, p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: e_ */
    public final void mo217e_() {
        super.mo217e_();
        this.f721a = false;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: F */
    public final void mo330F() {
        if (m447m_() && m425A() == 259) {
            synchronized (this) {
                notifyAll();
            }
        } else {
            this.f721a = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: a */
    public final void mo351a(Exception exc) {
        this.f722b = true;
        this.f725e = exc;
        this.f721a = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: G */
    public final void mo331G() {
        this.f722b = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: E */
    public final void mo329E() {
        this.f721a = false;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: D */
    public final boolean mo328D() {
        return this.f721a;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: P */
    public final boolean mo339P() {
        return this.f722b;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m471n() {
        return (m427C() & 8) != 0;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: S */
    public final Long mo342S() {
        return this.f723c;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: a */
    public final void mo352a(Long l) {
        this.f723c = l;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m472o() {
        return this.f726f;
    }

    /* JADX INFO: renamed from: p */
    public final void m473p() {
        this.f726f = true;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: O */
    public final Exception mo338O() {
        return this.f725e;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: z */
    public final int mo379z() {
        return m425A();
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: N */
    public final boolean mo337N() {
        return this.f724d;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: t */
    public final int mo373t() {
        return m451v();
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: a */
    protected final void mo436a(byte[] bArr, int i, int i2) throws C0175g {
        if (m452w()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            m439b(bArr2);
        }
        if (!m470b(bArr, i, i2)) {
            throw new C0175g("Signature verification failed for " + getClass().getName());
        }
        this.f726f = false;
        mo330F();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m470b(byte[] bArr, int i, int i2) {
        C0156f c0156fY = m454y();
        if (c0156fY == null || m447m_()) {
            return true;
        }
        if (!m448q().mo64i() && m425A() != 0) {
            return true;
        }
        boolean zM487b = c0156fY.m487b(bArr, i, i2);
        this.f724d = zM487b;
        return !zM487b;
    }

    /* JADX INFO: renamed from: b */
    public void mo243b(InterfaceC0055c interfaceC0055c) {
        InterfaceC0067d interfaceC0067d = (InterfaceC0067d) mo430K();
        if (interfaceC0067d != null) {
            interfaceC0067d.mo243b(interfaceC0055c);
        }
    }
}
