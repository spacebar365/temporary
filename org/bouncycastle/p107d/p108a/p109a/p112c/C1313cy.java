package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p107d.p117c.C1414a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.cy */
/* JADX INFO: loaded from: classes.dex */
public final class C1313cy extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4885a;

    public C1313cy(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f4885a = C1312cx.m3144a(bigInteger);
    }

    protected C1313cy(long[] jArr) {
        this.f4885a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3695c(this.f4885a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 239;
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
        if (obj instanceof C1313cy) {
            return AbstractC1421h.m3687a(this.f4885a, ((C1313cy) obj).f4885a);
        }
        return false;
    }

    public final int hashCode() {
        return 23900158 ^ C1535a.m4068a(this.f4885a, 4);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3686a(this.f4885a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3692b(this.f4885a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4885a[0] & 1) != 0;
    }

    public C1313cy() {
        this.f4885a = new long[4];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = this.f4885a;
        long[] jArr2 = ((C1313cy) abstractC1386g).f4885a;
        return new C1313cy(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr2[3] ^ jArr[3]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = this.f4885a;
        return new C1313cy(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[4];
        C1312cx.m3143a(this.f4885a, ((C1313cy) abstractC1386g).f4885a, jArr);
        return new C1313cy(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4885a;
        long[] jArr2 = ((C1313cy) abstractC1386g).f4885a;
        long[] jArr3 = ((C1313cy) abstractC1386g2).f4885a;
        long[] jArr4 = ((C1313cy) abstractC1386g3).f4885a;
        long[] jArr5 = new long[8];
        C1312cx.m3146b(jArr, jArr2, jArr5);
        C1312cx.m3146b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        C1312cx.m3145b(jArr5, jArr6);
        return new C1313cy(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[4];
        C1312cx.m3147c(this.f4885a, jArr);
        return new C1313cy(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4885a;
        long[] jArr2 = ((C1313cy) abstractC1386g).f4885a;
        long[] jArr3 = ((C1313cy) abstractC1386g2).f4885a;
        long[] jArr4 = new long[8];
        C1312cx.m3149d(jArr, jArr4);
        C1312cx.m3146b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[4];
        C1312cx.m3145b(jArr4, jArr5);
        return new C1313cy(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[4];
        C1312cx.m3141a(this.f4885a, i, jArr);
        return new C1313cy(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        long[] jArr = this.f4885a;
        return ((int) ((jArr[2] >>> 34) ^ (jArr[0] ^ (jArr[1] >>> 17)))) & 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[4];
        C1312cx.m3142a(this.f4885a, jArr);
        return new C1313cy(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f4885a;
        long jM3560a = C1414a.m3560a(jArr2[0]);
        long jM3560a2 = C1414a.m3560a(jArr2[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long j2 = (jM3560a >>> 32) | (jM3560a2 & (-4294967296L));
        long jM3560a3 = C1414a.m3560a(jArr2[2]);
        long jM3560a4 = C1414a.m3560a(jArr2[3]);
        long j3 = (4294967295L & jM3560a3) | (jM3560a4 << 32);
        long j4 = (jM3560a3 >>> 32) | (jM3560a4 & (-4294967296L));
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i] >>> 6;
            int i3 = iArr[i] & 63;
            jArr3[i2] = jArr3[i2] ^ (j2 << i3);
            int i4 = i2 + 1;
            jArr3[i4] = jArr3[i4] ^ ((j7 << i3) | (j2 >>> (-i3)));
            int i5 = i2 + 2;
            jArr3[i5] = jArr3[i5] ^ ((j6 << i3) | (j7 >>> (-i3)));
            int i6 = i2 + 3;
            jArr3[i6] = jArr3[i6] ^ ((j5 << i3) | (j6 >>> (-i3)));
            int i7 = i2 + 4;
            jArr3[i7] = jArr3[i7] ^ (j5 >>> (-i3));
        }
        C1312cx.m3145b(jArr3, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j3;
        return new C1313cy(jArr);
    }
}
