package p000a.p003c.p004a;

import p000a.p003c.AbstractC0038g;
import p000a.p003c.p005b.AbstractC0032d;
import p000a.p003c.p005b.C0029a;
import p000a.p003c.p005b.C0030b;

/* JADX INFO: renamed from: a.c.a.j */
/* JADX INFO: compiled from: srvsvc.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0027j {

    /* JADX INFO: renamed from: a.c.a.j$b */
    /* JADX INFO: compiled from: srvsvc.java */
    public static class b extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public String f163a;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m139a((Object) this.f163a);
            if (this.f163a != null) {
                c0029a.f183e.m140a(this.f163a);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            if (c0029a.m145d() != 0) {
                this.f163a = c0029a.f183e.m147e();
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.j$d */
    /* JADX INFO: compiled from: srvsvc.java */
    public static class d extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f167a;

        /* JADX INFO: renamed from: b */
        public b[] f168b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f167a);
            c0029a.m139a(this.f168b);
            if (this.f168b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f167a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 4);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f168b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f167a = c0029a.m145d();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d * 4);
                if (this.f168b == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f168b = new b[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d; i2++) {
                    if (this.f168b[i2] == null) {
                        this.f168b[i2] = new b();
                    }
                    this.f168b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.j$c */
    /* JADX INFO: compiled from: srvsvc.java */
    public static class c extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public String f164a;

        /* JADX INFO: renamed from: b */
        public int f165b;

        /* JADX INFO: renamed from: c */
        public String f166c;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m139a((Object) this.f164a);
            c0029a.m150g(this.f165b);
            c0029a.m139a((Object) this.f166c);
            if (this.f164a != null) {
                c0029a = c0029a.f183e;
                c0029a.m140a(this.f164a);
            }
            if (this.f166c != null) {
                c0029a.f183e.m140a(this.f166c);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            int iM145d = c0029a.m145d();
            this.f165b = c0029a.m145d();
            int iM145d2 = c0029a.m145d();
            if (iM145d != 0) {
                c0029a = c0029a.f183e;
                this.f164a = c0029a.m147e();
            }
            if (iM145d2 != 0) {
                this.f166c = c0029a.f183e.m147e();
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.j$e */
    /* JADX INFO: compiled from: srvsvc.java */
    public static class e extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f169a;

        /* JADX INFO: renamed from: b */
        public c[] f170b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f169a);
            c0029a.m139a(this.f170b);
            if (this.f170b != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f169a;
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 12);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.f170b[i3].mo128e(c0029aM137a);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f169a = c0029a.m145d();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d * 12);
                if (this.f170b == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f170b = new c[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d; i2++) {
                    if (this.f170b[i2] == null) {
                        this.f170b[i2] = new c();
                    }
                    this.f170b[i2].mo129f(c0029aM137a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.a.j$a */
    /* JADX INFO: compiled from: srvsvc.java */
    public static class a extends AbstractC0038g {

        /* JADX INFO: renamed from: h */
        public int f156h;

        /* JADX INFO: renamed from: i */
        public String f157i;

        /* JADX INFO: renamed from: k */
        public AbstractC0032d f159k;

        /* JADX INFO: renamed from: j */
        public int f158j = 1;

        /* JADX INFO: renamed from: l */
        public int f160l = -1;

        /* JADX INFO: renamed from: m */
        public int f161m = 0;

        /* JADX INFO: renamed from: n */
        public int f162n = 0;

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final int mo125b() {
            return 15;
        }

        public a(String str, AbstractC0032d abstractC0032d) {
            this.f157i = str;
            this.f159k = abstractC0032d;
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: a */
        public final void mo124a(C0029a c0029a) {
            c0029a.m139a((Object) this.f157i);
            if (this.f157i != null) {
                c0029a.m140a(this.f157i);
            }
            c0029a.m150g(this.f158j);
            c0029a.m150g(this.f158j);
            c0029a.m139a(this.f159k);
            if (this.f159k != null) {
                c0029a = c0029a.f183e;
                this.f159k.mo128e(c0029a);
            }
            c0029a.m150g(this.f160l);
            c0029a.m150g(this.f162n);
        }

        @Override // p000a.p003c.AbstractC0038g
        /* JADX INFO: renamed from: b */
        public final void mo126b(C0029a c0029a) {
            this.f158j = c0029a.m145d();
            c0029a.m145d();
            if (c0029a.m145d() != 0) {
                if (this.f159k == null) {
                    this.f159k = new d();
                }
                c0029a = c0029a.f183e;
                this.f159k.mo129f(c0029a);
            }
            this.f161m = c0029a.m145d();
            this.f162n = c0029a.m145d();
            this.f156h = c0029a.m145d();
        }
    }
}
