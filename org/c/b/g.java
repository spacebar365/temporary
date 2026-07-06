package org.c.b;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static g$a a;
    private static boolean b = false;

    private g() {
    }

    public static String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            return null;
        }
    }

    public static boolean b(String str) {
        String strA = a(str);
        if (strA == null) {
            return false;
        }
        return strA.equalsIgnoreCase("true");
    }

    private static g$a b() {
        try {
            return new g$a((byte) 0);
        } catch (SecurityException e) {
            return null;
        }
    }

    public static final void a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void c(String str) {
        System.err.println("SLF4J: ".concat(String.valueOf(str)));
    }

    public static Class<?> a() {
        g$a g_a;
        if (a != null) {
            g_a = a;
        } else if (b) {
            g_a = null;
        } else {
            a = b();
            b = true;
            g_a = a;
        }
        if (g_a == null) {
            return null;
        }
        Class<?>[] classContext = g_a.getClassContext();
        String name = g.class.getName();
        int i = 0;
        while (i < classContext.length && !name.equals(classContext[i].getName())) {
            i++;
        }
        if (i >= classContext.length || i + 2 >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i + 2];
    }
}
