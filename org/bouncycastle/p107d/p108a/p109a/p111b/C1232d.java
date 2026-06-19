package org.bouncycastle.p107d.p108a.p109a.p111b;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1232d extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4764a = C1229a.f4757i;

    /* JADX INFO: renamed from: b */
    protected int[] f4765b;

    public C1232d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4764a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f4765b = C1231c.m2957a(bigInteger);
    }

    protected C1232d(int[] iArr) {
        this.f4765b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3694c(this.f4765b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4764a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1232d) {
            return AbstractC1421h.m3696c(this.f4765b, ((C1232d) obj).f4765b);
        }
        return false;
    }

    public final int hashCode() {
        return f4764a.hashCode() ^ C1535a.m4067a(this.f4765b, 8);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3685a(this.f4765b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3691b(this.f4765b);
    }

    public C1232d() {
        this.f4765b = new int[8];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4765b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1231c.m2956a(this.f4765b, ((C1232d) abstractC1386g).f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[8];
        C1231c.m2955a(this.f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1231c.m2963d(this.f4765b, ((C1232d) abstractC1386g).f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1231c.m2959b(this.f4765b, ((C1232d) abstractC1386g).f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1231c.f4762a, ((C1232d) abstractC1386g).f4765b, iArr);
        C1231c.m2959b(iArr, this.f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[8];
        C1231c.m2958b(this.f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[8];
        C1231c.m2962d(this.f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1231c.f4762a, this.f4765b, iArr);
        return new C1232d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4765b;
        if (AbstractC1421h.m3691b(iArr) || AbstractC1421h.m3685a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        C1231c.m2962d(iArr, iArr2);
        C1231c.m2959b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        C1231c.m2954a(iArr2, 2, iArr3);
        C1231c.m2959b(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        C1231c.m2954a(iArr3, 2, iArr4);
        C1231c.m2959b(iArr4, iArr2, iArr4);
        C1231c.m2954a(iArr4, 6, iArr2);
        C1231c.m2959b(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        C1231c.m2954a(iArr2, 12, iArr5);
        C1231c.m2959b(iArr5, iArr2, iArr5);
        C1231c.m2954a(iArr5, 6, iArr2);
        C1231c.m2959b(iArr2, iArr4, iArr2);
        C1231c.m2962d(iArr2, iArr4);
        C1231c.m2959b(iArr4, iArr, iArr4);
        C1231c.m2954a(iArr4, 31, iArr5);
        C1231c.m2959b(iArr5, iArr4, iArr2);
        C1231c.m2954a(iArr5, 32, iArr5);
        C1231c.m2959b(iArr5, iArr2, iArr5);
        C1231c.m2954a(iArr5, 62, iArr5);
        C1231c.m2959b(iArr5, iArr2, iArr5);
        C1231c.m2954a(iArr5, 4, iArr5);
        C1231c.m2959b(iArr5, iArr3, iArr5);
        C1231c.m2954a(iArr5, 32, iArr5);
        C1231c.m2959b(iArr5, iArr, iArr5);
        C1231c.m2954a(iArr5, 62, iArr5);
        C1231c.m2962d(iArr5, iArr3);
        if (AbstractC1421h.m3696c(iArr, iArr3)) {
            return new C1232d(iArr5);
        }
        return null;
    }
}
