package a.g;

import java.io.OutputStream;

/* JADX INFO: compiled from: SmbFileOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ah extends OutputStream {
    private static final org.c.b a = org.c.c.a((Class<?>) ah.class);
    private ae b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;
    private byte[] j;
    private a.d.d.a.z k;
    private a.d.d.a.aa l;
    private a.d.d.a.y m;
    private a.d.d.a.ab n;
    private af o;
    private int p;
    private final boolean q;

    public ah(ae aeVar) {
        this(aeVar, (byte) 0);
    }

    private ah(ae aeVar, byte b) {
        this(aeVar, (char) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private ah(a.g.ae r8, char r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r3 = 0
            r0 = 1
            r1 = 0
            r7.<init>()
            byte[] r0 = new byte[r0]
            r7.j = r0
            r7.b = r8
            r7.c = r1
            r0 = 82
            r7.e = r0
            r0 = 7
            r7.p = r0
            r0 = 2
            r7.f = r0
            a.g.ay r4 = r8.c()     // Catch: a.d -> L71
            boolean r0 = r4.b()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            r7.q = r0     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            a.g.af r5 = r7.b()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            r7.a(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            boolean r0 = r7.q     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            if (r0 == 0) goto L4e
            a.d.e.b.e r0 = new a.d.e.b.e     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            a.h r1 = r4.a()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            byte[] r2 = r5.b()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            a.d.c.d r1 = new a.d.c.d     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r0.a(r1)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r1 = 1
            a.g.u[] r1 = new a.g.u[r1]     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r2 = 0
            a.g.u r6 = a.g.u.c     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r1[r2] = r6     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r4.a(r0, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
        L4e:
            if (r5 == 0) goto L53
            r5.close()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
        L53:
            if (r4 == 0) goto L58
            r4.close()     // Catch: a.d -> L71
        L58:
            return
        L59:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5b
        L5b:
            r1 = move-exception
            r2 = r0
        L5d:
            if (r5 == 0) goto L64
            if (r2 == 0) goto L7f
            r5.close()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L7c
        L64:
            throw r1     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
        L65:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            r3 = r0
        L69:
            if (r4 == 0) goto L70
            if (r3 == 0) goto L88
            r4.close()     // Catch: a.d -> L71 java.lang.Throwable -> L83
        L70:
            throw r1     // Catch: a.d -> L71
        L71:
            r0 = move-exception
            a.g.ad r0 = a.g.ad.a(r0)
            throw r0
        L77:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            goto L64
        L7c:
            r0 = move-exception
            r1 = r0
            goto L69
        L7f:
            r5.close()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            goto L64
        L83:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: a.d -> L71
            goto L70
        L88:
            r4.close()     // Catch: a.d -> L71
            goto L70
        L8c:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ah.<init>(a.g.ae, char):void");
    }

    ah(ae aeVar, ay ayVar) throws Throwable {
        this.j = new byte[1];
        this.b = aeVar;
        this.o = null;
        this.e = 0;
        this.f = 0;
        this.p = 0;
        this.c = false;
        this.q = ayVar.b();
        a(ayVar);
    }

    private void a(ay ayVar) throws Throwable {
        int iL = ayVar.l();
        if (this.q) {
            this.g = iL;
            this.h = iL;
            return;
        }
        this.e &= -81;
        this.g = iL - 70;
        this.d = ayVar.a(16);
        if (!this.d) {
            a.b("No support for NT SMBs");
        }
        if (ayVar.a(32768) && !ayVar.o()) {
            this.h = Math.min(ayVar.a().q() - 70, 65465);
        } else {
            a.b("No support or SMB signing is enabled, not enabling large writes");
            this.h = this.g;
        }
        if (a.c()) {
            a.b("Negotiated file write size is " + this.h);
        }
        if (this.d) {
            this.k = new a.d.d.a.z(ayVar.a());
            this.l = new a.d.d.a.aa(ayVar.a());
        } else {
            this.m = new a.d.d.a.y(ayVar.a());
            this.n = new a.d.d.a.ab(ayVar.a());
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.o.e()) {
                this.o.close();
            }
        } finally {
            this.b.o();
            this.j = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws Throwable {
        this.j[0] = (byte) i;
        write(this.j, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws Throwable {
        write(bArr, 0, bArr.length);
    }

    public boolean a() {
        return this.o != null && this.o.e();
    }

    protected synchronized af b() {
        af afVarG;
        if (!a()) {
            this.o = this.b.a(this.e, this.f, this.p).g();
            if (this.c) {
                this.i = this.o.c();
                if (a.c()) {
                    a.b("File pointer is at " + this.i);
                }
            }
            afVarG = this.o;
        } else {
            a.a("File already open");
            afVarG = this.o.g();
        }
        return afVarG;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws Throwable {
        a(bArr, i, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r19, int r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ah.a(byte[], int, int, int):void");
    }
}
