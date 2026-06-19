package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bp */
/* JADX INFO: loaded from: classes.dex */
public final class C1277bp extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4841a;

    public C1277bp(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f4841a = C1276bo.m3068a(bigInteger);
    }

    protected C1277bp(long[] jArr) {
        this.f4841a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1419f.m3650c(this.f4841a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 131;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        return mo2929a(abstractC1386g);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        return this;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        return mo2933c(abstractC1386g.mo2937f());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1277bp) {
            return AbstractC1419f.m3642a(this.f4841a, ((C1277bp) obj).f4841a);
        }
        return false;
    }

    public final int hashCode() {
        return 131832 ^ C1535a.m4068a(this.f4841a, 3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1419f.m3641a(this.f4841a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1419f.m3647b(this.f4841a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4841a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return C1276bo.m3063a(this.f4841a);
    }

    public C1277bp() {
        this.f4841a = new long[3];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[3];
        C1276bo.m3067a(this.f4841a, ((C1277bp) abstractC1386g).f4841a, jArr);
        return new C1277bp(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = new long[3];
        C1276bo.m3066a(this.f4841a, jArr);
        return new C1277bp(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[3];
        C1276bo.m3071b(this.f4841a, ((C1277bp) abstractC1386g).f4841a, jArr);
        return new C1277bp(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4841a;
        long[] jArr2 = ((C1277bp) abstractC1386g).f4841a;
        long[] jArr3 = ((C1277bp) abstractC1386g2).f4841a;
        long[] jArr4 = ((C1277bp) abstractC1386g3).f4841a;
        long[] jArr5 = new long[5];
        C1276bo.m3073c(jArr, jArr2, jArr5);
        C1276bo.m3073c(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        C1276bo.m3072c(jArr5, jArr6);
        return new C1277bp(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[3];
        C1276bo.m3076e(this.f4841a, jArr);
        return new C1277bp(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4841a;
        long[] jArr2 = ((C1277bp) abstractC1386g).f4841a;
        long[] jArr3 = ((C1277bp) abstractC1386g2).f4841a;
        long[] jArr4 = new long[5];
        C1276bo.m3078f(jArr, jArr4);
        C1276bo.m3073c(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[3];
        C1276bo.m3072c(jArr4, jArr5);
        return new C1277bp(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[3];
        C1276bo.m3065a(this.f4841a, i, jArr);
        return new C1277bp(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[3];
        C1276bo.m3070b(this.f4841a, jArr);
        return new C1277bp(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = new long[3];
        C1276bo.m3074d(this.f4841a, jArr);
        return new C1277bp(jArr);
    }
}
