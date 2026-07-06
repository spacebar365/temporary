package org.cybergarage.a;

import java.net.InetAddress;
import java.util.Vector;

/* JADX INFO: compiled from: HTTPServerList.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Vector {
    private InetAddress[] a;
    private int b;

    public i() {
        this.a = null;
        this.b = 4004;
    }

    public i(InetAddress[] inetAddressArr, int i) {
        this.a = null;
        this.b = 4004;
        this.a = inetAddressArr;
        this.b = i;
    }

    public final h a(int i) {
        return (h) get(i);
    }

    public final void a() {
        int size = size();
        for (int i = 0; i < size; i++) {
            a(i).b();
        }
    }

    public final boolean b(int i) {
        String[] strArr;
        this.b = i;
        InetAddress[] inetAddressArr = this.a;
        if (inetAddressArr != null) {
            String[] strArr2 = new String[inetAddressArr.length];
            for (int i2 = 0; i2 < inetAddressArr.length; i2++) {
                strArr2[i2] = inetAddressArr[i2].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iC = org.cybergarage.b.a.c();
            strArr = new String[iC];
            for (int i3 = 0; i3 < iC; i3++) {
                strArr[i3] = org.cybergarage.b.a.a(i3);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (org.cybergarage.b.a.d(strArr[i5])) {
                h hVar = new h();
                if (strArr[i5] == null || !hVar.a(strArr[i5], this.b)) {
                    a();
                    clear();
                } else {
                    add(hVar);
                    i4++;
                }
            }
        }
        return i4 != 0;
    }

    public final void b() {
        int size = size();
        for (int i = 0; i < size; i++) {
            a(i).d();
        }
    }
}
