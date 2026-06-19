package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p107d.p117c.C1414a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ci */
/* JADX INFO: loaded from: classes.dex */
public final class C1297ci extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4867a;

    public C1297ci(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f4867a = C1296ch.m3116a(bigInteger);
    }

    protected C1297ci(long[] jArr) {
        this.f4867a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3695c(this.f4867a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 193;
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
        if (obj instanceof C1297ci) {
            return AbstractC1421h.m3687a(this.f4867a, ((C1297ci) obj).f4867a);
        }
        return false;
    }

    public final int hashCode() {
        return 1930015 ^ C1535a.m4068a(this.f4867a, 4);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3686a(this.f4867a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3692b(this.f4867a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4867a[0] & 1) != 0;
    }

    public C1297ci() {
        this.f4867a = new long[4];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = this.f4867a;
        long[] jArr2 = ((C1297ci) abstractC1386g).f4867a;
        return new C1297ci(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = this.f4867a;
        return new C1297ci(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[4];
        C1296ch.m3115a(this.f4867a, ((C1297ci) abstractC1386g).f4867a, jArr);
        return new C1297ci(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4867a;
        long[] jArr2 = ((C1297ci) abstractC1386g).f4867a;
        long[] jArr3 = ((C1297ci) abstractC1386g2).f4867a;
        long[] jArr4 = ((C1297ci) abstractC1386g3).f4867a;
        long[] jArr5 = new long[8];
        C1296ch.m3118b(jArr, jArr2, jArr5);
        C1296ch.m3118b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        C1296ch.m3117b(jArr5, jArr6);
        return new C1297ci(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[4];
        C1296ch.m3119c(this.f4867a, jArr);
        return new C1297ci(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4867a;
        long[] jArr2 = ((C1297ci) abstractC1386g).f4867a;
        long[] jArr3 = ((C1297ci) abstractC1386g2).f4867a;
        long[] jArr4 = new long[8];
        C1296ch.m3121d(jArr, jArr4);
        C1296ch.m3118b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[4];
        C1296ch.m3117b(jArr4, jArr5);
        return new C1297ci(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[4];
        C1296ch.m3113a(this.f4867a, i, jArr);
        return new C1297ci(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return ((int) this.f4867a[0]) & 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[4];
        C1296ch.m3114a(this.f4867a, jArr);
        return new C1297ci(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = this.f4867a;
        long jM3560a = C1414a.m3560a(jArr[0]);
        long jM3560a2 = C1414a.m3560a(jArr[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long j2 = (jM3560a >>> 32) | (jM3560a2 & (-4294967296L));
        long jM3560a3 = C1414a.m3560a(jArr[2]);
        long j3 = (4294967295L & jM3560a3) ^ (jArr[3] << 32);
        long j4 = jM3560a3 >>> 32;
        return new C1297ci(new long[]{j ^ (j2 << 8), (((j4 << 8) ^ j3) ^ (j2 >>> 56)) ^ (j2 << 33), (j2 >>> 31) ^ ((j4 >>> 56) ^ (j4 << 33)), j4 >>> 31});
    }
}
