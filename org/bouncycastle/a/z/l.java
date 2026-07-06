package org.bouncycastle.a.z;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class l extends org.bouncycastle.a.o implements org.bouncycastle.a.e {
    org.bouncycastle.a.f a;
    int b;

    private l(ab abVar) {
        this.b = abVar.b();
        if (this.b == 0) {
            this.a = p.a(abVar);
        } else {
            this.a = org.bouncycastle.a.x.a(abVar);
        }
    }

    private static void a(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return new bn(false, this.b, this.a);
    }

    public final String toString() {
        String strA = org.bouncycastle.f.k.a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(strA);
        if (this.b == 0) {
            a(stringBuffer, strA, "fullName", this.a.toString());
        } else {
            a(stringBuffer, strA, "nameRelativeToCRLIssuer", this.a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(strA);
        return stringBuffer.toString();
    }

    public static l a(ab abVar) {
        org.bouncycastle.a.o oVarA = ab.a(abVar);
        if (oVarA == null) {
            return (l) oVarA;
        }
        if (oVarA instanceof ab) {
            return new l((ab) oVarA);
        }
        throw new IllegalArgumentException("unknown object in factory: " + oVarA.getClass().getName());
    }
}
