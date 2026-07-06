package org.bouncycastle.f;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final ThreadLocal a = new ThreadLocal();

    static /* synthetic */ ThreadLocal a() {
        return a;
    }

    public static boolean a(String str) {
        try {
            String strC = c(str);
            if (strC != null) {
                return "true".equals(k.c(strC));
            }
            return false;
        } catch (AccessControlException e) {
            return false;
        }
    }

    public static BigInteger b(String str) {
        String strC = c(str);
        if (strC != null) {
            return new BigInteger(strC);
        }
        return null;
    }

    private static String c(String str) {
        return (String) AccessController.doPrivileged(new i(str));
    }
}
