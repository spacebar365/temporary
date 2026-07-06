package org.bouncycastle.jcajce.util;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.c.b.a;

/* JADX INFO: loaded from: classes.dex */
public class BCJcaJceHelper extends ProviderJcaJceHelper {
    private static volatile Provider b;

    public BCJcaJceHelper() {
        super(a());
    }

    private static synchronized Provider a() {
        Provider aVar;
        if (Security.getProvider("BC") != null) {
            aVar = Security.getProvider("BC");
        } else if (b != null) {
            aVar = b;
        } else {
            aVar = new a();
            b = aVar;
        }
        return aVar;
    }
}
