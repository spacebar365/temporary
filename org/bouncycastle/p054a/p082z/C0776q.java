package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0613d;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.z.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0776q extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0771l f3207a;

    /* JADX INFO: renamed from: b */
    private boolean f3208b;

    /* JADX INFO: renamed from: c */
    private boolean f3209c;

    /* JADX INFO: renamed from: d */
    private C0778s f3210d;

    /* JADX INFO: renamed from: e */
    private boolean f3211e;

    /* JADX INFO: renamed from: f */
    private boolean f3212f;

    /* JADX INFO: renamed from: g */
    private AbstractC0723v f3213g;

    private C0776q(AbstractC0723v abstractC0723v) {
        this.f3213g = abstractC0723v;
        for (int i = 0; i != abstractC0723v.mo1484d(); i++) {
            AbstractC0539ab abstractC0539abM1394a = AbstractC0539ab.m1394a(abstractC0723v.mo1482a(i));
            switch (abstractC0539abM1394a.m1396b()) {
                case 0:
                    this.f3207a = C0771l.m1820a(abstractC0539abM1394a);
                    break;
                case 1:
                    this.f3208b = C0613d.m1492a(abstractC0539abM1394a).m1495b();
                    break;
                case 2:
                    this.f3209c = C0613d.m1492a(abstractC0539abM1394a).m1495b();
                    break;
                case 3:
                    this.f3210d = new C0778s(C0778s.m1415a(abstractC0539abM1394a, false));
                    break;
                case 4:
                    this.f3211e = C0613d.m1492a(abstractC0539abM1394a).m1495b();
                    break;
                case 5:
                    this.f3212f = C0613d.m1492a(abstractC0539abM1394a).m1495b();
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m1837a(boolean z) {
        return z ? "true" : "false";
    }

    /* JADX INFO: renamed from: a */
    public static C0776q m1838a(Object obj) {
        if (obj instanceof C0776q) {
            return (C0776q) obj;
        }
        if (obj != null) {
            return new C0776q(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m1839a(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1840a() {
        return this.f3211e;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3213g;
    }

    public final String toString() {
        String strM4158a = C1560k.m4158a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(strM4158a);
        if (this.f3207a != null) {
            m1839a(stringBuffer, strM4158a, "distributionPoint", this.f3207a.toString());
        }
        if (this.f3208b) {
            m1839a(stringBuffer, strM4158a, "onlyContainsUserCerts", m1837a(this.f3208b));
        }
        if (this.f3209c) {
            m1839a(stringBuffer, strM4158a, "onlyContainsCACerts", m1837a(this.f3209c));
        }
        if (this.f3210d != null) {
            m1839a(stringBuffer, strM4158a, "onlySomeReasons", this.f3210d.toString());
        }
        if (this.f3212f) {
            m1839a(stringBuffer, strM4158a, "onlyContainsAttributeCerts", m1837a(this.f3212f));
        }
        if (this.f3211e) {
            m1839a(stringBuffer, strM4158a, "indirectCRL", m1837a(this.f3211e));
        }
        stringBuffer.append("]");
        stringBuffer.append(strM4158a);
        return stringBuffer.toString();
    }
}
