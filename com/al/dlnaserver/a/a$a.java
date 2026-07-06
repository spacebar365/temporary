package com.al.dlnaserver.a;

/* JADX INFO: compiled from: M3UParser.java */
/* JADX INFO: loaded from: classes.dex */
public class a$a {
    private String[] a;
    private String[] b;

    public a$a(String[] strArr, String[] strArr2) {
        this.a = strArr;
        this.b = strArr2;
    }

    public final int a() {
        if (this.a != null) {
            return this.a.length;
        }
        return 0;
    }

    public final String a(int i) {
        return this.a[i];
    }

    public final String b(int i) {
        return this.b[i];
    }
}
