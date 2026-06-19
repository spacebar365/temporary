package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1422i;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dd */
/* JADX INFO: loaded from: classes.dex */
public final class C1319dd extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4893a;

    public C1319dd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f4893a = C1318dc.m3158a(bigInteger);
    }

    protected C1319dd(long[] jArr) {
        this.f4893a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 283;
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
        return 2831275 ^ C1535a.m4068a(this.f4893a, 5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1422i.m3709a(this.f4893a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4893a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return C1318dc.m3153a(this.f4893a);
    }

    public C1319dd() {
        this.f4893a = new long[5];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        long[] jArr = this.f4893a;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        long[] jArr = this.f4893a;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC1556g.m4137a(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[5];
        C1318dc.m3157a(this.f4893a, ((C1319dd) abstractC1386g).f4893a, jArr);
        return new C1319dd(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = new long[5];
        C1318dc.m3156a(this.f4893a, jArr);
        return new C1319dd(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[5];
        C1318dc.m3161b(this.f4893a, ((C1319dd) abstractC1386g).f4893a, jArr);
        return new C1319dd(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4893a;
        long[] jArr2 = ((C1319dd) abstractC1386g).f4893a;
        long[] jArr3 = ((C1319dd) abstractC1386g2).f4893a;
        long[] jArr4 = ((C1319dd) abstractC1386g3).f4893a;
        long[] jArr5 = new long[9];
        C1318dc.m3163c(jArr, jArr2, jArr5);
        C1318dc.m3163c(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        C1318dc.m3162c(jArr5, jArr6);
        return new C1319dd(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[5];
        C1318dc.m3166e(this.f4893a, jArr);
        return new C1319dd(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4893a;
        long[] jArr2 = ((C1319dd) abstractC1386g).f4893a;
        long[] jArr3 = ((C1319dd) abstractC1386g2).f4893a;
        long[] jArr4 = new long[9];
        C1318dc.m3168f(jArr, jArr4);
        C1318dc.m3163c(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[5];
        C1318dc.m3162c(jArr4, jArr5);
        return new C1319dd(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[5];
        C1318dc.m3155a(this.f4893a, i, jArr);
        return new C1319dd(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[5];
        C1318dc.m3160b(this.f4893a, jArr);
        return new C1319dd(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = new long[5];
        C1318dc.m3164d(this.f4893a, jArr);
        return new C1319dd(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1319dd)) {
            return false;
        }
        long[] jArr = this.f4893a;
        long[] jArr2 = ((C1319dd) obj).f4893a;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
