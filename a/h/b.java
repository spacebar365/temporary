package a.h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bg;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.f;
import org.bouncycastle.a.g;
import org.bouncycastle.a.h;
import org.bouncycastle.a.p;

/* JADX INFO: compiled from: NegTokenTarg.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    private p a;
    private int b;

    public b() {
        this.b = -1;
    }

    public b(byte[] bArr, byte[] bArr2) {
        this.b = -1;
        this.b = -1;
        this.a = null;
        b(bArr);
        c(bArr2);
    }

    public b(byte[] bArr) throws Throwable {
        this.b = -1;
        a(bArr);
    }

    public final int a() {
        return this.b;
    }

    public final p c() {
        return this.a;
    }

    @Override // a.h.d
    public final byte[] b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bg bgVar = new bg(byteArrayOutputStream);
            g gVar = new g();
            int i = this.b;
            if (i != -1) {
                gVar.a(new bn(true, 0, new h(i)));
            }
            p pVar = this.a;
            if (pVar != null) {
                gVar.a(new bn(true, 1, pVar));
            }
            byte[] bArrD = d();
            if (bArrD != null) {
                gVar.a(new bn(true, 2, new be(bArrD)));
            }
            byte[] bArrE = e();
            if (bArrE != null) {
                gVar.a(new bn(true, 3, new be(bArrE)));
            }
            bgVar.a((f) new bn(true, 1, new bi(gVar)));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a.h.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(byte[] r6) throws java.lang.Throwable {
        /*
            r5 = this;
            org.bouncycastle.a.l r3 = new org.bouncycastle.a.l
            r3.<init>(r6)
            r2 = 0
            org.bouncycastle.a.u r0 = r3.b()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            org.bouncycastle.a.ab r0 = (org.bouncycastle.a.ab) r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r1 = 1
            org.bouncycastle.a.v r0 = org.bouncycastle.a.v.a(r0, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            java.util.Enumeration r1 = r0.c()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
        L15:
            boolean r0 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r1.nextElement()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            org.bouncycastle.a.ab r0 = (org.bouncycastle.a.ab) r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            int r4 = r0.b()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            switch(r4) {
                case 0: goto L3a;
                case 1: goto L4c;
                case 2: goto L54;
                case 3: goto L61;
                default: goto L28;
            }     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
        L28:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            java.lang.String r1 = "Malformed token field."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
        L30:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L32
        L32:
            r1 = move-exception
            r2 = r0
        L34:
            if (r2 == 0) goto L77
            r3.close()     // Catch: java.lang.Throwable -> L72
        L39:
            throw r1
        L3a:
            org.bouncycastle.a.h r0 = org.bouncycastle.a.h.a(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            java.math.BigInteger r0 = r0.b()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.b = r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L49:
            r0 = move-exception
            r1 = r0
            goto L34
        L4c:
            r4 = 1
            org.bouncycastle.a.p r0 = org.bouncycastle.a.p.a(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.a = r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L54:
            r4 = 1
            org.bouncycastle.a.q r0 = org.bouncycastle.a.q.a(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            byte[] r0 = r0.c()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.b(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L61:
            r4 = 1
            org.bouncycastle.a.q r0 = org.bouncycastle.a.q.a(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            byte[] r0 = r0.c()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.c(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L6e:
            r3.close()
            return
        L72:
            r0 = move-exception
            r2.addSuppressed(r0)
            goto L39
        L77:
            r3.close()
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.b.a(byte[]):void");
    }
}
