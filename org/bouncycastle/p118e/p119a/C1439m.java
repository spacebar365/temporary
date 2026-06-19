package org.bouncycastle.p118e.p119a;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1439m extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final int f5227a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5228b;

    /* JADX INFO: renamed from: c */
    private final byte[] f5229c;

    /* JADX INFO: renamed from: d */
    private final byte[] f5230d;

    /* JADX INFO: renamed from: e */
    private final byte[] f5231e;

    /* JADX INFO: renamed from: f */
    private final byte[] f5232f;

    public C1439m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f5227a = i;
        this.f5228b = C1535a.m4086b(bArr);
        this.f5229c = C1535a.m4086b(bArr2);
        this.f5230d = C1535a.m4086b(bArr3);
        this.f5231e = C1535a.m4086b(bArr4);
        this.f5232f = C1535a.m4086b(bArr5);
    }

    private C1439m(AbstractC0723v abstractC0723v) {
        if (!C0640m.m1561a(abstractC0723v.mo1482a(0)).m1564b().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        if (abstractC0723v.mo1484d() != 2 && abstractC0723v.mo1484d() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(abstractC0723v.mo1482a(1));
        this.f5227a = C0640m.m1561a(abstractC0723vM1708a.mo1482a(0)).m1564b().intValue();
        this.f5228b = C1535a.m4086b(C0581be.m1596a(abstractC0723vM1708a.mo1482a(1)).mo1410c());
        this.f5229c = C1535a.m4086b(C0581be.m1596a(abstractC0723vM1708a.mo1482a(2)).mo1410c());
        this.f5230d = C1535a.m4086b(C0581be.m1596a(abstractC0723vM1708a.mo1482a(3)).mo1410c());
        this.f5231e = C1535a.m4086b(C0581be.m1596a(abstractC0723vM1708a.mo1482a(4)).mo1410c());
        if (abstractC0723v.mo1484d() == 3) {
            this.f5232f = C1535a.m4086b(C0581be.m1597a(AbstractC0539ab.m1394a(abstractC0723v.mo1482a(2)), true).mo1410c());
        } else {
            this.f5232f = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1439m m3762a(Object obj) {
        if (obj instanceof C1439m) {
            return (C1439m) obj;
        }
        if (obj != null) {
            return new C1439m(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3763a() {
        return this.f5227a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3764b() {
        return C1535a.m4086b(this.f5228b);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3765c() {
        return C1535a.m4086b(this.f5229c);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m3766d() {
        return C1535a.m4086b(this.f5230d);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m3767e() {
        return C1535a.m4086b(this.f5231e);
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m3768f() {
        return C1535a.m4086b(this.f5232f);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(0L));
        C0625g c0625g2 = new C0625g();
        c0625g2.m1521a(new C0640m(this.f5227a));
        c0625g2.m1521a(new C0581be(this.f5228b));
        c0625g2.m1521a(new C0581be(this.f5229c));
        c0625g2.m1521a(new C0581be(this.f5230d));
        c0625g2.m1521a(new C0581be(this.f5231e));
        c0625g.m1521a(new C0585bi(c0625g2));
        c0625g.m1521a(new C0590bn(true, 0, new C0581be(this.f5232f)));
        return new C0585bi(c0625g);
    }
}
