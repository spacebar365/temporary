package a.g;

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

/* JADX INFO: compiled from: SmbTransportImpl.java */
/* JADX INFO: loaded from: classes.dex */
class as extends a.i.a.f implements at {
    private static org.c.b f = org.c.c.a((Class<?>) as.class);
    private InetAddress h;
    private int i;
    private a.a j;
    private Socket k;
    private int l;
    private OutputStream n;
    private InputStream o;
    private long q;
    private final a.c t;
    private final boolean u;
    private a.d.l v;
    private a.d.h w;
    private boolean g = false;
    private final AtomicLong m = new AtomicLong();
    private final byte[] p = new byte[1024];
    private final List<aq> r = new LinkedList();
    private String s = null;
    private final Semaphore x = new Semaphore(1, true);
    private final int y = 512;
    private byte[] z = new byte[64];

    @Override // a.g.at
    public final /* synthetic */ a.ac b(a.c cVar, String str, String str2) {
        return a(cVar, str, str2);
    }

    as(a.c cVar, a.a aVar, int i, InetAddress inetAddress, int i2, boolean z) {
        this.t = cVar;
        this.u = z || this.t.a().U();
        this.q = System.currentTimeMillis() + ((long) cVar.a().t());
        this.j = aVar;
        this.l = i;
        this.h = inetAddress;
        this.i = i2;
    }

    @Override // a.i.a.f
    protected final int a(a.i.a.c cVar) {
        Integer numI;
        if ((cVar instanceof a.d.c) && (numI = ((a.d.c) cVar).i()) != null) {
            return numI.intValue();
        }
        return this.t.a().u();
    }

    public final a.a b() {
        return this.j;
    }

    @Override // a.ad
    public final String a() {
        return this.s;
    }

    public final int c() {
        return this.r.size();
    }

    @Override // a.i.a.f
    public final boolean d() {
        Socket socket = this.k;
        return super.d() || socket == null || socket.isClosed();
    }

    @Override // a.i.a.f
    public final boolean e() {
        Socket socket = this.k;
        return super.e() || socket == null || socket.isClosed();
    }

    public final boolean a(int i) {
        return f().c(i);
    }

    final a.d.l f() throws ad {
        try {
            if (this.v == null) {
                a(this.t.a().u());
            }
            a.d.l lVar = this.v;
            if (lVar == null) {
                throw new ad("Connection did not complete, failed to get negotiation response");
            }
            return lVar;
        } catch (IOException e) {
            throw new ad(e.getMessage(), e);
        }
    }

    public final boolean g() {
        return this.g || (f() instanceof a.d.e.f.f);
    }

    public final void a(a.d.h hVar) {
        this.w = hVar;
    }

    public final a.d.h h() {
        return this.w;
    }

    public final a.c i() {
        return this.t;
    }

    public final as j() {
        return (as) super.q();
    }

    @Override // a.g.at
    public final boolean k() throws ad {
        if (this.u) {
            return false;
        }
        a.d.l lVarF = f();
        return lVarF.j_() && !lVarF.g();
    }

    public final boolean l() {
        if (this.u) {
            return true;
        }
        return f().g();
    }

