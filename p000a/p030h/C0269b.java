package p000a.p030h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0583bg;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0627h;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: a.h.b */
/* JADX INFO: compiled from: NegTokenTarg.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0269b extends AbstractC0271d {

    /* JADX INFO: renamed from: a */
    private C0653p f1230a;

    /* JADX INFO: renamed from: b */
    private int f1231b;

    public C0269b() {
        this.f1231b = -1;
    }

    public C0269b(byte[] bArr, byte[] bArr2) {
        this.f1231b = -1;
        this.f1231b = -1;
        this.f1230a = null;
        m920b(bArr);
        m921c(bArr2);
    }

    public C0269b(byte[] bArr) throws Throwable {
        this.f1231b = -1;
        mo915a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final int m918a() {
        return this.f1231b;
    }

    /* JADX INFO: renamed from: c */
    public final C0653p m919c() {
        return this.f1230a;
    }

    @Override // p000a.p030h.AbstractC0271d
    /* JADX INFO: renamed from: b */
    public final byte[] mo917b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0583bg c0583bg = new C0583bg(byteArrayOutputStream);
            C0625g c0625g = new C0625g();
            int i = this.f1231b;
            if (i != -1) {
                c0625g.m1521a(new C0590bn(true, 0, new C0627h(i)));
            }
            C0653p c0653p = this.f1230a;
            if (c0653p != null) {
                c0625g.m1521a(new C0590bn(true, 1, c0653p));
            }
            byte[] bArrD = m922d();
            if (bArrD != null) {
                c0625g.m1521a(new C0590bn(true, 2, new C0581be(bArrD)));
            }
            byte[] bArrE = m923e();
            if (bArrE != null) {
                c0625g.m1521a(new C0590bn(true, 3, new C0581be(bArrE)));
            }
            c0583bg.mo1459a((InterfaceC0618f) new C0590bn(true, 1, new C0585bi(c0625g)));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000a.p030h.AbstractC0271d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo915a(byte[] r6) throws java.lang.Throwable {
        /*
            r5 = this;
            org.bouncycastle.a.l r3 = new org.bouncycastle.a.l
            r3.<init>(r6)
            r2 = 0
            org.bouncycastle.a.u r0 = r3.m1560b()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            org.bouncycastle.a.ab r0 = (org.bouncycastle.p054a.AbstractC0539ab) r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r1 = 1
            org.bouncycastle.a.v r0 = org.bouncycastle.p054a.AbstractC0723v.m1709a(r0, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            java.util.Enumeration r1 = r0.mo1483c()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
        L15:
            boolean r0 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r1.nextElement()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            org.bouncycastle.a.ab r0 = (org.bouncycastle.p054a.AbstractC0539ab) r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            int r4 = r0.m1396b()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
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
            org.bouncycastle.a.h r0 = org.bouncycastle.p054a.C0627h.m1523a(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            java.math.BigInteger r0 = r0.m1525b()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.f1231b = r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L49:
            r0 = move-exception
            r1 = r0
            goto L34
        L4c:
            r4 = 1
            org.bouncycastle.a.p r0 = org.bouncycastle.p054a.C0653p.m1585a(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.f1230a = r0     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L54:
            r4 = 1
            org.bouncycastle.a.q r0 = org.bouncycastle.p054a.AbstractC0655q.m1597a(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            byte[] r0 = r0.mo1410c()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.m920b(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            goto L15
        L61:
            r4 = 1
            org.bouncycastle.a.q r0 = org.bouncycastle.p054a.AbstractC0655q.m1597a(r0, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            byte[] r0 = r0.mo1410c()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
            r5.m921c(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L49
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p030h.C0269b.mo915a(byte[]):void");
    }
}
