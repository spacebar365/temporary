package p000a.p006d.p010d;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0172f;
import p000a.p006d.InterfaceC0176h;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0214ad;
import p000a.p031i.C0284e;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.d.d.c */
/* JADX INFO: compiled from: ServerMessageBlock.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0103c implements InterfaceC0055c, InterfaceC0067d, InterfaceC0172f {

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f474n = C1620c.m4563a((Class<?>) AbstractC0103c.class);

    /* JADX INFO: renamed from: A */
    private boolean f475A;

    /* JADX INFO: renamed from: B */
    private byte[] f476B;

    /* JADX INFO: renamed from: C */
    private boolean f477C;

    /* JADX INFO: renamed from: D */
    private String f478D;

    /* JADX INFO: renamed from: E */
    private String f479E;

    /* JADX INFO: renamed from: F */
    private String f480F;

    /* JADX INFO: renamed from: G */
    private Integer f481G;

    /* JADX INFO: renamed from: a */
    protected int f482a;

    /* JADX INFO: renamed from: b */
    protected int f483b;

    /* JADX INFO: renamed from: c */
    protected int f484c;

    /* JADX INFO: renamed from: d */
    protected int f485d;

    /* JADX INFO: renamed from: e */
    protected int f486e;

    /* JADX INFO: renamed from: f */
    protected int f487f;

    /* JADX INFO: renamed from: g */
    protected int f488g;

    /* JADX INFO: renamed from: h */
    protected int f489h;

    /* JADX INFO: renamed from: i */
    protected int f490i;

    /* JADX INFO: renamed from: j */
    protected int f491j;

    /* JADX INFO: renamed from: k */
    protected int f492k;

    /* JADX INFO: renamed from: l */
    protected String f493l;

    /* JADX INFO: renamed from: m */
    protected C0097b f494m;

    /* JADX INFO: renamed from: o */
    private byte f495o;

    /* JADX INFO: renamed from: p */
    private byte f496p;

    /* JADX INFO: renamed from: q */
    private boolean f497q;

    /* JADX INFO: renamed from: r */
    private boolean f498r;

    /* JADX INFO: renamed from: s */
    private boolean f499s;

    /* JADX INFO: renamed from: t */
    private volatile boolean f500t;

    /* JADX INFO: renamed from: u */
    private int f501u;

    /* JADX INFO: renamed from: v */
    private boolean f502v;

    /* JADX INFO: renamed from: w */
    private AbstractC0103c f503w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0267h f504x;

    /* JADX INFO: renamed from: y */
    private Long f505y;

    /* JADX INFO: renamed from: z */
    private Exception f506z;

    /* JADX INFO: renamed from: f */
    protected abstract int mo253f(byte[] bArr, int i);

    /* JADX INFO: renamed from: g */
    protected abstract int mo254g(byte[] bArr, int i);

    /* JADX INFO: renamed from: h */
    protected abstract int mo255h(byte[] bArr, int i);

    /* JADX INFO: renamed from: i */
    protected abstract int mo256i(byte[] bArr, int i);

    protected AbstractC0103c(InterfaceC0267h interfaceC0267h) {
        this(interfaceC0267h, (byte) 0);
    }

    protected AbstractC0103c(InterfaceC0267h interfaceC0267h, byte b) {
        this(interfaceC0267h, b, null);
    }

    protected AbstractC0103c(InterfaceC0267h interfaceC0267h, byte b, String str) {
        this.f492k = 65535;
        this.f494m = null;
        this.f504x = interfaceC0267h;
        this.f495o = b;
        this.f493l = str;
        this.f496p = (byte) 24;
        this.f487f = interfaceC0267h.mo22Q();
        this.f484c = 0;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return 0;
    }

    @Override // p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: m_ */
    public final boolean mo245m_() {
        return false;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: a_ */
    public final boolean mo222a_() {
        return false;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: i */
    public final Integer mo224i() {
        return this.f481G;
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC0103c mo251s() {
        return null;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: a */
    public final boolean mo220a(InterfaceC0055c interfaceC0055c) {
        return false;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: n_ */
    public final InterfaceC0055c mo226n_() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC0067d mo244k() {
        return null;
    }

    @Override // p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: b */
    public final void mo243b(InterfaceC0055c interfaceC0055c) {
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: t */
    public final int mo373t() {
        return 1;
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: d */
    public final void mo360d(int i) {
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: c */
    public final int mo216c() {
        return this.f495o;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo208a(int i) {
        this.f495o = (byte) i;
    }

    /* JADX INFO: renamed from: u */
    public final int m374u() {
        return this.f491j;
    }

    /* JADX INFO: renamed from: v */
    public final int m375v() {
        return this.f483b;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo376w() {
        return this.f498r;
    }

    /* JADX INFO: renamed from: x */
    public final byte m377x() {
        return this.f496p;
    }

    /* JADX INFO: renamed from: a */
    public final void m350a(byte b) {
        this.f496p = b;
    }

    /* JADX INFO: renamed from: y */
    public final int m378y() {
        return this.f486e;
    }

    /* JADX INFO: renamed from: e */
    public final void m363e(int i) {
        this.f486e = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m364f(int i) {
        this.f486e |= i;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: p */
    public final void mo372p() {
        m364f(4096);
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: z */
    public final int mo379z() {
        return this.f485d;
    }

    /* JADX INFO: renamed from: g */
    public final void m365g(int i) {
        this.f485d = i;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: l */
    public final String mo368l() {
        return this.f493l;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: o */
    public final String mo370o() {
        return this.f478D;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: n */
    public final String mo369n() {
        return this.f480F;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: o_ */
    public final String mo371o_() {
        return this.f479E;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: a */
    public final void mo354a(String str, String str2, String str3) {
        this.f480F = str;
        this.f479E = str2;
        this.f478D = str3;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: a */
    public final void mo353a(String str) {
        this.f493l = str;
    }

    /* JADX INFO: renamed from: A */
    public final C0097b m325A() {
        return this.f494m;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo211a(InterfaceC0176h interfaceC0176h) {
        this.f494m = (C0097b) interfaceC0176h;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m326B() {
        return this.f499s;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public final void mo215b(long j) {
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo212a(boolean z) {
        this.f499s = z;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m327C() {
        return this.f497q;
    }

    /* JADX INFO: renamed from: b */
    public final void m356b(boolean z) {
        this.f497q = z;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: D */
    public final boolean mo328D() {
        return this.f500t;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: E */
    public final void mo329E() {
        this.f500t = false;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: F */
    public final void mo330F() {
        this.f500t = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: a */
    public final void mo351a(Exception exc) {
        this.f506z = exc;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: G */
    public final void mo331G() {
        this.f475A = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC0103c mo218f_() {
        return this.f503w;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final void mo210a(InterfaceC0067d interfaceC0067d) {
        if (!(interfaceC0067d instanceof AbstractC0103c)) {
            throw new IllegalArgumentException();
        }
        this.f503w = (AbstractC0103c) interfaceC0067d;
    }

    @Override // p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: I */
    public boolean mo332I() {
        return false;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: J */
    public final long mo333J() {
        return this.f489h;
    }

    @Override // p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: a */
    public final void mo209a(long j) {
        this.f489h = (int) j;
    }

    /* JADX INFO: renamed from: d_ */
    public final int m361d_() {
        return this.f492k;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: a_ */
    public final void mo221a_(int i) {
        this.f492k = i;
    }

    /* JADX INFO: renamed from: K */
    public final int m334K() {
        return this.f487f;
    }

    /* JADX INFO: renamed from: h */
    public final void m366h(int i) {
        this.f487f = i;
    }

    /* JADX INFO: renamed from: L */
    public final int m335L() {
        return this.f488g;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public final void mo214b(int i) {
        this.f488g = i;
    }

    /* JADX INFO: renamed from: M */
    public final int m336M() {
        return this.f501u;
    }

    /* JADX INFO: renamed from: i */
    public final void m367i(int i) {
        this.f501u = i;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: N */
    public final boolean mo337N() {
        return this.f502v;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: O */
    public final Exception mo338O() {
        return this.f506z;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: P */
    public final boolean mo339P() {
        return this.f475A;
    }

    /* JADX INFO: renamed from: a */
    public final void m355a(byte[] bArr) {
        this.f476B = bArr;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m340Q() {
        return this.f477C;
    }

    @Override // p000a.p031i.p032a.InterfaceC0275b
    /* JADX INFO: renamed from: R */
    public final void mo341R() {
        this.f477C = true;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: S */
    public final Long mo342S() {
        return this.f505y;
    }

    @Override // p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: a */
    public final void mo352a(Long l) {
        this.f505y = l;
    }

    /* JADX INFO: renamed from: T */
    protected final InterfaceC0267h m343T() {
        return this.f504x;
    }

    @Override // p000a.p006d.InterfaceC0051b, p000a.p031i.p032a.InterfaceC0278e
    /* JADX INFO: renamed from: e_ */
    public void mo217e_() {
        this.f496p = (byte) 24;
        this.f486e = 0;
        this.f485d = 0;
        this.f500t = false;
        this.f494m = null;
        this.f488g = 0;
        this.f492k = 65535;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m357b(byte[] bArr) {
        if (this.f494m == null || this.f485d != 0) {
            return true;
        }
        boolean zM317a = this.f494m.m317a(bArr, this);
        this.f502v = zM317a;
        return !zM317a;
    }

    /* JADX INFO: renamed from: a */
    protected final int m346a(String str, byte[] bArr, int i) {
        return m347a(str, bArr, i, this.f497q);
    }

    /* JADX INFO: renamed from: a */
    protected final int m347a(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            if ((i - this.f482a) % 2 != 0) {
                i3 = i + 1;
                bArr[i] = 0;
            } else {
                i3 = i;
            }
            System.arraycopy(C0285f.m952a(str), 0, bArr, i3, str.length() * 2);
            int length = i3 + (str.length() * 2);
            int i4 = length + 1;
            bArr[length] = 0;
            i2 = i4 + 1;
            bArr[i4] = 0;
        } else {
            byte[] bArrM953a = C0285f.m953a(str, this.f504x);
            System.arraycopy(bArrM953a, 0, bArr, i, bArrM953a.length);
            int length2 = i + bArrM953a.length;
            i2 = length2 + 1;
            bArr[length2] = 0;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: c */
    public final String m358c(byte[] bArr, int i) {
        return m348a(bArr, i, 255, this.f497q);
    }

    /* JADX INFO: renamed from: a */
    public final String m348a(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            if ((i - this.f482a) % 2 != 0) {
                i++;
            }
            return C0285f.m950a(bArr, i, C0285f.m955b(bArr, i, i2));
        }
        return C0285f.m951a(bArr, i, C0285f.m957c(bArr, i, i2), this.f504x);
    }

    /* JADX INFO: renamed from: a */
    public final String m349a(byte[] bArr, int i, boolean z) {
        if (z) {
            if ((i - this.f482a) % 2 != 0) {
                i++;
            }
            return C0285f.m950a(bArr, i, C0285f.m955b(bArr, i, 255));
        }
        return C0285f.m951a(bArr, i, C0285f.m957c(bArr, i, 255), this.f504x);
    }

    /* JADX INFO: renamed from: a */
    public final int m345a(String str, int i) {
        int length = str.length() + 1;
        if (this.f497q) {
            int length2 = (str.length() * 2) + 2;
            return i % 2 != 0 ? length2 + 1 : length2;
        }
        return length;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: b */
    public int mo213b(byte[] bArr, int i) {
        this.f482a = i;
        int iM359d = m359d(bArr, i) + i;
        this.f490i = mo253f(bArr, iM359d + 1);
        bArr[iM359d] = (byte) ((this.f490i / 2) & 255);
        int i2 = this.f490i + iM359d + 1;
        this.f490i /= 2;
        this.f491j = mo254g(bArr, i2 + 2);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (this.f491j & 255);
        bArr[i3] = (byte) ((this.f491j >> 8) & 255);
        this.f483b = ((i3 + 1) + this.f491j) - i;
        if (this.f494m != null) {
            this.f494m.m316a(bArr, this.f482a, this.f483b, this, this.f503w);
        }
        return this.f483b;
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public int mo206a(byte[] bArr, int i) throws C0175g {
        this.f482a = i;
        int iM362e = i + m362e(bArr, i);
        int i2 = iM362e + 1;
        this.f490i = bArr[iM362e];
        if (this.f490i != 0) {
            int iMo255h = mo255h(bArr, i2);
            if (iMo255h != this.f490i * 2 && f474n.mo4536b()) {
                f474n.mo4532a("wordCount * 2=" + (this.f490i * 2) + " but readParameterWordsWireFormat returned " + iMo255h);
            }
            i2 += this.f490i * 2;
        }
        this.f491j = C0173a.m509a(bArr, i2);
        int i3 = i2 + 2;
        if (this.f491j != 0) {
            int iMo256i = mo256i(bArr, i3);
            if (iMo256i != this.f491j && f474n.mo4536b()) {
                f474n.mo4532a("byteCount=" + this.f491j + " but readBytesWireFormat returned " + iMo256i);
            }
            i3 += this.f491j;
        }
        int i4 = i3 - i;
        this.f483b = i4;
        if (this.f477C) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, 4, bArr2, 0, i4);
            this.f476B = bArr2;
        }
        if (!m357b(bArr)) {
            throw new C0175g("Signature verification failed for " + getClass().getName());
        }
        return i4;
    }

    /* JADX INFO: renamed from: d */
    protected final int m359d(byte[] bArr, int i) {
        System.arraycopy(C0173a.f816a, 0, bArr, i, C0173a.f816a.length);
        bArr[i + 4] = this.f495o;
        bArr[i + 9] = this.f496p;
        C0173a.m510a(this.f486e, bArr, i + 9 + 1);
        int i2 = i + 24;
        C0173a.m510a(this.f492k, bArr, i2);
        C0173a.m510a(this.f487f, bArr, i2 + 2);
        C0173a.m510a(this.f488g, bArr, i2 + 4);
        C0173a.m510a(this.f489h, bArr, i2 + 6);
        return 32;
    }

    /* JADX INFO: renamed from: e */
    protected final int m362e(byte[] bArr, int i) {
        this.f495o = bArr[i + 4];
        this.f485d = C0173a.m511b(bArr, i + 5);
        this.f496p = bArr[i + 9];
        this.f486e = C0173a.m509a(bArr, i + 9 + 1);
        this.f492k = C0173a.m509a(bArr, i + 24);
        this.f487f = C0173a.m509a(bArr, i + 24 + 2);
        this.f488g = C0173a.m509a(bArr, i + 24 + 4);
        this.f489h = C0173a.m509a(bArr, i + 24 + 6);
        return 32;
    }

    /* JADX INFO: renamed from: U */
    protected final boolean m344U() {
        return (this.f496p & 128) == 128;
    }

    public int hashCode() {
        return this.f489h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC0103c) && ((AbstractC0103c) obj).f489h == this.f489h;
    }

    public String toString() {
        String str;
        switch (this.f495o) {
            case -96:
                str = "SMB_COM_NT_TRANSACT";
                break;
            case -95:
                str = "SMB_COM_NT_TRANSACT_SECONDARY";
                break;
            case -94:
                str = "SMB_COM_NT_CREATE_ANDX";
                break;
            case 0:
                str = "SMB_COM_CREATE_DIRECTORY";
                break;
            case 1:
                str = "SMB_COM_DELETE_DIRECTORY";
                break;
            case 4:
                str = "SMB_COM_CLOSE";
                break;
            case 6:
                str = "SMB_COM_DELETE";
                break;
            case 7:
                str = "SMB_COM_RENAME";
                break;
            case 8:
                str = "SMB_COM_QUERY_INFORMATION";
                break;
            case 16:
                str = "SMB_COM_CHECK_DIRECTORY";
                break;
            case 36:
                str = "SMB_COM_LOCKING_ANDX";
                break;
            case 37:
                str = "SMB_COM_TRANSACTION";
                break;
            case 38:
                str = "SMB_COM_TRANSACTION_SECONDARY";
                break;
            case 42:
                str = "SMB_COM_MOVE";
                break;
            case 43:
                str = "SMB_COM_ECHO";
                break;
            case 45:
                str = "SMB_COM_OPEN_ANDX";
                break;
            case 46:
                str = "SMB_COM_READ_ANDX";
                break;
            case 47:
                str = "SMB_COM_WRITE_ANDX";
                break;
            case 50:
                str = "SMB_COM_TRANSACTION2";
                break;
            case 52:
                str = "SMB_COM_FIND_CLOSE2";
                break;
            case 113:
                str = "SMB_COM_TREE_DISCONNECT";
                break;
            case 114:
                str = "SMB_COM_NEGOTIATE";
                break;
            case 115:
                str = "SMB_COM_SESSION_SETUP_ANDX";
                break;
            case 116:
                str = "SMB_COM_LOGOFF_ANDX";
                break;
            case 117:
                str = "SMB_COM_TREE_CONNECT_ANDX";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return new String("command=" + str + ",received=" + this.f500t + ",errorCode=" + (this.f485d == 0 ? "0" : C0214ad.m612a(this.f485d)) + ",flags=0x" + C0284e.m947a(this.f496p & 255, 4) + ",flags2=0x" + C0284e.m947a(this.f486e, 4) + ",signSeq=" + this.f501u + ",tid=" + this.f492k + ",pid=" + this.f487f + ",uid=" + this.f488g + ",mid=" + this.f489h + ",wordCount=" + this.f490i + ",byteCount=" + this.f491j);
    }

    @Override // p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0176h mo207a() {
        return this.f494m;
    }
}
