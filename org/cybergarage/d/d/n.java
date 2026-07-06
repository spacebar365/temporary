package org.cybergarage.d.d;

import java.net.InetAddress;
import java.util.Vector;

/* JADX INFO: compiled from: SSDPSearchSocketList.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Vector {
    private InetAddress[] a;
    private String b;
    private String c;
    private int d;

    public n() {
        this.a = null;
        this.b = "239.255.255.250";
        this.c = c.a();
        this.d = 1900;
    }

    public n(InetAddress[] inetAddressArr, int i, String str, String str2) {
        this.a = null;
        this.b = "239.255.255.250";
        this.c = c.a();
        this.d = 1900;
        this.a = inetAddressArr;
        this.d = i;
        this.b = str;
        this.c = str2;
    }

    public final m a(int i) {
        return (m) get(i);
    }

    public final boolean a() {
        String[] strArr;
        m mVar;
        InetAddress[] inetAddressArr = this.a;
        if (inetAddressArr != null) {
            String[] strArr2 = new String[inetAddressArr.length];
            for (int i = 0; i < inetAddressArr.length; i++) {
                strArr2[i] = inetAddressArr[i].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iC = org.cybergarage.b.a.c();
            strArr = new String[iC];
            for (int i2 = 0; i2 < iC; i2++) {
                strArr[i2] = org.cybergarage.b.a.a(i2);
            }
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                if (org.cybergarage.b.a.c(strArr[i3])) {
                    mVar = new m(strArr[i3], this.c);
                } else {
                    mVar = new m(strArr[i3], this.b);
                }
                add(mVar);
            }
        }
        return true;
    }

    public final void b() {
        int size = size();
        for (int i = 0; i < size; i++) {
            a(i).g();
        }
        clear();
    }

    public final void c() {
        int size = size();
        for (int i = 0; i < size; i++) {
            a(i).j();
        }
    }
}
