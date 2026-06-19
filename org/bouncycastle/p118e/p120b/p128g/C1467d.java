package org.bouncycastle.p118e.p120b.p128g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1467d implements InterfaceC1486w {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C1467d> f5309a;

    /* JADX INFO: renamed from: b */
    private final int f5310b = 16777217;

    /* JADX INFO: renamed from: c */
    private final String f5311c;

    static {
        HashMap map = new HashMap();
        map.put(m3860b("SHA-256", 32, 16, 67, 20, 2), new C1467d("XMSSMT_SHA2-256_W16_H20_D2"));
        map.put(m3860b("SHA-256", 32, 16, 67, 20, 4), new C1467d("XMSSMT_SHA2-256_W16_H20_D4"));
        map.put(m3860b("SHA-256", 32, 16, 67, 40, 2), new C1467d("XMSSMT_SHA2-256_W16_H40_D2"));
        map.put(m3860b("SHA-256", 32, 16, 67, 40, 2), new C1467d("XMSSMT_SHA2-256_W16_H40_D4"));
        map.put(m3860b("SHA-256", 32, 16, 67, 40, 4), new C1467d("XMSSMT_SHA2-256_W16_H40_D8"));
        map.put(m3860b("SHA-256", 32, 16, 67, 60, 8), new C1467d("XMSSMT_SHA2-256_W16_H60_D3"));
        map.put(m3860b("SHA-256", 32, 16, 67, 60, 6), new C1467d("XMSSMT_SHA2-256_W16_H60_D6"));
        map.put(m3860b("SHA-256", 32, 16, 67, 60, 12), new C1467d("XMSSMT_SHA2-256_W16_H60_D12"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 20, 2), new C1467d("XMSSMT_SHA2-512_W16_H20_D2"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 20, 4), new C1467d("XMSSMT_SHA2-512_W16_H20_D4"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 40, 2), new C1467d("XMSSMT_SHA2-512_W16_H40_D2"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 40, 4), new C1467d("XMSSMT_SHA2-512_W16_H40_D4"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 40, 8), new C1467d("XMSSMT_SHA2-512_W16_H40_D8"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 60, 3), new C1467d("XMSSMT_SHA2-512_W16_H60_D3"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 60, 6), new C1467d("XMSSMT_SHA2-512_W16_H60_D6"));
        map.put(m3860b("SHA2-512", 64, 16, 131, 60, 12), new C1467d("XMSSMT_SHA2-512_W16_H60_D12"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 20, 2), new C1467d("XMSSMT_SHAKE128_W16_H20_D2"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 20, 4), new C1467d("XMSSMT_SHAKE128_W16_H20_D4"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 40, 2), new C1467d("XMSSMT_SHAKE128_W16_H40_D2"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 40, 4), new C1467d("XMSSMT_SHAKE128_W16_H40_D4"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 40, 8), new C1467d("XMSSMT_SHAKE128_W16_H40_D8"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 60, 3), new C1467d("XMSSMT_SHAKE128_W16_H60_D3"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 60, 6), new C1467d("XMSSMT_SHAKE128_W16_H60_D6"));
        map.put(m3860b("SHAKE128", 32, 16, 67, 60, 12), new C1467d("XMSSMT_SHAKE128_W16_H60_D12"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 20, 2), new C1467d("XMSSMT_SHAKE256_W16_H20_D2"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 20, 4), new C1467d("XMSSMT_SHAKE256_W16_H20_D4"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 40, 2), new C1467d("XMSSMT_SHAKE256_W16_H40_D2"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 40, 4), new C1467d("XMSSMT_SHAKE256_W16_H40_D4"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 40, 8), new C1467d("XMSSMT_SHAKE256_W16_H40_D8"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 60, 3), new C1467d("XMSSMT_SHAKE256_W16_H60_D3"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 60, 6), new C1467d("XMSSMT_SHAKE256_W16_H60_D6"));
        map.put(m3860b("SHAKE256", 64, 16, 131, 60, 12), new C1467d("XMSSMT_SHAKE256_W16_H60_D12"));
        f5309a = Collections.unmodifiableMap(map);
    }

    private C1467d(String str) {
        this.f5311c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1467d m3859a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return f5309a.get(m3860b(str, i, i2, i3, i4, i5));
    }

    /* JADX INFO: renamed from: b */
    private static String m3860b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
    }

    public final String toString() {
        return this.f5311c;
    }
}
