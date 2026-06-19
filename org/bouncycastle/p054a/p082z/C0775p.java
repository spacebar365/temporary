package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.z.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0775p extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0774o[] f3206a;

    private C0775p(AbstractC0723v abstractC0723v) {
        this.f3206a = new C0774o[abstractC0723v.mo1484d()];
        for (int i = 0; i != abstractC0723v.mo1484d(); i++) {
            this.f3206a[i] = C0774o.m1831a(abstractC0723v.mo1482a(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0775p m1834a(Object obj) {
        if (obj instanceof C0775p) {
            return (C0775p) obj;
        }
        if (obj != null) {
            return new C0775p(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0775p m1835a(AbstractC0539ab abstractC0539ab) {
        return m1834a(AbstractC0723v.m1709a(abstractC0539ab, false));
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0585bi(this.f3206a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(strM4158a);
        for (int i = 0; i != this.f3206a.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.f3206a[i]);
            stringBuffer.append(strM4158a);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final C0774o[] m1836a() {
        C0774o[] c0774oArr = this.f3206a;
        C0774o[] c0774oArr2 = new C0774o[c0774oArr.length];
        System.arraycopy(c0774oArr, 0, c0774oArr2, 0, c0774oArr2.length);
        return c0774oArr2;
    }
}
