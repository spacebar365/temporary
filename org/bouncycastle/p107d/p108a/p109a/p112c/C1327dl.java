package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1424k;
import org.bouncycastle.p107d.p117c.C1414a;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dl */
/* JADX INFO: loaded from: classes.dex */
public final class C1327dl extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4902a;

    public C1327dl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f4902a = C1326dk.m3176a(bigInteger);
    }

    protected C1327dl(long[] jArr) {
        this.f4902a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 409;
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

    public final int hashCode() {
        return 4090087 ^ C1535a.m4068a(this.f4902a, 7);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1424k.m3713a(this.f4902a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4902a[0] & 1) != 0;
    }

    public C1327dl() {
        this.f4902a = new long[7];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        long[] jArr = this.f4902a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        long[] jArr = this.f4902a;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC1556g.m4137a(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = this.f4902a;
        long[] jArr2 = ((C1327dl) abstractC1386g).f4902a;
        return new C1327dl(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = this.f4902a;
        return new C1327dl(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[7];
        C1326dk.m3175a(this.f4902a, ((C1327dl) abstractC1386g).f4902a, jArr);
        return new C1327dl(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4902a;
        long[] jArr2 = ((C1327dl) abstractC1386g).f4902a;
        long[] jArr3 = ((C1327dl) abstractC1386g2).f4902a;
        long[] jArr4 = ((C1327dl) abstractC1386g3).f4902a;
        long[] jArr5 = new long[13];
        C1326dk.m3178b(jArr, jArr2, jArr5);
        C1326dk.m3178b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        C1326dk.m3177b(jArr5, jArr6);
        return new C1327dl(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[7];
        C1326dk.m3179c(this.f4902a, jArr);
        return new C1327dl(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4902a;
        long[] jArr2 = ((C1327dl) abstractC1386g).f4902a;
        long[] jArr3 = ((C1327dl) abstractC1386g2).f4902a;
        long[] jArr4 = new long[13];
        C1326dk.m3181d(jArr, jArr4);
        C1326dk.m3178b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[7];
        C1326dk.m3177b(jArr4, jArr5);
        return new C1327dl(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[7];
        C1326dk.m3172a(this.f4902a, i, jArr);
        return new C1327dl(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return ((int) this.f4902a[0]) & 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[7];
        C1326dk.m3174a(this.f4902a, jArr);
        return new C1327dl(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = this.f4902a;
        long jM3560a = C1414a.m3560a(jArr[0]);
        long jM3560a2 = C1414a.m3560a(jArr[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long j2 = (jM3560a >>> 32) | (jM3560a2 & (-4294967296L));
        long jM3560a3 = C1414a.m3560a(jArr[2]);
        long jM3560a4 = C1414a.m3560a(jArr[3]);
        long j3 = (4294967295L & jM3560a3) | (jM3560a4 << 32);
        long j4 = (jM3560a3 >>> 32) | (jM3560a4 & (-4294967296L));
        long jM3560a5 = C1414a.m3560a(jArr[4]);
        long jM3560a6 = C1414a.m3560a(jArr[5]);
        long j5 = (4294967295L & jM3560a5) | (jM3560a6 << 32);
        long j6 = (jM3560a5 >>> 32) | (jM3560a6 & (-4294967296L));
        long jM3560a7 = C1414a.m3560a(jArr[6]);
        long j7 = 4294967295L & jM3560a7;
        long j8 = jM3560a7 >>> 32;
        return new C1327dl(new long[]{j ^ (j2 << 44), ((j4 << 44) ^ j3) ^ (j2 >>> 20), ((j6 << 44) ^ j5) ^ (j4 >>> 20), (((j8 << 44) ^ j7) ^ (j6 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j8 >>> 20) ^ (j4 << 13)), (j6 << 13) ^ (j4 >>> 51), (j8 << 13) ^ (j6 >>> 51)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1327dl)) {
            return false;
        }
        long[] jArr = this.f4902a;
        long[] jArr2 = ((C1327dl) obj).f4902a;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
