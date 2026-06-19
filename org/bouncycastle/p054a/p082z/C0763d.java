package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.z.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0763d extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    AbstractC0723v f3143a;

    private C0763d(AbstractC0723v abstractC0723v) {
        this.f3143a = null;
        this.f3143a = abstractC0723v;
    }

    /* JADX INFO: renamed from: a */
    public static C0763d m1790a(Object obj) {
        if (obj != null) {
            return new C0763d(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3143a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(strM4158a);
        C0770k[] c0770kArrM1791a = m1791a();
        for (int i = 0; i != c0770kArrM1791a.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(c0770kArrM1791a[i]);
            stringBuffer.append(strM4158a);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private C0770k[] m1791a() {
        C0770k c0770k;
        C0770k[] c0770kArr = new C0770k[this.f3143a.mo1484d()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == this.f3143a.mo1484d()) {
                return c0770kArr;
            }
            InterfaceC0618f interfaceC0618fMo1482a = this.f3143a.mo1482a(i2);
            if (interfaceC0618fMo1482a == null || (interfaceC0618fMo1482a instanceof C0770k)) {
                c0770k = (C0770k) interfaceC0618fMo1482a;
            } else {
                if (!(interfaceC0618fMo1482a instanceof AbstractC0723v)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: " + interfaceC0618fMo1482a.getClass().getName());
                }
                c0770k = new C0770k((AbstractC0723v) interfaceC0618fMo1482a);
            }
            c0770kArr[i2] = c0770k;
            i = i2 + 1;
        }
    }
}
