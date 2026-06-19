package org.p044b.p045a.p046a;

import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.p044b.p045a.p046a.p049c.C0483c;
import org.p044b.p045a.p046a.p049c.EnumC0485e;
import org.p044b.p045a.p046a.p050d.C0487a;
import org.p044b.p045a.p046a.p051e.C0490b;
import org.p044b.p045a.p046a.p051e.InterfaceC0491c;
import org.p044b.p045a.p046a.p052f.C0493a;
import org.p044b.p045a.p046a.p052f.InterfaceC0494b;
import org.p044b.p053b.InterfaceC0495a;
import org.p044b.p053b.InterfaceC0496b;
import org.p044b.p053b.InterfaceC0497c;

/* JADX INFO: renamed from: org.b.a.a.d */
/* JADX INFO: compiled from: NanoHTTPD.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486d {

    /* JADX INFO: renamed from: a */
    public static final Pattern f1846a = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: b */
    public static final Pattern f1847b = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: c */
    public static final Pattern f1848c = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: d */
    public static final Logger f1849d = Logger.getLogger("NanoHTTPD");

    /* JADX INFO: renamed from: e */
    public final String f1850e;

    /* JADX INFO: renamed from: f */
    public final int f1851f;

    /* JADX INFO: renamed from: g */
    protected List<InterfaceC0497c<InterfaceC0480c, C0483c>> f1852g;

    /* JADX INFO: renamed from: h */
    protected InterfaceC0494b f1853h;

    /* JADX INFO: renamed from: i */
    private volatile ServerSocket f1854i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0496b<ServerSocket, IOException> f1855j;

    /* JADX INFO: renamed from: k */
    private Thread f1856k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0497c<InterfaceC0480c, C0483c> f1857l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0495a<InterfaceC0491c> f1858m;

    /* JADX INFO: renamed from: org.b.a.a.d$a */
    /* JADX INFO: compiled from: NanoHTTPD.java */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a */
        private final EnumC0485e f1859a;

        public a(EnumC0485e enumC0485e, String str) {
            super(str);
            this.f1859a = enumC0485e;
        }

        public a(EnumC0485e enumC0485e, String str, Exception exc) {
            super(str, exc);
            this.f1859a = enumC0485e;
        }

        /* JADX INFO: renamed from: a */
        public final EnumC0485e m1325a() {
            return this.f1859a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m1318a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                f1849d.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ServerSocket m1320a() {
        return this.f1854i;
    }

    public AbstractC0486d(int i) {
        this(i, (byte) 0);
    }

    private AbstractC0486d(int i, byte b) {
        this.f1855j = new C0487a();
        this.f1852g = new ArrayList(4);
        this.f1850e = null;
        this.f1851f = i;
        this.f1858m = new C0490b();
        this.f1853h = new C0493a();
        this.f1857l = new C0488e(this);
    }

    /* JADX INFO: renamed from: b */
    public static String m1319b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            f1849d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0495a<InterfaceC0491c> m1322b() {
        return this.f1858m;
    }

    /* JADX INFO: renamed from: b */
    public final C0483c m1321b(InterfaceC0480c interfaceC0480c) {
        Iterator<InterfaceC0497c<InterfaceC0480c, C0483c>> it = this.f1852g.iterator();
        while (it.hasNext()) {
            C0483c c0483cMo1327a = it.next().mo1327a(interfaceC0480c);
            if (c0483cMo1327a != null) {
                return c0483cMo1327a;
            }
        }
        return this.f1857l.mo1327a(interfaceC0480c);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    protected C0483c mo1176a(InterfaceC0480c interfaceC0480c) {
        return C0483c.m1304a(EnumC0485e.NOT_FOUND, "text/plain", "Not Found");
    }

    /* JADX INFO: renamed from: d */
    public final void m1324d() {
        try {
            m1318a(this.f1854i);
            this.f1853h.mo1332a();
            if (this.f1856k != null) {
                this.f1856k.join();
            }
        } catch (Exception e) {
            f1849d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1323c() {
        this.f1854i = this.f1855j.mo1326a();
        this.f1854i.setReuseAddress(true);
        RunnableC0492f runnableC0492f = new RunnableC0492f(this);
        this.f1856k = new Thread(runnableC0492f);
        this.f1856k.setDaemon(true);
        this.f1856k.setName("NanoHttpd Main Listener");
        this.f1856k.start();
        while (!runnableC0492f.m1331b() && runnableC0492f.m1330a() == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable th) {
            }
        }
        if (runnableC0492f.m1330a() != null) {
            throw runnableC0492f.m1330a();
        }
    }
}
