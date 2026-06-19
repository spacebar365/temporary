package org.cybergarage.p157d;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.cybergarage.p154a.C1627e;
import org.cybergarage.p154a.InterfaceC1628f;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p157d.p158a.C1650i;
import org.cybergarage.p157d.p159b.C1653b;
import org.cybergarage.p157d.p159b.C1659h;
import org.cybergarage.p157d.p160c.C1661a;
import org.cybergarage.p157d.p160c.C1662b;
import org.cybergarage.p157d.p160c.C1663c;
import org.cybergarage.p157d.p160c.C1666f;
import org.cybergarage.p157d.p160c.C1667g;
import org.cybergarage.p157d.p160c.C1668h;
import org.cybergarage.p157d.p161d.C1675f;
import org.cybergarage.p157d.p161d.C1676g;
import org.cybergarage.p157d.p161d.C1681l;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1745b;
import org.cybergarage.xml.C1752c;
import org.cybergarage.xml.C1753d;
import org.cybergarage.xml.C1755f;

/* JADX INFO: renamed from: org.cybergarage.d.e */
/* JADX INFO: compiled from: ControlPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1684e implements InterfaceC1628f {

    /* JADX INFO: renamed from: a */
    C1745b f6413a;

    /* JADX INFO: renamed from: b */
    private C1675f f6414b;

    /* JADX INFO: renamed from: c */
    private C1681l f6415c;

    /* JADX INFO: renamed from: d */
    private int f6416d;

    /* JADX INFO: renamed from: e */
    private final C1753d f6417e;

    /* JADX INFO: renamed from: f */
    private final ReentrantReadWriteLock f6418f;

    /* JADX INFO: renamed from: g */
    private C1653b f6419g;

    /* JADX INFO: renamed from: h */
    private long f6420h;

    /* JADX INFO: renamed from: i */
    private C1745b f6421i;

    /* JADX INFO: renamed from: j */
    private C1745b f6422j;

    /* JADX INFO: renamed from: k */
    private C1745b f6423k;

    /* JADX INFO: renamed from: l */
    private String f6424l;

    /* JADX INFO: renamed from: m */
    private C1650i f6425m;

    static {
        C1742n.m5109g();
    }

    /* JADX INFO: renamed from: c */
    private void m4846c(C1676g c1676g) {
        if (c1676g.m4825i()) {
            C1728f c1728fM4839a = m4839a(C1659h.m4745a(c1676g.m4824h()));
            if (c1728fM4839a != null) {
                c1728fM4839a.m4981a(c1676g);
                return;
            }
            try {
                C1752c c1752cM5173a = C1742n.m5107e().m5173a(new URL(c1676g.m4821e()));
                C1728f c1728fM4840a = m4840a(c1752cM5173a);
                if (c1728fM4840a != null) {
                    c1728fM4840a.m4981a(c1676g);
                    this.f6418f.writeLock().lock();
                    try {
                        this.f6417e.add(c1752cM5173a);
                        this.f6418f.writeLock().unlock();
                        m4848e();
                    } catch (Throwable th) {
                        this.f6418f.writeLock().unlock();
                        throw th;
                    }
                }
            } catch (MalformedURLException e) {
                C1744a.m5121c(c1676g.toString());
                C1744a.m5117a(e);
            } catch (C1755f e2) {
                C1744a.m5121c(c1676g.toString());
                C1744a.m5117a(e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static C1728f m4840a(C1752c c1752c) {
        C1752c c1752cM5161l;
        if (c1752c == null || (c1752cM5161l = c1752c.m5161l("device")) == null) {
            return null;
        }
        return new C1728f(c1752c, c1752cM5161l);
    }

    /* JADX INFO: renamed from: d */
    private C1735g m4847d() {
        this.f6418f.readLock().lock();
        try {
            C1735g c1735g = new C1735g();
            int size = this.f6417e.size();
            for (int i = 0; i < size; i++) {
                C1728f c1728fM4840a = m4840a(this.f6417e.m5167a(i));
                if (c1728fM4840a != null) {
                    c1735g.add(c1728fM4840a);
                }
            }
            return c1735g;
        } finally {
            this.f6418f.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    private C1728f m4839a(String str) {
        this.f6418f.readLock().lock();
        try {
            int size = this.f6417e.size();
            for (int i = 0; i < size; i++) {
                C1728f c1728fM4840a = m4840a(this.f6417e.m5167a(i));
                if (c1728fM4840a != null) {
                    if (c1728fM4840a.m4989d(str)) {
                        return c1728fM4840a;
                    }
                    C1728f c1728fM4990e = c1728fM4840a.m4990e(str);
                    if (c1728fM4990e != null) {
                        return c1728fM4990e;
                    }
                }
            }
            this.f6418f.readLock().unlock();
            return null;
        } finally {
            this.f6418f.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4841a(C1728f c1728f) {
        if (c1728f != null) {
            C1752c c1752cM4979a = c1728f.m4979a();
            C1728f c1728fM4840a = m4840a(c1752cM4979a);
            if (c1728fM4840a != null && c1728fM4840a.m4991e()) {
                int size = this.f6413a.size();
                for (int i = 0; i < size; i++) {
                    this.f6413a.get(i);
                }
            }
            this.f6418f.writeLock().lock();
            try {
                this.f6417e.remove(c1752cM4979a);
            } finally {
                this.f6418f.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4849a() {
        long jM4819c;
        C1735g c1735gM4847d = m4847d();
        int size = c1735gM4847d.size();
        C1728f[] c1728fArr = new C1728f[size];
        for (int i = 0; i < size; i++) {
            c1728fArr[i] = c1735gM4847d.m5038a(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            C1728f c1728f = c1728fArr[i2];
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1676g c1676gM4992f = c1728f.m4992f();
            if (c1676gM4992f != null) {
                jM4819c = c1676gM4992f.m4819c();
            } else {
                jM4819c = 0;
            }
            if (((long) (c1728f.m4996h() + 60)) < (jCurrentTimeMillis - jM4819c) / 1000) {
                C1744a.m5120b("Expired device = " + c1728fArr[i2].m5000j());
                m4841a(c1728fArr[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m4851b() {
        return this.f6420h;
    }

    /* JADX INFO: renamed from: e */
    private void m4848e() {
        int size = this.f6413a.size();
        for (int i = 0; i < size; i++) {
            this.f6413a.get(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4850a(C1676g c1676g) {
        if (c1676g.m4825i()) {
            String strM4823g = c1676g.m4823g();
            if (strM4823g == null ? false : strM4823g.startsWith("ssdp:alive")) {
                m4846c(c1676g);
            } else if (c1676g.m4827k() && c1676g.m4827k()) {
                m4841a(m4839a(C1659h.m4745a(c1676g.m4824h())));
            }
        }
        int size = this.f6421i.size();
        for (int i = 0; i < size; i++) {
            this.f6421i.get(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4852b(C1676g c1676g) {
        if (c1676g.m4825i()) {
            m4846c(c1676g);
        }
        int size = this.f6422j.size();
        for (int i = 0; i < size; i++) {
            this.f6422j.get(i);
        }
    }

    @Override // org.cybergarage.p154a.InterfaceC1628f
    /* JADX INFO: renamed from: a */
    public final void mo4669a(C1627e c1627e) {
        C1662b c1662b;
        if (C1744a.m5122c()) {
            c1627e.mo4649H();
        }
        if (c1627e.m4664v()) {
            C1661a c1661a = new C1661a(c1627e);
            C1666f.m4773c(c1661a.m4615c("SID"));
            c1661a.m4619e("SEQ");
            C1663c c1663c = new C1663c();
            C1752c c1752cI = c1661a.m4718I();
            for (int i = 0; i < c1752cI.m5159k(); i++) {
                C1752c c1752cM5144c = c1752cI.m5144c(i);
                if (c1752cM5144c != null) {
                    C1752c c1752cM5144c2 = c1752cM5144c.m5144c(0);
                    C1662b c1662b2 = new C1662b();
                    if (c1752cM5144c2 == null) {
                        c1662b = c1662b2;
                    } else {
                        String strM5153h = c1752cM5144c2.m5153h();
                        int iLastIndexOf = strM5153h.lastIndexOf(58);
                        if (iLastIndexOf != -1) {
                            strM5153h = strM5153h.substring(iLastIndexOf + 1);
                        }
                        c1662b2.m4756a(strM5153h);
                        c1662b2.m4757b(c1752cM5144c2.m5155i());
                        c1662b = c1662b2;
                    }
                    c1663c.add(c1662b);
                }
            }
            int size = c1663c.size();
            for (int i2 = 0; i2 < size; i2++) {
                c1663c.get(i2);
                int size2 = this.f6423k.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.f6423k.get(i3);
                }
            }
            c1627e.m4646E();
            return;
        }
        c1627e.m4647F();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4844a(C1738j c1738j, String str, long j) {
        C1667g c1667g = new C1667g();
        c1667g.m4786b(c1738j, str, j);
        if (C1744a.m5122c()) {
            c1667g.mo4649H();
        }
        C1668h c1668hM4782N = c1667g.m4782N();
        if (C1744a.m5122c()) {
            c1668hM4782N.mo4675t();
        }
        if (c1668hM4782N.m4672q()) {
            c1738j.m5085j(c1668hM4782N.m4790v());
            c1738j.m5060a(c1668hM4782N.m4791w());
            return true;
        }
        c1738j.m5086k();
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4843a(C1738j c1738j) {
        C1667g c1667g = new C1667g();
        c1667g.m4784a(c1738j);
        if (!c1667g.m4782N().m4672q()) {
            return false;
        }
        c1738j.m5086k();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m4845b(C1728f c1728f) {
        C1739k c1739kM5003m = c1728f.m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            if (c1738jM5089a.m5087l()) {
                m4843a(c1738jM5089a);
            }
        }
        C1735g c1735gM5002l = c1728f.m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m4845b(c1735gM5002l.m5038a(i2));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4842a(C1728f c1728f, long j) {
        C1739k c1739kM5003m = c1728f.m5003m();
        int size = c1739kM5003m.size();
        for (int i = 0; i < size; i++) {
            C1738j c1738jM5089a = c1739kM5003m.m5089a(i);
            if (c1738jM5089a.m5088m() && !m4844a(c1738jM5089a, c1738jM5089a.m5084j(), j)) {
                if (c1738jM5089a.m5088m()) {
                    m4844a(c1738jM5089a, c1738jM5089a.m5084j(), j);
                } else {
                    C1728f c1728fM5070c = c1738jM5089a.m5070c();
                    if (c1728fM5070c != null) {
                        String strMo4948r = c1728fM5070c.mo4948r();
                        C1667g c1667g = new C1667g();
                        c1667g.m4785a(c1738jM5089a, C1637a.m4704a(strMo4948r, this.f6416d, this.f6424l), j);
                        C1668h c1668hM4782N = c1667g.m4782N();
                        if (c1668hM4782N.m4672q()) {
                            c1738jM5089a.m5085j(c1668hM4782N.m4790v());
                            c1738jM5089a.m5060a(c1668hM4782N.m4791w());
                        } else {
                            c1738jM5089a.m5086k();
                        }
                    }
                }
            }
        }
        C1735g c1735gM5002l = c1728f.m5002l();
        int size2 = c1735gM5002l.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m4842a(c1735gM5002l.m5038a(i2), j);
        }
    }

    public final void finalize() {
        C1735g c1735gM4847d = m4847d();
        int size = c1735gM4847d.size();
        for (int i = 0; i < size; i++) {
            m4845b(c1735gM4847d.m5038a(i));
        }
        C1675f c1675f = this.f6414b;
        int size2 = c1675f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c1675f.m4814a(i2).m4813i();
        }
        int size3 = c1675f.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c1675f.m4814a(i3).m4802g();
        }
        c1675f.clear();
        c1675f.clear();
        C1681l c1681l = this.f6415c;
        int size4 = c1681l.size();
        for (int i4 = 0; i4 < size4; i4++) {
            c1681l.m4830a(i4).m4829d();
        }
        int size5 = c1681l.size();
        for (int i5 = 0; i5 < size5; i5++) {
            c1681l.m4830a(i5).m4807b();
        }
        c1681l.clear();
        c1681l.clear();
        C1653b c1653b = this.f6419g;
        if (c1653b != null) {
            c1653b.m5130h();
            this.f6419g = null;
        }
        C1650i c1650i = this.f6425m;
        if (c1650i == null) {
            return;
        }
        c1650i.m5130h();
        this.f6425m = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4853c() {
        C1735g c1735gM4847d = m4847d();
        int size = c1735gM4847d.size();
        for (int i = 0; i < size; i++) {
            m4842a(c1735gM4847d.m5038a(i), -1L);
        }
    }
}
