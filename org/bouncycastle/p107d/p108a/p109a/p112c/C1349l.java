package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1418e;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1349l extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4936a = C1346i.f4928i;

    /* JADX INFO: renamed from: b */
    protected int[] f4937b;

    public C1349l(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4936a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f4937b = C1348k.m3211a(bigInteger);
    }

    protected C1349l(int[] iArr) {
        this.f4937b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1418e.m3624c(this.f4937b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4936a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1349l) {
            return AbstractC1418e.m3619a(this.f4937b, ((C1349l) obj).f4937b);
        }
        return false;
    }

    public final int hashCode() {
        return f4936a.hashCode() ^ C1535a.m4067a(this.f4937b, 5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1418e.m3618a(this.f4937b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1418e.m3622b(this.f4937b);
    }

    public C1349l() {
        this.f4937b = new int[5];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4937b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        C1348k.m3210a(this.f4937b, ((C1349l) abstractC1386g).f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[5];
        C1348k.m3209a(this.f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        C1348k.m3217d(this.f4937b, ((C1349l) abstractC1386g).f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        C1348k.m3213b(this.f4937b, ((C1349l) abstractC1386g).f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        AbstractC1415b.m3567a(C1348k.f4933a, ((C1349l) abstractC1386g).f4937b, iArr);
        C1348k.m3213b(iArr, this.f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[5];
        C1348k.m3212b(this.f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[5];
        C1348k.m3216d(this.f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[5];
        AbstractC1415b.m3567a(C1348k.f4933a, this.f4937b, iArr);
        return new C1349l(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4937b;
        if (AbstractC1418e.m3622b(iArr) || AbstractC1418e.m3618a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        C1348k.m3216d(iArr, iArr2);
        C1348k.m3213b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        C1348k.m3208a(iArr2, 2, iArr3);
        C1348k.m3213b(iArr3, iArr2, iArr3);
        C1348k.m3208a(iArr3, 4, iArr2);
        C1348k.m3213b(iArr2, iArr3, iArr2);
        C1348k.m3208a(iArr2, 8, iArr3);
        C1348k.m3213b(iArr3, iArr2, iArr3);
        C1348k.m3208a(iArr3, 16, iArr2);
        C1348k.m3213b(iArr2, iArr3, iArr2);
        C1348k.m3208a(iArr2, 32, iArr3);
        C1348k.m3213b(iArr3, iArr2, iArr3);
        C1348k.m3208a(iArr3, 64, iArr2);
        C1348k.m3213b(iArr2, iArr3, iArr2);
        C1348k.m3216d(iArr2, iArr3);
        C1348k.m3213b(iArr3, iArr, iArr3);
        C1348k.m3208a(iArr3, 29, iArr3);
        C1348k.m3216d(iArr3, iArr2);
        if (AbstractC1418e.m3619a(iArr, iArr2)) {
            return new C1349l(iArr3);
        }
        return null;
    }
}
