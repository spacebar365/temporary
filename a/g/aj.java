package a.g;

/* JADX INFO: compiled from: SmbPipeHandleImpl.java */
/* JADX INFO: loaded from: classes.dex */
class aj implements ak {
    private static final org.c.b a = org.c.c.a((Class<?>) aj.class);
    private final ai b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private af h;
    private am i;
    private al j;
    private final String k;
    private ay l;
    private volatile boolean g = true;
    private int m = 7;

    public aj(ai aiVar) {
        this.b = aiVar;
        this.c = (aiVar.q() & 512) == 512;
        this.d = (aiVar.q() & 256) == 256;
        this.e = (aiVar.q() & (-65281)) | 32;
        this.f = (aiVar.q() & 7) | 131072;
        this.k = this.b.e();
    }

    @Override // a.y
    public final <T extends a.y> T a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    public final ai b() {
        return this.b;
    }

    private ay f() {
        if (this.l == null) {
            this.l = this.b.c();
        }
        return this.l.h();
    }

    public final String c() {
        return this.k;
    }

    public final boolean d() {
        return this.g && this.h != null && this.h.e();
    }

    @Override // a.y
    public final boolean a() {
        return (this.g && (this.h == null || this.h.e())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized a.g.af e() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aj.e():a.g.af");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.g.al g() throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.g
            if (r0 != 0) goto Lc
            a.g.ad r0 = new a.g.ad
            java.lang.String r1 = "Already closed"
            r0.<init>(r1)
            throw r0
        Lc:
            a.g.al r0 = r4.j
            if (r0 == 0) goto L13
            a.g.al r0 = r4.j
        L12:
            return r0
        L13:
            a.g.ay r3 = r4.f()
            r2 = 0
            a.g.al r0 = new a.g.al     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r4.j = r0     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            if (r3 == 0) goto L24
            r3.close()
        L24:
            a.g.al r0 = r4.j
            goto L12
        L27:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r1 = move-exception
            r2 = r0
        L2b:
            if (r3 == 0) goto L32
            if (r2 == 0) goto L38
            r3.close()     // Catch: java.lang.Throwable -> L33
        L32:
            throw r1
        L33:
            r0 = move-exception
            r2.addSuppressed(r0)
            goto L32
        L38:
            r3.close()
            goto L32
        L3c:
            r0 = move-exception
            r1 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aj.g():a.g.al");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.g.am h() throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.g
            if (r0 != 0) goto Lc
            a.g.ad r0 = new a.g.ad
            java.lang.String r1 = "Already closed"
            r0.<init>(r1)
            throw r0
        Lc:
            a.g.am r0 = r4.i
            if (r0 == 0) goto L13
            a.g.am r0 = r4.i
        L12:
            return r0
        L13:
            a.g.ay r3 = r4.f()
            r2 = 0
            a.g.am r0 = new a.g.am     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r4.i = r0     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            if (r3 == 0) goto L24
            r3.close()
        L24:
            a.g.am r0 = r4.i
            goto L12
        L27:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r1 = move-exception
            r2 = r0
        L2b:
            if (r3 == 0) goto L32
            if (r2 == 0) goto L38
            r3.close()     // Catch: java.lang.Throwable -> L33
        L32:
            throw r1
        L33:
            r0 = move-exception
            r2.addSuppressed(r0)
            goto L32
        L38:
            r3.close()
            goto L32
        L3c:
            r0 = move-exception
            r1 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aj.h():a.g.am");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    @Override // a.g.ak
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(byte[] r11, int r12, int r13, byte[] r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.aj.a(byte[], int, int, byte[], int):int");
    }

    @Override // a.g.ak
    public final int a(byte[] bArr, int i, int i2) {
        return g().a(bArr, i, i2);
    }

    @Override // a.g.ak
    public final void b(byte[] bArr, int i, int i2) {
        h().a(bArr, i, i2, 1);
    }

    @Override // a.y, java.lang.AutoCloseable
    public synchronized void close() {
        boolean zD = d();
        this.g = false;
        if (this.j != null) {
            this.j.close();
            this.j = null;
        }
        if (this.i != null) {
            this.i.close();
            this.i = null;
        }
        try {
            if (zD) {
                this.h.close();
            } else if (this.h != null) {
                this.h.f();
            }
            this.h = null;
        } finally {
            if (this.l != null) {
                this.l.i();
            }
        }
    }
}
