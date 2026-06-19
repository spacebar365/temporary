package p000a.p029g;

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
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.C0297u;
import p000a.EnumC0289m;
import p000a.InterfaceC0008af;
import p000a.InterfaceC0287k;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0126e;
import p000a.p006d.InterfaceC0181m;
import p000a.p006d.p016e.p020d.C0147a;
import p000a.p006d.p016e.p020d.C0148b;
import p000a.p006d.p016e.p020d.C0152f;
import p000a.p006d.p016e.p020d.C0153g;
import p000a.p006d.p016e.p022f.C0161e;
import p000a.p006d.p016e.p022f.C0162f;

/* JADX INFO: renamed from: a.g.ba */
/* JADX INFO: compiled from: SmbTreeImpl.java */
/* JADX INFO: loaded from: classes.dex */
class C0238ba implements InterfaceC0239bb {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1100a = C1620c.m4563a((Class<?>) C0238ba.class);

    /* JADX INFO: renamed from: b */
    private static AtomicLong f1101b = new AtomicLong();

    /* JADX INFO: renamed from: d */
    private final String f1103d;

    /* JADX INFO: renamed from: f */
    private final C0227aq f1105f;

    /* JADX INFO: renamed from: i */
    private volatile boolean f1108i;

    /* JADX INFO: renamed from: j */
    private volatile boolean f1109j;

    /* JADX INFO: renamed from: k */
    private volatile long f1110k;

    /* JADX INFO: renamed from: n */
    private final boolean f1113n;

    /* JADX INFO: renamed from: o */
    private final List<StackTraceElement[]> f1114o;

    /* JADX INFO: renamed from: p */
    private final List<StackTraceElement[]> f1115p;

    /* JADX INFO: renamed from: q */
    private InterfaceC0287k f1116q;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f1102c = new AtomicInteger();

    /* JADX INFO: renamed from: g */
    private volatile int f1106g = -1;

    /* JADX INFO: renamed from: h */
    private volatile String f1107h = "?????";

    /* JADX INFO: renamed from: l */
    private final AtomicLong f1111l = new AtomicLong(0);

    /* JADX INFO: renamed from: m */
    private final AtomicBoolean f1112m = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e */
    private final String f1104e = this.f1107h;

