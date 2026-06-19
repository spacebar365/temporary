package p000a.p029g;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0003aa;
import p000a.InterfaceC0004ab;
import p000a.InterfaceC0016c;
import p000a.p006d.InterfaceC0045a;
import p000a.p006d.InterfaceC0177i;
import p000a.p006d.p009c.C0057b;
import p000a.p006d.p009c.C0064i;
import p000a.p006d.p009c.InterfaceC0056a;
import p000a.p006d.p009c.InterfaceC0065j;
import p000a.p006d.p010d.p011a.C0078h;
import p000a.p006d.p010d.p011a.C0079i;
import p000a.p006d.p010d.p011a.C0084n;
import p000a.p006d.p010d.p011a.C0085o;
import p000a.p006d.p010d.p015d.C0122f;
import p000a.p006d.p010d.p015d.C0123g;
import p000a.p006d.p010d.p015d.C0124h;
import p000a.p006d.p010d.p015d.C0125i;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.p017a.C0130c;
import p000a.p006d.p016e.p017a.C0131d;
import p000a.p006d.p016e.p017a.C0132e;
import p000a.p006d.p016e.p017a.C0133f;
import p000a.p006d.p016e.p018b.C0137c;
import p000a.p006d.p016e.p018b.C0138d;

/* JADX INFO: renamed from: a.g.ae */
/* JADX INFO: compiled from: SmbFile.java */
/* JADX INFO: loaded from: classes.dex */
public class C0215ae extends URLConnection implements InterfaceC0003aa {

    /* JADX INFO: renamed from: a */
    protected static final int f956a = ".".hashCode();

    /* JADX INFO: renamed from: b */
    protected static final int f957b = "..".hashCode();

    /* JADX INFO: renamed from: d */
    private static InterfaceC1612b f958d = C1620c.m4563a((Class<?>) C0215ae.class);

    /* JADX INFO: renamed from: c */
    protected final C0225ao f959c;

    /* JADX INFO: renamed from: e */
    private long f960e;

    /* JADX INFO: renamed from: f */
    private long f961f;

    /* JADX INFO: renamed from: g */
    private long f962g;

    /* JADX INFO: renamed from: h */
    private int f963h;

    /* JADX INFO: renamed from: i */
    private long f964i;

    /* JADX INFO: renamed from: j */
    private long f965j;

    /* JADX INFO: renamed from: k */
    private long f966k;

    /* JADX INFO: renamed from: l */
    private boolean f967l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0016c f968m;

    /* JADX INFO: renamed from: n */
    private C0233aw f969n;

    /* JADX INFO: renamed from: o */
    private C0235ay f970o;

    private C0215ae(InterfaceC0003aa interfaceC0003aa, String str) {
        this(m620a(interfaceC0003aa) ? new URL((URL) null, "smb://" + m621b(str), interfaceC0003aa.mo83b().mo120h()) : new URL(interfaceC0003aa.mo82a().mo89f(), m621b(str), interfaceC0003aa.mo83b().mo120h()), interfaceC0003aa.mo83b());
        m619a(interfaceC0003aa, str);
    }

    public C0215ae(String str, InterfaceC0016c interfaceC0016c) {
        this(new URL((URL) null, str, interfaceC0016c.mo120h()), interfaceC0016c);
    }

