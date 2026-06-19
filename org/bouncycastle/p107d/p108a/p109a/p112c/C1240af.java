package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1420g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.af */
/* JADX INFO: loaded from: classes.dex */
public final class C1240af extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4778a = C1237ac.f4770i;

    /* JADX INFO: renamed from: i */
    private static final int[] f4779i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* JADX INFO: renamed from: b */
    protected int[] f4780b;

    public C1240af(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4778a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f4780b = C1239ae.m2969a(bigInteger);
    }

    protected C1240af(int[] iArr) {
        this.f4780b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1420g.m3670c(this.f4780b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4778a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1240af) {
            return AbstractC1420g.m3669b(this.f4780b, ((C1240af) obj).f4780b);
        }
        return false;
    }

    public final int hashCode() {
        return f4778a.hashCode() ^ C1535a.m4067a(this.f4780b, 7);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1420g.m3665a(this.f4780b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1420g.m3668b(this.f4780b);
    }

    public C1240af() {
        this.f4780b = new int[7];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4780b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        C1239ae.m2968a(this.f4780b, ((C1240af) abstractC1386g).f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[7];
        C1239ae.m2967a(this.f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        C1239ae.m2975d(this.f4780b, ((C1240af) abstractC1386g).f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        C1239ae.m2971b(this.f4780b, ((C1240af) abstractC1386g).f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        AbstractC1415b.m3567a(C1239ae.f4775a, ((C1240af) abstractC1386g).f4780b, iArr);
        C1239ae.m2971b(iArr, this.f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[7];
        C1239ae.m2970b(this.f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[7];
        C1239ae.m2974d(this.f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[7];
        AbstractC1415b.m3567a(C1239ae.f4775a, this.f4780b, iArr);
        return new C1240af(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4780b;
        if (AbstractC1420g.m3668b(iArr) || AbstractC1420g.m3665a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        C1239ae.m2974d(iArr, iArr2);
        C1239ae.m2971b(iArr2, iArr, iArr2);
        C1239ae.m2974d(iArr2, iArr2);
        C1239ae.m2971b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        C1239ae.m2974d(iArr2, iArr3);
        C1239ae.m2971b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        C1239ae.m2966a(iArr3, 4, iArr4);
        C1239ae.m2971b(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        C1239ae.m2966a(iArr4, 3, iArr5);
        C1239ae.m2971b(iArr5, iArr2, iArr5);
        C1239ae.m2966a(iArr5, 8, iArr5);
        C1239ae.m2971b(iArr5, iArr4, iArr5);
        C1239ae.m2966a(iArr5, 4, iArr4);
        C1239ae.m2971b(iArr4, iArr3, iArr4);
        C1239ae.m2966a(iArr4, 19, iArr3);
        C1239ae.m2971b(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        C1239ae.m2966a(iArr3, 42, iArr6);
        C1239ae.m2971b(iArr6, iArr3, iArr6);
        C1239ae.m2966a(iArr6, 23, iArr3);
        C1239ae.m2971b(iArr3, iArr4, iArr3);
        C1239ae.m2966a(iArr3, 84, iArr4);
        C1239ae.m2971b(iArr4, iArr6, iArr4);
        C1239ae.m2966a(iArr4, 20, iArr4);
        C1239ae.m2971b(iArr4, iArr5, iArr4);
        C1239ae.m2966a(iArr4, 3, iArr4);
        C1239ae.m2971b(iArr4, iArr, iArr4);
        C1239ae.m2966a(iArr4, 2, iArr4);
        C1239ae.m2971b(iArr4, iArr, iArr4);
        C1239ae.m2966a(iArr4, 4, iArr4);
        C1239ae.m2971b(iArr4, iArr2, iArr4);
        C1239ae.m2974d(iArr4, iArr4);
        C1239ae.m2974d(iArr4, iArr6);
        if (AbstractC1420g.m3669b(iArr, iArr6)) {
            return new C1240af(iArr4);
        }
        C1239ae.m2971b(iArr4, f4779i, iArr4);
        C1239ae.m2974d(iArr4, iArr6);
        if (AbstractC1420g.m3669b(iArr, iArr6)) {
            return new C1240af(iArr4);
        }
        return null;
    }
}
