package a.g;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: SmbSessionImpl.java */
/* JADX INFO: loaded from: classes.dex */
final class aq implements ar {
    private static final org.c.b a = org.c.c.a((Class<?>) aq.class);
    private int c;
    private final as e;
    private long f;
    private a.c h;
    private b i;
    private byte[] j;
    private boolean k;
    private long n;
    private a.d.h o;
    private final String p;
    private final String q;
    private byte[] r;
    private final AtomicInteger b = new AtomicInteger();
    private String g = null;
    private final AtomicLong l = new AtomicLong(1);
    private final AtomicBoolean m = new AtomicBoolean(true);
    private List<ba> d = new ArrayList();

    @Override // a.g.ar
    public final /* synthetic */ a.af b(String str) {
        return a(str);
    }

    aq(a.c cVar, String str, String str2, as asVar) {
        this.h = cVar;
        this.p = str2;
        this.q = str;
        this.e = asVar.j();
        this.i = ((b) cVar.g().a(b.class)).c();
    }

    public final a.h a() {
        return this.h.a();
    }

    public final String b() {
        return this.p;
    }

    public final String c() {
        return this.q;
    }

    public final boolean d() {
        return this.l.get() > 0;
    }

    @Override // a.ac
    public final <T extends a.ac> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    public final aq e() {
        long jIncrementAndGet = this.l.incrementAndGet();
        if (a.b()) {
            a.a("Acquire session " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.m.compareAndSet(false, true)) {
                    a.b("Reacquire transport");
                    this.e.j();
                }
            }
        }
        return this;
    }

    protected final void finalize() {
        if (k() && this.l.get() != 0) {
            a.d("Session was not properly released");
        }
    }

    @Override // a.ac, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void f() {
        long jDecrementAndGet = this.l.decrementAndGet();
        if (a.b()) {
            a.a("Release session " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new a.u("Usage count dropped below zero");
            }
            return;
        }
        if (a.c()) {
            a.b("Usage dropped to zero, release connection " + this.e);
        }
        synchronized (this) {
            if (this.m.compareAndSet(true, false)) {
                this.e.r();
            }
        }
    }

    public final ba a(String str) {
        ba baVar;
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.d) {
            Iterator<ba> it = this.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    ba next = it.next();
                    if (next.a(str, (String) null)) {
                        baVar = next.a(true);
                        break;
                    }
                } else {
                    baVar = new ba(this, str);
                    baVar.a(true);
                    this.d.add(baVar);
                    break;
                }
            }
        }
        return baVar;
    }

    private boolean m() {
        if (n() != null) {
            return false;
        }
        if (this.e.l()) {
            return true;
        }
        return this.e.f().j_();
    }

    private void a(a.d.h hVar) {
        if (this.e.g()) {
            this.o = hVar;
        } else {
            this.e.a(hVar);
        }
    }

    private a.d.h n() {
        return this.o != null ? this.o : this.e.h();
    }

    private <T extends a.d.b> T a(as asVar) throws ad {
        z zVarA;
        long jB;
        ad e;
        a.d.e.f.f fVar = (a.d.e.f.f) asVar.f();
        a.d.e.g.d dVarL = null;
        ad adVar = null;
        byte[] bArrX = fVar.X();
        int i = ((fVar.Y() & 2) != 0 || asVar.l()) ? 2 : 1;
        boolean zB = this.i.b();
        long j = 0;
        boolean zA = fVar.e().a(a.m.f);
        this.r = zA ? asVar.p() : null;
        if (this.r != null && a.c()) {
            a.b("Initial session preauth hash " + a.i.e.a(this.r));
        }
        z zVar = null;
        while (true) {
            if (zVar == null) {
                zVarA = a(asVar, fVar, !zB);
            } else {
                zVarA = zVar;
            }
            bArrX = a(zVarA, bArrX);
            if (bArrX != null) {
                a.d.e.g.c cVar = new a.d.e.g.c(this.e.i(), i, fVar.W(), 0L, bArrX);
                cVar.b(j);
                cVar.R();
                try {
                    dVarL = (a.d.e.g.d) asVar.a((a.d.c) cVar, (a.d.d) null, EnumSet.of(u.d));
                    jB = dVarL.B();
                    e = adVar;
                } catch (ab e2) {
                    throw e2;
                } catch (ad e3) {
                    e = e3;
                    dVarL = cVar.L();
                    if (!dVarL.D() || dVarL.P() || (dVarL.A() != 0 && dVarL.A() != -1073741802)) {
                        throw e;
                    }
                    jB = j;
                }
                if (dVarL.e() && !zB) {
                    throw new ab(-1073741715);
                }
                if ((dVarL.f() & 4) != 0) {
                    throw new bc("Server requires encryption, not yet supported.");
                }
                if (zA) {
                    byte[] bArrX2 = cVar.x();
                    this.r = asVar.a(bArrX2, bArrX2.length, this.r);
                    if (dVarL.A() == -1073741802) {
                        byte[] bArrX3 = dVarL.x();
                        this.r = asVar.a(bArrX3, bArrX3.length, this.r);
                    }
                }
                bArrX = dVarL.g();
            } else {
                jB = j;
                e = adVar;
            }
            if (zVarA.c()) {
                a.b("Context is established");
                this.g = zVarA.e();
                byte[] bArrD = zVarA.d();
                if (bArrD != null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(bArrD, 0, bArr, 0, Math.min(16, bArrD.length));
                    this.j = bArr;
                }
                boolean z = dVarL != null && dVarL.n();
                if (!zB && (m() || z)) {
                    if (zVarA.d() != null && dVarL != null) {
                        if (this.r != null && a.c()) {
                            a.b("Final preauth integrity hash " + a.i.e.a(this.r));
                        }
                        a.d.e.f fVar2 = new a.d.e.f(this.j, fVar.s(), this.r);
                        if (fVar.e().a(a.m.d) || dVarL.n()) {
                            dVarL.a(fVar2);
                            byte[] bArrX4 = dVarL.x();
                            if (!dVarL.b(bArrX4, 0, bArrX4.length)) {
                                throw new ad("Signature validation failed");
                            }
                        }
                        a(fVar2);
                    } else if (asVar.i().a().S()) {
                        throw new ad("Signing enabled but no session key available");
                    }
                } else if (a.c()) {
                    a.b("No digest setup " + zB + " B " + m());
                }
                a(dVarL);
                if (e != null) {
                    throw e;
                }
                if (dVarL != null) {
                    return dVarL.k();
                }
                return null;
            }
            j = jB;
            zVar = zVarA;
            adVar = e;
        }
    }

    private static byte[] a(z zVar, byte[] bArr) {
        return zVar.a(bArr, bArr == null ? 0 : bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends a.d.b> T a(as asVar, a.d.c cVar, Set<u> set) {
        a.d.e.g.d dVarL;
        ad adVar;
        a.d.e.f.f fVar = (a.d.e.f.f) asVar.f();
        byte[] bArrX = fVar.X();
        int iY = fVar.Y();
        boolean zB = this.i.b();
        boolean z = (iY == 0 || zB) ? false : true;
        long j = this.n;
        synchronized (asVar) {
            z zVarA = a(asVar, fVar, z);
            byte[] bArrG = bArrX;
            a.d.e.g.d dVar = null;
            ad adVar2 = null;
            while (true) {
                byte[] bArrA = a(zVarA, bArrG);
                if (bArrA != null) {
                    a.d.e.g.c cVar2 = new a.d.e.g.c(this.e.i(), fVar.Y(), fVar.W(), j, bArrA);
                    if (cVar != 0) {
                        cVar2.a((a.d.e.b) cVar);
                    }
                    cVar2.a(this.o);
                    cVar2.b(j);
                    try {
                        dVarL = (a.d.e.g.d) asVar.a((a.d.c) cVar2, (a.d.d) null, EnumSet.of(u.d));
                    } catch (ab e) {
                        throw e;
                    } catch (ad e2) {
                        dVarL = cVar2.L();
                        if (!dVarL.D()) {
                            throw e2;
                        }
                        if (!dVarL.P()) {
                            if (dVarL.A() != 0 && dVarL.A() != -1073741802) {
                                throw e2;
                            }
                            adVar = e2;
                        } else {
                            throw e2;
                        }
                    }
                    if (dVarL.B() != j) {
                        throw new ab("Server did not reauthenticate after expiration");
                    }
                    adVar = adVar2;
                    if (dVarL.e() && !zB) {
                        throw new ab(-1073741715);
                    }
                    if (cVar2.y() != null) {
                        a.b("Setting digest");
                        a(cVar2.y());
                    }
                    bArrG = dVarL.g();
                } else {
                    bArrG = bArrA;
                    dVarL = dVar;
                    adVar = adVar2;
                }
                if (adVar != null) {
                    throw adVar;
                }
                if (zVarA.c()) {
                    a(dVarL);
                    a.d.d dVarK = dVarL != null ? dVarL.k() : null;
                    if (dVarK == null || !dVarK.D()) {
                        if (cVar != 0) {
                            return this.e.a(cVar, (a.d.d) null, set);
                        }
                        return null;
                    }
                    return dVarK;
                }
                dVar = dVarL;
                adVar2 = adVar;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(a.g.as r15, a.d.d.c r16, a.d.d.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aq.a(a.g.as, a.d.d.c, a.d.d.c):void");
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.h.g() + ",targetHost=" + this.q + ",targetDomain=" + this.p + ",uid=" + this.c + ",connectionState=" + this.b + ",usage=" + this.l.get() + "]";
    }

    private void a(a.d.e.g.d dVar) {
        this.k = true;
        this.b.set(2);
        this.n = dVar.B();
    }

    private void a(a.d.d.a.u uVar) {
        this.k = uVar.B();
        this.b.set(2);
    }

    public final a.c g() {
        return this.e.i();
    }

    public final as h() {
        return this.e.j();
    }

    public final Long i() {
        if (this.f > 0) {
            return Long.valueOf(this.f);
        }
        return null;
    }

    public final b j() {
        return this.i;
    }

    public final boolean k() {
        return !this.e.d() && this.b.get() == 2;
    }

    public final boolean l() {
        return this.e.e();
    }

    protected final boolean a(a.c cVar, String str, String str2) {
        return Objects.equals(this.i, cVar.g()) && Objects.equals(this.q, str) && Objects.equals(this.p, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final <T extends a.d.d> T a(a.d.c r11, T r12, java.util.Set<a.g.u> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aq.a(a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends a.d.b> T a(a.d.c r8, T r9) throws java.lang.Throwable {
        /*
            r7 = this;
            a.g.as r1 = r7.e
            a.g.as r4 = r1.j()
            r3 = 0
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> Lb6
        L8:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.b     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r2, r5)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L45
            java.util.concurrent.atomic.AtomicInteger r1 = r7.b     // Catch: java.lang.Throwable -> L36
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L36
            r2 = 2
            if (r1 == r2) goto L1e
            r2 = 3
            if (r1 != r2) goto L25
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L24
            r4.close()
        L24:
            return r9
        L25:
            a.g.as r1 = r7.e     // Catch: java.lang.InterruptedException -> L2b java.lang.Throwable -> L36
            r1.wait()     // Catch: java.lang.InterruptedException -> L2b java.lang.Throwable -> L36
            goto L8
        L2b:
            r1 = move-exception
            a.g.ad r2 = new a.g.ad     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r1.getMessage()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L36:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> Lb6
        L39:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r1
        L3d:
            if (r4 == 0) goto L44
            if (r3 == 0) goto Lb2
            r4.close()     // Catch: java.lang.Throwable -> Lad
        L44:
            throw r2
        L45:
            r4.m()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            org.c.b r1 = a.g.aq.a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            boolean r1 = r1.c()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            if (r1 == 0) goto L66
            org.c.b r1 = a.g.aq.a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.String r5 = "sessionSetup: "
            r2.<init>(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            a.g.b r5 = r7.i     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r1.b(r2)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
        L66:
            r1 = 0
            r7.c = r1     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            boolean r1 = r4.g()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            if (r1 == 0) goto L7d
            a.d.b r9 = r7.a(r4)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r4.notifyAll()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L24
            r4.close()
            goto L24
        L7d:
            a.d.d.c r8 = (a.d.d.c) r8     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r0 = r9
            a.d.d.c r0 = (a.d.d.c) r0     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r1 = r0
            r7.a(r4, r8, r1)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r4.notifyAll()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L24
            r4.close()
            goto L24
        L90:
            r1 = move-exception
            org.c.b r2 = a.g.aq.a     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "Session setup failed"
            r2.b(r5, r1)     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.atomic.AtomicInteger r2 = r7.b     // Catch: java.lang.Throwable -> La8
            r5 = 1
            r6 = 0
            boolean r2 = r2.compareAndSet(r5, r6)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto La7
            r2 = 1
            r5 = 1
            r7.a(r2, r5)     // Catch: java.lang.Throwable -> La8
        La7:
            throw r1     // Catch: java.lang.Throwable -> La8
        La8:
            r1 = move-exception
            r4.notifyAll()     // Catch: java.lang.Throwable -> L36
            throw r1     // Catch: java.lang.Throwable -> L36
        Lad:
            r1 = move-exception
            r3.addSuppressed(r1)
            goto L44
        Lb2:
            r4.close()
            goto L44
        Lb6:
            r1 = move-exception
            r2 = r1
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aq.a(a.d.c, a.d.b):a.d.b");
    }

    private z a(as asVar, a.d.e.f.f fVar, boolean z) {
        String strB = this.q;
        if (strB == null) {
            strB = asVar.b().b();
            try {
                strB = asVar.b().a();
            } catch (Exception e) {
                a.b("Failed to resolve host name", e);
            }
        }
        if (a.c()) {
            a.b("Remote host is ".concat(String.valueOf(strB)));
        }
        return this.i.a(this.e.i(), strB, fVar.X(), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r6.close();
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00c0: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:49:0x00c0 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean a(boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aq.a(boolean, boolean):boolean");
    }
}
