package a.g;

/* JADX INFO: compiled from: FileEntryAdapterIterator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class k implements a.f<a.aa> {
    private static final org.c.b a = org.c.c.a((Class<?>) k.class);
    private final a.f<j> b;
    private final a.aa d;
    private final a.s c = null;
    private a.aa e = b();

    protected abstract a.aa a(j jVar);

    public k(a.aa aaVar, a.f<j> fVar) {
        this.d = aaVar;
        this.b = fVar;
    }

    protected final a.aa a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058 A[Catch: MalformedURLException -> 0x0033, d -> 0x0040, TRY_LEAVE, TryCatch #7 {d -> 0x0040, MalformedURLException -> 0x0033, blocks: (B:11:0x0023, B:14:0x002f, B:18:0x003c, B:27:0x004f, B:28:0x0052, B:31:0x0058, B:30:0x0054), top: B:42:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.aa b() throws java.lang.Throwable {
        /*
            r5 = this;
            r1 = 0
        L1:
            a.f<a.g.j> r0 = r5.b
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5c
            a.f<a.g.j> r0 = r5.b
            java.lang.Object r0 = r0.next()
            a.g.j r0 = (a.g.j) r0
            a.s r2 = r5.c
            if (r2 != 0) goto L23
            a.aa r0 = r5.a(r0)     // Catch: java.net.MalformedURLException -> L1a
        L19:
            return r0
        L1a:
            r0 = move-exception
            org.c.b r2 = a.g.k.a
            java.lang.String r3 = "Failed to create child URL"
            r2.e(r3, r0)
            goto L1
        L23:
            a.aa r0 = r5.a(r0)     // Catch: java.net.MalformedURLException -> L33 a.d -> L40
            a.s r2 = r5.c     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            if (r2 == 0) goto L3c
            r0.close()     // Catch: java.net.MalformedURLException -> L33 a.d -> L40
            goto L19
        L33:
            r0 = move-exception
            org.c.b r2 = a.g.k.a
            java.lang.String r3 = "Failed to create child URL"
            r2.e(r3, r0)
            goto L1
        L3c:
            r0.close()     // Catch: java.net.MalformedURLException -> L33 a.d -> L40
            goto L1
        L40:
            r0 = move-exception
            org.c.b r2 = a.g.k.a
            java.lang.String r3 = "Filter failed"
            r2.e(r3, r0)
            goto L1
        L49:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L4b
        L4b:
            r3 = move-exception
            r4 = r2
        L4d:
            if (r4 == 0) goto L58
            r0.close()     // Catch: java.net.MalformedURLException -> L33 a.d -> L40 java.lang.Throwable -> L53
        L52:
            throw r3     // Catch: java.net.MalformedURLException -> L33 a.d -> L40
        L53:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.net.MalformedURLException -> L33 a.d -> L40
            goto L52
        L58:
            r0.close()     // Catch: java.net.MalformedURLException -> L33 a.d -> L40
            goto L52
        L5c:
            r0 = r1
            goto L19
        L5e:
            r2 = move-exception
            r3 = r2
            r4 = r1
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.k.b():a.aa");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.e != null;
    }

    @Override // a.f, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.b.remove();
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        a.aa aaVar = this.e;
        this.e = b();
        return aaVar;
    }
}
