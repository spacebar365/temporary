package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.f.a;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147WrapParameterSpec implements AlgorithmParameterSpec {
    private static Map c;
    private byte[] a;
    private byte[] b;

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(a.h, "E-A");
        c.put(a.i, "E-B");
        c.put(a.j, "E-C");
        c.put(a.k, "E-D");
        c.put(org.bouncycastle.a.t.a.t, "Param-Z");
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.a);
    }
}
