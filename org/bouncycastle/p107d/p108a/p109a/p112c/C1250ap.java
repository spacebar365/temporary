package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C1250ap extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4799a = C1247am.f4791i;

    /* JADX INFO: renamed from: b */
    protected int[] f4800b;

    public C1250ap(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4799a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f4800b = C1249ao.m2997a(bigInteger);
    }

    protected C1250ap(int[] iArr) {
        this.f4800b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3694c(this.f4800b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4799a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1250ap) {
            return AbstractC1421h.m3696c(this.f4800b, ((C1250ap) obj).f4800b);
        }
        return false;
    }

    public final int hashCode() {
        return f4799a.hashCode() ^ C1535a.m4067a(this.f4800b, 8);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3685a(this.f4800b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3691b(this.f4800b);
    }

    public C1250ap() {
        this.f4800b = new int[8];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4800b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1249ao.m2996a(this.f4800b, ((C1250ap) abstractC1386g).f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[8];
        C1249ao.m2995a(this.f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1249ao.m3003d(this.f4800b, ((C1250ap) abstractC1386g).f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1249ao.m2999b(this.f4800b, ((C1250ap) abstractC1386g).f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1249ao.f4796a, ((C1250ap) abstractC1386g).f4800b, iArr);
        C1249ao.m2999b(iArr, this.f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[8];
        C1249ao.m2998b(this.f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[8];
        C1249ao.m3002d(this.f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1249ao.f4796a, this.f4800b, iArr);
        return new C1250ap(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4800b;
        if (AbstractC1421h.m3691b(iArr) || AbstractC1421h.m3685a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        C1249ao.m3002d(iArr, iArr2);
        C1249ao.m2999b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        C1249ao.m3002d(iArr2, iArr3);
        C1249ao.m2999b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        C1249ao.m2994a(iArr3, 3, iArr4);
        C1249ao.m2999b(iArr4, iArr3, iArr4);
        C1249ao.m2994a(iArr4, 3, iArr4);
        C1249ao.m2999b(iArr4, iArr3, iArr4);
        C1249ao.m2994a(iArr4, 2, iArr4);
        C1249ao.m2999b(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        C1249ao.m2994a(iArr4, 11, iArr5);
        C1249ao.m2999b(iArr5, iArr4, iArr5);
        C1249ao.m2994a(iArr5, 22, iArr4);
        C1249ao.m2999b(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        C1249ao.m2994a(iArr4, 44, iArr6);
        C1249ao.m2999b(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        C1249ao.m2994a(iArr6, 88, iArr7);
        C1249ao.m2999b(iArr7, iArr6, iArr7);
        C1249ao.m2994a(iArr7, 44, iArr6);
        C1249ao.m2999b(iArr6, iArr4, iArr6);
        C1249ao.m2994a(iArr6, 3, iArr4);
        C1249ao.m2999b(iArr4, iArr3, iArr4);
        C1249ao.m2994a(iArr4, 23, iArr4);
        C1249ao.m2999b(iArr4, iArr5, iArr4);
        C1249ao.m2994a(iArr4, 6, iArr4);
        C1249ao.m2999b(iArr4, iArr2, iArr4);
        C1249ao.m2994a(iArr4, 2, iArr4);
        C1249ao.m3002d(iArr4, iArr2);
        if (AbstractC1421h.m3696c(iArr, iArr2)) {
            return new C1250ap(iArr4);
        }
        return null;
    }
}
