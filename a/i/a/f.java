package a.i.a;

import a.u;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Transport.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements AutoCloseable, Runnable {
    private static int f = 0;
    private static final org.c.b g = org.c.c.a((Class<?>) f.class);
    protected volatile int a = 0;
    protected String b;
    protected final Object c;
    protected final Object d;
    protected final Map<Long, e> e;
    private volatile Thread h;
    private volatile g i;
    private final AtomicLong j;

    protected abstract int a(c cVar);

    protected abstract void a(e eVar);

    protected abstract void a(Long l);

    protected abstract boolean a(boolean z, boolean z2);

    protected abstract long b(c cVar);

    protected abstract void c(c cVar);

    protected abstract void n();

    protected abstract Long o();

    public f() {
        StringBuilder sb = new StringBuilder("Transport");
        int i = f;
        f = i + 1;
        this.b = sb.append(i).toString();
        this.c = new Object();
        this.d = new Object();
        this.e = new ConcurrentHashMap(10);
        this.j = new AtomicLong(1L);
    }

    public static int a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
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

    public f q() {
        long jIncrementAndGet = this.j.incrementAndGet();
        if (g.b()) {
            g.a("Acquire transport " + jIncrementAndGet + " " + this);
        }
        return this;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        r();
    }

    public final void r() {
        long jDecrementAndGet = this.j.decrementAndGet();
        if (g.b()) {
            g.a("Release transport " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new u("Usage count dropped below zero");
            }
        } else if (g.b()) {
            g.a("Transport usage dropped to zero ".concat(String.valueOf(this)));
        }
    }

    protected void finalize() {
        if (!d() && this.j.get() != 0) {
            g.d("Session was not properly released");
        }
    }

    protected final long s() {
        return this.j.get();
    }

    public boolean d() {
        return this.a == 4 || this.a == 5 || this.a == 6 || this.a == 0;
    }

    public boolean e() {
        return this.a == 5 || this.a == 6;
    }

    public final <T extends e> T a(c cVar, T t, Set<a.g.u> set) throws g {
        if (d() && this.a != 5) {
            throw new g("Transport is disconnected " + this.b);
        }
        try {
            try {
                long jA = !set.contains(a.g.u.b) ? a(cVar) : 0L;
                long jA2 = a(cVar, t, set, jA);
                c(cVar);
                if (Thread.currentThread() == this.h) {
                    synchronized (this.c) {
                        Long lO = o();
                        if (lO.longValue() == jA2) {
                            a(t);
                            t.F();
                            e eVarV = t;
                            while (eVarV != null) {
                                this.e.remove(Long.valueOf(eVarV.J()));
                                cVar = cVar.s();
                                if (cVar == null) {
                                    return t;
                                }
                                eVarV = cVar.V();
                            }
                            return t;
                        }
                        a(lO);
                    }
                }
                while (t != null) {
                    if (cVar == null) {
                        break;
                    }
                }
                return (T) a(cVar, t, jA);
            } catch (IOException e) {
                g.d("sendrecv failed", e);
                try {
                    t();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                    g.c("disconnect failed", e2);
                }
                throw e;
            } catch (InterruptedException e3) {
                throw new g(e3);
            }
        } finally {
            while (t != null) {
                this.e.remove(Long.valueOf(t.J()));
                cVar = cVar.s();
                if (cVar == null) {
                    break;
                }
                t = (T) cVar.V();
            }
        }
    }

    private <T extends e> long a(c cVar, T t, Set<a.g.u> set, long j) {
        long j2 = 0;
        while (t != null) {
            t.e_();
            if (set.contains(a.g.u.d)) {
                t.R();
            }
            long jB = b(cVar);
            if (j2 == 0) {
                j2 = jB;
            }
            if (j > 0) {
                t.a(Long.valueOf(System.currentTimeMillis() + j));
            } else {
                t.a(null);
            }
            t.a(jB);
            this.e.put(Long.valueOf(jB), t);
            cVar = cVar.s();
            if (cVar == null) {
                break;
            }
            t = (T) cVar.V();
        }
        return j2;
    }

    private <T extends e> T a(c cVar, T t, long j) {
        c cVarS = cVar;
        e eVarV = t;
        while (eVarV != null) {
            synchronized (eVarV) {
                if (eVarV.D()) {
                    cVarS = cVarS.s();
                    if (cVarS == null) {
                        break;
                    }
                    eVarV = cVarS.V();
                } else if (j > 0) {
                    eVarV.wait(j);
                    if (eVarV.D() || !a(cVarS, eVarV)) {
                        if (eVarV.P()) {
                            throw new g(this.b + " error reading response to " + cVarS, eVarV.O());
                        }
                        if (d() && this.a != 5) {
                            throw new g(String.format("Transport was disconnected while waiting for a response (transport: %s state: %d),", this.b, Integer.valueOf(this.a)));
                        }
                        j = eVarV.S().longValue() - System.currentTimeMillis();
                        if (j <= 0) {
                            if (g.c()) {
                                g.b("State is " + this.a);
                            }
                            throw new d(this.b + " timedout waiting for response to " + cVarS);
                        }
                    }
                } else {
                    eVarV.wait();
                    if (!a(cVar, eVarV)) {
                        if (g.c()) {
                            g.b("Wait returned state is " + this.a);
                        }
                        if (d()) {
                            throw new InterruptedException("Transport was disconnected while waiting for a response");
                        }
                    }
                }
            }
        }
        return t;
    }

    protected <T extends e> boolean a(c cVar, T t) {
        return false;
    }

    public final synchronized boolean a(long j) {
        boolean z = true;
        synchronized (this) {
            int i = this.a;
            try {
                try {
                    try {
                        switch (i) {
                            case 1:
                                this.h.wait(j);
                                switch (this.a) {
                                    case 1:
                                        this.a = 6;
                                        b(j);
                                        throw new a("Connection timeout");
                                    case 2:
                                        if (this.i != null) {
                                            this.a = 4;
                                            b(j);
                                            throw this.i;
                                        }
                                        this.a = 3;
                                        int i2 = this.a;
                                        if (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
                                            g.e("Invalid state: ".concat(String.valueOf(i2)));
                                            this.a = 6;
                                            b(j);
                                        }
                                        break;
                                }
                            case 0:
                                if (g.c()) {
                                    g.b("Connecting " + this.b);
                                }
                                this.a = 1;
                                this.i = null;
                                Thread thread = new Thread(this, this.b);
                                thread.setDaemon(true);
                                this.h = thread;
                                synchronized (this.h) {
                                    thread.start();
                                    thread.wait(j);
                                    switch (this.a) {
                                        case 1:
                                            this.a = 6;
                                            throw new a("Connection timeout");
                                        case 2:
                                            if (this.i != null) {
                                                this.a = 4;
                                                throw this.i;
                                            }
                                            this.a = 3;
                                            int i3 = this.a;
                                            if (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
                                                g.e("Invalid state: ".concat(String.valueOf(i3)));
                                                this.a = 6;
                                                b(j);
                                            }
                                            break;
                                        case 3:
                                            int i4 = this.a;
                                            if (i4 != 0 && i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6) {
                                                g.e("Invalid state: ".concat(String.valueOf(i4)));
                                                this.a = 6;
                                                b(j);
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
                                throw new g("Invalid state: ".concat(String.valueOf(i)));
                            case 3:
                                int i5 = this.a;
                                if (i5 != 0 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6) {
                                    g.e("Invalid state: ".concat(String.valueOf(i5)));
                                    this.a = 6;
                                    b(j);
                                }
                                break;
                            case 4:
                                this.a = 6;
                                throw new g("Connection in error", this.i);
                            case 5:
                            case 6:
                                g.b("Trying to connect a disconnected transport");
                                int i6 = this.a;
                                if (i6 != 0 && i6 != 3 && i6 != 4 && i6 != 5 && i6 != 6) {
                                    g.e("Invalid state: ".concat(String.valueOf(i6)));
                                    this.a = 6;
                                    b(j);
                                }
                                z = false;
                                break;
                        }
                    } catch (a e) {
                        b(j);
                        this.a = 0;
                        throw e;
                    } catch (InterruptedException e2) {
                        this.a = 6;
                        b(j);
                        throw new g(e2);
                    }
                } catch (g e3) {
                    b(j);
                    throw e3;
                }
            } finally {
                int i7 = this.a;
                if (i7 != 0 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
                    g.e("Invalid state: ".concat(String.valueOf(i7)));
                    this.a = 6;
                    b(j);
                }
            }
        }
        return z;
    }

    private synchronized void b(long j) {
        Thread thread = this.h;
        if (thread != null && Thread.currentThread() != thread) {
            this.h = null;
            try {
                g.b("Interrupting transport thread");
                thread.interrupt();
                g.b("Joining transport thread");
                thread.join(j);
                g.b("Joined transport thread");
            } catch (InterruptedException e) {
                throw new g("Failed to join transport thread", e);
            }
        } else if (thread != null) {
            this.h = null;
        }
    }

    public final synchronized boolean t() {
        return b(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0005, B:6:0x0008, B:8:0x0026, B:13:0x002b, B:18:0x0038, B:24:0x0046, B:25:0x0048), top: B:29:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r5)
            int r2 = r5.a     // Catch: java.lang.Throwable -> L27
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
            org.c.b r2 = a.i.a.f.g     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "Invalid state: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            int r4 = r5.a     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L27
            r2.e(r3)     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r5.h = r2     // Catch: java.lang.Throwable -> L27
            r2 = 6
            r5.a = r2     // Catch: java.lang.Throwable -> L27
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
            java.util.Map<java.lang.Long, a.i.a.e> r2 = r5.e     // Catch: java.lang.Throwable -> L27
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L37
            if (r6 != 0) goto L37
            if (r7 != 0) goto L24
        L37:
            r1 = 5
            r5.a = r1     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L44
            boolean r1 = r5.a(r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L44
            r2 = 6
            r5.a = r2     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L44
            r0 = r1
        L42:
            monitor-exit(r5)
            return r0
        L44:
            r1 = move-exception
            r2 = 6
            r5.a = r2     // Catch: java.lang.Throwable -> L27
        L48:
            r2 = 0
            r5.h = r2     // Catch: java.lang.Throwable -> L27
            r2 = 6
            r5.a = r2     // Catch: java.lang.Throwable -> L27
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.a.f.b(boolean, boolean):boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            if (this.a != 5 && this.a != 6) {
                n();
            }
            synchronized (threadCurrentThread) {
                if (threadCurrentThread == this.h) {
                    this.a = 2;
                    threadCurrentThread.notify();
                    while (this.h == Thread.currentThread()) {
                        try {
                            synchronized (this.c) {
                                try {
                                    Long lO = o();
                                    if (lO == null) {
                                        synchronized (this) {
                                            Iterator<e> it = this.e.values().iterator();
                                            while (it.hasNext()) {
                                                it.next().G();
                                            }
                                        }
                                        throw new IOException("end of stream");
                                    }
                                    e eVar = this.e.get(lO);
                                    if (eVar == null) {
                                        if (g.c()) {
                                            g.b("Unexpected message id, skipping message ".concat(String.valueOf(lO)));
                                        }
                                        a(lO);
                                    } else {
                                        a(eVar);
                                        eVar.F();
                                    }
                                } catch (SocketTimeoutException e) {
                                    g.a("Socket timeout during peekKey", e);
                                    if (this.j.get() <= 0) {
                                        if (g.c()) {
                                            g.b(String.format("Idle timeout on %s", this.b));
                                        }
                                        throw e;
                                    }
                                    if (g.c()) {
                                        g.b("Transport still in use, no idle timeout ".concat(String.valueOf(this)));
                                    }
                                    for (e eVar2 : this.e.values()) {
                                        synchronized (eVar2) {
                                            eVar2.notifyAll();
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            String message = e2.getMessage();
                            boolean z = (e2 instanceof SocketTimeoutException) || (message != null && message.equals("Read timed out"));
                            if (message != null && message.equals("Socket closed")) {
                                g.a("Remote closed connection");
                            } else if (!z) {
                                g.b("recv failed", e2);
                            }
                            synchronized (this) {
                                try {
                                    b(!z, false);
                                } catch (IOException e3) {
                                    e2.addSuppressed(e3);
                                    g.d("Failed to disconnect", e3);
                                }
                                g.b("Disconnected");
                                Iterator<Map$Entry<Long, e>> it2 = this.e.entrySet().iterator();
                                while (it2.hasNext()) {
                                    it2.next().getValue().a(e2);
                                    it2.remove();
                                }
                                g.b("Notified clients");
                            }
                        }
                    }
                }
            }
        } catch (Exception e4) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread == this.h) {
                    if (e4 instanceof SocketTimeoutException) {
                        this.i = new a(e4);
                    } else {
                        this.i = new g(e4);
                    }
                    this.a = 2;
                    threadCurrentThread.notify();
                } else if (e4 instanceof SocketTimeoutException) {
                    g.b("Timeout connecting", e4);
                } else {
                    g.d("Exception in transport thread", e4);
                }
            }
        } catch (Throwable th) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.h) {
                    return;
                }
                this.a = 2;
                threadCurrentThread.notify();
                throw th;
            }
        }
    }

    public String toString() {
        return this.b;
    }
}
