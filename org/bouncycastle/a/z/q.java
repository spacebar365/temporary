package org.bouncycastle.a.z;

import org.bouncycastle.a.ab;

/* JADX INFO: loaded from: classes.dex */
public final class q extends org.bouncycastle.a.o {
    private l a;
    private boolean b;
    private boolean c;
    private s d;
    private boolean e;
    private boolean f;
    private org.bouncycastle.a.v g;

    private q(org.bouncycastle.a.v vVar) {
        this.g = vVar;
        for (int i = 0; i != vVar.d(); i++) {
            ab abVarA = ab.a(vVar.a(i));
            switch (abVarA.b()) {
                case 0:
                    this.a = l.a(abVarA);
                    break;
                case 1:
                    this.b = org.bouncycastle.a.d.a(abVarA).b();
                    break;
                case 2:
                    this.c = org.bouncycastle.a.d.a(abVarA).b();
                    break;
                case 3:
                    this.d = new s(s.a(abVarA, false));
                    break;
                case 4:
                    this.e = org.bouncycastle.a.d.a(abVarA).b();
                    break;
                case 5:
                    this.f = org.bouncycastle.a.d.a(abVarA).b();
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
            }
        }
    }

    private static String a(boolean z) {
        return z ? "true" : "false";
    }

    public static q a(Object obj) {
        if (obj instanceof q) {
            return (q) obj;
        }
        if (obj != null) {
            return new q(org.bouncycastle.a.v.a(obj));
        }
        return null;
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

    public final boolean a() {
        return this.e;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.g;
    }

    public final String toString() {
        String strA = org.bouncycastle.f.k.a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(strA);
        if (this.a != null) {
            a(stringBuffer, strA, "distributionPoint", this.a.toString());
        }
        if (this.b) {
            a(stringBuffer, strA, "onlyContainsUserCerts", a(this.b));
        }
        if (this.c) {
            a(stringBuffer, strA, "onlyContainsCACerts", a(this.c));
        }
        if (this.d != null) {
            a(stringBuffer, strA, "onlySomeReasons", this.d.toString());
        }
        if (this.f) {
            a(stringBuffer, strA, "onlyContainsAttributeCerts", a(this.f));
        }
        if (this.e) {
            a(stringBuffer, strA, "indirectCRL", a(this.e));
        }
        stringBuffer.append("]");
        stringBuffer.append(strA);
        return stringBuffer.toString();
    }
}
