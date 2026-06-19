package p000a.p029g;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.EnumC0289m;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0006ad;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0287k;
import p000a.p006d.C0178j;
import p000a.p006d.InterfaceC0051b;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0172f;
import p000a.p006d.InterfaceC0176h;
import p000a.p006d.InterfaceC0180l;
import p000a.p006d.p007a.C0046a;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p010d.p011a.C0073c;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p010d.p013c.AbstractC0108b;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.p022f.C0161e;
import p000a.p006d.p016e.p022f.C0162f;
import p000a.p031i.C0281b;
import p000a.p031i.C0282c;
import p000a.p031i.C0284e;
import p000a.p031i.p032a.AbstractRunnableC0279f;
import p000a.p031i.p032a.C0280g;
import p000a.p031i.p032a.InterfaceC0276c;
import p000a.p031i.p032a.InterfaceC0278e;

/* JADX INFO: renamed from: a.g.as */
/* JADX INFO: compiled from: SmbTransportImpl.java */
/* JADX INFO: loaded from: classes.dex */
class C0229as extends AbstractRunnableC0279f implements InterfaceC0230at {

    /* JADX INFO: renamed from: f */
    private static InterfaceC1612b f1059f = C1620c.m4563a((Class<?>) C0229as.class);

    /* JADX INFO: renamed from: h */
    private InetAddress f1061h;

    /* JADX INFO: renamed from: i */
    private int f1062i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0000a f1063j;

    /* JADX INFO: renamed from: k */
    private Socket f1064k;

    /* JADX INFO: renamed from: l */
    private int f1065l;

    /* JADX INFO: renamed from: n */
    private OutputStream f1067n;

    /* JADX INFO: renamed from: o */
    private InputStream f1068o;

    /* JADX INFO: renamed from: q */
    private long f1070q;

    /* JADX INFO: renamed from: t */
    private final InterfaceC0016c f1073t;

    /* JADX INFO: renamed from: u */
    private final boolean f1074u;

    /* JADX INFO: renamed from: v */
    private InterfaceC0180l f1075v;

    /* JADX INFO: renamed from: w */
    private InterfaceC0176h f1076w;

    /* JADX INFO: renamed from: g */
    private boolean f1060g = false;

    /* JADX INFO: renamed from: m */
    private final AtomicLong f1066m = new AtomicLong();

    /* JADX INFO: renamed from: p */
    private final byte[] f1069p = new byte[1024];

    /* JADX INFO: renamed from: r */
    private final List<C0227aq> f1071r = new LinkedList();

    /* JADX INFO: renamed from: s */
    private String f1072s = null;

    /* JADX INFO: renamed from: x */
    private final Semaphore f1077x = new Semaphore(1, true);

    /* JADX INFO: renamed from: y */
    private final int f1078y = 512;

    /* JADX INFO: renamed from: z */
    private byte[] f1079z = new byte[64];

