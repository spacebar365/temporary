package p000a.p029g;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0301y;

/* JADX INFO: renamed from: a.g.aj */
/* JADX INFO: compiled from: SmbPipeHandleImpl.java */
/* JADX INFO: loaded from: classes.dex */
class C0220aj implements InterfaceC0221ak {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1016a = C1620c.m4563a((Class<?>) C0220aj.class);

    /* JADX INFO: renamed from: b */
    private final C0219ai f1017b;

    /* JADX INFO: renamed from: c */
    private final boolean f1018c;

    /* JADX INFO: renamed from: d */
    private final boolean f1019d;

    /* JADX INFO: renamed from: e */
    private final int f1020e;

    /* JADX INFO: renamed from: f */
    private final int f1021f;

    /* JADX INFO: renamed from: h */
    private C0216af f1023h;

    /* JADX INFO: renamed from: i */
    private C0223am f1024i;

    /* JADX INFO: renamed from: j */
    private C0222al f1025j;

    /* JADX INFO: renamed from: k */
    private final String f1026k;

    /* JADX INFO: renamed from: l */
    private C0235ay f1027l;

    /* JADX INFO: renamed from: g */
    private volatile boolean f1022g = true;

    /* JADX INFO: renamed from: m */
    private int f1028m = 7;

    public C0220aj(C0219ai c0219ai) {
        this.f1017b = c0219ai;
        this.f1018c = (c0219ai.m656q() & 512) == 512;
        this.f1019d = (c0219ai.m656q() & 256) == 256;
        this.f1020e = (c0219ai.m656q() & (-65281)) | 32;
        this.f1021f = (c0219ai.m656q() & 7) | 131072;
        this.f1026k = this.f1017b.m628e();
    }

    @Override // p000a.InterfaceC0301y
    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC0301y> T mo663a(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: b */
    public final C0219ai m665b() {
        return this.f1017b;
    }

    /* JADX INFO: renamed from: f */
    private C0235ay m658f() {
        if (this.f1027l == null) {
            this.f1027l = this.f1017b.m626c();
        }
        return this.f1027l.m796h();
    }

    /* JADX INFO: renamed from: c */
    public final String m667c() {
        return this.f1026k;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m668d() {
        return this.f1022g && this.f1023h != null && this.f1023h.m644e();
    }

    @Override // p000a.InterfaceC0301y
    /* JADX INFO: renamed from: a */
    public final boolean mo664a() {
        return (this.f1022g && (this.f1023h == null || this.f1023h.m644e())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized p000a.p029g.C0216af m669e() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0220aj.m669e():a.g.af");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p029g.C0222al m659g() throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.f1022g
            if (r0 != 0) goto Lc
            a.g.ad r0 = new a.g.ad
            java.lang.String r1 = "Already closed"
            r0.<init>(r1)
            throw r0
        Lc:
            a.g.al r0 = r4.f1025j
            if (r0 == 0) goto L13
            a.g.al r0 = r4.f1025j
        L12:
            return r0
        L13:
            a.g.ay r3 = r4.m658f()
            r2 = 0
            a.g.al r0 = new a.g.al     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r4.f1025j = r0     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            if (r3 == 0) goto L24
            r3.close()
        L24:
            a.g.al r0 = r4.f1025j
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0220aj.m659g():a.g.al");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p029g.C0223am m660h() throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.f1022g
            if (r0 != 0) goto Lc
            a.g.ad r0 = new a.g.ad
            java.lang.String r1 = "Already closed"
            r0.<init>(r1)
            throw r0
        Lc:
            a.g.am r0 = r4.f1024i
            if (r0 == 0) goto L13
            a.g.am r0 = r4.f1024i
        L12:
            return r0
        L13:
            a.g.ay r3 = r4.m658f()
            r2 = 0
            a.g.am r0 = new a.g.am     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            r4.f1024i = r0     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            if (r3 == 0) goto L24
            r3.close()
        L24:
            a.g.am r0 = r4.f1024i
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0220aj.m660h():a.g.am");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    @Override // p000a.p029g.InterfaceC0221ak
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo662a(byte[] r11, int r12, int r13, byte[] r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0220aj.mo662a(byte[], int, int, byte[], int):int");
    }

    @Override // p000a.p029g.InterfaceC0221ak
    /* JADX INFO: renamed from: a */
    public final int mo661a(byte[] bArr, int i, int i2) {
        return m659g().m650a(bArr, i, i2);
    }

    @Override // p000a.p029g.InterfaceC0221ak
    /* JADX INFO: renamed from: b */
    public final void mo666b(byte[] bArr, int i, int i2) {
        m660h().m653a(bArr, i, i2, 1);
    }

    @Override // p000a.InterfaceC0301y, java.lang.AutoCloseable
    public synchronized void close() {
        boolean zM668d = m668d();
        this.f1022g = false;
        if (this.f1025j != null) {
            this.f1025j.close();
            this.f1025j = null;
        }
        if (this.f1024i != null) {
            this.f1024i.close();
            this.f1024i = null;
        }
        try {
            if (zM668d) {
                this.f1023h.close();
            } else if (this.f1023h != null) {
                this.f1023h.m645f();
            }
            this.f1023h = null;
        } finally {
            if (this.f1027l != null) {
                this.f1027l.m797i();
            }
        }
    }
}
