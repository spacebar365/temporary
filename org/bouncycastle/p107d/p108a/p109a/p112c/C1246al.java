package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1420g;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.al */
/* JADX INFO: loaded from: classes.dex */
public final class C1246al extends AbstractC1389j.b {
    public C1246al(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1246al(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1246al(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2, abstractC1386gArr);
        this.f5081f = z;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: d */
    public final AbstractC1389j mo2947d(AbstractC1389j abstractC1389j) {
        return this == abstractC1389j ? mo2951u() : !m3469p() ? abstractC1389j.m3469p() ? mo2950t() : !this.f5079d.mo2940j() ? mo2950t().mo2946b(abstractC1389j) : abstractC1389j : abstractC1389j;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: e */
    protected final AbstractC1389j mo2948e() {
        return new C1246al(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1246al(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: u */
    public final AbstractC1389j mo2951u() {
        return (m3469p() || this.f5079d.mo2940j()) ? this : mo2950t().mo2946b(this);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: b */
    public final AbstractC1389j mo2946b(AbstractC1389j abstractC1389j) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (m3469p()) {
            return abstractC1389j;
        }
        if (abstractC1389j.m3469p()) {
            return this;
        }
        if (this == abstractC1389j) {
            return mo2950t();
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1245ak c1245ak = (C1245ak) this.f5078c;
        C1245ak c1245ak2 = (C1245ak) this.f5079d;
        C1245ak c1245ak3 = (C1245ak) abstractC1389j.m3463i();
        C1245ak c1245ak4 = (C1245ak) abstractC1389j.mo3061j();
        C1245ak c1245ak5 = (C1245ak) this.f5080e[0];
        C1245ak c1245ak6 = (C1245ak) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zMo2939i = c1245ak5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1245ak3.f4790b;
            iArr = c1245ak4.f4790b;
            iArr2 = iArr9;
        } else {
            C1244aj.m2987d(c1245ak5.f4790b, iArr7);
            C1244aj.m2984b(iArr7, c1245ak3.f4790b, iArr6);
            C1244aj.m2984b(iArr7, c1245ak5.f4790b, iArr7);
            C1244aj.m2984b(iArr7, c1245ak4.f4790b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1245ak6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1245ak.f4790b;
            iArr3 = c1245ak2.f4790b;
            iArr4 = iArr10;
        } else {
            C1244aj.m2987d(c1245ak6.f4790b, iArr8);
            C1244aj.m2984b(iArr8, c1245ak.f4790b, iArr5);
            C1244aj.m2984b(iArr8, c1245ak6.f4790b, iArr8);
            C1244aj.m2984b(iArr8, c1245ak2.f4790b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[7];
        C1244aj.m2988d(iArr4, iArr2, iArr11);
        C1244aj.m2988d(iArr3, iArr, iArr6);
        if (AbstractC1420g.m3668b(iArr11)) {
            return AbstractC1420g.m3668b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1244aj.m2987d(iArr11, iArr7);
        int[] iArr12 = new int[7];
        C1244aj.m2984b(iArr7, iArr11, iArr12);
        C1244aj.m2984b(iArr7, iArr4, iArr7);
        C1244aj.m2983b(iArr12, iArr12);
        AbstractC1420g.m3671c(iArr3, iArr12, iArr5);
        C1244aj.m2977a(AbstractC1420g.m3667b(iArr7, iArr7, iArr12), iArr12);
        C1245ak c1245ak7 = new C1245ak(iArr8);
        C1244aj.m2987d(iArr6, c1245ak7.f4790b);
        C1244aj.m2988d(c1245ak7.f4790b, iArr12, c1245ak7.f4790b);
        C1245ak c1245ak8 = new C1245ak(iArr12);
        C1244aj.m2988d(iArr7, c1245ak7.f4790b, c1245ak8.f4790b);
        C1244aj.m2986c(c1245ak8.f4790b, iArr6, iArr5);
        C1244aj.m2985c(iArr5, c1245ak8.f4790b);
        C1245ak c1245ak9 = new C1245ak(iArr11);
        if (!zMo2939i) {
            C1244aj.m2984b(c1245ak9.f4790b, c1245ak5.f4790b, c1245ak9.f4790b);
        }
        if (!zMo2939i2) {
            C1244aj.m2984b(c1245ak9.f4790b, c1245ak6.f4790b, c1245ak9.f4790b);
        }
        return new C1246al(abstractC1381dD, c1245ak7, c1245ak8, new AbstractC1386g[]{c1245ak9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1245ak c1245ak = (C1245ak) this.f5079d;
        if (c1245ak.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1245ak c1245ak2 = (C1245ak) this.f5078c;
        C1245ak c1245ak3 = (C1245ak) this.f5080e[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        C1244aj.m2987d(c1245ak.f4790b, iArr3);
        int[] iArr4 = new int[7];
        C1244aj.m2987d(iArr3, iArr4);
        boolean zMo2939i = c1245ak3.mo2939i();
        int[] iArr5 = c1245ak3.f4790b;
        if (!zMo2939i) {
            C1244aj.m2987d(c1245ak3.f4790b, iArr2);
            iArr5 = iArr2;
        }
        C1244aj.m2988d(c1245ak2.f4790b, iArr5, iArr);
        C1244aj.m2981a(c1245ak2.f4790b, iArr5, iArr2);
        C1244aj.m2984b(iArr2, iArr, iArr2);
        C1244aj.m2977a(AbstractC1420g.m3667b(iArr2, iArr2, iArr2), iArr2);
        C1244aj.m2984b(iArr3, c1245ak2.f4790b, iArr3);
        C1244aj.m2977a(AbstractC1416c.m3600e(7, iArr3, 0), iArr3);
        C1244aj.m2977a(AbstractC1416c.m3585b(7, iArr4, 0, iArr), iArr);
        C1245ak c1245ak4 = new C1245ak(iArr4);
        C1244aj.m2987d(iArr2, c1245ak4.f4790b);
        C1244aj.m2988d(c1245ak4.f4790b, iArr3, c1245ak4.f4790b);
        C1244aj.m2988d(c1245ak4.f4790b, iArr3, c1245ak4.f4790b);
        C1245ak c1245ak5 = new C1245ak(iArr3);
        C1244aj.m2988d(iArr3, c1245ak4.f4790b, c1245ak5.f4790b);
        C1244aj.m2984b(c1245ak5.f4790b, iArr2, c1245ak5.f4790b);
        C1244aj.m2988d(c1245ak5.f4790b, iArr, c1245ak5.f4790b);
        C1245ak c1245ak6 = new C1245ak(iArr2);
        C1244aj.m2989e(c1245ak.f4790b, c1245ak6.f4790b);
        if (!zMo2939i) {
            C1244aj.m2984b(c1245ak6.f4790b, c1245ak3.f4790b, c1245ak6.f4790b);
        }
        return new C1246al(abstractC1381dD, c1245ak4, c1245ak5, new AbstractC1386g[]{c1245ak6}, this.f5081f);
    }
}
