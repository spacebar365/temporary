package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.z.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0770k extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0771l f3162a;

    /* JADX INFO: renamed from: b */
    C0778s f3163b;

    /* JADX INFO: renamed from: c */
    C0775p f3164c;

    public C0770k(AbstractC0723v abstractC0723v) {
        for (int i = 0; i != abstractC0723v.mo1484d(); i++) {
            AbstractC0539ab abstractC0539abM1394a = AbstractC0539ab.m1394a(abstractC0723v.mo1482a(i));
            switch (abstractC0539abM1394a.m1396b()) {
                case 0:
                    this.f3162a = C0771l.m1820a(abstractC0539abM1394a);
                    break;
                case 1:
                    this.f3163b = new C0778s(C0558au.m1415a(abstractC0539abM1394a, false));
                    break;
                case 2:
                    this.f3164c = C0775p.m1835a(abstractC0539abM1394a);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + abstractC0539abM1394a.m1396b());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1819a(StringBuffer stringBuffer, String str, String str2, String str3) {
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
        C0625g c0625g = new C0625g();
        if (this.f3162a != null) {
            c0625g.m1521a(new C0590bn(this.f3162a));
        }
        if (this.f3163b != null) {
            c0625g.m1521a(new C0590bn(false, 1, this.f3163b));
        }
        if (this.f3164c != null) {
            c0625g.m1521a(new C0590bn(false, 2, this.f3164c));
        }
        return new C0585bi(c0625g);
    }

    public final String toString() {
        String strM4158a = C1560k.m4158a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(strM4158a);
        if (this.f3162a != null) {
            m1819a(stringBuffer, strM4158a, "distributionPoint", this.f3162a.toString());
        }
        if (this.f3163b != null) {
            m1819a(stringBuffer, strM4158a, "reasons", this.f3163b.toString());
        }
        if (this.f3164c != null) {
            m1819a(stringBuffer, strM4158a, "cRLIssuer", this.f3164c.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(strM4158a);
        return stringBuffer.toString();
    }
}
