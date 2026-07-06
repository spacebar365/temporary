package a.g;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: SmbFile.java */
/* JADX INFO: loaded from: classes.dex */
public class ae extends URLConnection implements a.aa {
    protected static final int a = ".".hashCode();
    protected static final int b = "..".hashCode();
    private static org.c.b d = org.c.c.a((Class<?>) ae.class);
    protected final ao c;
    private long e;
    private long f;
    private long g;
    private int h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private a.c m;
    private aw n;
    private ay o;

    private ae(a.aa aaVar, String str) {
        this(a(aaVar) ? new URL((URL) null, "smb://" + b(str), aaVar.b().h()) : new URL(aaVar.a().f(), b(str), aaVar.b().h()), aaVar.b());
        a(aaVar, str);
    }

    public ae(String str, a.c cVar) {
        this(new URL((URL) null, str, cVar.h()), cVar);
    }

    public ae(URL url, a.c cVar) throws MalformedURLException {
        super(url);
        if (url.getPath() != null && !url.getPath().isEmpty() && url.getPath().charAt(0) != '/') {
            throw new MalformedURLException("Invalid SMB URL: ".concat(String.valueOf(url)));
        }
        this.m = cVar;
        this.c = new ao(cVar, url);
        this.n = aw.a(cVar);
    }

