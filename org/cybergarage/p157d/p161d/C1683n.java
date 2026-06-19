package org.cybergarage.p157d.p161d;

import java.net.InetAddress;
import java.util.Vector;
import org.cybergarage.p155b.C1637a;

/* JADX INFO: renamed from: org.cybergarage.d.d.n */
/* JADX INFO: compiled from: SSDPSearchSocketList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1683n extends Vector {

    /* JADX INFO: renamed from: a */
    private InetAddress[] f6409a;

    /* JADX INFO: renamed from: b */
    private String f6410b;

    /* JADX INFO: renamed from: c */
    private String f6411c;

    /* JADX INFO: renamed from: d */
    private int f6412d;

    public C1683n() {
        this.f6409a = null;
        this.f6410b = "239.255.255.250";
        this.f6411c = C1672c.m4809a();
        this.f6412d = 1900;
    }

    public C1683n(InetAddress[] inetAddressArr, int i, String str, String str2) {
        this.f6409a = null;
        this.f6410b = "239.255.255.250";
        this.f6411c = C1672c.m4809a();
        this.f6412d = 1900;
        this.f6409a = inetAddressArr;
        this.f6412d = i;
        this.f6410b = str;
        this.f6411c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final RunnableC1682m m4835a(int i) {
        return (RunnableC1682m) get(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4836a() {
        String[] strArr;
        RunnableC1682m runnableC1682m;
        InetAddress[] inetAddressArr = this.f6409a;
        if (inetAddressArr != null) {
            String[] strArr2 = new String[inetAddressArr.length];
            for (int i = 0; i < inetAddressArr.length; i++) {
                strArr2[i] = inetAddressArr[i].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iM4709c = C1637a.m4709c();
            strArr = new String[iM4709c];
            for (int i2 = 0; i2 < iM4709c; i2++) {
                strArr[i2] = C1637a.m4703a(i2);
            }
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                if (C1637a.m4710c(strArr[i3])) {
                    runnableC1682m = new RunnableC1682m(strArr[i3], this.f6411c);
                } else {
                    runnableC1682m = new RunnableC1682m(strArr[i3], this.f6410b);
                }
                add(runnableC1682m);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4837b() {
        int size = size();
        for (int i = 0; i < size; i++) {
            m4835a(i).m4802g();
        }
        clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m4838c() {
        int size = size();
        for (int i = 0; i < size; i++) {
            m4835a(i).m4834j();
        }
    }
}
