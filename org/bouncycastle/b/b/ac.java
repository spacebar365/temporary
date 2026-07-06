package org.bouncycastle.b.b;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.b.e.ba;
import org.bouncycastle.b.k.bo;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements org.bouncycastle.f.e {
    private static final Hashtable c = new Hashtable();
    final ba a;
    long[] b;
    private final int d;
    private long[] e;
    private byte[] f;
    private ac$b[] g;
    private ac$b[] h;
    private final ac$c i;
    private final byte[] j;

    static {
        a(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        a(256, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        a(256, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        a(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        a(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        a(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        a(512, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        a(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        a(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public ac(int i, int i2) {
        this.j = new byte[1];
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :".concat(String.valueOf(i2)));
        }
        this.d = i2 / 8;
        this.a = new ba(i);
        this.i = new ac$c(this, this.a.b());
    }

    private void a(int i) {
        this.i.a(i);
    }

    private static void a(int i, int i2, long[] jArr) {
        c.put(a(i / 8, i2 / 8), jArr);
    }

    private void a(int i, byte[] bArr) {
        a(i);
        this.i.a(bArr, 0, bArr.length, this.b);
        f();
    }

    private void a(Hashtable hashtable) {
        Enumeration enumerationKeys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.f = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new ac$b(num.intValue(), bArr));
            } else {
                vector2.addElement(new ac$b(num.intValue(), bArr));
            }
        }
        this.g = new ac$b[vector.size()];
        vector.copyInto(this.g);
        a(this.g);
        this.h = new ac$b[vector2.size()];
        vector2.copyInto(this.h);
        a(this.h);
    }

    private void a(ac acVar) {
        this.i.a(acVar.i);
        this.b = org.bouncycastle.f.a.a(acVar.b, this.b);
        this.e = org.bouncycastle.f.a.a(acVar.e, this.e);
        this.f = org.bouncycastle.f.a.c(acVar.f, this.f);
        this.g = a(acVar.g, this.g);
        this.h = a(acVar.h, this.h);
    }

    private static void a(ac$b[] ac_bArr) {
        if (ac_bArr == null) {
            return;
        }
        for (int i = 1; i < ac_bArr.length; i++) {
            ac$b ac_b = ac_bArr[i];
            int i2 = i;
            while (i2 > 0 && ac_b.a() < ac_bArr[i2 - 1].a()) {
                ac_bArr[i2] = ac_bArr[i2 - 1];
                i2--;
            }
            ac_bArr[i2] = ac_b;
        }
    }

    private static ac$b[] a(ac$b[] ac_bArr, ac$b[] ac_bArr2) {
        if (ac_bArr == null) {
            return null;
        }
        if (ac_bArr2 == null || ac_bArr2.length != ac_bArr.length) {
            ac_bArr2 = new ac$b[ac_bArr.length];
        }
        System.arraycopy(ac_bArr, 0, ac_bArr2, 0, ac_bArr2.length);
        return ac_bArr2;
    }

    private void f() {
        this.i.a(this.b);
    }

    private void g() {
        if (this.i == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
    }

    public final int a() {
        return this.d;
    }

    public final void a(byte b) {
        this.j[0] = b;
        a(this.j, 0, 1);
    }

    public final void a(bo boVar) {
        this.b = null;
        this.f = null;
        this.g = null;
        this.h = null;
        if (boVar != null) {
            if (boVar.b().length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            a(boVar.a());
        }
        d();
        a(48);
    }

    public final void a(byte[] bArr, int i, int i2) {
        g();
        this.i.a(bArr, i, i2, this.b);
    }

    public final int b() {
        return this.a.b();
    }

    public final void c() {
        System.arraycopy(this.e, 0, this.b, 0, this.b.length);
        a(48);
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new ac(this);
    }

    private static Integer a(int i, int i2) {
        return Integer.valueOf((i2 << 16) | i);
    }

    public ac(ac acVar) {
        this(acVar.a.b() * 8, acVar.d * 8);
        a(acVar);
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        ac acVar = (ac) eVar;
        if (this.a.b() != acVar.a.b() || this.d != acVar.d) {
            throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        a(acVar);
    }

    private void d() {
        long[] jArr = (long[]) c.get(a(this.a.b(), this.d));
        if (this.f != null || jArr == null) {
            this.b = new long[this.a.b() / 8];
            if (this.f != null) {
                a(0, this.f);
            }
            a(4, new ac$a(this.d * 8).a());
        } else {
            this.b = org.bouncycastle.f.a.b(jArr);
        }
        if (this.g != null) {
            for (int i = 0; i < this.g.length; i++) {
                ac$b ac_b = this.g[i];
                a(ac_b.a(), ac_b.b());
            }
        }
        this.e = org.bouncycastle.f.a.b(this.b);
    }

    public final int a(byte[] bArr, int i) {
        g();
        if (bArr.length < this.d + i) {
            throw new org.bouncycastle.b.ac("Output buffer is too short to hold output");
        }
        f();
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.length; i2++) {
                ac$b ac_b = this.h[i2];
                a(ac_b.a(), ac_b.b());
            }
        }
        int iB = this.a.b();
        int i3 = ((this.d + iB) - 1) / iB;
        for (int i4 = 0; i4 < i3; i4++) {
            int iMin = Math.min(iB, this.d - (i4 * iB));
            int i5 = i + (i4 * iB);
            byte[] bArr2 = new byte[8];
            ba.a(i4, bArr2, 0);
            long[] jArr = new long[this.b.length];
            a(63);
            this.i.a(bArr2, 0, 8, jArr);
            this.i.a(jArr);
            int i6 = ((iMin + 8) - 1) / 8;
            for (int i7 = 0; i7 < i6; i7++) {
                int iMin2 = Math.min(8, iMin - (i7 * 8));
                if (iMin2 == 8) {
                    ba.a(jArr[i7], bArr, (i7 * 8) + i5);
                } else {
                    ba.a(jArr[i7], bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, (i7 * 8) + i5, iMin2);
                }
            }
        }
        c();
        return this.d;
    }
}
