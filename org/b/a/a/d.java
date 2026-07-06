package org.b.a.a;

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

/* JADX INFO: compiled from: NanoHTTPD.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final Pattern a = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    public static final Pattern b = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    public static final Pattern c = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    public static final Logger d = Logger.getLogger("NanoHTTPD");
    public final String e;
    public final int f;
    protected List<org.b.b.c<c, org.b.a.a.c.c>> g;
    protected org.b.a.a.f.b h;
    private volatile ServerSocket i;
    private org.b.b.b<ServerSocket, IOException> j;
    private Thread k;
    private org.b.b.c<c, org.b.a.a.c.c> l;
    private org.b.b.a<org.b.a.a.e.c> m;

    public static final void a(Object obj) {
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
                d.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public final ServerSocket a() {
        return this.i;
    }

    public d(int i) {
        this(i, (byte) 0);
    }

    private d(int i, byte b2) {
        this.j = new org.b.a.a.d.a();
        this.g = new ArrayList(4);
        this.e = null;
        this.f = i;
        this.m = new org.b.a.a.e.b();
        this.h = new org.b.a.a.f.a();
        this.l = new e(this);
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public final org.b.b.a<org.b.a.a.e.c> b() {
        return this.m;
    }

    public final org.b.a.a.c.c b(c cVar) {
        Iterator<org.b.b.c<c, org.b.a.a.c.c>> it = this.g.iterator();
        while (it.hasNext()) {
            org.b.a.a.c.c cVarA = it.next().a(cVar);
            if (cVarA != null) {
                return cVarA;
            }
        }
        return this.l.a(cVar);
    }

    @Deprecated
    protected org.b.a.a.c.c a(c cVar) {
        return org.b.a.a.c.c.a(org.b.a.a.c.e.p, "text/plain", "Not Found");
    }

    public final void d() {
        try {
            a(this.i);
            this.h.a();
            if (this.k != null) {
                this.k.join();
            }
        } catch (Exception e) {
            d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    public final void c() throws IOException {
        this.i = this.j.a();
        this.i.setReuseAddress(true);
        f fVar = new f(this);
        this.k = new Thread(fVar);
        this.k.setDaemon(true);
        this.k.setName("NanoHttpd Main Listener");
        this.k.start();
        while (!fVar.b() && fVar.a() == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable th) {
            }
        }
        if (fVar.a() != null) {
            throw fVar.a();
        }
    }
}
