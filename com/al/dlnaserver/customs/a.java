package com.al.dlnaserver.customs;

import java.net.URL;

/* JADX INFO: compiled from: CustomFTPFile.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private org.a.a.a.a.g a;
    private URL b;
    private long c;
    private long d;

    public a(org.a.a.a.a.g gVar, URL url, long j, long j2) {
        this.a = gVar;
        this.b = url;
        this.c = j;
        this.d = j2;
    }

    public final org.a.a.a.a.g a() {
        return this.a;
    }

    public final URL b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final String toString() {
        return String.valueOf(this.b.toString()) + "/" + this.a.c() + " (" + this.d + ")";
    }
}
