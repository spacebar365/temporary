package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1417d;
import org.bouncycastle.p107d.p117c.C1414a;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bh */
/* JADX INFO: loaded from: classes.dex */
public final class C1269bh extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4831a;

    public C1269bh(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f4831a = C1268bg.m3047a(bigInteger);
    }

    protected C1269bh(long[] jArr) {
        this.f4831a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 113;
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
        return 113009 ^ C1535a.m4068a(this.f4831a, 2);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1417d.m3608a(this.f4831a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4831a[0] & 1) != 0;
    }

    public C1269bh() {
        this.f4831a = new long[2];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        long[] jArr = this.f4831a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[1] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        long[] jArr = this.f4831a;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC1556g.m4137a(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = this.f4831a;
        long[] jArr2 = ((C1269bh) abstractC1386g).f4831a;
        return new C1269bh(new long[]{jArr[0] ^ jArr2[0], jArr2[1] ^ jArr[1]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = this.f4831a;
        return new C1269bh(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[2];
        C1268bg.m3046a(this.f4831a, ((C1269bh) abstractC1386g).f4831a, jArr);
        return new C1269bh(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4831a;
        long[] jArr2 = ((C1269bh) abstractC1386g).f4831a;
        long[] jArr3 = ((C1269bh) abstractC1386g2).f4831a;
        long[] jArr4 = ((C1269bh) abstractC1386g3).f4831a;
        long[] jArr5 = new long[4];
        C1268bg.m3049b(jArr, jArr2, jArr5);
        C1268bg.m3049b(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[2];
        C1268bg.m3048b(jArr5, jArr6);
        return new C1269bh(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[2];
        C1268bg.m3050c(this.f4831a, jArr);
        return new C1269bh(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4831a;
        long[] jArr2 = ((C1269bh) abstractC1386g).f4831a;
        long[] jArr3 = ((C1269bh) abstractC1386g2).f4831a;
        long[] jArr4 = new long[4];
        C1268bg.m3052d(jArr, jArr4);
        C1268bg.m3049b(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[2];
        C1268bg.m3048b(jArr4, jArr5);
        return new C1269bh(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[2];
        C1268bg.m3044a(this.f4831a, i, jArr);
        return new C1269bh(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return ((int) this.f4831a[0]) & 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[2];
        C1268bg.m3045a(this.f4831a, jArr);
        return new C1269bh(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = this.f4831a;
        long jM3560a = C1414a.m3560a(jArr[0]);
        long jM3560a2 = C1414a.m3560a(jArr[1]);
        long j = (4294967295L & jM3560a) | (jM3560a2 << 32);
        long j2 = (jM3560a >>> 32) | (jM3560a2 & (-4294967296L));
        return new C1269bh(new long[]{((j2 << 57) ^ j) ^ (j2 << 5), (j2 >>> 59) ^ (j2 >>> 7)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1269bh)) {
            return false;
        }
        long[] jArr = this.f4831a;
        long[] jArr2 = ((C1269bh) obj).f4831a;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
