package p000a.p029g;

import java.util.concurrent.atomic.AtomicLong;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0126e;
import p000a.p006d.InterfaceC0172f;

/* JADX INFO: renamed from: a.g.ay */
/* JADX INFO: compiled from: SmbTreeHandleImpl.java */
/* JADX INFO: loaded from: classes.dex */
class C0235ay implements InterfaceC0236az {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1096a = C1620c.m4563a((Class<?>) C0235ay.class);

    /* JADX INFO: renamed from: b */
    private final C0225ao f1097b;

    /* JADX INFO: renamed from: c */
    private final C0233aw f1098c;

    /* JADX INFO: renamed from: d */
    private final AtomicLong f1099d = new AtomicLong(1);

    public C0235ay(C0225ao c0225ao, C0233aw c0233aw) {
        this.f1097b = c0225ao;
        this.f1098c = c0233aw.m782b();
    }

    /* JADX INFO: renamed from: d */
    public final C0227aq m792d() {
        return this.f1098c.m787g();
    }

    /* JADX INFO: renamed from: e */
    public final void m793e() {
        this.f1098c.m775a(this.f1097b, (InterfaceC0172f) null);
    }

    @Override // p000a.p029g.InterfaceC0236az
    /* JADX INFO: renamed from: a */
    public final boolean mo791a(int i) {
        return this.f1098c.m781a(i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m794f() {
        return this.f1098c.m785e();
    }

    @Override // p000a.InterfaceC0009ag
    /* JADX INFO: renamed from: a */
    public final InterfaceC0267h mo102a() {
        return this.f1098c.m779a();
    }

    /* JADX INFO: renamed from: g */
    public final long m795g() {
        return this.f1098c.m786f();
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0067d> T m790a(InterfaceC0126e<T> interfaceC0126e, EnumC0261u... enumC0261uArr) {
        return (T) m789a(interfaceC0126e, null, enumC0261uArr);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0067d> T m789a(InterfaceC0055c interfaceC0055c, T t, EnumC0261u... enumC0261uArr) {
        return (T) this.f1098c.m776a(this.f1097b, interfaceC0055c, t, enumC0261uArr);
    }

    @Override // p000a.InterfaceC0009ag, java.lang.AutoCloseable
    public synchronized void close() {
        m797i();
    }

    /* JADX INFO: renamed from: h */
    public final C0235ay m796h() {
        if (this.f1099d.incrementAndGet() == 1) {
            this.f1098c.m782b();
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m797i() {
        long jDecrementAndGet = this.f1099d.decrementAndGet();
        if (jDecrementAndGet == 0) {
            this.f1098c.m783c();
        } else if (jDecrementAndGet < 0) {
            throw new C0297u("Usage count dropped below zero");
        }
    }

    protected void finalize() {
        if (this.f1099d.get() != 0) {
            f1096a.mo4540d("Tree handle was not properly released " + this.f1097b.mo89f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m798j() throws java.lang.Throwable {
        /*
            r8 = this;
            r3 = 0
            a.g.aw r0 = r8.f1098c
            a.g.aq r4 = r0.m787g()
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
            a.d.l r0 = r5.m745f()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            boolean r1 = r0 instanceof p000a.p006d.p010d.p011a.C0081k     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            if (r1 == 0) goto L2c
            a.d.d.a.k r0 = (p000a.p006d.p010d.p011a.C0081k) r0     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            a.d.d.a.b r0 = r0.m277aa()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            int r0 = r0.f323n     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            int r0 = r0 * 1000
            long r0 = (long) r0
            r6 = 60
            long r0 = r0 * r6
            if (r5 == 0) goto L26
            r5.close()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
        L26:
            if (r4 == 0) goto L2b
            r4.close()
        L2b:
            return r0
        L2c:
            if (r5 == 0) goto L31
            r5.close()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
        L31:
            if (r4 == 0) goto L36
            r4.close()
        L36:
            r0 = 0
            goto L2b
        L39:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r1 = move-exception
            r2 = r0
        L3d:
            if (r5 == 0) goto L44
            if (r2 == 0) goto L59
            r5.close()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L56
        L44:
            throw r1     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
        L45:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r1 = move-exception
            r3 = r0
        L49:
            if (r4 == 0) goto L50
            if (r3 == 0) goto L62
            r4.close()     // Catch: java.lang.Throwable -> L5d
        L50:
            throw r1
        L51:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
            goto L44
        L56:
            r0 = move-exception
            r1 = r0
            goto L49
        L59:
            r5.close()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
            goto L44
        L5d:
            r0 = move-exception
            r3.addSuppressed(r0)
            goto L50
        L62:
            r4.close()
            goto L50
        L66:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.m798j():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m799k() throws java.lang.Throwable {
        /*
            r6 = this;
            r1 = 0
            a.g.aw r0 = r6.f1098c
            a.g.aq r4 = r0.m787g()
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
            a.d.l r0 = r5.m745f()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            boolean r2 = r0 instanceof p000a.p006d.p010d.p011a.C0081k     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            if (r2 == 0) goto L26
            a.d.d.a.k r0 = (p000a.p006d.p010d.p011a.C0081k) r0     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            a.d.d.a.b r0 = r0.m277aa()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            java.lang.String r0 = r0.f314e     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            if (r5 == 0) goto L20
            r5.close()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
        L20:
            if (r4 == 0) goto L25
            r4.close()
        L25:
            return r0
        L26:
            if (r5 == 0) goto L2b
            r5.close()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
        L2b:
            if (r4 == 0) goto L30
            r4.close()
        L30:
            r0 = r1
            goto L25
        L32:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L34
        L34:
            r2 = move-exception
            r3 = r0
        L36:
            if (r5 == 0) goto L3d
            if (r3 == 0) goto L54
            r5.close()     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L50
        L3d:
            throw r2     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
        L3e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            r2 = r1
            r3 = r0
        L43:
            if (r4 == 0) goto L4a
            if (r3 == 0) goto L5d
            r4.close()     // Catch: java.lang.Throwable -> L58
        L4a:
            throw r2
        L4b:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
            goto L3d
        L50:
            r0 = move-exception
            r2 = r0
            r3 = r1
            goto L43
        L54:
            r5.close()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
            goto L3d
        L58:
            r0 = move-exception
            r3.addSuppressed(r0)
            goto L4a
        L5d:
            r4.close()
            goto L4a
        L61:
            r0 = move-exception
            r2 = r0
            r3 = r1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.m799k():java.lang.String");
    }

    @Override // p000a.InterfaceC0009ag
    /* JADX INFO: renamed from: c */
    public final int mo104c() {
        return this.f1098c.m788h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m800l() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.f1098c
            a.g.aq r4 = r0.m787g()
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.m745f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            int r0 = r0.mo284j()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            if (r5 == 0) goto L18
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L18:
            if (r4 == 0) goto L1d
            r4.close()
        L1d:
            return r0
        L1e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            r2 = r0
        L22:
            if (r5 == 0) goto L29
            if (r2 == 0) goto L3e
            r5.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L3b
        L29:
            throw r1     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            r3 = r0
        L2e:
            if (r4 == 0) goto L35
            if (r3 == 0) goto L47
            r4.close()     // Catch: java.lang.Throwable -> L42
        L35:
            throw r1
        L36:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L3b:
            r0 = move-exception
            r1 = r0
            goto L2e
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L42:
            r0 = move-exception
            r3.addSuppressed(r0)
            goto L35
        L47:
            r4.close()
            goto L35
        L4b:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.m800l():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // p000a.p029g.InterfaceC0236az
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo801m() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.f1098c
            a.g.aq r4 = r0.m787g()
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.m745f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            int r0 = r0.mo283i_()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            if (r5 == 0) goto L18
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L18:
            if (r4 == 0) goto L1d
            r4.close()
        L1d:
            return r0
        L1e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            r2 = r0
        L22:
            if (r5 == 0) goto L29
            if (r2 == 0) goto L3e
            r5.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L3b
        L29:
            throw r1     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            r3 = r0
        L2e:
            if (r4 == 0) goto L35
            if (r3 == 0) goto L47
            r4.close()     // Catch: java.lang.Throwable -> L42
        L35:
            throw r1
        L36:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L3b:
            r0 = move-exception
            r1 = r0
            goto L2e
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L42:
            r0 = move-exception
            r3.addSuppressed(r0)
            goto L35
        L47:
            r4.close()
            goto L35
        L4b:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.mo801m():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // p000a.p029g.InterfaceC0236az
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo802n() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.f1098c
            a.g.aq r4 = r0.m787g()
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.m745f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            int r0 = r0.mo282h_()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            if (r5 == 0) goto L18
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L18:
            if (r4 == 0) goto L1d
            r4.close()
        L1d:
            return r0
        L1e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            r2 = r0
        L22:
            if (r5 == 0) goto L29
            if (r2 == 0) goto L3e
            r5.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L3b
        L29:
            throw r1     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            r3 = r0
        L2e:
            if (r4 == 0) goto L35
            if (r3 == 0) goto L47
            r4.close()     // Catch: java.lang.Throwable -> L42
        L35:
            throw r1
        L36:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L3b:
            r0 = move-exception
            r1 = r0
            goto L2e
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L42:
            r0 = move-exception
            r3.addSuppressed(r0)
            goto L35
        L47:
            r4.close()
            goto L35
        L4b:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.mo802n():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // p000a.p029g.InterfaceC0236az
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo803o() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.f1098c
            a.g.aq r4 = r0.m787g()
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.m745f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            boolean r0 = r0.mo285j_()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            if (r5 == 0) goto L18
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L18:
            if (r4 == 0) goto L1d
            r4.close()
        L1d:
            return r0
        L1e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            r2 = r0
        L22:
            if (r5 == 0) goto L29
            if (r2 == 0) goto L3e
            r5.close()     // Catch: java.lang.Throwable -> L36 java.lang.Throwable -> L3b
        L29:
            throw r1     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
        L2a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            r3 = r0
        L2e:
            if (r4 == 0) goto L35
            if (r3 == 0) goto L47
            r4.close()     // Catch: java.lang.Throwable -> L42
        L35:
            throw r1
        L36:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L3b:
            r0 = move-exception
            r1 = r0
            goto L2e
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            goto L29
        L42:
            r0 = move-exception
            r3.addSuppressed(r0)
            goto L35
        L47:
            r4.close()
            goto L35
        L4b:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.mo803o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    @Override // p000a.InterfaceC0009ag
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo103b() throws java.lang.Throwable {
        /*
            r5 = this;
            r2 = 0
            a.g.aw r0 = r5.f1098c     // Catch: p000a.p029g.C0214ad -> L31
            a.g.aq r3 = r0.m787g()     // Catch: p000a.p029g.C0214ad -> L31
            a.g.as r4 = r3.m707h()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
            boolean r0 = r4.m746g()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L50
            if (r4 == 0) goto L14
            r4.close()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
        L14:
            if (r3 == 0) goto L19
            r3.close()     // Catch: p000a.p029g.C0214ad -> L31
        L19:
            return r0
        L1a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
        L1d:
            if (r4 == 0) goto L24
            if (r1 == 0) goto L43
            r4.close()     // Catch: java.lang.Throwable -> L3b java.lang.Throwable -> L40
        L24:
            throw r0     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
        L25:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r1 = move-exception
            r2 = r0
        L29:
            if (r3 == 0) goto L30
            if (r2 == 0) goto L4c
            r3.close()     // Catch: p000a.p029g.C0214ad -> L31 java.lang.Throwable -> L47
        L30:
            throw r1     // Catch: p000a.p029g.C0214ad -> L31
        L31:
            r0 = move-exception
            org.c.b r1 = p000a.p029g.C0235ay.f1096a
            java.lang.String r2 = "Failed to connect for determining SMB2 support"
            r1.mo4535b(r2, r0)
            r0 = 0
            goto L19
        L3b:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
            goto L24
        L40:
            r0 = move-exception
            r1 = r0
            goto L29
        L43:
            r4.close()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
            goto L24
        L47:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: p000a.p029g.C0214ad -> L31
            goto L30
        L4c:
            r3.close()     // Catch: p000a.p029g.C0214ad -> L31
            goto L30
        L50:
            r0 = move-exception
            r1 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0235ay.mo103b():boolean");
    }
}
