package org.p150c.p152b;

/* JADX INFO: renamed from: org.c.b.g */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1619g {

    /* JADX INFO: renamed from: a */
    private static a f6311a;

    /* JADX INFO: renamed from: b */
    private static boolean f6312b = false;

    private C1619g() {
    }

    /* JADX INFO: renamed from: a */
    public static String m4558a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4561b(String str) {
        String strM4558a = m4558a(str);
        if (strM4558a == null) {
            return false;
        }
        return strM4558a.equalsIgnoreCase("true");
    }

    /* JADX INFO: renamed from: org.c.b.g$a */
    /* JADX INFO: compiled from: Util.java */
    private static final class a extends SecurityManager {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // java.lang.SecurityManager
        protected final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    /* JADX INFO: renamed from: b */
    private static a m4560b() {
        try {
            return new a((byte) 0);
        } catch (SecurityException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m4559a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: c */
    public static final void m4562c(String str) {
        System.err.println("SLF4J: ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m4557a() {
        a aVar;
        if (f6311a != null) {
            aVar = f6311a;
        } else if (f6312b) {
            aVar = null;
        } else {
            f6311a = m4560b();
            f6312b = true;
            aVar = f6311a;
        }
        if (aVar == null) {
            return null;
        }
        Class<?>[] classContext = aVar.getClassContext();
        String name = C1619g.class.getName();
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
