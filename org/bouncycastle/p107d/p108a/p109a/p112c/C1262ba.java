package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1423j;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C1262ba extends AbstractC1389j.b {
    public C1262ba(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1262ba(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1262ba(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1262ba(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1262ba(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1260az c1260az = (C1260az) this.f5078c;
        C1260az c1260az2 = (C1260az) this.f5079d;
        C1260az c1260az3 = (C1260az) abstractC1389j.m3463i();
        C1260az c1260az4 = (C1260az) abstractC1389j.mo3061j();
        C1260az c1260az5 = (C1260az) this.f5080e[0];
        C1260az c1260az6 = (C1260az) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean zMo2939i = c1260az5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1260az3.f4819b;
            iArr = c1260az4.f4819b;
            iArr2 = iArr9;
        } else {
            C1259ay.m3028d(c1260az5.f4819b, iArr7);
            C1259ay.m3027c(iArr7, c1260az3.f4819b, iArr6);
            C1259ay.m3027c(iArr7, c1260az5.f4819b, iArr7);
            C1259ay.m3027c(iArr7, c1260az4.f4819b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1260az6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1260az.f4819b;
            iArr3 = c1260az2.f4819b;
            iArr4 = iArr10;
        } else {
            C1259ay.m3028d(c1260az6.f4819b, iArr8);
            C1259ay.m3027c(iArr8, c1260az.f4819b, iArr5);
            C1259ay.m3027c(iArr8, c1260az6.f4819b, iArr8);
            C1259ay.m3027c(iArr8, c1260az2.f4819b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[12];
        C1259ay.m3029d(iArr4, iArr2, iArr11);
        int[] iArr12 = new int[12];
        C1259ay.m3029d(iArr3, iArr, iArr12);
        if (AbstractC1416c.m3595c(12, iArr11)) {
            return AbstractC1416c.m3595c(12, iArr12) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1259ay.m3028d(iArr11, iArr7);
        int[] iArr13 = new int[12];
        C1259ay.m3027c(iArr7, iArr11, iArr13);
        C1259ay.m3027c(iArr7, iArr4, iArr7);
        C1259ay.m3024b(iArr13, iArr13);
        AbstractC1423j.m3711a(iArr3, iArr13, iArr5);
        C1259ay.m3018a(AbstractC1416c.m3586b(12, iArr7, iArr7, iArr13), iArr13);
        C1260az c1260az7 = new C1260az(iArr8);
        C1259ay.m3028d(iArr12, c1260az7.f4819b);
        C1259ay.m3029d(c1260az7.f4819b, iArr13, c1260az7.f4819b);
        C1260az c1260az8 = new C1260az(iArr13);
        C1259ay.m3029d(iArr7, c1260az7.f4819b, c1260az8.f4819b);
        AbstractC1423j.m3711a(c1260az8.f4819b, iArr12, iArr6);
        C1259ay.m3025b(iArr5, iArr6, iArr5);
        C1259ay.m3026c(iArr5, c1260az8.f4819b);
        C1260az c1260az9 = new C1260az(iArr11);
        if (!zMo2939i) {
            C1259ay.m3027c(c1260az9.f4819b, c1260az5.f4819b, c1260az9.f4819b);
        }
        if (!zMo2939i2) {
            C1259ay.m3027c(c1260az9.f4819b, c1260az6.f4819b, c1260az9.f4819b);
        }
        return new C1262ba(abstractC1381dD, c1260az7, c1260az8, new AbstractC1386g[]{c1260az9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1260az c1260az = (C1260az) this.f5079d;
        if (c1260az.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1260az c1260az2 = (C1260az) this.f5078c;
        C1260az c1260az3 = (C1260az) this.f5080e[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        C1259ay.m3028d(c1260az.f4819b, iArr3);
        int[] iArr4 = new int[12];
        C1259ay.m3028d(iArr3, iArr4);
        boolean zMo2939i = c1260az3.mo2939i();
        int[] iArr5 = c1260az3.f4819b;
        if (!zMo2939i) {
            C1259ay.m3028d(c1260az3.f4819b, iArr2);
            iArr5 = iArr2;
        }
        C1259ay.m3029d(c1260az2.f4819b, iArr5, iArr);
        C1259ay.m3022a(c1260az2.f4819b, iArr5, iArr2);
        C1259ay.m3027c(iArr2, iArr, iArr2);
        C1259ay.m3018a(AbstractC1416c.m3586b(12, iArr2, iArr2, iArr2), iArr2);
        C1259ay.m3027c(iArr3, c1260az2.f4819b, iArr3);
        C1259ay.m3018a(AbstractC1416c.m3600e(12, iArr3, 0), iArr3);
        C1259ay.m3018a(AbstractC1416c.m3585b(12, iArr4, 0, iArr), iArr);
        C1260az c1260az4 = new C1260az(iArr4);
        C1259ay.m3028d(iArr2, c1260az4.f4819b);
        C1259ay.m3029d(c1260az4.f4819b, iArr3, c1260az4.f4819b);
        C1259ay.m3029d(c1260az4.f4819b, iArr3, c1260az4.f4819b);
        C1260az c1260az5 = new C1260az(iArr3);
        C1259ay.m3029d(iArr3, c1260az4.f4819b, c1260az5.f4819b);
        C1259ay.m3027c(c1260az5.f4819b, iArr2, c1260az5.f4819b);
        C1259ay.m3029d(c1260az5.f4819b, iArr, c1260az5.f4819b);
        C1260az c1260az6 = new C1260az(iArr2);
        C1259ay.m3030e(c1260az.f4819b, c1260az6.f4819b);
        if (!zMo2939i) {
            C1259ay.m3027c(c1260az6.f4819b, c1260az3.f4819b, c1260az6.f4819b);
        }
        return new C1262ba(abstractC1381dD, c1260az4, c1260az5, new AbstractC1386g[]{c1260az6}, this.f5081f);
    }
}
