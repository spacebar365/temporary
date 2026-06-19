package p000a.p031i.p032a;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.p029g.EnumC0261u;

/* JADX INFO: renamed from: a.i.a.f */
/* JADX INFO: compiled from: Transport.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0279f implements AutoCloseable, Runnable {

    /* JADX INFO: renamed from: f */
    private static int f1237f = 0;

    /* JADX INFO: renamed from: g */
    private static final InterfaceC1612b f1238g = C1620c.m4563a((Class<?>) AbstractRunnableC0279f.class);

    /* JADX INFO: renamed from: a */
    protected volatile int f1239a = 0;

    /* JADX INFO: renamed from: b */
    protected String f1240b;

    /* JADX INFO: renamed from: c */
    protected final Object f1241c;

    /* JADX INFO: renamed from: d */
    protected final Object f1242d;

    /* JADX INFO: renamed from: e */
    protected final Map<Long, InterfaceC0278e> f1243e;

    /* JADX INFO: renamed from: h */
    private volatile Thread f1244h;

    /* JADX INFO: renamed from: i */
    private volatile C0280g f1245i;

    /* JADX INFO: renamed from: j */
    private final AtomicLong f1246j;

    /* JADX INFO: renamed from: a */
    protected abstract int mo725a(InterfaceC0276c interfaceC0276c);

    /* JADX INFO: renamed from: a */
    protected abstract void mo731a(InterfaceC0278e interfaceC0278e);

    /* JADX INFO: renamed from: a */
    protected abstract void mo732a(Long l);

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo736a(boolean z, boolean z2);

    /* JADX INFO: renamed from: b */
    protected abstract long mo738b(InterfaceC0276c interfaceC0276c);

    /* JADX INFO: renamed from: c */
    protected abstract void mo742c(InterfaceC0276c interfaceC0276c);

    /* JADX INFO: renamed from: n */
    protected abstract void mo753n();

    /* JADX INFO: renamed from: o */
    protected abstract Long mo754o();

    public AbstractRunnableC0279f() {
        StringBuilder sb = new StringBuilder("Transport");
        int i = f1237f;
        f1237f = i + 1;
        this.f1240b = sb.append(i).toString();
        this.f1241c = new Object();
        this.f1242d = new Object();
        this.f1243e = new ConcurrentHashMap(10);
        this.f1246j = new AtomicLong(1L);
    }

    /* JADX INFO: renamed from: a */
    public static int m924a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i + i2 > bArr.length) {
            throw new IOException("Buffer too short, bufsize " + bArr.length + " read " + i2);
        }
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 <= 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: q */
    public AbstractRunnableC0279f mo756q() {
        long jIncrementAndGet = this.f1246j.incrementAndGet();
        if (f1238g.mo4536b()) {
            f1238g.mo4532a("Acquire transport " + jIncrementAndGet + " " + this);
        }
        return this;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m931r();
    }

    /* JADX INFO: renamed from: r */
    public final void m931r() {
        long jDecrementAndGet = this.f1246j.decrementAndGet();
        if (f1238g.mo4536b()) {
            f1238g.mo4532a("Release transport " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C0297u("Usage count dropped below zero");
            }
        } else if (f1238g.mo4536b()) {
            f1238g.mo4532a("Transport usage dropped to zero ".concat(String.valueOf(this)));
        }
    }

    protected void finalize() {
        if (!mo743d() && this.f1246j.get() != 0) {
            f1238g.mo4540d("Session was not properly released");
        }
    }

    /* JADX INFO: renamed from: s */
    protected final long m932s() {
        return this.f1246j.get();
    }

    /* JADX INFO: renamed from: d */
    public boolean mo743d() {
        return this.f1239a == 4 || this.f1239a == 5 || this.f1239a == 6 || this.f1239a == 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo744e() {
        return this.f1239a == 5 || this.f1239a == 6;
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0278e> T m928a(InterfaceC0276c interfaceC0276c, T t, Set<EnumC0261u> set) throws C0280g {
        if (mo743d() && this.f1239a != 5) {
            throw new C0280g("Transport is disconnected " + this.f1240b);
        }
        try {
            try {
                long jMo725a = !set.contains(EnumC0261u.NO_TIMEOUT) ? mo725a(interfaceC0276c) : 0L;
                long jM925a = m925a(interfaceC0276c, t, set, jMo725a);
                mo742c(interfaceC0276c);
                if (Thread.currentThread() == this.f1244h) {
                    synchronized (this.f1241c) {
                        Long lMo754o = mo754o();
                        if (lMo754o.longValue() == jM925a) {
                            mo731a(t);
                            t.mo330F();
                            InterfaceC0278e interfaceC0278eMo218f_ = t;
                            while (interfaceC0278eMo218f_ != null) {
                                this.f1243e.remove(Long.valueOf(interfaceC0278eMo218f_.mo333J()));
                                interfaceC0276c = interfaceC0276c.mo251s();
                                if (interfaceC0276c == null) {
                                    return t;
                                }
                                interfaceC0278eMo218f_ = interfaceC0276c.mo218f_();
                            }
                            return t;
                        }
                        mo732a(lMo754o);
                    }
                }
                while (t != null) {
                    if (interfaceC0276c == null) {
                        break;
                    }
                }
                return (T) m926a(interfaceC0276c, t, jMo725a);
            } catch (IOException e) {
                f1238g.mo4541d("sendrecv failed", e);
                try {
                    m933t();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                    f1238g.mo4538c("disconnect failed", e2);
                }
                throw e;
            } catch (InterruptedException e3) {
                throw new C0280g(e3);
            }
        } finally {
            while (t != null) {
                this.f1243e.remove(Long.valueOf(t.mo333J()));
                interfaceC0276c = interfaceC0276c.mo251s();
                if (interfaceC0276c == null) {
                    break;
                }
                t = (T) interfaceC0276c.mo218f_();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0278e> long m925a(InterfaceC0276c interfaceC0276c, T t, Set<EnumC0261u> set, long j) {
        long j2 = 0;
        while (t != null) {
            t.mo217e_();
            if (set.contains(EnumC0261u.RETAIN_PAYLOAD)) {
                t.mo341R();
            }
            long jMo738b = mo738b(interfaceC0276c);
            if (j2 == 0) {
                j2 = jMo738b;
            }
            if (j > 0) {
                t.mo352a(Long.valueOf(System.currentTimeMillis() + j));
            } else {
                t.mo352a(null);
            }
            t.mo209a(jMo738b);
            this.f1243e.put(Long.valueOf(jMo738b), t);
            interfaceC0276c = interfaceC0276c.mo251s();
            if (interfaceC0276c == null) {
                break;
            }
            t = (T) interfaceC0276c.mo218f_();
        }
        return j2;
    }

    /* JADX INFO: renamed from: a */
    private <T extends InterfaceC0278e> T m926a(InterfaceC0276c interfaceC0276c, T t, long j) {
        InterfaceC0276c interfaceC0276cMo251s = interfaceC0276c;
        InterfaceC0278e interfaceC0278eMo218f_ = t;
        while (interfaceC0278eMo218f_ != null) {
            synchronized (interfaceC0278eMo218f_) {
                if (interfaceC0278eMo218f_.mo328D()) {
                    interfaceC0276cMo251s = interfaceC0276cMo251s.mo251s();
                    if (interfaceC0276cMo251s == null) {
                        break;
                    }
                    interfaceC0278eMo218f_ = interfaceC0276cMo251s.mo218f_();
                } else if (j > 0) {
                    interfaceC0278eMo218f_.wait(j);
                    if (interfaceC0278eMo218f_.mo328D() || !mo735a(interfaceC0276cMo251s, interfaceC0278eMo218f_)) {
                        if (interfaceC0278eMo218f_.mo339P()) {
                            throw new C0280g(this.f1240b + " error reading response to " + interfaceC0276cMo251s, interfaceC0278eMo218f_.mo338O());
                        }
                        if (mo743d() && this.f1239a != 5) {
                            throw new C0280g(String.format("Transport was disconnected while waiting for a response (transport: %s state: %d),", this.f1240b, Integer.valueOf(this.f1239a)));
                        }
                        j = interfaceC0278eMo218f_.mo342S().longValue() - System.currentTimeMillis();
                        if (j <= 0) {
                            if (f1238g.mo4539c()) {
                                f1238g.mo4534b("State is " + this.f1239a);
                            }
                            throw new C0277d(this.f1240b + " timedout waiting for response to " + interfaceC0276cMo251s);
                        }
                    }
                } else {
                    interfaceC0278eMo218f_.wait();
                    if (!mo735a(interfaceC0276c, interfaceC0278eMo218f_)) {
                        if (f1238g.mo4539c()) {
                            f1238g.mo4534b("Wait returned state is " + this.f1239a);
                        }
                        if (mo743d()) {
                            throw new InterruptedException("Transport was disconnected while waiting for a response");
                        }
                    }
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: a */
    protected <T extends InterfaceC0278e> boolean mo735a(InterfaceC0276c interfaceC0276c, T t) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m929a(long j) {
        boolean z = true;
        synchronized (this) {
            int i = this.f1239a;
            try {
                try {
                    try {
                        switch (i) {
                            case 1:
                                this.f1244h.wait(j);
                                switch (this.f1239a) {
                                    case 1:
                                        this.f1239a = 6;
                                        m927b(j);
                                        throw new C0274a("Connection timeout");
                                    case 2:
                                        if (this.f1245i != null) {
                                            this.f1239a = 4;
                                            m927b(j);
                                            throw this.f1245i;
                                        }
                                        this.f1239a = 3;
                                        int i2 = this.f1239a;
                                        if (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
                                            f1238g.mo4543e("Invalid state: ".concat(String.valueOf(i2)));
                                            this.f1239a = 6;
                                            m927b(j);
                                        }
                                        break;
                                }
                            case 0:
                                if (f1238g.mo4539c()) {
                                    f1238g.mo4534b("Connecting " + this.f1240b);
                                }
                                this.f1239a = 1;
                                this.f1245i = null;
                                Thread thread = new Thread(this, this.f1240b);
                                thread.setDaemon(true);
                                this.f1244h = thread;
                                synchronized (this.f1244h) {
                                    thread.start();
                                    thread.wait(j);
                                    switch (this.f1239a) {
                                        case 1:
                                            this.f1239a = 6;
                                            throw new C0274a("Connection timeout");
                                        case 2:
                                            if (this.f1245i != null) {
                                                this.f1239a = 4;
                                                throw this.f1245i;
                                            }
                                            this.f1239a = 3;
                                            int i3 = this.f1239a;
                                            if (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
                                                f1238g.mo4543e("Invalid state: ".concat(String.valueOf(i3)));
                                                this.f1239a = 6;
                                                m927b(j);
                                            }
                                            break;
                                        case 3:
                                            int i4 = this.f1239a;
                                            if (i4 != 0 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6) {
                                                f1238g.mo4543e("Invalid state: ".concat(String.valueOf(i4)));
                                                this.f1239a = 6;
                                                m927b(j);
                                            }
                                            break;
                                        default:
                                            z = false;
                                            break;
                                    }
                                }
                                break;
                            case 2:
                            default:
                                throw new C0280g("Invalid state: ".concat(String.valueOf(i)));
                            case 3:
                                int i5 = this.f1239a;
                                if (i5 != 0 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6) {
                                    f1238g.mo4543e("Invalid state: ".concat(String.valueOf(i5)));
                                    this.f1239a = 6;
                                    m927b(j);
                                }
                                break;
                            case 4:
                                this.f1239a = 6;
                                throw new C0280g("Connection in error", this.f1245i);
                            case 5:
                            case 6:
                                f1238g.mo4534b("Trying to connect a disconnected transport");
                                int i6 = this.f1239a;
                                if (i6 != 0 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 6) {
                                    f1238g.mo4543e("Invalid state: ".concat(String.valueOf(i6)));
                                    this.f1239a = 6;
                                    m927b(j);
                                }
                                z = false;
                                break;
                        }
                    } catch (C0274a e) {
                        m927b(j);
                        this.f1239a = 0;
                        throw e;
                    } catch (InterruptedException e2) {
                        this.f1239a = 6;
                        m927b(j);
                        throw new C0280g(e2);
                    }
                } catch (C0280g e3) {
                    m927b(j);
                    throw e3;
                }
            } finally {
                int i7 = this.f1239a;
                if (i7 != 0 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
                    f1238g.mo4543e("Invalid state: ".concat(String.valueOf(i7)));
                    this.f1239a = 6;
                    m927b(j);
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m927b(long j) {
        Thread thread = this.f1244h;
        if (thread != null && Thread.currentThread() != thread) {
            this.f1244h = null;
            try {
                f1238g.mo4534b("Interrupting transport thread");
                thread.interrupt();
                f1238g.mo4534b("Joining transport thread");
                thread.join(j);
                f1238g.mo4534b("Joined transport thread");
            } catch (InterruptedException e) {
                throw new C0280g("Failed to join transport thread", e);
            }
        } else if (thread != null) {
            this.f1244h = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m933t() {
        return m930b(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0005, B:6:0x0008, B:8:0x0026, B:13:0x002b, B:18:0x0038, B:24:0x0046, B:25:0x0048), top: B:29:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m930b(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r5)
            int r2 = r5.f1239a     // Catch: java.lang.Throwable -> L27
            switch(r2) {
                case 0: goto L42;
                case 1: goto L8;
                case 2: goto L2a;
                case 3: goto L2b;
                case 4: goto L48;
                case 5: goto L42;
                case 6: goto L42;
                default: goto L8;
            }     // Catch: java.lang.Throwable -> L27
        L8:
            org.c.b r2 = p000a.p031i.p032a.AbstractRunnableC0279f.f1238g     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "Invalid state: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            int r4 = r5.f1239a     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L27
            r2.mo4543e(r3)     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r5.f1244h = r2     // Catch: java.lang.Throwable -> L27
            r2 = 6
            r5.f1239a = r2     // Catch: java.lang.Throwable -> L27
        L24:
            if (r1 == 0) goto L42
            throw r1     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L2a:
            r6 = 1
        L2b:
            java.util.Map<java.lang.Long, a.i.a.e> r2 = r5.f1243e     // Catch: java.lang.Throwable -> L27
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L37
            if (r6 != 0) goto L37
            if (r7 != 0) goto L24
        L37:
            r1 = 5
            r5.f1239a = r1     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L44
            boolean r1 = r5.mo736a(r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L44
            r2 = 6
            r5.f1239a = r2     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L44
            r0 = r1
        L42:
            monitor-exit(r5)
            return r0
        L44:
            r1 = move-exception
            r2 = 6
            r5.f1239a = r2     // Catch: java.lang.Throwable -> L27
        L48:
            r2 = 0
            r5.f1244h = r2     // Catch: java.lang.Throwable -> L27
            r2 = 6
            r5.f1239a = r2     // Catch: java.lang.Throwable -> L27
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031i.p032a.AbstractRunnableC0279f.m930b(boolean, boolean):boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            if (this.f1239a != 5 && this.f1239a != 6) {
                mo753n();
            }
            synchronized (threadCurrentThread) {
                if (threadCurrentThread == this.f1244h) {
                    this.f1239a = 2;
                    threadCurrentThread.notify();
                    while (this.f1244h == Thread.currentThread()) {
                        try {
                            synchronized (this.f1241c) {
                                try {
                                    Long lMo754o = mo754o();
                                    if (lMo754o == null) {
                                        synchronized (this) {
                                            Iterator<InterfaceC0278e> it = this.f1243e.values().iterator();
                                            while (it.hasNext()) {
                                                it.next().mo331G();
                                            }
                                        }
                                        throw new IOException("end of stream");
                                    }
                                    InterfaceC0278e interfaceC0278e = this.f1243e.get(lMo754o);
                                    if (interfaceC0278e == null) {
                                        if (f1238g.mo4539c()) {
                                            f1238g.mo4534b("Unexpected message id, skipping message ".concat(String.valueOf(lMo754o)));
                                        }
                                        mo732a(lMo754o);
                                    } else {
                                        mo731a(interfaceC0278e);
                                        interfaceC0278e.mo330F();
                                    }
                                } catch (SocketTimeoutException e) {
                                    f1238g.mo4533a("Socket timeout during peekKey", e);
                                    if (this.f1246j.get() <= 0) {
                                        if (f1238g.mo4539c()) {
                                            f1238g.mo4534b(String.format("Idle timeout on %s", this.f1240b));
                                        }
                                        throw e;
                                    }
                                    if (f1238g.mo4539c()) {
                                        f1238g.mo4534b("Transport still in use, no idle timeout ".concat(String.valueOf(this)));
                                    }
                                    for (InterfaceC0278e interfaceC0278e2 : this.f1243e.values()) {
                                        synchronized (interfaceC0278e2) {
                                            interfaceC0278e2.notifyAll();
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            String message = e2.getMessage();
                            boolean z = (e2 instanceof SocketTimeoutException) || (message != null && message.equals("Read timed out"));
                            if (message != null && message.equals("Socket closed")) {
                                f1238g.mo4532a("Remote closed connection");
                            } else if (!z) {
                                f1238g.mo4535b("recv failed", e2);
                            }
                            synchronized (this) {
                                try {
                                    m930b(!z, false);
                                } catch (IOException e3) {
                                    e2.addSuppressed(e3);
                                    f1238g.mo4541d("Failed to disconnect", e3);
                                }
                                f1238g.mo4534b("Disconnected");
                                Iterator<Map.Entry<Long, InterfaceC0278e>> it2 = this.f1243e.entrySet().iterator();
                                while (it2.hasNext()) {
                                    it2.next().getValue().mo351a(e2);
                                    it2.remove();
                                }
                                f1238g.mo4534b("Notified clients");
                            }
                        }
                    }
                }
            }
        } catch (Exception e4) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread == this.f1244h) {
                    if (e4 instanceof SocketTimeoutException) {
                        this.f1245i = new C0274a(e4);
                    } else {
                        this.f1245i = new C0280g(e4);
                    }
                    this.f1239a = 2;
                    threadCurrentThread.notify();
                } else if (e4 instanceof SocketTimeoutException) {
                    f1238g.mo4535b("Timeout connecting", e4);
                } else {
                    f1238g.mo4541d("Exception in transport thread", e4);
                }
            }
        } catch (Throwable th) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f1244h) {
                    return;
                }
                this.f1239a = 2;
                threadCurrentThread.notify();
                throw th;
            }
        }
    }

    public String toString() {
        return this.f1240b;
    }
}
