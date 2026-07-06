package org.bouncycastle.jcajce.provider.symmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.o.b;
import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class PBEPBKDF2 {
    private static final Map a;

    private PBEPBKDF2() {
    }

    static /* synthetic */ Map a() {
        return a;
    }

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(a.c, 6);
        a.put(n.K, 1);
        a.put(n.M, 4);
        a.put(n.L, 7);
        a.put(n.N, 8);
        a.put(n.O, 9);
        a.put(b.p, 11);
        a.put(b.o, 10);
        a.put(b.q, 12);
        a.put(b.r, 13);
    }
}
