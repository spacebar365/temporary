package p000a.p006d.p010d;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.p010d.p011a.C0079i;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;
import p000a.p031i.p032a.InterfaceC0276c;

/* JADX INFO: renamed from: a.d.d.a */
/* JADX INFO: compiled from: AndXServerMessageBlock.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068a extends AbstractC0103c {

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f300n = C1620c.m4563a((Class<?>) AbstractC0068a.class);

    /* JADX INFO: renamed from: o */
    private byte f301o;

    /* JADX INFO: renamed from: p */
    private int f302p;

    /* JADX INFO: renamed from: q */
    private AbstractC0103c f303q;

    protected AbstractC0068a(InterfaceC0267h interfaceC0267h, byte b, String str) {
        super(interfaceC0267h, b, str);
        this.f301o = (byte) -1;
        this.f302p = 0;
        this.f303q = null;
    }

    protected AbstractC0068a(InterfaceC0267h interfaceC0267h, byte b, AbstractC0103c abstractC0103c) {
        super(interfaceC0267h, b);
        this.f301o = (byte) -1;
        this.f302p = 0;
        this.f303q = abstractC0103c;
        if (abstractC0103c != null) {
            this.f301o = (byte) abstractC0103c.mo216c();
        }
    }

    protected AbstractC0068a(InterfaceC0267h interfaceC0267h) {
        this(interfaceC0267h, null);
    }

    protected AbstractC0068a(InterfaceC0267h interfaceC0267h, AbstractC0103c abstractC0103c) {
        super(interfaceC0267h);
        this.f301o = (byte) -1;
        this.f302p = 0;
        this.f303q = abstractC0103c;
        if (abstractC0103c != null) {
            this.f301o = (byte) abstractC0103c.mo216c();
        }
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC0103c m249q() {
        return this.f303q;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: r */
    public final AbstractC0103c mo223f() {
        return this.f303q;
    }

    /* JADX INFO: renamed from: a */
    protected int mo248a(InterfaceC0267h interfaceC0267h, byte b) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public final int mo213b(byte[] bArr, int i) {
        this.f482a = i;
        int iD = m359d(bArr, i) + i;
        this.f483b = (iD + m246j(bArr, iD)) - i;
        if (this.f494m != null) {
            this.f494m.m316a(bArr, this.f482a, this.f483b, this, mo259V());
        }
        return this.f483b;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final int mo206a(byte[] bArr, int i) throws C0175g {
        this.f482a = i;
        int iE = m362e(bArr, i) + i;
        int iM247k = (iE + m247k(bArr, iE)) - i;
        this.f483b = iM247k;
        if (m340Q()) {
            byte[] bArr2 = new byte[iM247k];
            System.arraycopy(bArr, 4, bArr2, 0, iM247k);
            m355a(bArr2);
        }
        if (!m357b(bArr)) {
            throw new C0175g("Signature verification failed for " + getClass().getName());
        }
        return iM247k;
    }

    /* JADX INFO: renamed from: j */
    private int m246j(byte[] bArr, int i) {
        int iM246j;
        this.f490i = mo253f(bArr, i + 3 + 2);
        this.f490i += 4;
        int i2 = this.f490i + 1 + i;
        this.f490i /= 2;
        bArr[i] = (byte) (this.f490i & 255);
        this.f491j = mo254g(bArr, i2 + 2);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (this.f491j & 255);
        bArr[i3] = (byte) ((this.f491j >> 8) & 255);
        int i4 = this.f491j + i3 + 1;
        if (this.f303q == null || m343T().mo68m() || this.f484c >= mo248a(m343T(), (byte) this.f303q.mo216c())) {
            this.f301o = (byte) -1;
            this.f303q = null;
            bArr[i + 1] = -1;
            bArr[i + 2] = 0;
            bArr[i + 3] = -34;
            bArr[i + 3 + 1] = -34;
            return i4 - i;
        }
        this.f303q.f484c = this.f484c + 1;
        bArr[i + 1] = this.f301o;
        bArr[i + 2] = 0;
        this.f302p = i4 - this.f482a;
        C0173a.m510a(this.f302p, bArr, i + 3);
        this.f303q.m356b(m327C());
        if (this.f303q instanceof AbstractC0068a) {
            this.f303q.f488g = this.f488g;
            iM246j = ((AbstractC0068a) this.f303q).m246j(bArr, i4) + i4;
        } else {
            this.f303q.f490i = this.f303q.mo253f(bArr, i4);
            int i5 = this.f303q.f490i + 1 + i4;
            this.f303q.f490i /= 2;
            bArr[i4] = (byte) (this.f303q.f490i & 255);
            this.f303q.f491j = this.f303q.mo254g(bArr, i5 + 2);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (this.f303q.f491j & 255);
            bArr[i6] = (byte) ((this.f303q.f491j >> 8) & 255);
            iM246j = i6 + 1 + this.f303q.f491j;
        }
        return iM246j - i;
    }

    /* JADX INFO: renamed from: k */
    private int m247k(byte[] bArr, int i) {
        int i2 = i + 1;
        this.f490i = bArr[i];
        if (this.f490i != 0) {
            this.f301o = bArr[i2];
            this.f302p = C0173a.m509a(bArr, i2 + 2);
            if (this.f302p == 0) {
                this.f301o = (byte) -1;
            }
            if (this.f490i > 2) {
                mo255h(bArr, i2 + 4);
                if (mo216c() == -94 && ((C0079i) this).m264X() && ((C0079i) this).m263W() != 1) {
                    this.f490i += 8;
                }
            }
            i2 = i + 1 + (this.f490i * 2);
        }
        this.f491j = C0173a.m509a(bArr, i2);
        int iM247k = i2 + 2;
        if (this.f491j != 0) {
            int i3 = mo256i(bArr, iM247k);
            if (i3 != this.f491j && f300n.mo4536b()) {
                f300n.mo4532a("Short read, have " + i3 + ", want " + this.f491j);
            }
            iM247k += this.f491j;
        }
        if (this.f485d != 0 || this.f301o == -1) {
            this.f301o = (byte) -1;
            this.f303q = null;
        } else {
            if (this.f303q == null) {
                this.f301o = (byte) -1;
                throw new C0297u("no andx command supplied with response");
            }
            int i4 = this.f302p + this.f482a;
            this.f303q.f482a = this.f482a;
            this.f303q.mo208a((int) this.f301o);
            this.f303q.m365g(mo379z());
            this.f303q.m350a(m377x());
            this.f303q.m363e(m378y());
            this.f303q.mo221a_(m361d_());
            this.f303q.m366h(m334K());
            this.f303q.mo214b(m335L());
            this.f303q.mo209a(mo333J());
            this.f303q.m356b(m327C());
            if (this.f303q instanceof AbstractC0068a) {
                iM247k = ((AbstractC0068a) this.f303q).m247k(bArr, i4) + i4;
            } else {
                int iMo255h = i4 + 1;
                bArr[i4] = (byte) (this.f303q.f490i & 255);
                if (this.f303q.f490i != 0 && this.f303q.f490i > 2) {
                    iMo255h += this.f303q.mo255h(bArr, iMo255h);
                }
                this.f303q.f491j = C0173a.m509a(bArr, iMo255h);
                iM247k = iMo255h + 2;
                if (this.f303q.f491j != 0) {
                    this.f303q.mo256i(bArr, iM247k);
                    iM247k += this.f303q.f491j;
                }
            }
            this.f303q.mo330F();
        }
        return iM247k - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String(super.toString() + ",andxCommand=0x" + C0284e.m947a(this.f301o, 2) + ",andxOffset=" + this.f302p);
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC0067d mo244k() {
        return this.f303q;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ InterfaceC0055c mo251s() {
        return this.f303q;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ InterfaceC0276c mo251s() {
        return this.f303q;
    }
}
