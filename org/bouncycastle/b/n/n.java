package org.bouncycastle.b.n;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final Map<String, Integer> a;

    public static Integer a(org.bouncycastle.b.r rVar) {
        return a.get(rVar.a());
    }

    static {
        HashMap map = new HashMap();
        map.put("RIPEMD128", 13004);
        map.put("RIPEMD160", 12748);
        map.put("SHA-1", 13260);
        map.put("SHA-224", 14540);
        map.put("SHA-256", 13516);
        map.put("SHA-384", 14028);
        map.put("SHA-512", 13772);
        map.put("SHA-512/224", 14796);
        map.put("SHA-512/256", 15052);
        map.put("Whirlpool", 14284);
        a = Collections.unmodifiableMap(map);
    }
}