    ae(a.aa aaVar, String str, boolean z, int i, int i2, long j, long j2, long j3, long j4) {
        URL url;
        if (a(aaVar)) {
            url = new URL((URL) null, "smb://" + b(str) + "/", l.a);
        } else {
            url = new URL(aaVar.a().f(), b(str) + ((i2 & 16) > 0 ? "/" : ""));
        }
        this(url, aaVar.b());
        if (!a(aaVar)) {
            a(aaVar, str + ((i2 & 16) > 0 ? "/" : ""));
        }
        this.c.a(i);
        this.h = i2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.j = j4;
        this.l = true;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis() + this.m.a().aj();
            this.k = jCurrentTimeMillis;
            this.i = jCurrentTimeMillis;
        }
    }

    private static boolean a(a.aa aaVar) {
        try {
            return aaVar.a().j();
        } catch (a.d e) {
            d.b("Failed to check for workgroup", e);
            return false;
        }
    }

    @Override // java.net.URLConnection
    public void connect() {
        ay ayVarC = c();
        if (ayVarC != null) {
            ayVarC.close();
        }
    }

    @Override // a.aa, java.lang.AutoCloseable
    public synchronized void close() {
        ay ayVar = this.o;
        if (ayVar != null) {
            this.o = null;
            if (this.m.a().al()) {
                ayVar.close();
            }
        }
    }

    final synchronized ay c() {
        ay ayVarH;
        if (this.o == null || !this.o.f()) {
            if (this.o != null && this.m.a().al()) {
                this.o.i();
            }
            this.o = this.n.a(this.c);
            this.o.e();
            if (this.m.a().al()) {
                ayVarH = this.o.h();
            } else {
                ayVarH = this.o;
            }
        } else {
            ayVarH = this.o.h();
        }
        return ayVarH;
    }

    private void a(a.aa aaVar, String str) {
        this.c.a(aaVar.a(), str);
        if (aaVar.a().d() != null && (aaVar instanceof ae)) {
            this.n = aw.a(((ae) aaVar).n);
        } else {
            this.n = aw.a(aaVar.b());
        }
    }

    private static String b(String str) throws MalformedURLException {
        if (str == null || str.length() == 0) {
            throw new MalformedURLException("Name must not be empty");
        }
        return str;
    }

    protected final void d() {
        this.n.a(false);
    }

    @Override // a.aa
    public final a.c b() {
        return this.m;
    }

    @Override // a.aa
    public final a.ab a() {
        return this.c;
    }

    public final a.aa a(String str) throws ad {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return new ae(this, str);
                }
            } catch (MalformedURLException | UnknownHostException e) {
                throw new ad("Failed to resolve child element", e);
            }
        }
        throw new ad("Name must not be empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final a.g.af a(java.lang.String r21, int r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ae.a(java.lang.String, int, int, int):a.g.af");
    }

    public final String e() {
        return this.c.b();
    }

    protected void a(a.d.d.a.h hVar, a.d.d.a.i iVar) {
    }

    private a.d.i a(ay ayVar, String str, int i) {
        if (d.c()) {
            d.b("queryPath: ".concat(String.valueOf(str)));
        }
        if (ayVar.b()) {
            return (a.d.i) a(ayVar, (a.d.e.c) null);
        }
        if (ayVar.a(16)) {
            a.d.d.d.i iVar = (a.d.d.d.i) ayVar.a(new a.d.d.d.h(ayVar.a(), str, i), new a.d.d.d.i(ayVar.a(), i), new u[0]);
            if (d.c()) {
                d.b("Path information ".concat(String.valueOf(iVar)));
            }
            a.d.c.a aVar = (a.d.c.a) iVar.a(a.d.c.a.class);
            this.l = true;
            if (aVar instanceof a.d.c.b) {
                this.h = aVar.b() & 32767;
                this.e = aVar.b_();
                this.f = aVar.d();
                this.g = aVar.e();
                this.i = System.currentTimeMillis() + ayVar.a().aj();
                return aVar;
            }
            if (aVar instanceof a.d.c.i) {
                this.j = aVar.c_();
                this.k = System.currentTimeMillis() + ayVar.a().aj();
                return aVar;
            }
            return aVar;
        }
        a.d.d.a.o oVar = (a.d.d.a.o) ayVar.a(new a.d.d.a.n(ayVar.a(), str), new a.d.d.a.o(ayVar.a(), ayVar.j()), new u[0]);
        if (d.c()) {
            d.b("Legacy path information ".concat(String.valueOf(oVar)));
        }
        this.l = true;
        this.h = oVar.b() & 32767;
        this.f = oVar.d();
        this.i = System.currentTimeMillis() + ayVar.a().aj();
        this.j = oVar.c_();
        this.k = System.currentTimeMillis() + ayVar.a().aj();
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ae.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g() throws java.lang.Throwable {
        /*
            r5 = this;
            a.g.ao r0 = r5.c     // Catch: a.d -> L2a
            int r0 = r0.i()     // Catch: a.d -> L2a
            r1 = 8
            if (r0 != r1) goto L1d
            a.g.ay r3 = r5.c()     // Catch: a.d -> L2a
            r2 = 0
            a.g.ao r1 = r5.c     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L39
            int r4 = r3.c()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L39
            r1.a(r4)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L39
            if (r3 == 0) goto L1d
            r3.close()     // Catch: a.d -> L2a
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
            r3.close()     // Catch: a.d -> L2a java.lang.Throwable -> L30
        L29:
            throw r1     // Catch: a.d -> L2a
        L2a:
            r0 = move-exception
            a.g.ad r0 = a.g.ad.a(r0)
            throw r0
        L30:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: a.d -> L2a
            goto L29
        L35:
            r3.close()     // Catch: a.d -> L2a
            goto L29
        L39:
            r0 = move-exception
            r1 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ae.g():int");
    }

    public final String h() {
        return this.c.m();
    }

    public final String i() {
        return this.c.n();
    }

    public final String j() {
        return this.c.e();
    }

    public final boolean k() {
        if (this.c.r()) {
            return true;
        }
        return f() && (this.h & 16) == 16;
    }

    public final boolean l() throws Throwable {
        if (this.c.r()) {
            return false;
        }
        f();
        return (this.h & 16) == 0;
    }

    public final long m() throws Throwable {
        if (this.c.r()) {
            return 0L;
        }
        f();
        return this.f;
    }

    public final ae[] n() {
        return ac.a(this, "*");
    }

    final void o() {
        this.i = 0L;
        this.k = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p() throws java.lang.Throwable {
        /*
            r6 = this;
            long r0 = r6.k
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ld
            long r0 = r6.j
        Lc:
            return r0
        Ld:
            a.g.ay r3 = r6.c()     // Catch: a.d -> L3d
            r2 = 0
            int r0 = r6.g()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            r1 = 8
            if (r0 != r1) goto L43
            a.d.a r0 = r6.a(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            r6.j = r0     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
        L24:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            a.c r4 = r6.m     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            a.h r4 = r4.a()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r4 = r4.aj()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r0 = r0 + r4
            r6.k = r0     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            long r0 = r6.j     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            if (r3 == 0) goto Lc
            r3.close()     // Catch: a.d -> L3d
            goto Lc
        L3d:
            r0 = move-exception
            a.g.ad r0 = a.g.ad.a(r0)
            throw r0
        L43:
            a.g.ao r1 = r6.c     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            boolean r1 = r1.k()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            if (r1 != 0) goto L66
            r1 = 16
            if (r0 == r1) goto L66
            a.g.ao r0 = r6.c     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            r1 = 5
            r6.a(r3, r0, r1)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
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
            r3.close()     // Catch: a.d -> L3d java.lang.Throwable -> L6e
        L65:
            throw r1     // Catch: a.d -> L3d
        L66:
            r0 = 0
            r6.j = r0     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L6b
            goto L24
        L6b:
            r0 = move-exception
            r1 = r0
            goto L5e
        L6e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: a.d -> L3d
            goto L65
        L73:
            r3.close()     // Catch: a.d -> L3d
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ae.p():long");
    }

    private a.d.a a(ay ayVar) throws ad {
        try {
            return (a.d.a) a(ayVar, a.d.a.class, (byte) 3);
        } catch (ad e) {
            d.b("getDiskFreeSpace", e);
            switch (e.b()) {
                case -1073741823:
                case -1073741821:
                    if (!ayVar.b()) {
                        return (a.d.a) a(ayVar, a.d.a.class, (byte) -1);
                    }
                case -1073741822:
                default:
                    throw e;
            }
        }
    }

    private <T extends a.d.c.j> T a(ay ayVar, Class<T> cls, byte b2) {
        if (ayVar.b()) {
            a.d.e.b.c cVar = new a.d.e.b.c(ayVar.a());
            cVar.a(b2);
            return (T) ((a.d.e.b.d) a(ayVar, cVar)).a(cls);
        }
        a.d.d.d.g gVar = new a.d.d.d.g(ayVar.a(), b2);
        ayVar.a(new a.d.d.d.f(ayVar.a(), b2), gVar, new u[0]);
        return (T) gVar.a(cls);
    }

    private <T extends a.d.e.d> T a(ay ayVar, a.d.e.c<T> cVar) throws Exception {
        Exception exc;
        a.d.e.a.f fVarL;
        a.d.e.a.e eVar = new a.d.e.a.e(ayVar.a(), this.c.b());
        try {
            eVar.m(1);
            eVar.n(0);
            eVar.k();
            eVar.k(1179785);
            eVar.l(3);
            if (cVar != null) {
                eVar.a((a.d.e.b) cVar);
            } else {
                cVar = eVar;
            }
            a.d.e.a.c cVar2 = new a.d.e.a.c(ayVar.a(), this.c.b());
            cVar2.k();
            cVar.a((a.d.e.b) cVar2);
            a.d.e.a.f fVar = (a.d.e.a.f) ayVar.a(eVar, new u[0]);
            a.d.e.a.d dVarL = cVar2.L();
            int iG = dVarL.g() & 1;
            a.d.i iVar = dVarL;
            if (iG == 0) {
                iVar = fVar;
            }
            this.l = true;
            this.e = iVar.b_();
            this.f = iVar.d();
            this.g = iVar.e();
            this.h = iVar.b() & 32767;
            this.i = System.currentTimeMillis() + ayVar.a().aj();
            this.j = iVar.c_();
            this.k = System.currentTimeMillis() + ayVar.a().aj();
            return (T) fVar.k();
        } catch (a.d e) {
            exc = e;
            try {
                fVarL = eVar.L();
                if (!fVarL.D() && fVarL.A() == 0) {
                    ayVar.a(new a.d.e.a.c(ayVar.a(), fVarL.h()), u.c);
                    throw exc;
                }
                throw exc;
            } catch (Exception e2) {
                d.b("Failed to close after failure", e2);
                exc.addSuppressed(e2);
                throw exc;
            }
        } catch (RuntimeException e3) {
            exc = e3;
            fVarL = eVar.L();
            if (!fVarL.D()) {
                throw exc;
            }
            throw exc;
        }
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof ae) {
            a.aa aaVar = (a.aa) obj;
            if (this == aaVar) {
                return true;
            }
            return this.c.equals(aaVar.a());
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
            return (int) (p() & 4294967295L);
        } catch (ad e) {
            d.b("getContentLength", e);
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        try {
            return p();
        } catch (ad e) {
            d.b("getContentLength", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public long getDate() {
        try {
            return m();
        } catch (ad e) {
            d.b("getDate", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        try {
            return m();
        } catch (ad e) {
            d.b("getLastModified", e);
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return new ag(this);
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return new ah(this);
    }

    final af a(int i, int i2, int i3) {
        return a(this.c.b(), i, i2, i3);
    }
}
