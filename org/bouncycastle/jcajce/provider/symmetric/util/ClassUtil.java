package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AccessController;

/* JADX INFO: loaded from: classes.dex */
public class ClassUtil {
    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new ClassUtil$1(str));
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
