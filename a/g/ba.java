package a.g;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: SmbTreeImpl.java */
/* JADX INFO: loaded from: classes.dex */
class ba implements bb {
    private static final org.c.b a = org.c.c.a((Class<?>) ba.class);
    private static AtomicLong b = new AtomicLong();
    private final String d;
    private final aq f;
    private volatile boolean i;
    private volatile boolean j;
    private volatile long k;
    private final boolean n;
    private final List<StackTraceElement[]> o;
    private final List<StackTraceElement[]> p;
    private a.k q;
    private final AtomicInteger c = new AtomicInteger();
    private volatile int g = -1;
    private volatile String h = "?????";
    private final AtomicLong l = new AtomicLong(0);
    private final AtomicBoolean m = new AtomicBoolean(true);
    private final String e = this.h;

    ba(aq aqVar, String str) {
        this.f = aqVar.e();
        this.d = str.toUpperCase();
        this.n = this.f.a().am();
        if (this.n) {
            this.o = new LinkedList();
            this.p = new LinkedList();
        } else {
            this.o = null;
            this.p = null;
        }
    }

    final boolean a(String str, String str2) {
        return this.d.equalsIgnoreCase(str) && (str2 == null || str2.startsWith("??") || this.h.equalsIgnoreCase(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return a(baVar.d, baVar.h);
    }

    @Override // a.af
    public final <T extends a.af> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    public final ba a(boolean z) {
        long jIncrementAndGet = this.l.incrementAndGet();
        if (a.b()) {
            a.a("Acquire tree " + jIncrementAndGet + " " + this);
        }
        if (z && this.n) {
            synchronized (this.o) {
                this.o.add(a(Thread.currentThread().getStackTrace()));
            }
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.m.compareAndSet(false, true)) {
                    a.b("Reacquire session");
                    this.f.e();
                }
            }
        }
        return this;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        b(false);
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        long jDecrementAndGet = this.l.decrementAndGet();
        if (a.b()) {
            a.a("Release tree " + jDecrementAndGet + " " + this);
        }
        if (z && this.n) {
            synchronized (this.p) {
                this.p.add(a(Thread.currentThread().getStackTrace()));
            }
        }
        if (jDecrementAndGet == 0) {
            synchronized (this) {
                a.b("Usage dropped to zero, release session");
                if (this.m.compareAndSet(true, false)) {
                    this.f.f();
                }
            }
            return;
        }
        if (jDecrementAndGet < 0) {
            a.e("Usage count dropped below zero ".concat(String.valueOf(this)));
            k();
            throw new a.u("Usage count dropped below zero");
        }
    }

