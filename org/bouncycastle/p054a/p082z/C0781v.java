package org.bouncycastle.p054a.p082z;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0541ad;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0636k;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p080y.C0756c;

/* JADX INFO: renamed from: org.bouncycastle.a.z.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0781v extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f3218a;

    /* JADX INFO: renamed from: b */
    C0759a f3219b;

    /* JADX INFO: renamed from: c */
    C0756c f3220c;

    /* JADX INFO: renamed from: d */
    C0783x f3221d;

    /* JADX INFO: renamed from: e */
    C0783x f3222e;

    /* JADX INFO: renamed from: f */
    AbstractC0723v f3223f;

    /* JADX INFO: renamed from: g */
    C0773n f3224g;

    /* JADX INFO: renamed from: org.bouncycastle.a.z.v$a */
    public static class a extends AbstractC0650o {

        /* JADX INFO: renamed from: a */
        AbstractC0723v f3225a;

        /* JADX INFO: renamed from: b */
        C0773n f3226b;

        private a(AbstractC0723v abstractC0723v) {
            if (abstractC0723v.mo1484d() < 2 || abstractC0723v.mo1484d() > 3) {
                throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
            }
            this.f3225a = abstractC0723v;
        }

        /* JADX INFO: renamed from: a */
        public static a m1849a(Object obj) {
            if (obj instanceof a) {
                return (a) obj;
            }
            if (obj != null) {
                return new a(AbstractC0723v.m1708a(obj));
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public final C0640m m1850a() {
            return C0640m.m1561a(this.f3225a.mo1482a(0));
        }

        /* JADX INFO: renamed from: b */
        public final C0783x m1851b() {
            return C0783x.m1859a(this.f3225a.mo1482a(1));
        }

        /* JADX INFO: renamed from: c */
        public final C0773n m1852c() {
            if (this.f3226b == null && this.f3225a.mo1484d() == 3) {
                this.f3226b = C0773n.m1828a(this.f3225a.mo1482a(2));
            }
            return this.f3226b;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m1853d() {
            return this.f3225a.mo1484d() == 3;
        }

        @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
        /* JADX INFO: renamed from: i */
        public final AbstractC0686u mo1358i() {
            return this.f3225a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: org.bouncycastle.a.z.v$b */
    class b implements Enumeration {
        private b() {
        }

        /* synthetic */ b(C0781v c0781v, byte b) {
            this();
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: org.bouncycastle.a.z.v$c */
    class c implements Enumeration {

        /* JADX INFO: renamed from: b */
        private final Enumeration f3229b;

        c(Enumeration enumeration) {
            this.f3229b = enumeration;
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f3229b.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return a.m1849a(this.f3229b.nextElement());
        }
    }

    public C0781v(AbstractC0723v abstractC0723v) {
        int i = 0;
        if (abstractC0723v.mo1484d() < 3 || abstractC0723v.mo1484d() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        if (abstractC0723v.mo1482a(0) instanceof C0640m) {
            this.f3218a = C0640m.m1561a(abstractC0723v.mo1482a(0));
            i = 1;
        } else {
            this.f3218a = null;
        }
        int i2 = i + 1;
        this.f3219b = C0759a.m1781a(abstractC0723v.mo1482a(i));
        int i3 = i2 + 1;
        this.f3220c = C0756c.m1774a(abstractC0723v.mo1482a(i2));
        int i4 = i3 + 1;
        this.f3221d = C0783x.m1859a(abstractC0723v.mo1482a(i3));
        if (i4 < abstractC0723v.mo1484d() && ((abstractC0723v.mo1482a(i4) instanceof C0541ad) || (abstractC0723v.mo1482a(i4) instanceof C0636k) || (abstractC0723v.mo1482a(i4) instanceof C0783x))) {
            this.f3222e = C0783x.m1859a(abstractC0723v.mo1482a(i4));
            i4++;
        }
        if (i4 < abstractC0723v.mo1484d() && !(abstractC0723v.mo1482a(i4) instanceof AbstractC0539ab)) {
            this.f3223f = AbstractC0723v.m1708a(abstractC0723v.mo1482a(i4));
            i4++;
        }
        if (i4 >= abstractC0723v.mo1484d() || !(abstractC0723v.mo1482a(i4) instanceof AbstractC0539ab)) {
            return;
        }
        this.f3224g = C0773n.m1828a(AbstractC0723v.m1709a((AbstractC0539ab) abstractC0723v.mo1482a(i4), true));
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1847a() {
        return this.f3219b;
    }

    /* JADX INFO: renamed from: b */
    public final C0773n m1848b() {
        return this.f3224g;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f3218a != null) {
            c0625g.m1521a(this.f3218a);
        }
        c0625g.m1521a(this.f3219b);
        c0625g.m1521a(this.f3220c);
        c0625g.m1521a(this.f3221d);
        if (this.f3222e != null) {
            c0625g.m1521a(this.f3222e);
        }
        if (this.f3223f != null) {
            c0625g.m1521a(this.f3223f);
        }
        if (this.f3224g != null) {
            c0625g.m1521a(new C0590bn(this.f3224g));
        }
        return new C0585bi(c0625g);
    }
}
