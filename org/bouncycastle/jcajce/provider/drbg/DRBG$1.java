package org.bouncycastle.jcajce.provider.drbg;

import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
final class DRBG$1 implements PrivilegedAction<Boolean> {
    DRBG$1() {
    }

    private static Boolean a() {
        try {
            return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ Boolean run() {
        return a();
    }
}
