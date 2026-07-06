package org.cybergarage.d.c;

import java.net.URL;

/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private String a = null;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private int f = 0;
    private long g = 0;
    private long h = 0;
    private long i = 0;

    public d() {
        h();
    }

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void b(String str) {
        this.c = str;
        try {
            URL url = new URL(str);
            this.d = url.getHost();
            this.e = url.getPath();
            this.f = url.getPort();
        } catch (Exception e) {
        }
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final int d() {
        return this.f;
    }

    public final void a(long j) {
        this.g = j;
    }

    public final boolean e() {
        return this.g != -1 && this.h + (this.g * 1000) < System.currentTimeMillis();
    }

    public final long f() {
        return this.i;
    }

    public final void g() {
        if (this.i == Long.MAX_VALUE) {
            this.i = 1L;
        } else {
            this.i++;
        }
    }

    public final void h() {
        this.h = System.currentTimeMillis();
        this.i = 0L;
    }
}
