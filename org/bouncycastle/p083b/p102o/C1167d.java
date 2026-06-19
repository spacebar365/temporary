package org.bouncycastle.p083b.p102o;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p064i.InterfaceC0633d;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.b.o.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1167d extends AbstractC1168e {

    /* JADX INFO: renamed from: a */
    public static final C0759a f4652a = new C0759a(InterfaceC0674n.f2622K, C0579bc.f2112a);

    /* JADX INFO: renamed from: b */
    public static final C0759a f4653b = new C0759a(InterfaceC0674n.f2624M, C0579bc.f2112a);

    /* JADX INFO: renamed from: c */
    public static final C0759a f4654c = new C0759a(InterfaceC0674n.f2626O, C0579bc.f2112a);

    /* JADX INFO: renamed from: d */
    public static final C0759a f4655d = new C0759a(InterfaceC0652b.f2503p, C0579bc.f2112a);

    /* JADX INFO: renamed from: e */
    public static final C0759a f4656e = new C0759a(InterfaceC0652b.f2505r, C0579bc.f2112a);

    /* JADX INFO: renamed from: f */
    private static final Map f4657f;

    /* JADX INFO: renamed from: g */
    private final int f4658g;

    /* JADX INFO: renamed from: h */
    private final int f4659h;

    /* JADX INFO: renamed from: i */
    private final C0759a f4660i;

    /* JADX INFO: renamed from: org.bouncycastle.b.o.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f4661a = 1024;

        /* JADX INFO: renamed from: b */
        private int f4662b = -1;

        /* JADX INFO: renamed from: c */
        private C0759a f4663c = C1167d.f4652a;

        /* JADX INFO: renamed from: a */
        public final a m2799a() {
            this.f4661a = 16384;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m2800a(C0759a c0759a) {
            this.f4663c = c0759a;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m2801b() {
            this.f4662b = 64;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final C1167d m2802c() {
            return new C1167d(this, (byte) 0);
        }
    }

    /* synthetic */ C1167d(a aVar, byte b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: a */
    public final int m2793a() {
        return this.f4658g;
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m2794b() {
        return this.f4660i;
    }

    /* JADX INFO: renamed from: c */
    public final int m2795c() {
        return this.f4659h;
    }

    private C1167d(a aVar) {
        super(InterfaceC0674n.f2613B);
        this.f4658g = aVar.f4661a;
        this.f4660i = aVar.f4663c;
        if (aVar.f4662b >= 0) {
            this.f4659h = aVar.f4662b;
            return;
        }
        C0653p c0653pM1783a = this.f4660i.m1783a();
        if (!f4657f.containsKey(c0653pM1783a)) {
            throw new IllegalStateException("no salt size for algorithm: ".concat(String.valueOf(c0653pM1783a)));
        }
        this.f4659h = ((Integer) f4657f.get(c0653pM1783a)).intValue();
    }

    static {
        HashMap map = new HashMap();
        f4657f = map;
        map.put(InterfaceC0674n.f2622K, 20);
        f4657f.put(InterfaceC0674n.f2624M, 32);
        f4657f.put(InterfaceC0674n.f2626O, 64);
        f4657f.put(InterfaceC0674n.f2623L, 28);
        f4657f.put(InterfaceC0674n.f2625N, 48);
        f4657f.put(InterfaceC0652b.f2502o, 28);
        f4657f.put(InterfaceC0652b.f2503p, 32);
        f4657f.put(InterfaceC0652b.f2504q, 48);
        f4657f.put(InterfaceC0652b.f2505r, 64);
        f4657f.put(InterfaceC0619a.f2195c, 32);
        f4657f.put(InterfaceC0685a.f2805e, 32);
        f4657f.put(InterfaceC0685a.f2806f, 64);
        f4657f.put(InterfaceC0633d.f2304ac, 32);
    }
}
