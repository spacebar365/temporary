package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.o.b;
import org.bouncycastle.a.q.a;
import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class SecretKeyUtil {
    private static Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(n.D.b(), 192);
        a.put(b.u, 128);
        a.put(b.C, 192);
        a.put(b.K, 256);
        a.put(a.a, 128);
        a.put(a.b, 192);
        a.put(a.c, 256);
    }
}
