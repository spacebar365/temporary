package p000a.p001a;

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
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.EnumC0289m;
import p000a.EnumC0294r;
import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.a.a */
/* JADX INFO: compiled from: BaseConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class C0001a implements InterfaceC0267h {

    /* JADX INFO: renamed from: aB */
    private static final InterfaceC1612b f0aB = C1620c.m4563a((Class<?>) C0001a.class);

    /* JADX INFO: renamed from: aC */
    private static final Map<String, Integer> f1aC;

    /* JADX INFO: renamed from: A */
    protected int f2A;

    /* JADX INFO: renamed from: B */
    protected boolean f3B;

    /* JADX INFO: renamed from: C */
    protected int f4C;

    /* JADX INFO: renamed from: D */
    protected int f5D;

    /* JADX INFO: renamed from: E */
    protected int f6E;

    /* JADX INFO: renamed from: F */
    protected int f7F;

    /* JADX INFO: renamed from: G */
    protected boolean f8G;

    /* JADX INFO: renamed from: H */
    protected InetAddress f9H;

    /* JADX INFO: renamed from: I */
    protected int f10I;

    /* JADX INFO: renamed from: J */
    protected int f11J;

    /* JADX INFO: renamed from: K */
    protected int f12K;

    /* JADX INFO: renamed from: L */
    protected int f13L;

    /* JADX INFO: renamed from: M */
    protected int f14M;

    /* JADX INFO: renamed from: N */
    protected String f15N;

    /* JADX INFO: renamed from: O */
    protected String f16O;

    /* JADX INFO: renamed from: P */
    protected int f17P;

    /* JADX INFO: renamed from: Q */
    protected boolean f18Q;

    /* JADX INFO: renamed from: R */
    protected long f19R;

    /* JADX INFO: renamed from: S */
    protected boolean f20S;

    /* JADX INFO: renamed from: T */
    protected boolean f21T;

    /* JADX INFO: renamed from: U */
    protected String f22U;

    /* JADX INFO: renamed from: V */
    protected String f23V;

    /* JADX INFO: renamed from: W */
    protected String f24W;

    /* JADX INFO: renamed from: X */
    protected String f25X;

    /* JADX INFO: renamed from: Y */
    protected String f26Y;

    /* JADX INFO: renamed from: Z */
    protected int f27Z;

    /* JADX INFO: renamed from: a */
    protected int f28a;

    /* JADX INFO: renamed from: aA */
    protected boolean f29aA;

    /* JADX INFO: renamed from: aD */
    private final Map<String, Integer> f30aD;

    /* JADX INFO: renamed from: aE */
    private byte[] f31aE;

    /* JADX INFO: renamed from: aa */
    protected int f32aa;

    /* JADX INFO: renamed from: ab */
    protected int f33ab;

    /* JADX INFO: renamed from: ac */
    protected int f34ac;

    /* JADX INFO: renamed from: ad */
    protected int f35ad;

    /* JADX INFO: renamed from: ae */
    protected int f36ae;

    /* JADX INFO: renamed from: af */
    protected String f37af;

    /* JADX INFO: renamed from: ag */
    protected int f38ag;

    /* JADX INFO: renamed from: ah */
    protected InetAddress f39ah;

    /* JADX INFO: renamed from: ai */
    protected String f40ai;

    /* JADX INFO: renamed from: aj */
    protected InetAddress[] f41aj;

    /* JADX INFO: renamed from: ak */
    protected InetAddress f42ak;

    /* JADX INFO: renamed from: al */
    protected List<EnumC0294r> f43al;

    /* JADX INFO: renamed from: am */
    protected int f44am;

    /* JADX INFO: renamed from: an */
    protected int f45an;

    /* JADX INFO: renamed from: ao */
    protected int f46ao;

    /* JADX INFO: renamed from: ap */
    protected int f47ap;

    /* JADX INFO: renamed from: aq */
    protected int f48aq;

    /* JADX INFO: renamed from: ar */
    protected long f49ar;

    /* JADX INFO: renamed from: as */
    protected boolean f50as;

    /* JADX INFO: renamed from: at */
    protected int f51at;

    /* JADX INFO: renamed from: au */
    protected boolean f52au;

    /* JADX INFO: renamed from: av */
    protected boolean f53av;

    /* JADX INFO: renamed from: aw */
    protected Set<String> f54aw;

    /* JADX INFO: renamed from: ax */
    protected EnumC0289m f55ax;

    /* JADX INFO: renamed from: ay */
    protected EnumC0289m f56ay;

    /* JADX INFO: renamed from: az */
    protected boolean f57az;

    /* JADX INFO: renamed from: b */
    protected TimeZone f58b;

    /* JADX INFO: renamed from: c */
    protected SecureRandom f59c;

    /* JADX INFO: renamed from: d */
    protected boolean f60d;

    /* JADX INFO: renamed from: e */
    protected boolean f61e;

    /* JADX INFO: renamed from: f */
    protected boolean f62f;

    /* JADX INFO: renamed from: g */
    protected boolean f63g;

    /* JADX INFO: renamed from: h */
    protected boolean f64h;

    /* JADX INFO: renamed from: i */
    protected boolean f65i;

    /* JADX INFO: renamed from: j */
    protected boolean f66j;

    /* JADX INFO: renamed from: k */
    protected boolean f67k;

    /* JADX INFO: renamed from: l */
    protected boolean f68l;

    /* JADX INFO: renamed from: m */
    protected boolean f69m;

    /* JADX INFO: renamed from: n */
    protected boolean f70n;

    /* JADX INFO: renamed from: o */
    protected boolean f71o;

    /* JADX INFO: renamed from: p */
    protected boolean f72p;

    /* JADX INFO: renamed from: q */
    protected boolean f73q;

    /* JADX INFO: renamed from: r */
    protected int f74r;

    /* JADX INFO: renamed from: s */
    protected boolean f75s;

    /* JADX INFO: renamed from: t */
    protected boolean f76t;

    /* JADX INFO: renamed from: u */
    protected boolean f77u;

    /* JADX INFO: renamed from: v */
    protected boolean f78v;

    /* JADX INFO: renamed from: w */
    protected boolean f79w;

    /* JADX INFO: renamed from: x */
    protected String f80x;

    /* JADX INFO: renamed from: y */
    protected int f81y;

    /* JADX INFO: renamed from: z */
    protected int f82z;

    static {
        HashMap map = new HashMap();
        f1aC = map;
        map.put("TreeConnectAndX.QueryInformation", 0);
    }

    protected C0001a() {
        this((byte) 0);
    }

    private C0001a(byte b) {
        this.f30aD = new HashMap();
        this.f28a = -1;
        this.f60d = true;
        this.f61e = true;
        this.f62f = false;
        this.f63g = false;
        this.f64h = false;
        this.f65i = true;
        this.f66j = false;
        this.f67k = true;
        this.f68l = true;
        this.f69m = false;
        this.f70n = false;
        this.f71o = false;
        this.f72p = true;
        this.f73q = true;
        this.f74r = 3;
        this.f75s = true;
        this.f76t = false;
        this.f77u = false;
        this.f78v = true;
        this.f79w = true;
        this.f80x = "Cp850";
        this.f81y = 0;
        this.f82z = 0;
        this.f2A = 250;
        this.f3B = false;
        this.f4C = 30000;
        this.f5D = 35000;
        this.f6E = 35000;
        this.f7F = 35000;
        this.f8G = false;
        this.f10I = 0;
        this.f11J = 10;
        this.f12K = 65535;
        this.f13L = 65535;
        this.f14M = 1024;
        this.f16O = "jCIFS";
        this.f17P = 1;
        this.f18Q = false;
        this.f19R = 300L;
        this.f20S = false;
        this.f27Z = 36000;
        this.f32aa = 5000;
        this.f33ab = 576;
        this.f34ac = 576;
        this.f35ad = 2;
        this.f36ae = 3000;
        this.f38ag = 0;
        this.f41aj = new InetAddress[0];
        this.f44am = 65536;
        this.f45an = 65023;
        this.f46ao = 16;
        this.f47ap = 65535;
        this.f48aq = 200;
        this.f49ar = 5000L;
        this.f50as = false;
        this.f51at = 2;
        this.f57az = true;
        this.f29aA = true;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: a */
    public final SecureRandom mo33a() {
        return this.f59c;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: x */
    public final String mo79x() {
        return this.f26Y;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: w */
    public final InetAddress mo78w() {
        return this.f9H;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: v */
    public final int mo77v() {
        return this.f10I;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: s */
    public final int mo74s() {
        return this.f6E;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: u */
    public final int mo76u() {
        return this.f4C;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: r */
    public final int mo73r() {
        return this.f5D;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: t */
    public final int mo75t() {
        return this.f7F;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: q */
    public final int mo72q() {
        return this.f12K;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: p */
    public final int mo71p() {
        return this.f13L;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: R */
    public final int mo23R() {
        return this.f11J;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: o */
    public final String mo70o() {
        return this.f16O;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: n */
    public final String mo69n() {
        return this.f15N;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: K */
    public final int mo16K() {
        return this.f17P;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: L */
    public final int mo17L() {
        return this.f82z;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: f */
    public final EnumC0289m mo61f() {
        return this.f55ax;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: g */
    public final EnumC0289m mo62g() {
        return this.f56ay;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: h */
    public final boolean mo63h() {
        return this.f70n;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: i */
    public final boolean mo64i() {
        return this.f57az;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: j */
    public final boolean mo65j() {
        return this.f71o;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: m */
    public final boolean mo68m() {
        return this.f60d;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: k */
    public final boolean mo66k() {
        return this.f61e;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: l */
    public final boolean mo67l() {
        return this.f62f;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: d */
    public final boolean mo59d() {
        return this.f18Q;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: c */
    public final boolean mo57c() {
        return this.f20S;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: b */
    public final long mo54b() {
        return this.f19R;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: e */
    public final boolean mo60e() {
        return this.f21T;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: y */
    public final String mo80y() {
        return this.f22U;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: z */
    public final String mo81z() {
        return this.f23V;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: A */
    public final String mo6A() {
        return this.f25X;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: D */
    public final boolean mo9D() {
        return this.f79w;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: B */
    public final int mo7B() {
        return this.f74r;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: C */
    public final boolean mo8C() {
        return this.f76t;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ao */
    public final boolean mo50ao() {
        return this.f77u;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ap */
    public final boolean mo51ap() {
        return this.f78v;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: F */
    public final InetAddress mo11F() {
        return this.f42ak;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: E */
    public final List<EnumC0294r> mo10E() {
        return this.f43al;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: G */
    public final InetAddress[] mo12G() {
        return this.f41aj;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: H */
    public final int mo13H() {
        return this.f38ag;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: I */
    public final InetAddress mo14I() {
        return this.f39ah;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: J */
    public final int mo15J() {
        return this.f32aa;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: Y */
    public final String mo30Y() {
        return this.f37af;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ad */
    public final int mo39ad() {
        return this.f27Z;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: aa */
    public final int mo36aa() {
        return this.f34ac;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ac */
    public final int mo38ac() {
        return this.f35ad;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ab */
    public final int mo37ab() {
        return this.f36ae;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: Z */
    public final int mo31Z() {
        return this.f33ab;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: X */
    public final String mo29X() {
        return this.f40ai;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: M */
    public final int mo18M() {
        return this.f81y;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: N */
    public final int mo19N() {
        return this.f2A;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: O */
    public final String mo20O() {
        return this.f80x;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: P */
    public final TimeZone mo21P() {
        return this.f58b;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: Q */
    public final int mo22Q() {
        return this.f28a;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: S */
    public final boolean mo24S() {
        return this.f63g;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: U */
    public final boolean mo26U() {
        return this.f64h;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: T */
    public final boolean mo25T() {
        return this.f65i;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: V */
    public final boolean mo27V() {
        return this.f66j;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: W */
    public final boolean mo28W() {
        return this.f69m;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: af */
    public final int mo41af() {
        return this.f45an;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ae */
    public final int mo40ae() {
        return this.f44am;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ag */
    public final int mo42ag() {
        return this.f46ao;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ah */
    public final int mo43ah() {
        return this.f48aq;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ai */
    public final int mo44ai() {
        return this.f47ap;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: aj */
    public final long mo45aj() {
        return this.f49ar;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: ak */
    public final int mo46ak() {
        return this.f51at;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: am */
    public final boolean mo48am() {
        return this.f52au;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: al */
    public final boolean mo47al() {
        return this.f53av;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: aq */
    public final boolean mo52aq() {
        return this.f29aA;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: an */
    public final byte[] mo49an() {
        return this.f31aE;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: a */
    public final int mo32a(String str) {
        Integer num = this.f30aD.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = f1aC.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return 1;
    }

    @Override // p000a.InterfaceC0267h
    /* JADX INFO: renamed from: b */
    public final boolean mo55b(String str) {
        return this.f54aw == null || !this.f54aw.contains(str);
    }

    /* JADX INFO: renamed from: c */
    protected final void m56c(String str) {
        this.f43al = new ArrayList();
        if (str == null || str.length() == 0) {
            if (this.f41aj.length == 0) {
                this.f43al.add(EnumC0294r.RESOLVER_LMHOSTS);
                this.f43al.add(EnumC0294r.RESOLVER_DNS);
                this.f43al.add(EnumC0294r.RESOLVER_BCAST);
                return;
            } else {
                this.f43al.add(EnumC0294r.RESOLVER_LMHOSTS);
                this.f43al.add(EnumC0294r.RESOLVER_DNS);
                this.f43al.add(EnumC0294r.RESOLVER_WINS);
                this.f43al.add(EnumC0294r.RESOLVER_BCAST);
                return;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.equalsIgnoreCase("LMHOSTS")) {
                this.f43al.add(EnumC0294r.RESOLVER_LMHOSTS);
            } else if (strTrim.equalsIgnoreCase("WINS")) {
                if (this.f41aj.length == 0) {
                    f0aB.mo4543e("UniAddress resolveOrder specifies WINS however  WINS server has not been configured");
                } else {
                    this.f43al.add(EnumC0294r.RESOLVER_WINS);
                }
            } else if (strTrim.equalsIgnoreCase("BCAST")) {
                this.f43al.add(EnumC0294r.RESOLVER_BCAST);
            } else if (strTrim.equalsIgnoreCase("DNS")) {
                this.f43al.add(EnumC0294r.RESOLVER_DNS);
            } else {
                f0aB.mo4543e("unknown resolver method: ".concat(String.valueOf(strTrim)));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m35a(String str, String str2) {
        EnumC0289m enumC0289mValueOf = null;
        EnumC0289m enumC0289mValueOf2 = (str == null || str.isEmpty()) ? null : EnumC0289m.valueOf(str);
        if (str2 != null && !str2.isEmpty()) {
            enumC0289mValueOf = EnumC0289m.valueOf(str2);
        }
        m34a(enumC0289mValueOf2, enumC0289mValueOf);
    }

    /* JADX INFO: renamed from: a */
    protected final void m34a(EnumC0289m enumC0289m, EnumC0289m enumC0289m2) {
        if (enumC0289m == null) {
            enumC0289m = EnumC0289m.SMB1;
        }
        this.f55ax = enumC0289m;
        if (enumC0289m2 == null) {
            enumC0289m2 = EnumC0289m.SMB210;
        }
        this.f56ay = enumC0289m2;
    }

    /* JADX INFO: renamed from: d */
    protected final void m58d(String str) {
        if (str != null) {
            HashSet hashSet = new HashSet();
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(stringTokenizer.nextToken().trim());
            }
            this.f54aw = hashSet;
        }
    }

    /* JADX INFO: renamed from: ar */
    protected final void m53ar() throws C0044d {
        try {
            "".getBytes("Cp850");
            this.f28a = (int) (Math.random() * 65536.0d);
            this.f58b = TimeZone.getDefault();
            this.f59c = new SecureRandom();
            if (this.f31aE == null) {
                byte[] bArr = new byte[32];
                this.f59c.nextBytes(bArr);
                this.f31aE = bArr;
            }
            if (this.f15N == null) {
                this.f15N = System.getProperty("os.name");
            }
            if (this.f81y == 0) {
                this.f81y = ((this.f61e || this.f62f) ? 32768 : 0) | (this.f68l ? 2048 : 0) | 3 | (this.f63g ? 4 : 0) | (this.f67k ? 16384 : 0);
            }
            if (this.f82z == 0) {
                this.f82z = (this.f68l ? Integer.MIN_VALUE : 0) | (this.f67k ? 64 : 0) | (this.f72p ? 16 : 0) | (this.f73q ? 16384 : 0) | (this.f73q ? 32768 : 0) | (this.f61e ? 4 : 0);
            }
            if (this.f42ak == null) {
                try {
                    this.f42ak = InetAddress.getByName("255.255.255.255");
                } catch (UnknownHostException e) {
                    f0aB.mo4535b("Failed to get broadcast address", e);
                }
            }
            if (this.f43al == null) {
                m56c(null);
            }
            if (this.f55ax == null || this.f56ay == null) {
                m34a((EnumC0289m) null, (EnumC0289m) null);
            }
            if (this.f54aw == null) {
                this.f54aw = new HashSet(Arrays.asList("Smb2SessionSetupRequest", "Smb2TreeConnectRequest"));
            }
        } catch (UnsupportedEncodingException e2) {
            throw new C0044d("The default OEM encoding Cp850 does not appear to be supported by this JRE.");
        }
    }
}
