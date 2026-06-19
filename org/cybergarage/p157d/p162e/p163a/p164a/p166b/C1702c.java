package org.cybergarage.p157d.p162e.p163a.p164a.p166b;

import org.cybergarage.xml.C1750a;
import org.cybergarage.xml.C1751b;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.c */
/* JADX INFO: compiled from: ContentProperty.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1702c {

    /* JADX INFO: renamed from: a */
    private String f6441a;

    /* JADX INFO: renamed from: b */
    private String f6442b;

    /* JADX INFO: renamed from: c */
    private C1751b f6443c;

    public C1702c() {
        this.f6441a = new String();
        this.f6442b = new String();
        this.f6443c = new C1751b();
    }

    public C1702c(String str, String str2) {
        this.f6441a = new String();
        this.f6442b = new String();
        this.f6443c = new C1751b();
        this.f6441a = str;
        this.f6442b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m4884a() {
        return this.f6441a;
    }

    /* JADX INFO: renamed from: a */
    public final void m4886a(String str) {
        this.f6442b = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m4888b() {
        return this.f6442b;
    }

    /* JADX INFO: renamed from: c */
    public final int m4890c() {
        return this.f6443c.size();
    }

    /* JADX INFO: renamed from: a */
    public final C1750a m4885a(int i) {
        return this.f6443c.m5135a(i);
    }

    /* JADX INFO: renamed from: a */
    private void m4883a(C1750a c1750a) {
        this.f6443c.add(c1750a);
    }

    /* JADX INFO: renamed from: a */
    public final void m4887a(String str, String str2) {
        m4883a(new C1750a(str, str2));
    }

    /* JADX INFO: renamed from: b */
    public final void m4889b(String str, String str2) {
        C1750a c1750aM5136a = this.f6443c.m5136a(str);
        if (c1750aM5136a != null) {
            c1750aM5136a.m5133a(str2);
        } else {
            m4883a(new C1750a(str, str2));
        }
    }
}
