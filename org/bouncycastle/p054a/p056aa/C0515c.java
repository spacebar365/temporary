package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0515c extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0558au f1968a;

    /* JADX INFO: renamed from: b */
    private C0640m f1969b;

    private C0515c(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        this.f1968a = C0558au.m1414a(abstractC0723v.mo1482a(0));
        this.f1969b = C0640m.m1561a(abstractC0723v.mo1482a(1));
    }

    public C0515c(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.f1968a = new C0558au(bArr);
        this.f1969b = new C0640m(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0515c m1385a(Object obj) {
        if (obj != null) {
            return new C0515c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1386a() {
        return this.f1968a.m1474d();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1387b() {
        return this.f1969b.m1565c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f1968a);
        c0625g.m1521a(this.f1969b);
        return new C0585bi(c0625g);
    }
}
