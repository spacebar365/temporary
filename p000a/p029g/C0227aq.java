package p000a.p029g;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.EnumC0289m;
import p000a.InterfaceC0005ac;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0051b;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0176h;
import p000a.p006d.p010d.p011a.C0091u;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.C0156f;
import p000a.p006d.p016e.p022f.C0162f;
import p000a.p006d.p016e.p023g.C0166c;
import p000a.p006d.p016e.p023g.C0167d;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.g.aq */
/* JADX INFO: compiled from: SmbSessionImpl.java */
/* JADX INFO: loaded from: classes.dex */
final class C0227aq implements InterfaceC0228ar {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1041a = C1620c.m4563a((Class<?>) C0227aq.class);

    /* JADX INFO: renamed from: c */
    private int f1043c;

    /* JADX INFO: renamed from: e */
    private final C0229as f1045e;

    /* JADX INFO: renamed from: f */
    private long f1046f;

    /* JADX INFO: renamed from: h */
    private InterfaceC0016c f1048h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0237b f1049i;

    /* JADX INFO: renamed from: j */
    private byte[] f1050j;

    /* JADX INFO: renamed from: k */
    private boolean f1051k;

    /* JADX INFO: renamed from: n */
    private long f1054n;

    /* JADX INFO: renamed from: o */
    private InterfaceC0176h f1055o;

    /* JADX INFO: renamed from: p */
    private final String f1056p;

    /* JADX INFO: renamed from: q */
    private final String f1057q;

    /* JADX INFO: renamed from: r */
    private byte[] f1058r;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f1042b = new AtomicInteger();

    /* JADX INFO: renamed from: g */
    private String f1047g = null;

    /* JADX INFO: renamed from: l */
    private final AtomicLong f1052l = new AtomicLong(1);

    /* JADX INFO: renamed from: m */
    private final AtomicBoolean f1053m = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d */
    private List<C0238ba> f1044d = new ArrayList();

