package p000a.p003c;

import p000a.p003c.p005b.AbstractC0032d;
import p000a.p003c.p005b.C0029a;
import p000a.p003c.p005b.C0030b;

/* JADX INFO: renamed from: a.c.l */
/* JADX INFO: compiled from: rpc.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0043l {

    /* JADX INFO: renamed from: a.c.l$d */
    /* JADX INFO: compiled from: rpc.java */
    public static class d extends AbstractC0032d {

        /* JADX INFO: renamed from: b */
        public int f216b;

        /* JADX INFO: renamed from: c */
        public short f217c;

        /* JADX INFO: renamed from: d */
        public short f218d;

        /* JADX INFO: renamed from: e */
        public byte f219e;

        /* JADX INFO: renamed from: f */
        public byte f220f;

        /* JADX INFO: renamed from: g */
        public byte[] f221g;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m150g(this.f216b);
            c0029a.m149f(this.f217c);
            c0029a.m149f(this.f218d);
            c0029a.m148e(this.f219e);
            c0029a.m148e(this.f220f);
            int i = c0029a.f181c;
            c0029a.m144c(6);
            C0029a c0029aM137a = c0029a.m137a(i);
            for (int i2 = 0; i2 < 6; i2++) {
                c0029aM137a.m148e(this.f221g[i2]);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            this.f216b = c0029a.m145d();
            this.f217c = (short) c0029a.m143c();
            this.f218d = (short) c0029a.m143c();
            this.f219e = (byte) c0029a.m141b();
            this.f220f = (byte) c0029a.m141b();
            int i = c0029a.f181c;
            c0029a.m144c(6);
            if (this.f221g == null) {
                this.f221g = new byte[6];
            }
            C0029a c0029aM137a = c0029a.m137a(i);
            for (int i2 = 0; i2 < 6; i2++) {
                this.f221g[i2] = (byte) c0029aM137a.m141b();
            }
        }
    }

    /* JADX INFO: renamed from: a.c.l$a */
    /* JADX INFO: compiled from: rpc.java */
    public static class a extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public int f207a;

        /* JADX INFO: renamed from: b */
        public d f208b;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            c0029a.m150g(this.f207a);
            if (this.f208b == null) {
                throw new C0030b("ref pointer cannot be null");
            }
            c0029a.m150g(this.f208b.f216b);
            c0029a.m149f(this.f208b.f217c);
            c0029a.m149f(this.f208b.f218d);
            c0029a.m148e(this.f208b.f219e);
            c0029a.m148e(this.f208b.f220f);
            int i = c0029a.f181c;
            c0029a.m144c(6);
            C0029a c0029aM137a = c0029a.m137a(i);
            for (int i2 = 0; i2 < 6; i2++) {
                c0029aM137a.m148e(this.f208b.f221g[i2]);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) {
            c0029a.m146d(4);
            this.f207a = c0029a.m145d();
            c0029a.m146d(4);
            if (this.f208b == null) {
                this.f208b = new d();
            }
            this.f208b.f216b = c0029a.m145d();
            this.f208b.f217c = (short) c0029a.m143c();
            this.f208b.f218d = (short) c0029a.m143c();
            this.f208b.f219e = (byte) c0029a.m141b();
            this.f208b.f220f = (byte) c0029a.m141b();
            int i = c0029a.f181c;
            c0029a.m144c(6);
            if (this.f208b.f221g == null) {
                this.f208b.f221g = new byte[6];
            }
            C0029a c0029aM137a = c0029a.m137a(i);
            for (int i2 = 0; i2 < 6; i2++) {
                this.f208b.f221g[i2] = (byte) c0029aM137a.m141b();
            }
        }
    }

    /* JADX INFO: renamed from: a.c.l$c */
    /* JADX INFO: compiled from: rpc.java */
    public static class c extends AbstractC0032d {

        /* JADX INFO: renamed from: b */
        public short f213b;

        /* JADX INFO: renamed from: c */
        public short f214c;

        /* JADX INFO: renamed from: d */
        public short[] f215d;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            c0029a.m149f(this.f213b);
            c0029a.m149f(this.f214c);
            c0029a.m139a(this.f215d);
            if (this.f215d != null) {
                C0029a c0029a2 = c0029a.f183e;
                int i = this.f213b / 2;
                c0029a2.m150g(this.f214c / 2);
                c0029a2.m150g(0);
                c0029a2.m150g(i);
                int i2 = c0029a2.f181c;
                c0029a2.m144c(i * 2);
                C0029a c0029aM137a = c0029a2.m137a(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    c0029aM137a.m149f(this.f215d[i3]);
                }
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            this.f213b = (short) c0029a.m143c();
            this.f214c = (short) c0029a.m143c();
            if (c0029a.m145d() != 0) {
                C0029a c0029a2 = c0029a.f183e;
                int iM145d = c0029a2.m145d();
                c0029a2.m145d();
                int iM145d2 = c0029a2.m145d();
                int i = c0029a2.f181c;
                c0029a2.m144c(iM145d2 * 2);
                if (this.f215d == null) {
                    if (iM145d < 0 || iM145d > 65535) {
                        throw new C0030b("invalid array conformance");
                    }
                    this.f215d = new short[iM145d];
                }
                C0029a c0029aM137a = c0029a2.m137a(i);
                for (int i2 = 0; i2 < iM145d2; i2++) {
                    this.f215d[i2] = (short) c0029aM137a.m143c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.c.l$b */
    /* JADX INFO: compiled from: rpc.java */
    public static class b extends AbstractC0032d {

        /* JADX INFO: renamed from: a */
        public byte f209a;

        /* JADX INFO: renamed from: b */
        public byte f210b;

        /* JADX INFO: renamed from: c */
        public byte[] f211c;

        /* JADX INFO: renamed from: d */
        public int[] f212d;

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: e */
        public final void mo128e(C0029a c0029a) {
            c0029a.m146d(4);
            byte b = this.f210b;
            c0029a.m150g(b);
            c0029a.m148e(this.f209a);
            c0029a.m148e(this.f210b);
            int i = c0029a.f181c;
            c0029a.m144c(6);
            int i2 = c0029a.f181c;
            c0029a.m144c(b * 4);
            C0029a c0029aM137a = c0029a.m137a(i);
            for (int i3 = 0; i3 < 6; i3++) {
                c0029aM137a.m148e(this.f211c[i3]);
            }
            C0029a c0029aM137a2 = c0029aM137a.m137a(i2);
            for (int i4 = 0; i4 < b; i4++) {
                c0029aM137a2.m150g(this.f212d[i4]);
            }
        }

        @Override // p000a.p003c.p005b.AbstractC0032d
        /* JADX INFO: renamed from: f */
        public final void mo129f(C0029a c0029a) throws C0030b {
            c0029a.m146d(4);
            int iM145d = c0029a.m145d();
            this.f209a = (byte) c0029a.m141b();
            this.f210b = (byte) c0029a.m141b();
            int i = c0029a.f181c;
            c0029a.m144c(6);
            int i2 = c0029a.f181c;
            c0029a.m144c(iM145d * 4);
            if (this.f211c == null) {
                this.f211c = new byte[6];
            }
            C0029a c0029aM137a = c0029a.m137a(i);
            for (int i3 = 0; i3 < 6; i3++) {
                this.f211c[i3] = (byte) c0029aM137a.m141b();
            }
            if (this.f212d == null) {
                if (iM145d < 0 || iM145d > 65535) {
                    throw new C0030b("invalid array conformance");
                }
                this.f212d = new int[iM145d];
            }
            C0029a c0029aM137a2 = c0029aM137a.m137a(i2);
            for (int i4 = 0; i4 < iM145d; i4++) {
                this.f212d[i4] = c0029aM137a2.m145d();
            }
        }
    }
}
