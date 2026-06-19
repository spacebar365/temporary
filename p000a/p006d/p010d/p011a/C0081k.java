package p000a.p006d.p010d.p011a;

import java.util.Date;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.EnumC0289m;
import p000a.InterfaceC0016c;
import p000a.p006d.InterfaceC0051b;
import p000a.p006d.InterfaceC0179k;
import p000a.p006d.InterfaceC0180l;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;
import p000a.p031i.C0285f;
import p000a.p031i.p032a.InterfaceC0278e;

/* JADX INFO: renamed from: a.d.d.a.k */
/* JADX INFO: compiled from: SmbComNegotiateResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C0081k extends AbstractC0103c implements InterfaceC0180l {

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f365n = C1620c.m4563a((Class<?>) C0081k.class);

    /* JADX INFO: renamed from: o */
    private int f366o;

    /* JADX INFO: renamed from: p */
    private C0072b f367p;

    /* JADX INFO: renamed from: q */
    private int f368q;

    /* JADX INFO: renamed from: r */
    private int f369r;

    /* JADX INFO: renamed from: s */
    private int f370s;

    /* JADX INFO: renamed from: t */
    private int f371t;

    /* JADX INFO: renamed from: u */
    private int f372u;

    /* JADX INFO: renamed from: v */
    private int f373v;

    /* JADX INFO: renamed from: w */
    private int f374w;

    /* JADX INFO: renamed from: x */
    private boolean f375x;

    public C0081k(InterfaceC0016c interfaceC0016c) {
        super(interfaceC0016c.mo114a());
        this.f374w = 0;
        this.f367p = new C0072b();
        this.f373v = interfaceC0016c.mo114a().mo17L();
        this.f368q = interfaceC0016c.mo114a().mo18M();
        this.f369r = interfaceC0016c.mo114a().mo23R();
        this.f370s = interfaceC0016c.mo114a().mo72q();
        this.f371t = interfaceC0016c.mo114a().mo71p();
        this.f372u = interfaceC0016c.mo114a().mo41af();
        this.f375x = interfaceC0016c.mo114a().mo66k();
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: e */
    public final EnumC0289m mo279e() {
        return EnumC0289m.SMB1;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: h_ */
    public final int mo282h_() {
        return this.f372u;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final boolean mo275a(InterfaceC0016c interfaceC0016c) {
        return m343T().equals(interfaceC0016c.mo114a());
    }

    /* JADX INFO: renamed from: q */
    public final int m288q() {
        return this.f373v;
    }

    /* JADX INFO: renamed from: W */
    public final int m269W() {
        return this.f370s;
    }

    /* JADX INFO: renamed from: X */
    public final int m270X() {
        return this.f369r;
    }

    /* JADX INFO: renamed from: Y */
    public final int m271Y() {
        return this.f374w;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: i_ */
    public final int mo283i_() {
        return this.f371t;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: j */
    public final int mo284j() {
        return this.f370s;
    }

    /* JADX INFO: renamed from: Z */
    public final int m272Z() {
        return this.f368q;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: c */
    public final boolean mo278c(int i) {
        return (this.f373v & i) == i;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: h */
    public final boolean mo281h() {
        return !m343T().mo59d() && mo278c(4096);
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: j_ */
    public final boolean mo285j_() {
        return (this.f368q & 4) == 4;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final void mo273a(InterfaceC0051b interfaceC0051b) {
        if (interfaceC0051b instanceof AbstractC0103c) {
            AbstractC0103c abstractC0103c = (AbstractC0103c) interfaceC0051b;
            abstractC0103c.m364f(this.f368q);
            abstractC0103c.m356b(abstractC0103c.mo376w() || this.f375x);
            if (abstractC0103c.m327C()) {
                abstractC0103c.m364f(32768);
            }
            if (abstractC0103c instanceof AbstractC0104a) {
                ((AbstractC0104a) abstractC0103c).m386j(this.f370s);
            }
        }
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final void mo274a(InterfaceC0278e interfaceC0278e) {
        if (interfaceC0278e instanceof AbstractC0103c) {
            ((AbstractC0103c) interfaceC0278e).m356b(this.f375x);
        }
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: k_ */
    public final boolean mo286k_() {
        return this.f367p.f318i || this.f367p.f319j;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: g */
    public final boolean mo280g() {
        return this.f367p.f319j;
    }

    /* JADX INFO: renamed from: aa */
    public final C0072b m277aa() {
        return this.f367p;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        this.f366o = C0173a.m509a(bArr, i);
        int i2 = i + 2;
        if (this.f366o > 10) {
            return i2 - i;
        }
        int i3 = i2 + 1;
        this.f367p.f315f = bArr[i2] & 255;
        this.f367p.f316g = this.f367p.f315f & 1;
        this.f367p.f317h = (this.f367p.f315f & 2) == 2;
        this.f367p.f318i = (this.f367p.f315f & 4) == 4;
        this.f367p.f319j = (this.f367p.f315f & 8) == 8;
        this.f367p.f310a = C0173a.m509a(bArr, i3);
        int i4 = i3 + 2;
        this.f367p.f320k = C0173a.m509a(bArr, i4);
        int i5 = i4 + 2;
        this.f367p.f311b = C0173a.m511b(bArr, i5);
        int i6 = i5 + 4;
        this.f367p.f321l = C0173a.m511b(bArr, i6);
        int i7 = i6 + 4;
        this.f367p.f312c = C0173a.m511b(bArr, i7);
        int i8 = i7 + 4;
        this.f367p.f313d = C0173a.m511b(bArr, i8);
        int i9 = i8 + 4;
        this.f367p.f322m = C0173a.m515d(bArr, i9);
        int i10 = i9 + 8;
        int iM509a = C0173a.m509a(bArr, i10);
        if (iM509a > 32767) {
            iM509a = (65536 - iM509a) * (-1);
        }
        this.f367p.f323n = iM509a;
        int i11 = i10 + 2;
        int i12 = i11 + 1;
        this.f367p.f324o = bArr[i11] & 255;
        return i12 - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        int length;
        int iM957c;
        if ((this.f367p.f313d & Integer.MIN_VALUE) == 0) {
            this.f367p.f325p = new byte[this.f367p.f324o];
            System.arraycopy(bArr, i, this.f367p.f325p, 0, this.f367p.f324o);
            int i2 = i + this.f367p.f324o;
            if (this.f491j > this.f367p.f324o) {
                if ((this.f368q & 32768) == 32768) {
                    iM957c = C0285f.m955b(bArr, i2, 256);
                    this.f367p.f314e = C0285f.m950a(bArr, i2, iM957c);
                } else {
                    iM957c = C0285f.m957c(bArr, i2, 256);
                    this.f367p.f314e = C0285f.m951a(bArr, i2, iM957c, m343T());
                }
                length = iM957c + i2;
            } else {
                this.f367p.f314e = new String();
                length = i2;
            }
        } else {
            this.f367p.f326q = new byte[16];
            System.arraycopy(bArr, i, this.f367p.f326q, 0, 16);
            length = this.f367p.f326q.length + i;
            this.f367p.f314e = new String();
            if (this.f491j > 16) {
                this.f367p.f324o = this.f491j - 16;
                this.f367p.f325p = new byte[this.f367p.f324o];
                System.arraycopy(bArr, length, this.f367p.f325p, 0, this.f367p.f324o);
                if (f365n.mo4539c()) {
                    f365n.mo4534b(String.format("Have initial token %s", C0284e.m949a(this.f367p.f325p, 0, this.f367p.f324o)));
                }
            }
        }
        return length - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String("SmbComNegotiateResponse[" + super.toString() + ",wordCount=" + this.f490i + ",dialectIndex=" + this.f366o + ",securityMode=0x" + C0284e.m947a(this.f367p.f315f, 1) + ",security=" + (this.f367p.f316g == 0 ? "share" : "user") + ",encryptedPasswords=" + this.f367p.f317h + ",maxMpxCount=" + this.f367p.f310a + ",maxNumberVcs=" + this.f367p.f320k + ",maxBufferSize=" + this.f367p.f311b + ",maxRawSize=" + this.f367p.f321l + ",sessionKey=0x" + C0284e.m947a(this.f367p.f312c, 8) + ",capabilities=0x" + C0284e.m947a(this.f367p.f313d, 8) + ",serverTime=" + new Date(this.f367p.f322m) + ",serverTimeZone=" + this.f367p.f323n + ",encryptionKeyLength=" + this.f367p.f324o + ",byteCount=" + this.f491j + ",oemDomainName=" + this.f367p.f314e + "]");
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: m */
    public final int mo287m() {
        return this.f369r;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final boolean mo276a(InterfaceC0016c interfaceC0016c, InterfaceC0179k interfaceC0179k) {
        if (this.f366o > 10) {
            return false;
        }
        if ((this.f367p.f313d & Integer.MIN_VALUE) != Integer.MIN_VALUE && this.f367p.f324o != 8 && interfaceC0016c.mo114a().mo7B() == 0) {
            f365n.mo4540d("Unexpected encryption key length: " + this.f367p.f324o);
            return false;
        }
        if (interfaceC0179k.mo268g_() && !this.f367p.f318i) {
            f365n.mo4543e("Signatures are required but the server does not support them");
            return false;
        }
        if (interfaceC0179k.mo268g_() || this.f367p.f319j || (this.f367p.f318i && interfaceC0016c.mo114a().mo24S())) {
            this.f368q |= 4;
            if (interfaceC0179k.mo268g_() || this.f367p.f319j) {
                this.f368q |= 16;
            }
        } else {
            this.f368q &= 65531;
            this.f368q &= 65519;
        }
        if (f365n.mo4539c()) {
            f365n.mo4534b("Signing " + ((this.f368q & 4) != 0 ? "enabled " : "not-enabled ") + ((this.f368q & 16) != 0 ? "required" : "not-required"));
        }
        this.f369r = Math.min(this.f369r, this.f367p.f310a);
        if (this.f369r <= 0) {
            this.f369r = 1;
        }
        this.f370s = Math.min(this.f370s, this.f367p.f311b);
        this.f371t = Math.min(this.f371t, this.f367p.f311b);
        this.f372u = Math.min(this.f372u, this.f367p.f311b);
        this.f373v &= this.f367p.f313d;
        if ((this.f367p.f313d & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f373v |= Integer.MIN_VALUE;
        }
        if (interfaceC0016c.mo114a().mo66k() || interfaceC0016c.mo114a().mo67l()) {
            this.f373v |= 4;
        }
        if ((this.f373v & 4) == 0) {
            if (interfaceC0016c.mo114a().mo67l()) {
                this.f373v |= 4;
                this.f375x = true;
            } else {
                this.f375x = false;
                this.f368q &= 32767;
            }
        } else {
            this.f375x = interfaceC0016c.mo114a().mo66k();
        }
        if (this.f375x) {
            f365n.mo4534b("Unicode is enabled");
        } else {
            f365n.mo4534b("Unicode is disabled");
        }
        return true;
    }
}
