package org.bouncycastle.p142f;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;

/* JADX INFO: renamed from: org.bouncycastle.f.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1557h {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f5512a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static boolean m4155a(String str) {
        try {
            String strM4157c = m4157c(str);
            if (strM4157c != null) {
                return "true".equals(C1560k.m4166c(strM4157c));
            }
            return false;
        } catch (AccessControlException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static BigInteger m4156b(String str) {
        String strM4157c = m4157c(str);
        if (strM4157c != null) {
            return new BigInteger(strM4157c);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static String m4157c(String str) {
        return (String) AccessController.doPrivileged(new C1558i(str));
    }
}