    C0229as(InterfaceC0016c interfaceC0016c, InterfaceC0000a interfaceC0000a, int i, InetAddress inetAddress, int i2, boolean z) {
        this.f1073t = interfaceC0016c;
        this.f1074u = z || this.f1073t.mo114a().mo26U();
        this.f1070q = System.currentTimeMillis() + ((long) interfaceC0016c.mo114a().mo75t());
        this.f1063j = interfaceC0000a;
        this.f1065l = i;
        this.f1061h = inetAddress;
        this.f1062i = i2;
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: a */
    protected final int mo725a(InterfaceC0276c interfaceC0276c) {
        Integer numMo224i;
        if ((interfaceC0276c instanceof InterfaceC0055c) && (numMo224i = ((InterfaceC0055c) interfaceC0276c).mo224i()) != null) {
            return numMo224i.intValue();
        }
        return this.f1073t.mo114a().mo76u();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0000a m739b() {
        return this.f1063j;
    }

    @Override // p000a.InterfaceC0006ad
    /* JADX INFO: renamed from: a */
    public final String mo97a() {
        return this.f1072s;
    }

    /* JADX INFO: renamed from: c */
    public final int m741c() {
        return this.f1071r.size();
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: d */
    public final boolean mo743d() {
        Socket socket = this.f1064k;
        return super.mo743d() || socket == null || socket.isClosed();
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: e */
    public final boolean mo744e() {
        Socket socket = this.f1064k;
        return super.mo744e() || socket == null || socket.isClosed();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m733a(int i) {
        return m745f().mo278c(i);
    }

    /* JADX INFO: renamed from: f */
    final InterfaceC0180l m745f() throws C0214ad {
        try {
            if (this.f1075v == null) {
                m929a(this.f1073t.mo114a().mo76u());
            }
            InterfaceC0180l interfaceC0180l = this.f1075v;
            if (interfaceC0180l == null) {
                throw new C0214ad("Connection did not complete, failed to get negotiation response");
            }
            return interfaceC0180l;
        } catch (IOException e) {
            throw new C0214ad(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m746g() {
        return this.f1060g || (m745f() instanceof C0162f);
    }

    /* JADX INFO: renamed from: a */
    public final void m730a(InterfaceC0176h interfaceC0176h) {
        this.f1076w = interfaceC0176h;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0176h m747h() {
        return this.f1076w;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0016c m748i() {
        return this.f1073t;
    }

    /* JADX INFO: renamed from: j */
    public final C0229as m749j() {
        return (C0229as) super.mo756q();
    }

    @Override // p000a.p029g.InterfaceC0230at
    /* JADX INFO: renamed from: k */
    public final boolean mo750k() throws C0214ad {
        if (this.f1074u) {
            return false;
        }
        InterfaceC0180l interfaceC0180lM745f = m745f();
        return interfaceC0180lM745f.mo285j_() && !interfaceC0180lM745f.mo280g();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m751l() {
        if (this.f1074u) {
            return true;
        }
        return m745f().mo280g();
    }

    @Override // p000a.InterfaceC0006ad
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0006ad> T mo96a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // p000a.p029g.InterfaceC0230at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized C0227aq mo740b(InterfaceC0016c interfaceC0016c, String str, String str2) {
        C0227aq c0227aq;
        if (f1059f.mo4536b()) {
            f1059f.mo4532a("Currently " + this.f1071r.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator<C0227aq> listIterator = this.f1071r.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                C0227aq next = listIterator.next();
                if (next.m698a(interfaceC0016c, str, str2)) {
                    if (f1059f.mo4536b()) {
                        f1059f.mo4532a("Reusing existing session ".concat(String.valueOf(next)));
                    }
                    c0227aq = next.m704e();
                } else if (f1059f.mo4536b()) {
                    f1059f.mo4532a("Existing session " + next + " does not match " + interfaceC0016c.mo109g());
                }
            } else {
                if (interfaceC0016c.mo114a().mo75t() > 0) {
                    long j = this.f1070q;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j < jCurrentTimeMillis) {
                        this.f1070q = ((long) interfaceC0016c.mo114a().mo75t()) + jCurrentTimeMillis;
                        ListIterator<C0227aq> listIterator2 = this.f1071r.listIterator();
                        while (listIterator2.hasNext()) {
                            C0227aq next2 = listIterator2.next();
                            if (next2.m708i() != null && next2.m708i().longValue() < jCurrentTimeMillis && !next2.m703d()) {
                                if (f1059f.mo4539c()) {
                                    f1059f.mo4534b("Closing session after timeout ".concat(String.valueOf(next2)));
                                }
                                next2.m699a(false, false);
                            }
                        }
                    }
                }
                c0227aq = new C0227aq(interfaceC0016c, str, str2, this);
                if (f1059f.mo4539c()) {
                    f1059f.mo4534b("Establishing new session " + c0227aq + " on " + this.f1240b);
                }
                this.f1071r.add(c0227aq);
            }
        }
        return c0227aq;
    }

    /* JADX INFO: renamed from: a */
    final boolean m734a(InterfaceC0000a interfaceC0000a, int i, InetAddress inetAddress, int i2, String str) {
        if (this.f1239a == 5 || this.f1239a == 6) {
            return false;
        }
        if (str == null) {
            str = interfaceC0000a.mo1a();
        }
        if ((this.f1072s != null && !str.equalsIgnoreCase(this.f1072s)) || !interfaceC0000a.equals(this.f1063j)) {
            return false;
        }
        if (i == 0 || i == this.f1065l || (i == 445 && this.f1065l == 139)) {
            return (inetAddress == this.f1061h || (inetAddress != null && inetAddress.equals(this.f1061h))) && i2 == this.f1062i;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:104)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.process(SynchronizedRegionMaker.java:87)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:118)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: b */
    private p000a.p006d.C0178j m720b(int r11) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0229as.m720b(int):a.d.j");
    }

    /* JADX INFO: renamed from: a */
    private int m712a(InterfaceC0055c interfaceC0055c, boolean z) throws IOException {
        if (z) {
            mo738b(interfaceC0055c);
        } else {
            interfaceC0055c.mo209a(0L);
            this.f1066m.set(1L);
        }
        int iB = interfaceC0055c.mo213b(this.f1069p, 4);
        C0282c.m940a(65535 & iB, this.f1069p);
        if (f1059f.mo4536b()) {
            f1059f.mo4532a(interfaceC0055c.toString());
            f1059f.mo4532a(C0284e.m949a(this.f1069p, 4, iB));
        }
        this.f1067n.write(this.f1069p, 0, iB + 4);
        this.f1067n.flush();
        f1059f.mo4532a("Wrote negotiate request");
        return iB;
    }

    /* JADX INFO: renamed from: u */
    private void m723u() throws IOException {
        try {
            this.f1064k.setSoTimeout(this.f1073t.mo114a().mo74s());
            if (mo754o() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.f1064k.setSoTimeout(this.f1073t.mo114a().mo73r());
            int iM943a = 65535 & C0282c.m943a(this.f1069p);
            if (iM943a < 33 || iM943a + 4 > this.f1069p.length) {
                throw new IOException("Invalid payload size: ".concat(String.valueOf(iM943a)));
            }
            int i = this.f1060g ? 64 : 32;
            m924a(this.f1068o, this.f1069p, i + 4, iM943a - i);
            f1059f.mo4532a("Read negotiate response");
        } catch (Throwable th) {
            this.f1064k.setSoTimeout(this.f1073t.mo114a().mo73r());
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private C0178j m721b(C0162f c0162f) throws Throwable {
        Throwable th;
        byte[] bArr;
        byte[] bArr2;
        C0162f c0162f2 = null;
        C0161e c0161e = new C0161e(this.f1073t.mo114a(), m724a(c0162f));
        try {
            getClass();
            c0161e.m444g(Math.max(1, 512 - this.f1077x.availablePermits()));
            int iM712a = m712a(c0161e, c0162f != null);
            boolean zM961a = this.f1073t.mo114a().mo62g().m961a(EnumC0289m.SMB311);
            if (zM961a) {
                bArr = new byte[iM712a];
                System.arraycopy(this.f1069p, 4, bArr, 0, iM712a);
            } else {
                bArr = null;
            }
            m723u();
            C0162f c0162fB = c0161e.mo260a(this.f1073t);
            try {
                int iA = c0162fB.mo206a(this.f1069p, 4);
                c0162fB.mo330F();
                if (zM961a) {
                    byte[] bArr3 = new byte[iA];
                    System.arraycopy(this.f1069p, 4, bArr3, 0, iA);
                    bArr2 = bArr3;
                } else {
                    bArr2 = null;
                    bArr = null;
                }
                if (f1059f.mo4536b()) {
                    f1059f.mo4532a(c0162fB.toString());
                    f1059f.mo4532a(C0284e.m949a(this.f1069p, 4, 0));
                }
                C0178j c0178j = new C0178j(c0161e, c0162fB, bArr, bArr2);
                int iV = c0162fB != null ? c0162fB.m451v() : 0;
                if (iV == 0) {
                    iV = 1;
                }
                this.f1077x.release(iV);
                Arrays.fill(this.f1069p, (byte) 0);
                return c0178j;
            } catch (Throwable th2) {
                th = th2;
                c0162f2 = c0162fB;
                int iV2 = c0162f2 != null ? c0162f2.m451v() : 0;
                this.f1077x.release(iV2 != 0 ? iV2 : 1);
                Arrays.fill(this.f1069p, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p000a.p029g.InterfaceC0230at
    /* JADX INFO: renamed from: m */
    public final boolean mo752m() throws C0214ad {
        try {
            return super.m929a(this.f1073t.mo114a().mo76u());
        } catch (C0280g e) {
            throw new C0214ad("Failed to connect: " + this.f1063j, e);
        }
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: n */
    protected final void mo753n() throws IOException {
        C0178j c0178jM720b;
        if (f1059f.mo4539c()) {
            f1059f.mo4534b("Connecting in state " + this.f1239a + " addr " + this.f1063j.mo3b());
        }
        try {
            c0178jM720b = m720b(this.f1065l);
        } catch (IOException e) {
            if (this.f1073t.mo114a().mo65j()) {
                this.f1065l = (this.f1065l == 0 || this.f1065l == 445) ? 139 : 445;
                this.f1060g = false;
                this.f1066m.set(0L);
                c0178jM720b = m720b(this.f1065l);
            } else {
                throw e;
            }
        }
        if (c0178jM720b == null || c0178jM720b.m520b() == null) {
            throw new C0214ad("Failed to connect.");
        }
        if (f1059f.mo4539c()) {
            f1059f.mo4534b("Negotiation response on " + this.f1240b + " :" + c0178jM720b);
        }
        if (!c0178jM720b.m520b().mo276a(this.f1073t, c0178jM720b.m519a())) {
            throw new C0214ad("This client is not compatible with the server.");
        }
        boolean zMo280g = c0178jM720b.m520b().mo280g();
        boolean zMo286k_ = c0178jM720b.m520b().mo286k_();
        if (f1059f.mo4539c()) {
            f1059f.mo4534b("Signature negotiation enforced " + this.f1074u + " (server " + zMo280g + ") enabled " + this.f1073t.mo114a().mo24S() + " (server " + zMo286k_ + ")");
        }
        this.f1072s = this.f1063j.mo1a();
        this.f1075v = c0178jM720b.m520b();
        if (c0178jM720b.m520b().mo279e().m961a(EnumC0289m.SMB311)) {
            m715a(c0178jM720b.m521c());
            m715a(c0178jM720b.m522d());
            if (f1059f.mo4539c()) {
                f1059f.mo4534b("Preauth hash after negotiate " + C0284e.m948a(this.f1079z));
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: a */
    protected final synchronized boolean mo736a(boolean z, boolean z2) {
        Exception e;
        boolean zM699a = false;
        synchronized (this) {
            ListIterator<C0227aq> listIterator = this.f1071r.listIterator();
            long jS = m932s();
            if ((z2 && jS != 1) || (!z2 && jS > 0)) {
                f1059f.mo4540d("Disconnecting transport while still in use " + this + ": " + this.f1071r);
                zM699a = true;
            }
            if (f1059f.mo4539c()) {
                f1059f.mo4534b("Disconnecting transport ".concat(String.valueOf(this)));
            }
            try {
                try {
                    if (f1059f.mo4536b()) {
                        f1059f.mo4532a("Currently " + this.f1071r.size() + " session(s) active for " + this);
                    }
                    boolean z3 = zM699a;
                    while (listIterator.hasNext()) {
                        try {
                            try {
                                zM699a = listIterator.next().m699a(z, false) | z3;
                                z3 = zM699a;
                            } catch (Exception e2) {
                                f1059f.mo4535b("Failed to close session", e2);
                            } finally {
                                listIterator.remove();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            zM699a = z3;
                            f1059f.mo4535b("Exception in disconnect", e);
                            this.f1064k = null;
                            this.f1076w = null;
                            this.f1072s = null;
                            this.f1073t.mo117d().mo99a(this);
                        }
                    }
                    if (this.f1064k != null) {
                        this.f1064k.shutdownOutput();
                        this.f1067n.close();
                        this.f1068o.close();
                        this.f1064k.close();
                        f1059f.mo4532a("Socket closed");
                    } else {
                        f1059f.mo4532a("Not yet initialized");
                    }
                    this.f1064k = null;
                    this.f1076w = null;
                    this.f1072s = null;
                    this.f1073t.mo117d().mo99a(this);
                    zM699a = z3;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                this.f1064k = null;
                this.f1076w = null;
                this.f1072s = null;
                this.f1073t.mo117d().mo99a(this);
                throw th;
            }
        }
        return zM699a;
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: b */
    protected final long mo738b(InterfaceC0276c interfaceC0276c) {
        long jIncrementAndGet = this.f1066m.incrementAndGet() - 1;
        if (!this.f1060g) {
            jIncrementAndGet %= 32000;
        }
        ((InterfaceC0051b) interfaceC0276c).mo209a(jIncrementAndGet);
        return jIncrementAndGet;
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: o */
    protected final Long mo754o() throws IOException {
        while (m924a(this.f1068o, this.f1069p, 0, 4) >= 4) {
            if (this.f1069p[0] != -123) {
                if (m924a(this.f1068o, this.f1069p, 4, 32) < 32) {
                    return null;
                }
                if (f1059f.mo4536b()) {
                    f1059f.mo4532a("New data read: ".concat(String.valueOf(this)));
                    f1059f.mo4532a(C0284e.m949a(this.f1069p, 4, 32));
                }
                while (true) {
                    if (this.f1069p[0] == 0 && this.f1069p[4] == -2 && this.f1069p[5] == 83 && this.f1069p[6] == 77 && this.f1069p[7] == 66) {
                        this.f1060g = true;
                        if (m924a(this.f1068o, this.f1069p, 36, 32) >= 32) {
                            return Long.valueOf(C0282c.m946b(this.f1069p));
                        }
                        return null;
                    }
                    if (this.f1069p[0] != 0 || this.f1069p[1] != 0 || this.f1069p[4] != -1 || this.f1069p[5] != 83 || this.f1069p[6] != 77 || this.f1069p[7] != 66) {
                        for (int i = 0; i < 35; i++) {
                            f1059f.mo4540d("Possibly out of phase, trying to resync " + C0284e.m949a(this.f1069p, 0, 16));
                            byte[] bArr = this.f1069p;
                            bArr[i] = bArr[i + 1];
                        }
                        int i2 = this.f1068o.read();
                        if (i2 == -1) {
                            return null;
                        }
                        this.f1069p[35] = (byte) i2;
                    } else {
                        return Long.valueOf(((long) C0282c.m944a(this.f1069p, 34)) & 65535);
                    }
                }
            }
        }
        return null;
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: c */
    protected final void mo742c(InterfaceC0276c interfaceC0276c) {
        InterfaceC0051b interfaceC0051b = (InterfaceC0051b) interfaceC0276c;
        byte[] bArrMo106a = this.f1073t.mo116c().mo106a();
        try {
            synchronized (this.f1242d) {
                int iMo213b = interfaceC0051b.mo213b(bArrMo106a, 4);
                C0282c.m940a(65535 & iMo213b, bArrMo106a);
                if (f1059f.mo4536b()) {
                    InterfaceC0051b interfaceC0051bM249q = interfaceC0051b;
                    do {
                        f1059f.mo4532a(interfaceC0051bM249q.toString());
                        if (!(interfaceC0051bM249q instanceof AbstractC0068a)) {
                            break;
                        } else {
                            interfaceC0051bM249q = ((AbstractC0068a) interfaceC0051bM249q).m249q();
                        }
                    } while (interfaceC0051bM249q != null);
                    f1059f.mo4532a(C0284e.m949a(bArrMo106a, 4, iMo213b));
                }
                this.f1067n.write(bArrMo106a, 0, iMo213b + 4);
                this.f1067n.flush();
            }
        } finally {
            this.f1073t.mo116c().mo105a(bArrMo106a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0250, code lost:
    
        if (r4.mo328D() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0252, code lost:
    
        r2 = r2 + r4.mo373t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0257, code lost:
    
        r4 = r5.mo251s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025b, code lost:
    
        if (r4 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0260, code lost:
    
        p000a.p029g.C0229as.f1059f.mo4540d("Server " + r16 + " took away all our credits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0282, code lost:
    
        if (r5.mo222a_() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028a, code lost:
    
        if (p000a.p029g.C0229as.f1059f.mo4536b() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028c, code lost:
    
        p000a.p029g.C0229as.f1059f.mo4532a("Adding credits ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029b, code lost:
    
        r16.f1077x.release(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0421, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        if (p000a.p029g.C0229as.f1059f.mo4539c() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        p000a.p029g.C0229as.f1059f.mo4534b("Breaking on error ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0191, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0192, code lost:
    
        if (r5 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0198, code lost:
    
        if (r5.mo222a_() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019a, code lost:
    
        p000a.p029g.C0229as.f1059f.mo4532a("Async");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
    
        if (mo743d() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ab, code lost:
    
        if (r5.mo222a_() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b5, code lost:
    
        if (r5.mo218f_().mo245m_() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bf, code lost:
    
        if (r5.mo218f_().mo339P() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c1, code lost:
    
        if (r2 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        if (r16.f1077x.availablePermits() > 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cd, code lost:
    
        if (r3 <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        p000a.p029g.C0229as.f1059f.mo4534b("Server " + r16 + " returned zero credits for " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f3, code lost:
    
        if (r18.mo328D() != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0200, code lost:
    
        throw new java.io.IOException("No response", r18.mo338O());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0248, code lost:
    
        r4 = r5.mo218f_();
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x017a A[EDGE_INSN: B:192:0x017a->B:54:0x017a BREAK  A[LOOP:0: B:15:0x003e->B:201:0x003e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159 A[Catch: all -> 0x0367, TryCatch #3 {all -> 0x0367, blocks: (B:49:0x014d, B:51:0x0159, B:52:0x0168, B:54:0x017a, B:56:0x0182, B:113:0x02a6), top: B:186:0x014d }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends p000a.p006d.InterfaceC0067d> T m719b(p000a.p006d.InterfaceC0055c r17, T r18, java.util.Set<p000a.p029g.EnumC0261u> r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0229as.m719b(a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: a */
    protected final <T extends InterfaceC0278e> boolean mo735a(InterfaceC0276c interfaceC0276c, T t) {
        if (!this.f1060g) {
            return false;
        }
        AbstractC0141c abstractC0141c = (AbstractC0141c) interfaceC0276c;
        AbstractC0146d abstractC0146d = (AbstractC0146d) t;
        synchronized (abstractC0146d) {
            if (!abstractC0146d.m447m_() || abstractC0146d.m472o() || abstractC0146d.m425A() != 259 || abstractC0146d.m450u() == 0) {
                return false;
            }
            abstractC0146d.m473p();
            boolean z = abstractC0141c.m447m_() ? false : true;
            abstractC0141c.m441c(abstractC0146d.m450u());
            if (abstractC0146d.mo342S() != null) {
                abstractC0146d.mo352a(Long.valueOf(System.currentTimeMillis() + ((long) mo725a(interfaceC0276c))));
            }
            if (f1059f.mo4539c()) {
                f1059f.mo4534b("Have intermediate reply ".concat(String.valueOf(t)));
            }
            if (z) {
                int iV = abstractC0146d.m451v();
                if (f1059f.mo4539c()) {
                    f1059f.mo4534b("Credit from intermediate ".concat(String.valueOf(iV)));
                }
                this.f1077x.release(iV);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m722d(InterfaceC0276c interfaceC0276c) throws IOException {
        try {
            mo742c(interfaceC0276c);
        } catch (IOException e) {
            f1059f.mo4541d("send failed", e);
            try {
                m933t();
            } catch (IOException e2) {
                e.addSuppressed(e2);
                f1059f.mo4544e("disconnect failed", e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo731a(p000a.p031i.p032a.InterfaceC0278e r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0229as.mo731a(a.i.a.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x0012, B:12:0x0037, B:14:0x003b, B:16:0x0045, B:18:0x0052, B:20:0x005f, B:21:0x0078, B:32:0x00a0, B:9:0x0033, B:26:0x007d, B:28:0x0088, B:30:0x0092, B:8:0x0020), top: B:34:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x0012, B:12:0x0037, B:14:0x003b, B:16:0x0045, B:18:0x0052, B:20:0x005f, B:21:0x0078, B:32:0x00a0, B:9:0x0033, B:26:0x007d, B:28:0x0088, B:30:0x0092, B:8:0x0020), top: B:34:0x0006 }] */
    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo732a(java.lang.Long r10) {
        /*
            r9 = this;
            r8 = 65535(0xffff, float:9.1834E-41)
            java.lang.Object r1 = r9.f1241c
            monitor-enter(r1)
            byte[] r0 = r9.f1069p     // Catch: java.lang.Throwable -> L7a
            short r0 = p000a.p031i.C0282c.m943a(r0)     // Catch: java.lang.Throwable -> L7a
            r2 = r0 & r8
            r0 = 33
            if (r2 < r0) goto L20
            int r0 = r2 + 4
            a.c r3 = r9.f1073t     // Catch: java.lang.Throwable -> L7a
            a.h r3 = r3.mo114a()     // Catch: java.lang.Throwable -> L7a
            int r3 = r3.mo71p()     // Catch: java.lang.Throwable -> L7a
            if (r0 <= r3) goto L35
        L20:
            org.c.b r0 = p000a.p029g.C0229as.f1059f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "Flusing stream input"
            r0.mo4540d(r2)     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r0 = r9.f1068o     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r2 = r9.f1068o     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.available()     // Catch: java.lang.Throwable -> L7a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L7a
            r0.skip(r2)     // Catch: java.lang.Throwable -> L7a
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
        L34:
            return
        L35:
            if (r10 == 0) goto L9e
            boolean r0 = r9.f1060g     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L7d
            long r4 = r10.longValue()     // Catch: java.lang.Throwable -> L7a
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L9e
            byte[] r0 = r9.f1069p     // Catch: java.lang.Throwable -> L7a
            r3 = 16
            short r0 = p000a.p031i.C0282c.m944a(r0, r3)     // Catch: java.lang.Throwable -> L7a
            r0 = r0 & r8
            r3 = 18
            if (r0 != r3) goto L9e
            a.d.e.e.a r0 = new a.d.e.e.a     // Catch: java.lang.Throwable -> L7a
            a.c r3 = r9.f1073t     // Catch: java.lang.Throwable -> L7a
            a.h r3 = r3.mo114a()     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7a
        L5d:
            if (r0 == 0) goto La0
            org.c.b r2 = p000a.p029g.C0229as.f1059f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Parsing notification"
            r2.mo4534b(r3)     // Catch: java.lang.Throwable -> L7a
            r9.mo731a(r0)     // Catch: java.lang.Throwable -> L7a
            org.c.b r2 = p000a.p029g.C0229as.f1059f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Received notification "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L7a
            r2.mo4537c(r0)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            goto L34
        L7a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            throw r0
        L7d:
            long r4 = r10.longValue()     // Catch: java.lang.Throwable -> L7a
            r6 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L9e
            byte[] r0 = r9.f1069p     // Catch: java.lang.Throwable -> L7a
            r3 = 8
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L7a
            r3 = 36
            if (r0 != r3) goto L9e
            a.d.d.a.f r0 = new a.d.d.a.f     // Catch: java.lang.Throwable -> L7a
            a.c r3 = r9.f1073t     // Catch: java.lang.Throwable -> L7a
            a.h r3 = r3.mo114a()     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7a
            goto L5d
        L9e:
            r0 = 0
            goto L5d
        La0:
            org.c.b r0 = p000a.p029g.C0229as.f1059f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Skipping message "
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L7a
            r0.mo4540d(r3)     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r0 = r9.f1068o     // Catch: java.lang.Throwable -> L7a
            int r2 = r2 + (-32)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L7a
            r0.skip(r2)     // Catch: java.lang.Throwable -> L7a
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0229as.mo732a(java.lang.Long):void");
    }

    /* JADX INFO: renamed from: a */
    private boolean m717a(AbstractC0103c abstractC0103c, AbstractC0103c abstractC0103c2) throws Throwable {
        boolean z = false;
        if (abstractC0103c2.mo379z() == 196610) {
            abstractC0103c2.m365g(-1073741225);
        } else {
            abstractC0103c2.m365g(C0214ad.m613b(abstractC0103c2.mo379z()));
        }
        switch (abstractC0103c2.mo379z()) {
            case -2147483643:
            case -1073741802:
                break;
            case -1073741790:
            case -1073741718:
            case -1073741715:
            case -1073741714:
            case -1073741713:
            case -1073741712:
            case -1073741711:
            case -1073741710:
            case -1073741428:
            case -1073741260:
                throw new C0212ab(abstractC0103c2.mo379z());
            case -1073741662:
            case -1073741225:
                m714a(abstractC0103c2, abstractC0103c.mo368l(), abstractC0103c);
                break;
            case -1073741637:
                throw new C0240bc();
            case 0:
                z = true;
                break;
            default:
                if (f1059f.mo4539c()) {
                    f1059f.mo4534b("Error code: 0x" + C0284e.m947a(abstractC0103c2.mo379z(), 8) + " for " + abstractC0103c.getClass().getSimpleName());
                }
                throw new C0214ad(abstractC0103c2.mo379z());
        }
        if (abstractC0103c2.mo337N()) {
            throw new C0214ad("Signature verification failed.");
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m718a(p000a.p006d.p016e.AbstractC0134b r5, p000a.p031i.p032a.InterfaceC0278e r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0229as.m718a(a.d.e.b, a.i.a.e):boolean");
    }

    /* JADX INFO: renamed from: a */
    private void m714a(InterfaceC0278e interfaceC0278e, String str, InterfaceC0172f interfaceC0172f) throws Throwable {
        InterfaceC0287k interfaceC0287kMo729a = null;
        if (!this.f1073t.mo114a().mo59d()) {
            try {
                interfaceC0287kMo729a = mo729a(this.f1073t, str, interfaceC0172f.mo371o_(), interfaceC0172f.mo369n(), 1);
            } catch (C0044d e) {
                throw new C0214ad("Failed to get DFS referral", e);
            }
        }
        if (interfaceC0287kMo729a == null) {
            if (f1059f.mo4539c()) {
                f1059f.mo4534b("Error code: 0x" + C0284e.m947a(interfaceC0278e.mo379z(), 8));
            }
            throw new C0214ad(interfaceC0278e.mo379z());
        }
        if (interfaceC0172f.mo369n() != null && this.f1073t.mo114a().mo60e() && (interfaceC0287kMo729a instanceof C0046a)) {
            ((C0046a) interfaceC0287kMo729a).m186d(interfaceC0172f.mo369n());
        }
        if (f1059f.mo4539c()) {
            f1059f.mo4534b("Got referral ".concat(String.valueOf(interfaceC0287kMo729a)));
        }
        this.f1073t.mo118e().mo859a(this.f1073t, str, interfaceC0287kMo729a);
        throw new C0244d(interfaceC0287kMo729a);
    }

    /* JADX INFO: renamed from: a */
    final <T extends InterfaceC0067d> T m726a(InterfaceC0055c interfaceC0055c, T t) {
        return (T) m727a(interfaceC0055c, (InterfaceC0067d) t, Collections.emptySet());
    }

    /* JADX INFO: renamed from: a */
    final <T extends InterfaceC0067d> T m727a(InterfaceC0055c interfaceC0055c, T t, Set<EnumC0261u> set) throws C0214ad {
        T t2;
        mo752m();
        if (this.f1060g && !(interfaceC0055c instanceof AbstractC0134b)) {
            throw new C0214ad("Not an SMB2 request " + interfaceC0055c.getClass().getName());
        }
        if (!this.f1060g && !(interfaceC0055c instanceof AbstractC0103c)) {
            throw new C0214ad("Not an SMB1 request");
        }
        this.f1075v.mo273a(interfaceC0055c);
        if (t != null) {
            interfaceC0055c.mo210a(t);
            t.mo211a(interfaceC0055c.mo207a());
        }
        try {
            if (f1059f.mo4536b()) {
                f1059f.mo4532a("Sending ".concat(String.valueOf(interfaceC0055c)));
            }
            if (interfaceC0055c.mo332I()) {
                m722d(interfaceC0055c);
                return null;
            }
            if (interfaceC0055c instanceof AbstractC0104a) {
                t2 = (T) m713a(interfaceC0055c, t, set);
            } else {
                if (t != null) {
                    t.mo208a(interfaceC0055c.mo216c());
                }
                t2 = (T) m719b(interfaceC0055c, t, set);
            }
            if (f1059f.mo4536b()) {
                f1059f.mo4532a("Response is ".concat(String.valueOf(t2)));
            }
            m716a(interfaceC0055c);
            return t2;
        } catch (C0214ad e) {
            throw e;
        } catch (IOException e2) {
            throw new C0214ad(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0067d> boolean m716a(InterfaceC0055c interfaceC0055c) {
        for (InterfaceC0055c interfaceC0055cMo251s = interfaceC0055c; interfaceC0055cMo251s != null; interfaceC0055cMo251s = interfaceC0055cMo251s.mo251s()) {
            if (this.f1060g) {
                if (!m718a((AbstractC0134b) interfaceC0055cMo251s, interfaceC0055cMo251s.mo218f_())) {
                    return false;
                }
            } else if (!m717a((AbstractC0103c) interfaceC0055cMo251s, (AbstractC0103c) interfaceC0055cMo251s.mo218f_())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0051b & InterfaceC0278e> T m713a(InterfaceC0055c interfaceC0055c, T t, Set<EnumC0261u> set) {
        long jMo738b;
        t.mo208a(interfaceC0055c.mo216c());
        AbstractC0104a abstractC0104a = (AbstractC0104a) interfaceC0055c;
        AbstractC0108b abstractC0108b = (AbstractC0108b) t;
        abstractC0108b.mo217e_();
        try {
            try {
                abstractC0104a.m385c(this.f1073t.mo116c().mo106a());
                abstractC0104a.nextElement();
                if (abstractC0104a.hasMoreElements()) {
                    C0073c c0073c = new C0073c(this.f1073t.mo114a());
                    super.m928a((InterfaceC0276c) abstractC0104a, c0073c, set);
                    if (c0073c.mo379z() != 0) {
                        m717a((AbstractC0103c) abstractC0104a, (AbstractC0103c) c0073c);
                    }
                    jMo738b = abstractC0104a.nextElement().mo333J();
                } else {
                    jMo738b = mo738b(abstractC0104a);
                }
                try {
                    abstractC0108b.mo329E();
                    long jMo725a = mo725a((InterfaceC0276c) abstractC0104a);
                    if (!set.contains(EnumC0261u.NO_TIMEOUT)) {
                        abstractC0108b.mo352a(Long.valueOf(System.currentTimeMillis() + jMo725a));
                    } else {
                        abstractC0108b.mo352a((Long) null);
                    }
                    abstractC0108b.m397c(this.f1073t.mo116c().mo106a());
                    this.f1243e.put(Long.valueOf(jMo738b), abstractC0108b);
                    while (true) {
                        m722d(abstractC0104a);
                        if (!abstractC0104a.hasMoreElements()) {
                            break;
                        }
                        abstractC0104a.nextElement();
                    }
                    synchronized (abstractC0108b) {
                        while (true) {
                            if (!abstractC0108b.mo328D() || abstractC0108b.hasMoreElements()) {
                                if (!set.contains(EnumC0261u.NO_TIMEOUT)) {
                                    abstractC0108b.wait(jMo725a);
                                    jMo725a = abstractC0108b.mo342S().longValue() - System.currentTimeMillis();
                                    if (jMo725a <= 0) {
                                        throw new C0280g(this + " timedout waiting for response to " + abstractC0104a);
                                    }
                                } else {
                                    abstractC0108b.wait();
                                    if (f1059f.mo4536b()) {
                                        f1059f.mo4532a("Wait returned " + mo743d());
                                    }
                                    if (mo743d()) {
                                        throw new EOFException("Transport closed while waiting for result");
                                    }
                                }
                            }
                        }
                    }
                    if (!abstractC0108b.mo328D()) {
                        throw new C0280g("Failed to read response");
                    }
                    if (abstractC0108b.mo379z() != 0) {
                        m717a((AbstractC0103c) abstractC0104a, (AbstractC0103c) abstractC0108b);
                    }
                    return t;
                } finally {
                    this.f1243e.remove(Long.valueOf(jMo738b));
                }
            } catch (InterruptedException e) {
                throw new C0280g(e);
            }
        } finally {
            this.f1073t.mo116c().mo105a(abstractC0104a.m380W());
            this.f1073t.mo116c().mo105a(abstractC0108b.m390X());
        }
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    public String toString() {
        return super.toString() + "[" + this.f1063j + ":" + this.f1065l + ",state=" + this.f1239a + ",signingEnforced=" + this.f1074u + ",usage=" + m932s() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    @Override // p000a.p029g.InterfaceC0230at
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.InterfaceC0287k mo729a(p000a.InterfaceC0016c r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0229as.mo729a(a.c, java.lang.String, java.lang.String, java.lang.String, int):a.k");
    }

    /* JADX INFO: renamed from: p */
    final byte[] m755p() {
        return this.f1079z;
    }

    /* JADX INFO: renamed from: a */
    private void m715a(byte[] bArr) {
        synchronized (this.f1079z) {
            this.f1079z = m737a(bArr, bArr.length, this.f1079z);
        }
    }

    /* JADX INFO: renamed from: a */
    final byte[] m737a(byte[] bArr, int i, byte[] bArr2) throws C0240bc {
        if (!this.f1060g || this.f1075v == null) {
            throw new C0240bc();
        }
        C0162f c0162f = (C0162f) this.f1075v;
        if (!c0162f.mo279e().m961a(EnumC0289m.SMB311)) {
            throw new C0240bc();
        }
        switch (c0162f.m497U()) {
            case 1:
                MessageDigest messageDigestM938c = C0281b.m938c();
                if (bArr2 != null) {
                    messageDigestM938c.update(bArr2);
                }
                messageDigestM938c.update(bArr, 0, i);
                return messageDigestM938c.digest();
            default:
                throw new C0240bc();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m724a(C0162f c0162f) {
        if (!this.f1074u && (c0162f == null || !c0162f.mo280g())) {
            return 1;
        }
        return 3;
    }

    @Override // p000a.p031i.p032a.AbstractRunnableC0279f
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ AbstractRunnableC0279f mo756q() {
        return (C0229as) super.mo756q();
    }
}