    C0238ba(C0227aq c0227aq, String str) {
        this.f1105f = c0227aq.m704e();
        this.f1103d = str.toUpperCase();
        this.f1113n = this.f1105f.m697a().mo48am();
        if (this.f1113n) {
            this.f1114o = new LinkedList();
            this.f1115p = new LinkedList();
        } else {
            this.f1114o = null;
            this.f1115p = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m817a(String str, String str2) {
        return this.f1103d.equalsIgnoreCase(str) && (str2 == null || str2.startsWith("??") || this.f1107h.equalsIgnoreCase(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0238ba)) {
            return false;
        }
        C0238ba c0238ba = (C0238ba) obj;
        return m817a(c0238ba.f1103d, c0238ba.f1107h);
    }

    @Override // p000a.InterfaceC0008af
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0008af> T mo101a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: a */
    public final C0238ba m814a(boolean z) {
        long jIncrementAndGet = this.f1111l.incrementAndGet();
        if (f1100a.mo4536b()) {
            f1100a.mo4532a("Acquire tree " + jIncrementAndGet + " " + this);
        }
        if (z && this.f1113n) {
            synchronized (this.f1114o) {
                this.f1114o.add(m809a(Thread.currentThread().getStackTrace()));
            }
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f1112m.compareAndSet(false, true)) {
                    f1100a.mo4534b("Reacquire session");
                    this.f1105f.m704e();
                }
            }
        }
        return this;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m820b(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m815a() {
        m820b(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m820b(boolean z) {
        long jDecrementAndGet = this.f1111l.decrementAndGet();
        if (f1100a.mo4536b()) {
            f1100a.mo4532a("Release tree " + jDecrementAndGet + " " + this);
        }
        if (z && this.f1113n) {
            synchronized (this.f1115p) {
                this.f1115p.add(m809a(Thread.currentThread().getStackTrace()));
            }
        }
        if (jDecrementAndGet == 0) {
            synchronized (this) {
                f1100a.mo4534b("Usage dropped to zero, release session");
                if (this.f1112m.compareAndSet(true, false)) {
                    this.f1105f.m705f();
                }
            }
            return;
        }
        if (jDecrementAndGet < 0) {
            f1100a.mo4543e("Usage count dropped below zero ".concat(String.valueOf(this)));
            m810k();
            throw new C0297u("Usage count dropped below zero");
        }
    }

    /* JADX INFO: renamed from: a */
    private static StackTraceElement[] m809a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = 2;
        int i2 = 2;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (i == i2 && C0238ba.class.getName().equals(stackTraceElement.getClassName()) && "close".equals(stackTraceElement.getMethodName())) {
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
        if (m821b() && this.f1111l.get() != 0) {
            f1100a.mo4540d("Tree was not properly released");
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m821b() {
        return this.f1106g != -1 && this.f1105f.m710k() && this.f1102c.get() == 2;
    }

    /* JADX INFO: renamed from: c */
    public final String m822c() {
        return this.f1107h;
    }

    /* JADX INFO: renamed from: d */
    public final String m823d() {
        return this.f1103d;
    }

    /* JADX INFO: renamed from: e */
    final void m824e() {
        this.f1109j = true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m825f() {
        return this.f1109j;
    }

    /* JADX INFO: renamed from: a */
    public final void m816a(InterfaceC0287k interfaceC0287k) {
        this.f1116q = interfaceC0287k;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0287k m826g() {
        return this.f1116q;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m827h() throws java.lang.Throwable {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f1102c
            int r0 = r0.get()
            r1 = 2
            if (r0 != r1) goto Lc
            boolean r0 = r4.f1108i
        Lb:
            return r0
        Lc:
            a.g.aq r0 = r4.f1105f
            a.g.as r3 = r0.m707h()
            r2 = 0
            a.d.l r0 = r3.m745f()     // Catch: java.lang.Throwable -> L21 java.lang.Throwable -> L36
            boolean r0 = r0.mo281h()     // Catch: java.lang.Throwable -> L21 java.lang.Throwable -> L36
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0238ba.m827h():boolean");
    }

    /* JADX INFO: renamed from: i */
    public final C0227aq m828i() {
        return this.f1105f.m704e();
    }

    /* JADX INFO: renamed from: j */
    public final long m829j() {
        return this.f1110k;
    }

    public int hashCode() {
        return this.f1103d.hashCode() + (this.f1107h.hashCode() * 7);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0067d> T m813a(InterfaceC0126e<T> interfaceC0126e, EnumC0261u... enumC0261uArr) {
        return (T) m812a(interfaceC0126e, (InterfaceC0067d) null, enumC0261uArr.length > 0 ? EnumSet.copyOf((Collection) Arrays.asList(enumC0261uArr)) : EnumSet.noneOf(EnumC0261u.class));
    }

    /* JADX INFO: renamed from: a */
    final <T extends InterfaceC0067d> T m811a(InterfaceC0055c interfaceC0055c, T t) {
        return (T) m812a(interfaceC0055c, t, Collections.emptySet());
    }

    /* JADX INFO: renamed from: a */
    private void m808a(C0229as c0229as, C0227aq c0227aq, InterfaceC0181m interfaceC0181m) throws C0044d {
        if (!interfaceC0181m.mo308h()) {
            throw new C0214ad("TreeID is invalid");
        }
        this.f1106g = interfaceC0181m.mo508d_();
        String strMo309p_ = interfaceC0181m.mo309p_();
        if (strMo309p_ == null && !c0229as.m746g()) {
            throw new C0214ad("Service is NULL");
        }
        this.f1107h = strMo309p_;
        this.f1108i = interfaceC0181m.mo307g();
        this.f1110k = f1101b.incrementAndGet();
        this.f1102c.set(2);
        try {
            m807a(c0229as, c0227aq);
        } catch (C0044d e) {
            try {
                c0229as.m933t();
            } catch (IOException e2) {
                f1100a.mo4541d("Failed to disconnect transport", e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m807a(C0229as c0229as, C0227aq c0227aq) throws C0044d {
        if (!c0229as.m746g() || c0229as.m747h() == null || !c0227aq.m697a().mo64i()) {
            f1100a.mo4534b("Secure negotiation does not apply");
            return;
        }
        C0162f c0162f = (C0162f) c0229as.m745f();
        if (c0162f.mo279e().m961a(EnumC0289m.SMB311)) {
            f1100a.mo4534b("Secure negotiation does not apply, is SMB3.1");
            return;
        }
        C0161e c0161e = new C0161e(c0227aq.m697a(), c0229as.m724a(c0162f));
        f1100a.mo4534b("Sending VALIDATE_NEGOTIATE_INFO");
        C0147a c0147a = new C0147a(c0227aq.m697a(), 1311236);
        c0147a.m475k();
        c0147a.m474a(new C0152f(c0161e.m492l(), c0161e.m494n(), (short) c0161e.m491k(), c0161e.m493m()));
        try {
            C0153g c0153g = (C0153g) ((C0148b) m813a(c0147a, EnumC0261u.NO_RETRY)).m477a(C0153g.class);
            if (c0162f.m501Y() != c0153g.m484c() || c0162f.m498V() != c0153g.m482a() || c0162f.m502s() != c0153g.m485d() || !Arrays.equals(c0162f.m496I(), c0153g.m483b())) {
                f1100a.mo4534b("Secure negotiation failure");
                throw new C0044d("Mismatched attributes validating negotiate info");
            }
            f1100a.mo4534b("Secure negotiation OK");
        } catch (C0265y e) {
            throw new C0264x("Signature error during negotiate validation", e);
        } catch (C0214ad e2) {
            if (f1100a.mo4539c()) {
                f1100a.mo4534b(String.format("VALIDATE_NEGOTIATE_INFO response code 0x%x", Integer.valueOf(e2.m614b())));
            }
            f1100a.mo4533a("VALIDATE_NEGOTIATE_INFO returned error", e2);
            if ((c0147a.mo218f_().mo328D() && c0147a.mo218f_().mo337N()) || e2.m614b() == -1073741790) {
                throw new C0264x("Signature error during negotiate validation", e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m806a(p000a.p029g.C0229as r4) throws p000a.p029g.C0214ad {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f1102c
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
            org.c.b r0 = p000a.p029g.C0238ba.f1100a     // Catch: java.lang.InterruptedException -> L22
            java.lang.String r1 = "Waiting for transport"
            r0.mo4534b(r1)     // Catch: java.lang.InterruptedException -> L22
            r4.wait()     // Catch: java.lang.InterruptedException -> L22
            goto L0
        L22:
            r0 = move-exception
            a.g.ad r1 = new a.g.ad
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0238ba.m806a(a.g.as):int");
    }

    /* JADX INFO: renamed from: k */
    private void m810k() {
        if (this.f1113n) {
            synchronized (this.f1114o) {
                Iterator<StackTraceElement[]> it = this.f1114o.iterator();
                while (it.hasNext()) {
                    f1100a.mo4534b("Acquire " + Arrays.toString(it.next()));
                }
            }
            synchronized (this.f1115p) {
                Iterator<StackTraceElement[]> it2 = this.f1115p.iterator();
                while (it2.hasNext()) {
                    f1100a.mo4534b("Release " + Arrays.toString(it2.next()));
                }
            }
        }
    }

    public String toString() {
        return "SmbTree[share=" + this.f1103d + ",service=" + this.f1107h + ",tid=" + this.f1106g + ",inDfs=" + this.f1108i + ",inDomainDfs=" + this.f1109j + ",connectionState=" + this.f1102c + ",usage=" + this.f1111l.get() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final <T extends p000a.p006d.InterfaceC0067d> T m812a(p000a.p006d.InterfaceC0055c r11, T r12, java.util.Set<p000a.p029g.EnumC0261u> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0238ba.m812a(a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final <T extends p000a.p006d.InterfaceC0067d> T m819b(p000a.p006d.InterfaceC0055c r12, T r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0238ba.m819b(a.d.c, a.d.d):a.d.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean m818a(boolean r11, boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0238ba.m818a(boolean, boolean):boolean");
    }
}