    private static StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = 2;
        int i2 = 2;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (i == i2 && ba.class.getName().equals(stackTraceElement.getClassName()) && "close".equals(stackTraceElement.getMethodName())) {
                i2++;
            } else if (stackTraceElement.getClassName().startsWith("org.junit.runners.")) {
                length = i - 4;
                break;
            }
            i++;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length - i2];
        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, 0, length - i2);
        return stackTraceElementArr2;
    }

    protected void finalize() {
        if (b() && this.l.get() != 0) {
            a.d("Tree was not properly released");
        }
    }

    public final boolean b() {
        return this.g != -1 && this.f.k() && this.c.get() == 2;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.d;
    }

    final void e() {
        this.j = true;
    }

    public final boolean f() {
        return this.j;
    }

    public final void a(a.k kVar) {
        this.q = kVar;
    }

    public final a.k g() {
        return this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() throws java.lang.Throwable {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.c
            int r0 = r0.get()
            r1 = 2
            if (r0 != r1) goto Lc
            boolean r0 = r4.i
        Lb:
            return r0
        Lc:
            a.g.aq r0 = r4.f
            a.g.as r3 = r0.h()
            r2 = 0
            a.d.l r0 = r3.f()     // Catch: java.lang.Throwable -> L21 java.lang.Throwable -> L36
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L21 java.lang.Throwable -> L36
            if (r3 == 0) goto Lb
            r3.close()
            goto Lb
        L21:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L23
        L23:
            r1 = move-exception
            r2 = r0
        L25:
            if (r3 == 0) goto L2c
            if (r2 == 0) goto L32
            r3.close()     // Catch: java.lang.Throwable -> L2d
        L2c:
            throw r1
        L2d:
            r0 = move-exception
            r2.addSuppressed(r0)
            goto L2c
        L32:
            r3.close()
            goto L2c
        L36:
            r0 = move-exception
            r1 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ba.h():boolean");
    }

    public final aq i() {
        return this.f.e();
    }

    public final long j() {
        return this.k;
    }

    public int hashCode() {
        return this.d.hashCode() + (this.h.hashCode() * 7);
    }

    public final <T extends a.d.d> T a(a.d.e<T> eVar, u... uVarArr) {
        return (T) a(eVar, (a.d.d) null, uVarArr.length > 0 ? EnumSet.copyOf((Collection) Arrays.asList(uVarArr)) : EnumSet.noneOf(u.class));
    }

    final <T extends a.d.d> T a(a.d.c cVar, T t) {
        return (T) a(cVar, t, Collections.emptySet());
    }

    private void a(as asVar, aq aqVar, a.d.m mVar) throws a.d {
        if (!mVar.h()) {
            throw new ad("TreeID is invalid");
        }
        this.g = mVar.d_();
        String strP_ = mVar.p_();
        if (strP_ == null && !asVar.g()) {
            throw new ad("Service is NULL");
        }
        this.h = strP_;
        this.i = mVar.g();
        this.k = b.incrementAndGet();
        this.c.set(2);
        try {
            a(asVar, aqVar);
        } catch (a.d e) {
            try {
                asVar.t();
            } catch (IOException e2) {
                a.d("Failed to disconnect transport", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    private void a(as asVar, aq aqVar) throws a.d {
        if (!asVar.g() || asVar.h() == null || !aqVar.a().i()) {
            a.b("Secure negotiation does not apply");
            return;
        }
        a.d.e.f.f fVar = (a.d.e.f.f) asVar.f();
        if (fVar.e().a(a.m.f)) {
            a.b("Secure negotiation does not apply, is SMB3.1");
            return;
        }
        a.d.e.f.e eVar = new a.d.e.f.e(aqVar.a(), asVar.a(fVar));
        a.b("Sending VALIDATE_NEGOTIATE_INFO");
        a.d.e.d.a aVar = new a.d.e.d.a(aqVar.a(), 1311236);
        aVar.k();
        aVar.a(new a.d.e.d.f(eVar.l(), eVar.n(), (short) eVar.k(), eVar.m()));
        try {
            a.d.e.d.g gVar = (a.d.e.d.g) ((a.d.e.d.b) a(aVar, u.c)).a(a.d.e.d.g.class);
            if (fVar.Y() != gVar.c() || fVar.V() != gVar.a() || fVar.s() != gVar.d() || !Arrays.equals(fVar.I(), gVar.b())) {
                a.b("Secure negotiation failure");
                throw new a.d("Mismatched attributes validating negotiate info");
            }
            a.b("Secure negotiation OK");
        } catch (y e) {
            throw new x("Signature error during negotiate validation", e);
        } catch (ad e2) {
            if (a.c()) {
                a.b(String.format("VALIDATE_NEGOTIATE_INFO response code 0x%x", Integer.valueOf(e2.b())));
            }
            a.a("VALIDATE_NEGOTIATE_INFO returned error", e2);
            if ((aVar.L().D() && aVar.L().N()) || e2.b() == -1073741790) {
                throw new x("Signature error during negotiate validation", e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(a.g.as r4) throws a.g.ad {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.c
            int r0 = r0.get()
            if (r0 == 0) goto Lb
            r1 = 2
            if (r0 != r1) goto Lc
        Lb:
            return r0
        Lc:
            r1 = 3
            if (r0 != r1) goto L17
            a.g.ad r0 = new a.g.ad
            java.lang.String r1 = "Disconnecting during tree connect"
            r0.<init>(r1)
            throw r0
        L17:
            org.c.b r0 = a.g.ba.a     // Catch: java.lang.InterruptedException -> L22
            java.lang.String r1 = "Waiting for transport"
            r0.b(r1)     // Catch: java.lang.InterruptedException -> L22
            r4.wait()     // Catch: java.lang.InterruptedException -> L22
            goto L0
        L22:
            r0 = move-exception
            a.g.ad r1 = new a.g.ad
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ba.a(a.g.as):int");
    }

    private void k() {
        if (this.n) {
            synchronized (this.o) {
                Iterator<StackTraceElement[]> it = this.o.iterator();
                while (it.hasNext()) {
                    a.b("Acquire " + Arrays.toString(it.next()));
                }
            }
            synchronized (this.p) {
                Iterator<StackTraceElement[]> it2 = this.p.iterator();
                while (it2.hasNext()) {
                    a.b("Release " + Arrays.toString(it2.next()));
                }
            }
        }
    }

    public String toString() {
        return "SmbTree[share=" + this.d + ",service=" + this.h + ",tid=" + this.g + ",inDfs=" + this.i + ",inDomainDfs=" + this.j + ",connectionState=" + this.c + ",usage=" + this.l.get() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final <T extends a.d.d> T a(a.d.c r11, T r12, java.util.Set<a.g.u> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ba.a(a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final <T extends a.d.d> T b(a.d.c r12, T r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ba.b(a.d.c, a.d.d):a.d.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean a(boolean r11, boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ba.a(boolean, boolean):boolean");
    }
}
