package a.g;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: SmbFileInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ag extends InputStream {
    private static final org.c.b b = org.c.c.a((Class<?>) ag.class);
    ae a;
    private af c;
    private long d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte[] i;
    private boolean j;
    private final boolean k;
    private boolean l;

    public ag(String str, a.c cVar) {
        this(new ae(str, cVar), true);
    }

    public ag(ae aeVar) {
        this(aeVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private ag(a.g.ae r5, boolean r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r1 = 1
            r4.<init>()
            byte[] r0 = new byte[r1]
            r4.i = r0
            r4.a = r5
            r4.k = r6
            r0 = 0
            r4.g = r0
            r4.h = r1
            a.g.ay r3 = r5.c()     // Catch: a.d -> L48
            r2 = 0
            boolean r0 = r3.b()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            r4.l = r0     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            int r0 = r5.g()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            r1 = 16
            if (r0 == r1) goto L33
            a.g.af r0 = r4.a()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
        L2d:
            int r0 = r4.g     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            r0 = r0 & (-81)
            r4.g = r0     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
        L33:
            r4.a(r3)     // Catch: java.lang.Throwable -> L3c java.lang.Throwable -> L57
            if (r3 == 0) goto L3b
            r3.close()     // Catch: a.d -> L48
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
            r3.close()     // Catch: a.d -> L48 java.lang.Throwable -> L4e
        L47:
            throw r1     // Catch: a.d -> L48
        L48:
            r0 = move-exception
            a.g.ad r0 = a.g.ad.a(r0)
            throw r0
        L4e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: a.d -> L48
            goto L47
        L53:
            r3.close()     // Catch: a.d -> L48
            goto L47
        L57:
            r0 = move-exception
            r1 = r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ag.<init>(a.g.ae, boolean):void");
    }

    ag(ae aeVar, ay ayVar) throws ad {
        this.i = new byte[1];
        this.a = aeVar;
        this.c = null;
        this.k = false;
        this.l = ayVar.b();
        try {
            a(ayVar);
        } catch (a.d e) {
            throw ad.a(e);
        }
    }

    private void a(az azVar) {
        if (this.l) {
            this.e = azVar.m();
            this.f = azVar.m();
            return;
        }
        this.e = Math.min(azVar.m() - 70, azVar.n() - 70);
        if (azVar.a(16384)) {
            this.j = true;
            this.f = Math.min(azVar.a().p() - 70, azVar.o() ? 65465 : 16777145);
            b.b("Enabling LARGE_READX with " + this.f);
        } else {
            b.b("LARGE_READX disabled");
            this.f = this.e;
        }
        if (b.c()) {
            b.b("Negotiated file read size is " + this.f);
        }
    }

    synchronized af a() {
        af afVarG;
        if (this.c == null || !this.c.e()) {
            if (this.a instanceof ai) {
                this.c = this.a.a(32, ((ai) this.a).q() & 16711680, 3);
            } else {
                this.c = this.a.a(this.g, this.h, 3).g();
            }
            afVarG = this.c;
        } else {
            afVarG = this.c.g();
        }
        return afVarG;
    }

    protected static IOException a(ad adVar) {
        Throwable cause;
        IOException iOException;
        Throwable cause2 = adVar.getCause();
        if (cause2 instanceof a.i.a.g) {
            a.i.a.g gVar = (a.i.a.g) cause2;
            cause = gVar.getCause();
            iOException = gVar;
        } else {
            cause = cause2;
            iOException = adVar;
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
                af afVar = this.c;
                if (afVar != null) {
                    afVar.close();
                }
            } catch (ad e) {
                throw a(e);
            }
        } finally {
            this.i = null;
            this.c = null;
            if (this.k) {
                this.a.close();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.i, 0, 1) == -1) {
            return -1;
        }
        return this.i[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return a(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r4 = (int) (r22.d - r0);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(byte[] r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.ag.a(byte[], int, int):int");
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
        this.d += j;
        return j;
    }
}
