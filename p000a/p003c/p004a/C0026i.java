package p000a.p003c.p004a;

import p000a.p003c.AbstractC0038g;
import p000a.p003c.p005b.AbstractC0032d;
import p000a.p003c.p005b.C0029a;
import p000a.p003c.p005b.C0030b;
import p000a.p003c.p005b.C0031c;

/* JADX INFO: renamed from: a.c.a.i */
/* JADX INFO: compiled from: netdfs.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0026i {

    /* JADX INFO: renamed from: a.c.a.i$d */
    /* JADX INFO: compiled from: netdfs.java */
    public static class d extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public String f148a;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m139a((Object) this.f148a);
            if (this.f148a != null) {
                c0029a.f183e.m140a(this.f148a);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            if (c0029a.m145d() != 0) {
                this.f148a = c0029a.f183e.m147e();
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.i$a */
    /* JADX INFO: compiled from: netdfs.java */
    public static class a extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f142a;

        /* JADX INFO: renamed from: b */
        public d[] f143b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f142a);
            c0029a.m139a(this.f143b);
            if (this.f143b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f142a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 4);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f143b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f142a = c0029a.m145d();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d * 4);
                if (this.f143b == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f143b = new d[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d; i2++) {
                    if (this.f143b[i2] == null) {
                        this.f143b[i2] = new d();
                    }
                    this.f143b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.i$e */
    /* JADX INFO: compiled from: netdfs.java */
    public static class e extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public String f149a;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m139a((Object) this.f149a);
            if (this.f149a != null) {
                c0029a.f183e.m140a(this.f149a);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            if (c0029a.m145d() != 0) {
                this.f149a = c0029a.f183e.m147e();
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.i$b */
    /* JADX INFO: compiled from: netdfs.java */
    public static class b extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f144a;

        /* JADX INFO: renamed from: b */
        public e[] f145b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f144a);
            c0029a.m139a(this.f145b);
            if (this.f145b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f144a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 4);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f145b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f144a = c0029a.m145d();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d * 4);
                if (this.f145b == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f145b = new e[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d; i2++) {
                    if (this.f145b[i2] == null) {
                        this.f145b[i2] = new e();
                    }
                    this.f145b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.i$c */
    /* JADX INFO: compiled from: netdfs.java */
    public static class c extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f146a;

        /* JADX INFO: renamed from: b */
        public AbstractC0032d f147b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f146a);
            c0029a.m150g(this.f146a);
            c0029a.m139a(this.f147b);
            if (this.f147b != null) {
                this.f147b.mo128e(c0029a.f183e);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            this.f146a = c0029a.m145d();
            c0029a.m145d();
            if (c0029a.m145d() != 0) {
                if (this.f147b == null) {
                    this.f147b = new a();
                }
                this.f147b.mo129f(c0029a.f183e);
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.i$f */
    /* JADX INFO: compiled from: netdfs.java */
    public static class f extends AbstractC0038g {

        /* JADX INFO: renamed from: h */
        public int f150h;

        /* JADX INFO: renamed from: i */
        public String f151i;

        /* JADX INFO: renamed from: j */
        public int f152j = 200;

        /* JADX INFO: renamed from: k */
        public int f153k = 65535;

        /* JADX INFO: renamed from: l */
        public c f154l;

        /* JADX INFO: renamed from: m */
        public C0031c f155m;

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final int mo125b() {
            return 21;
        }

        public f(String str, c cVar, C0031c c0031c) {
            this.f151i = str;
            this.f154l = cVar;
            this.f155m = c0031c;
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: a */
        public final void mo124a(C0029a c0029a) {
            c0029a.m140a(this.f151i);
            c0029a.m150g(this.f152j);
            c0029a.m150g(this.f153k);
            c0029a.m139a(this.f154l);
            if (this.f154l != null) {
                this.f154l.mo128e(c0029a);
            }
            c0029a.m139a(this.f155m);
            if (this.f155m != null) {
                this.f155m.mo128e(c0029a);
            }
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final void mo126b(C0029a c0029a) {
            if (c0029a.m145d() != 0) {
                if (this.f154l == null) {
                    this.f154l = new c();
                }
                this.f154l.mo129f(c0029a);
            }
            if (c0029a.m145d() != 0) {
                this.f155m.mo129f(c0029a);
            }
            this.f150h = c0029a.m145d();
        }
    }
}
