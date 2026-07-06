package org.bouncycastle.jcajce.provider.symmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.p;

/* JADX INFO: loaded from: classes.dex */
public final class GOST28147 {
    private static Map<p, String> a = new HashMap();
    private static Map<String, p> b = new HashMap();

    static {
        a.put(a.g, "E-TEST");
        a.put(a.h, "E-A");
        a.put(a.i, "E-B");
        a.put(a.j, "E-C");
        a.put(a.k, "E-D");
        a.put(org.bouncycastle.a.t.a.t, "Param-Z");
        b.put("E-A", a.h);
        b.put("E-B", a.i);
        b.put("E-C", a.j);
        b.put("E-D", a.k);
        b.put("Param-Z", org.bouncycastle.a.t.a.t);
    }

    private GOST28147() {
    }

    static /* synthetic */ Map a() {
        return b;
    }
}
