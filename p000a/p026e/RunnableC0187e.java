package p000a.p026e;

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
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0297u;
import p000a.EnumC0294r;
import p000a.InterfaceC0000a;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0291o;
import p000a.InterfaceC0292p;
import p000a.InterfaceC0293q;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.e.e */
/* JADX INFO: compiled from: NameServiceClientImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0187e implements InterfaceC0291o, Runnable {

    /* JADX INFO: renamed from: a */
    static final byte[] f831a = {0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1612b f832b = C1620c.m4563a((Class<?>) RunnableC0187e.class);

    /* JADX INFO: renamed from: c */
    private final Object f833c;

    /* JADX INFO: renamed from: d */
    private int f834d;

    /* JADX INFO: renamed from: e */
    private final Map<C0184b, a> f835e;

    /* JADX INFO: renamed from: f */
    private final Set<C0184b> f836f;

    /* JADX INFO: renamed from: g */
    private int f837g;

    /* JADX INFO: renamed from: h */
    private int f838h;

    /* JADX INFO: renamed from: i */
    private byte[] f839i;

    /* JADX INFO: renamed from: j */
    private byte[] f840j;

    /* JADX INFO: renamed from: k */
    private DatagramSocket f841k;

    /* JADX INFO: renamed from: l */
    private DatagramPacket f842l;

    /* JADX INFO: renamed from: m */
    private DatagramPacket f843m;

    /* JADX INFO: renamed from: n */
    private Map<Integer, AbstractC0189g> f844n;

    /* JADX INFO: renamed from: o */
    private Thread f845o;

    /* JADX INFO: renamed from: p */
    private int f846p;

    /* JADX INFO: renamed from: q */
    private List<EnumC0294r> f847q;

    /* JADX INFO: renamed from: r */
    private InetAddress f848r;

    /* JADX INFO: renamed from: s */
    private InetAddress f849s;

    /* JADX INFO: renamed from: t */
    private InterfaceC0016c f850t;

    /* JADX INFO: renamed from: u */
    private C0190h f851u;

    /* JADX INFO: renamed from: v */
    private C0183a f852v;

    /* JADX INFO: renamed from: w */
    private C0184b f853w;

    /* JADX INFO: renamed from: x */
    private C0190h f854x;

    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0292p mo555a(String str) {
        return m536a(str, 1);
    }

    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC0000a mo560b(String str) {
        return m547b(str, true);
    }

    public RunnableC0187e(InterfaceC0016c interfaceC0016c) {
        this(interfaceC0016c.mo114a().mo13H(), interfaceC0016c.mo114a().mo14I(), interfaceC0016c);
    }

    private RunnableC0187e(int i, InetAddress inetAddress, InterfaceC0016c interfaceC0016c) throws UnknownHostException {
        InetAddress byName;
        this.f833c = new Object();
        this.f834d = 0;
        this.f835e = new HashMap();
        this.f836f = new HashSet();
        this.f844n = new HashMap();
        this.f846p = 0;
        this.f847q = new ArrayList();
        this.f852v = new C0183a();
        this.f837g = i;
        this.f848r = inetAddress;
        this.f850t = interfaceC0016c;
        this.f849s = interfaceC0016c.mo114a().mo11F();
        this.f839i = new byte[interfaceC0016c.mo114a().mo31Z()];
        this.f840j = new byte[interfaceC0016c.mo114a().mo36aa()];
        this.f843m = new DatagramPacket(this.f839i, interfaceC0016c.mo114a().mo31Z(), this.f849s, 137);
        this.f842l = new DatagramPacket(this.f840j, interfaceC0016c.mo114a().mo36aa());
        this.f847q = interfaceC0016c.mo114a().mo10E();
        this.f853w = new C0184b(interfaceC0016c.mo114a(), "0.0.0.0", 0, null);
        this.f854x = new C0190h(this.f853w, 0, false, 0);
        this.f835e.put(this.f853w, new a(this.f853w, this.f854x, -1L));
        InetAddress inetAddressMo14I = interfaceC0016c.mo114a().mo14I();
        if (inetAddressMo14I == null) {
            try {
                byName = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                try {
                    byName = InetAddress.getByName("127.0.0.1");
                } catch (UnknownHostException e2) {
                    throw new C0297u(e2);
                }
            }
        } else {
            byName = inetAddressMo14I;
        }
        String strMo79x = interfaceC0016c.mo114a().mo79x();
        if (strMo79x == null || strMo79x.length() == 0) {
            byte[] address = byName.getAddress();
            strMo79x = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + C0284e.m947a((int) (Math.random() * 255.0d), 2);
        }
        C0184b c0184b = new C0184b(interfaceC0016c.mo114a(), strMo79x, 0, interfaceC0016c.mo114a().mo30Y());
        this.f851u = new C0190h(c0184b, byName.hashCode(), false, 0, false, false, true, false, f831a);
        m540a(c0184b, this.f851u, -1L);
    }

    /* JADX INFO: renamed from: a.e.e$a */
    /* JADX INFO: compiled from: NameServiceClientImpl.java */
    static final class a {

        /* JADX INFO: renamed from: a */
        C0184b f855a;

        /* JADX INFO: renamed from: b */
        C0190h f856b;

        /* JADX INFO: renamed from: c */
        long f857c;

        a(C0184b c0184b, C0190h c0190h, long j) {
            this.f855a = c0184b;
            this.f856b = c0190h;
            this.f857c = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r0 = (p000a.p026e.C0190h) m538a(r3);
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p026e.C0190h m535a(p000a.p026e.C0184b r3, java.net.InetAddress r4) throws java.net.UnknownHostException {
        /*
            r2 = this;
            int r0 = r3.f828c
            r1 = 29
            if (r0 != r1) goto La
            if (r4 != 0) goto La
            java.net.InetAddress r4 = r2.f849s
        La:
            if (r4 == 0) goto L38
            int r0 = r4.hashCode()
        L10:
            r3.f829d = r0
            a.e.h r0 = r2.m551c(r3)
            if (r0 != 0) goto L2a
            java.lang.Object r0 = r2.m538a(r3)
            a.e.h r0 = (p000a.p026e.C0190h) r0
            if (r0 != 0) goto L2a
            a.e.h r0 = r2.m545b(r3, r4)     // Catch: java.net.UnknownHostException -> L3a java.lang.Throwable -> L44
            r2.m539a(r3, r0)
            r2.m549b(r3)
        L2a:
            a.e.h r1 = r2.f854x
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
            a.e.h r0 = r2.f854x     // Catch: java.lang.Throwable -> L44
            r2.m539a(r3, r0)
            r2.m549b(r3)
            goto L2a
        L44:
            r1 = move-exception
            r2.m539a(r3, r0)
            r2.m549b(r3)
            throw r1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p026e.RunnableC0187e.m535a(a.e.b, java.net.InetAddress):a.e.h");
    }

    /* JADX INFO: renamed from: a */
    private Object m538a(C0184b c0184b) {
        C0190h c0190hM551c;
        synchronized (this.f836f) {
            if (!this.f836f.contains(c0184b)) {
                this.f836f.add(c0184b);
                c0190hM551c = null;
            } else {
                while (this.f836f.contains(c0184b)) {
                    try {
                        this.f836f.wait();
                    } catch (InterruptedException e) {
                        f832b.mo4533a("Interrupted", e);
                    }
                }
                c0190hM551c = m551c(c0184b);
                if (c0190hM551c == null) {
                    synchronized (this.f836f) {
                        this.f836f.add(c0184b);
                    }
                }
            }
        }
        return c0190hM551c;
    }

    /* JADX INFO: renamed from: b */
    private void m549b(C0184b c0184b) {
        synchronized (this.f836f) {
            this.f836f.remove(c0184b);
            this.f836f.notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m539a(C0184b c0184b, C0190h c0190h) {
        if (this.f850t.mo114a().mo39ad() != 0) {
            long jCurrentTimeMillis = -1;
            if (this.f850t.mo114a().mo39ad() != -1) {
                jCurrentTimeMillis = System.currentTimeMillis() + ((long) (this.f850t.mo114a().mo39ad() * 1000));
            }
            m540a(c0184b, c0190h, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m540a(C0184b c0184b, C0190h c0190h, long j) {
        if (this.f850t.mo114a().mo39ad() != 0) {
            synchronized (this.f835e) {
                a aVar = this.f835e.get(c0184b);
                if (aVar == null) {
                    this.f835e.put(c0184b, new a(c0184b, c0190h, j));
                } else {
                    aVar.f856b = c0190h;
                    aVar.f857c = j;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private C0190h m551c(C0184b c0184b) {
        C0190h c0190h;
        if (this.f850t.mo114a().mo39ad() == 0) {
            return null;
        }
        synchronized (this.f835e) {
            a aVar = this.f835e.get(c0184b);
            if (aVar != null && aVar.f857c < System.currentTimeMillis() && aVar.f857c >= 0) {
                aVar = null;
            }
            c0190h = aVar != null ? aVar.f856b : null;
        }
        return c0190h;
    }

    /* JADX INFO: renamed from: b */
    private void m548b() {
        synchronized (this.f833c) {
            if (this.f841k != null) {
                this.f841k.close();
                this.f841k = null;
            }
            this.f845o = null;
            this.f844n.clear();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f845o == Thread.currentThread()) {
            try {
                this.f842l.setLength(this.f850t.mo114a().mo36aa());
                this.f841k.setSoTimeout(this.f838h);
                this.f841k.receive(this.f842l);
                f832b.mo4532a("NetBIOS: new data read from socket");
                AbstractC0189g abstractC0189g = this.f844n.get(Integer.valueOf(AbstractC0189g.m565b(this.f840j, 0)));
                if (abstractC0189g != null && !abstractC0189g.f877j) {
                    synchronized (abstractC0189g) {
                        byte[] bArr = this.f840j;
                        abstractC0189g.f870c = AbstractC0189g.m565b(bArr, 0);
                        abstractC0189g.f878k = (bArr[2] & 128) != 0;
                        abstractC0189g.f871d = (bArr[2] & 120) >> 3;
                        abstractC0189g.f879l = (bArr[2] & 4) != 0;
                        abstractC0189g.f880m = (bArr[2] & 2) != 0;
                        abstractC0189g.f881n = (bArr[2] & 1) != 0;
                        abstractC0189g.f882o = (bArr[3] & 128) != 0;
                        abstractC0189g.f883p = (bArr[3] & 16) != 0;
                        abstractC0189g.f872e = bArr[3] & 15;
                        abstractC0189g.f873f = AbstractC0189g.m565b(bArr, 4);
                        abstractC0189g.f874g = AbstractC0189g.m565b(bArr, 6);
                        abstractC0189g.f875h = AbstractC0189g.m565b(bArr, 8);
                        abstractC0189g.f876i = AbstractC0189g.m565b(bArr, 10);
                        abstractC0189g.mo534b(bArr);
                        abstractC0189g.f877j = true;
                        if (f832b.mo4536b()) {
                            f832b.mo4532a(abstractC0189g.toString());
                            f832b.mo4532a(C0284e.m949a(this.f840j, 0, this.f842l.getLength()));
                        }
                        abstractC0189g.notify();
                    }
                }
            } catch (SocketTimeoutException e) {
                f832b.mo4533a("Socket timeout", e);
                return;
            } catch (Exception e2) {
                f832b.mo4541d("Uncaught exception in NameServiceClient", e2);
                return;
            } finally {
                m548b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m542a(AbstractC0189g abstractC0189g, AbstractC0189g abstractC0189g2, int i) {
        Integer numValueOf = null;
        int length = this.f850t.mo114a().mo12G().length;
        if (length == 0) {
            length = 1;
        }
        synchronized (abstractC0189g2) {
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    try {
                        synchronized (this.f833c) {
                            int i3 = this.f846p + 1;
                            this.f846p = i3;
                            if ((i3 & 65535) == 0) {
                                this.f846p = 1;
                            }
                            abstractC0189g.f870c = this.f846p;
                            numValueOf = Integer.valueOf(abstractC0189g.f870c);
                            this.f843m.setAddress(abstractC0189g.f892y);
                            DatagramPacket datagramPacket = this.f843m;
                            byte[] bArr = this.f839i;
                            AbstractC0189g.m564a(abstractC0189g.f870c, bArr, 0);
                            bArr[2] = (byte) ((abstractC0189g.f881n ? 1 : 0) + ((abstractC0189g.f871d << 3) & 120) + (abstractC0189g.f878k ? 128 : 0) + (abstractC0189g.f879l ? 4 : 0) + (abstractC0189g.f880m ? 2 : 0));
                            bArr[3] = (byte) ((abstractC0189g.f883p ? 16 : 0) + (abstractC0189g.f882o ? 128 : 0) + (abstractC0189g.f872e & 15));
                            AbstractC0189g.m564a(abstractC0189g.f873f, bArr, 4);
                            AbstractC0189g.m564a(abstractC0189g.f874g, bArr, 6);
                            AbstractC0189g.m564a(abstractC0189g.f875h, bArr, 8);
                            AbstractC0189g.m564a(abstractC0189g.f876i, bArr, 10);
                            datagramPacket.setLength(abstractC0189g.mo532a(bArr) + 12 + 0);
                            abstractC0189g2.f877j = false;
                            this.f844n.put(numValueOf, abstractC0189g2);
                            int i4 = i + 1000;
                            this.f838h = 0;
                            if (this.f850t.mo114a().mo15J() != 0) {
                                this.f838h = Math.max(this.f850t.mo114a().mo15J(), i4);
                            }
                            if (this.f841k == null) {
                                this.f841k = new DatagramSocket(this.f837g, this.f848r);
                                this.f845o = new Thread(this, "JCIFS-NameServiceClient");
                                this.f845o.setDaemon(true);
                                this.f845o.start();
                            }
                            this.f841k.send(this.f843m);
                            if (f832b.mo4536b()) {
                                f832b.mo4532a(abstractC0189g.toString());
                                f832b.mo4532a(C0284e.m949a(this.f839i, 0, this.f843m.getLength()));
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        while (i > 0) {
                            abstractC0189g2.wait(i);
                            if (!abstractC0189g2.f877j || abstractC0189g.f886s != abstractC0189g2.f888u) {
                                abstractC0189g2.f877j = false;
                                i = (int) (((long) i) - (System.currentTimeMillis() - jCurrentTimeMillis));
                            } else {
                                return;
                            }
                        }
                        this.f844n.remove(numValueOf);
                        synchronized (this.f833c) {
                            if (!m544a(abstractC0189g.f892y)) {
                                break;
                            }
                            if (abstractC0189g.f892y == m552c()) {
                                this.f834d = this.f834d + 1 < this.f850t.mo114a().mo12G().length ? this.f834d + 1 : 0;
                            }
                            abstractC0189g.f892y = m552c();
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.f844n.remove(numValueOf);
                }
                length = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00bb, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p026e.C0190h m545b(p000a.p026e.C0184b r8, java.net.InetAddress r9) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p026e.RunnableC0187e.m545b(a.e.b, java.net.InetAddress):a.e.h");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0190h[] mo559a(InterfaceC0292p interfaceC0292p) throws UnknownHostException {
        C0193k c0193k = new C0193k(this.f850t.mo114a(), (C0190h) interfaceC0292p.mo0a(C0190h.class));
        C0192j c0192j = new C0192j(this.f850t.mo114a(), new C0184b(this.f850t.mo114a(), "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null));
        c0192j.f892y = interfaceC0292p.mo4c();
        int iMo38ac = this.f850t.mo114a().mo38ac();
        while (true) {
            int i = iMo38ac - 1;
            if (iMo38ac > 0) {
                try {
                    m542a(c0192j, c0193k, this.f850t.mo114a().mo37ab());
                    if (c0193k.f877j && c0193k.f872e == 0) {
                        int iHashCode = c0192j.f892y.hashCode();
                        for (int i2 = 0; i2 < c0193k.f908A.length; i2++) {
                            c0193k.f908A[i2].f895b.f829d = iHashCode;
                        }
                        return c0193k.f908A;
                    }
                    iMo38ac = i;
                } catch (IOException e) {
                    f832b.mo4538c("Failed to send node status request for ".concat(String.valueOf(interfaceC0292p)), e);
                    throw new UnknownHostException(interfaceC0292p.toString());
                }
            } else {
                throw new UnknownHostException(interfaceC0292p.mo1a());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private C0190h m536a(String str, int i) {
        return mo556a(str, i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return m535a(r7, r15);
     */
    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000a.p026e.C0190h mo556a(java.lang.String r12, int r13, java.lang.String r14, java.net.InetAddress r15) {
        /*
            r11 = this;
            r10 = 57
            r9 = 48
            r1 = 0
            if (r12 == 0) goto Ld
            int r0 = r12.length()
            if (r0 != 0) goto L10
        Ld:
            a.e.h r0 = r11.f851u
        Lf:
            return r0
        L10:
            a.e.b r7 = new a.e.b
            a.c r0 = r11.f850t
            a.h r0 = r0.mo114a()
            r7.<init>(r0, r12, r13, r14)
            char r0 = r12.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L2a
            a.e.h r0 = r11.m535a(r7, r15)
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
            a.e.h r0 = r11.m535a(r7, r15)
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
            a.e.h r0 = r11.m535a(r7, r15)
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
            a.e.h r0 = r11.m535a(r7, r15)
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
            a.e.h r0 = r11.m535a(r7, r15)
            goto Lf
        L7e:
            a.e.h r0 = new a.e.h
            a.e.b r2 = r11.f853w
            r0.<init>(r2, r3, r1, r1)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p026e.RunnableC0187e.mo556a(java.lang.String, int, java.lang.String, java.net.InetAddress):a.e.h");
    }

    /* JADX INFO: renamed from: c */
    private InetAddress m552c() {
        if (this.f850t.mo114a().mo12G().length == 0) {
            return null;
        }
        return this.f850t.mo114a().mo12G()[this.f834d];
    }

    /* JADX INFO: renamed from: a */
    private boolean m544a(InetAddress inetAddress) {
        for (int i = 0; inetAddress != null && i < this.f850t.mo114a().mo12G().length; i++) {
            if (inetAddress.hashCode() == this.f850t.mo114a().mo12G()[i].hashCode()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a.e.e$c */
    /* JADX INFO: compiled from: NameServiceClientImpl.java */
    static class c {

        /* JADX INFO: renamed from: a */
        int f866a = 2;

        c() {
        }
    }

    /* JADX INFO: renamed from: a.e.e$b */
    /* JADX INFO: compiled from: NameServiceClientImpl.java */
    static class b extends Thread {

        /* JADX INFO: renamed from: a */
        private c f858a;

        /* JADX INFO: renamed from: b */
        private String f859b;

        /* JADX INFO: renamed from: c */
        private String f860c;

        /* JADX INFO: renamed from: d */
        private int f861d;

        /* JADX INFO: renamed from: e */
        private InterfaceC0292p f862e;

        /* JADX INFO: renamed from: f */
        private InetAddress f863f;

        /* JADX INFO: renamed from: g */
        private UnknownHostException f864g;

        /* JADX INFO: renamed from: h */
        private InterfaceC0016c f865h;

        b(c cVar, String str, int i, InetAddress inetAddress, InterfaceC0016c interfaceC0016c) {
            super("JCIFS-QueryThread: ".concat(String.valueOf(str)));
            this.f862e = null;
            this.f858a = cVar;
            this.f859b = str;
            this.f861d = i;
            this.f860c = null;
            this.f863f = inetAddress;
            this.f865h = interfaceC0016c;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                try {
                    try {
                        this.f862e = this.f865h.mo115b().mo556a(this.f859b, this.f861d, this.f860c, this.f863f);
                        synchronized (this.f858a) {
                            c cVar = this.f858a;
                            cVar.f866a--;
                            this.f858a.notify();
                        }
                    } catch (Exception e) {
                        this.f864g = new UnknownHostException(e.getMessage());
                        synchronized (this.f858a) {
                            c cVar2 = this.f858a;
                            cVar2.f866a--;
                            this.f858a.notify();
                        }
                    }
                } catch (UnknownHostException e2) {
                    this.f864g = e2;
                    synchronized (this.f858a) {
                        c cVar3 = this.f858a;
                        cVar3.f866a--;
                        this.f858a.notify();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f858a) {
                    c cVar4 = this.f858a;
                    cVar4.f866a--;
                    this.f858a.notify();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC0292p m562a() {
            return this.f862e;
        }

        /* JADX INFO: renamed from: b */
        public final UnknownHostException m563b() {
            return this.f864g;
        }
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0292p m537a(String str, InetAddress inetAddress) throws UnknownHostException {
        c cVar = new c();
        b bVar = new b(cVar, str, m544a(inetAddress) ? 27 : 29, inetAddress, this.f850t);
        b bVar2 = new b(cVar, str, 32, inetAddress, this.f850t);
        bVar.setDaemon(true);
        bVar2.setDaemon(true);
        try {
            synchronized (cVar) {
                bVar.start();
                bVar2.start();
                while (cVar.f866a > 0 && bVar.m562a() == null && bVar2.m562a() == null) {
                    cVar.wait();
                }
            }
            m541a(bVar);
            m543a((Thread) bVar);
            m541a(bVar2);
            m543a((Thread) bVar2);
            if (bVar.m562a() != null) {
                return bVar.m562a();
            }
            if (bVar2.m562a() != null) {
                return bVar2.m562a();
            }
            throw bVar.m563b();
        } catch (InterruptedException e) {
            throw new UnknownHostException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m541a(b bVar) {
        try {
            bVar.interrupt();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m543a(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m554d(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private C0196n m547b(String str, boolean z) {
        return mo558a(str, z)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0196n[] mo558a(String str, boolean z) throws UnknownHostException {
        InterfaceC0292p interfaceC0292pMo556a;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (C0196n.m573a(str)) {
            return new C0196n[]{new C0196n(m536a(str, 0))};
        }
        if (f832b.mo4536b()) {
            f832b.mo4532a("Resolver order is " + this.f850t.mo114a().mo10E());
        }
        Iterator<EnumC0294r> it = this.f850t.mo114a().mo10E().iterator();
        while (it.hasNext()) {
            switch (C0188f.f867a[it.next().ordinal()]) {
                case 1:
                    C0190h c0190hM525a = this.f852v.m525a(str, this.f850t);
                    if (c0190hM525a != null) {
                        interfaceC0292pMo556a = c0190hM525a;
                        return new C0196n[]{new C0196n(interfaceC0292pMo556a)};
                    }
                    break;
                    break;
                case 2:
                    if (!str.equals("\u0001\u0002__MSBROWSE__\u0002") && str.length() <= 15) {
                        if (z) {
                            interfaceC0292pMo556a = m537a(str, m552c());
                        } else {
                            interfaceC0292pMo556a = mo556a(str, 32, null, m552c());
                        }
                        return new C0196n[]{new C0196n(interfaceC0292pMo556a)};
                    }
                    break;
                    break;
                case 3:
                    if (str.length() <= 15) {
                        if (z) {
                            interfaceC0292pMo556a = m537a(str, this.f850t.mo114a().mo11F());
                        } else {
                            interfaceC0292pMo556a = mo556a(str, 32, null, this.f850t.mo114a().mo11F());
                        }
                        return new C0196n[]{new C0196n(interfaceC0292pMo556a)};
                    }
                    break;
                    break;
                case 4:
                    if (m554d(str)) {
                        throw new UnknownHostException(str);
                    }
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C0196n[] c0196nArr = new C0196n[allByName.length];
                    for (int i = 0; i < allByName.length; i++) {
                        c0196nArr[i] = new C0196n(allByName[i]);
                    }
                    return c0196nArr;
                default:
                    throw new UnknownHostException(str);
            }
        }
        throw new UnknownHostException(str);
    }

    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0000a mo561c(String str) {
        return m547b(str, false);
    }

    @Override // p000a.InterfaceC0291o
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0293q mo557a() {
        if (this.f851u != null) {
            return this.f851u.f895b;
        }
        return null;
    }
}
