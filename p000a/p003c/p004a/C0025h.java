package p000a.p003c.p004a;

import p000a.p003c.AbstractC0038g;
import p000a.p003c.C0043l;
import p000a.p003c.p005b.AbstractC0032d;
import p000a.p003c.p005b.C0029a;
import p000a.p003c.p005b.C0030b;
import p000a.p003c.p005b.C0033e;

/* JADX INFO: renamed from: a.c.a.h */
/* JADX INFO: compiled from: lsarpc.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0025h {

    /* JADX INFO: renamed from: a.c.a.h$e */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class e extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f125a;

        /* JADX INFO: renamed from: b */
        public short f126b;

        /* JADX INFO: renamed from: c */
        public byte f127c;

        /* JADX INFO: renamed from: d */
        public byte f128d;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f125a);
            c0029a.m149f(this.f126b);
            c0029a.m148e(this.f127c);
            c0029a.m148e(this.f128d);
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            this.f125a = c0029a.m145d();
            this.f126b = (short) c0029a.m143c();
            this.f127c = (byte) c0029a.m141b();
            this.f128d = (byte) c0029a.m141b();
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$c */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class c extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f114a;

        /* JADX INFO: renamed from: b */
        public C0033e f115b;

        /* JADX INFO: renamed from: c */
        public C0043l.c f116c;

        /* JADX INFO: renamed from: d */
        public int f117d;

        /* JADX INFO: renamed from: e */
        public int f118e;

        /* JADX INFO: renamed from: f */
        public e f119f;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f114a);
            c0029a.m139a(this.f115b);
            c0029a.m139a(this.f116c);
            c0029a.m150g(this.f117d);
            c0029a.m150g(this.f118e);
            c0029a.m139a(this.f119f);
            if (this.f115b != null) {
                c0029a = c0029a.f183e;
                this.f115b.mo128e(c0029a);
            }
            if (this.f116c != null) {
                c0029a = c0029a.f183e;
                this.f116c.mo128e(c0029a);
            }
            if (this.f119f != null) {
                this.f119f.mo128e(c0029a.f183e);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            C0029a c0029a2;
            c0029a.m146d(4);
            this.f114a = c0029a.m145d();
            int iM145d = c0029a.m145d();
            int iM145d2 = c0029a.m145d();
            this.f117d = c0029a.m145d();
            this.f118e = c0029a.m145d();
            int iM145d3 = c0029a.m145d();
            if (iM145d != 0) {
                c0029a2 = c0029a.f183e;
                this.f115b.mo129f(c0029a2);
            } else {
                c0029a2 = c0029a;
            }
            if (iM145d2 != 0) {
                if (this.f116c == null) {
                    this.f116c = new C0043l.c();
                }
                c0029a2 = c0029a2.f183e;
                this.f116c.mo129f(c0029a2);
            }
            if (iM145d3 != 0) {
                if (this.f119f == null) {
                    this.f119f = new e();
                }
                this.f119f.mo129f(c0029a2.f183e);
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$h */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class h extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public C0043l.b f134a;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m139a(this.f134a);
            if (this.f134a != null) {
                this.f134a.mo128e(c0029a.f183e);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            if (c0029a.m145d() != 0) {
                if (this.f134a == null) {
                    this.f134a = new C0043l.b();
                }
                this.f134a.mo129f(c0029a.f183e);
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$g */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class g extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f132a;

        /* JADX INFO: renamed from: b */
        public h[] f133b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f132a);
            c0029a.m139a(this.f133b);
            if (this.f133b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f132a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 4);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f133b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f132a = c0029a.m145d();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d * 4);
                if (this.f133b == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f133b = new h[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d; i2++) {
                    if (this.f133b[i2] == null) {
                        this.f133b[i2] = new h();
                    }
                    this.f133b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$k */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class k extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public C0043l.c f140a;

        /* JADX INFO: renamed from: b */
        public C0043l.b f141b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m149f(this.f140a.f213b);
            c0029a.m149f(this.f140a.f214c);
            c0029a.m139a(this.f140a.f215d);
            c0029a.m139a(this.f141b);
            if (this.f140a.f215d != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f140a.f213b / 2;
                c0029a2.m150g(this.f140a.f214c / 2);
                c0029a2.m150g(0);
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 2);
                c0029a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    c0029a.m149f(this.f140a.f215d[i3]);
                }
            }
            if (this.f141b != null) {
                this.f141b.mo128e(c0029a.f183e);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            c0029a.m146d(4);
            if (this.f140a == null) {
                this.f140a = new C0043l.c();
            }
            this.f140a.f213b = (short) c0029a.m143c();
            this.f140a.f214c = (short) c0029a.m143c();
            int iM145d = c0029a.m145d();
            int iM145d2 = c0029a.m145d();
            if (iM145d != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d3 = c0029a2.m145d();
                c0029a2.m145d();
                int iM145d4 = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d4 * 2);
                if (this.f140a.f215d == null) {
                    if (iM145d3 < 0 || iM145d3 > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f140a.f215d = new short[iM145d3];
                }
                c0029a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d4; i2++) {
                    this.f140a.f215d[i2] = (short) c0029a.m143c();
                }
            }
            if (iM145d2 != 0) {
                if (this.f141b == null) {
                    this.f141b = new C0043l.b();
                }
                this.f141b.mo129f(c0029a.f183e);
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$f */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class f extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f129a;

        /* JADX INFO: renamed from: b */
        public k[] f130b;

        /* JADX INFO: renamed from: c */
        public int f131c;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f129a);
            c0029a.m139a(this.f130b);
            c0029a.m150g(this.f131c);
            if (this.f130b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f129a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 12);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f130b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f129a = c0029a.m145d();
            int iM145d = c0029a.m145d();
            this.f131c = c0029a.m145d();
            if (iM145d != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d2 = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d2 * 12);
                if (this.f130b == null) {
                    if (iM145d2 < 0 || iM145d2 > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f130b = new k[iM145d2];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d2; i2++) {
                    if (this.f130b[i2] == null) {
                        this.f130b[i2] = new k();
                    }
                    this.f130b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$j */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class j extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public short f137a;

        /* JADX INFO: renamed from: b */
        public C0043l.c f138b;

        /* JADX INFO: renamed from: c */
        public int f139c;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m149f(this.f137a);
            c0029a.m149f(this.f138b.f213b);
            c0029a.m149f(this.f138b.f214c);
            c0029a.m139a(this.f138b.f215d);
            c0029a.m150g(this.f139c);
            if (this.f138b.f215d != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f138b.f213b / 2;
                c0029a2.m150g(this.f138b.f214c / 2);
                c0029a2.m150g(0);
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 2);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    c0029aM137a.m149f(this.f138b.f215d[i3]);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f137a = (short) c0029a.m143c();
            c0029a.m146d(4);
            if (this.f138b == null) {
                this.f138b = new C0043l.c();
            }
            this.f138b.f213b = (short) c0029a.m143c();
            this.f138b.f214c = (short) c0029a.m143c();
            int iM145d = c0029a.m145d();
            this.f139c = c0029a.m145d();
            if (iM145d != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d2 = c0029a2.m145d();
                c0029a2.m145d();
                int iM145d3 = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d3 * 2);
                if (this.f138b.f215d == null) {
                    if (iM145d2 < 0 || iM145d2 > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f138b.f215d = new short[iM145d2];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d3; i2++) {
                    this.f138b.f215d[i2] = (short) c0029aM137a.m143c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$i */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class i extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f135a;

        /* JADX INFO: renamed from: b */
        public j[] f136b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f135a);
            c0029a.m139a(this.f136b);
            if (this.f136b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f135a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 16);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f136b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f135a = c0029a.m145d();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d * 16);
                if (this.f136b == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f136b = new j[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d; i2++) {
                    if (this.f136b[i2] == null) {
                        this.f136b[i2] = new j();
                    }
                    this.f136b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$a */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class a extends AbstractC0038g {

        /* JADX INFO: renamed from: h */
        public int f105h;

        /* JADX INFO: renamed from: i */
        public C0043l.a f106i;

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final int mo125b() {
            return 0;
        }

        public a(C0043l.a aVar) {
            this.f106i = aVar;
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: a */
        public final void mo124a(C0029a c0029a) throws C0030b {
            this.f106i.mo128e(c0029a);
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final void mo126b(C0029a c0029a) {
            this.f106i.mo129f(c0029a);
            this.f105h = c0029a.m145d();
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$b */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class b extends AbstractC0038g {

        /* JADX INFO: renamed from: h */
        public int f107h;

        /* JADX INFO: renamed from: i */
        public C0043l.a f108i;

        /* JADX INFO: renamed from: j */
        public g f109j;

        /* JADX INFO: renamed from: k */
        public f f110k;

        /* JADX INFO: renamed from: l */
        public i f111l;

        /* JADX INFO: renamed from: m */
        public short f112m = 1;

        /* JADX INFO: renamed from: n */
        public int f113n;

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final int mo125b() {
            return 15;
        }

        public b(C0043l.a aVar, g gVar, f fVar, i iVar, int i) {
            this.f108i = aVar;
            this.f109j = gVar;
            this.f110k = fVar;
            this.f111l = iVar;
            this.f113n = i;
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: a */
        public final void mo124a(C0029a c0029a) throws C0030b {
            this.f108i.mo128e(c0029a);
            this.f109j.mo128e(c0029a);
            this.f111l.mo128e(c0029a);
            c0029a.m149f(this.f112m);
            c0029a.m150g(this.f113n);
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final void mo126b(C0029a c0029a) throws C0030b {
            if (c0029a.m145d() != 0) {
                if (this.f110k == null) {
                    this.f110k = new f();
                }
                this.f110k.mo129f(c0029a);
            }
            this.f111l.mo129f(c0029a);
            this.f113n = c0029a.m145d();
            this.f107h = c0029a.m145d();
        }
    }

    /* JADX INFO: renamed from: a.c.a.h$d */
    /* JADX INFO: compiled from: lsarpc.java */
    public static class d extends AbstractC0038g {

        /* JADX INFO: renamed from: h */
        public int f120h;

        /* JADX INFO: renamed from: i */
        public String f121i;

        /* JADX INFO: renamed from: j */
        public c f122j;

        /* JADX INFO: renamed from: k */
        public int f123k = 2048;

        /* JADX INFO: renamed from: l */
        public C0043l.a f124l;

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final int mo125b() {
            return 44;
        }

        public d(String str, c cVar, C0043l.a aVar) {
            this.f121i = str;
            this.f122j = cVar;
            this.f124l = aVar;
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: a */
        public final void mo124a(C0029a c0029a) {
            c0029a.m139a((Object) this.f121i);
            if (this.f121i != null) {
                c0029a.m140a(this.f121i);
            }
            this.f122j.mo128e(c0029a);
            c0029a.m150g(this.f123k);
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final void mo126b(C0029a c0029a) {
            this.f124l.mo129f(c0029a);
            this.f120h = c0029a.m145d();
        }
    }
}
