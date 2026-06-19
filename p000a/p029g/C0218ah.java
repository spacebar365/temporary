package p000a.p029g;

import java.io.OutputStream;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.p006d.p010d.p011a.C0070aa;
import p000a.p006d.p010d.p011a.C0071ab;
import p000a.p006d.p010d.p011a.C0095y;
import p000a.p006d.p010d.p011a.C0096z;

/* JADX INFO: renamed from: a.g.ah */
/* JADX INFO: compiled from: SmbFileOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class C0218ah extends OutputStream {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f998a = C1620c.m4563a((Class<?>) C0218ah.class);

    /* JADX INFO: renamed from: b */
    private C0215ae f999b;

    /* JADX INFO: renamed from: c */
    private boolean f1000c;

    /* JADX INFO: renamed from: d */
    private boolean f1001d;

    /* JADX INFO: renamed from: e */
    private int f1002e;

    /* JADX INFO: renamed from: f */
    private int f1003f;

    /* JADX INFO: renamed from: g */
    private int f1004g;

    /* JADX INFO: renamed from: h */
    private int f1005h;

    /* JADX INFO: renamed from: i */
    private long f1006i;

    /* JADX INFO: renamed from: j */
    private byte[] f1007j;

    /* JADX INFO: renamed from: k */
    private C0096z f1008k;

    /* JADX INFO: renamed from: l */
    private C0070aa f1009l;

    /* JADX INFO: renamed from: m */
    private C0095y f1010m;

    /* JADX INFO: renamed from: n */
    private C0071ab f1011n;

    /* JADX INFO: renamed from: o */
    private C0216af f1012o;

    /* JADX INFO: renamed from: p */
    private int f1013p;

    /* JADX INFO: renamed from: q */
    private final boolean f1014q;

    public C0218ah(C0215ae c0215ae) {
        this(c0215ae, (byte) 0);
    }

    private C0218ah(C0215ae c0215ae, byte b) {
        this(c0215ae, (char) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C0218ah(p000a.p029g.C0215ae r8, char r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r3 = 0
            r0 = 1
            r1 = 0
            r7.<init>()
            byte[] r0 = new byte[r0]
            r7.f1007j = r0
            r7.f999b = r8
            r7.f1000c = r1
            r0 = 82
            r7.f1002e = r0
            r0 = 7
            r7.f1013p = r0
            r0 = 2
            r7.f1003f = r0
            a.g.ay r4 = r8.m626c()     // Catch: p000a.C0044d -> L71
            boolean r0 = r4.mo103b()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            r7.f1014q = r0     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            a.g.af r5 = r7.mo655b()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
            r7.m652a(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            boolean r0 = r7.f1014q     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            if (r0 == 0) goto L4e
            a.d.e.b.e r0 = new a.d.e.b.e     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            a.h r1 = r4.mo102a()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            byte[] r2 = r5.m641b()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            a.d.c.d r1 = new a.d.c.d     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r0.m461a(r1)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r1 = 1
            a.g.u[] r1 = new p000a.p029g.EnumC0261u[r1]     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r2 = 0
            a.g.u r6 = p000a.p029g.EnumC0261u.NO_RETRY     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r1[r2] = r6     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
            r4.m790a(r0, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L8c
        L4e:
            if (r5 == 0) goto L53
            r5.close()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L7c
        L53:
            if (r4 == 0) goto L58
            r4.close()     // Catch: p000a.C0044d -> L71
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
            r4.close()     // Catch: p000a.C0044d -> L71 java.lang.Throwable -> L83
        L70:
            throw r1     // Catch: p000a.C0044d -> L71
        L71:
            r0 = move-exception
            a.g.ad r0 = p000a.p029g.C0214ad.m611a(r0)
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
            r3.addSuppressed(r0)     // Catch: p000a.C0044d -> L71
            goto L70
        L88:
            r4.close()     // Catch: p000a.C0044d -> L71
            goto L70
        L8c:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0218ah.<init>(a.g.ae, char):void");
    }

    C0218ah(C0215ae c0215ae, C0235ay c0235ay) throws Throwable {
        this.f1007j = new byte[1];
        this.f999b = c0215ae;
        this.f1012o = null;
        this.f1002e = 0;
        this.f1003f = 0;
        this.f1013p = 0;
        this.f1000c = false;
        this.f1014q = c0235ay.mo103b();
        m652a(c0235ay);
    }

    /* JADX INFO: renamed from: a */
    private void m652a(C0235ay c0235ay) throws Throwable {
        int iM800l = c0235ay.m800l();
        if (this.f1014q) {
            this.f1004g = iM800l;
            this.f1005h = iM800l;
            return;
        }
        this.f1002e &= -81;
        this.f1004g = iM800l - 70;
        this.f1001d = c0235ay.mo791a(16);
        if (!this.f1001d) {
            f998a.mo4534b("No support for NT SMBs");
        }
        if (c0235ay.mo791a(32768) && !c0235ay.mo803o()) {
            this.f1005h = Math.min(c0235ay.mo102a().mo72q() - 70, 65465);
        } else {
            f998a.mo4534b("No support or SMB signing is enabled, not enabling large writes");
            this.f1005h = this.f1004g;
        }
        if (f998a.mo4539c()) {
            f998a.mo4534b("Negotiated file write size is " + this.f1005h);
        }
        if (this.f1001d) {
            this.f1008k = new C0096z(c0235ay.mo102a());
            this.f1009l = new C0070aa(c0235ay.mo102a());
        } else {
            this.f1010m = new C0095y(c0235ay.mo102a());
            this.f1011n = new C0071ab(c0235ay.mo102a());
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f1012o.m644e()) {
                this.f1012o.close();
            }
        } finally {
            this.f999b.m638o();
            this.f1007j = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws Throwable {
        this.f1007j[0] = (byte) i;
        write(this.f1007j, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws Throwable {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo654a() {
        return this.f1012o != null && this.f1012o.m644e();
    }

    /* JADX INFO: renamed from: b */
    protected synchronized C0216af mo655b() {
        C0216af c0216afM646g;
        if (!mo654a()) {
            this.f1012o = this.f999b.m623a(this.f1002e, this.f1003f, this.f1013p).m646g();
            if (this.f1000c) {
                this.f1006i = this.f1012o.m642c();
                if (f998a.mo4539c()) {
                    f998a.mo4534b("File pointer is at " + this.f1006i);
                }
            }
            c0216afM646g = this.f1012o;
        } else {
            f998a.mo4532a("File already open");
            c0216afM646g = this.f1012o.m646g();
        }
        return c0216afM646g;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws Throwable {
        m653a(bArr, i, i2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m653a(byte[] r19, int r20, int r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0218ah.m653a(byte[], int, int, int):void");
    }
}
