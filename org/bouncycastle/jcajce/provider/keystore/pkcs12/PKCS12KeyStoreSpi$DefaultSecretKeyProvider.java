package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.o.b;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.a;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyStoreSpi$DefaultSecretKeyProvider {
    private final Map a;

    public final int a(a aVar) {
        Integer num = (Integer) this.a.get(aVar.a());
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    PKCS12KeyStoreSpi$DefaultSecretKeyProvider() {
        HashMap map = new HashMap();
        map.put(new p("1.2.840.113533.7.66.10"), 128);
        map.put(n.D, 192);
        map.put(b.u, 128);
        map.put(b.C, 192);
        map.put(b.K, 256);
        map.put(org.bouncycastle.a.q.a.a, 128);
        map.put(org.bouncycastle.a.q.a.b, 192);
        map.put(org.bouncycastle.a.q.a.c, 256);
        map.put(org.bouncycastle.a.f.a.f, 256);
        this.a = Collections.unmodifiableMap(map);
    }
}
