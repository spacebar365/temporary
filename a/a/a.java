package a.a;

import a.d;
import a.h;
import a.m;
import a.r;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import org.c.c;

/* JADX INFO: compiled from: BaseConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements h {
    private static final org.c.b aB = c.a((Class<?>) a.class);
    private static final Map<String, Integer> aC;
    protected int A;
    protected boolean B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected boolean G;
    protected InetAddress H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;
    protected int M;
    protected String N;
    protected String O;
    protected int P;
    protected boolean Q;
    protected long R;
    protected boolean S;
    protected boolean T;
    protected String U;
    protected String V;
    protected String W;
    protected String X;
    protected String Y;
    protected int Z;
    protected int a;
    protected boolean aA;
    private final Map<String, Integer> aD;
    private byte[] aE;
    protected int aa;
    protected int ab;
    protected int ac;
    protected int ad;
    protected int ae;
    protected String af;
    protected int ag;
    protected InetAddress ah;
    protected String ai;
    protected InetAddress[] aj;
    protected InetAddress ak;
    protected List<r> al;
    protected int am;
    protected int an;
    protected int ao;
    protected int ap;
    protected int aq;
    protected long ar;
    protected boolean as;
    protected int at;
    protected boolean au;
    protected boolean av;
    protected Set<String> aw;
    protected m ax;
    protected m ay;
    protected boolean az;
    protected TimeZone b;
    protected SecureRandom c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected int r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected boolean w;
    protected String x;
    protected int y;
    protected int z;

    static {
        HashMap map = new HashMap();
        aC = map;
        map.put("TreeConnectAndX.QueryInformation", 0);
    }

    protected a() {
        this((byte) 0);
    }

    private a(byte b) {
        this.aD = new HashMap();
        this.a = -1;
        this.d = true;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = true;
        this.r = 3;
        this.s = true;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = true;
        this.x = "Cp850";
        this.y = 0;
        this.z = 0;
        this.A = 250;
        this.B = false;
        this.C = 30000;
        this.D = 35000;
        this.E = 35000;
        this.F = 35000;
        this.G = false;
        this.I = 0;
        this.J = 10;
        this.K = 65535;
        this.L = 65535;
        this.M = 1024;
        this.O = "jCIFS";
        this.P = 1;
        this.Q = false;
        this.R = 300L;
        this.S = false;
        this.Z = 36000;
        this.aa = 5000;
        this.ab = 576;
        this.ac = 576;
        this.ad = 2;
        this.ae = 3000;
        this.ag = 0;
        this.aj = new InetAddress[0];
        this.am = 65536;
        this.an = 65023;
        this.ao = 16;
        this.ap = 65535;
        this.aq = 200;
        this.ar = 5000L;
        this.as = false;
        this.at = 2;
        this.az = true;
        this.aA = true;
    }

    @Override // a.h
    public final SecureRandom a() {
        return this.c;
    }

    @Override // a.h
    public final String x() {
        return this.Y;
    }

    @Override // a.h
    public final InetAddress w() {
        return this.H;
    }

    @Override // a.h
    public final int v() {
        return this.I;
    }

    @Override // a.h
    public final int s() {
        return this.E;
    }

    @Override // a.h
    public final int u() {
        return this.C;
    }

    @Override // a.h
    public final int r() {
        return this.D;
    }

    @Override // a.h
    public final int t() {
        return this.F;
    }

    @Override // a.h
    public final int q() {
        return this.K;
    }

    @Override // a.h
    public final int p() {
        return this.L;
    }

    @Override // a.h
    public final int R() {
        return this.J;
    }

    @Override // a.h
    public final String o() {
        return this.O;
    }

    @Override // a.h
    public final String n() {
        return this.N;
    }

    @Override // a.h
    public final int K() {
        return this.P;
    }

    @Override // a.h
    public final int L() {
        return this.z;
    }

    @Override // a.h
    public final m f() {
        return this.ax;
    }

    @Override // a.h
    public final m g() {
        return this.ay;
    }

    @Override // a.h
    public final boolean h() {
        return this.n;
    }

    @Override // a.h
    public final boolean i() {
        return this.az;
    }

    @Override // a.h
    public final boolean j() {
        return this.o;
    }

    @Override // a.h
    public final boolean m() {
        return this.d;
    }

    @Override // a.h
    public final boolean k() {
        return this.e;
    }

    @Override // a.h
    public final boolean l() {
        return this.f;
    }

    @Override // a.h
    public final boolean d() {
        return this.Q;
    }

    @Override // a.h
    public final boolean c() {
        return this.S;
    }

    @Override // a.h
    public final long b() {
        return this.R;
    }

    @Override // a.h
    public final boolean e() {
        return this.T;
    }

    @Override // a.h
    public final String y() {
        return this.U;
    }

    @Override // a.h
    public final String z() {
        return this.V;
    }

    @Override // a.h
    public final String A() {
        return this.X;
    }

    @Override // a.h
    public final boolean D() {
        return this.w;
    }

    @Override // a.h
    public final int B() {
        return this.r;
    }

    @Override // a.h
    public final boolean C() {
        return this.t;
    }

    @Override // a.h
    public final boolean ao() {
        return this.u;
    }

    @Override // a.h
    public final boolean ap() {
        return this.v;
    }

    @Override // a.h
    public final InetAddress F() {
        return this.ak;
    }

    @Override // a.h
    public final List<r> E() {
        return this.al;
    }

    @Override // a.h
    public final InetAddress[] G() {
        return this.aj;
    }

    @Override // a.h
    public final int H() {
        return this.ag;
    }

    @Override // a.h
    public final InetAddress I() {
        return this.ah;
    }

    @Override // a.h
    public final int J() {
        return this.aa;
    }

    @Override // a.h
    public final String Y() {
        return this.af;
    }

    @Override // a.h
    public final int ad() {
        return this.Z;
    }

    @Override // a.h
    public final int aa() {
        return this.ac;
    }

    @Override // a.h
    public final int ac() {
        return this.ad;
    }

    @Override // a.h
    public final int ab() {
        return this.ae;
    }

    @Override // a.h
    public final int Z() {
        return this.ab;
    }

    @Override // a.h
    public final String X() {
        return this.ai;
    }

    @Override // a.h
    public final int M() {
        return this.y;
    }

    @Override // a.h
    public final int N() {
        return this.A;
    }

    @Override // a.h
    public final String O() {
        return this.x;
    }

    @Override // a.h
    public final TimeZone P() {
        return this.b;
    }

    @Override // a.h
    public final int Q() {
        return this.a;
    }

    @Override // a.h
    public final boolean S() {
        return this.g;
    }

    @Override // a.h
    public final boolean U() {
        return this.h;
    }

    @Override // a.h
    public final boolean T() {
        return this.i;
    }

    @Override // a.h
    public final boolean V() {
        return this.j;
    }

    @Override // a.h
    public final boolean W() {
        return this.m;
    }

    @Override // a.h
    public final int af() {
        return this.an;
    }

    @Override // a.h
    public final int ae() {
        return this.am;
    }

    @Override // a.h
    public final int ag() {
        return this.ao;
    }

    @Override // a.h
    public final int ah() {
        return this.aq;
    }

    @Override // a.h
    public final int ai() {
        return this.ap;
    }

    @Override // a.h
    public final long aj() {
        return this.ar;
    }

    @Override // a.h
    public final int ak() {
        return this.at;
    }

    @Override // a.h
    public final boolean am() {
        return this.au;
    }

    @Override // a.h
    public final boolean al() {
        return this.av;
    }

    @Override // a.h
    public final boolean aq() {
        return this.aA;
    }

    @Override // a.h
    public final byte[] an() {
        return this.aE;
    }

    @Override // a.h
    public final int a(String str) {
        Integer num = this.aD.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = aC.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return 1;
    }

    @Override // a.h
    public final boolean b(String str) {
        return this.aw == null || !this.aw.contains(str);
    }

    protected final void c(String str) {
        this.al = new ArrayList();
        if (str == null || str.length() == 0) {
            if (this.aj.length == 0) {
                this.al.add(r.d);
                this.al.add(r.c);
                this.al.add(r.b);
                return;
            } else {
                this.al.add(r.d);
                this.al.add(r.c);
                this.al.add(r.a);
                this.al.add(r.b);
                return;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.equalsIgnoreCase("LMHOSTS")) {
                this.al.add(r.d);
            } else if (strTrim.equalsIgnoreCase("WINS")) {
                if (this.aj.length == 0) {
                    aB.e("UniAddress resolveOrder specifies WINS however  WINS server has not been configured");
                } else {
                    this.al.add(r.a);
                }
            } else if (strTrim.equalsIgnoreCase("BCAST")) {
                this.al.add(r.b);
            } else if (strTrim.equalsIgnoreCase("DNS")) {
                this.al.add(r.c);
            } else {
                aB.e("unknown resolver method: ".concat(String.valueOf(strTrim)));
            }
        }
    }

    protected final void a(String str, String str2) {
        m mVarValueOf = null;
        m mVarValueOf2 = (str == null || str.isEmpty()) ? null : m.valueOf(str);
        if (str2 != null && !str2.isEmpty()) {
            mVarValueOf = m.valueOf(str2);
        }
        a(mVarValueOf2, mVarValueOf);
    }

    protected final void a(m mVar, m mVar2) {
        if (mVar == null) {
            mVar = m.a;
        }
        this.ax = mVar;
        if (mVar2 == null) {
            mVar2 = m.c;
        }
        this.ay = mVar2;
    }

    protected final void d(String str) {
        if (str != null) {
            HashSet hashSet = new HashSet();
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(stringTokenizer.nextToken().trim());
            }
            this.aw = hashSet;
        }
    }

    protected final void ar() throws d {
        try {
            "".getBytes("Cp850");
            this.a = (int) (Math.random() * 65536.0d);
            this.b = TimeZone.getDefault();
            this.c = new SecureRandom();
            if (this.aE == null) {
                byte[] bArr = new byte[32];
                this.c.nextBytes(bArr);
                this.aE = bArr;
            }
            if (this.N == null) {
                this.N = System.getProperty("os.name");
            }
            if (this.y == 0) {
                this.y = ((this.e || this.f) ? 32768 : 0) | (this.l ? 2048 : 0) | 3 | (this.g ? 4 : 0) | (this.k ? 16384 : 0);
            }
            if (this.z == 0) {
                this.z = (this.l ? Integer.MIN_VALUE : 0) | (this.k ? 64 : 0) | (this.p ? 16 : 0) | (this.q ? 16384 : 0) | (this.q ? 32768 : 0) | (this.e ? 4 : 0);
            }
            if (this.ak == null) {
                try {
                    this.ak = InetAddress.getByName("255.255.255.255");
                } catch (UnknownHostException e) {
                    aB.b("Failed to get broadcast address", e);
                }
            }
            if (this.al == null) {
                c(null);
            }
            if (this.ax == null || this.ay == null) {
                a((m) null, (m) null);
            }
            if (this.aw == null) {
                this.aw = new HashSet(Arrays.asList("Smb2SessionSetupRequest", "Smb2TreeConnectRequest"));
            }
        } catch (UnsupportedEncodingException e2) {
            throw new d("The default OEM encoding Cp850 does not appear to be supported by this JRE.");
        }
    }
}
