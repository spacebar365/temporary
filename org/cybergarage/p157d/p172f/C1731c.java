package org.cybergarage.p157d.p172f;

import java.io.File;
import java.net.InetAddress;
import org.cybergarage.p154a.C1631i;
import org.cybergarage.p157d.p159b.C1652a;
import org.cybergarage.p157d.p161d.C1672c;
import org.cybergarage.p157d.p161d.C1676g;
import org.cybergarage.p157d.p161d.C1683n;
import org.cybergarage.p173e.C1745b;

/* JADX INFO: renamed from: org.cybergarage.d.f.c */
/* JADX INFO: compiled from: DeviceData.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1731c extends C1732d {

    /* JADX INFO: renamed from: a */
    private String f6482a = null;

    /* JADX INFO: renamed from: b */
    private File f6483b = null;

    /* JADX INFO: renamed from: c */
    private String f6484c = "";

    /* JADX INFO: renamed from: d */
    private int f6485d = 1800;

    /* JADX INFO: renamed from: e */
    private C1631i f6486e = null;

    /* JADX INFO: renamed from: f */
    private InetAddress[] f6487f = null;

    /* JADX INFO: renamed from: g */
    private int f6488g = 4004;

    /* JADX INFO: renamed from: h */
    private C1745b f6489h = new C1745b();

    /* JADX INFO: renamed from: i */
    private C1683n f6490i = null;

    /* JADX INFO: renamed from: j */
    private String f6491j = "239.255.255.250";

    /* JADX INFO: renamed from: k */
    private String f6492k = C1672c.m4809a();

    /* JADX INFO: renamed from: l */
    private int f6493l = 1900;

    /* JADX INFO: renamed from: m */
    private InetAddress[] f6494m = null;

    /* JADX INFO: renamed from: n */
    private C1676g f6495n = null;

    /* JADX INFO: renamed from: o */
    private C1652a f6496o = null;

    /* JADX INFO: renamed from: a */
    public final File m5009a() {
        return this.f6483b;
    }

    /* JADX INFO: renamed from: b */
    public final String m5015b() {
        return this.f6482a;
    }

    /* JADX INFO: renamed from: c */
    public final void m5017c() {
        this.f6483b = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m5011a(String str) {
        this.f6482a = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m5018d() {
        return this.f6484c;
    }

    /* JADX INFO: renamed from: e */
    public final int m5019e() {
        return this.f6485d;
    }

    /* JADX INFO: renamed from: f */
    public final void m5020f() {
        this.f6485d = 1800;
    }

    /* JADX INFO: renamed from: g */
    public final C1631i m5021g() {
        if (this.f6486e == null) {
            this.f6486e = new C1631i(this.f6487f, this.f6488g);
        }
        return this.f6486e;
    }

    /* JADX INFO: renamed from: a */
    public final void m5014a(InetAddress[] inetAddressArr) {
        this.f6487f = inetAddressArr;
    }

    /* JADX INFO: renamed from: h */
    public final InetAddress[] m5022h() {
        return this.f6487f;
    }

    /* JADX INFO: renamed from: i */
    public final int m5023i() {
        return this.f6488g;
    }

    /* JADX INFO: renamed from: a */
    public final void m5010a(int i) {
        this.f6488g = i;
    }

    /* JADX INFO: renamed from: j */
    public final C1683n m5024j() {
        if (this.f6490i == null) {
            this.f6490i = new C1683n(this.f6494m, this.f6493l, this.f6491j, this.f6492k);
        }
        return this.f6490i;
    }

    /* JADX INFO: renamed from: b */
    public final void m5016b(InetAddress[] inetAddressArr) {
        this.f6494m = inetAddressArr;
    }

    /* JADX INFO: renamed from: k */
    public final C1676g m5025k() {
        return this.f6495n;
    }

    /* JADX INFO: renamed from: a */
    public final void m5013a(C1676g c1676g) {
        this.f6495n = c1676g;
    }

    /* JADX INFO: renamed from: a */
    public final void m5012a(C1652a c1652a) {
        this.f6496o = c1652a;
    }

    /* JADX INFO: renamed from: l */
    public final C1652a m5026l() {
        return this.f6496o;
    }
}
