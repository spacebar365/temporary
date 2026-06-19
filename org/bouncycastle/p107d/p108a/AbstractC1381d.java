package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.p113b.InterfaceC1372a;
import org.bouncycastle.p107d.p108a.p113b.InterfaceC1373b;
import org.bouncycastle.p107d.p116b.AbstractC1408c;
import org.bouncycastle.p107d.p116b.InterfaceC1407b;
import org.bouncycastle.p107d.p116b.InterfaceC1412g;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.d.a.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1381d {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1407b f5003a;

    /* JADX INFO: renamed from: b */
    protected AbstractC1386g f5004b;

    /* JADX INFO: renamed from: c */
    protected AbstractC1386g f5005c;

    /* JADX INFO: renamed from: d */
    protected BigInteger f5006d;

    /* JADX INFO: renamed from: e */
    protected BigInteger f5007e;

    /* JADX INFO: renamed from: f */
    protected int f5008f = 0;

    /* JADX INFO: renamed from: g */
    protected InterfaceC1372a f5009g = null;

    /* JADX INFO: renamed from: h */
    protected InterfaceC1388i f5010h = null;

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d$b */
    public static abstract class b extends AbstractC1381d {
        protected b(BigInteger bigInteger) {
            super(AbstractC1408c.m3554a(bigInteger));
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        protected final AbstractC1389j mo3353a(int i, BigInteger bigInteger) {
            AbstractC1386g abstractC1386gA = mo2906a(bigInteger);
            AbstractC1386g abstractC1386gMo2938g = abstractC1386gA.mo2936e().mo2929a(this.f5004b).mo2933c(abstractC1386gA).mo2929a(this.f5005c).mo2938g();
            if (abstractC1386gMo2938g == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (abstractC1386gMo2938g.mo2941k() != (i == 1)) {
                abstractC1386gMo2938g = abstractC1386gMo2938g.mo2934d();
            }
            return mo2908a(abstractC1386gA, abstractC1386gMo2938g, true);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: b */
        public final boolean mo3364b(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(m3365f().mo3552a()) < 0;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d$c */
    public class c {

        /* JADX INFO: renamed from: a */
        protected int f5012a;

        /* JADX INFO: renamed from: b */
        protected InterfaceC1372a f5013b;

        /* JADX INFO: renamed from: c */
        protected InterfaceC1388i f5014c;

        c(int i, InterfaceC1372a interfaceC1372a, InterfaceC1388i interfaceC1388i) {
            this.f5012a = i;
            this.f5013b = interfaceC1372a;
            this.f5014c = interfaceC1388i;
        }

        /* JADX INFO: renamed from: a */
        public final c m3375a(InterfaceC1372a interfaceC1372a) {
            this.f5013b = interfaceC1372a;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC1381d m3376a() {
            if (!AbstractC1381d.this.mo2910a(this.f5012a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            AbstractC1381d abstractC1381dMo2911c = AbstractC1381d.this.mo2911c();
            if (abstractC1381dMo2911c == AbstractC1381d.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (abstractC1381dMo2911c) {
                abstractC1381dMo2911c.f5008f = this.f5012a;
                abstractC1381dMo2911c.f5009g = this.f5013b;
                abstractC1381dMo2911c.f5010h = this.f5014c;
            }
            return abstractC1381dMo2911c;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d$e */
    public static class e extends b {

        /* JADX INFO: renamed from: i */
        BigInteger f5021i;

        /* JADX INFO: renamed from: j */
        BigInteger f5022j;

        /* JADX INFO: renamed from: k */
        AbstractC1389j.d f5023k;

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f5021i = bigInteger;
            this.f5022j = AbstractC1386g.d.m3438a(bigInteger);
            this.f5023k = new AbstractC1389j.d(this, null, null, false);
            this.f5004b = mo2906a(bigInteger2);
            this.f5005c = mo2906a(bigInteger3);
            this.f5006d = bigInteger4;
            this.f5007e = bigInteger5;
            this.f5008f = 4;
        }

        private e(BigInteger bigInteger, BigInteger bigInteger2, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f5021i = bigInteger;
            this.f5022j = bigInteger2;
            this.f5023k = new AbstractC1389j.d(this, null, null, false);
            this.f5004b = abstractC1386g;
            this.f5005c = abstractC1386g2;
            this.f5006d = bigInteger3;
            this.f5007e = bigInteger4;
            this.f5008f = 4;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final int mo2905a() {
            return this.f5021i.bitLength();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo2906a(BigInteger bigInteger) {
            return new AbstractC1386g.d(this.f5021i, this.f5022j, bigInteger);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
            return new AbstractC1389j.d(this, abstractC1386g, abstractC1386g2, z);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
            return new AbstractC1389j.d(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final AbstractC1389j mo3356a(AbstractC1389j abstractC1389j) {
            if (this != abstractC1389j.m3459d() && m3370k() == 2 && !abstractC1389j.m3469p()) {
                switch (abstractC1389j.m3459d().m3370k()) {
                    case 2:
                    case 3:
                    case 4:
                        return new AbstractC1389j.d(this, mo2906a(abstractC1389j.f5078c.mo2928a()), mo2906a(abstractC1389j.f5079d.mo2928a()), new AbstractC1386g[]{mo2906a(abstractC1389j.f5080e[0].mo2928a())}, abstractC1389j.f5081f);
                }
            }
            return super.mo3356a(abstractC1389j);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final boolean mo2910a(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 4:
                    return true;
                case 3:
                default:
                    return false;
            }
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: c */
        protected final AbstractC1381d mo2911c() {
            return new e(this.f5021i, this.f5022j, this.f5004b, this.f5005c, this.f5006d, this.f5007e);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: e */
        public final AbstractC1389j mo2912e() {
            return this.f5023k;
        }
    }

    protected AbstractC1381d(InterfaceC1407b interfaceC1407b) {
        this.f5003a = interfaceC1407b;
    }

    /* JADX INFO: renamed from: a */
    private void m3351a(AbstractC1389j[] abstractC1389jArr, int i, int i2) {
        if (abstractC1389jArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > abstractC1389jArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i + i3];
            if (abstractC1389j != null && this != abstractC1389j.m3459d()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3352b(AbstractC1389j abstractC1389j) {
        if (abstractC1389j == null || this != abstractC1389j.m3459d()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2905a();

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1386g mo2906a(BigInteger bigInteger);

    /* JADX INFO: renamed from: a */
    public InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        int iMo2905a = (mo2905a() + 7) >>> 3;
        byte[] bArr = new byte[i * iMo2905a * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i2 + 0];
            byte[] byteArray = abstractC1389j.m3464k().mo2928a().toByteArray();
            byte[] byteArray2 = abstractC1389j.m3465l().mo2928a().toByteArray();
            int i4 = byteArray.length > iMo2905a ? 1 : 0;
            int length = byteArray.length - i4;
            int i5 = byteArray2.length > iMo2905a ? 1 : 0;
            int length2 = byteArray2.length - i5;
            System.arraycopy(byteArray, i4, bArr, (i3 + iMo2905a) - length, length);
            int i6 = i3 + iMo2905a;
            System.arraycopy(byteArray2, i5, bArr, (i6 + iMo2905a) - length2, length2);
            i2++;
            i3 = i6 + iMo2905a;
        }
        return new C1384e(this, i, iMo2905a, bArr);
    }

    /* JADX INFO: renamed from: a */
    protected abstract AbstractC1389j mo3353a(int i, BigInteger bigInteger);

    /* JADX INFO: renamed from: a */
    public AbstractC1389j mo3355a(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return mo2908a(mo2906a(bigInteger), mo2906a(bigInteger2), z);
    }

    /* JADX INFO: renamed from: a */
    protected abstract AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z);

    /* JADX INFO: renamed from: a */
    protected abstract AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z);

    /* JADX INFO: renamed from: a */
    public AbstractC1389j mo3356a(AbstractC1389j abstractC1389j) {
        if (this == abstractC1389j.m3459d()) {
            return abstractC1389j;
        }
        if (abstractC1389j.m3469p()) {
            return mo2912e();
        }
        AbstractC1389j abstractC1389jM3468o = abstractC1389j.m3468o();
        return mo3355a(abstractC1389jM3468o.m3463i().mo2928a(), abstractC1389jM3468o.mo3061j().mo2928a(), abstractC1389jM3468o.f5081f);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1389j m3357a(byte[] bArr) {
        AbstractC1389j abstractC1389jM3354a;
        int iMo2905a = (mo2905a() + 7) / 8;
        byte b2 = bArr[0];
        switch (b2) {
            case 0:
                if (bArr.length != 1) {
                    throw new IllegalArgumentException("Incorrect length for infinity encoding");
                }
                abstractC1389jM3354a = mo2912e();
                break;
            case 1:
            case 5:
            default:
                throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b2, 16));
            case 2:
            case 3:
                if (bArr.length != iMo2905a + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                abstractC1389jM3354a = mo3353a(b2 & 1, C1544b.m4116a(bArr, 1, iMo2905a));
                if (!abstractC1389jM3354a.m3451a(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
                break;
            case 4:
                if (bArr.length != (iMo2905a * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                abstractC1389jM3354a = m3354a(C1544b.m4116a(bArr, 1, iMo2905a), C1544b.m4116a(bArr, iMo2905a + 1, iMo2905a));
                break;
            case 6:
            case 7:
                if (bArr.length != (iMo2905a * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerM4116a = C1544b.m4116a(bArr, 1, iMo2905a);
                BigInteger bigIntegerM4116a2 = C1544b.m4116a(bArr, iMo2905a + 1, iMo2905a);
                if (bigIntegerM4116a2.testBit(0) != (b2 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                abstractC1389jM3354a = m3354a(bigIntegerM4116a, bigIntegerM4116a2);
                break;
        }
        if (b2 == 0 || !abstractC1389jM3354a.m3469p()) {
            return abstractC1389jM3354a;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1399t m3358a(AbstractC1389j abstractC1389j, String str) {
        Hashtable hashtable;
        InterfaceC1399t interfaceC1399t;
        m3352b(abstractC1389j);
        synchronized (abstractC1389j) {
            hashtable = abstractC1389j.f5082g;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            interfaceC1399t = (InterfaceC1399t) hashtable.get(str);
        }
        return interfaceC1399t;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1399t m3359a(AbstractC1389j abstractC1389j, String str, InterfaceC1398s interfaceC1398s) {
        Hashtable hashtable;
        InterfaceC1399t interfaceC1399tMo3266a;
        m3352b(abstractC1389j);
        synchronized (abstractC1389j) {
            Hashtable hashtable2 = abstractC1389j.f5082g;
            if (hashtable2 == null) {
                Hashtable hashtable3 = new Hashtable(4);
                abstractC1389j.f5082g = hashtable3;
                hashtable = hashtable3;
            } else {
                hashtable = hashtable2;
            }
        }
        synchronized (hashtable) {
            InterfaceC1399t interfaceC1399t = (InterfaceC1399t) hashtable.get(str);
            interfaceC1399tMo3266a = interfaceC1398s.mo3266a(interfaceC1399t);
            if (interfaceC1399tMo3266a != interfaceC1399t) {
                hashtable.put(str, interfaceC1399tMo3266a);
            }
        }
        return interfaceC1399tMo3266a;
    }

    /* JADX INFO: renamed from: a */
    public final void m3360a(AbstractC1389j[] abstractC1389jArr) {
        m3361a(abstractC1389jArr, 0, abstractC1389jArr.length, (AbstractC1386g) null);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo2910a(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized c m3363b() {
        return new c(this.f5008f, this.f5009g, this.f5010h);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3364b(BigInteger bigInteger);

    /* JADX INFO: renamed from: c */
    protected abstract AbstractC1381d mo2911c();

    /* JADX INFO: renamed from: d */
    protected InterfaceC1388i mo3097d() {
        return this.f5009g instanceof InterfaceC1373b ? new C1396q(this, (InterfaceC1373b) this.f5009g) : new C1404y();
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC1389j mo2912e();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AbstractC1381d) && m3362a((AbstractC1381d) obj));
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC1407b m3365f() {
        return this.f5003a;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1386g m3366g() {
        return this.f5004b;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC1386g m3367h() {
        return this.f5005c;
    }

    /* JADX INFO: renamed from: i */
    public final BigInteger m3368i() {
        return this.f5006d;
    }

    /* JADX INFO: renamed from: j */
    public final BigInteger m3369j() {
        return this.f5007e;
    }

    /* JADX INFO: renamed from: k */
    public final int m3370k() {
        return this.f5008f;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC1372a m3371l() {
        return this.f5009g;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized InterfaceC1388i m3372m() {
        if (this.f5010h == null) {
            this.f5010h = mo3097d();
        }
        return this.f5010h;
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d$a */
    public static abstract class a extends AbstractC1381d {

        /* JADX INFO: renamed from: i */
        private BigInteger[] f5011i;

        /* JADX INFO: renamed from: a */
        protected final AbstractC1386g m3373a(AbstractC1386g abstractC1386g) {
            AbstractC1386g abstractC1386gMo2929a;
            if (abstractC1386g.mo2940j()) {
                return abstractC1386g;
            }
            AbstractC1386g abstractC1386gA = mo2906a(InterfaceC1376c.f4994c);
            int iA = mo2905a();
            Random random = new Random();
            do {
                AbstractC1386g abstractC1386gA2 = mo2906a(new BigInteger(iA, random));
                AbstractC1386g abstractC1386gMo2929a2 = abstractC1386g;
                abstractC1386gMo2929a = abstractC1386gA;
                for (int i = 1; i < iA; i++) {
                    AbstractC1386g abstractC1386gMo2936e = abstractC1386gMo2929a2.mo2936e();
                    abstractC1386gMo2929a = abstractC1386gMo2929a.mo2936e().mo2929a(abstractC1386gMo2936e.mo2933c(abstractC1386gA2));
                    abstractC1386gMo2929a2 = abstractC1386gMo2936e.mo2929a(abstractC1386g);
                }
                if (!abstractC1386gMo2929a2.mo2940j()) {
                    return null;
                }
            } while (abstractC1386gMo2929a.mo2936e().mo2929a(abstractC1386gMo2929a).mo2940j());
            return abstractC1386gMo2929a;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        protected final AbstractC1389j mo3353a(int i, BigInteger bigInteger) {
            AbstractC1386g abstractC1386gMo2929a;
            AbstractC1386g abstractC1386gA = mo2906a(bigInteger);
            if (abstractC1386gA.mo2940j()) {
                abstractC1386gMo2929a = m3367h().mo2938g();
            } else {
                AbstractC1386g abstractC1386gM3373a = m3373a(abstractC1386gA.mo2936e().mo2937f().mo2933c(m3367h()).mo2929a(m3366g()).mo2929a(abstractC1386gA));
                if (abstractC1386gM3373a != null) {
                    if (abstractC1386gM3373a.mo2941k() != (i == 1)) {
                        abstractC1386gM3373a = abstractC1386gM3373a.mo2932c();
                    }
                    switch (m3370k()) {
                        case 5:
                        case 6:
                            abstractC1386gMo2929a = abstractC1386gM3373a.mo2929a(abstractC1386gA);
                            break;
                        default:
                            abstractC1386gMo2929a = abstractC1386gM3373a.mo2933c(abstractC1386gA);
                            break;
                    }
                } else {
                    abstractC1386gMo2929a = null;
                }
            }
            if (abstractC1386gMo2929a == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            return mo2908a(abstractC1386gA, abstractC1386gMo2929a, true);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final AbstractC1389j mo3355a(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            AbstractC1386g abstractC1386gA = mo2906a(bigInteger);
            AbstractC1386g abstractC1386gA2 = mo2906a(bigInteger2);
            switch (m3370k()) {
                case 5:
                case 6:
                    if (!abstractC1386gA.mo2940j()) {
                        abstractC1386gA2 = abstractC1386gA2.mo2935d(abstractC1386gA).mo2929a(abstractC1386gA);
                    } else if (!abstractC1386gA2.mo2936e().equals(m3367h())) {
                        throw new IllegalArgumentException();
                    }
                    break;
            }
            return mo2908a(abstractC1386gA, abstractC1386gA2, z);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: b */
        public final boolean mo3364b(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= mo2905a();
        }

        /* JADX INFO: renamed from: n */
        final synchronized BigInteger[] m3374n() {
            if (this.f5011i == null) {
                this.f5011i = C1402w.m3538a(this);
            }
            return this.f5011i;
        }

        /* JADX INFO: renamed from: o */
        public boolean mo3060o() {
            return this.f5006d != null && this.f5007e != null && this.f5005c.mo2939i() && (this.f5004b.mo2940j() || this.f5004b.mo2939i());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        protected a(int i, int i2, int i3, int i4) {
            InterfaceC1412g interfaceC1412gM3555a;
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i3 == 0) {
                if (i4 != 0) {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                interfaceC1412gM3555a = AbstractC1408c.m3555a(new int[]{0, i2, i});
            } else {
                if (i3 <= i2) {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (i4 <= i3) {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
                interfaceC1412gM3555a = AbstractC1408c.m3555a(new int[]{0, i2, i3, i4, i});
            }
            super(interfaceC1412gM3555a);
            this.f5011i = null;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.d.a.d$d */
    public static class d extends a {

        /* JADX INFO: renamed from: i */
        private int f5016i;

        /* JADX INFO: renamed from: j */
        private int f5017j;

        /* JADX INFO: renamed from: k */
        private int f5018k;

        /* JADX INFO: renamed from: l */
        private int f5019l;

        /* JADX INFO: renamed from: m */
        private AbstractC1389j.c f5020m;

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f5016i = i;
            this.f5017j = i2;
            this.f5018k = i3;
            this.f5019l = i4;
            this.f5006d = bigInteger3;
            this.f5007e = bigInteger4;
            this.f5020m = new AbstractC1389j.c(this, null, null, false);
            this.f5004b = mo2906a(bigInteger);
            this.f5005c = mo2906a(bigInteger2);
            this.f5008f = 6;
        }

        private d(int i, int i2, int i3, int i4, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f5016i = i;
            this.f5017j = i2;
            this.f5018k = i3;
            this.f5019l = i4;
            this.f5006d = bigInteger;
            this.f5007e = bigInteger2;
            this.f5020m = new AbstractC1389j.c(this, null, null, false);
            this.f5004b = abstractC1386g;
            this.f5005c = abstractC1386g2;
            this.f5008f = 6;
        }

        public d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final int mo2905a() {
            return this.f5016i;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final AbstractC1386g mo2906a(BigInteger bigInteger) {
            return new AbstractC1386g.c(this.f5016i, this.f5017j, this.f5018k, this.f5019l, bigInteger);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
            return new AbstractC1389j.c(this, abstractC1386g, abstractC1386g2, z);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
            return new AbstractC1389j.c(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final boolean mo2910a(int i) {
            switch (i) {
                case 0:
                case 1:
                case 6:
                    return true;
                default:
                    return false;
            }
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: c */
        protected final AbstractC1381d mo2911c() {
            return new d(this.f5016i, this.f5017j, this.f5018k, this.f5019l, this.f5004b, this.f5005c, this.f5006d, this.f5007e);
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: d */
        protected final InterfaceC1388i mo3097d() {
            return mo3060o() ? new C1367ad() : super.mo3097d();
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: e */
        public final AbstractC1389j mo2912e() {
            return this.f5020m;
        }

        @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
        /* JADX INFO: renamed from: a */
        public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
            int i2 = (this.f5016i + 63) >>> 6;
            int[] iArr = this.f5018k == 0 && this.f5019l == 0 ? new int[]{this.f5017j} : new int[]{this.f5017j, this.f5018k, this.f5019l};
            long[] jArr = new long[i * i2 * 2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                AbstractC1389j abstractC1389j = abstractC1389jArr[i4 + 0];
                ((AbstractC1386g.c) abstractC1389j.m3464k()).f5069a.m3514a(jArr, i3);
                int i5 = i3 + i2;
                ((AbstractC1386g.c) abstractC1389j.m3465l()).f5069a.m3514a(jArr, i5);
                i3 = i5 + i2;
            }
            return new C1385f(this, i, i2, jArr, iArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1389j m3354a(BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC1389j abstractC1389jMo3355a = mo3355a(bigInteger, bigInteger2, false);
        if (abstractC1389jMo3355a.m3451a(false, true)) {
            return abstractC1389jMo3355a;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    /* JADX INFO: renamed from: a */
    public final void m3361a(AbstractC1389j[] abstractC1389jArr, int i, int i2, AbstractC1386g abstractC1386g) {
        m3351a(abstractC1389jArr, i, i2);
        switch (this.f5008f) {
            case 0:
            case 5:
                if (abstractC1386g != null) {
                    throw new IllegalArgumentException("'iso' not valid for affine coordinates");
                }
                return;
            default:
                AbstractC1386g[] abstractC1386gArr = new AbstractC1386g[i2];
                int[] iArr = new int[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    AbstractC1389j abstractC1389j = abstractC1389jArr[i + i4];
                    if (abstractC1389j != null && (abstractC1386g != null || !abstractC1389j.m3467n())) {
                        abstractC1386gArr[i3] = abstractC1389j.mo2945a(0);
                        iArr[i3] = i + i4;
                        i3++;
                    }
                }
                if (i3 == 0) {
                    return;
                }
                C1371b.m3277a(abstractC1386gArr, i3, abstractC1386g);
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr[i5];
                    abstractC1389jArr[i6] = abstractC1389jArr[i6].m3448a(abstractC1386gArr[i5]);
                }
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3362a(AbstractC1381d abstractC1381d) {
        return this == abstractC1381d || (abstractC1381d != null && this.f5003a.equals(abstractC1381d.f5003a) && this.f5004b.mo2928a().equals(abstractC1381d.f5004b.mo2928a()) && this.f5005c.mo2928a().equals(abstractC1381d.f5005c.mo2928a()));
    }

    public int hashCode() {
        return (this.f5003a.hashCode() ^ Integer.rotateLeft(this.f5004b.mo2928a().hashCode(), 8)) ^ Integer.rotateLeft(this.f5005c.mo2928a().hashCode(), 16);
    }
}
