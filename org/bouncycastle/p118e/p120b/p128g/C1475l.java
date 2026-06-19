package org.bouncycastle.p118e.p120b.p128g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.l */
/* JADX INFO: loaded from: classes.dex */
final class C1475l implements InterfaceC1486w {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C1475l> f5339a;

    /* JADX INFO: renamed from: b */
    private final int f5340b;

    /* JADX INFO: renamed from: c */
    private final String f5341c;

    static {
        HashMap map = new HashMap();
        map.put(m3904b("SHA-256", 32, 16, 67), new C1475l(16777217, "WOTSP_SHA2-256_W16"));
        map.put(m3904b("SHA-512", 64, 16, 131), new C1475l(33554434, "WOTSP_SHA2-512_W16"));
        map.put(m3904b("SHAKE128", 32, 16, 67), new C1475l(50331651, "WOTSP_SHAKE128_W16"));
        map.put(m3904b("SHAKE256", 64, 16, 131), new C1475l(67108868, "WOTSP_SHAKE256_W16"));
        f5339a = Collections.unmodifiableMap(map);
    }

    private C1475l(int i, String str) {
        this.f5340b = i;
        this.f5341c = str;
    }

    /* JADX INFO: renamed from: a */
    protected static C1475l m3903a(String str, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return f5339a.get(m3904b(str, i, i2, i3));
    }

    /* JADX INFO: renamed from: b */
    private static String m3904b(String str, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3;
    }

    public final String toString() {
        return this.f5341c;
    }
}
