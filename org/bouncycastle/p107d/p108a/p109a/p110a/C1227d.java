package org.bouncycastle.p107d.p108a.p109a.p110a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1227d extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4754a = C1224a.f4747i;

    /* JADX INFO: renamed from: i */
    private static final int[] f4755i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* JADX INFO: renamed from: b */
    protected int[] f4756b;

    public C1227d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4754a) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f4756b = C1226c.m2920a(bigInteger);
    }

    protected C1227d(int[] iArr) {
        this.f4756b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3694c(this.f4756b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4754a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1227d) {
            return AbstractC1421h.m3696c(this.f4756b, ((C1227d) obj).f4756b);
        }
        return false;
    }

    public final int hashCode() {
        return f4754a.hashCode() ^ C1535a.m4067a(this.f4756b, 8);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3685a(this.f4756b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3691b(this.f4756b);
    }

    public C1227d() {
        this.f4756b = new int[8];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4756b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1226c.m2919a(this.f4756b, ((C1227d) abstractC1386g).f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[8];
        C1226c.m2918a(this.f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1226c.m2926d(this.f4756b, ((C1227d) abstractC1386g).f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1226c.m2922b(this.f4756b, ((C1227d) abstractC1386g).f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1226c.f4752a, ((C1227d) abstractC1386g).f4756b, iArr);
        C1226c.m2922b(iArr, this.f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[8];
        C1226c.m2921b(this.f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[8];
        C1226c.m2925d(this.f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1226c.f4752a, this.f4756b, iArr);
        return new C1227d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4756b;
        if (AbstractC1421h.m3691b(iArr) || AbstractC1421h.m3685a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        C1226c.m2925d(iArr, iArr2);
        C1226c.m2922b(iArr2, iArr, iArr2);
        C1226c.m2925d(iArr2, iArr2);
        C1226c.m2922b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        C1226c.m2925d(iArr2, iArr3);
        C1226c.m2922b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        C1226c.m2917a(iArr3, 3, iArr4);
        C1226c.m2922b(iArr4, iArr2, iArr4);
        C1226c.m2917a(iArr4, 4, iArr2);
        C1226c.m2922b(iArr2, iArr3, iArr2);
        C1226c.m2917a(iArr2, 4, iArr4);
        C1226c.m2922b(iArr4, iArr3, iArr4);
        C1226c.m2917a(iArr4, 15, iArr3);
        C1226c.m2922b(iArr3, iArr4, iArr3);
        C1226c.m2917a(iArr3, 30, iArr4);
        C1226c.m2922b(iArr4, iArr3, iArr4);
        C1226c.m2917a(iArr4, 60, iArr3);
        C1226c.m2922b(iArr3, iArr4, iArr3);
        C1226c.m2917a(iArr3, 11, iArr4);
        C1226c.m2922b(iArr4, iArr2, iArr4);
        C1226c.m2917a(iArr4, 120, iArr2);
        C1226c.m2922b(iArr2, iArr3, iArr2);
        C1226c.m2925d(iArr2, iArr2);
        C1226c.m2925d(iArr2, iArr3);
        if (AbstractC1421h.m3696c(iArr, iArr3)) {
            return new C1227d(iArr2);
        }
        C1226c.m2922b(iArr2, f4755i, iArr2);
        C1226c.m2925d(iArr2, iArr3);
        if (AbstractC1421h.m3696c(iArr, iArr3)) {
            return new C1227d(iArr2);
        }
        return null;
    }
}
