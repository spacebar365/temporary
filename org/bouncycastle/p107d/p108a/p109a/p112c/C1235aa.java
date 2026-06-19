package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1235aa extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4768a = C1361x.f4958i;

    /* JADX INFO: renamed from: b */
    protected int[] f4769b;

    public C1235aa(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4768a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f4769b = C1363z.m3248a(bigInteger);
    }

    protected C1235aa(int[] iArr) {
        this.f4769b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1419f.m3649c(this.f4769b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4768a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1235aa) {
            return AbstractC1419f.m3646b(this.f4769b, ((C1235aa) obj).f4769b);
        }
        return false;
    }

    public final int hashCode() {
        return f4768a.hashCode() ^ C1535a.m4067a(this.f4769b, 6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1419f.m3640a(this.f4769b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1419f.m3645b(this.f4769b);
    }

    public C1235aa() {
        this.f4769b = new int[6];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4769b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        C1363z.m3247a(this.f4769b, ((C1235aa) abstractC1386g).f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[6];
        C1363z.m3246a(this.f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        C1363z.m3254d(this.f4769b, ((C1235aa) abstractC1386g).f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        C1363z.m3250b(this.f4769b, ((C1235aa) abstractC1386g).f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        AbstractC1415b.m3567a(C1363z.f4963a, ((C1235aa) abstractC1386g).f4769b, iArr);
        C1363z.m3250b(iArr, this.f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[6];
        C1363z.m3249b(this.f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[6];
        C1363z.m3253d(this.f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[6];
        AbstractC1415b.m3567a(C1363z.f4963a, this.f4769b, iArr);
        return new C1235aa(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4769b;
        if (AbstractC1419f.m3645b(iArr) || AbstractC1419f.m3640a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        C1363z.m3253d(iArr, iArr2);
        C1363z.m3250b(iArr2, iArr, iArr2);
        C1363z.m3245a(iArr2, 2, iArr3);
        C1363z.m3250b(iArr3, iArr2, iArr3);
        C1363z.m3245a(iArr3, 4, iArr2);
        C1363z.m3250b(iArr2, iArr3, iArr2);
        C1363z.m3245a(iArr2, 8, iArr3);
        C1363z.m3250b(iArr3, iArr2, iArr3);
        C1363z.m3245a(iArr3, 16, iArr2);
        C1363z.m3250b(iArr2, iArr3, iArr2);
        C1363z.m3245a(iArr2, 32, iArr3);
        C1363z.m3250b(iArr3, iArr2, iArr3);
        C1363z.m3245a(iArr3, 64, iArr2);
        C1363z.m3250b(iArr2, iArr3, iArr2);
        C1363z.m3245a(iArr2, 62, iArr2);
        C1363z.m3253d(iArr2, iArr3);
        if (AbstractC1419f.m3646b(iArr, iArr3)) {
            return new C1235aa(iArr2);
        }
        return null;
    }
}
