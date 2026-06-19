package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1426m;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dt */
/* JADX INFO: loaded from: classes.dex */
public final class C1335dt extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4912a;

    public C1335dt(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f4912a = C1334ds.m3190a(bigInteger);
    }

    protected C1335dt(long[] jArr) {
        this.f4912a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 571;
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
        return 5711052 ^ C1535a.m4068a(this.f4912a, 9);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1426m.m3716a(this.f4912a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4912a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return C1334ds.m3192b(this.f4912a);
    }

    public C1335dt() {
        this.f4912a = new long[9];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        long[] jArr = this.f4912a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        long[] jArr = this.f4912a;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC1556g.m4137a(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[9];
        C1334ds.m3189a(this.f4912a, ((C1335dt) abstractC1386g).f4912a, jArr);
        return new C1335dt(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = new long[9];
        C1334ds.m3188a(this.f4912a, jArr);
        return new C1335dt(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[9];
        C1334ds.m3196c(this.f4912a, ((C1335dt) abstractC1386g).f4912a, jArr);
        return new C1335dt(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4912a;
        long[] jArr2 = ((C1335dt) abstractC1386g).f4912a;
        long[] jArr3 = ((C1335dt) abstractC1386g2).f4912a;
        long[] jArr4 = ((C1335dt) abstractC1386g3).f4912a;
        long[] jArr5 = new long[18];
        C1334ds.m3198d(jArr, jArr2, jArr5);
        C1334ds.m3198d(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        C1334ds.m3195c(jArr5, jArr6);
        return new C1335dt(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[9];
        C1334ds.m3199e(this.f4912a, jArr);
        return new C1335dt(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4912a;
        long[] jArr2 = ((C1335dt) abstractC1386g).f4912a;
        long[] jArr3 = ((C1335dt) abstractC1386g2).f4912a;
        long[] jArr4 = new long[18];
        C1334ds.m3201f(jArr, jArr4);
        C1334ds.m3198d(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        C1334ds.m3195c(jArr4, jArr5);
        return new C1335dt(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[9];
        C1334ds.m3186a(this.f4912a, i, jArr);
        return new C1335dt(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[9];
        C1334ds.m3193b(this.f4912a, jArr);
        return new C1335dt(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = new long[9];
        C1334ds.m3197d(this.f4912a, jArr);
        return new C1335dt(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1335dt)) {
            return false;
        }
        long[] jArr = this.f4912a;
        long[] jArr2 = ((C1335dt) obj).f4912a;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
