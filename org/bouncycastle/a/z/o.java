package org.bouncycastle.a.z;

import java.io.IOException;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.bb;
import org.bouncycastle.a.bn;

/* JADX INFO: loaded from: classes.dex */
public final class o extends org.bouncycastle.a.o implements org.bouncycastle.a.e {
    private org.bouncycastle.a.f a;
    private int b;

    private o(int i, org.bouncycastle.a.f fVar) {
        this.a = fVar;
        this.b = i;
    }

    public static o a(Object obj) {
        if (obj == null || (obj instanceof o)) {
            return (o) obj;
        }
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            int iB = abVar.b();
            switch (iB) {
                case 0:
                    return new o(iB, org.bouncycastle.a.v.a(abVar, false));
                case 1:
                    return new o(iB, bb.a(abVar));
                case 2:
                    return new o(iB, bb.a(abVar));
                case 3:
                    throw new IllegalArgumentException("unknown tag: ".concat(String.valueOf(iB)));
                case 4:
                    return new o(iB, org.bouncycastle.a.y.c.a(abVar));
                case 5:
                    return new o(iB, org.bouncycastle.a.v.a(abVar, false));
                case 6:
                    return new o(iB, bb.a(abVar));
                case 7:
                    return new o(iB, org.bouncycastle.a.q.a(abVar, false));
                case 8:
                    return new o(iB, org.bouncycastle.a.p.a(abVar, false));
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return a(org.bouncycastle.a.u.b((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to parse encoded general name");
        }
    }

    public final int a() {
        return this.b;
    }

    public final org.bouncycastle.a.f b() {
        return this.a;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.b == 4 ? new bn(true, this.b, this.a) : new bn(false, this.b, this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(": ");
        switch (this.b) {
            case 1:
            case 2:
            case 6:
                stringBuffer.append(bb.a(this.a).b());
                break;
            case 3:
            case 5:
            default:
                stringBuffer.append(this.a.toString());
                break;
            case 4:
                stringBuffer.append(org.bouncycastle.a.y.c.a(this.a).toString());
                break;
        }
        return stringBuffer.toString();
    }
}
