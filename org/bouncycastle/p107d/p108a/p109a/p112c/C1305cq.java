package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p107d.p117c.C1414a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.cq */
/* JADX INFO: loaded from: classes.dex */
public final class C1305cq extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4876a;

    public C1305cq(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f4876a = C1304cp.m3130a(bigInteger);
    }

    protected C1305cq(long[] jArr) {
        this.f4876a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3695c(this.f4876a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 233;
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
        if (obj instanceof C1305cq) {
            return AbstractC1421h.m3687a(this.f4876a, ((C1305cq) obj).f4876a);
        }
        return false;
    }

    public final int hashCode() {
        return 2330074 ^ C1535a.m4068a(this.f4876a, 4);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3686a(this.f4876a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3692b(this.f4876a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4876a[0] & 1) != 0;
    }

    public C1305cq() {
        this.f4876a = new long[4];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = this.f4876a;
        long[] jArr2 = ((C1305cq) abstractC1386g).f4876a;
        return new C1305cq(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = this.f4876a;
        return new C1305cq(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[4];
        C1304cp.m3129a(this.f4876a, ((C1305cq) abstractC1386g).f4876a, jArr);
        return new C1305cq(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4876a;
        long[] jArr2 = ((C1305cq) abstractC1386g).f4876a;
        long[] jArr3 = ((C1305cq) abstractC1386g2).f4876a;
        long[] jArr4 = ((C1305cq) abstractC1386g3).f4876a;
        long[] jArr5 = new long[8];
        C1304cp.m3132b(jArr, jArr2, jArr5);
        C1304cp.m3132b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        C1304cp.m3131b(jArr5, jArr6);
        return new C1305cq(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[4];
        C1304cp.m3133c(this.f4876a, jArr);
        return new C1305cq(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4876a;
        long[] jArr2 = ((C1305cq) abstractC1386g).f4876a;
        long[] jArr3 = ((C1305cq) abstractC1386g2).f4876a;
        long[] jArr4 = new long[8];
        C1304cp.m3135d(jArr, jArr4);
        C1304cp.m3132b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[4];
        C1304cp.m3131b(jArr4, jArr5);
        return new C1305cq(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[4];
        C1304cp.m3127a(this.f4876a, i, jArr);
        return new C1305cq(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        long[] jArr = this.f4876a;
        return ((int) ((jArr[2] >>> 31) ^ jArr[0])) & 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[4];
        C1304cp.m3128a(this.f4876a, jArr);
        return new C1305cq(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f4876a;
        long jM3560a = C1414a.m3560a(jArr2[0]);
        long jM3560a2 = C1414a.m3560a(jArr2[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long j2 = (jM3560a >>> 32) | (jM3560a2 & (-4294967296L));
        long jM3560a3 = C1414a.m3560a(jArr2[2]);
        long jM3560a4 = C1414a.m3560a(jArr2[3]);
        long j3 = (4294967295L & jM3560a3) | (jM3560a4 << 32);
        long j4 = (jM3560a3 >>> 32) | (jM3560a4 & (-4294967296L));
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i] >>> 6;
            int i3 = iArr[i] & 63;
            jArr3[i2] = jArr3[i2] ^ (j7 << i3);
            int i4 = i2 + 1;
            jArr3[i4] = jArr3[i4] ^ ((j6 << i3) | (j7 >>> (-i3)));
            int i5 = i2 + 2;
            jArr3[i5] = jArr3[i5] ^ ((j5 << i3) | (j6 >>> (-i3)));
            int i6 = i2 + 3;
            jArr3[i6] = jArr3[i6] ^ (j5 >>> (-i3));
        }
        C1304cp.m3131b(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C1305cq(jArr);
    }
}
