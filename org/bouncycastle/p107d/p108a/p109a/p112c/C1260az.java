package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.az */
/* JADX INFO: loaded from: classes.dex */
public final class C1260az extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4818a = C1257aw.f4810i;

    /* JADX INFO: renamed from: b */
    protected int[] f4819b;

    public C1260az(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4818a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f4819b = C1259ay.m3023a(bigInteger);
    }

    protected C1260az(int[] iArr) {
        this.f4819b = iArr;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1416c.m3599d(12, this.f4819b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4818a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1260az) {
            return AbstractC1416c.m3590b(12, this.f4819b, ((C1260az) obj).f4819b);
        }
        return false;
    }

    public final int hashCode() {
        return f4818a.hashCode() ^ C1535a.m4067a(this.f4819b, 12);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1416c.m3589b(12, this.f4819b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1416c.m3595c(12, this.f4819b);
    }

    public C1260az() {
        this.f4819b = new int[12];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4819b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[12];
        C1259ay.m3022a(this.f4819b, ((C1260az) abstractC1386g).f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[12];
        C1259ay.m3021a(this.f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[12];
        C1259ay.m3029d(this.f4819b, ((C1260az) abstractC1386g).f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[12];
        C1259ay.m3027c(this.f4819b, ((C1260az) abstractC1386g).f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[12];
        AbstractC1415b.m3567a(C1259ay.f4815a, ((C1260az) abstractC1386g).f4819b, iArr);
        C1259ay.m3027c(iArr, this.f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[12];
        C1259ay.m3024b(this.f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[12];
        C1259ay.m3028d(this.f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[12];
        AbstractC1415b.m3567a(C1259ay.f4815a, this.f4819b, iArr);
        return new C1260az(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4819b;
        if (AbstractC1416c.m3595c(12, iArr) || AbstractC1416c.m3589b(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        C1259ay.m3028d(iArr, iArr2);
        C1259ay.m3027c(iArr2, iArr, iArr2);
        C1259ay.m3020a(iArr2, 2, iArr3);
        C1259ay.m3027c(iArr3, iArr2, iArr3);
        C1259ay.m3028d(iArr3, iArr3);
        C1259ay.m3027c(iArr3, iArr, iArr3);
        C1259ay.m3020a(iArr3, 5, iArr4);
        C1259ay.m3027c(iArr4, iArr3, iArr4);
        C1259ay.m3020a(iArr4, 5, iArr5);
        C1259ay.m3027c(iArr5, iArr3, iArr5);
        C1259ay.m3020a(iArr5, 15, iArr3);
        C1259ay.m3027c(iArr3, iArr5, iArr3);
        C1259ay.m3020a(iArr3, 2, iArr4);
        C1259ay.m3027c(iArr2, iArr4, iArr2);
        C1259ay.m3020a(iArr4, 28, iArr4);
        C1259ay.m3027c(iArr3, iArr4, iArr3);
        C1259ay.m3020a(iArr3, 60, iArr4);
        C1259ay.m3027c(iArr4, iArr3, iArr4);
        C1259ay.m3020a(iArr4, 120, iArr3);
        C1259ay.m3027c(iArr3, iArr4, iArr3);
        C1259ay.m3020a(iArr3, 15, iArr3);
        C1259ay.m3027c(iArr3, iArr5, iArr3);
        C1259ay.m3020a(iArr3, 33, iArr3);
        C1259ay.m3027c(iArr3, iArr2, iArr3);
        C1259ay.m3020a(iArr3, 64, iArr3);
        C1259ay.m3027c(iArr3, iArr, iArr3);
        C1259ay.m3020a(iArr3, 30, iArr2);
        C1259ay.m3028d(iArr2, iArr3);
        if (AbstractC1416c.m3590b(12, iArr, iArr3)) {
            return new C1260az(iArr2);
        }
        return null;
    }
}
