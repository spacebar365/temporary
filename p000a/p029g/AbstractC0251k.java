package p000a.p029g;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0003aa;
import p000a.InterfaceC0197f;
import p000a.InterfaceC0295s;

/* JADX INFO: renamed from: a.g.k */
/* JADX INFO: compiled from: FileEntryAdapterIterator.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0251k implements InterfaceC0197f<InterfaceC0003aa> {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1157a = C1620c.m4563a((Class<?>) AbstractC0251k.class);

    /* JADX INFO: renamed from: b */
    private final InterfaceC0197f<InterfaceC0250j> f1158b;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0003aa f1160d;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0295s f1159c = null;

    /* JADX INFO: renamed from: e */
    private InterfaceC0003aa f1161e = m876b();

    /* JADX INFO: renamed from: a */
    protected abstract InterfaceC0003aa mo862a(InterfaceC0250j interfaceC0250j);

    public AbstractC0251k(InterfaceC0003aa interfaceC0003aa, InterfaceC0197f<InterfaceC0250j> interfaceC0197f) {
        this.f1160d = interfaceC0003aa;
        this.f1158b = interfaceC0197f;
    }

    /* JADX INFO: renamed from: a */
    protected final InterfaceC0003aa m877a() {
        return this.f1160d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058 A[Catch: MalformedURLException -> 0x0033, d -> 0x0040, TRY_LEAVE, TryCatch #7 {d -> 0x0040, MalformedURLException -> 0x0033, blocks: (B:11:0x0023, B:14:0x002f, B:18:0x003c, B:27:0x004f, B:28:0x0052, B:31:0x0058, B:30:0x0054), top: B:42:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.InterfaceC0003aa m876b() throws java.lang.Throwable {
        /*
            r5 = this;
            r1 = 0
        L1:
            a.f<a.g.j> r0 = r5.f1158b
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5c
            a.f<a.g.j> r0 = r5.f1158b
            java.lang.Object r0 = r0.next()
            a.g.j r0 = (p000a.p029g.InterfaceC0250j) r0
            a.s r2 = r5.f1159c
            if (r2 != 0) goto L23
            a.aa r0 = r5.mo862a(r0)     // Catch: java.net.MalformedURLException -> L1a
        L19:
            return r0
        L1a:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.AbstractC0251k.f1157a
            java.lang.String r3 = "Failed to create child URL"
            r2.mo4544e(r3, r0)
            goto L1
        L23:
            a.aa r0 = r5.mo862a(r0)     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40
            a.s r2 = r5.f1159c     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            boolean r2 = r2.m964a()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L5e
            if (r2 == 0) goto L3c
            r0.close()     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40
            goto L19
        L33:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.AbstractC0251k.f1157a
            java.lang.String r3 = "Failed to create child URL"
            r2.mo4544e(r3, r0)
            goto L1
        L3c:
            r0.close()     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40
            goto L1
        L40:
            r0 = move-exception
            org.c.b r2 = p000a.p029g.AbstractC0251k.f1157a
            java.lang.String r3 = "Filter failed"
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
            r0.close()     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40 java.lang.Throwable -> L53
        L52:
            throw r3     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40
        L53:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40
            goto L52
        L58:
            r0.close()     // Catch: java.net.MalformedURLException -> L33 p000a.C0044d -> L40
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.AbstractC0251k.m876b():a.aa");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1161e != null;
    }

    @Override // p000a.InterfaceC0197f, java.lang.AutoCloseable
    public void close() {
        this.f1158b.close();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f1158b.remove();
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        InterfaceC0003aa interfaceC0003aa = this.f1161e;
        this.f1161e = m876b();
        return interfaceC0003aa;
    }
}
