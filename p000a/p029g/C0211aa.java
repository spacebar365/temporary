package p000a.p029g;

import java.util.Iterator;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0003aa;
import p000a.InterfaceC0197f;
import p000a.InterfaceC0295s;

/* JADX INFO: renamed from: a.g.aa */
/* JADX INFO: compiled from: ShareEnumIterator.java */
/* JADX INFO: loaded from: classes.dex */
class C0211aa implements InterfaceC0197f<InterfaceC0003aa> {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f946a = C1620c.m4563a((Class<?>) C0211aa.class);

    /* JADX INFO: renamed from: b */
    private final Iterator<InterfaceC0250j> f947b;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0003aa f949d;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0295s f948c = null;

    /* JADX INFO: renamed from: e */
    private InterfaceC0003aa f950e = m603a();

    public C0211aa(InterfaceC0003aa interfaceC0003aa, Iterator<InterfaceC0250j> it) {
        this.f949d = interfaceC0003aa;
        this.f947b = it;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.InterfaceC0003aa m603a() throws java.lang.Throwable {
        /*
            r5 = this;
            r1 = 0
        L1:
            java.util.Iterator<a.g.j> r0 = r5.f947b
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5c
            java.util.Iterator<a.g.j> r0 = r5.f947b
            java.lang.Object r0 = r0.next()
            a.g.j r0 = (p000a.p029g.InterfaceC0250j) r0
            a.s r2 = r5.f948c
            if (r2 != 0) goto L23
            a.aa r0 = r5.m604a(r0)     // Catch: java.net.MalformedURLException -> L1a
        L19:
            return r0
        L1a:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.C0211aa.f946a
            java.lang.String r3 = "Failed to create child URL"
            r2.mo4544e(r3, r0)
            goto L1
        L23:
            a.aa r0 = r5.m604a(r0)     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40
            a.s r2 = r5.f948c     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            boolean r2 = r2.m964a()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            if (r2 != 0) goto L3c
            r0.close()     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40
            goto L1
        L33:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.C0211aa.f946a
            java.lang.String r3 = "Failed to apply filter"
            r2.mo4544e(r3, r0)
            goto L1
        L3c:
            r0.close()     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40
            goto L19
        L40:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.C0211aa.f946a
            java.lang.String r3 = "Failed to create child URL"
            r2.mo4544e(r3, r0)
            goto L1
        L49:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L4b
        L4b:
            r3 = move-exception
            r4 = r2
        L4d:
            if (r4 == 0) goto L58
            r0.close()     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40 java.lang.Throwable -> L53
        L52:
            throw r3     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40
        L53:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40
            goto L52
        L58:
            r0.close()     // Catch: p000a.C0044d -> L33 java.net.MalformedURLException -> L40
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0211aa.m603a():a.aa");
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0003aa m604a(InterfaceC0250j interfaceC0250j) {
        return new C0215ae(this.f949d, interfaceC0250j.mo233a(), false, interfaceC0250j.mo234b(), 17, 0L, 0L, 0L, 0L);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f950e != null;
    }

    @Override // p000a.InterfaceC0197f, java.lang.AutoCloseable
    public void close() {
        this.f950e = null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        InterfaceC0003aa interfaceC0003aa = this.f950e;
        this.f950e = m603a();
        return interfaceC0003aa;
    }
}
