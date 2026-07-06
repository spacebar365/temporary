package org.c.a;

/* JADX INFO: compiled from: Level.java */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    a(40, "ERROR"),
    b(30, "WARN"),
    c(20, "INFO"),
    d(10, "DEBUG"),
    e(0, "TRACE");

    private int f;
    private String g;

    b(int i, String str) {
        this.f = i;
        this.g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
