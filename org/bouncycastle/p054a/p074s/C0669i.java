package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p082z.C0769j;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0669i extends AbstractC0650o {

    /* JADX INFO: renamed from: d */
    private static final BigInteger f2597d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a */
    C0769j f2598a;

    /* JADX INFO: renamed from: b */
    byte[] f2599b;

    /* JADX INFO: renamed from: c */
    BigInteger f2600c;

    public C0669i(C0769j c0769j, byte[] bArr, int i) {
        this.f2598a = c0769j;
        this.f2599b = C1535a.m4086b(bArr);
        this.f2600c = BigInteger.valueOf(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0669i m1634a(Object obj) {
        if (obj instanceof C0669i) {
            return (C0669i) obj;
        }
        if (obj != null) {
            return new C0669i(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0769j m1635a() {
        return this.f2598a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1636b() {
        return C1535a.m4086b(this.f2599b);
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1637c() {
        return this.f2600c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2598a);
        c0625g.m1521a(new C0581be(this.f2599b));
        if (!this.f2600c.equals(f2597d)) {
            c0625g.m1521a(new C0640m(this.f2600c));
        }
        return new C0585bi(c0625g);
    }

    private C0669i(AbstractC0723v abstractC0723v) {
        InterfaceC0618f interfaceC0618fMo1482a = abstractC0723v.mo1482a(0);
        this.f2598a = interfaceC0618fMo1482a instanceof C0769j ? (C0769j) interfaceC0618fMo1482a : interfaceC0618fMo1482a != null ? new C0769j(AbstractC0723v.m1708a(interfaceC0618fMo1482a)) : null;
        this.f2599b = C1535a.m4086b(AbstractC0655q.m1596a(abstractC0723v.mo1482a(1)).mo1410c());
        if (abstractC0723v.mo1484d() == 3) {
            this.f2600c = C0640m.m1561a(abstractC0723v.mo1482a(2)).m1564b();
        } else {
            this.f2600c = f2597d;
        }
    }
}
