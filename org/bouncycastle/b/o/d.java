package org.bouncycastle.b.o;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public static final org.bouncycastle.a.z.a a = new org.bouncycastle.a.z.a(n.K, bc.a);
    public static final org.bouncycastle.a.z.a b = new org.bouncycastle.a.z.a(n.M, bc.a);
    public static final org.bouncycastle.a.z.a c = new org.bouncycastle.a.z.a(n.O, bc.a);
    public static final org.bouncycastle.a.z.a d = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.p, bc.a);
    public static final org.bouncycastle.a.z.a e = new org.bouncycastle.a.z.a(org.bouncycastle.a.o.b.r, bc.a);
    private static final Map f;
    private final int g;
    private final int h;
    private final org.bouncycastle.a.z.a i;

    /* synthetic */ d(d$a d_a, byte b2) {
        this(d_a);
    }

    public final int a() {
        return this.g;
    }

    public final org.bouncycastle.a.z.a b() {
        return this.i;
    }

    public final int c() {
        return this.h;
    }

    private d(d$a d_a) {
        super(n.B);
        this.g = d$a.a(d_a);
        this.i = d$a.b(d_a);
        if (d$a.c(d_a) >= 0) {
            this.h = d$a.c(d_a);
            return;
        }
        p pVarA = this.i.a();
        if (!f.containsKey(pVarA)) {
            throw new IllegalStateException("no salt size for algorithm: ".concat(String.valueOf(pVarA)));
        }
        this.h = ((Integer) f.get(pVarA)).intValue();
    }

    static {
        HashMap map = new HashMap();
        f = map;
        map.put(n.K, 20);
        f.put(n.M, 32);
        f.put(n.O, 64);
        f.put(n.L, 28);
        f.put(n.N, 48);
        f.put(org.bouncycastle.a.o.b.o, 28);
        f.put(org.bouncycastle.a.o.b.p, 32);
        f.put(org.bouncycastle.a.o.b.q, 48);
        f.put(org.bouncycastle.a.o.b.r, 64);
        f.put(org.bouncycastle.a.f.a.c, 32);
        f.put(org.bouncycastle.a.t.a.e, 32);
        f.put(org.bouncycastle.a.t.a.f, 64);
        f.put(org.bouncycastle.a.i.d.ac, 32);
    }
}
