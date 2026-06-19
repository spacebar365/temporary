package org.bouncycastle.p083b.p086b;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.p089e.C0919ba;
import org.bouncycastle.p083b.p097k.C1090bo;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C0822ac implements InterfaceC1554e {

    /* JADX INFO: renamed from: c */
    private static final Hashtable f3355c = new Hashtable();

    /* JADX INFO: renamed from: a */
    final C0919ba f3356a;

    /* JADX INFO: renamed from: b */
    long[] f3357b;

    /* JADX INFO: renamed from: d */
    private final int f3358d;

    /* JADX INFO: renamed from: e */
    private long[] f3359e;

    /* JADX INFO: renamed from: f */
    private byte[] f3360f;

    /* JADX INFO: renamed from: g */
    private b[] f3361g;

    /* JADX INFO: renamed from: h */
    private b[] f3362h;

    /* JADX INFO: renamed from: i */
    private final c f3363i;

    /* JADX INFO: renamed from: j */
    private final byte[] f3364j;

    /* JADX INFO: renamed from: org.bouncycastle.b.b.ac$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private byte[] f3365a = new byte[32];

        public a(long j) {
            this.f3365a[0] = 83;
            this.f3365a[1] = 72;
            this.f3365a[2] = 65;
            this.f3365a[3] = 51;
            this.f3365a[4] = 1;
            this.f3365a[5] = 0;
            C0919ba.m2270a(j, this.f3365a, 8);
        }

        /* JADX INFO: renamed from: a */
        public final byte[] m1961a() {
            return this.f3365a;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.b.ac$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private int f3366a;

        /* JADX INFO: renamed from: b */
        private byte[] f3367b;

        public b(int i, byte[] bArr) {
            this.f3366a = i;
            this.f3367b = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final int m1962a() {
            return this.f3366a;
        }

        /* JADX INFO: renamed from: b */
        public final byte[] m1963b() {
            return this.f3367b;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.b.ac$c */
    private class c {

        /* JADX INFO: renamed from: b */
        private final d f3369b = new d();

        /* JADX INFO: renamed from: c */
        private byte[] f3370c;

        /* JADX INFO: renamed from: d */
        private int f3371d;

        /* JADX INFO: renamed from: e */
        private long[] f3372e;

        public c(int i) {
            this.f3370c = new byte[i];
            this.f3372e = new long[this.f3370c.length / 8];
        }

        /* JADX INFO: renamed from: b */
        private void m1964b(long[] jArr) {
            C0822ac.this.f3356a.m2279a(true, C0822ac.this.f3357b, this.f3369b.m1975c());
            for (int i = 0; i < this.f3372e.length; i++) {
                this.f3372e[i] = C0919ba.m2269a(this.f3370c, i * 8);
            }
            C0822ac.this.f3356a.m2278a(this.f3372e, jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jArr[i2] ^ this.f3372e[i2];
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m1965a(int i) {
            this.f3369b.m1969a();
            this.f3369b.m1970a(i);
            this.f3371d = 0;
        }

        /* JADX INFO: renamed from: a */
        public final void m1966a(c cVar) {
            this.f3370c = C1535a.m4091c(cVar.f3370c, this.f3370c);
            this.f3371d = cVar.f3371d;
            this.f3372e = C1535a.m4081a(cVar.f3372e, this.f3372e);
            this.f3369b.m1971a(cVar.f3369b);
        }

        /* JADX INFO: renamed from: a */
        public final void m1967a(byte[] bArr, int i, int i2, long[] jArr) {
            int i3 = 0;
            while (i2 > i3) {
                if (this.f3371d == this.f3370c.length) {
                    m1964b(jArr);
                    this.f3369b.m1972a(false);
                    this.f3371d = 0;
                }
                int iMin = Math.min(i2 - i3, this.f3370c.length - this.f3371d);
                System.arraycopy(bArr, i + i3, this.f3370c, this.f3371d, iMin);
                i3 += iMin;
                this.f3371d += iMin;
                this.f3369b.m1974b(iMin);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m1968a(long[] jArr) {
            for (int i = this.f3371d; i < this.f3370c.length; i++) {
                this.f3370c[i] = 0;
            }
            this.f3369b.m1973b();
            m1964b(jArr);
        }
    }

    static {
        m1945a(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        m1945a(256, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        m1945a(256, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        m1945a(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        m1945a(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        m1945a(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        m1945a(512, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        m1945a(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        m1945a(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public C0822ac(int i, int i2) {
        this.f3364j = new byte[1];
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :".concat(String.valueOf(i2)));
        }
        this.f3358d = i2 / 8;
        this.f3356a = new C0919ba(i);
        this.f3363i = new c(this.f3356a.mo2125b());
    }

    /* JADX INFO: renamed from: a */
    private void m1944a(int i) {
        this.f3363i.m1965a(i);
    }

    /* JADX INFO: renamed from: a */
    private static void m1945a(int i, int i2, long[] jArr) {
        f3355c.put(m1943a(i / 8, i2 / 8), jArr);
    }

    /* JADX INFO: renamed from: a */
    private void m1946a(int i, byte[] bArr) {
        m1944a(i);
        this.f3363i.m1967a(bArr, 0, bArr.length, this.f3357b);
        m1952f();
    }

    /* JADX INFO: renamed from: a */
    private void m1947a(Hashtable hashtable) {
        Enumeration enumerationKeys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.f3360f = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new b(num.intValue(), bArr));
            } else {
                vector2.addElement(new b(num.intValue(), bArr));
            }
        }
        this.f3361g = new b[vector.size()];
        vector.copyInto(this.f3361g);
        m1949a(this.f3361g);
        this.f3362h = new b[vector2.size()];
        vector2.copyInto(this.f3362h);
        m1949a(this.f3362h);
    }

    /* JADX INFO: renamed from: a */
    private void m1948a(C0822ac c0822ac) {
        this.f3363i.m1966a(c0822ac.f3363i);
        this.f3357b = C1535a.m4081a(c0822ac.f3357b, this.f3357b);
        this.f3359e = C1535a.m4081a(c0822ac.f3359e, this.f3359e);
        this.f3360f = C1535a.m4091c(c0822ac.f3360f, this.f3360f);
        this.f3361g = m1950a(c0822ac.f3361g, this.f3361g);
        this.f3362h = m1950a(c0822ac.f3362h, this.f3362h);
    }

    /* JADX INFO: renamed from: a */
    private static void m1949a(b[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (int i = 1; i < bVarArr.length; i++) {
            b bVar = bVarArr[i];
            int i2 = i;
            while (i2 > 0 && bVar.m1962a() < bVarArr[i2 - 1].m1962a()) {
                bVarArr[i2] = bVarArr[i2 - 1];
                i2--;
            }
            bVarArr[i2] = bVar;
        }
    }

    /* JADX INFO: renamed from: a */
    private static b[] m1950a(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null) {
            return null;
        }
        if (bVarArr2 == null || bVarArr2.length != bVarArr.length) {
            bVarArr2 = new b[bVarArr.length];
        }
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr2.length);
        return bVarArr2;
    }

    /* JADX INFO: renamed from: f */
    private void m1952f() {
        this.f3363i.m1968a(this.f3357b);
    }

    /* JADX INFO: renamed from: g */
    private void m1953g() {
        if (this.f3363i == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1954a() {
        return this.f3358d;
    }

    /* JADX INFO: renamed from: a */
    public final void m1956a(byte b2) {
        this.f3364j[0] = b2;
        m1958a(this.f3364j, 0, 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m1957a(C1090bo c1090bo) {
        this.f3357b = null;
        this.f3360f = null;
        this.f3361g = null;
        this.f3362h = null;
        if (c1090bo != null) {
            if (c1090bo.m2634b().length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            m1947a(c1090bo.m2633a());
        }
        m1951d();
        m1944a(48);
    }

    /* JADX INFO: renamed from: a */
    public final void m1958a(byte[] bArr, int i, int i2) {
        m1953g();
        this.f3363i.m1967a(bArr, i, i2, this.f3357b);
    }

    /* JADX INFO: renamed from: b */
    public final int m1959b() {
        return this.f3356a.mo2125b();
    }

    /* JADX INFO: renamed from: c */
    public final void m1960c() {
        System.arraycopy(this.f3359e, 0, this.f3357b, 0, this.f3357b.length);
        m1944a(48);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0822ac(this);
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.b.ac$d */
    private static class d {

        /* JADX INFO: renamed from: a */
        private long[] f3373a = new long[2];

        /* JADX INFO: renamed from: b */
        private boolean f3374b;

        public d() {
            m1969a();
        }

        /* JADX INFO: renamed from: a */
        public final void m1969a() {
            this.f3373a[0] = 0;
            this.f3373a[1] = 0;
            this.f3374b = false;
            m1972a(true);
        }

        /* JADX INFO: renamed from: a */
        public final void m1970a(int i) {
            this.f3373a[1] = (this.f3373a[1] & (-274877906944L)) | ((((long) i) & 63) << 56);
        }

        /* JADX INFO: renamed from: a */
        public final void m1971a(d dVar) {
            this.f3373a = C1535a.m4081a(dVar.f3373a, this.f3373a);
            this.f3374b = dVar.f3374b;
        }

        /* JADX INFO: renamed from: a */
        public final void m1972a(boolean z) {
            if (z) {
                long[] jArr = this.f3373a;
                jArr[1] = jArr[1] | 4611686018427387904L;
            } else {
                long[] jArr2 = this.f3373a;
                jArr2[1] = jArr2[1] & (-4611686018427387905L);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m1973b() {
            long[] jArr = this.f3373a;
            jArr[1] = jArr[1] | Long.MIN_VALUE;
        }

        /* JADX INFO: renamed from: b */
        public final void m1974b(int i) {
            if (!this.f3374b) {
                long j = this.f3373a[0] + ((long) i);
                this.f3373a[0] = j;
                if (j > 9223372034707292160L) {
                    this.f3374b = true;
                    return;
                }
                return;
            }
            long[] jArr = new long[3];
            jArr[0] = this.f3373a[0] & 4294967295L;
            jArr[1] = (this.f3373a[0] >>> 32) & 4294967295L;
            jArr[2] = this.f3373a[1] & 4294967295L;
            long j2 = i;
            for (int i2 = 0; i2 < 3; i2++) {
                long j3 = j2 + jArr[i2];
                jArr[i2] = j3;
                j2 = j3 >>> 32;
            }
            this.f3373a[0] = ((jArr[1] & 4294967295L) << 32) | (jArr[0] & 4294967295L);
            this.f3373a[1] = (this.f3373a[1] & (-4294967296L)) | (jArr[2] & 4294967295L);
        }

        /* JADX INFO: renamed from: c */
        public final long[] m1975c() {
            return this.f3373a;
        }

        public final String toString() {
            return ((int) ((this.f3373a[1] >>> 56) & 63)) + " first: " + ((this.f3373a[1] & 4611686018427387904L) != 0) + ", final: " + ((this.f3373a[1] & Long.MIN_VALUE) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static Integer m1943a(int i, int i2) {
        return Integer.valueOf((i2 << 16) | i);
    }

    public C0822ac(C0822ac c0822ac) {
        this(c0822ac.f3356a.mo2125b() * 8, c0822ac.f3358d * 8);
        m1948a(c0822ac);
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: a */
    public final void mo1939a(InterfaceC1554e interfaceC1554e) {
        C0822ac c0822ac = (C0822ac) interfaceC1554e;
        if (this.f3356a.mo2125b() != c0822ac.f3356a.mo2125b() || this.f3358d != c0822ac.f3358d) {
            throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        m1948a(c0822ac);
    }

    /* JADX INFO: renamed from: d */
    private void m1951d() {
        long[] jArr = (long[]) f3355c.get(m1943a(this.f3356a.mo2125b(), this.f3358d));
        if (this.f3360f != null || jArr == null) {
            this.f3357b = new long[this.f3356a.mo2125b() / 8];
            if (this.f3360f != null) {
                m1946a(0, this.f3360f);
            }
            m1946a(4, new a(this.f3358d * 8).m1961a());
        } else {
            this.f3357b = C1535a.m4088b(jArr);
        }
        if (this.f3361g != null) {
            for (int i = 0; i < this.f3361g.length; i++) {
                b bVar = this.f3361g[i];
                m1946a(bVar.m1962a(), bVar.m1963b());
            }
        }
        this.f3359e = C1535a.m4088b(this.f3357b);
    }

    /* JADX INFO: renamed from: a */
    public final int m1955a(byte[] bArr, int i) {
        m1953g();
        if (bArr.length < this.f3358d + i) {
            throw new C0803ac("Output buffer is too short to hold output");
        }
        m1952f();
        if (this.f3362h != null) {
            for (int i2 = 0; i2 < this.f3362h.length; i2++) {
                b bVar = this.f3362h[i2];
                m1946a(bVar.m1962a(), bVar.m1963b());
            }
        }
        int iMo2125b = this.f3356a.mo2125b();
        int i3 = ((this.f3358d + iMo2125b) - 1) / iMo2125b;
        for (int i4 = 0; i4 < i3; i4++) {
            int iMin = Math.min(iMo2125b, this.f3358d - (i4 * iMo2125b));
            int i5 = i + (i4 * iMo2125b);
            byte[] bArr2 = new byte[8];
            C0919ba.m2270a(i4, bArr2, 0);
            long[] jArr = new long[this.f3357b.length];
            m1944a(63);
            this.f3363i.m1967a(bArr2, 0, 8, jArr);
            this.f3363i.m1968a(jArr);
            int i6 = ((iMin + 8) - 1) / 8;
            for (int i7 = 0; i7 < i6; i7++) {
                int iMin2 = Math.min(8, iMin - (i7 * 8));
                if (iMin2 == 8) {
                    C0919ba.m2270a(jArr[i7], bArr, (i7 * 8) + i5);
                } else {
                    C0919ba.m2270a(jArr[i7], bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, (i7 * 8) + i5, iMin2);
                }
            }
        }
        m1960c();
        return this.f3358d;
    }
}
