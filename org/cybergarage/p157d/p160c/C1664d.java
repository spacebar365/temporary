package org.cybergarage.p157d.p160c;

import java.net.URL;

/* JADX INFO: renamed from: org.cybergarage.d.c.d */
/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1664d {

    /* JADX INFO: renamed from: a */
    private String f6382a = null;

    /* JADX INFO: renamed from: b */
    private String f6383b = "";

    /* JADX INFO: renamed from: c */
    private String f6384c = "";

    /* JADX INFO: renamed from: d */
    private String f6385d = "";

    /* JADX INFO: renamed from: e */
    private String f6386e = "";

    /* JADX INFO: renamed from: f */
    private int f6387f = 0;

    /* JADX INFO: renamed from: g */
    private long f6388g = 0;

    /* JADX INFO: renamed from: h */
    private long f6389h = 0;

    /* JADX INFO: renamed from: i */
    private long f6390i = 0;

    public C1664d() {
        m4768h();
    }

    /* JADX INFO: renamed from: a */
    public final String m4758a() {
        return this.f6382a;
    }

    /* JADX INFO: renamed from: a */
    public final void m4760a(String str) {
        this.f6382a = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m4762b(String str) {
        this.f6384c = str;
        try {
            URL url = new URL(str);
            this.f6385d = url.getHost();
            this.f6386e = url.getPath();
            this.f6387f = url.getPort();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m4761b() {
        return this.f6385d;
    }

    /* JADX INFO: renamed from: c */
    public final String m4763c() {
        return this.f6386e;
    }

    /* JADX INFO: renamed from: d */
    public final int m4764d() {
        return this.f6387f;
    }

    /* JADX INFO: renamed from: a */
    public final void m4759a(long j) {
        this.f6388g = j;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4765e() {
        return this.f6388g != -1 && this.f6389h + (this.f6388g * 1000) < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public final long m4766f() {
        return this.f6390i;
    }

    /* JADX INFO: renamed from: g */
    public final void m4767g() {
        if (this.f6390i == Long.MAX_VALUE) {
            this.f6390i = 1L;
        } else {
            this.f6390i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4768h() {
        this.f6389h = System.currentTimeMillis();
        this.f6390i = 0L;
    }
}
