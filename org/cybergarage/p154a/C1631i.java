package org.cybergarage.p154a;

import java.net.InetAddress;
import java.util.Vector;
import org.cybergarage.p155b.C1637a;

/* JADX INFO: renamed from: org.cybergarage.a.i */
/* JADX INFO: compiled from: HTTPServerList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1631i extends Vector {

    /* JADX INFO: renamed from: a */
    private InetAddress[] f6348a;

    /* JADX INFO: renamed from: b */
    private int f6349b;

    public C1631i() {
        this.f6348a = null;
        this.f6349b = 4004;
    }

    public C1631i(InetAddress[] inetAddressArr, int i) {
        this.f6348a = null;
        this.f6349b = 4004;
        this.f6348a = inetAddressArr;
        this.f6349b = i;
    }

    /* JADX INFO: renamed from: a */
    public final RunnableC1630h m4685a(int i) {
        return (RunnableC1630h) get(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m4686a() {
        int size = size();
        for (int i = 0; i < size; i++) {
            m4685a(i).m4682b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4688b(int i) {
        String[] strArr;
        this.f6349b = i;
        InetAddress[] inetAddressArr = this.f6348a;
        if (inetAddressArr != null) {
            String[] strArr2 = new String[inetAddressArr.length];
            for (int i2 = 0; i2 < inetAddressArr.length; i2++) {
                strArr2[i2] = inetAddressArr[i2].getHostAddress();
            }
            strArr = strArr2;
        } else {
            int iM4709c = C1637a.m4709c();
            strArr = new String[iM4709c];
            for (int i3 = 0; i3 < iM4709c; i3++) {
                strArr[i3] = C1637a.m4703a(i3);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (C1637a.m4711d(strArr[i5])) {
                RunnableC1630h runnableC1630h = new RunnableC1630h();
                if (strArr[i5] == null || !runnableC1630h.m4681a(strArr[i5], this.f6349b)) {
                    m4686a();
                    clear();
                } else {
                    add(runnableC1630h);
                    i4++;
                }
            }
        }
        return i4 != 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m4687b() {
        int size = size();
        for (int i = 0; i < size; i++) {
            m4685a(i).m4684d();
        }
    }
}
