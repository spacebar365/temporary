package org.cybergarage.d.e.a.a.b;

/* JADX INFO: compiled from: ContentProperty.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private String a;
    private String b;
    private org.cybergarage.xml.b c;

    public c() {
        this.a = new String();
        this.b = new String();
        this.c = new org.cybergarage.xml.b();
    }

    public c(String str, String str2) {
        this.a = new String();
        this.b = new String();
        this.c = new org.cybergarage.xml.b();
        this.a = str;
        this.b = str2;
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

    public final int c() {
        return this.c.size();
    }

    public final org.cybergarage.xml.a a(int i) {
        return this.c.a(i);
    }

    private void a(org.cybergarage.xml.a aVar) {
        this.c.add(aVar);
    }

    public final void a(String str, String str2) {
        a(new org.cybergarage.xml.a(str, str2));
    }

    public final void b(String str, String str2) {
        org.cybergarage.xml.a aVarA = this.c.a(str);
        if (aVarA != null) {
            aVarA.a(str2);
        } else {
            a(new org.cybergarage.xml.a(str, str2));
        }
    }
}
