package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class EdEC {
    private static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
