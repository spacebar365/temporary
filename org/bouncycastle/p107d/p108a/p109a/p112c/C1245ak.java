package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1420g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C1245ak extends AbstractC1386g.b {

    /* JADX INFO: renamed from: a */
    public static final BigInteger f4789a = C1242ah.f4781i;

    /* JADX INFO: renamed from: b */
    protected int[] f4790b;

    public C1245ak(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f4789a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f4790b = C1244aj.m2982a(bigInteger);
    }

    protected C1245ak(int[] iArr) {
        this.f4790b = iArr;
    }

    /* JADX INFO: renamed from: a */
    private static void m2990a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C1244aj.m2984b(iArr2, iArr, iArr2);
        C1244aj.m2989e(iArr2, iArr2);
        C1244aj.m2987d(iArr, iArr4);
        C1244aj.m2981a(iArr3, iArr4, iArr);
        C1244aj.m2984b(iArr3, iArr4, iArr3);
        C1244aj.m2977a(AbstractC1416c.m3600e(7, iArr3, 0), iArr3);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final BigInteger mo2928a() {
        return AbstractC1420g.m3670c(this.f4790b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final int mo2930b() {
        return f4789a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1245ak) {
            return AbstractC1420g.m3669b(this.f4790b, ((C1245ak) obj).f4790b);
        }
        return false;
    }

    public final int hashCode() {
        return f4789a.hashCode() ^ C1535a.m4067a(this.f4790b, 7);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: i */
    public final boolean mo2939i() {
        return AbstractC1420g.m3665a(this.f4790b);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: j */
    public final boolean mo2940j() {
        return AbstractC1420g.m3668b(this.f4790b);
    }

    public C1245ak() {
        this.f4790b = new int[7];
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: k */
    public final boolean mo2941k() {
        return (this.f4790b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        C1244aj.m2981a(this.f4790b, ((C1245ak) abstractC1386g).f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2932c() {
        int[] iArr = new int[7];
        C1244aj.m2980a(this.f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: b */
    public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        C1244aj.m2988d(this.f4790b, ((C1245ak) abstractC1386g).f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: c */
    public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        C1244aj.m2984b(this.f4790b, ((C1245ak) abstractC1386g).f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
        int[] iArr = new int[7];
        AbstractC1415b.m3567a(C1244aj.f4786a, ((C1245ak) abstractC1386g).f4790b, iArr);
        C1244aj.m2984b(iArr, this.f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: d */
    public final AbstractC1386g mo2934d() {
        int[] iArr = new int[7];
        C1244aj.m2983b(this.f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: e */
    public final AbstractC1386g mo2936e() {
        int[] iArr = new int[7];
        C1244aj.m2987d(this.f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: f */
    public final AbstractC1386g mo2937f() {
        int[] iArr = new int[7];
        AbstractC1415b.m3567a(C1244aj.f4786a, this.f4790b, iArr);
        return new C1245ak(iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
    /* JADX INFO: renamed from: g */
    public final AbstractC1386g mo2938g() {
        int[] iArr = this.f4790b;
        if (AbstractC1420g.m3668b(iArr) || AbstractC1420g.m3665a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        C1244aj.m2983b(iArr, iArr2);
        int[] iArr3 = C1244aj.f4786a;
        int length = iArr3.length;
        Random random = new Random();
        int[] iArr4 = new int[length];
        int i = iArr3[length - 1];
        int i2 = i | (i >>> 1);
        int i3 = i2 | (i2 >>> 2);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        int i6 = (i5 >>> 16) | i5;
        do {
            for (int i7 = 0; i7 != length; i7++) {
                iArr4[i7] = random.nextInt();
            }
            int i8 = length - 1;
            iArr4[i8] = iArr4[i8] & i6;
        } while (AbstractC1416c.m3596c(length, iArr4, iArr3));
        int[] iArr5 = new int[7];
        if (!m2991a(iArr)) {
            return null;
        }
        while (!m2992a(iArr2, iArr4, iArr5)) {
            C1244aj.m2980a(iArr4, iArr4);
        }
        C1244aj.m2987d(iArr5, iArr4);
        if (AbstractC1420g.m3669b(iArr, iArr4)) {
            return new C1245ak(iArr5);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2991a(int[] iArr) {
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        AbstractC1420g.m3663a(iArr, iArr2);
        for (int i = 0; i < 7; i++) {
            AbstractC1420g.m3663a(iArr2, iArr3);
            C1244aj.m2979a(iArr2, 1 << i, iArr2);
            C1244aj.m2984b(iArr2, iArr3, iArr2);
        }
        C1244aj.m2979a(iArr2, 95, iArr2);
        return AbstractC1420g.m3665a(iArr2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2992a(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[7];
        AbstractC1420g.m3663a(iArr2, iArr4);
        int[] iArr5 = new int[7];
        iArr5[0] = 1;
        int[] iArr6 = new int[7];
        AbstractC1420g.m3663a(iArr, iArr6);
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        for (int i = 0; i < 7; i++) {
            AbstractC1420g.m3663a(iArr4, iArr7);
            AbstractC1420g.m3663a(iArr5, iArr8);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    m2990a(iArr4, iArr5, iArr6, iArr3);
                }
            }
            C1244aj.m2984b(iArr5, iArr8, iArr3);
            C1244aj.m2984b(iArr3, iArr, iArr3);
            C1244aj.m2984b(iArr4, iArr7, iArr6);
            C1244aj.m2981a(iArr6, iArr3, iArr6);
            C1244aj.m2984b(iArr4, iArr8, iArr3);
            AbstractC1420g.m3663a(iArr6, iArr4);
            C1244aj.m2984b(iArr5, iArr7, iArr5);
            C1244aj.m2981a(iArr5, iArr3, iArr5);
            C1244aj.m2987d(iArr5, iArr6);
            C1244aj.m2984b(iArr6, iArr, iArr6);
        }
        int[] iArr9 = new int[7];
        int[] iArr10 = new int[7];
        for (int i3 = 1; i3 < 96; i3++) {
            AbstractC1420g.m3663a(iArr4, iArr9);
            AbstractC1420g.m3663a(iArr5, iArr10);
            m2990a(iArr4, iArr5, iArr6, iArr3);
            if (AbstractC1420g.m3668b(iArr4)) {
                AbstractC1415b.m3567a(C1244aj.f4786a, iArr10, iArr3);
                C1244aj.m2984b(iArr3, iArr9, iArr3);
                return true;
            }
        }
        return false;
    }
}
