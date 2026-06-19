package org.bouncycastle.jcajce.util;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.p103c.p105b.C1200a;

/* JADX INFO: loaded from: classes.dex */
public class BCJcaJceHelper extends ProviderJcaJceHelper {

    /* JADX INFO: renamed from: b */
    private static volatile Provider f6275b;

    public BCJcaJceHelper() {
        super(m4519a());
    }

    /* JADX INFO: renamed from: a */
    private static synchronized Provider m4519a() {
        Provider c1200a;
        if (Security.getProvider("BC") != null) {
            c1200a = Security.getProvider("BC");
        } else if (f6275b != null) {
            c1200a = f6275b;
        } else {
            c1200a = new C1200a();
            f6275b = c1200a;
        }
        return c1200a;
    }
}
