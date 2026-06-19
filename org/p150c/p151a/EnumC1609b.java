package org.p150c.p151a;

/* JADX INFO: renamed from: org.c.a.b */
/* JADX INFO: compiled from: Level.java */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1609b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: f */
    private int f6288f;

    /* JADX INFO: renamed from: g */
    private String f6289g;

    EnumC1609b(int i, String str) {
        this.f6288f = i;
        this.f6289g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6289g;
    }
}
