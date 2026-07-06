package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DH {
    private static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("SupportedKeyClasses", "javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey");
        a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    static /* synthetic */ Map a() {
        return a;
    }
}
