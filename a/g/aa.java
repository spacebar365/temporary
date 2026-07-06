package a.g;

import java.util.Iterator;

/* JADX INFO: compiled from: ShareEnumIterator.java */
/* JADX INFO: loaded from: classes.dex */
class aa implements a.f<a.aa> {
    private static final org.c.b a = org.c.c.a((Class<?>) aa.class);
    private final Iterator<j> b;
    private final a.aa d;
    private final a.s c = null;
    private a.aa e = a();

    public aa(a.aa aaVar, Iterator<j> it) {
        this.d = aaVar;
        this.b = it;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.aa a() throws java.lang.Throwable {
        /*
            r5 = this;
            r1 = 0
        L1:
            java.util.Iterator<a.g.j> r0 = r5.b
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5c
            java.util.Iterator<a.g.j> r0 = r5.b
            java.lang.Object r0 = r0.next()
            a.g.j r0 = (a.g.j) r0
            a.s r2 = r5.c
            if (r2 != 0) goto L23
            a.aa r0 = r5.a(r0)     // Catch: java.net.MalformedURLException -> L1a
        L19:
            return r0
        L1a:
            r0 = move-exception
            org.c.b r2 = a.g.aa.a
            java.lang.String r3 = "Failed to create child URL"
            r2.e(r3, r0)
            goto L1
        L23:
            a.aa r0 = r5.a(r0)     // Catch: a.d -> L33 java.net.MalformedURLException -> L40
            a.s r2 = r5.c     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            if (r2 != 0) goto L3c
            r0.close()     // Catch: a.d -> L33 java.net.MalformedURLException -> L40
            goto L1
        L33:
            r0 = move-exception
            org.c.b r2 = a.g.aa.a
            java.lang.String r3 = "Failed to apply filter"
            r2.e(r3, r0)
            goto L1
        L3c:
            r0.close()     // Catch: a.d -> L33 java.net.MalformedURLException -> L40
            goto L19
        L40:
            r0 = move-exception
            org.c.b r2 = a.g.aa.a
            java.lang.String r3 = "Failed to create child URL"
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
            r0.close()     // Catch: a.d -> L33 java.net.MalformedURLException -> L40 java.lang.Throwable -> L53
        L52:
            throw r3     // Catch: a.d -> L33 java.net.MalformedURLException -> L40
        L53:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: a.d -> L33 java.net.MalformedURLException -> L40
            goto L52
        L58:
            r0.close()     // Catch: a.d -> L33 java.net.MalformedURLException -> L40
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
        throw new UnsupportedOperationException("Method not decompiled: a.g.aa.a():a.aa");
    }

    private a.aa a(j jVar) {
        return new ae(this.d, jVar.a(), false, jVar.b(), 17, 0L, 0L, 0L, 0L);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.e != null;
    }

    @Override // a.f, java.lang.AutoCloseable
    public void close() {
        this.e = null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        a.aa aaVar = this.e;
        this.e = a();
        return aaVar;
    }
}
