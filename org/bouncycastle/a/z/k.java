package org.bouncycastle.a.z;

import org.bouncycastle.a.ab;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class k extends org.bouncycastle.a.o {
    l a;
    s b;
    p c;

    public k(org.bouncycastle.a.v vVar) {
        for (int i = 0; i != vVar.d(); i++) {
            ab abVarA = ab.a(vVar.a(i));
            switch (abVarA.b()) {
                case 0:
                    this.a = l.a(abVarA);
                    break;
                case 1:
                    this.b = new s(au.a(abVarA, false));
                    break;
                case 2:
                    this.c = p.a(abVarA);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + abVarA.b());
            }
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
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(new bn(this.a));
        }
        if (this.b != null) {
            gVar.a(new bn(false, 1, this.b));
        }
        if (this.c != null) {
            gVar.a(new bn(false, 2, this.c));
        }
        return new bi(gVar);
    }

    public final String toString() {
        String strA = org.bouncycastle.f.k.a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(strA);
        if (this.a != null) {
            a(stringBuffer, strA, "distributionPoint", this.a.toString());
        }
        if (this.b != null) {
            a(stringBuffer, strA, "reasons", this.b.toString());
        }
        if (this.c != null) {
            a(stringBuffer, strA, "cRLIssuer", this.c.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(strA);
        return stringBuffer.toString();
    }
}
