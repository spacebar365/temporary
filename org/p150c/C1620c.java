package org.p150c;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.p150c.p151a.C1611d;
import org.p150c.p152b.C1615c;
import org.p150c.p152b.C1617e;
import org.p150c.p152b.C1618f;
import org.p150c.p152b.C1619g;
import org.p150c.p153c.C1621a;

/* JADX INFO: renamed from: org.c.c */
/* JADX INFO: compiled from: LoggerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1620c {

    /* JADX INFO: renamed from: a */
    static volatile int f6313a = 0;

    /* JADX INFO: renamed from: b */
    static final C1618f f6314b = new C1618f();

    /* JADX INFO: renamed from: c */
    static final C1615c f6315c = new C1615c();

    /* JADX INFO: renamed from: d */
    static boolean f6316d = C1619g.m4561b("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: e */
    private static final String[] f6317e = {"1.6", "1.7"};

    /* JADX INFO: renamed from: f */
    private static String f6318f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C1620c() {
    }

    /* JADX INFO: renamed from: a */
    private static void m4565a() {
        synchronized (f6314b) {
            f6314b.m4555c();
            for (C1617e c1617e : f6314b.m4553a()) {
                c1617e.m4549a(m4564a(c1617e.mo4531a()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4566a(Throwable th) {
        f6313a = 2;
        C1619g.m4559a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* JADX INFO: renamed from: b */
    private static void m4568b() {
        LinkedBlockingQueue<C1611d> linkedBlockingQueueM4554b = f6314b.m4554b();
        int size = linkedBlockingQueueM4554b.size();
        int i = 0;
        ArrayList<C1611d> arrayList = new ArrayList(128);
        while (linkedBlockingQueueM4554b.drainTo(arrayList, 128) != 0) {
            int i2 = i;
            for (C1611d c1611d : arrayList) {
                if (c1611d != null) {
                    C1617e c1617eM4545a = c1611d.m4545a();
                    String strMo4531a = c1617eM4545a.mo4531a();
                    if (c1617eM4545a.m4551f()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!c1617eM4545a.m4552g()) {
                        if (c1617eM4545a.m4550e()) {
                            c1617eM4545a.m4548a(c1611d);
                        } else {
                            C1619g.m4562c(strMo4531a);
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i2 == 0) {
                    if (!c1611d.m4545a().m4550e()) {
                        if (!c1611d.m4545a().m4552g()) {
                            C1619g.m4562c("The following set of substitute loggers may have been accessed");
                            C1619g.m4562c("during the initialization phase. Logging calls during this");
                            C1619g.m4562c("phase were not honored. However, subsequent logging calls to these");
                            C1619g.m4562c("loggers will work as normally expected.");
                            C1619g.m4562c("See also http://www.slf4j.org/codes.html#substituteLogger");
                        }
                    } else {
                        C1619g.m4562c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        C1619g.m4562c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C1619g.m4562c("See also http://www.slf4j.org/codes.html#replay");
                        i2 = i3;
                    }
                }
                i2 = i3;
            }
            arrayList.clear();
            i = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m4569c() {
        try {
            String str = C1621a.f6319a;
            boolean z = false;
            for (String str2 : f6317e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (!z) {
                C1619g.m4562c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f6317e).toString());
                C1619g.m4562c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError e) {
        } catch (Throwable th) {
            C1619g.m4559a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* JADX INFO: renamed from: d */
    private static Set<URL> m4570d() throws IOException {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C1620c.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(f6318f);
            } else {
                resources = classLoader.getResources(f6318f);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e) {
            C1619g.m4559a("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4567a(Set<URL> set) {
        return set.size() > 1;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC1612b m4564a(String str) {
        return m4571e().mo4529a(str);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1612b m4563a(Class<?> cls) {
        Class<?> clsM4557a;
        InterfaceC1612b interfaceC1612bM4564a = m4564a(cls.getName());
        if (f6316d && (clsM4557a = C1619g.m4557a()) != null) {
            if (!clsM4557a.isAssignableFrom(cls)) {
                C1619g.m4562c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC1612bM4564a.mo4531a(), clsM4557a.getName()));
                C1619g.m4562c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return interfaceC1612bM4564a;
    }

    /* JADX INFO: renamed from: e */
    private static InterfaceC1607a m4571e() {
        boolean z = true;
        if (f6313a == 0) {
            synchronized (C1620c.class) {
                if (f6313a == 0) {
                    f6313a = 1;
                    Set<URL> set = null;
                    try {
                        String strM4558a = C1619g.m4558a("java.vendor.url");
                        if (!(strM4558a == null ? false : strM4558a.toLowerCase().contains("android"))) {
                            Set<URL> setM4570d = m4570d();
                            if (m4567a(setM4570d)) {
                                C1619g.m4562c("Class path contains multiple SLF4J bindings.");
                                Iterator<URL> it = setM4570d.iterator();
                                while (it.hasNext()) {
                                    C1619g.m4562c("Found binding in [" + it.next() + "]");
                                }
                                C1619g.m4562c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                            }
                            set = setM4570d;
                        }
                        C1621a.m4572a();
                        f6313a = 3;
                        if (set != null && m4567a(set)) {
                            StringBuilder sb = new StringBuilder("Actual binding is of type [");
                            C1621a.m4572a();
                            C1619g.m4562c(sb.append(C1621a.m4573c()).append("]").toString());
                        }
                        m4565a();
                        m4568b();
                        f6314b.m4556d();
                    } catch (Exception e) {
                        m4566a(e);
                        throw new IllegalStateException("Unexpected initialization failure", e);
                    } catch (NoClassDefFoundError e2) {
                        String message = e2.getMessage();
                        if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                            z = false;
                        }
                        if (z) {
                            f6313a = 4;
                            C1619g.m4562c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                            C1619g.m4562c("Defaulting to no-operation (NOP) logger implementation");
                            C1619g.m4562c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                        } else {
                            m4566a(e2);
                            throw e2;
                        }
                    } catch (NoSuchMethodError e3) {
                        String message2 = e3.getMessage();
                        if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            f6313a = 2;
                            C1619g.m4562c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            C1619g.m4562c("Your binding is version 1.5.5 or earlier.");
                            C1619g.m4562c("Upgrade your binding to version 1.6.x.");
                        }
                        throw e3;
                    }
                    if (f6313a == 3) {
                        m4569c();
                    }
                }
            }
        }
        switch (f6313a) {
            case 1:
                return f6314b;
            case 2:
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            case 3:
                return C1621a.m4572a().m4574b();
            case 4:
                return f6315c;
            default:
                throw new IllegalStateException("Unreachable code");
        }
    }
}
