package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.InterfaceC0616e;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.z.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0771l extends AbstractC0650o implements InterfaceC0616e {

    /* JADX INFO: renamed from: a */
    InterfaceC0618f f3165a;

    /* JADX INFO: renamed from: b */
    int f3166b;

    private C0771l(AbstractC0539ab abstractC0539ab) {
        this.f3166b = abstractC0539ab.m1396b();
        if (this.f3166b == 0) {
            this.f3165a = C0775p.m1835a(abstractC0539ab);
        } else {
            this.f3165a = AbstractC0747x.m1742a(abstractC0539ab);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1821a(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0590bn(false, this.f3166b, this.f3165a);
    }

    public final String toString() {
        String strM4158a = C1560k.m4158a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(strM4158a);
        if (this.f3166b == 0) {
            m1821a(stringBuffer, strM4158a, "fullName", this.f3165a.toString());
        } else {
            m1821a(stringBuffer, strM4158a, "nameRelativeToCRLIssuer", this.f3165a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(strM4158a);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static C0771l m1820a(AbstractC0539ab abstractC0539ab) {
        AbstractC0650o abstractC0650oM1395a = AbstractC0539ab.m1395a(abstractC0539ab);
        if (abstractC0650oM1395a == null) {
            return (C0771l) abstractC0650oM1395a;
        }
        if (abstractC0650oM1395a instanceof AbstractC0539ab) {
            return new C0771l((AbstractC0539ab) abstractC0650oM1395a);
        }
        throw new IllegalArgumentException("unknown object in factory: " + abstractC0650oM1395a.getClass().getName());
    }
}
