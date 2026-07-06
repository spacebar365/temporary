package a.g;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: SmbTreeHandleImpl.java */
/* JADX INFO: loaded from: classes.dex */
class ay implements az {
    private static final org.c.b a = org.c.c.a((Class<?>) ay.class);
    private final ao b;
    private final aw c;
    private final AtomicLong d = new AtomicLong(1);

    public ay(ao aoVar, aw awVar) {
        this.b = aoVar;
        this.c = awVar.b();
    }

    public final aq d() {
        return this.c.g();
    }

    public final void e() {
        this.c.a(this.b, (a.d.f) null);
    }

    @Override // a.g.az
    public final boolean a(int i) {
        return this.c.a(i);
    }

    public final boolean f() {
        return this.c.e();
    }

    @Override // a.ag
    public final a.h a() {
        return this.c.a();
    }

    public final long g() {
        return this.c.f();
    }

    public final <T extends a.d.d> T a(a.d.e<T> eVar, u... uVarArr) {
        return (T) a(eVar, null, uVarArr);
    }

    public final <T extends a.d.d> T a(a.d.c cVar, T t, u... uVarArr) {
        return (T) this.c.a(this.b, cVar, t, uVarArr);
    }

    @Override // a.ag, java.lang.AutoCloseable
    public synchronized void close() {
        i();
    }

    public final ay h() {
        if (this.d.incrementAndGet() == 1) {
            this.c.b();
        }
        return this;
    }

    public final void i() {
        long jDecrementAndGet = this.d.decrementAndGet();
        if (jDecrementAndGet == 0) {
            this.c.c();
        } else if (jDecrementAndGet < 0) {
            throw new a.u("Usage count dropped below zero");
        }
    }

    protected void finalize() {
        if (this.d.get() != 0) {
            a.d("Tree handle was not properly released " + this.b.f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j() throws java.lang.Throwable {
        /*
            r8 = this;
            r3 = 0
            a.g.aw r0 = r8.c
            a.g.aq r4 = r0.g()
            a.g.as r5 = r4.h()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L56
            a.d.l r0 = r5.f()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            boolean r1 = r0 instanceof a.d.d.a.k     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            if (r1 == 0) goto L2c
            a.d.d.a.k r0 = (a.d.d.a.k) r0     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            a.d.d.a.b r0 = r0.aa()     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
            int r0 = r0.n     // Catch: java.lang.Throwable -> L39 java.lang.Throwable -> L66
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.j():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() throws java.lang.Throwable {
        /*
            r6 = this;
            r1 = 0
            a.g.aw r0 = r6.c
            a.g.aq r4 = r0.g()
            a.g.as r5 = r4.h()     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L50
            a.d.l r0 = r5.f()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            boolean r2 = r0 instanceof a.d.d.a.k     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            if (r2 == 0) goto L26
            a.d.d.a.k r0 = (a.d.d.a.k) r0     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            a.d.d.a.b r0 = r0.aa()     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
            java.lang.String r0 = r0.e     // Catch: java.lang.Throwable -> L32 java.lang.Throwable -> L61
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.k():java.lang.String");
    }

    @Override // a.ag
    public final int c() {
        return this.c.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.c
            a.g.aq r4 = r0.g()
            a.g.as r5 = r4.h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            int r0 = r0.j()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.l():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // a.g.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.c
            a.g.aq r4 = r0.g()
            a.g.as r5 = r4.h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            int r0 = r0.i_()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.m():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // a.g.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.c
            a.g.aq r4 = r0.g()
            a.g.as r5 = r4.h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            int r0 = r0.h_()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.n():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    @Override // a.g.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o() throws java.lang.Throwable {
        /*
            r6 = this;
            r3 = 0
            a.g.aw r0 = r6.c
            a.g.aq r4 = r0.g()
            a.g.as r5 = r4.h()     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L3b
            a.d.l r0 = r5.f()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
            boolean r0 = r0.j_()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L4b
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    @Override // a.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() throws java.lang.Throwable {
        /*
            r5 = this;
            r2 = 0
            a.g.aw r0 = r5.c     // Catch: a.g.ad -> L31
            a.g.aq r3 = r0.g()     // Catch: a.g.ad -> L31
            a.g.as r4 = r3.h()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
            boolean r0 = r4.g()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L50
            if (r4 == 0) goto L14
            r4.close()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L40
        L14:
            if (r3 == 0) goto L19
            r3.close()     // Catch: a.g.ad -> L31
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
            r3.close()     // Catch: a.g.ad -> L31 java.lang.Throwable -> L47
        L30:
            throw r1     // Catch: a.g.ad -> L31
        L31:
            r0 = move-exception
            org.c.b r1 = a.g.ay.a
            java.lang.String r2 = "Failed to connect for determining SMB2 support"
            r1.b(r2, r0)
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
            r2.addSuppressed(r0)     // Catch: a.g.ad -> L31
            goto L30
        L4c:
            r3.close()     // Catch: a.g.ad -> L31
            goto L30
        L50:
            r0 = move-exception
            r1 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ay.b():boolean");
    }
}
