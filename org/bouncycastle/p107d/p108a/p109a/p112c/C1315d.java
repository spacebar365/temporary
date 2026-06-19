package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1417d;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1315d extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4887a = C1234a.f4766i;

    /* JADX INFO: renamed from: b */
    protected int[] f4888b;

    public C1315d(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4887a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f4888b = C1288c.m3103a(bigInteger);
    }

    protected C1315d(int[] iArr) {
        this.f4888b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4887a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1315d) {
            return AbstractC1417d.m3607a(this.f4888b, ((C1315d) obj).f4888b);
        }
        return false;
    }

    public final int hashCode() {
        return f4887a.hashCode() ^ C1535a.m4067a(this.f4888b, 4);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1417d.m3606a(this.f4888b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1417d.m3610b(this.f4888b);
    }

    public C1315d() {
        this.f4888b = new int[4];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4888b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        int[] iArr = this.f4888b;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC1556g.m4136a(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[4];
        C1288c.m3102a(this.f4888b, ((C1315d) abstractC1386g).f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[4];
        C1288c.m3101a(this.f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[4];
        C1288c.m3109d(this.f4888b, ((C1315d) abstractC1386g).f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[4];
        C1288c.m3105b(this.f4888b, ((C1315d) abstractC1386g).f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[4];
        AbstractC1415b.m3567a(C1288c.f4856a, ((C1315d) abstractC1386g).f4888b, iArr);
        C1288c.m3105b(iArr, this.f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[4];
        C1288c.m3104b(this.f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[4];
        C1288c.m3108d(this.f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[4];
        AbstractC1415b.m3567a(C1288c.f4856a, this.f4888b, iArr);
        return new C1315d(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4888b;
        if (AbstractC1417d.m3610b(iArr) || AbstractC1417d.m3606a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        C1288c.m3108d(iArr, iArr2);
        C1288c.m3105b(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        C1288c.m3100a(iArr2, 2, iArr3);
        C1288c.m3105b(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        C1288c.m3100a(iArr3, 4, iArr4);
        C1288c.m3105b(iArr4, iArr3, iArr4);
        C1288c.m3100a(iArr4, 2, iArr3);
        C1288c.m3105b(iArr3, iArr2, iArr3);
        C1288c.m3100a(iArr3, 10, iArr2);
        C1288c.m3105b(iArr2, iArr3, iArr2);
        C1288c.m3100a(iArr2, 10, iArr4);
        C1288c.m3105b(iArr4, iArr3, iArr4);
        C1288c.m3108d(iArr4, iArr3);
        C1288c.m3105b(iArr3, iArr, iArr3);
        C1288c.m3100a(iArr3, 95, iArr3);
        C1288c.m3108d(iArr3, iArr4);
        if (AbstractC1417d.m3607a(iArr, iArr4)) {
            return new C1315d(iArr3);
        }
        return null;
    }
}
