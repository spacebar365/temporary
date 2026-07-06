package org.bouncycastle.jcajce.provider.drbg;

import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
final class DRBG$2 implements PrivilegedAction<SecureRandom> {
    DRBG$2() {
    }

    private static SecureRandom a() {
        try {
            return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return DRBG.b();
        }
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ SecureRandom run() {
        return a();
    }
}
