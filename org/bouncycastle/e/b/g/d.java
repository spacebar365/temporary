package org.bouncycastle.e.b.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements w {
    private static final Map<String, d> a;
    private final int b = 16777217;
    private final String c;

    static {
        HashMap map = new HashMap();
        map.put(b("SHA-256", 32, 16, 67, 20, 2), new d("XMSSMT_SHA2-256_W16_H20_D2"));
        map.put(b("SHA-256", 32, 16, 67, 20, 4), new d("XMSSMT_SHA2-256_W16_H20_D4"));
        map.put(b("SHA-256", 32, 16, 67, 40, 2), new d("XMSSMT_SHA2-256_W16_H40_D2"));
        map.put(b("SHA-256", 32, 16, 67, 40, 2), new d("XMSSMT_SHA2-256_W16_H40_D4"));
        map.put(b("SHA-256", 32, 16, 67, 40, 4), new d("XMSSMT_SHA2-256_W16_H40_D8"));
        map.put(b("SHA-256", 32, 16, 67, 60, 8), new d("XMSSMT_SHA2-256_W16_H60_D3"));
        map.put(b("SHA-256", 32, 16, 67, 60, 6), new d("XMSSMT_SHA2-256_W16_H60_D6"));
        map.put(b("SHA-256", 32, 16, 67, 60, 12), new d("XMSSMT_SHA2-256_W16_H60_D12"));
        map.put(b("SHA2-512", 64, 16, 131, 20, 2), new d("XMSSMT_SHA2-512_W16_H20_D2"));
        map.put(b("SHA2-512", 64, 16, 131, 20, 4), new d("XMSSMT_SHA2-512_W16_H20_D4"));
        map.put(b("SHA2-512", 64, 16, 131, 40, 2), new d("XMSSMT_SHA2-512_W16_H40_D2"));
        map.put(b("SHA2-512", 64, 16, 131, 40, 4), new d("XMSSMT_SHA2-512_W16_H40_D4"));
        map.put(b("SHA2-512", 64, 16, 131, 40, 8), new d("XMSSMT_SHA2-512_W16_H40_D8"));
        map.put(b("SHA2-512", 64, 16, 131, 60, 3), new d("XMSSMT_SHA2-512_W16_H60_D3"));
        map.put(b("SHA2-512", 64, 16, 131, 60, 6), new d("XMSSMT_SHA2-512_W16_H60_D6"));
        map.put(b("SHA2-512", 64, 16, 131, 60, 12), new d("XMSSMT_SHA2-512_W16_H60_D12"));
        map.put(b("SHAKE128", 32, 16, 67, 20, 2), new d("XMSSMT_SHAKE128_W16_H20_D2"));
        map.put(b("SHAKE128", 32, 16, 67, 20, 4), new d("XMSSMT_SHAKE128_W16_H20_D4"));
        map.put(b("SHAKE128", 32, 16, 67, 40, 2), new d("XMSSMT_SHAKE128_W16_H40_D2"));
        map.put(b("SHAKE128", 32, 16, 67, 40, 4), new d("XMSSMT_SHAKE128_W16_H40_D4"));
        map.put(b("SHAKE128", 32, 16, 67, 40, 8), new d("XMSSMT_SHAKE128_W16_H40_D8"));
        map.put(b("SHAKE128", 32, 16, 67, 60, 3), new d("XMSSMT_SHAKE128_W16_H60_D3"));
        map.put(b("SHAKE128", 32, 16, 67, 60, 6), new d("XMSSMT_SHAKE128_W16_H60_D6"));
        map.put(b("SHAKE128", 32, 16, 67, 60, 12), new d("XMSSMT_SHAKE128_W16_H60_D12"));
        map.put(b("SHAKE256", 64, 16, 131, 20, 2), new d("XMSSMT_SHAKE256_W16_H20_D2"));
        map.put(b("SHAKE256", 64, 16, 131, 20, 4), new d("XMSSMT_SHAKE256_W16_H20_D4"));
        map.put(b("SHAKE256", 64, 16, 131, 40, 2), new d("XMSSMT_SHAKE256_W16_H40_D2"));
        map.put(b("SHAKE256", 64, 16, 131, 40, 4), new d("XMSSMT_SHAKE256_W16_H40_D4"));
        map.put(b("SHAKE256", 64, 16, 131, 40, 8), new d("XMSSMT_SHAKE256_W16_H40_D8"));
        map.put(b("SHAKE256", 64, 16, 131, 60, 3), new d("XMSSMT_SHAKE256_W16_H60_D3"));
        map.put(b("SHAKE256", 64, 16, 131, 60, 6), new d("XMSSMT_SHAKE256_W16_H60_D6"));
        map.put(b("SHAKE256", 64, 16, 131, 60, 12), new d("XMSSMT_SHAKE256_W16_H60_D12"));
        a = Collections.unmodifiableMap(map);
    }

    private d(String str) {
        this.c = str;
    }

    public static d a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return a.get(b(str, i, i2, i3, i4, i5));
    }

    private static String b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
    }

    public final String toString() {
        return this.c;
    }
}
