package org.b.a.a;

/* JADX INFO: compiled from: NanoHTTPD.java */
/* JADX INFO: loaded from: classes.dex */
public final class d$a extends Exception {
    private final org.b.a.a.c.e a;

    public d$a(org.b.a.a.c.e eVar, String str) {
        super(str);
        this.a = eVar;
    }

    public d$a(org.b.a.a.c.e eVar, String str, Exception exc) {
        super(str, exc);
        this.a = eVar;
    }

    public final org.b.a.a.c.e a() {
        return this.a;
    }
}
