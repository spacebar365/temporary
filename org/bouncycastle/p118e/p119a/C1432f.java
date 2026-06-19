package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p118e.p120b.p124d.C1453a;
import org.bouncycastle.p118e.p120b.p124d.p125a.C1454a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1432f extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0640m f5196a;

    /* JADX INFO: renamed from: b */
    private C0653p f5197b;

    /* JADX INFO: renamed from: c */
    private byte[][] f5198c;

    /* JADX INFO: renamed from: d */
    private byte[] f5199d;

    /* JADX INFO: renamed from: e */
    private byte[][] f5200e;

    /* JADX INFO: renamed from: f */
    private byte[] f5201f;

    /* JADX INFO: renamed from: g */
    private byte[] f5202g;

    /* JADX INFO: renamed from: h */
    private C1453a[] f5203h;

    private C1432f(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1482a(0) instanceof C0640m) {
            this.f5196a = C0640m.m1561a(abstractC0723v.mo1482a(0));
        } else {
            this.f5197b = C0653p.m1584a(abstractC0723v.mo1482a(0));
        }
        AbstractC0723v abstractC0723v2 = (AbstractC0723v) abstractC0723v.mo1482a(1);
        this.f5198c = new byte[abstractC0723v2.mo1484d()][];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= abstractC0723v2.mo1484d()) {
                break;
            }
            this.f5198c[i2] = ((AbstractC0655q) abstractC0723v2.mo1482a(i2)).mo1410c();
            i = i2 + 1;
        }
        this.f5199d = ((AbstractC0655q) ((AbstractC0723v) abstractC0723v.mo1482a(2)).mo1482a(0)).mo1410c();
        AbstractC0723v abstractC0723v3 = (AbstractC0723v) abstractC0723v.mo1482a(3);
        this.f5200e = new byte[abstractC0723v3.mo1484d()][];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= abstractC0723v3.mo1484d()) {
                break;
            }
            this.f5200e[i4] = ((AbstractC0655q) abstractC0723v3.mo1482a(i4)).mo1410c();
            i3 = i4 + 1;
        }
        this.f5201f = ((AbstractC0655q) ((AbstractC0723v) abstractC0723v.mo1482a(4)).mo1482a(0)).mo1410c();
        this.f5202g = ((AbstractC0655q) ((AbstractC0723v) abstractC0723v.mo1482a(5)).mo1482a(0)).mo1410c();
        AbstractC0723v abstractC0723v4 = (AbstractC0723v) abstractC0723v.mo1482a(6);
        byte[][][][] bArr = new byte[abstractC0723v4.mo1484d()][][][];
        byte[][][][] bArr2 = new byte[abstractC0723v4.mo1484d()][][][];
        byte[][][] bArr3 = new byte[abstractC0723v4.mo1484d()][][];
        byte[][] bArr4 = new byte[abstractC0723v4.mo1484d()][];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= abstractC0723v4.mo1484d()) {
                break;
            }
            AbstractC0723v abstractC0723v5 = (AbstractC0723v) abstractC0723v4.mo1482a(i6);
            AbstractC0723v abstractC0723v6 = (AbstractC0723v) abstractC0723v5.mo1482a(0);
            bArr[i6] = new byte[abstractC0723v6.mo1484d()][][];
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= abstractC0723v6.mo1484d()) {
                    break;
                }
                AbstractC0723v abstractC0723v7 = (AbstractC0723v) abstractC0723v6.mo1482a(i8);
                bArr[i6][i8] = new byte[abstractC0723v7.mo1484d()][];
                int i9 = 0;
                while (true) {
                    int i10 = i9;
                    if (i10 < abstractC0723v7.mo1484d()) {
                        bArr[i6][i8][i10] = ((AbstractC0655q) abstractC0723v7.mo1482a(i10)).mo1410c();
                        i9 = i10 + 1;
                    }
                }
                i7 = i8 + 1;
            }
            AbstractC0723v abstractC0723v8 = (AbstractC0723v) abstractC0723v5.mo1482a(1);
            bArr2[i6] = new byte[abstractC0723v8.mo1484d()][][];
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 >= abstractC0723v8.mo1484d()) {
                    break;
                }
                AbstractC0723v abstractC0723v9 = (AbstractC0723v) abstractC0723v8.mo1482a(i12);
                bArr2[i6][i12] = new byte[abstractC0723v9.mo1484d()][];
                int i13 = 0;
                while (true) {
                    int i14 = i13;
                    if (i14 < abstractC0723v9.mo1484d()) {
                        bArr2[i6][i12][i14] = ((AbstractC0655q) abstractC0723v9.mo1482a(i14)).mo1410c();
                        i13 = i14 + 1;
                    }
                }
                i11 = i12 + 1;
            }
            AbstractC0723v abstractC0723v10 = (AbstractC0723v) abstractC0723v5.mo1482a(2);
            bArr3[i6] = new byte[abstractC0723v10.mo1484d()][];
            int i15 = 0;
            while (true) {
                int i16 = i15;
                if (i16 < abstractC0723v10.mo1484d()) {
                    bArr3[i6][i16] = ((AbstractC0655q) abstractC0723v10.mo1482a(i16)).mo1410c();
                    i15 = i16 + 1;
                }
            }
            bArr4[i6] = ((AbstractC0655q) abstractC0723v5.mo1482a(3)).mo1410c();
            i5 = i6 + 1;
        }
        int length = this.f5202g.length - 1;
        this.f5203h = new C1453a[length];
        for (int i17 = 0; i17 < length; i17++) {
            this.f5203h[i17] = new C1453a(this.f5202g[i17], this.f5202g[i17 + 1], C1454a.m3811a(bArr[i17]), C1454a.m3811a(bArr2[i17]), C1454a.m3809a(bArr3[i17]), C1454a.m3807a(bArr4[i17]));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1432f m3741a(Object obj) {
        if (obj instanceof C1432f) {
            return (C1432f) obj;
        }
        if (obj != null) {
            return new C1432f(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final short[][] m3742a() {
        return C1454a.m3809a(this.f5198c);
    }

    /* JADX INFO: renamed from: b */
    public final short[] m3743b() {
        return C1454a.m3807a(this.f5199d);
    }

    /* JADX INFO: renamed from: c */
    public final short[] m3744c() {
        return C1454a.m3807a(this.f5201f);
    }

    /* JADX INFO: renamed from: d */
    public final short[][] m3745d() {
        return C1454a.m3809a(this.f5200e);
    }

    /* JADX INFO: renamed from: e */
    public final C1453a[] m3746e() {
        return this.f5203h;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f5196a != null) {
            c0625g.m1521a(this.f5196a);
        } else {
            c0625g.m1521a(this.f5197b);
        }
        C0625g c0625g2 = new C0625g();
        for (int i = 0; i < this.f5198c.length; i++) {
            c0625g2.m1521a(new C0581be(this.f5198c[i]));
        }
        c0625g.m1521a(new C0585bi(c0625g2));
        C0625g c0625g3 = new C0625g();
        c0625g3.m1521a(new C0581be(this.f5199d));
        c0625g.m1521a(new C0585bi(c0625g3));
        C0625g c0625g4 = new C0625g();
        for (int i2 = 0; i2 < this.f5200e.length; i2++) {
            c0625g4.m1521a(new C0581be(this.f5200e[i2]));
        }
        c0625g.m1521a(new C0585bi(c0625g4));
        C0625g c0625g5 = new C0625g();
        c0625g5.m1521a(new C0581be(this.f5201f));
        c0625g.m1521a(new C0585bi(c0625g5));
        C0625g c0625g6 = new C0625g();
        c0625g6.m1521a(new C0581be(this.f5202g));
        c0625g.m1521a(new C0585bi(c0625g6));
        C0625g c0625g7 = new C0625g();
        for (int i3 = 0; i3 < this.f5203h.length; i3++) {
            C0625g c0625g8 = new C0625g();
            byte[][][] bArrM3810a = C1454a.m3810a(this.f5203h[i3].m3799a());
            C0625g c0625g9 = new C0625g();
            for (int i4 = 0; i4 < bArrM3810a.length; i4++) {
                C0625g c0625g10 = new C0625g();
                for (int i5 = 0; i5 < bArrM3810a[i4].length; i5++) {
                    c0625g10.m1521a(new C0581be(bArrM3810a[i4][i5]));
                }
                c0625g9.m1521a(new C0585bi(c0625g10));
            }
            c0625g8.m1521a(new C0585bi(c0625g9));
            byte[][][] bArrM3810a2 = C1454a.m3810a(this.f5203h[i3].m3800b());
            C0625g c0625g11 = new C0625g();
            for (int i6 = 0; i6 < bArrM3810a2.length; i6++) {
                C0625g c0625g12 = new C0625g();
                for (int i7 = 0; i7 < bArrM3810a2[i6].length; i7++) {
                    c0625g12.m1521a(new C0581be(bArrM3810a2[i6][i7]));
                }
                c0625g11.m1521a(new C0585bi(c0625g12));
            }
            c0625g8.m1521a(new C0585bi(c0625g11));
            byte[][] bArrM3808a = C1454a.m3808a(this.f5203h[i3].m3801c());
            C0625g c0625g13 = new C0625g();
            for (byte[] bArr : bArrM3808a) {
                c0625g13.m1521a(new C0581be(bArr));
            }
            c0625g8.m1521a(new C0585bi(c0625g13));
            c0625g8.m1521a(new C0581be(C1454a.m3806a(this.f5203h[i3].m3802d())));
            c0625g7.m1521a(new C0585bi(c0625g8));
        }
        c0625g.m1521a(new C0585bi(c0625g7));
        return new C0585bi(c0625g);
    }

    public C1432f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C1453a[] c1453aArr) {
        this.f5196a = new C0640m(1L);
        this.f5198c = C1454a.m3808a(sArr);
        this.f5199d = C1454a.m3806a(sArr2);
        this.f5200e = C1454a.m3808a(sArr3);
        this.f5201f = C1454a.m3806a(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.f5202g = bArr;
        this.f5203h = c1453aArr;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m3747f() {
        byte[] bArr = this.f5202g;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }
}
