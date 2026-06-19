package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.p107d.p117c.AbstractC1415b;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.d.a.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1386g implements InterfaceC1376c {

    /* JADX INFO: renamed from: org.bouncycastle.d.a.g$a */
    public static abstract class a extends AbstractC1386g {
        /* JADX INFO: renamed from: m */
        public int mo3059m() {
            int iB = mo2930b();
            int i = 1;
            AbstractC1386g abstractC1386gMo2929a = this;
            AbstractC1386g abstractC1386gMo2936e = this;
            while (i < iB) {
                abstractC1386gMo2936e = abstractC1386gMo2936e.mo2936e();
                i++;
                abstractC1386gMo2929a = abstractC1386gMo2929a.mo2929a(abstractC1386gMo2936e);
            }
            if (abstractC1386gMo2929a.mo2940j()) {
                return 0;
            }
            if (abstractC1386gMo2929a.mo2939i()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.g$b */
    public static abstract class b extends AbstractC1386g {
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.g$c */
    public static class c extends a {

        /* JADX INFO: renamed from: a */
        C1397r f5069a;

        /* JADX INFO: renamed from: b */
        private int f5070b;

        /* JADX INFO: renamed from: i */
        private int f5071i;

        /* JADX INFO: renamed from: j */
        private int[] f5072j;

        public c(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.f5070b = 2;
                this.f5072j = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f5070b = 3;
                this.f5072j = new int[]{i2, i3, i4};
            }
            this.f5071i = i;
            this.f5069a = new C1397r(bigInteger);
        }

        c(int i, int[] iArr, C1397r c1397r) {
            this.f5071i = i;
            this.f5070b = iArr.length == 1 ? 2 : 3;
            this.f5072j = iArr;
            this.f5069a = c1397r;
        }

        /* JADX INFO: renamed from: b */
        public static void m3437b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
            if (!(abstractC1386g instanceof c) || !(abstractC1386g2 instanceof c)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            c cVar = (c) abstractC1386g;
            c cVar2 = (c) abstractC1386g2;
            if (cVar.f5070b != cVar2.f5070b) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (cVar.f5071i != cVar2.f5071i || !C1535a.m4077a(cVar.f5072j, cVar2.f5072j)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final BigInteger mo2928a() {
            return this.f5069a.m3521d();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo3055a(int i) {
            return i <= 0 ? this : new c(this.f5071i, this.f5072j, this.f5069a.m3510a(i, this.f5071i, this.f5072j));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
            C1397r c1397r = (C1397r) this.f5069a.clone();
            c1397r.m3513a(((c) abstractC1386g).f5069a);
            return new c(this.f5071i, this.f5072j, c1397r);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
            C1397r c1397r = this.f5069a;
            C1397r c1397r2 = ((c) abstractC1386g).f5069a;
            C1397r c1397r3 = ((c) abstractC1386g2).f5069a;
            C1397r c1397rM3524g = c1397r.m3524g();
            C1397r c1397rM3517b = c1397r2.m3517b(c1397r3);
            if (c1397rM3524g == c1397r) {
                c1397rM3524g = (C1397r) c1397rM3524g.clone();
            }
            c1397rM3524g.m3513a(c1397rM3517b);
            c1397rM3524g.m3512a(this.f5071i, this.f5072j);
            return new c(this.f5071i, this.f5072j, c1397rM3524g);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
            return mo3058b(abstractC1386g, abstractC1386g2, abstractC1386g3);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: b */
        public final int mo2930b() {
            return this.f5071i;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: b */
        public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
            return mo2929a(abstractC1386g);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: b */
        public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
            C1397r c1397r = this.f5069a;
            C1397r c1397r2 = ((c) abstractC1386g).f5069a;
            C1397r c1397r3 = ((c) abstractC1386g2).f5069a;
            C1397r c1397r4 = ((c) abstractC1386g3).f5069a;
            C1397r c1397rM3517b = c1397r.m3517b(c1397r2);
            C1397r c1397rM3517b2 = c1397r3.m3517b(c1397r4);
            if (c1397rM3517b == c1397r || c1397rM3517b == c1397r2) {
                c1397rM3517b = (C1397r) c1397rM3517b.clone();
            }
            c1397rM3517b.m3513a(c1397rM3517b2);
            c1397rM3517b.m3512a(this.f5071i, this.f5072j);
            return new c(this.f5071i, this.f5072j, c1397rM3517b);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: c */
        public final AbstractC1386g mo2932c() {
            return new c(this.f5071i, this.f5072j, this.f5069a.m3522e());
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: c */
        public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
            return new c(this.f5071i, this.f5072j, this.f5069a.m3511a(((c) abstractC1386g).f5069a, this.f5071i, this.f5072j));
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

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: e */
        public final AbstractC1386g mo2936e() {
            return new c(this.f5071i, this.f5072j, this.f5069a.m3516b(this.f5071i, this.f5072j));
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5071i == cVar.f5071i && this.f5070b == cVar.f5070b && C1535a.m4077a(this.f5072j, cVar.f5072j) && this.f5069a.equals(cVar.f5069a);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: f */
        public final AbstractC1386g mo2937f() {
            return new c(this.f5071i, this.f5072j, this.f5069a.m3520c(this.f5071i, this.f5072j));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: g */
        public final AbstractC1386g mo2938g() {
            return (this.f5069a.m3518b() || this.f5069a.m3515a()) ? this : mo3055a(this.f5071i - 1);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: h */
        public final int mo3435h() {
            return this.f5069a.m3519c();
        }

        public final int hashCode() {
            return (this.f5069a.hashCode() ^ this.f5071i) ^ C1535a.m4082b(this.f5072j);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: i */
        public final boolean mo2939i() {
            return this.f5069a.m3515a();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: j */
        public final boolean mo2940j() {
            return this.f5069a.m3518b();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: k */
        public final boolean mo2941k() {
            return this.f5069a.m3523f();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract BigInteger mo2928a();

    /* JADX INFO: renamed from: a */
    public AbstractC1386g mo3055a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this = this.mo2936e();
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1386g mo2929a(AbstractC1386g abstractC1386g);

    /* JADX INFO: renamed from: a */
    public AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        return mo2936e().mo2929a(abstractC1386g.mo2933c(abstractC1386g2));
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo2933c(abstractC1386g).mo2931b(abstractC1386g2.mo2933c(abstractC1386g3));
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2930b();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC1386g mo2931b(AbstractC1386g abstractC1386g);

    /* JADX INFO: renamed from: b */
    public AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
        return mo2933c(abstractC1386g).mo2929a(abstractC1386g2.mo2933c(abstractC1386g3));
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC1386g mo2932c();

    /* JADX INFO: renamed from: c */
    public abstract AbstractC1386g mo2933c(AbstractC1386g abstractC1386g);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC1386g mo2934d();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC1386g mo2935d(AbstractC1386g abstractC1386g);

    /* JADX INFO: renamed from: e */
    public abstract AbstractC1386g mo2936e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC1386g mo2937f();

    /* JADX INFO: renamed from: g */
    public abstract AbstractC1386g mo2938g();

    /* JADX INFO: renamed from: h */
    public int mo3435h() {
        return mo2928a().bitLength();
    }

    /* JADX INFO: renamed from: i */
    public boolean mo2939i() {
        return mo3435h() == 1;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo2940j() {
        return mo2928a().signum() == 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo2941k() {
        return mo2928a().testBit(0);
    }

    /* JADX INFO: renamed from: l */
    public final byte[] m3436l() {
        return C1544b.m4117a((mo2930b() + 7) / 8, mo2928a());
    }

    public String toString() {
        return mo2928a().toString(16);
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.g$d */
    public static class d extends b {

        /* JADX INFO: renamed from: a */
        BigInteger f5073a;

        /* JADX INFO: renamed from: b */
        BigInteger f5074b;

        /* JADX INFO: renamed from: i */
        BigInteger f5075i;

        d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f5073a = bigInteger;
            this.f5074b = bigInteger2;
            this.f5075i = bigInteger3;
        }

        /* JADX INFO: renamed from: a */
        static BigInteger m3438a(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return f4995d.shiftLeft(iBitLength).subtract(bigInteger);
        }

        /* JADX INFO: renamed from: a */
        private BigInteger m3439a(BigInteger bigInteger, BigInteger bigInteger2) {
            return m3443d(bigInteger.multiply(bigInteger2));
        }

        /* JADX INFO: renamed from: a */
        private BigInteger[] m3440a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            BigInteger bigIntegerM3443d;
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerM3443d2 = InterfaceC1376c.f4995d;
            BigInteger bigIntegerM3443d3 = InterfaceC1376c.f4996e;
            BigInteger bigIntegerM3439a = InterfaceC1376c.f4995d;
            BigInteger bigIntegerM3439a2 = InterfaceC1376c.f4995d;
            BigInteger bigInteger4 = bigInteger;
            int i = iBitLength - 1;
            while (i >= lowestSetBit + 1) {
                bigIntegerM3439a = m3439a(bigIntegerM3439a, bigIntegerM3439a2);
                if (bigInteger3.testBit(i)) {
                    bigIntegerM3439a2 = m3439a(bigIntegerM3439a, bigInteger2);
                    bigIntegerM3443d2 = m3439a(bigIntegerM3443d2, bigInteger4);
                    bigIntegerM3443d3 = m3443d(bigInteger4.multiply(bigIntegerM3443d3).subtract(bigInteger.multiply(bigIntegerM3439a)));
                    bigIntegerM3443d = m3443d(bigInteger4.multiply(bigInteger4).subtract(bigIntegerM3439a2.shiftLeft(1)));
                } else {
                    bigIntegerM3443d2 = m3443d(bigIntegerM3443d2.multiply(bigIntegerM3443d3).subtract(bigIntegerM3439a));
                    bigIntegerM3443d = m3443d(bigInteger4.multiply(bigIntegerM3443d3).subtract(bigInteger.multiply(bigIntegerM3439a)));
                    bigIntegerM3443d3 = m3443d(bigIntegerM3443d3.multiply(bigIntegerM3443d3).subtract(bigIntegerM3439a.shiftLeft(1)));
                    bigIntegerM3439a2 = bigIntegerM3439a;
                }
                i--;
                bigInteger4 = bigIntegerM3443d;
            }
            BigInteger bigIntegerM3439a3 = m3439a(bigIntegerM3439a, bigIntegerM3439a2);
            BigInteger bigIntegerM3439a4 = m3439a(bigIntegerM3439a3, bigInteger2);
            BigInteger bigIntegerM3443d4 = m3443d(bigIntegerM3443d2.multiply(bigIntegerM3443d3).subtract(bigIntegerM3439a3));
            BigInteger bigIntegerM3443d5 = m3443d(bigInteger4.multiply(bigIntegerM3443d3).subtract(bigInteger.multiply(bigIntegerM3439a3)));
            BigInteger bigIntegerM3439a5 = m3439a(bigIntegerM3439a3, bigIntegerM3439a4);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                bigIntegerM3443d4 = m3439a(bigIntegerM3443d4, bigIntegerM3443d5);
                bigIntegerM3443d5 = m3443d(bigIntegerM3443d5.multiply(bigIntegerM3443d5).subtract(bigIntegerM3439a5.shiftLeft(1)));
                bigIntegerM3439a5 = m3439a(bigIntegerM3439a5, bigIntegerM3439a5);
            }
            return new BigInteger[]{bigIntegerM3443d4, bigIntegerM3443d5};
        }

        /* JADX INFO: renamed from: b */
        private BigInteger m3441b(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.f5073a) >= 0 ? bigIntegerShiftLeft.subtract(this.f5073a) : bigIntegerShiftLeft;
        }

        /* JADX INFO: renamed from: d */
        private BigInteger m3443d(BigInteger bigInteger) {
            if (this.f5074b == null) {
                return bigInteger.mod(this.f5073a);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f5073a.bitLength();
            boolean zEquals = this.f5074b.equals(InterfaceC1376c.f4995d);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f5074b);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f5073a) >= 0) {
                bigInteger = bigInteger.subtract(this.f5073a);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.f5073a.subtract(bigInteger);
        }

        /* JADX INFO: renamed from: e */
        private AbstractC1386g m3444e(AbstractC1386g abstractC1386g) {
            if (abstractC1386g.mo2936e().equals(this)) {
                return abstractC1386g;
            }
            return null;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final BigInteger mo2928a() {
            return this.f5075i;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo3056a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
            BigInteger bigInteger = this.f5075i;
            BigInteger bigIntegerMo2928a = abstractC1386g.mo2928a();
            BigInteger bigIntegerMo2928a2 = abstractC1386g2.mo2928a();
            return new d(this.f5073a, this.f5074b, m3443d(bigInteger.multiply(bigInteger).add(bigIntegerMo2928a.multiply(bigIntegerMo2928a2))));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo3057a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
            BigInteger bigInteger = this.f5075i;
            BigInteger bigIntegerMo2928a = abstractC1386g.mo2928a();
            BigInteger bigIntegerMo2928a2 = abstractC1386g2.mo2928a();
            BigInteger bigIntegerMo2928a3 = abstractC1386g3.mo2928a();
            return new d(this.f5073a, this.f5074b, m3443d(bigInteger.multiply(bigIntegerMo2928a).subtract(bigIntegerMo2928a2.multiply(bigIntegerMo2928a3))));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: b */
        public final int mo2930b() {
            return this.f5073a.bitLength();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: b */
        public final AbstractC1386g mo3058b(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g abstractC1386g3) {
            BigInteger bigInteger = this.f5075i;
            BigInteger bigIntegerMo2928a = abstractC1386g.mo2928a();
            BigInteger bigIntegerMo2928a2 = abstractC1386g2.mo2928a();
            BigInteger bigIntegerMo2928a3 = abstractC1386g3.mo2928a();
            return new d(this.f5073a, this.f5074b, m3443d(bigInteger.multiply(bigIntegerMo2928a).add(bigIntegerMo2928a2.multiply(bigIntegerMo2928a3))));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: c */
        public final AbstractC1386g mo2932c() {
            BigInteger bigIntegerAdd = this.f5075i.add(InterfaceC1376c.f4995d);
            if (bigIntegerAdd.compareTo(this.f5073a) == 0) {
                bigIntegerAdd = InterfaceC1376c.f4994c;
            }
            return new d(this.f5073a, this.f5074b, bigIntegerAdd);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: c */
        public final AbstractC1386g mo2933c(AbstractC1386g abstractC1386g) {
            return new d(this.f5073a, this.f5074b, m3439a(this.f5075i, abstractC1386g.mo2928a()));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: d */
        public final AbstractC1386g mo2934d() {
            return this.f5075i.signum() == 0 ? this : new d(this.f5073a, this.f5074b, this.f5073a.subtract(this.f5075i));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: d */
        public final AbstractC1386g mo2935d(AbstractC1386g abstractC1386g) {
            return new d(this.f5073a, this.f5074b, m3439a(this.f5075i, m3442c(abstractC1386g.mo2928a())));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: e */
        public final AbstractC1386g mo2936e() {
            return new d(this.f5073a, this.f5074b, m3439a(this.f5075i, this.f5075i));
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f5073a.equals(dVar.f5073a) && this.f5075i.equals(dVar.f5075i);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: f */
        public final AbstractC1386g mo2937f() {
            return new d(this.f5073a, this.f5074b, m3442c(this.f5075i));
        }

        public final int hashCode() {
            return this.f5073a.hashCode() ^ this.f5075i.hashCode();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo2929a(AbstractC1386g abstractC1386g) {
            BigInteger bigInteger = this.f5073a;
            BigInteger bigInteger2 = this.f5074b;
            BigInteger bigIntegerAdd = this.f5075i.add(abstractC1386g.mo2928a());
            if (bigIntegerAdd.compareTo(this.f5073a) >= 0) {
                bigIntegerAdd = bigIntegerAdd.subtract(this.f5073a);
            }
            return new d(bigInteger, bigInteger2, bigIntegerAdd);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: b */
        public final AbstractC1386g mo2931b(AbstractC1386g abstractC1386g) {
            BigInteger bigInteger = this.f5073a;
            BigInteger bigInteger2 = this.f5074b;
            BigInteger bigIntegerSubtract = this.f5075i.subtract(abstractC1386g.mo2928a());
            if (bigIntegerSubtract.signum() < 0) {
                bigIntegerSubtract = bigIntegerSubtract.add(this.f5073a);
            }
            return new d(bigInteger, bigInteger2, bigIntegerSubtract);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1386g
        /* JADX INFO: renamed from: g */
        public final AbstractC1386g mo2938g() {
            if (mo2940j() || mo2939i()) {
                return this;
            }
            if (!this.f5073a.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f5073a.testBit(1)) {
                return m3444e(new d(this.f5073a, this.f5074b, this.f5075i.modPow(this.f5073a.shiftRight(2).add(InterfaceC1376c.f4995d), this.f5073a)));
            }
            if (this.f5073a.testBit(2)) {
                BigInteger bigIntegerModPow = this.f5075i.modPow(this.f5073a.shiftRight(3), this.f5073a);
                BigInteger bigIntegerM3439a = m3439a(bigIntegerModPow, this.f5075i);
                if (m3439a(bigIntegerM3439a, bigIntegerModPow).equals(InterfaceC1376c.f4995d)) {
                    return m3444e(new d(this.f5073a, this.f5074b, bigIntegerM3439a));
                }
                return m3444e(new d(this.f5073a, this.f5074b, m3439a(bigIntegerM3439a, InterfaceC1376c.f4996e.modPow(this.f5073a.shiftRight(2), this.f5073a))));
            }
            BigInteger bigIntegerShiftRight = this.f5073a.shiftRight(1);
            if (!this.f5075i.modPow(bigIntegerShiftRight, this.f5073a).equals(InterfaceC1376c.f4995d)) {
                return null;
            }
            BigInteger bigInteger = this.f5075i;
            BigInteger bigIntegerM3441b = m3441b(m3441b(bigInteger));
            BigInteger bigIntegerAdd = bigIntegerShiftRight.add(InterfaceC1376c.f4995d);
            BigInteger bigIntegerSubtract = this.f5073a.subtract(InterfaceC1376c.f4995d);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger2 = new BigInteger(this.f5073a.bitLength(), random);
                if (bigInteger2.compareTo(this.f5073a) < 0 && m3443d(bigInteger2.multiply(bigInteger2).subtract(bigIntegerM3441b)).modPow(bigIntegerShiftRight, this.f5073a).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrM3440a = m3440a(bigInteger2, bigInteger, bigIntegerAdd);
                    BigInteger bigInteger3 = bigIntegerArrM3440a[0];
                    BigInteger bigIntegerSubtract2 = bigIntegerArrM3440a[1];
                    if (m3439a(bigIntegerSubtract2, bigIntegerSubtract2).equals(bigIntegerM3441b)) {
                        BigInteger bigInteger4 = this.f5073a;
                        BigInteger bigInteger5 = this.f5074b;
                        if (bigIntegerSubtract2.testBit(0)) {
                            bigIntegerSubtract2 = this.f5073a.subtract(bigIntegerSubtract2);
                        }
                        return new d(bigInteger4, bigInteger5, bigIntegerSubtract2.shiftRight(1));
                    }
                    if (!bigInteger3.equals(InterfaceC1376c.f4995d) && !bigInteger3.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        private BigInteger m3442c(BigInteger bigInteger) {
            int iBitLength = this.f5073a.bitLength();
            int i = (iBitLength + 31) >> 5;
            int[] iArr = new int[i];
            AbstractC1415b.m3567a(AbstractC1416c.m3581a(iBitLength, this.f5073a), AbstractC1416c.m3581a(iBitLength, bigInteger), iArr);
            return AbstractC1416c.m3599d(i, iArr);
        }
    }
}
