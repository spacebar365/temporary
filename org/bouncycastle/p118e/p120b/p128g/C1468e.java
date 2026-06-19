package org.bouncycastle.p118e.p120b.p128g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1468e implements InterfaceC1486w {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C1468e> f5312a;

    /* JADX INFO: renamed from: b */
    private final int f5313b;

    /* JADX INFO: renamed from: c */
    private final String f5314c;

    static {
        HashMap map = new HashMap();
        map.put(m3862b("SHA-256", 32, 16, 67, 10), new C1468e(16777217, "XMSS_SHA2-256_W16_H10"));
        map.put(m3862b("SHA-256", 32, 16, 67, 16), new C1468e(33554434, "XMSS_SHA2-256_W16_H16"));
        map.put(m3862b("SHA-256", 32, 16, 67, 20), new C1468e(50331651, "XMSS_SHA2-256_W16_H20"));
        map.put(m3862b("SHA-512", 64, 16, 131, 10), new C1468e(67108868, "XMSS_SHA2-512_W16_H10"));
        map.put(m3862b("SHA-512", 64, 16, 131, 16), new C1468e(83886085, "XMSS_SHA2-512_W16_H16"));
        map.put(m3862b("SHA-512", 64, 16, 131, 20), new C1468e(100663302, "XMSS_SHA2-512_W16_H20"));
        map.put(m3862b("SHAKE128", 32, 16, 67, 10), new C1468e(117440519, "XMSS_SHAKE128_W16_H10"));
        map.put(m3862b("SHAKE128", 32, 16, 67, 16), new C1468e(134217736, "XMSS_SHAKE128_W16_H16"));
        map.put(m3862b("SHAKE128", 32, 16, 67, 20), new C1468e(150994953, "XMSS_SHAKE128_W16_H20"));
        map.put(m3862b("SHAKE256", 64, 16, 131, 10), new C1468e(167772170, "XMSS_SHAKE256_W16_H10"));
        map.put(m3862b("SHAKE256", 64, 16, 131, 16), new C1468e(184549387, "XMSS_SHAKE256_W16_H16"));
        map.put(m3862b("SHAKE256", 64, 16, 131, 20), new C1468e(201326604, "XMSS_SHAKE256_W16_H20"));
        f5312a = Collections.unmodifiableMap(map);
    }

    private C1468e(int i, String str) {
        this.f5313b = i;
        this.f5314c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1468e m3861a(String str, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return f5312a.get(m3862b(str, i, i2, i3, i4));
    }

    /* JADX INFO: renamed from: b */
    private static String m3862b(String str, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.f5314c;
    }
}
