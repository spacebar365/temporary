package com.p033al.dlnaserver.customs;

import java.net.URL;
import org.p037a.p038a.p039a.p040a.C0456g;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.a */
/* JADX INFO: compiled from: CustomFTPFile.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0378a {

    /* JADX INFO: renamed from: a */
    private C0456g f1449a;

    /* JADX INFO: renamed from: b */
    private URL f1450b;

    /* JADX INFO: renamed from: c */
    private long f1451c;

    /* JADX INFO: renamed from: d */
    private long f1452d;

    public C0378a(C0456g c0456g, URL url, long j, long j2) {
        this.f1449a = c0456g;
        this.f1450b = url;
        this.f1451c = j;
        this.f1452d = j2;
    }

    /* JADX INFO: renamed from: a */
    public final C0456g m1074a() {
        return this.f1449a;
    }

    /* JADX INFO: renamed from: b */
    public final URL m1075b() {
        return this.f1450b;
    }

    /* JADX INFO: renamed from: c */
    public final long m1076c() {
        return this.f1451c;
    }

    /* JADX INFO: renamed from: d */
    public final long m1077d() {
        return this.f1452d;
    }

    public final String toString() {
        return String.valueOf(this.f1450b.toString()) + "/" + this.f1449a.m1252c() + " (" + this.f1452d + ")";
    }
}