    public C0215ae(URL url, InterfaceC0016c interfaceC0016c) throws MalformedURLException {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: ".concat(String.valueOf(url)));
        }
        this.f968m = interfaceC0016c;
        this.f959c = new C0225ao(interfaceC0016c, url);
        this.f969n = C0233aw.m763a(interfaceC0016c);
    }

    C0215ae(InterfaceC0003aa interfaceC0003aa, String str, boolean z, int i, int i2, long j, long j2, long j3, long j4) {
        URL url;
        if (m620a(interfaceC0003aa)) {
            url = new URL((URL) null, "smb://" + m621b(str) + "/", C0252l.f1162a);
        } else {
            url = new URL(interfaceC0003aa.mo82a().mo89f(), m621b(str) + ((i2 & 16) > 0 ? "/" : ""));
        }
        this(url, interfaceC0003aa.mo83b());
        if (!m620a(interfaceC0003aa)) {
            m619a(interfaceC0003aa, str + ((i2 & 16) > 0 ? "/" : ""));
        }
        this.f959c.m675a(i);
        this.f963h = i2;
        this.f960e = j;
        this.f961f = j2;
        this.f962g = j3;
        this.f965j = j4;
        this.f967l = true;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis() + this.f968m.mo114a().mo45aj();
            this.f966k = jCurrentTimeMillis;
            this.f964i = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m620a(InterfaceC0003aa interfaceC0003aa) {
        try {
            return interfaceC0003aa.mo82a().mo93j();
        } catch (C0044d e) {
            f958d.mo4535b("Failed to check for workgroup", e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public void connect() {
        C0235ay c0235ayM626c = m626c();
        if (c0235ayM626c != null) {
            c0235ayM626c.close();
        }
    }

    @Override // p000a.InterfaceC0003aa, java.lang.AutoCloseable
    public synchronized void close() {
        C0235ay c0235ay = this.f970o;
        if (c0235ay != null) {
            this.f970o = null;
            if (this.f968m.mo114a().mo47al()) {
                c0235ay.close();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final synchronized C0235ay m626c() {
        C0235ay c0235ayM796h;
        if (this.f970o == null || !this.f970o.m794f()) {
            if (this.f970o != null && this.f968m.mo114a().mo47al()) {
                this.f970o.m797i();
            }
            this.f970o = this.f969n.m777a(this.f959c);
            this.f970o.m793e();
            if (this.f968m.mo114a().mo47al()) {
                c0235ayM796h = this.f970o.m796h();
            } else {
                c0235ayM796h = this.f970o;
            }
        } else {
            c0235ayM796h = this.f970o.m796h();
        }
        return c0235ayM796h;
    }

    /* JADX INFO: renamed from: a */
    private void m619a(InterfaceC0003aa interfaceC0003aa, String str) {
        this.f959c.m676a(interfaceC0003aa.mo82a(), str);
        if (interfaceC0003aa.mo82a().mo87d() != null && (interfaceC0003aa instanceof C0215ae)) {
            this.f969n = C0233aw.m764a(((C0215ae) interfaceC0003aa).f969n);
        } else {
            this.f969n = C0233aw.m763a(interfaceC0003aa.mo83b());
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m621b(String str) throws MalformedURLException {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    protected final void m627d() {
        this.f969n.m780a(false);
    }

    @Override // p000a.InterfaceC0003aa
    /* JADX INFO: renamed from: b */
    public final InterfaceC0016c mo83b() {
        return this.f968m;
    }

    @Override // p000a.InterfaceC0003aa
    /* JADX INFO: renamed from: a */
    public final InterfaceC0004ab mo82a() {
        return this.f959c;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0003aa m622a(String str) throws C0214ad {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return new C0215ae(this, str);
                }
            } catch (MalformedURLException | UnknownHostException e) {
                throw new C0214ad("Failed to resolve child element", e);
            }
        }
        throw new C0214ad("Name must not be empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final p000a.p029g.C0216af m624a(java.lang.String r21, int r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0215ae.m624a(java.lang.String, int, int, int):a.g.af");
    }

    /* JADX INFO: renamed from: e */
    public final String m628e() {
        return this.f959c.mo85b();
    }

    /* JADX INFO: renamed from: a */
    protected void mo625a(C0078h c0078h, C0079i c0079i) {
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0177i m618a(C0235ay c0235ay, String str, int i) {
        if (f958d.mo4539c()) {
            f958d.mo4534b("queryPath: ".concat(String.valueOf(str)));
        }
        if (c0235ay.mo103b()) {
            return (InterfaceC0177i) m617a(c0235ay, (AbstractC0141c) null);
        }
        if (c0235ay.mo791a(16)) {
            C0125i c0125i = (C0125i) c0235ay.m789a(new C0124h(c0235ay.mo102a(), str, i), new C0125i(c0235ay.mo102a(), i), new EnumC0261u[0]);
            if (f958d.mo4539c()) {
                f958d.mo4534b("Path information ".concat(String.valueOf(c0125i)));
            }
            InterfaceC0056a interfaceC0056a = (InterfaceC0056a) c0125i.m407a(InterfaceC0056a.class);
            this.f967l = true;
            if (interfaceC0056a instanceof C0057b) {
                this.f963h = interfaceC0056a.mo227b() & 32767;
                this.f960e = interfaceC0056a.mo228b_();
                this.f961f = interfaceC0056a.mo230d();
                this.f962g = interfaceC0056a.mo231e();
                this.f964i = System.currentTimeMillis() + c0235ay.mo102a().mo45aj();
                return interfaceC0056a;
            }
            if (interfaceC0056a instanceof C0064i) {
                this.f965j = interfaceC0056a.mo229c_();
                this.f966k = System.currentTimeMillis() + c0235ay.mo102a().mo45aj();
                return interfaceC0056a;
            }
            return interfaceC0056a;
        }
        C0085o c0085o = (C0085o) c0235ay.m789a(new C0084n(c0235ay.mo102a(), str), new C0085o(c0235ay.mo102a(), c0235ay.m798j()), new EnumC0261u[0]);
        if (f958d.mo4539c()) {
            f958d.mo4534b("Legacy path information ".concat(String.valueOf(c0085o)));
        }
        this.f967l = true;
        this.f963h = c0085o.mo227b() & 32767;
        this.f961f = c0085o.mo230d();
        this.f964i = System.currentTimeMillis() + c0235ay.mo102a().mo45aj();
        this.f965j = c0085o.mo229c_();
        this.f966k = System.currentTimeMillis() + c0235ay.mo102a().mo45aj();
        return c0085o;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m629f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0215ae.m629f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo630g() throws java.lang.Throwable {
        /*
            r5 = this;
            a.g.ao r0 = r5.f959c     // Catch: p000a.C0044d -> L2a
            int r0 = r0.mo92i()     // Catch: p000a.C0044d -> L2a
            r1 = 8
            if (r0 != r1) goto L1d
            a.g.ay r3 = r5.m626c()     // Catch: p000a.C0044d -> L2a
            r2 = 0
            a.g.ao r1 = r5.f959c     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L39
            int r4 = r3.mo104c()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L39
            r1.m675a(r4)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L39
            if (r3 == 0) goto L1d
            r3.close()     // Catch: p000a.C0044d -> L2a
        L1d:
            return r0
        L1e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            r2 = r0
        L22:
            if (r3 == 0) goto L29
            if (r2 == 0) goto L35
            r3.close()     // Catch: p000a.C0044d -> L2a java.lang.Throwable -> L30
        L29:
            throw r1     // Catch: p000a.C0044d -> L2a
        L2a:
            r0 = move-exception
            a.g.ad r0 = p000a.p029g.C0214ad.m611a(r0)
            throw r0
        L30:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: p000a.C0044d -> L2a
            goto L29
        L35:
            r3.close()     // Catch: p000a.C0044d -> L2a
            goto L29
        L39:
            r0 = move-exception
            r1 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0215ae.mo630g():int");
    }

    /* JADX INFO: renamed from: h */
    public final String m631h() {
        return this.f959c.m678m();
    }

    /* JADX INFO: renamed from: i */
    public final String m632i() {
        return this.f959c.m679n();
    }

    /* JADX INFO: renamed from: j */
    public final String m633j() {
        return this.f959c.mo88e();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m634k() {
        if (this.f959c.m683r()) {
            return true;
        }
        return m629f() && (this.f963h & 16) == 16;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m635l() throws Throwable {
        if (this.f959c.m683r()) {
            return false;
        }
        m629f();
        return (this.f963h & 16) == 0;
    }

    /* JADX INFO: renamed from: m */
    public final long m636m() {
        if (this.f959c.m683r()) {
            return 0L;
        }
        m629f();
        return this.f961f;
    }

    /* JADX INFO: renamed from: n */
    public final C0215ae[] m637n() {
        return C0213ac.m607a(this, "*");
    }

    /* JADX INFO: renamed from: o */
    final void m638o() {
        this.f964i = 0L;
        this.f966k = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m639p() {
        /*
            r6 = this;
            long r0 = r6.f966k
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ld
            long r0 = r6.f965j
        Lc:
            return r0
        Ld:
            a.g.ay r3 = r6.m626c()     // Catch: p000a.C0044d -> L3d
            r2 = 0
            int r0 = r6.mo630g()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            r1 = 8
            if (r0 != r1) goto L43
            a.d.a r0 = r6.m615a(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r0 = r0.mo171a()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            r6.f965j = r0     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
        L24:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            a.c r4 = r6.f968m     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            a.h r4 = r4.mo114a()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r4 = r4.mo45aj()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r0 = r0 + r4
            r6.f966k = r0     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r0 = r6.f965j     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            if (r3 == 0) goto Lc
            r3.close()     // Catch: p000a.C0044d -> L3d
            goto Lc
        L3d:
            r0 = move-exception
            a.g.ad r0 = p000a.p029g.C0214ad.m611a(r0)
            throw r0
        L43:
            a.g.ao r1 = r6.f959c     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            boolean r1 = r1.mo94k()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            if (r1 != 0) goto L66
            r1 = 16
            if (r0 == r1) goto L66
            a.g.ao r0 = r6.f959c     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            java.lang.String r0 = r0.mo85b()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            r1 = 5
            r6.m618a(r3, r0, r1)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            goto L24
        L5a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            r2 = r0
        L5e:
            if (r3 == 0) goto L65
            if (r2 == 0) goto L73
            r3.close()     // Catch: p000a.C0044d -> L3d java.lang.Throwable -> L6e
        L65:
            throw r1     // Catch: p000a.C0044d -> L3d
        L66:
            r0 = 0
            r6.f965j = r0     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            goto L24
        L6b:
            r0 = move-exception
            r1 = r0
            goto L5e
        L6e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: p000a.C0044d -> L3d
            goto L65
        L73:
            r3.close()     // Catch: p000a.C0044d -> L3d
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0215ae.m639p():long");
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0045a m615a(C0235ay c0235ay) throws C0214ad {
        try {
            return (InterfaceC0045a) m616a(c0235ay, InterfaceC0045a.class, (byte) 3);
        } catch (C0214ad e) {
            f958d.mo4535b("getDiskFreeSpace", e);
            switch (e.m614b()) {
                case -1073741823:
                case -1073741821:
                    if (!c0235ay.mo103b()) {
                        return (InterfaceC0045a) m616a(c0235ay, InterfaceC0045a.class, (byte) -1);
                    }
                case -1073741822:
                default:
                    throw e;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0065j> T m616a(C0235ay c0235ay, Class<T> cls, byte b) {
        if (c0235ay.mo103b()) {
            C0137c c0137c = new C0137c(c0235ay.mo102a());
            c0137c.m459a(b);
            return (T) ((C0138d) m617a(c0235ay, c0137c)).m460a(cls);
        }
        C0123g c0123g = new C0123g(c0235ay.mo102a(), b);
        c0235ay.m789a(new C0122f(c0235ay.mo102a(), b), c0123g, new EnumC0261u[0]);
        return (T) c0123g.m406a(cls);
    }

    /* JADX INFO: renamed from: a */
    private <T extends AbstractC0146d> T m617a(C0235ay c0235ay, AbstractC0141c<T> abstractC0141c) throws Exception {
        Exception exc;
        C0133f c0133fL;
        C0132e c0132e = new C0132e(c0235ay.mo102a(), this.f959c.mo85b());
        try {
            c0132e.m418m(1);
            c0132e.m419n(0);
            c0132e.m415k();
            c0132e.m416k(1179785);
            c0132e.m417l(3);
            if (abstractC0141c != null) {
                c0132e.mo437a((AbstractC0134b) abstractC0141c);
            } else {
                abstractC0141c = c0132e;
            }
            C0130c c0130c = new C0130c(c0235ay.mo102a(), this.f959c.mo85b());
            c0130c.m413k();
            abstractC0141c.mo437a((AbstractC0134b) c0130c);
            C0133f c0133f = (C0133f) c0235ay.m790a(c0132e, new EnumC0261u[0]);
            C0131d c0131dL = c0130c.mo218f_();
            int iM414g = c0131dL.m414g() & 1;
            InterfaceC0177i interfaceC0177i = c0131dL;
            if (iM414g == 0) {
                interfaceC0177i = c0133f;
            }
            this.f967l = true;
            this.f960e = interfaceC0177i.mo228b_();
            this.f961f = interfaceC0177i.mo230d();
            this.f962g = interfaceC0177i.mo231e();
            this.f963h = interfaceC0177i.mo227b() & 32767;
            this.f964i = System.currentTimeMillis() + c0235ay.mo102a().mo45aj();
            this.f965j = interfaceC0177i.mo229c_();
            this.f966k = System.currentTimeMillis() + c0235ay.mo102a().mo45aj();
            return (T) c0133f.mo244k();
        } catch (C0044d e) {
            exc = e;
            try {
                c0133fL = c0132e.mo218f_();
                if (!c0133fL.mo328D() && c0133fL.m425A() == 0) {
                    c0235ay.m790a(new C0130c(c0235ay.mo102a(), c0133fL.m421h()), EnumC0261u.NO_RETRY);
                    throw exc;
                }
                throw exc;
            } catch (Exception e2) {
                f958d.mo4535b("Failed to close after failure", e2);
                exc.addSuppressed(e2);
                throw exc;
            }
        } catch (RuntimeException e3) {
            exc = e3;
            c0133fL = c0132e.mo218f_();
            if (!c0133fL.mo328D()) {
                throw exc;
            }
            throw exc;
        }
    }

    public int hashCode() {
        return this.f959c.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0215ae) {
            InterfaceC0003aa interfaceC0003aa = (InterfaceC0003aa) obj;
            if (this == interfaceC0003aa) {
                return true;
            }
            return this.f959c.equals(interfaceC0003aa.mo82a());
        }
        return false;
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.url.toString();
    }

    @Override // java.net.URLConnection
    @Deprecated
    public int getContentLength() {
        try {
            return (int) (m639p() & 4294967295L);
        } catch (C0214ad e) {
            f958d.mo4535b("getContentLength", e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        try {
            return m639p();
        } catch (C0214ad e) {
            f958d.mo4535b("getContentLength", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public long getDate() {
        try {
            return m636m();
        } catch (C0214ad e) {
            f958d.mo4535b("getDate", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        try {
            return m636m();
        } catch (C0214ad e) {
            f958d.mo4535b("getLastModified", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return new C0217ag(this);
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return new C0218ah(this);
    }

    /* JADX INFO: renamed from: a */
    final C0216af m623a(int i, int i2, int i3) {
        return m624a(this.f959c.mo85b(), i, i2, i3);
    }
}
