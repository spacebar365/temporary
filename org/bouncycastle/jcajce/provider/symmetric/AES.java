package org.bouncycastle.jcajce.provider.symmetric;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AES {
    private static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        a.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }

    static /* synthetic */ Map a() {
        return a;
    }
}
