package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1359v extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4956a = C1356s.f4948i;

    /* JADX INFO: renamed from: b */
    protected int[] f4957b;

    public C1359v(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4956a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f4957b = C1358u.m3235a(bigInteger);
    }

    protected C1359v(int[] iArr) {
        this.f4957b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1419f.m3649c(this.f4957b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4956a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1359v) {
            return AbstractC1419f.m3646b(this.f4957b, ((C1359v) obj).f4957b);
        }
        return false;
    }

    public final int hashCode() {
        return f4956a.hashCode() ^ C1535a.m4067a(this.f4957b, 6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1419f.m3640a(this.f4957b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1419f.m3645b(this.f4957b);
    }

    public C1359v() {
        this.f4957b = new int[6];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4957b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        C1358u.m3234a(this.f4957b, ((C1359v) abstractC1386g).f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[6];
        C1358u.m3233a(this.f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        C1358u.m3241d(this.f4957b, ((C1359v) abstractC1386g).f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        C1358u.m3237b(this.f4957b, ((C1359v) abstractC1386g).f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[6];
        AbstractC1415b.m3567a(C1358u.f4953a, ((C1359v) abstractC1386g).f4957b, iArr);
        C1358u.m3237b(iArr, this.f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[6];
        C1358u.m3236b(this.f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[6];
        C1358u.m3240d(this.f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[6];
        AbstractC1415b.m3567a(C1358u.f4953a, this.f4957b, iArr);
        return new C1359v(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4957b;
        if (AbstractC1419f.m3645b(iArr) || AbstractC1419f.m3640a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        C1358u.m3240d(iArr, iArr2);
        C1358u.m3237b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        C1358u.m3240d(iArr2, iArr3);
        C1358u.m3237b(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        C1358u.m3232a(iArr3, 3, iArr4);
        C1358u.m3237b(iArr4, iArr3, iArr4);
        C1358u.m3232a(iArr4, 2, iArr4);
        C1358u.m3237b(iArr4, iArr2, iArr4);
        C1358u.m3232a(iArr4, 8, iArr2);
        C1358u.m3237b(iArr2, iArr4, iArr2);
        C1358u.m3232a(iArr2, 3, iArr4);
        C1358u.m3237b(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        C1358u.m3232a(iArr4, 16, iArr5);
        C1358u.m3237b(iArr5, iArr2, iArr5);
        C1358u.m3232a(iArr5, 35, iArr2);
        C1358u.m3237b(iArr2, iArr5, iArr2);
        C1358u.m3232a(iArr2, 70, iArr5);
        C1358u.m3237b(iArr5, iArr2, iArr5);
        C1358u.m3232a(iArr5, 19, iArr2);
        C1358u.m3237b(iArr2, iArr4, iArr2);
        C1358u.m3232a(iArr2, 20, iArr2);
        C1358u.m3237b(iArr2, iArr4, iArr2);
        C1358u.m3232a(iArr2, 4, iArr2);
        C1358u.m3237b(iArr2, iArr3, iArr2);
        C1358u.m3232a(iArr2, 6, iArr2);
        C1358u.m3237b(iArr2, iArr3, iArr2);
        C1358u.m3240d(iArr2, iArr2);
        C1358u.m3240d(iArr2, iArr3);
        if (AbstractC1419f.m3646b(iArr, iArr3)) {
            return new C1359v(iArr2);
        }
        return null;
    }
}
