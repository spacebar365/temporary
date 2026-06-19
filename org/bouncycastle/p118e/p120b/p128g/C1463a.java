package org.bouncycastle.p118e.p120b.p128g;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p118e.p120b.p128g.C1470g;
import org.bouncycastle.p118e.p120b.p128g.C1472i;
import org.bouncycastle.p118e.p120b.p128g.C1473j;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1463a implements Serializable {

    /* JADX INFO: renamed from: a */
    private transient C1474k f5288a;

    /* JADX INFO: renamed from: b */
    private final int f5289b;

    /* JADX INFO: renamed from: c */
    private final List<C1466c> f5290c;

    /* JADX INFO: renamed from: d */
    private int f5291d;

    /* JADX INFO: renamed from: e */
    private C1484u f5292e;

    /* JADX INFO: renamed from: f */
    private List<C1484u> f5293f;

    /* JADX INFO: renamed from: g */
    private Map<Integer, LinkedList<C1484u>> f5294g;

    /* JADX INFO: renamed from: h */
    private Stack<C1484u> f5295h;

    /* JADX INFO: renamed from: i */
    private Map<Integer, C1484u> f5296i;

    /* JADX INFO: renamed from: j */
    private int f5297j;

    /* JADX INFO: renamed from: k */
    private boolean f5298k;

    private C1463a(C1463a c1463a, byte[] bArr, byte[] bArr2, C1473j c1473j) {
        this.f5288a = c1463a.f5288a;
        this.f5289b = c1463a.f5289b;
        this.f5291d = c1463a.f5291d;
        this.f5292e = c1463a.f5292e;
        this.f5293f = new ArrayList();
        this.f5293f.addAll(c1463a.f5293f);
        this.f5294g = c1463a.f5294g;
        this.f5295h = new Stack<>();
        this.f5295h.addAll(c1463a.f5295h);
        this.f5290c = c1463a.f5290c;
        this.f5296i = new TreeMap(c1463a.f5296i);
        this.f5297j = c1463a.f5297j;
        m3829c(bArr, bArr2, c1473j);
        c1463a.f5298k = true;
    }

    private C1463a(C1474k c1474k, int i, int i2) {
        this.f5288a = c1474k;
        this.f5289b = i;
        this.f5291d = i2;
        if (i2 > i || i2 < 2 || (i - i2) % 2 != 0) {
            throw new IllegalArgumentException("illegal value for BDS parameter k");
        }
        this.f5293f = new ArrayList();
        this.f5294g = new TreeMap();
        this.f5295h = new Stack<>();
        this.f5290c = new ArrayList();
        for (int i3 = 0; i3 < i - i2; i3++) {
            this.f5290c.add(new C1466c(i3));
        }
        this.f5296i = new TreeMap();
        this.f5297j = 0;
        this.f5298k = false;
    }

    C1463a(C1487x c1487x, int i) {
        this(c1487x.m3966e(), c1487x.m3965d(), c1487x.m3967f());
        this.f5297j = i;
        this.f5298k = true;
    }

    C1463a(C1487x c1487x, byte[] bArr, byte[] bArr2, C1473j c1473j) {
        this(c1487x.m3966e(), c1487x.m3965d(), c1487x.m3967f());
        m3828b(bArr, bArr2, c1473j);
    }

    C1463a(C1487x c1487x, byte[] bArr, byte[] bArr2, C1473j c1473j, int i) {
        this(c1487x.m3966e(), c1487x.m3965d(), c1487x.m3967f());
        m3828b(bArr, bArr2, c1473j);
        while (this.f5297j < i) {
            m3829c(bArr, bArr2, c1473j);
            this.f5298k = false;
        }
    }

    /* JADX INFO: renamed from: b */
    private C1466c m3827b() {
        C1466c c1466c = null;
        for (C1466c c1466c2 : this.f5290c) {
            if (!c1466c2.m3856c() && c1466c2.m3857d()) {
                if (c1466c == null) {
                    c1466c = c1466c2;
                } else if (c1466c2.m3851a() < c1466c.m3851a()) {
                    c1466c = c1466c2;
                } else {
                    if (c1466c2.m3851a() != c1466c.m3851a() || c1466c2.m3855b() >= c1466c.m3855b()) {
                        c1466c2 = c1466c;
                    }
                    c1466c = c1466c2;
                }
            }
        }
        return c1466c;
    }

    /* JADX INFO: renamed from: b */
    private void m3828b(byte[] bArr, byte[] bArr2, C1473j c1473j) {
        if (c1473j == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        C1472i c1472i = (C1472i) new C1472i.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).mo3871a();
        int i = 0;
        C1470g c1470g = (C1470g) new C1470g.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).mo3871a();
        C1472i c1472i2 = c1472i;
        while (i < (1 << this.f5289b)) {
            C1473j c1473j2 = (C1473j) new C1473j.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).m3893a(i).m3894b(c1473j.m3888c()).m3895c(c1473j.m3889d()).m3919e(c1473j.m3912g()).mo3871a();
            this.f5288a.m3899a(this.f5288a.m3900a(bArr2, c1473j2), bArr);
            C1477n c1477nM3898a = this.f5288a.m3898a(c1473j2);
            C1472i c1472i3 = (C1472i) new C1472i.a().m3918d(c1472i2.m3910e()).m3917a(c1472i2.m3911f()).m3884a(i).m3885b(c1472i2.m3879c()).m3886c(c1472i2.m3880d()).m3919e(c1472i2.m3912g()).mo3871a();
            C1484u c1484uM3959a = C1485v.m3959a(this.f5288a, c1477nM3898a, c1472i3);
            AbstractC1478o abstractC1478oMo3871a = new C1470g.a().m3918d(c1470g.m3910e()).m3917a(c1470g.m3911f()).m3872b(i).m3919e(c1470g.m3912g()).mo3871a();
            while (true) {
                c1470g = (C1470g) abstractC1478oMo3871a;
                if (this.f5295h.isEmpty() || this.f5295h.peek().m3956a() != c1484uM3959a.m3956a()) {
                    break;
                }
                int iM3956a = i / (1 << c1484uM3959a.m3956a());
                if (iM3956a == 1) {
                    this.f5293f.add(c1484uM3959a.clone());
                }
                if (iM3956a == 3 && c1484uM3959a.m3956a() < this.f5289b - this.f5291d) {
                    this.f5290c.get(c1484uM3959a.m3956a()).m3854a(c1484uM3959a.clone());
                }
                if (iM3956a >= 3 && (iM3956a & 1) == 1 && c1484uM3959a.m3956a() >= this.f5289b - this.f5291d && c1484uM3959a.m3956a() <= this.f5289b - 2) {
                    if (this.f5294g.get(Integer.valueOf(c1484uM3959a.m3956a())) == null) {
                        LinkedList<C1484u> linkedList = new LinkedList<>();
                        linkedList.add(c1484uM3959a.clone());
                        this.f5294g.put(Integer.valueOf(c1484uM3959a.m3956a()), linkedList);
                    } else {
                        this.f5294g.get(Integer.valueOf(c1484uM3959a.m3956a())).add(c1484uM3959a.clone());
                    }
                }
                C1470g c1470g2 = (C1470g) new C1470g.a().m3918d(c1470g.m3910e()).m3917a(c1470g.m3911f()).m3870a(c1470g.m3866b()).m3872b((c1470g.m3867c() - 1) / 2).m3919e(c1470g.m3912g()).mo3871a();
                C1484u c1484uM3960a = C1485v.m3960a(this.f5288a, this.f5295h.pop(), c1484uM3959a, c1470g2);
                c1484uM3959a = new C1484u(c1484uM3960a.m3956a() + 1, c1484uM3960a.m3957b());
                abstractC1478oMo3871a = new C1470g.a().m3918d(c1470g2.m3910e()).m3917a(c1470g2.m3911f()).m3870a(c1470g2.m3866b() + 1).m3872b(c1470g2.m3867c()).m3919e(c1470g2.m3912g()).mo3871a();
            }
            this.f5295h.push(c1484uM3959a);
            i++;
            c1472i2 = c1472i3;
            c1473j = c1473j2;
        }
        this.f5292e = this.f5295h.pop();
    }

    /* JADX INFO: renamed from: c */
    private void m3829c(byte[] bArr, byte[] bArr2, C1473j c1473j) {
        C1473j c1473j2;
        if (c1473j == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f5298k) {
            throw new IllegalStateException("index already used");
        }
        if (this.f5297j > (1 << this.f5289b) - 2) {
            throw new IllegalStateException("index out of bounds");
        }
        int iM3834a = C1464aa.m3834a(this.f5297j, this.f5289b);
        if (((this.f5297j >> (iM3834a + 1)) & 1) == 0 && iM3834a < this.f5289b - 1) {
            this.f5296i.put(Integer.valueOf(iM3834a), this.f5293f.get(iM3834a).clone());
        }
        C1472i c1472i = (C1472i) new C1472i.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).mo3871a();
        C1470g c1470g = (C1470g) new C1470g.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).mo3871a();
        if (iM3834a == 0) {
            C1473j c1473j3 = (C1473j) new C1473j.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).m3893a(this.f5297j).m3894b(c1473j.m3888c()).m3895c(c1473j.m3889d()).m3919e(c1473j.m3912g()).mo3871a();
            this.f5288a.m3899a(this.f5288a.m3900a(bArr2, c1473j3), bArr);
            this.f5293f.set(0, C1485v.m3959a(this.f5288a, this.f5288a.m3898a(c1473j3), (C1472i) new C1472i.a().m3918d(c1472i.m3910e()).m3917a(c1472i.m3911f()).m3884a(this.f5297j).m3885b(c1472i.m3879c()).m3886c(c1472i.m3880d()).m3919e(c1472i.m3912g()).mo3871a()));
            c1473j2 = c1473j3;
        } else {
            C1470g c1470g2 = (C1470g) new C1470g.a().m3918d(c1470g.m3910e()).m3917a(c1470g.m3911f()).m3870a(iM3834a - 1).m3872b(this.f5297j >> iM3834a).m3919e(c1470g.m3912g()).mo3871a();
            this.f5288a.m3899a(this.f5288a.m3900a(bArr2, c1473j), bArr);
            C1484u c1484uM3960a = C1485v.m3960a(this.f5288a, this.f5293f.get(iM3834a - 1), this.f5296i.get(Integer.valueOf(iM3834a - 1)), c1470g2);
            this.f5293f.set(iM3834a, new C1484u(c1484uM3960a.m3956a() + 1, c1484uM3960a.m3957b()));
            this.f5296i.remove(Integer.valueOf(iM3834a - 1));
            for (int i = 0; i < iM3834a; i++) {
                if (i < this.f5289b - this.f5291d) {
                    this.f5293f.set(i, this.f5290c.get(i).m3858e());
                } else {
                    this.f5293f.set(i, this.f5294g.get(Integer.valueOf(i)).removeFirst());
                }
            }
            int iMin = Math.min(iM3834a, this.f5289b - this.f5291d);
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = ((1 << i2) * 3) + this.f5297j + 1;
                if (i3 < (1 << this.f5289b)) {
                    this.f5290c.get(i2).m3852a(i3);
                }
            }
            c1473j2 = c1473j;
        }
        for (int i4 = 0; i4 < ((this.f5289b - this.f5291d) >> 1); i4++) {
            C1466c c1466cM3827b = m3827b();
            if (c1466cM3827b != null) {
                c1466cM3827b.m3853a(this.f5295h, this.f5288a, bArr, bArr2, c1473j2);
            }
        }
        this.f5297j++;
    }

    /* JADX INFO: renamed from: a */
    protected final int m3830a() {
        return this.f5297j;
    }

    /* JADX INFO: renamed from: a */
    public final C1463a m3831a(C0653p c0653p) {
        return new C1463a(this, C1469f.m3864a(c0653p));
    }

    /* JADX INFO: renamed from: a */
    public final C1463a m3832a(byte[] bArr, byte[] bArr2, C1473j c1473j) {
        return new C1463a(this, bArr, bArr2, c1473j);
    }

    private C1463a(C1463a c1463a, InterfaceC1175r interfaceC1175r) {
        this.f5288a = new C1474k(new C1476m(interfaceC1175r));
        this.f5289b = c1463a.f5289b;
        this.f5291d = c1463a.f5291d;
        this.f5292e = c1463a.f5292e;
        this.f5293f = new ArrayList();
        this.f5293f.addAll(c1463a.f5293f);
        this.f5294g = c1463a.f5294g;
        this.f5295h = new Stack<>();
        this.f5295h.addAll(c1463a.f5295h);
        this.f5290c = c1463a.f5290c;
        this.f5296i = new TreeMap(c1463a.f5296i);
        this.f5297j = c1463a.f5297j;
        this.f5298k = c1463a.f5298k;
        if (this.f5293f == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f5294g == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f5295h == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f5290c == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.f5296i == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!C1464aa.m3838a(this.f5289b, this.f5297j)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }
}
