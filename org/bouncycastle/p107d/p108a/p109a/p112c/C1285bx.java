package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bx */
/* JADX INFO: loaded from: classes.dex */
public final class C1285bx extends AbstractC1386g.a {

    /* JADX INFO: renamed from: a */
    protected long[] f4851a;

    public C1285bx(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f4851a = C1284bw.m3085a(bigInteger);
    }

    protected C1285bx(long[] jArr) {
        this.f4851a = jArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1419f.m3650c(this.f4851a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return 163;
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
        if (obj instanceof C1285bx) {
            return AbstractC1419f.m3642a(this.f4851a, ((C1285bx) obj).f4851a);
        }
        return false;
    }

    public final int hashCode() {
        return 163763 ^ C1535a.m4068a(this.f4851a, 3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1419f.m3641a(this.f4851a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1419f.m3647b(this.f4851a);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4851a[0] & 1) != 0;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g.a
    /* JADX INFO: renamed from: m */
    public final int mo3059m() {
        return C1284bw.m3080a(this.f4851a);
    }

    public C1285bx() {
        this.f4851a = new long[3];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[3];
        C1284bw.m3084a(this.f4851a, ((C1285bx) abstractC1386g).f4851a, jArr);
        return new C1285bx(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        long[] jArr = new long[3];
        C1284bw.m3083a(this.f4851a, jArr);
        return new C1285bx(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        long[] jArr = new long[3];
        C1284bw.m3088b(this.f4851a, ((C1285bx) abstractC1386g).f4851a, jArr);
        return new C1285bx(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        long[] jArr = this.f4851a;
        long[] jArr2 = ((C1285bx) abstractC1386g).f4851a;
        long[] jArr3 = ((C1285bx) abstractC1386g2).f4851a;
        long[] jArr4 = ((C1285bx) abstractC1386g3).f4851a;
        long[] jArr5 = new long[6];
        C1284bw.m3090c(jArr, jArr2, jArr5);
        C1284bw.m3090c(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        C1284bw.m3089c(jArr5, jArr6);
        return new C1285bx(jArr6);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        long[] jArr = new long[3];
        C1284bw.m3093e(this.f4851a, jArr);
        return new C1285bx(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        long[] jArr = this.f4851a;
        long[] jArr2 = ((C1285bx) abstractC1386g).f4851a;
        long[] jArr3 = ((C1285bx) abstractC1386g2).f4851a;
        long[] jArr4 = new long[6];
        C1284bw.m3095f(jArr, jArr4);
        C1284bw.m3090c(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[3];
        C1284bw.m3089c(jArr4, jArr5);
        return new C1285bx(jArr5);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo3055a(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[3];
        C1284bw.m3082a(this.f4851a, i, jArr);
        return new C1285bx(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        long[] jArr = new long[3];
        C1284bw.m3087b(this.f4851a, jArr);
        return new C1285bx(jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        long[] jArr = new long[3];
        C1284bw.m3091d(this.f4851a, jArr);
        return new C1285bx(jArr);
    }
}
