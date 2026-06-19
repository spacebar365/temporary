package org.bouncycastle.p054a.p082z;

import java.io.IOException;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0578bb;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0616e;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p080y.C0756c;

/* JADX INFO: renamed from: org.bouncycastle.a.z.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0774o extends AbstractC0650o implements InterfaceC0616e {

    /* JADX INFO: renamed from: a */
    private InterfaceC0618f f3204a;

    /* JADX INFO: renamed from: b */
    private int f3205b;

    private C0774o(int i, InterfaceC0618f interfaceC0618f) {
        this.f3204a = interfaceC0618f;
        this.f3205b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C0774o m1831a(Object obj) {
        if (obj == null || (obj instanceof C0774o)) {
            return (C0774o) obj;
        }
        if (obj instanceof AbstractC0539ab) {
            AbstractC0539ab abstractC0539ab = (AbstractC0539ab) obj;
            int iM1396b = abstractC0539ab.m1396b();
            switch (iM1396b) {
                case 0:
                    return new C0774o(iM1396b, AbstractC0723v.m1709a(abstractC0539ab, false));
                case 1:
                    return new C0774o(iM1396b, C0578bb.m1458a(abstractC0539ab));
                case 2:
                    return new C0774o(iM1396b, C0578bb.m1458a(abstractC0539ab));
                case 3:
                    throw new IllegalArgumentException("unknown tag: ".concat(String.valueOf(iM1396b)));
                case 4:
                    return new C0774o(iM1396b, C0756c.m1775a(abstractC0539ab));
                case 5:
                    return new C0774o(iM1396b, AbstractC0723v.m1709a(abstractC0539ab, false));
                case 6:
                    return new C0774o(iM1396b, C0578bb.m1458a(abstractC0539ab));
                case 7:
                    return new C0774o(iM1396b, AbstractC0655q.m1597a(abstractC0539ab, false));
                case 8:
                    return new C0774o(iM1396b, C0653p.m1585a(abstractC0539ab, false));
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return m1831a(AbstractC0686u.m1692b((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("unable to parse encoded general name");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1832a() {
        return this.f3205b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1833b() {
        return this.f3204a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3205b == 4 ? new C0590bn(true, this.f3205b, this.f3204a) : new C0590bn(false, this.f3205b, this.f3204a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f3205b);
        stringBuffer.append(": ");
        switch (this.f3205b) {
            case 1:
            case 2:
            case 6:
                stringBuffer.append(C0578bb.m1457a(this.f3204a).mo1350b());
                break;
            case 3:
            case 5:
            default:
                stringBuffer.append(this.f3204a.toString());
                break;
            case 4:
                stringBuffer.append(C0756c.m1774a(this.f3204a).toString());
                break;
        }
        return stringBuffer.toString();
    }
}
