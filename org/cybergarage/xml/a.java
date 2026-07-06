package org.cybergarage.xml;

/* JADX INFO: compiled from: Attribute.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private String a;
    private String b;

    public a() {
        this.a = new String();
        this.b = new String();
    }

    public a(String str, String str2) {
        this();
        this.a = str;
        this.b = str2;
    }

    public a(a aVar) {
        this();
        this.a = aVar.a;
        this.b = aVar.b;
    }

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final String b() {
        return this.b;
    }
}
