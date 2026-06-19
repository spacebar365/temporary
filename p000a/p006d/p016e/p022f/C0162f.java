package p000a.p006d.p016e.p022f;

import java.util.Date;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.EnumC0289m;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0051b;
import p000a.p006d.InterfaceC0179k;
import p000a.p006d.InterfaceC0180l;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;
import p000a.p031i.p032a.InterfaceC0278e;

/* JADX INFO: renamed from: a.d.e.f.f */
/* JADX INFO: compiled from: Smb2NegotiateResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C0162f extends AbstractC0146d implements InterfaceC0180l {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f774a = C1620c.m4563a((Class<?>) C0162f.class);

    /* JADX INFO: renamed from: b */
    private int f775b;

    /* JADX INFO: renamed from: c */
    private int f776c;

    /* JADX INFO: renamed from: d */
    private byte[] f777d;

    /* JADX INFO: renamed from: e */
    private int f778e;

    /* JADX INFO: renamed from: f */
    private int f779f;

    /* JADX INFO: renamed from: g */
    private int f780g;

    /* JADX INFO: renamed from: h */
    private int f781h;

    /* JADX INFO: renamed from: i */
    private int f782i;

    /* JADX INFO: renamed from: j */
    private long f783j;

    /* JADX INFO: renamed from: k */
    private long f784k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0159c[] f785l;

    /* JADX INFO: renamed from: m */
    private byte[] f786m;

    /* JADX INFO: renamed from: n */
    private EnumC0289m f787n;

    /* JADX INFO: renamed from: o */
    private boolean f788o;

    /* JADX INFO: renamed from: p */
    private int f789p;

    /* JADX INFO: renamed from: q */
    private int f790q;

    public C0162f(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
        this.f777d = new byte[16];
        this.f789p = -1;
        this.f790q = -1;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: m */
    public final int mo287m() {
        return m451v();
    }

    /* JADX INFO: renamed from: s */
    public final int m502s() {
        return this.f776c;
    }

    /* JADX INFO: renamed from: I */
    public final byte[] m496I() {
        return this.f777d;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: e */
    public final EnumC0289m mo279e() {
        return this.f787n;
    }

    /* JADX INFO: renamed from: U */
    public final int m497U() {
        return this.f790q;
    }

    /* JADX INFO: renamed from: V */
    public final int m498V() {
        return this.f778e;
    }

    /* JADX INFO: renamed from: W */
    public final int m499W() {
        return this.f779f;
    }

    /* JADX INFO: renamed from: X */
    public final byte[] m500X() {
        return this.f786m;
    }

    /* JADX INFO: renamed from: Y */
    public final int m501Y() {
        return this.f775b;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: c */
    public final boolean mo278c(int i) {
        return (this.f779f & i) == i;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: h */
    public final boolean mo281h() {
        return !m448q().mo59d() && mo278c(1);
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final boolean mo275a(InterfaceC0016c interfaceC0016c) {
        return m448q().equals(interfaceC0016c.mo114a());
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final boolean mo276a(InterfaceC0016c interfaceC0016c, InterfaceC0179k interfaceC0179k) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!mo328D() || m425A() != 0) {
            return false;
        }
        if (interfaceC0179k.mo268g_() && !mo286k_()) {
            f774a.mo4543e("Signing is enforced but server does not allow it");
            return false;
        }
        if (this.f776c == 767) {
            f774a.mo4543e("Server returned ANY dialect");
            return false;
        }
        C0161e c0161e = (C0161e) interfaceC0179k;
        EnumC0289m enumC0289m = null;
        EnumC0289m[] enumC0289mArrValues = EnumC0289m.values();
        int length = enumC0289mArrValues.length;
        int i = 0;
        while (i < length) {
            EnumC0289m enumC0289m2 = enumC0289mArrValues[i];
            if (!enumC0289m2.m960a() || enumC0289m2.m962b() != this.f776c) {
                enumC0289m2 = enumC0289m;
            }
            i++;
            enumC0289m = enumC0289m2;
        }
        if (enumC0289m == null) {
            f774a.mo4543e("Server returned an unknown dialect");
            return false;
        }
        if (!enumC0289m.m961a(m448q().mo61f()) || !enumC0289m.m963b(m448q().mo62g())) {
            f774a.mo4543e(String.format("Server selected an disallowed dialect version %s (min: %s max: %s)", enumC0289m, m448q().mo61f(), m448q().mo62g()));
            return false;
        }
        this.f787n = enumC0289m;
        this.f779f = c0161e.m492l() & this.f778e;
        if ((this.f779f & 64) != 0) {
            this.f788o = interfaceC0016c.mo114a().mo27V();
        }
        if (this.f787n.m961a(EnumC0289m.SMB311)) {
            int i2 = this.f779f;
            if (this.f785l == null || this.f785l.length == 0) {
                f774a.mo4543e("Response lacks negotiate contexts");
                z = false;
            } else {
                boolean z4 = false;
                boolean z5 = false;
                InterfaceC0159c[] interfaceC0159cArr = this.f785l;
                int length2 = interfaceC0159cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        InterfaceC0159c interfaceC0159c = interfaceC0159cArr[i3];
                        if (interfaceC0159c != null) {
                            if (!z5 && interfaceC0159c.mo489c() == 2) {
                                z5 = true;
                                C0157a c0157a = (C0157a) interfaceC0159c;
                                if (c0157a.m488b() == null || c0157a.m488b().length != 1) {
                                    f774a.mo4543e("Server returned no cipher selection");
                                    z3 = false;
                                } else {
                                    C0157a c0157a2 = null;
                                    InterfaceC0158b[] interfaceC0158bArrM495o = c0161e.m495o();
                                    int length3 = interfaceC0158bArrM495o.length;
                                    int i4 = 0;
                                    while (i4 < length3) {
                                        InterfaceC0158b interfaceC0158b = interfaceC0158bArrM495o[i4];
                                        i4++;
                                        c0157a2 = interfaceC0158b instanceof C0157a ? (C0157a) interfaceC0158b : c0157a2;
                                    }
                                    if (c0157a2 == null) {
                                        z3 = false;
                                    } else {
                                        boolean z6 = false;
                                        int[] iArrM488b = c0157a2.m488b();
                                        for (int i5 : iArrM488b) {
                                            if (i5 == c0157a.m488b()[0]) {
                                                z6 = true;
                                            }
                                        }
                                        if (!z6) {
                                            f774a.mo4543e("Server returned invalid cipher selection");
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                    }
                                }
                                if (!z3) {
                                    z = false;
                                    break;
                                }
                                this.f789p = c0157a.m488b()[0];
                                this.f788o = true;
                            } else {
                                if (interfaceC0159c.mo489c() == 2) {
                                    f774a.mo4543e("Multiple encryption negotiate contexts");
                                    z = false;
                                    break;
                                }
                                if (!z4 && interfaceC0159c.mo489c() == 1) {
                                    z4 = true;
                                    C0160d c0160d = (C0160d) interfaceC0159c;
                                    if (c0160d.m490b() == null || c0160d.m490b().length != 1) {
                                        f774a.mo4543e("Server returned no hash selection");
                                        z2 = false;
                                    } else {
                                        C0160d c0160d2 = null;
                                        InterfaceC0158b[] interfaceC0158bArrM495o2 = c0161e.m495o();
                                        int length4 = interfaceC0158bArrM495o2.length;
                                        int i6 = 0;
                                        while (i6 < length4) {
                                            InterfaceC0158b interfaceC0158b2 = interfaceC0158bArrM495o2[i6];
                                            i6++;
                                            c0160d2 = interfaceC0158b2 instanceof C0160d ? (C0160d) interfaceC0158b2 : c0160d2;
                                        }
                                        if (c0160d2 == null) {
                                            z2 = false;
                                        } else {
                                            boolean z7 = false;
                                            int[] iArrM490b = c0160d2.m490b();
                                            for (int i7 : iArrM490b) {
                                                if (i7 == c0160d.m490b()[0]) {
                                                    z7 = true;
                                                }
                                            }
                                            if (!z7) {
                                                f774a.mo4543e("Server returned invalid hash selection");
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        z = false;
                                        break;
                                    }
                                    this.f790q = c0160d.m490b()[0];
                                } else if (interfaceC0159c.mo489c() == 1) {
                                    f774a.mo4543e("Multiple preauth negotiate contexts");
                                    z = false;
                                    break;
                                }
                            }
                        }
                        i3++;
                        z5 = z5;
                        z4 = z4;
                    } else if (!z4) {
                        f774a.mo4543e("Missing preauth negotiate context");
                        z = false;
                    } else if (!z5 && (i2 & 64) != 0) {
                        f774a.mo4543e("Missing encryption negotiate context");
                        z = false;
                    } else {
                        if (!z5) {
                            f774a.mo4534b("No encryption support");
                        }
                        z = true;
                    }
                }
            }
            if (!z) {
                return false;
            }
        }
        int iMo41af = interfaceC0016c.mo114a().mo41af();
        this.f781h = Math.min(iMo41af - 80, Math.min(interfaceC0016c.mo114a().mo71p(), this.f781h)) & (-8);
        this.f782i = Math.min(iMo41af - 112, Math.min(interfaceC0016c.mo114a().mo72q(), this.f782i)) & (-8);
        this.f780g = Math.min(iMo41af - 512, this.f780g) & (-8);
        return true;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: i_ */
    public final int mo283i_() {
        return this.f781h;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: j */
    public final int mo284j() {
        return this.f782i;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: k_ */
    public final boolean mo286k_() {
        return (this.f775b & 1) != 0;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: g */
    public final boolean mo280g() {
        return (this.f775b & 2) != 0;
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: j_ */
    public final boolean mo285j_() {
        return mo280g();
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final void mo273a(InterfaceC0051b interfaceC0051b) {
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: a */
    public final void mo274a(InterfaceC0278e interfaceC0278e) {
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        InterfaceC0159c c0160d;
        if (C0173a.m509a(bArr, i) != 65) {
            throw new C0175g("Structure size is not 65");
        }
        this.f775b = C0173a.m509a(bArr, i + 2);
        int i2 = i + 4;
        this.f776c = C0173a.m509a(bArr, i2);
        int iM509a = C0173a.m509a(bArr, i2 + 2);
        int i3 = i2 + 4;
        System.arraycopy(bArr, i3, this.f777d, 0, 16);
        int i4 = i3 + 16;
        this.f778e = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        this.f780g = C0173a.m511b(bArr, i5);
        int i6 = i5 + 4;
        this.f781h = C0173a.m511b(bArr, i6);
        int i7 = i6 + 4;
        this.f782i = C0173a.m511b(bArr, i7);
        int i8 = i7 + 4;
        this.f783j = C0173a.m515d(bArr, i8);
        int i9 = i8 + 8;
        this.f784k = C0173a.m515d(bArr, i9);
        int i10 = i9 + 8;
        int iM509a2 = C0173a.m509a(bArr, i10);
        int iM509a3 = C0173a.m509a(bArr, i10 + 2);
        int i11 = i10 + 4;
        int iM511b = C0173a.m511b(bArr, i11);
        int i12 = i11 + 4;
        int iM = m432M();
        if (iM + iM509a2 + iM509a3 < bArr.length) {
            this.f786m = new byte[iM509a3];
            System.arraycopy(bArr, iM509a2 + iM, this.f786m, 0, iM509a3);
            i12 += iM509a3;
        }
        int i13 = ((i12 - iM) % 8) + i12;
        int iM2 = m432M() + iM511b;
        if (this.f776c == 785 && iM511b != 0 && iM509a != 0) {
            InterfaceC0159c[] interfaceC0159cArr = new InterfaceC0159c[iM509a];
            for (int i14 = 0; i14 < iM509a; i14++) {
                int iM509a4 = C0173a.m509a(bArr, iM2);
                int iM509a5 = C0173a.m509a(bArr, iM2 + 2);
                int i15 = iM2 + 4 + 4;
                switch (iM509a4) {
                    case 1:
                        c0160d = new C0160d();
                        break;
                    case 2:
                        c0160d = new C0157a();
                        break;
                    default:
                        c0160d = null;
                        break;
                }
                if (c0160d != null) {
                    c0160d.mo201a(bArr, i15, iM509a5);
                    interfaceC0159cArr[i14] = c0160d;
                }
                iM2 = i15 + iM509a5;
                if (i14 != iM509a - 1) {
                    iM2 += m446j(iM2);
                }
            }
            this.f785l = interfaceC0159cArr;
        }
        return Math.max(i13, iM2) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    public String toString() {
        return new String("Smb2NegotiateResponse[" + super.toString() + ",dialectRevision=" + this.f776c + ",securityMode=0x" + C0284e.m947a(this.f775b, 1) + ",capabilities=0x" + C0284e.m947a(this.f778e, 8) + ",serverTime=" + new Date(this.f783j));
    }

    @Override // p000a.p006d.InterfaceC0180l
    /* JADX INFO: renamed from: h_ */
    public final int mo282h_() {
        return this.f780g;
    }
}
