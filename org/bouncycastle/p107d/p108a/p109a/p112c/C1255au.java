package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.au */
/* JADX INFO: loaded from: classes.dex */
public final class C1255au extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4808a = C1252ar.f4801i;

    /* JADX INFO: renamed from: b */
    protected int[] f4809b;

    public C1255au(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4808a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f4809b = C1254at.m3010a(bigInteger);
    }

    protected C1255au(int[] iArr) {
        this.f4809b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1421h.m3694c(this.f4809b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4808a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1255au) {
            return AbstractC1421h.m3696c(this.f4809b, ((C1255au) obj).f4809b);
        }
        return false;
    }

    public final int hashCode() {
        return f4808a.hashCode() ^ C1535a.m4067a(this.f4809b, 8);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1421h.m3685a(this.f4809b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1421h.m3691b(this.f4809b);
    }

    public C1255au() {
        this.f4809b = new int[8];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4809b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1254at.m3009a(this.f4809b, ((C1255au) abstractC1386g).f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[8];
        C1254at.m3008a(this.f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1254at.m3016d(this.f4809b, ((C1255au) abstractC1386g).f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        C1254at.m3012b(this.f4809b, ((C1255au) abstractC1386g).f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1254at.f4806a, ((C1255au) abstractC1386g).f4809b, iArr);
        C1254at.m3012b(iArr, this.f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[8];
        C1254at.m3011b(this.f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[8];
        C1254at.m3015d(this.f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[8];
        AbstractC1415b.m3567a(C1254at.f4806a, this.f4809b, iArr);
        return new C1255au(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4809b;
        if (AbstractC1421h.m3691b(iArr) || AbstractC1421h.m3685a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        C1254at.m3015d(iArr, iArr2);
        C1254at.m3012b(iArr2, iArr, iArr2);
        C1254at.m3007a(iArr2, 2, iArr3);
        C1254at.m3012b(iArr3, iArr2, iArr3);
        C1254at.m3007a(iArr3, 4, iArr2);
        C1254at.m3012b(iArr2, iArr3, iArr2);
        C1254at.m3007a(iArr2, 8, iArr3);
        C1254at.m3012b(iArr3, iArr2, iArr3);
        C1254at.m3007a(iArr3, 16, iArr2);
        C1254at.m3012b(iArr2, iArr3, iArr2);
        C1254at.m3007a(iArr2, 32, iArr2);
        C1254at.m3012b(iArr2, iArr, iArr2);
        C1254at.m3007a(iArr2, 96, iArr2);
        C1254at.m3012b(iArr2, iArr, iArr2);
        C1254at.m3007a(iArr2, 94, iArr2);
        C1254at.m3015d(iArr2, iArr3);
        if (AbstractC1421h.m3696c(iArr, iArr3)) {
            return new C1255au(iArr2);
        }
        return null;
    }
}
