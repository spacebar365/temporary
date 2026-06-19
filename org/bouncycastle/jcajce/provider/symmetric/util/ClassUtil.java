package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
public class ClassUtil {
    /* JADX INFO: renamed from: a */
    public static Class m4466a(Class cls, final String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.1
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    try {
                        return Class.forName(str);
                    } catch (Exception e) {
                        return null;
                    }
                }
            });
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
