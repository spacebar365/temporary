package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RSA {
    private static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("SupportedKeyClasses", "javax.crypto.interfaces.RSAPublicKey|javax.crypto.interfaces.RSAPrivateKey");
        a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    static /* synthetic */ Map a() {
        return a;
    }
}
