package p000a.p029g;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0016c;
import p000a.p031i.p032a.C0280g;

/* JADX INFO: renamed from: a.g.ag */
/* JADX INFO: compiled from: SmbFileInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class C0217ag extends InputStream {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1612b f986b = C1620c.m4563a((Class<?>) C0217ag.class);

    /* JADX INFO: renamed from: a */
    C0215ae f987a;

    /* JADX INFO: renamed from: c */
    private C0216af f988c;

    /* JADX INFO: renamed from: d */
    private long f989d;

    /* JADX INFO: renamed from: e */
    private int f990e;

    /* JADX INFO: renamed from: f */
    private int f991f;

    /* JADX INFO: renamed from: g */
    private int f992g;

    /* JADX INFO: renamed from: h */
    private int f993h;

    /* JADX INFO: renamed from: i */
    private byte[] f994i;

    /* JADX INFO: renamed from: j */
    private boolean f995j;

    /* JADX INFO: renamed from: k */
    private final boolean f996k;

    /* JADX INFO: renamed from: l */
    private boolean f997l;

    public C0217ag(String str, InterfaceC0016c interfaceC0016c) {
        this(new C0215ae(str, interfaceC0016c), true);
    }

    public C0217ag(C0215ae c0215ae) {
        this(c0215ae, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C0217ag(p000a.p029g.C0215ae r5, boolean r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r1 = 1
            r4.<init>()
            byte[] r0 = new byte[r1]
            r4.f994i = r0
            r4.f987a = r5
            r4.f996k = r6
            r0 = 0
            r4.f992g = r0
            r4.f993h = r1
            a.g.ay r3 = r5.m626c()     // Catch: p000a.C0044d -> L48
            r2 = 0
            boolean r0 = r3.mo103b()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            r4.f997l = r0     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            int r0 = r5.mo630g()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            r1 = 16
            if (r0 == r1) goto L33
            a.g.af r0 = r4.mo651a()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
        L2d:
            int r0 = r4.f992g     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            r0 = r0 & (-81)
            r4.f992g = r0     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
        L33:
            r4.m649a(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            if (r3 == 0) goto L3b
            r3.close()     // Catch: p000a.C0044d -> L48
        L3b:
            return
        L3c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r1 = move-exception
            r2 = r0
        L40:
            if (r3 == 0) goto L47
            if (r2 == 0) goto L53
            r3.close()     // Catch: p000a.C0044d -> L48 java.lang.Throwable -> L4e
        L47:
            throw r1     // Catch: p000a.C0044d -> L48
        L48:
            r0 = move-exception
            a.g.ad r0 = p000a.p029g.C0214ad.m611a(r0)
            throw r0
        L4e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: p000a.C0044d -> L48
            goto L47
        L53:
            r3.close()     // Catch: p000a.C0044d -> L48
            goto L47
        L57:
            r0 = move-exception
            r1 = r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0217ag.<init>(a.g.ae, boolean):void");
    }

    C0217ag(C0215ae c0215ae, C0235ay c0235ay) throws C0214ad {
        this.f994i = new byte[1];
        this.f987a = c0215ae;
        this.f988c = null;
        this.f996k = false;
        this.f997l = c0235ay.mo103b();
        try {
            m649a(c0235ay);
        } catch (C0044d e) {
            throw C0214ad.m611a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m649a(InterfaceC0236az interfaceC0236az) {
        if (this.f997l) {
            this.f990e = interfaceC0236az.mo801m();
            this.f991f = interfaceC0236az.mo801m();
            return;
        }
        this.f990e = Math.min(interfaceC0236az.mo801m() - 70, interfaceC0236az.mo802n() - 70);
        if (interfaceC0236az.mo791a(16384)) {
            this.f995j = true;
            this.f991f = Math.min(interfaceC0236az.mo102a().mo71p() - 70, interfaceC0236az.mo803o() ? 65465 : 16777145);
            f986b.mo4534b("Enabling LARGE_READX with " + this.f991f);
        } else {
            f986b.mo4534b("LARGE_READX disabled");
            this.f991f = this.f990e;
        }
        if (f986b.mo4539c()) {
            f986b.mo4534b("Negotiated file read size is " + this.f991f);
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized C0216af mo651a() {
        C0216af c0216afM646g;
        if (this.f988c == null || !this.f988c.m644e()) {
            if (this.f987a instanceof C0219ai) {
                this.f988c = this.f987a.m623a(32, ((C0219ai) this.f987a).m656q() & 16711680, 3);
            } else {
                this.f988c = this.f987a.m623a(this.f992g, this.f993h, 3).m646g();
            }
            c0216afM646g = this.f988c;
        } else {
            c0216afM646g = this.f988c.m646g();
        }
        return c0216afM646g;
    }

    /* JADX INFO: renamed from: a */
    protected static IOException m648a(C0214ad c0214ad) {
        Throwable cause;
        IOException iOException;
        Throwable cause2 = c0214ad.getCause();
        if (cause2 instanceof C0280g) {
            C0280g c0280g = (C0280g) cause2;
            cause = c0280g.getCause();
            iOException = c0280g;
        } else {
            cause = cause2;
            iOException = c0214ad;
        }
        if (cause instanceof InterruptedException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException(cause.getMessage());
            interruptedIOException.initCause(cause);
            return interruptedIOException;
        }
        return iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                C0216af c0216af = this.f988c;
                if (c0216af != null) {
                    c0216af.close();
                }
            } catch (C0214ad e) {
                throw m648a(e);
            }
        } finally {
            this.f994i = null;
            this.f988c = null;
            if (this.f996k) {
                this.f987a.close();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f994i, 0, 1) == -1) {
            return -1;
        }
        return this.f994i[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return m650a(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r4 = (int) (r22.f989d - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017a, code lost:
    
        if (r19 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017c, code lost:
    
        r19.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        if (r18 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        r18.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m650a(byte[] r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0217ag.m650a(byte[], int, int):int");
    }

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        this.f989d += j;
        return j;
    }
}
