package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1418e;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1354q extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4946a = C1351n.f4938i;

    /* JADX INFO: renamed from: b */
    protected int[] f4947b;

    public C1354q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4946a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f4947b = C1353p.m3223a(bigInteger);
    }

    protected C1354q(int[] iArr) {
        this.f4947b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1418e.m3624c(this.f4947b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4946a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1354q) {
            return AbstractC1418e.m3619a(this.f4947b, ((C1354q) obj).f4947b);
        }
        return false;
    }

    public final int hashCode() {
        return f4946a.hashCode() ^ C1535a.m4067a(this.f4947b, 5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1418e.m3618a(this.f4947b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1418e.m3622b(this.f4947b);
    }

    public C1354q() {
        this.f4947b = new int[5];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4947b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        C1353p.m3222a(this.f4947b, ((C1354q) abstractC1386g).f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[5];
        C1353p.m3221a(this.f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        C1353p.m3229d(this.f4947b, ((C1354q) abstractC1386g).f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        C1353p.m3225b(this.f4947b, ((C1354q) abstractC1386g).f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[5];
        AbstractC1415b.m3567a(C1353p.f4943a, ((C1354q) abstractC1386g).f4947b, iArr);
        C1353p.m3225b(iArr, this.f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[5];
        C1353p.m3224b(this.f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[5];
        C1353p.m3228d(this.f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[5];
        AbstractC1415b.m3567a(C1353p.f4943a, this.f4947b, iArr);
        return new C1354q(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4947b;
        if (AbstractC1418e.m3622b(iArr) || AbstractC1418e.m3618a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        C1353p.m3228d(iArr, iArr2);
        C1353p.m3225b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        C1353p.m3228d(iArr2, iArr3);
        C1353p.m3225b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        C1353p.m3228d(iArr3, iArr4);
        C1353p.m3225b(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        C1353p.m3220a(iArr4, 3, iArr5);
        C1353p.m3225b(iArr5, iArr3, iArr5);
        C1353p.m3220a(iArr5, 7, iArr4);
        C1353p.m3225b(iArr4, iArr5, iArr4);
        C1353p.m3220a(iArr4, 3, iArr5);
        C1353p.m3225b(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        C1353p.m3220a(iArr5, 14, iArr6);
        C1353p.m3225b(iArr6, iArr4, iArr6);
        C1353p.m3220a(iArr6, 31, iArr4);
        C1353p.m3225b(iArr4, iArr6, iArr4);
        C1353p.m3220a(iArr4, 62, iArr6);
        C1353p.m3225b(iArr6, iArr4, iArr6);
        C1353p.m3220a(iArr6, 3, iArr4);
        C1353p.m3225b(iArr4, iArr3, iArr4);
        C1353p.m3220a(iArr4, 18, iArr4);
        C1353p.m3225b(iArr4, iArr5, iArr4);
        C1353p.m3220a(iArr4, 2, iArr4);
        C1353p.m3225b(iArr4, iArr, iArr4);
        C1353p.m3220a(iArr4, 3, iArr4);
        C1353p.m3225b(iArr4, iArr2, iArr4);
        C1353p.m3220a(iArr4, 6, iArr4);
        C1353p.m3225b(iArr4, iArr3, iArr4);
        C1353p.m3220a(iArr4, 2, iArr4);
        C1353p.m3225b(iArr4, iArr, iArr4);
        C1353p.m3228d(iArr4, iArr2);
        if (AbstractC1418e.m3619a(iArr, iArr2)) {
            return new C1354q(iArr4);
        }
        return null;
    }
}
