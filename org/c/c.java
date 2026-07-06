package org.c;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.c.b.e;
import org.c.b.f;
import org.c.b.g;

/* JADX INFO: compiled from: LoggerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    static volatile int a = 0;
    static final f b = new f();
    static final org.c.b.c c = new org.c.b.c();
    static boolean d = g.b("slf4j.detectLoggerNameMismatch");
    private static final String[] e = {"1.6", "1.7"};
    private static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    private c() {
    }

    private static void a() {
        synchronized (b) {
            b.c();
            for (e eVar : b.a()) {
                eVar.a(a(eVar.a()));
            }
        }
    }

    private static void a(Throwable th) {
        a = 2;
        g.a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static void b() {
        LinkedBlockingQueue<org.c.a.d> linkedBlockingQueueB = b.b();
        int size = linkedBlockingQueueB.size();
        int i = 0;
        ArrayList<org.c.a.d> arrayList = new ArrayList(128);
        while (linkedBlockingQueueB.drainTo(arrayList, 128) != 0) {
            int i2 = i;
            for (org.c.a.d dVar : arrayList) {
                if (dVar != null) {
                    e eVarA = dVar.a();
                    String strA = eVarA.a();
                    if (eVarA.f()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!eVarA.g()) {
                        if (eVarA.e()) {
                            eVarA.a(dVar);
                        } else {
                            g.c(strA);
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i2 == 0) {
                    if (!dVar.a().e()) {
                        if (!dVar.a().g()) {
                            g.c("The following set of substitute loggers may have been accessed");
                            g.c("during the initialization phase. Logging calls during this");
                            g.c("phase were not honored. However, subsequent logging calls to these");
                            g.c("loggers will work as normally expected.");
                            g.c("See also http://www.slf4j.org/codes.html#substituteLogger");
                        }
                    } else {
                        g.c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        g.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        g.c("See also http://www.slf4j.org/codes.html#replay");
                        i2 = i3;
                    }
                }
                i2 = i3;
            }
            arrayList.clear();
            i = i2;
        }
    }

    private static final void c() {
        try {
            String str = org.c.c.a.a;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (!z) {
                g.c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
                g.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError e2) {
        } catch (Throwable th) {
            g.a("Unexpected problem occured during version sanity check", th);
        }
    }

    private static Set<URL> d() throws IOException {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(f);
            } else {
                resources = classLoader.getResources(f);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e2) {
            g.a("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    private static boolean a(Set<URL> set) {
        return set.size() > 1;
    }

    private static b a(String str) {
        return e().a(str);
    }

    public static b a(Class<?> cls) {
        Class<?> clsA;
        b bVarA = a(cls.getName());
        if (d && (clsA = g.a()) != null) {
            if (!clsA.isAssignableFrom(cls)) {
                g.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", bVarA.a(), clsA.getName()));
                g.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return bVarA;
    }

    private static a e() {
        boolean z = true;
        if (a == 0) {
            synchronized (c.class) {
                if (a == 0) {
                    a = 1;
                    Set<URL> set = null;
                    try {
                        String strA = g.a("java.vendor.url");
                        if (!(strA == null ? false : strA.toLowerCase().contains("android"))) {
                            Set<URL> setD = d();
                            if (a(setD)) {
                                g.c("Class path contains multiple SLF4J bindings.");
                                Iterator<URL> it = setD.iterator();
                                while (it.hasNext()) {
                                    g.c("Found binding in [" + it.next() + "]");
                                }
                                g.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                            }
                            set = setD;
                        }
                        org.c.c.a.a();
                        a = 3;
                        if (set != null && a(set)) {
                            StringBuilder sb = new StringBuilder("Actual binding is of type [");
                            org.c.c.a.a();
                            g.c(sb.append(org.c.c.a.c()).append("]").toString());
                        }
                        a();
                        b();
                        b.d();
                    } catch (Exception e2) {
                        a(e2);
                        throw new IllegalStateException("Unexpected initialization failure", e2);
                    } catch (NoClassDefFoundError e3) {
                        String message = e3.getMessage();
                        if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                            z = false;
                        }
                        if (z) {
                            a = 4;
                            g.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                            g.c("Defaulting to no-operation (NOP) logger implementation");
                            g.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                        } else {
                            a(e3);
                            throw e3;
                        }
                    } catch (NoSuchMethodError e4) {
                        String message2 = e4.getMessage();
                        if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            a = 2;
                            g.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            g.c("Your binding is version 1.5.5 or earlier.");
                            g.c("Upgrade your binding to version 1.6.x.");
                        }
                        throw e4;
                    }
                    if (a == 3) {
                        c();
                    }
                }
            }
        }
        switch (a) {
            case 1:
                return b;
            case 2:
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            case 3:
                return org.c.c.a.a().b();
            case 4:
                return c;
            default:
                throw new IllegalStateException("Unreachable code");
        }
    }
}
