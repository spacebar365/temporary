package org.a.a.a.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

/* JADX INFO: compiled from: FTPFile.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {
    private int a;
    private int b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Calendar i;
    private final boolean[][] j;

    public g() {
        this.j = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
        this.a = 3;
        this.b = 0;
        this.c = -1L;
        this.e = "";
        this.f = "";
        this.i = null;
        this.g = null;
    }

    g(String str) {
        this.j = null;
        this.d = str;
        this.a = 3;
        this.b = 0;
        this.c = -1L;
        this.e = "";
        this.f = "";
        this.i = null;
        this.g = null;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final boolean a() {
        return this.a == 1;
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final void b(String str) {
        this.g = str;
    }

    public final String c() {
        return this.g;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final long d() {
        return this.c;
    }

    public final void b(int i) {
        this.b = i;
    }

    public final void c(String str) {
        this.f = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final void a(Calendar calendar) {
        this.i = calendar;
    }

    public final Calendar e() {
        return this.i;
    }

    public final void a(int i, int i2, boolean z) {
        this.j[i][i2] = z;
    }

    public final String toString() {
        return this.d;
    }
}