    @Override // a.ad
    public final <T extends a.ad> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    public final synchronized aq a(a.c cVar, String str, String str2) {
        aq aqVar;
        if (f.b()) {
            f.a("Currently " + this.r.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator<aq> listIterator = this.r.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                aq next = listIterator.next();
                if (next.a(cVar, str, str2)) {
                    if (f.b()) {
                        f.a("Reusing existing session ".concat(String.valueOf(next)));
                    }
                    aqVar = next.e();
                } else if (f.b()) {
                    f.a("Existing session " + next + " does not match " + cVar.g());
                }
            } else {
                if (cVar.a().t() > 0) {
                    long j = this.q;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j < jCurrentTimeMillis) {
                        this.q = ((long) cVar.a().t()) + jCurrentTimeMillis;
                        ListIterator<aq> listIterator2 = this.r.listIterator();
                        while (listIterator2.hasNext()) {
                            aq next2 = listIterator2.next();
                            if (next2.i() != null && next2.i().longValue() < jCurrentTimeMillis && !next2.d()) {
                                if (f.c()) {
                                    f.b("Closing session after timeout ".concat(String.valueOf(next2)));
                                }
                                next2.a(false, false);
                            }
                        }
                    }
                }
                aqVar = new aq(cVar, str, str2, this);
                if (f.c()) {
                    f.b("Establishing new session " + aqVar + " on " + this.b);
                }
                this.r.add(aqVar);
            }
        }
        return aqVar;
    }

    final boolean a(a.a aVar, int i, InetAddress inetAddress, int i2, String str) {
        if (this.a == 5 || this.a == 6) {
            return false;
        }
        if (str == null) {
            str = aVar.a();
        }
        if ((this.s != null && !str.equalsIgnoreCase(this.s)) || !aVar.equals(this.j)) {
            return false;
        }
        if (i == 0 || i == this.l || (i == 445 && this.l == 139)) {
            return (inetAddress == this.h || (inetAddress != null && inetAddress.equals(this.h))) && i2 == this.i;
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
    private a.d.j b(int r11) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.as.b(int):a.d.j");
    }

    private int a(a.d.c cVar, boolean z) throws IOException {
        if (z) {
            b(cVar);
        } else {
            cVar.a(0L);
            this.m.set(1L);
        }
        int iB = cVar.b(this.p, 4);
        a.i.c.a(65535 & iB, this.p);
        if (f.b()) {
            f.a(cVar.toString());
            f.a(a.i.e.a(this.p, 4, iB));
        }
        this.n.write(this.p, 0, iB + 4);
        this.n.flush();
        f.a("Wrote negotiate request");
        return iB;
    }

    private void u() throws IOException {
        try {
            this.k.setSoTimeout(this.t.a().s());
            if (o() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.k.setSoTimeout(this.t.a().r());
            int iA = 65535 & a.i.c.a(this.p);
            if (iA < 33 || iA + 4 > this.p.length) {
                throw new IOException("Invalid payload size: ".concat(String.valueOf(iA)));
            }
            int i = this.g ? 64 : 32;
            a(this.o, this.p, i + 4, iA - i);
            f.a("Read negotiate response");
        } catch (Throwable th) {
            this.k.setSoTimeout(this.t.a().r());
            throw th;
        }
    }

    private a.d.j b(a.d.e.f.f fVar) throws Throwable {
        Throwable th;
        byte[] bArr;
        byte[] bArr2;
        a.d.e.f.f fVar2 = null;
        a.d.e.f.e eVar = new a.d.e.f.e(this.t.a(), a(fVar));
        try {
            getClass();
            eVar.g(Math.max(1, 512 - this.x.availablePermits()));
            int iA = a(eVar, fVar != null);
            boolean zA = this.t.a().g().a(a.m.f);
            if (zA) {
                bArr = new byte[iA];
                System.arraycopy(this.p, 4, bArr, 0, iA);
            } else {
                bArr = null;
            }
            u();
            a.d.e.f.f fVarB = eVar.b(this.t);
            try {
                int iA2 = fVarB.a(this.p, 4);
                fVarB.F();
                if (zA) {
                    byte[] bArr3 = new byte[iA2];
                    System.arraycopy(this.p, 4, bArr3, 0, iA2);
                    bArr2 = bArr3;
                } else {
                    bArr2 = null;
                    bArr = null;
                }
                if (f.b()) {
                    f.a(fVarB.toString());
                    f.a(a.i.e.a(this.p, 4, 0));
                }
                a.d.j jVar = new a.d.j(eVar, fVarB, bArr, bArr2);
                int iV = fVarB != null ? fVarB.v() : 0;
                if (iV == 0) {
                    iV = 1;
                }
                this.x.release(iV);
                Arrays.fill(this.p, (byte) 0);
                return jVar;
            } catch (Throwable th2) {
                th = th2;
                fVar2 = fVarB;
                int iV2 = fVar2 != null ? fVar2.v() : 0;
                this.x.release(iV2 != 0 ? iV2 : 1);
                Arrays.fill(this.p, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // a.g.at
    public final boolean m() throws ad {
        try {
            return super.a(this.t.a().u());
        } catch (a.i.a.g e) {
            throw new ad("Failed to connect: " + this.j, e);
        }
    }

    @Override // a.i.a.f
    protected final void n() throws IOException {
        a.d.j jVarB;
        if (f.c()) {
            f.b("Connecting in state " + this.a + " addr " + this.j.b());
        }
        try {
            jVarB = b(this.l);
        } catch (IOException e) {
            if (this.t.a().j()) {
                this.l = (this.l == 0 || this.l == 445) ? 139 : 445;
                this.g = false;
                this.m.set(0L);
                jVarB = b(this.l);
            } else {
                throw e;
            }
        }
        if (jVarB == null || jVarB.b() == null) {
            throw new ad("Failed to connect.");
        }
        if (f.c()) {
            f.b("Negotiation response on " + this.b + " :" + jVarB);
        }
        if (!jVarB.b().a(this.t, jVarB.a())) {
            throw new ad("This client is not compatible with the server.");
        }
        boolean zG = jVarB.b().g();
        boolean zK_ = jVarB.b().k_();
        if (f.c()) {
            f.b("Signature negotiation enforced " + this.u + " (server " + zG + ") enabled " + this.t.a().S() + " (server " + zK_ + ")");
        }
        this.s = this.j.a();
        this.v = jVarB.b();
        if (jVarB.b().e().a(a.m.f)) {
            a(jVarB.c());
            a(jVarB.d());
            if (f.c()) {
                f.b("Preauth hash after negotiate " + a.i.e.a(this.z));
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // a.i.a.f
    protected final synchronized boolean a(boolean z, boolean z2) {
        Exception e;
        boolean zA = false;
        synchronized (this) {
            ListIterator<aq> listIterator = this.r.listIterator();
            long jS = s();
            if ((z2 && jS != 1) || (!z2 && jS > 0)) {
                f.d("Disconnecting transport while still in use " + this + ": " + this.r);
                zA = true;
            }
            if (f.c()) {
                f.b("Disconnecting transport ".concat(String.valueOf(this)));
            }
            try {
                try {
                    if (f.b()) {
                        f.a("Currently " + this.r.size() + " session(s) active for " + this);
                    }
                    boolean z3 = zA;
                    while (listIterator.hasNext()) {
                        try {
                            try {
                                zA = listIterator.next().a(z, false) | z3;
                                z3 = zA;
                            } catch (Exception e2) {
                                f.b("Failed to close session", e2);
                            } finally {
                                listIterator.remove();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            zA = z3;
                            f.b("Exception in disconnect", e);
                            this.k = null;
                            this.w = null;
                            this.s = null;
                            this.t.d().a(this);
                        }
                    }
                    if (this.k != null) {
                        this.k.shutdownOutput();
                        this.n.close();
                        this.o.close();
                        this.k.close();
                        f.a("Socket closed");
                    } else {
                        f.a("Not yet initialized");
                    }
                    this.k = null;
                    this.w = null;
                    this.s = null;
                    this.t.d().a(this);
                    zA = z3;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                this.k = null;
                this.w = null;
                this.s = null;
                this.t.d().a(this);
                throw th;
            }
        }
        return zA;
    }

    @Override // a.i.a.f
    protected final long b(a.i.a.c cVar) {
        long jIncrementAndGet = this.m.incrementAndGet() - 1;
        if (!this.g) {
            jIncrementAndGet %= 32000;
        }
        ((a.d.b) cVar).a(jIncrementAndGet);
        return jIncrementAndGet;
    }

    @Override // a.i.a.f
    protected final Long o() throws IOException {
        while (a(this.o, this.p, 0, 4) >= 4) {
            if (this.p[0] != -123) {
                if (a(this.o, this.p, 4, 32) < 32) {
                    return null;
                }
                if (f.b()) {
                    f.a("New data read: ".concat(String.valueOf(this)));
                    f.a(a.i.e.a(this.p, 4, 32));
                }
                while (true) {
                    if (this.p[0] == 0 && this.p[4] == -2 && this.p[5] == 83 && this.p[6] == 77 && this.p[7] == 66) {
                        this.g = true;
                        if (a(this.o, this.p, 36, 32) >= 32) {
                            return Long.valueOf(a.i.c.b(this.p));
                        }
                        return null;
                    }
                    if (this.p[0] != 0 || this.p[1] != 0 || this.p[4] != -1 || this.p[5] != 83 || this.p[6] != 77 || this.p[7] != 66) {
                        for (int i = 0; i < 35; i++) {
                            f.d("Possibly out of phase, trying to resync " + a.i.e.a(this.p, 0, 16));
                            byte[] bArr = this.p;
                            bArr[i] = bArr[i + 1];
                        }
                        int i2 = this.o.read();
                        if (i2 == -1) {
                            return null;
                        }
                        this.p[35] = (byte) i2;
                    } else {
                        return Long.valueOf(((long) a.i.c.a(this.p, 34)) & 65535);
                    }
                }
            }
        }
        return null;
    }

    @Override // a.i.a.f
    protected final void c(a.i.a.c cVar) {
        a.d.b bVar = (a.d.b) cVar;
        byte[] bArrA = this.t.c().a();
        try {
            synchronized (this.d) {
                int iB = bVar.b(bArrA, 4);
                a.i.c.a(65535 & iB, bArrA);
                if (f.b()) {
                    a.d.b bVarQ = bVar;
                    do {
                        f.a(bVarQ.toString());
                        if (!(bVarQ instanceof a.d.d.a)) {
                            break;
                        } else {
                            bVarQ = ((a.d.d.a) bVarQ).q();
                        }
                    } while (bVarQ != null);
                    f.a(a.i.e.a(bArrA, 4, iB));
                }
                this.n.write(bArrA, 0, iB + 4);
                this.n.flush();
            }
        } finally {
            this.t.c().a(bArrA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0250, code lost:
    
        if (r4.D() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0252, code lost:
    
        r2 = r2 + r4.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0257, code lost:
    
        r4 = r5.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025b, code lost:
    
        if (r4 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0260, code lost:
    
        a.g.as.f.d("Server " + r16 + " took away all our credits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0282, code lost:
    
        if (r5.a_() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028a, code lost:
    
        if (a.g.as.f.b() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028c, code lost:
    
        a.g.as.f.a("Adding credits ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029b, code lost:
    
        r16.x.release(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0421, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        if (a.g.as.f.c() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        a.g.as.f.b("Breaking on error ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0191, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0192, code lost:
    
        if (r5 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0198, code lost:
    
        if (r5.a_() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019a, code lost:
    
        a.g.as.f.a("Async");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
    
        if (d() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ab, code lost:
    
        if (r5.a_() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b5, code lost:
    
        if (r5.f_().m_() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bf, code lost:
    
        if (r5.f_().P() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c1, code lost:
    
        if (r2 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        if (r16.x.availablePermits() > 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cd, code lost:
    
        if (r3 <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        a.g.as.f.b("Server " + r16 + " returned zero credits for " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f3, code lost:
    
        if (r18.D() != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0200, code lost:
    
        throw new java.io.IOException("No response", r18.O());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0248, code lost:
    
        r4 = r5.f_();
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x017a A[EDGE_INSN: B:192:0x017a->B:54:0x017a BREAK  A[LOOP:0: B:15:0x003e->B:201:0x003e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159 A[Catch: all -> 0x0367, TryCatch #3 {all -> 0x0367, blocks: (B:49:0x014d, B:51:0x0159, B:52:0x0168, B:54:0x017a, B:56:0x0182, B:113:0x02a6), top: B:186:0x014d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends a.d.d> T b(a.d.c r17, T r18, java.util.Set<a.g.u> r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.as.b(a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    @Override // a.i.a.f
    protected final <T extends a.i.a.e> boolean a(a.i.a.c cVar, T t) {
        if (!this.g) {
            return false;
        }
        a.d.e.c cVar2 = (a.d.e.c) cVar;
        a.d.e.d dVar = (a.d.e.d) t;
        synchronized (dVar) {
            if (!dVar.m_() || dVar.o() || dVar.A() != 259 || dVar.u() == 0) {
                return false;
            }
            dVar.p();
            boolean z = cVar2.m_() ? false : true;
            cVar2.c(dVar.u());
            if (dVar.S() != null) {
                dVar.a(Long.valueOf(System.currentTimeMillis() + ((long) a(cVar))));
            }
            if (f.c()) {
                f.b("Have intermediate reply ".concat(String.valueOf(t)));
            }
            if (z) {
                int iV = dVar.v();
                if (f.c()) {
                    f.b("Credit from intermediate ".concat(String.valueOf(iV)));
                }
                this.x.release(iV);
            }
            return true;
        }
    }

    private void d(a.i.a.c cVar) throws IOException {
        try {
            c(cVar);
        } catch (IOException e) {
            f.d("send failed", e);
            try {
                t();
            } catch (IOException e2) {
                e.addSuppressed(e2);
                f.e("disconnect failed", e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a.i.a.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(a.i.a.e r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.as.a(a.i.a.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x0012, B:12:0x0037, B:14:0x003b, B:16:0x0045, B:18:0x0052, B:20:0x005f, B:21:0x0078, B:32:0x00a0, B:9:0x0033, B:26:0x007d, B:28:0x0088, B:30:0x0092, B:8:0x0020), top: B:34:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x0012, B:12:0x0037, B:14:0x003b, B:16:0x0045, B:18:0x0052, B:20:0x005f, B:21:0x0078, B:32:0x00a0, B:9:0x0033, B:26:0x007d, B:28:0x0088, B:30:0x0092, B:8:0x0020), top: B:34:0x0006 }] */
    @Override // a.i.a.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(java.lang.Long r10) {
        /*
            r9 = this;
            r8 = 65535(0xffff, float:9.1834E-41)
            java.lang.Object r1 = r9.c
            monitor-enter(r1)
            byte[] r0 = r9.p     // Catch: java.lang.Throwable -> L7a
            short r0 = a.i.c.a(r0)     // Catch: java.lang.Throwable -> L7a
            r2 = r0 & r8
            r0 = 33
            if (r2 < r0) goto L20
            int r0 = r2 + 4
            a.c r3 = r9.t     // Catch: java.lang.Throwable -> L7a
            a.h r3 = r3.a()     // Catch: java.lang.Throwable -> L7a
            int r3 = r3.p()     // Catch: java.lang.Throwable -> L7a
            if (r0 <= r3) goto L35
        L20:
            org.c.b r0 = a.g.as.f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "Flusing stream input"
            r0.d(r2)     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r0 = r9.o     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r2 = r9.o     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.available()     // Catch: java.lang.Throwable -> L7a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L7a
            r0.skip(r2)     // Catch: java.lang.Throwable -> L7a
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
        L34:
            return
        L35:
            if (r10 == 0) goto L9e
            boolean r0 = r9.g     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L7d
            long r4 = r10.longValue()     // Catch: java.lang.Throwable -> L7a
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L9e
            byte[] r0 = r9.p     // Catch: java.lang.Throwable -> L7a
            r3 = 16
            short r0 = a.i.c.a(r0, r3)     // Catch: java.lang.Throwable -> L7a
            r0 = r0 & r8
            r3 = 18
            if (r0 != r3) goto L9e
            a.d.e.e.a r0 = new a.d.e.e.a     // Catch: java.lang.Throwable -> L7a
            a.c r3 = r9.t     // Catch: java.lang.Throwable -> L7a
            a.h r3 = r3.a()     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7a
        L5d:
            if (r0 == 0) goto La0
            org.c.b r2 = a.g.as.f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Parsing notification"
            r2.b(r3)     // Catch: java.lang.Throwable -> L7a
            r9.a(r0)     // Catch: java.lang.Throwable -> L7a
            org.c.b r2 = a.g.as.f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Received notification "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L7a
            r2.c(r0)     // Catch: java.lang.Throwable -> L7a
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
            byte[] r0 = r9.p     // Catch: java.lang.Throwable -> L7a
            r3 = 8
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L7a
            r3 = 36
            if (r0 != r3) goto L9e
            a.d.d.a.f r0 = new a.d.d.a.f     // Catch: java.lang.Throwable -> L7a
            a.c r3 = r9.t     // Catch: java.lang.Throwable -> L7a
            a.h r3 = r3.a()     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7a
            goto L5d
        L9e:
            r0 = 0
            goto L5d
        La0:
            org.c.b r0 = a.g.as.f     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Skipping message "
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L7a
            r0.d(r3)     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream r0 = r9.o     // Catch: java.lang.Throwable -> L7a
            int r2 = r2 + (-32)
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L7a
            r0.skip(r2)     // Catch: java.lang.Throwable -> L7a
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.as.a(java.lang.Long):void");
    }

    private boolean a(a.d.d.c cVar, a.d.d.c cVar2) throws Throwable {
        boolean z = false;
        if (cVar2.z() == 196610) {
            cVar2.g(-1073741225);
        } else {
            cVar2.g(ad.b(cVar2.z()));
        }
        switch (cVar2.z()) {
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
                throw new ab(cVar2.z());
            case -1073741662:
            case -1073741225:
                a(cVar2, cVar.l(), cVar);
                break;
            case -1073741637:
                throw new bc();
            case 0:
                z = true;
                break;
            default:
                if (f.c()) {
                    f.b("Error code: 0x" + a.i.e.a(cVar2.z(), 8) + " for " + cVar.getClass().getSimpleName());
                }
                throw new ad(cVar2.z());
        }
        if (cVar2.N()) {
            throw new ad("Signature verification failed.");
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(a.d.e.b r5, a.i.a.e r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.as.a(a.d.e.b, a.i.a.e):boolean");
    }

    private void a(a.i.a.e eVar, String str, a.d.f fVar) throws Throwable {
        a.k kVarA = null;
        if (!this.t.a().d()) {
            try {
                kVarA = a(this.t, str, fVar.o_(), fVar.n(), 1);
            } catch (a.d e) {
                throw new ad("Failed to get DFS referral", e);
            }
        }
        if (kVarA == null) {
            if (f.c()) {
                f.b("Error code: 0x" + a.i.e.a(eVar.z(), 8));
            }
            throw new ad(eVar.z());
        }
        if (fVar.n() != null && this.t.a().e() && (kVarA instanceof a.d.a.a)) {
            ((a.d.a.a) kVarA).d(fVar.n());
        }
        if (f.c()) {
            f.b("Got referral ".concat(String.valueOf(kVarA)));
        }
        this.t.e().a(this.t, str, kVarA);
        throw new d(kVarA);
    }

    final <T extends a.d.d> T a(a.d.c cVar, T t) {
        return (T) a(cVar, (a.d.d) t, Collections.emptySet());
    }

    final <T extends a.d.d> T a(a.d.c cVar, T t, Set<u> set) throws ad {
        T t2;
        m();
        if (this.g && !(cVar instanceof a.d.e.b)) {
            throw new ad("Not an SMB2 request " + cVar.getClass().getName());
        }
        if (!this.g && !(cVar instanceof a.d.d.c)) {
            throw new ad("Not an SMB1 request");
        }
        this.v.a(cVar);
        if (t != null) {
            cVar.a(t);
            t.a(cVar.a());
        }
        try {
            if (f.b()) {
                f.a("Sending ".concat(String.valueOf(cVar)));
            }
            if (cVar.I()) {
                d(cVar);
                return null;
            }
            if (cVar instanceof a.d.d.c.a) {
                t2 = (T) a(cVar, t, set);
            } else {
                if (t != null) {
                    t.a(cVar.c());
                }
                t2 = (T) b(cVar, t, set);
            }
            if (f.b()) {
                f.a("Response is ".concat(String.valueOf(t2)));
            }
            a(cVar);
            return t2;
        } catch (ad e) {
            throw e;
        } catch (IOException e2) {
            throw new ad(e2.getMessage(), e2);
        }
    }

    private <T extends a.d.d> boolean a(a.d.c cVar) {
        for (a.d.c cVarF = cVar; cVarF != null; cVarF = cVarF.f()) {
            if (this.g) {
                if (!a((a.d.e.b) cVarF, cVarF.f_())) {
                    return false;
                }
            } else if (!a((a.d.d.c) cVarF, (a.d.d.c) cVarF.f_())) {
                return false;
            }
        }
        return true;
    }

    private <T extends a.d.b & a.i.a.e> T a(a.d.c cVar, T t, Set<u> set) {
        long jB;
        t.a(cVar.c());
        a.d.d.c.a aVar = (a.d.d.c.a) cVar;
        a.d.d.c.b bVar = (a.d.d.c.b) t;
        bVar.e_();
        try {
            try {
                aVar.c(this.t.c().a());
                aVar.Z();
                if (aVar.hasMoreElements()) {
                    a.d.d.a.c cVar2 = new a.d.d.a.c(this.t.a());
                    super.a((a.i.a.c) aVar, cVar2, set);
                    if (cVar2.z() != 0) {
                        a((a.d.d.c) aVar, (a.d.d.c) cVar2);
                    }
                    jB = aVar.Z().J();
                } else {
                    jB = b(aVar);
                }
                try {
                    bVar.E();
                    long jA = a((a.i.a.c) aVar);
                    if (!set.contains(u.b)) {
                        bVar.a(Long.valueOf(System.currentTimeMillis() + jA));
                    } else {
                        bVar.a((Long) null);
                    }
                    bVar.c(this.t.c().a());
                    this.e.put(Long.valueOf(jB), bVar);
                    while (true) {
                        d(aVar);
                        if (!aVar.hasMoreElements()) {
                            break;
                        }
                        aVar.Z();
                    }
                    synchronized (bVar) {
                        while (true) {
                            if (!bVar.D() || bVar.hasMoreElements()) {
                                if (!set.contains(u.b)) {
                                    bVar.wait(jA);
                                    jA = bVar.S().longValue() - System.currentTimeMillis();
                                    if (jA <= 0) {
                                        throw new a.i.a.g(this + " timedout waiting for response to " + aVar);
                                    }
                                } else {
                                    bVar.wait();
                                    if (f.b()) {
                                        f.a("Wait returned " + d());
                                    }
                                    if (d()) {
                                        throw new EOFException("Transport closed while waiting for result");
                                    }
                                }
                            }
                        }
                    }
                    if (!bVar.D()) {
                        throw new a.i.a.g("Failed to read response");
                    }
                    if (bVar.z() != 0) {
                        a((a.d.d.c) aVar, (a.d.d.c) bVar);
                    }
                    return t;
                } finally {
                    this.e.remove(Long.valueOf(jB));
                }
            } catch (InterruptedException e) {
                throw new a.i.a.g(e);
            }
        } finally {
            this.t.c().a(aVar.W());
            this.t.c().a(bVar.X());
        }
    }

    @Override // a.i.a.f
    public String toString() {
        return super.toString() + "[" + this.j + ":" + this.l + ",state=" + this.a + ",signingEnforced=" + this.u + ",usage=" + s() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    @Override // a.g.at
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a.k a(a.c r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.as.a(a.c, java.lang.String, java.lang.String, java.lang.String, int):a.k");
    }

    final byte[] p() {
        return this.z;
    }

    private void a(byte[] bArr) {
        synchronized (this.z) {
            this.z = a(bArr, bArr.length, this.z);
        }
    }

    final byte[] a(byte[] bArr, int i, byte[] bArr2) throws bc {
        if (!this.g || this.v == null) {
            throw new bc();
        }
        a.d.e.f.f fVar = (a.d.e.f.f) this.v;
        if (!fVar.e().a(a.m.f)) {
            throw new bc();
        }
        switch (fVar.U()) {
            case 1:
                MessageDigest messageDigestC = a.i.b.c();
                if (bArr2 != null) {
                    messageDigestC.update(bArr2);
                }
                messageDigestC.update(bArr, 0, i);
                return messageDigestC.digest();
            default:
                throw new bc();
        }
    }

    public final int a(a.d.e.f.f fVar) {
        if (!this.u && (fVar == null || !fVar.g())) {
            return 1;
        }
        return 3;
    }

    @Override // a.i.a.f
    public final /* bridge */ /* synthetic */ a.i.a.f q() {
        return (as) super.q();
    }
}
