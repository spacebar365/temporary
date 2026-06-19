package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.be */
/* JADX INFO: loaded from: classes.dex */
public final class C1266be extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4829a = C1263bb.f4823i;

    /* JADX INFO: renamed from: b */
    protected int[] f4830b;

    public C1266be(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4829a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f4830b = C1265bd.m3035a(bigInteger);
    }

    protected C1266be(int[] iArr) {
        this.f4830b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1416c.m3599d(17, this.f4830b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4829a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1266be) {
            return AbstractC1416c.m3590b(17, this.f4830b, ((C1266be) obj).f4830b);
        }
        return false;
    }

    public final int hashCode() {
        return f4829a.hashCode() ^ C1535a.m4067a(this.f4830b, 17);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1416c.m3589b(17, this.f4830b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1416c.m3595c(17, this.f4830b);
    }

    public C1266be() {
        this.f4830b = new int[17];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4830b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[17];
        C1265bd.m3034a(this.f4830b, ((C1266be) abstractC1386g).f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[17];
        C1265bd.m3033a(this.f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[17];
        C1265bd.m3039c(this.f4830b, ((C1266be) abstractC1386g).f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[17];
        C1265bd.m3037b(this.f4830b, ((C1266be) abstractC1386g).f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[17];
        AbstractC1415b.m3567a(C1265bd.f4828a, ((C1266be) abstractC1386g).f4830b, iArr);
        C1265bd.m3037b(iArr, this.f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[17];
        C1265bd.m3036b(this.f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[17];
        C1265bd.m3038c(this.f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[17];
        AbstractC1415b.m3567a(C1265bd.f4828a, this.f4830b, iArr);
        return new C1266be(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4830b;
        if (AbstractC1416c.m3595c(17, iArr) || AbstractC1416c.m3589b(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        C1265bd.m3032a(iArr, 519, iArr2);
        C1265bd.m3038c(iArr2, iArr3);
        if (AbstractC1416c.m3590b(17, iArr, iArr3)) {
            return new C1266be(iArr2);
        }
        return null;
    }
}
