package org.cybergarage.d.f;

import java.io.File;
import java.net.InetAddress;
import org.cybergarage.a.i;
import org.cybergarage.d.d.g;
import org.cybergarage.d.d.n;

/* JADX INFO: compiled from: DeviceData.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    private String a = null;
    private File b = null;
    private String c = "";
    private int d = 1800;
    private i e = null;
    private InetAddress[] f = null;
    private int g = 4004;
    private org.cybergarage.e.b h = new org.cybergarage.e.b();
    private n i = null;
    private String j = "239.255.255.250";
    private String k = org.cybergarage.d.d.c.a();
    private int l = 1900;
    private InetAddress[] m = null;
    private g n = null;
    private org.cybergarage.d.b.a o = null;

    public final File a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final void c() {
        this.b = null;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final void f() {
        this.d = 1800;
    }

    public final i g() {
        if (this.e == null) {
            this.e = new i(this.f, this.g);
        }
        return this.e;
    }

    public final void a(InetAddress[] inetAddressArr) {
        this.f = inetAddressArr;
    }

    public final InetAddress[] h() {
        return this.f;
    }

    public final int i() {
        return this.g;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final n j() {
        if (this.i == null) {
            this.i = new n(this.m, this.l, this.j, this.k);
        }
        return this.i;
    }

    public final void b(InetAddress[] inetAddressArr) {
        this.m = inetAddressArr;
    }

    public final g k() {
        return this.n;
    }

    public final void a(g gVar) {
        this.n = gVar;
    }

    public final void a(org.cybergarage.d.b.a aVar) {
        this.o = aVar;
    }

    public final org.cybergarage.d.b.a l() {
        return this.o;
    }
}
