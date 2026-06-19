package p000a.p006d.p016e;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0051b;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0176h;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0214ad;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.e.b */
/* JADX INFO: compiled from: ServerMessageBlock2.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0134b implements InterfaceC0051b {

    /* JADX INFO: renamed from: a */
    private int f644a;

    /* JADX INFO: renamed from: b */
    private int f645b;

    /* JADX INFO: renamed from: c */
    private int f646c;

    /* JADX INFO: renamed from: d */
    private int f647d;

    /* JADX INFO: renamed from: e */
    private int f648e;

    /* JADX INFO: renamed from: f */
    private int f649f;

    /* JADX INFO: renamed from: g */
    private byte[] f650g;

    /* JADX INFO: renamed from: h */
    private C0156f f651h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0267h f652i;

    /* JADX INFO: renamed from: j */
    private int f653j;

    /* JADX INFO: renamed from: k */
    private int f654k;

    /* JADX INFO: renamed from: l */
    private int f655l;

    /* JADX INFO: renamed from: m */
    private int f656m;

    /* JADX INFO: renamed from: n */
    private int f657n;

    /* JADX INFO: renamed from: o */
    private boolean f658o;

    /* JADX INFO: renamed from: p */
    private int f659p;

    /* JADX INFO: renamed from: q */
    private long f660q;

    /* JADX INFO: renamed from: r */
    private long f661r;

    /* JADX INFO: renamed from: s */
    private long f662s;

    /* JADX INFO: renamed from: t */
    private byte f663t;

    /* JADX INFO: renamed from: u */
    private byte[] f664u;

    /* JADX INFO: renamed from: v */
    private boolean f665v;

    /* JADX INFO: renamed from: w */
    private byte[] f666w;

    /* JADX INFO: renamed from: x */
    private AbstractC0134b f667x;

    /* JADX INFO: renamed from: d */
    protected abstract int mo411d(byte[] bArr, int i);

    /* JADX INFO: renamed from: e */
    protected abstract int mo412e(byte[] bArr, int i);

    protected AbstractC0134b(InterfaceC0267h interfaceC0267h) {
        this.f650g = new byte[16];
        this.f651h = null;
        this.f652i = interfaceC0267h;
    }

    protected AbstractC0134b(InterfaceC0267h interfaceC0267h, int i) {
        this.f650g = new byte[16];
        this.f651h = null;
        this.f652i = interfaceC0267h;
        this.f644a = i;
    }

    /* JADX INFO: renamed from: q */
    protected final InterfaceC0267h m448q() {
        return this.f652i;
    }

    @Override // p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: e_ */
    public void mo217e_() {
        this.f645b = 0;
        this.f651h = null;
        this.f662s = 0L;
        this.f659p = 0;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: c */
    public final int mo216c() {
        return this.f644a;
    }

    /* JADX INFO: renamed from: e */
    public final void m442e(int i) {
        this.f657n = i;
    }

    /* JADX INFO: renamed from: m_ */
    public final boolean m447m_() {
        return this.f658o;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo208a(int i) {
        this.f644a = i;
    }

    /* JADX INFO: renamed from: r */
    public final int m449r() {
        return this.f659p;
    }

    /* JADX INFO: renamed from: f */
    public final void m443f(int i) {
        while (true) {
            this.f659p = i;
            if (this.f667x != null) {
                this = this.f667x;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final long m450u() {
        return this.f661r;
    }

    /* JADX INFO: renamed from: c */
    public final void m441c(long j) {
        this.f661r = j;
    }

    /* JADX INFO: renamed from: v */
    public final int m451v() {
        return this.f655l;
    }

    /* JADX INFO: renamed from: g */
    public final void m444g(int i) {
        this.f655l = i;
    }

    @Override // p000a.p031i.p032a.InterfaceC0275b
    /* JADX INFO: renamed from: R */
    public final void mo341R() {
        this.f665v = true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m452w() {
        return this.f665v;
    }

    /* JADX INFO: renamed from: x */
    public final byte[] m453x() {
        return this.f666w;
    }

    /* JADX INFO: renamed from: b */
    public final void m439b(byte[] bArr) {
        this.f666w = bArr;
    }

    /* JADX INFO: renamed from: y */
    public final C0156f m454y() {
        return this.f651h;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo211a(InterfaceC0176h interfaceC0176h) {
        while (true) {
            this.f651h = (C0156f) interfaceC0176h;
            if (this.f667x != null) {
                this = this.f667x;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m425A() {
        return this.f654k;
    }

    /* JADX INFO: renamed from: B */
    public final long m426B() {
        return this.f662s;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public final void mo215b(long j) {
        while (true) {
            this.f662s = j;
            if (this.f667x != null) {
                this = this.f667x;
            } else {
                return;
            }
        }
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo212a(boolean z) {
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public final void mo214b(int i) {
    }

    /* JADX INFO: renamed from: C */
    public final int m427C() {
        return this.f645b;
    }

    /* JADX INFO: renamed from: h */
    public final void m445h(int i) {
        this.f645b |= i;
    }

    /* JADX INFO: renamed from: H */
    public final void m428H() {
        this.f645b &= -5;
    }

    /* JADX INFO: renamed from: J */
    public final long m429J() {
        return this.f660q;
    }

    @Override // p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: a */
    public final void mo209a(long j) {
        this.f660q = j;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo437a(AbstractC0134b abstractC0134b) {
        if (this.f667x != null) {
            return this.f667x.mo437a(abstractC0134b);
        }
        abstractC0134b.m445h(4);
        this.f667x = abstractC0134b;
        return true;
    }

    /* JADX INFO: renamed from: K */
    protected AbstractC0134b mo430K() {
        return this.f667x;
    }

    /* JADX INFO: renamed from: b */
    protected final void m438b(AbstractC0134b abstractC0134b) {
        this.f667x = abstractC0134b;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC0146d mo218f_() {
        return null;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public void mo210a(InterfaceC0067d interfaceC0067d) {
    }

    /* JADX INFO: renamed from: M */
    public final int m432M() {
        return this.f647d;
    }

    /* JADX INFO: renamed from: Q */
    public final int m433Q() {
        return this.f646c;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public int mo213b(byte[] bArr, int i) {
        this.f647d = i;
        System.arraycopy(C0173a.f817b, 0, bArr, i, C0173a.f817b.length);
        C0173a.m510a(this.f653j, bArr, i + 6);
        C0173a.m510a(this.f644a, bArr, i + 12);
        C0173a.m510a(this.f655l, bArr, i + 14);
        C0173a.m512b(this.f645b, bArr, i + 16);
        C0173a.m512b(this.f656m, bArr, i + 20);
        C0173a.m514c(this.f660q, bArr, i + 24);
        if (this.f658o) {
            C0173a.m514c(this.f661r, bArr, i + 32);
            C0173a.m514c(this.f662s, bArr, i + 40);
        } else {
            C0173a.m512b(this.f659p, bArr, i + 36);
            C0173a.m514c(this.f662s, bArr, i + 40);
        }
        int i2 = i + 64;
        this.f649f = mo411d(bArr, i2);
        int i3 = i2 + this.f649f;
        int iM446j = m446j(i3) + i3;
        this.f646c = iM446j - i;
        int i4 = this.f646c;
        if (this.f667x != null) {
            int iMo213b = this.f667x.mo213b(bArr, iM446j) + iM446j;
            C0173a.m512b(iM446j - i, bArr, i + 20);
            i4 += iMo213b - iM446j;
        }
        if (this.f651h != null) {
            this.f651h.m486a(bArr, this.f647d, this.f646c);
        }
        if (this.f665v) {
            this.f666w = new byte[i4];
            System.arraycopy(bArr, i, this.f666w, 0, i4);
        }
        return i4;
    }

    /* JADX INFO: renamed from: i */
    protected static final int m424i(int i) {
        return m422a(i, 0);
    }

    /* JADX INFO: renamed from: a */
    protected static final int m422a(int i, int i2) {
        int i3 = (i % 8) - i2;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 += 8;
            }
            return (i + 8) - i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    protected final int m446j(int i) {
        int i2 = (i - this.f647d) % 8;
        if (i2 == 0) {
            return 0;
        }
        return 8 - i2;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final int mo206a(byte[] bArr, int i) {
        return m435a(bArr, i, false);
    }

    /* JADX INFO: renamed from: a */
    public final int m435a(byte[] bArr, int i, boolean z) throws C0175g {
        int iMo412e;
        int iM446j;
        this.f647d = i;
        int iM423f = m423f(bArr, i) + i;
        if (mo434T()) {
            iMo412e = iM423f + m440c(bArr, iM423f);
        } else {
            iMo412e = iM423f + mo412e(bArr, iM423f);
        }
        this.f646c = iMo412e - i;
        int i2 = this.f646c;
        if (this.f656m != 0) {
            iM446j = m446j(iMo412e) + i2;
        } else {
            iM446j = (z && this.f656m == 0 && this.f657n > 0) ? (this.f657n - this.f646c) + i2 : i2;
        }
        mo436a(bArr, i, iM446j);
        if (this.f656m != 0 && this.f667x != null && this.f656m % 8 != 0) {
            throw new C0175g("Chained command is not aligned");
        }
        return iM446j;
    }

    /* JADX INFO: renamed from: a */
    protected void mo436a(byte[] bArr, int i, int i2) {
    }

    /* JADX INFO: renamed from: c */
    protected final int m440c(byte[] bArr, int i) throws C0175g {
        if (C0173a.m509a(bArr, i) != 9) {
            throw new C0175g("Error structureSize should be 9");
        }
        this.f663t = bArr[i + 2];
        int i2 = i + 4;
        int iM511b = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        if (iM511b > 0) {
            this.f664u = new byte[iM511b];
            System.arraycopy(bArr, i3, this.f664u, 0, iM511b);
            i3 += iM511b;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: f */
    private int m423f(byte[] bArr, int i) {
        C0173a.m511b(bArr, i);
        int i2 = i + 4;
        C0173a.m509a(bArr, i2);
        this.f653j = C0173a.m509a(bArr, i2 + 2);
        int i3 = i2 + 4;
        this.f654k = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4;
        this.f644a = C0173a.m509a(bArr, i4);
        this.f655l = C0173a.m509a(bArr, i4 + 2);
        int i5 = i4 + 4;
        this.f645b = C0173a.m511b(bArr, i5);
        int i6 = i5 + 4;
        this.f656m = C0173a.m511b(bArr, i6);
        int i7 = i6 + 4;
        this.f660q = C0173a.m513c(bArr, i7);
        int i8 = i7 + 8;
        if ((this.f645b & 2) == 2) {
            this.f658o = true;
            this.f661r = C0173a.m513c(bArr, i8);
            int i9 = i8 + 8;
            this.f662s = C0173a.m513c(bArr, i9);
            System.arraycopy(bArr, i9 + 8, this.f650g, 0, 16);
            return 64;
        }
        this.f658o = false;
        int i10 = i8 + 4;
        this.f659p = C0173a.m511b(bArr, i10);
        int i11 = i10 + 4;
        this.f662s = C0173a.m513c(bArr, i11);
        System.arraycopy(bArr, i11 + 8, this.f650g, 0, 16);
        return 64;
    }

    public int hashCode() {
        return (int) this.f660q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC0134b) && ((AbstractC0134b) obj).f660q == this.f660q;
    }

    public String toString() {
        String str;
        switch (this.f644a) {
            case 0:
                str = "SMB2_NEGOTIATE";
                break;
            case 1:
                str = "SMB2_SESSION_SETUP";
                break;
            case 2:
                str = "SMB2_LOGOFF";
                break;
            case 3:
                str = "SMB2_TREE_CONNECT";
                break;
            case 4:
                str = "SMB2_TREE_DISCONNECT";
                break;
            case 5:
                str = "SMB2_CREATE";
                break;
            case 6:
                str = "SMB2_CLOSE";
                break;
            case 7:
                str = "SMB2_FLUSH";
                break;
            case 8:
                str = "SMB2_READ";
                break;
            case 9:
                str = "SMB2_WRITE";
                break;
            case 10:
                str = "SMB2_LOCK";
                break;
            case 11:
                str = "SMB2_IOCTL";
                break;
            case 12:
                str = "SMB2_CANCEL";
                break;
            case 13:
                str = "SMB2_ECHO";
                break;
            case 14:
                str = "SMB2_QUERY_DIRECTORY";
                break;
            case 15:
                str = "SMB2_CHANGE_NOTIFY";
                break;
            case 16:
                str = "SMB2_QUERY_INFO";
                break;
            case 17:
                str = "SMB2_SET_INFO";
                break;
            case 18:
                str = "SMB2_OPLOCK_BREAK";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return new String("command=" + str + ",status=" + (this.f654k == 0 ? "0" : C0214ad.m612a(this.f654k)) + ",flags=0x" + C0284e.m947a(this.f645b, 4) + ",mid=" + this.f660q + ",wordCount=" + this.f648e + ",byteCount=" + this.f649f);
    }

    /* JADX INFO: renamed from: T */
    protected boolean mo434T() {
        return this.f654k != 0;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0176h mo207a() {
        return this.f651h;
    }
}
