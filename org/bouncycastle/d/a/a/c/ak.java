package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.d.a.g$b;

/* JADX INFO: loaded from: classes.dex */
public final class ak extends g$b {
    public static final BigInteger a = ah.i;
    protected int[] b;

    public ak(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(a) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.b = aj.a(bigInteger);
    }

    protected ak(int[] iArr) {
        this.b = iArr;
    }

    private static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        aj.b(iArr2, iArr, iArr2);
        aj.e(iArr2, iArr2);
        aj.d(iArr, iArr4);
        aj.a(iArr3, iArr4, iArr);
        aj.b(iArr3, iArr4, iArr3);
        aj.a(org.bouncycastle.d.c.c.e(7, iArr3, 0), iArr3);
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return org.bouncycastle.d.c.g.c(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return a.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ak) {
            return org.bouncycastle.d.c.g.b(this.b, ((ak) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.hashCode() ^ org.bouncycastle.f.a.a(this.b, 7);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return org.bouncycastle.d.c.g.a(this.b);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return org.bouncycastle.d.c.g.b(this.b);
    }

    public ak() {
        this.b = new int[7];
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return (this.b[0] & 1) == 1;
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g a(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        aj.a(this.b, ((ak) gVar).b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c() {
        int[] iArr = new int[7];
        aj.a(this.b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g b(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        aj.d(this.b, ((ak) gVar).b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g c(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        aj.b(this.b, ((ak) gVar).b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d(org.bouncycastle.d.a.g gVar) {
        int[] iArr = new int[7];
        org.bouncycastle.d.c.b.a(aj.a, ((ak) gVar).b, iArr);
        aj.b(iArr, this.b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g d() {
        int[] iArr = new int[7];
        aj.b(this.b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g e() {
        int[] iArr = new int[7];
        aj.d(this.b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g f() {
        int[] iArr = new int[7];
        org.bouncycastle.d.c.b.a(aj.a, this.b, iArr);
        return new ak(iArr);
    }

    @Override // org.bouncycastle.d.a.g
    public final org.bouncycastle.d.a.g g() {
        int[] iArr = this.b;
        if (org.bouncycastle.d.c.g.b(iArr) || org.bouncycastle.d.c.g.a(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        aj.b(iArr, iArr2);
        int[] iArr3 = aj.a;
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
        } while (org.bouncycastle.d.c.c.c(length, iArr4, iArr3));
        int[] iArr5 = new int[7];
        if (!a(iArr)) {
            return null;
        }
        while (!a(iArr2, iArr4, iArr5)) {
            aj.a(iArr4, iArr4);
        }
        aj.d(iArr5, iArr4);
        if (org.bouncycastle.d.c.g.b(iArr, iArr4)) {
            return new ak(iArr5);
        }
        return null;
    }

    private static boolean a(int[] iArr) {
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        org.bouncycastle.d.c.g.a(iArr, iArr2);
        for (int i = 0; i < 7; i++) {
            org.bouncycastle.d.c.g.a(iArr2, iArr3);
            aj.a(iArr2, 1 << i, iArr2);
            aj.b(iArr2, iArr3, iArr2);
        }
        aj.a(iArr2, 95, iArr2);
        return org.bouncycastle.d.c.g.a(iArr2);
    }

    private static boolean a(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[7];
        org.bouncycastle.d.c.g.a(iArr2, iArr4);
        int[] iArr5 = new int[7];
        iArr5[0] = 1;
        int[] iArr6 = new int[7];
        org.bouncycastle.d.c.g.a(iArr, iArr6);
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        for (int i = 0; i < 7; i++) {
            org.bouncycastle.d.c.g.a(iArr4, iArr7);
            org.bouncycastle.d.c.g.a(iArr5, iArr8);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    a(iArr4, iArr5, iArr6, iArr3);
                }
            }
            aj.b(iArr5, iArr8, iArr3);
            aj.b(iArr3, iArr, iArr3);
            aj.b(iArr4, iArr7, iArr6);
            aj.a(iArr6, iArr3, iArr6);
            aj.b(iArr4, iArr8, iArr3);
            org.bouncycastle.d.c.g.a(iArr6, iArr4);
            aj.b(iArr5, iArr7, iArr5);
            aj.a(iArr5, iArr3, iArr5);
            aj.d(iArr5, iArr6);
            aj.b(iArr6, iArr, iArr6);
        }
        int[] iArr9 = new int[7];
        int[] iArr10 = new int[7];
        for (int i3 = 1; i3 < 96; i3++) {
            org.bouncycastle.d.c.g.a(iArr4, iArr9);
            org.bouncycastle.d.c.g.a(iArr5, iArr10);
            a(iArr4, iArr5, iArr6, iArr3);
            if (org.bouncycastle.d.c.g.b(iArr4)) {
                org.bouncycastle.d.c.b.a(aj.a, iArr10, iArr3);
                aj.b(iArr3, iArr9, iArr3);
                return true;
            }
        }
        return false;
    }
}
