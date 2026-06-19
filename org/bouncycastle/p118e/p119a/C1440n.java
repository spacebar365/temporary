package org.bouncycastle.p118e.p119a;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1440n extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final byte[] f5233a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5234b;

    private C1440n(AbstractC0723v abstractC0723v) {
        if (!C0640m.m1561a(abstractC0723v.mo1482a(0)).m1564b().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f5233a = C1535a.m4086b(C0581be.m1596a(abstractC0723v.mo1482a(1)).mo1410c());
        this.f5234b = C1535a.m4086b(C0581be.m1596a(abstractC0723v.mo1482a(2)).mo1410c());
    }

    public C1440n(byte[] bArr, byte[] bArr2) {
        this.f5233a = C1535a.m4086b(bArr);
        this.f5234b = C1535a.m4086b(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public static C1440n m3769a(Object obj) {
        if (obj != null) {
            return new C1440n(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3770a() {
        return C1535a.m4086b(this.f5233a);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3771b() {
        return C1535a.m4086b(this.f5234b);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(0L));
        c0625g.m1521a(new C0581be(this.f5233a));
        c0625g.m1521a(new C0581be(this.f5234b));
        return new C0585bi(c0625g);
    }
}
