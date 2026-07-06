package a.e;

import a.o;
import a.p;
import a.q;
import a.r;
import a.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: NameServiceClientImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements o, Runnable {
    static final byte[] a = {0, 0, 0, 0, 0, 0};
    private static final org.c.b b = org.c.c.a((Class<?>) e.class);
    private final Object c;
    private int d;
    private final Map<b, e$a> e;
    private final Set<b> f;
    private int g;
    private int h;
    private byte[] i;
    private byte[] j;
    private DatagramSocket k;
    private DatagramPacket l;
    private DatagramPacket m;
    private Map<Integer, g> n;
    private Thread o;
    private int p;
    private List<r> q;
    private InetAddress r;
    private InetAddress s;
    private a.c t;
    private h u;
    private a v;
    private b w;
    private h x;

    @Override // a.o
    public final /* bridge */ /* synthetic */ p a(String str) {
        return a(str, 1);
    }

    @Override // a.o
    public final /* synthetic */ p a(String str, int i, String str2, InetAddress inetAddress) {
        return b(str, i, str2, inetAddress);
    }

    @Override // a.o
    public final /* synthetic */ a.a[] a(String str, boolean z) {
        return c(str, z);
    }

    @Override // a.o
    public final /* synthetic */ p[] a(p pVar) {
        return b(pVar);
    }

    @Override // a.o
    public final /* bridge */ /* synthetic */ a.a b(String str) {
        return b(str, true);
    }

    public e(a.c cVar) {
        this(cVar.a().H(), cVar.a().I(), cVar);
    }

    private e(int i, InetAddress inetAddress, a.c cVar) throws UnknownHostException {
        InetAddress byName;
        this.c = new Object();
        this.d = 0;
        this.e = new HashMap();
        this.f = new HashSet();
        this.n = new HashMap();
        this.p = 0;
        this.q = new ArrayList();
        this.v = new a();
        this.g = i;
        this.r = inetAddress;
        this.t = cVar;
        this.s = cVar.a().F();
        this.i = new byte[cVar.a().Z()];
        this.j = new byte[cVar.a().aa()];
        this.m = new DatagramPacket(this.i, cVar.a().Z(), this.s, 137);
        this.l = new DatagramPacket(this.j, cVar.a().aa());
        this.q = cVar.a().E();
        this.w = new b(cVar.a(), "0.0.0.0", 0, null);
        this.x = new h(this.w, 0, false, 0);
        this.e.put(this.w, new e$a(this.w, this.x, -1L));
        InetAddress inetAddressI = cVar.a().I();
        if (inetAddressI == null) {
            try {
                byName = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                try {
                    byName = InetAddress.getByName("127.0.0.1");
                } catch (UnknownHostException e2) {
                    throw new u(e2);
                }
            }
        } else {
            byName = inetAddressI;
        }
        String strX = cVar.a().x();
        if (strX == null || strX.length() == 0) {
            byte[] address = byName.getAddress();
            strX = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + a.i.e.a((int) (Math.random() * 255.0d), 2);
        }
        b bVar = new b(cVar.a(), strX, 0, cVar.a().Y());
        this.u = new h(bVar, byName.hashCode(), false, 0, false, false, true, false, a);
        a(bVar, this.u, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r0 = (a.e.h) a(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.e.h a(a.e.b r3, java.net.InetAddress r4) throws java.net.UnknownHostException {
        /*
            r2 = this;
            int r0 = r3.c
            r1 = 29
            if (r0 != r1) goto La
            if (r4 != 0) goto La
            java.net.InetAddress r4 = r2.s
        La:
            if (r4 == 0) goto L38
            int r0 = r4.hashCode()
        L10:
            r3.d = r0
            a.e.h r0 = r2.c(r3)
            if (r0 != 0) goto L2a
            java.lang.Object r0 = r2.a(r3)
            a.e.h r0 = (a.e.h) r0
            if (r0 != 0) goto L2a
            a.e.h r0 = r2.b(r3, r4)     // Catch: java.net.UnknownHostException -> L3a java.lang.Throwable -> L44
            r2.a(r3, r0)
            r2.b(r3)
        L2a:
            a.e.h r1 = r2.x
            if (r0 != r1) goto L4c
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L38:
            r0 = 0
            goto L10
        L3a:
            r1 = move-exception
            a.e.h r0 = r2.x     // Catch: java.lang.Throwable -> L44
            r2.a(r3, r0)
            r2.b(r3)
            goto L2a
        L44:
            r1 = move-exception
            r2.a(r3, r0)
            r2.b(r3)
            throw r1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.e.a(a.e.b, java.net.InetAddress):a.e.h");
    }

    private Object a(b bVar) {
        h hVarC;
        synchronized (this.f) {
            if (!this.f.contains(bVar)) {
                this.f.add(bVar);
                hVarC = null;
            } else {
                while (this.f.contains(bVar)) {
                    try {
                        this.f.wait();
                    } catch (InterruptedException e) {
                        b.a("Interrupted", e);
                    }
                }
                hVarC = c(bVar);
                if (hVarC == null) {
                    synchronized (this.f) {
                        this.f.add(bVar);
                    }
                }
            }
        }
        return hVarC;
    }

    private void b(b bVar) {
        synchronized (this.f) {
            this.f.remove(bVar);
            this.f.notifyAll();
        }
    }

    private void a(b bVar, h hVar) {
        if (this.t.a().ad() != 0) {
            long jCurrentTimeMillis = -1;
            if (this.t.a().ad() != -1) {
                jCurrentTimeMillis = System.currentTimeMillis() + ((long) (this.t.a().ad() * 1000));
            }
            a(bVar, hVar, jCurrentTimeMillis);
        }
    }

    private void a(b bVar, h hVar, long j) {
        if (this.t.a().ad() != 0) {
            synchronized (this.e) {
                e$a e_a = this.e.get(bVar);
                if (e_a == null) {
                    this.e.put(bVar, new e$a(bVar, hVar, j));
                } else {
                    e_a.b = hVar;
                    e_a.c = j;
                }
            }
        }
    }

    private h c(b bVar) {
        h hVar;
        if (this.t.a().ad() == 0) {
            return null;
        }
        synchronized (this.e) {
            e$a e_a = this.e.get(bVar);
            if (e_a != null && e_a.c < System.currentTimeMillis() && e_a.c >= 0) {
                e_a = null;
            }
            hVar = e_a != null ? e_a.b : null;
        }
        return hVar;
    }

    private void b() {
        synchronized (this.c) {
            if (this.k != null) {
                this.k.close();
                this.k = null;
            }
            this.o = null;
            this.n.clear();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.o == Thread.currentThread()) {
            try {
                this.l.setLength(this.t.a().aa());
                this.k.setSoTimeout(this.h);
                this.k.receive(this.l);
                b.a("NetBIOS: new data read from socket");
                g gVar = this.n.get(Integer.valueOf(g.b(this.j, 0)));
                if (gVar != null && !gVar.j) {
                    synchronized (gVar) {
                        byte[] bArr = this.j;
                        gVar.c = g.b(bArr, 0);
                        gVar.k = (bArr[2] & 128) != 0;
                        gVar.d = (bArr[2] & 120) >> 3;
                        gVar.l = (bArr[2] & 4) != 0;
                        gVar.m = (bArr[2] & 2) != 0;
                        gVar.n = (bArr[2] & 1) != 0;
                        gVar.o = (bArr[3] & 128) != 0;
                        gVar.p = (bArr[3] & 16) != 0;
                        gVar.e = bArr[3] & 15;
                        gVar.f = g.b(bArr, 4);
                        gVar.g = g.b(bArr, 6);
                        gVar.h = g.b(bArr, 8);
                        gVar.i = g.b(bArr, 10);
                        gVar.b(bArr);
                        gVar.j = true;
                        if (b.b()) {
                            b.a(gVar.toString());
                            b.a(a.i.e.a(this.j, 0, this.l.getLength()));
                        }
                        gVar.notify();
                    }
                }
            } catch (SocketTimeoutException e) {
                b.a("Socket timeout", e);
                return;
            } catch (Exception e2) {
                b.d("Uncaught exception in NameServiceClient", e2);
                return;
            } finally {
                b();
            }
        }
    }

    private void a(g gVar, g gVar2, int i) {
        Integer numValueOf = null;
        int length = this.t.a().G().length;
        if (length == 0) {
            length = 1;
        }
        synchronized (gVar2) {
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    try {
                        synchronized (this.c) {
                            int i3 = this.p + 1;
                            this.p = i3;
                            if ((i3 & 65535) == 0) {
                                this.p = 1;
                            }
                            gVar.c = this.p;
                            numValueOf = Integer.valueOf(gVar.c);
                            this.m.setAddress(gVar.y);
                            DatagramPacket datagramPacket = this.m;
                            byte[] bArr = this.i;
                            g.a(gVar.c, bArr, 0);
                            bArr[2] = (byte) ((gVar.n ? 1 : 0) + ((gVar.d << 3) & 120) + (gVar.k ? 128 : 0) + (gVar.l ? 4 : 0) + (gVar.m ? 2 : 0));
                            bArr[3] = (byte) ((gVar.p ? 16 : 0) + (gVar.o ? 128 : 0) + (gVar.e & 15));
                            g.a(gVar.f, bArr, 4);
                            g.a(gVar.g, bArr, 6);
                            g.a(gVar.h, bArr, 8);
                            g.a(gVar.i, bArr, 10);
                            datagramPacket.setLength(gVar.a(bArr) + 12 + 0);
                            gVar2.j = false;
                            this.n.put(numValueOf, gVar2);
                            int i4 = i + 1000;
                            this.h = 0;
                            if (this.t.a().J() != 0) {
                                this.h = Math.max(this.t.a().J(), i4);
                            }
                            if (this.k == null) {
                                this.k = new DatagramSocket(this.g, this.r);
                                this.o = new Thread(this, "JCIFS-NameServiceClient");
                                this.o.setDaemon(true);
                                this.o.start();
                            }
                            this.k.send(this.m);
                            if (b.b()) {
                                b.a(gVar.toString());
                                b.a(a.i.e.a(this.i, 0, this.m.getLength()));
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        while (i > 0) {
                            gVar2.wait(i);
                            if (!gVar2.j || gVar.s != gVar2.u) {
                                gVar2.j = false;
                                i = (int) (((long) i) - (System.currentTimeMillis() - jCurrentTimeMillis));
                            } else {
                                return;
                            }
                        }
                        this.n.remove(numValueOf);
                        synchronized (this.c) {
                            if (!a(gVar.y)) {
                                break;
                            }
                            if (gVar.y == c()) {
                                this.d = this.d + 1 < this.t.a().G().length ? this.d + 1 : 0;
                            }
                            gVar.y = c();
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.n.remove(numValueOf);
                }
                length = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00bb, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.e.h b(a.e.b r8, java.net.InetAddress r9) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.e.b(a.e.b, java.net.InetAddress):a.e.h");
    }

    private h[] b(p pVar) throws UnknownHostException {
        k kVar = new k(this.t.a(), (h) pVar.a(h.class));
        j jVar = new j(this.t.a(), new b(this.t.a(), "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null));
        jVar.y = pVar.c();
        int iAc = this.t.a().ac();
        while (true) {
            int i = iAc - 1;
            if (iAc > 0) {
                try {
                    a(jVar, kVar, this.t.a().ab());
                    if (kVar.j && kVar.e == 0) {
                        int iHashCode = jVar.y.hashCode();
                        for (int i2 = 0; i2 < kVar.A.length; i2++) {
                            kVar.A[i2].b.d = iHashCode;
                        }
                        return kVar.A;
                    }
                    iAc = i;
                } catch (IOException e) {
                    b.c("Failed to send node status request for ".concat(String.valueOf(pVar)), e);
                    throw new UnknownHostException(pVar.toString());
                }
            } else {
                throw new UnknownHostException(pVar.a());
            }
        }
    }

    private h a(String str, int i) {
        return b(str, i, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return a(r7, r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a.e.h b(java.lang.String r12, int r13, java.lang.String r14, java.net.InetAddress r15) {
        /*
            r11 = this;
            r10 = 57
            r9 = 48
            r1 = 0
            if (r12 == 0) goto Ld
            int r0 = r12.length()
            if (r0 != 0) goto L10
        Ld:
            a.e.h r0 = r11.u
        Lf:
            return r0
        L10:
            a.e.b r7 = new a.e.b
            a.c r0 = r11.t
            a.h r0 = r0.a()
            r7.<init>(r0, r12, r13, r14)
            char r0 = r12.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L2a
            a.e.h r0 = r11.a(r7, r15)
            goto Lf
        L2a:
            char[] r8 = r12.toCharArray()
            r0 = r1
            r2 = r1
            r3 = r1
        L31:
            int r4 = r8.length
            if (r0 >= r4) goto L6e
            char r6 = r8[r0]
            if (r6 < r9) goto L3a
            if (r6 <= r10) goto L3f
        L3a:
            a.e.h r0 = r11.a(r7, r15)
            goto Lf
        L3f:
            r4 = r1
            r5 = r0
        L41:
            r0 = 46
            if (r6 == r0) goto L5c
            if (r6 < r9) goto L49
            if (r6 <= r10) goto L4e
        L49:
            a.e.h r0 = r11.a(r7, r15)
            goto Lf
        L4e:
            int r0 = r4 * 10
            int r0 = r0 + r6
            int r0 = r0 + (-48)
            int r5 = r5 + 1
            int r4 = r8.length
            if (r5 >= r4) goto L5d
            char r6 = r8[r5]
            r4 = r0
            goto L41
        L5c:
            r0 = r4
        L5d:
            r4 = 255(0xff, float:3.57E-43)
            if (r0 <= r4) goto L66
            a.e.h r0 = r11.a(r7, r15)
            goto Lf
        L66:
            int r3 = r3 << 8
            int r3 = r3 + r0
            int r2 = r2 + 1
            int r0 = r5 + 1
            goto L31
        L6e:
            r0 = 4
            if (r2 != r0) goto L79
            java.lang.String r0 = "."
            boolean r0 = r12.endsWith(r0)
            if (r0 == 0) goto L7e
        L79:
            a.e.h r0 = r11.a(r7, r15)
            goto Lf
        L7e:
            a.e.h r0 = new a.e.h
            a.e.b r2 = r11.w
            r0.<init>(r2, r3, r1, r1)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.e.b(java.lang.String, int, java.lang.String, java.net.InetAddress):a.e.h");
    }

    private InetAddress c() {
        if (this.t.a().G().length == 0) {
            return null;
        }
        return this.t.a().G()[this.d];
    }

    private boolean a(InetAddress inetAddress) {
        for (int i = 0; inetAddress != null && i < this.t.a().G().length; i++) {
            if (inetAddress.hashCode() == this.t.a().G()[i].hashCode()) {
                return true;
            }
        }
        return false;
    }

    private p a(String str, InetAddress inetAddress) throws UnknownHostException {
        e$c e_c = new e$c();
        e$b e_b = new e$b(e_c, str, a(inetAddress) ? 27 : 29, inetAddress, this.t);
        e$b e_b2 = new e$b(e_c, str, 32, inetAddress, this.t);
        e_b.setDaemon(true);
        e_b2.setDaemon(true);
        try {
            synchronized (e_c) {
                e_b.start();
                e_b2.start();
                while (e_c.a > 0 && e_b.a() == null && e_b2.a() == null) {
                    e_c.wait();
                }
            }
            a(e_b);
            a((Thread) e_b);
            a(e_b2);
            a((Thread) e_b2);
            if (e_b.a() != null) {
                return e_b.a();
            }
            if (e_b2.a() != null) {
                return e_b2.a();
            }
            throw e_b.b();
        } catch (InterruptedException e) {
            throw new UnknownHostException(str);
        }
    }

    private static void a(e$b e_b) {
        try {
            e_b.interrupt();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    private static void a(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static boolean d(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private n b(String str, boolean z) {
        return c(str, z)[0];
    }

    private n[] c(String str, boolean z) throws UnknownHostException {
        p pVarB;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (n.a(str)) {
            return new n[]{new n(a(str, 0))};
        }
        if (b.b()) {
            b.a("Resolver order is " + this.t.a().E());
        }
        Iterator<r> it = this.t.a().E().iterator();
        while (it.hasNext()) {
            switch (f.a[it.next().ordinal()]) {
                case 1:
                    h hVarA = this.v.a(str, this.t);
                    if (hVarA != null) {
                        pVarB = hVarA;
                        return new n[]{new n(pVarB)};
                    }
                    break;
                    break;
                case 2:
                    if (!str.equals("\u0001\u0002__MSBROWSE__\u0002") && str.length() <= 15) {
                        if (z) {
                            pVarB = a(str, c());
                        } else {
                            pVarB = b(str, 32, null, c());
                        }
                        return new n[]{new n(pVarB)};
                    }
                    break;
                    break;
                case 3:
                    if (str.length() <= 15) {
                        if (z) {
                            pVarB = a(str, this.t.a().F());
                        } else {
                            pVarB = b(str, 32, null, this.t.a().F());
                        }
                        return new n[]{new n(pVarB)};
                    }
                    break;
                    break;
                case 4:
                    if (d(str)) {
                        throw new UnknownHostException(str);
                    }
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    n[] nVarArr = new n[allByName.length];
                    for (int i = 0; i < allByName.length; i++) {
                        nVarArr[i] = new n(allByName[i]);
                    }
                    return nVarArr;
                default:
                    throw new UnknownHostException(str);
            }
        }
        throw new UnknownHostException(str);
    }

    @Override // a.o
    public final /* synthetic */ a.a c(String str) {
        return b(str, false);
    }

    @Override // a.o
    public final /* bridge */ /* synthetic */ q a() {
        if (this.u != null) {
            return this.u.b;
        }
        return null;
    }
}