    C0227aq(InterfaceC0016c interfaceC0016c, String str, String str2, C0229as c0229as) {
        this.f1048h = interfaceC0016c;
        this.f1056p = str2;
        this.f1057q = str;
        this.f1045e = c0229as.m749j();
        this.f1049i = ((InterfaceC0237b) interfaceC0016c.mo109g().mo897a(InterfaceC0237b.class)).mo805c();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0267h m697a() {
        return this.f1048h.mo114a();
    }

    /* JADX INFO: renamed from: b */
    public final String m701b() {
        return this.f1056p;
    }

    /* JADX INFO: renamed from: c */
    public final String m702c() {
        return this.f1057q;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m703d() {
        return this.f1052l.get() > 0;
    }

    @Override // p000a.InterfaceC0005ac
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0005ac> T mo95a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: e */
    public final C0227aq m704e() {
        long jIncrementAndGet = this.f1052l.incrementAndGet();
        if (f1041a.mo4536b()) {
            f1041a.mo4532a("Acquire session " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f1053m.compareAndSet(false, true)) {
                    f1041a.mo4534b("Reacquire transport");
                    this.f1045e.m749j();
                }
            }
        }
        return this;
    }

    protected final void finalize() {
        if (m710k() && this.f1052l.get() != 0) {
            f1041a.mo4540d("Session was not properly released");
        }
    }

    @Override // p000a.InterfaceC0005ac, java.lang.AutoCloseable
    public final void close() {
        m705f();
    }

    /* JADX INFO: renamed from: f */
    public final void m705f() {
        long jDecrementAndGet = this.f1052l.decrementAndGet();
        if (f1041a.mo4536b()) {
            f1041a.mo4532a("Release session " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C0297u("Usage count dropped below zero");
            }
            return;
        }
        if (f1041a.mo4539c()) {
            f1041a.mo4534b("Usage dropped to zero, release connection " + this.f1045e);
        }
        synchronized (this) {
            if (this.f1053m.compareAndSet(true, false)) {
                this.f1045e.m931r();
            }
        }
    }

    @Override // p000a.p029g.InterfaceC0228ar
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0238ba mo700b(String str) {
        C0238ba c0238ba;
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.f1044d) {
            Iterator<C0238ba> it = this.f1044d.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0238ba next = it.next();
                    if (next.m817a(str, (String) null)) {
                        c0238ba = next.m814a(true);
                        break;
                    }
                } else {
                    c0238ba = new C0238ba(this, str);
                    c0238ba.m814a(true);
                    this.f1044d.add(c0238ba);
                    break;
                }
            }
        }
        return c0238ba;
    }

    /* JADX INFO: renamed from: m */
    private boolean m693m() {
        if (m694n() != null) {
            return false;
        }
        if (this.f1045e.m751l()) {
            return true;
        }
        return this.f1045e.m745f().mo285j_();
    }

    /* JADX INFO: renamed from: a */
    private void m690a(InterfaceC0176h interfaceC0176h) {
        if (this.f1045e.m746g()) {
            this.f1055o = interfaceC0176h;
        } else {
            this.f1045e.m730a(interfaceC0176h);
        }
    }

    /* JADX INFO: renamed from: n */
    private InterfaceC0176h m694n() {
        return this.f1055o != null ? this.f1055o : this.f1045e.m747h();
    }

    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0051b> T m685a(C0229as c0229as) throws C0214ad {
        InterfaceC0266z interfaceC0266zM687a;
        long jB;
        C0214ad e;
        C0162f c0162f = (C0162f) c0229as.m745f();
        C0167d c0167dL = null;
        C0214ad c0214ad = null;
        byte[] bArrM500X = c0162f.m500X();
        int i = ((c0162f.m501Y() & 2) != 0 || c0229as.m751l()) ? 2 : 1;
        boolean zB = this.f1049i.mo899b();
        long j = 0;
        boolean zM961a = c0162f.mo279e().m961a(EnumC0289m.SMB311);
        this.f1058r = zM961a ? c0229as.m755p() : null;
        if (this.f1058r != null && f1041a.mo4539c()) {
            f1041a.mo4534b("Initial session preauth hash " + C0284e.m948a(this.f1058r));
        }
        InterfaceC0266z interfaceC0266z = null;
        while (true) {
            if (interfaceC0266z == null) {
                interfaceC0266zM687a = m687a(c0229as, c0162f, !zB);
            } else {
                interfaceC0266zM687a = interfaceC0266z;
            }
            bArrM500X = m692a(interfaceC0266zM687a, bArrM500X);
            if (bArrM500X != null) {
                C0166c c0166c = new C0166c(this.f1045e.m748i(), i, c0162f.m499W(), 0L, bArrM500X);
                c0166c.mo215b(j);
                c0166c.mo341R();
                try {
                    c0167dL = (C0167d) c0229as.m727a((InterfaceC0055c) c0166c, (InterfaceC0067d) null, EnumSet.of(EnumC0261u.RETAIN_PAYLOAD));
                    jB = c0167dL.m426B();
                    e = c0214ad;
                } catch (C0212ab e2) {
                    throw e2;
                } catch (C0214ad e3) {
                    e = e3;
                    c0167dL = c0166c.mo218f_();
                    if (!c0167dL.mo328D() || c0167dL.mo339P() || (c0167dL.m425A() != 0 && c0167dL.m425A() != -1073741802)) {
                        throw e;
                    }
                    jB = j;
                }
                if (c0167dL.m505e() && !zB) {
                    throw new C0212ab(-1073741715);
                }
                if ((c0167dL.m506f() & 4) != 0) {
                    throw new C0240bc("Server requires encryption, not yet supported.");
                }
                if (zM961a) {
                    byte[] bArrX = c0166c.m453x();
                    this.f1058r = c0229as.m737a(bArrX, bArrX.length, this.f1058r);
                    if (c0167dL.m425A() == -1073741802) {
                        byte[] bArrX2 = c0167dL.m453x();
                        this.f1058r = c0229as.m737a(bArrX2, bArrX2.length, this.f1058r);
                    }
                }
                bArrM500X = c0167dL.m507g();
            } else {
                jB = j;
                e = c0214ad;
            }
            if (interfaceC0266zM687a.mo842c()) {
                f1041a.mo4534b("Context is established");
                this.f1047g = interfaceC0266zM687a.mo844e();
                byte[] bArrMo843d = interfaceC0266zM687a.mo843d();
                if (bArrMo843d != null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(bArrMo843d, 0, bArr, 0, Math.min(16, bArrMo843d.length));
                    this.f1050j = bArr;
                }
                boolean z = c0167dL != null && c0167dL.m471n();
                if (!zB && (m693m() || z)) {
                    if (interfaceC0266zM687a.mo843d() != null && c0167dL != null) {
                        if (this.f1058r != null && f1041a.mo4539c()) {
                            f1041a.mo4534b("Final preauth integrity hash " + C0284e.m948a(this.f1058r));
                        }
                        C0156f c0156f = new C0156f(this.f1050j, c0162f.m502s(), this.f1058r);
                        if (c0162f.mo279e().m961a(EnumC0289m.SMB300) || c0167dL.m471n()) {
                            c0167dL.mo211a(c0156f);
                            byte[] bArrX3 = c0167dL.m453x();
                            if (!c0167dL.m470b(bArrX3, 0, bArrX3.length)) {
                                throw new C0214ad("Signature validation failed");
                            }
                        }
                        m690a(c0156f);
                    } else if (c0229as.m748i().mo114a().mo24S()) {
                        throw new C0214ad("Signing enabled but no session key available");
                    }
                } else if (f1041a.mo4539c()) {
                    f1041a.mo4534b("No digest setup " + zB + " B " + m693m());
                }
                m689a(c0167dL);
                if (e != null) {
                    throw e;
                }
                if (c0167dL != null) {
                    return c0167dL.mo244k();
                }
                return null;
            }
            j = jB;
            interfaceC0266z = interfaceC0266zM687a;
            c0214ad = e;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m692a(InterfaceC0266z interfaceC0266z, byte[] bArr) {
        return interfaceC0266z.mo838a(bArr, bArr == null ? 0 : bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0051b> T m686a(C0229as c0229as, InterfaceC0055c interfaceC0055c, Set<EnumC0261u> set) {
        C0167d c0167dL;
        C0214ad c0214ad;
        C0162f c0162f = (C0162f) c0229as.m745f();
        byte[] bArrM500X = c0162f.m500X();
        int iM501Y = c0162f.m501Y();
        boolean zB = this.f1049i.mo899b();
        boolean z = (iM501Y == 0 || zB) ? false : true;
        long j = this.f1054n;
        synchronized (c0229as) {
            InterfaceC0266z interfaceC0266zM687a = m687a(c0229as, c0162f, z);
            byte[] bArrM507g = bArrM500X;
            C0167d c0167d = null;
            C0214ad c0214ad2 = null;
            while (true) {
                byte[] bArrM692a = m692a(interfaceC0266zM687a, bArrM507g);
                if (bArrM692a != null) {
                    C0166c c0166c = new C0166c(this.f1045e.m748i(), c0162f.m501Y(), c0162f.m499W(), j, bArrM692a);
                    if (interfaceC0055c != 0) {
                        c0166c.mo437a((AbstractC0134b) interfaceC0055c);
                    }
                    c0166c.mo211a(this.f1055o);
                    c0166c.mo215b(j);
                    try {
                        c0167dL = (C0167d) c0229as.m727a((InterfaceC0055c) c0166c, (InterfaceC0067d) null, EnumSet.of(EnumC0261u.RETAIN_PAYLOAD));
                    } catch (C0212ab e) {
                        throw e;
                    } catch (C0214ad e2) {
                        c0167dL = c0166c.mo218f_();
                        if (!c0167dL.mo328D()) {
                            throw e2;
                        }
                        if (!c0167dL.mo339P()) {
                            if (c0167dL.m425A() != 0 && c0167dL.m425A() != -1073741802) {
                                throw e2;
                            }
                            c0214ad = e2;
                        } else {
                            throw e2;
                        }
                    }
                    if (c0167dL.m426B() != j) {
                        throw new C0212ab("Server did not reauthenticate after expiration");
                    }
                    c0214ad = c0214ad2;
                    if (c0167dL.m505e() && !zB) {
                        throw new C0212ab(-1073741715);
                    }
                    if (c0166c.m454y() != null) {
                        f1041a.mo4534b("Setting digest");
                        m690a(c0166c.m454y());
                    }
                    bArrM507g = c0167dL.m507g();
                } else {
                    bArrM507g = bArrM692a;
                    c0167dL = c0167d;
                    c0214ad = c0214ad2;
                }
                if (c0214ad != null) {
                    throw c0214ad;
                }
                if (interfaceC0266zM687a.mo842c()) {
                    m689a(c0167dL);
                    InterfaceC0067d interfaceC0067dK = c0167dL != null ? c0167dL.mo244k() : null;
                    if (interfaceC0067dK == null || !interfaceC0067dK.mo328D()) {
                        if (interfaceC0055c != 0) {
                            return this.f1045e.m727a(interfaceC0055c, (InterfaceC0067d) null, set);
                        }
                        return null;
                    }
                    return interfaceC0067dK;
                }
                c0167d = c0167dL;
                c0214ad2 = c0214ad;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m691a(p000a.p029g.C0229as r15, p000a.p006d.p010d.AbstractC0103c r16, p000a.p006d.p010d.AbstractC0103c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0227aq.m691a(a.g.as, a.d.d.c, a.d.d.c):void");
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.f1048h.mo109g() + ",targetHost=" + this.f1057q + ",targetDomain=" + this.f1056p + ",uid=" + this.f1043c + ",connectionState=" + this.f1042b + ",usage=" + this.f1052l.get() + "]";
    }

    /* JADX INFO: renamed from: a */
    private void m689a(C0167d c0167d) {
        this.f1051k = true;
        this.f1042b.set(2);
        this.f1054n = c0167d.m426B();
    }

    /* JADX INFO: renamed from: a */
    private void m688a(C0091u c0091u) {
        this.f1051k = c0091u.m326B();
        this.f1042b.set(2);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0016c m706g() {
        return this.f1045e.m748i();
    }

    /* JADX INFO: renamed from: h */
    public final C0229as m707h() {
        return this.f1045e.m749j();
    }

    /* JADX INFO: renamed from: i */
    public final Long m708i() {
        if (this.f1046f > 0) {
            return Long.valueOf(this.f1046f);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0237b m709j() {
        return this.f1049i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m710k() {
        return !this.f1045e.mo743d() && this.f1042b.get() == 2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m711l() {
        return this.f1045e.mo744e();
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m698a(InterfaceC0016c interfaceC0016c, String str, String str2) {
        return Objects.equals(this.f1049i, interfaceC0016c.mo109g()) && Objects.equals(this.f1057q, str) && Objects.equals(this.f1056p, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final <T extends p000a.p006d.InterfaceC0067d> T m695a(p000a.p006d.InterfaceC0055c r11, T r12, java.util.Set<p000a.p029g.EnumC0261u> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0227aq.m695a(a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends p000a.p006d.InterfaceC0051b> T m684a(p000a.p006d.InterfaceC0055c r8, T r9) throws java.lang.Throwable {
        /*
            r7 = this;
            a.g.as r1 = r7.f1045e
            a.g.as r4 = r1.m749j()
            r3 = 0
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> Lb6
        L8:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f1042b     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r2, r5)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L45
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f1042b     // Catch: java.lang.Throwable -> L36
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
            a.g.as r1 = r7.f1045e     // Catch: java.lang.InterruptedException -> L2b java.lang.Throwable -> L36
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
            r4.mo752m()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            org.c.b r1 = p000a.p029g.C0227aq.f1041a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            boolean r1 = r1.mo4539c()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            if (r1 == 0) goto L66
            org.c.b r1 = p000a.p029g.C0227aq.f1041a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.String r5 = "sessionSetup: "
            r2.<init>(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            a.g.b r5 = r7.f1049i     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r1.mo4534b(r2)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
        L66:
            r1 = 0
            r7.f1043c = r1     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            boolean r1 = r4.m746g()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            if (r1 == 0) goto L7d
            a.d.b r9 = r7.m685a(r4)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r4.notifyAll()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L24
            r4.close()
            goto L24
        L7d:
            a.d.d.c r8 = (p000a.p006d.p010d.AbstractC0103c) r8     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r0 = r9
            a.d.d.c r0 = (p000a.p006d.p010d.AbstractC0103c) r0     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r1 = r0
            r7.m691a(r4, r8, r1)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La8
            r4.notifyAll()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L24
            r4.close()
            goto L24
        L90:
            r1 = move-exception
            org.c.b r2 = p000a.p029g.C0227aq.f1041a     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "Session setup failed"
            r2.mo4535b(r5, r1)     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f1042b     // Catch: java.lang.Throwable -> La8
            r5 = 1
            r6 = 0
            boolean r2 = r2.compareAndSet(r5, r6)     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto La7
            r2 = 1
            r5 = 1
            r7.m699a(r2, r5)     // Catch: java.lang.Throwable -> La8
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0227aq.m684a(a.d.c, a.d.b):a.d.b");
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0266z m687a(C0229as c0229as, C0162f c0162f, boolean z) {
        String strMo3b = this.f1057q;
        if (strMo3b == null) {
            strMo3b = c0229as.m739b().mo3b();
            try {
                strMo3b = c0229as.m739b().mo1a();
            } catch (Exception e) {
                f1041a.mo4535b("Failed to resolve host name", e);
            }
        }
        if (f1041a.mo4539c()) {
            f1041a.mo4534b("Remote host is ".concat(String.valueOf(strMo3b)));
        }
        return this.f1049i.mo804a(this.f1045e.m748i(), strMo3b, c0162f.m500X(), z);
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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean m699a(boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0227aq.m699a(boolean, boolean):boolean");
    }
}
