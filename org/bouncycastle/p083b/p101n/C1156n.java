package org.bouncycastle.p083b.p101n;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.b.n.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1156n {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Integer> f4619a;

    /* JADX INFO: renamed from: a */
    public static Integer m2766a(InterfaceC1175r interfaceC1175r) {
        return f4619a.get(interfaceC1175r.mo1927a());
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
        f4619a = Collections.unmodifiableMap(map);
    }
}
