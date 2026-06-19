package org.p037a.p038a.p039a.p040a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

/* JADX INFO: renamed from: org.a.a.a.a.g */
/* JADX INFO: compiled from: FTPFile.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0456g implements Serializable {

    /* JADX INFO: renamed from: a */
    private int f1701a;

    /* JADX INFO: renamed from: b */
    private int f1702b;

    /* JADX INFO: renamed from: c */
    private long f1703c;

    /* JADX INFO: renamed from: d */
    private String f1704d;

    /* JADX INFO: renamed from: e */
    private String f1705e;

    /* JADX INFO: renamed from: f */
    private String f1706f;

    /* JADX INFO: renamed from: g */
    private String f1707g;

    /* JADX INFO: renamed from: h */
    private String f1708h;

    /* JADX INFO: renamed from: i */
    private Calendar f1709i;

    /* JADX INFO: renamed from: j */
    private final boolean[][] f1710j;

    public C0456g() {
        this.f1710j = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
        this.f1701a = 3;
        this.f1702b = 0;
        this.f1703c = -1L;
        this.f1705e = "";
        this.f1706f = "";
        this.f1709i = null;
        this.f1707g = null;
    }

    C0456g(String str) {
        this.f1710j = null;
        this.f1704d = str;
        this.f1701a = 3;
        this.f1702b = 0;
        this.f1703c = -1L;
        this.f1705e = "";
        this.f1706f = "";
        this.f1709i = null;
        this.f1707g = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1246a(String str) {
        this.f1704d = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1248a() {
        return this.f1701a == 1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1251b() {
        return this.f1701a == 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1243a(int i) {
        this.f1701a = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m1250b(String str) {
        this.f1707g = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m1252c() {
        return this.f1707g;
    }

    /* JADX INFO: renamed from: a */
    public final void m1245a(long j) {
        this.f1703c = j;
    }

    /* JADX INFO: renamed from: d */
    public final long m1254d() {
        return this.f1703c;
    }

    /* JADX INFO: renamed from: b */
    public final void m1249b(int i) {
        this.f1702b = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m1253c(String str) {
        this.f1706f = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m1255d(String str) {
        this.f1705e = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m1257e(String str) {
        this.f1708h = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m1247a(Calendar calendar) {
        this.f1709i = calendar;
    }

    /* JADX INFO: renamed from: e */
    public final Calendar m1256e() {
        return this.f1709i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1244a(int i, int i2, boolean z) {
        this.f1710j[i][i2] = z;
    }

    public final String toString() {
        return this.f1704d;
    }
}
