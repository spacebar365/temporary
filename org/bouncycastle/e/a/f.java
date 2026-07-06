package org.bouncycastle.e.a;

import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.o;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o {
    private org.bouncycastle.a.m a;
    private p b;
    private byte[][] c;
    private byte[] d;
    private byte[][] e;
    private byte[] f;
    private byte[] g;
    private org.bouncycastle.e.b.d.a[] h;

    private f(v vVar) {
        if (vVar.a(0) instanceof org.bouncycastle.a.m) {
            this.a = org.bouncycastle.a.m.a(vVar.a(0));
        } else {
            this.b = p.a(vVar.a(0));
        }
        v vVar2 = (v) vVar.a(1);
        this.c = new byte[vVar2.d()][];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= vVar2.d()) {
                break;
            }
            this.c[i2] = ((q) vVar2.a(i2)).c();
            i = i2 + 1;
        }
        this.d = ((q) ((v) vVar.a(2)).a(0)).c();
        v vVar3 = (v) vVar.a(3);
        this.e = new byte[vVar3.d()][];
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= vVar3.d()) {
                break;
            }
            this.e[i4] = ((q) vVar3.a(i4)).c();
            i3 = i4 + 1;
        }
        this.f = ((q) ((v) vVar.a(4)).a(0)).c();
        this.g = ((q) ((v) vVar.a(5)).a(0)).c();
        v vVar4 = (v) vVar.a(6);
        byte[][][][] bArr = new byte[vVar4.d()][][][];
        byte[][][][] bArr2 = new byte[vVar4.d()][][][];
        byte[][][] bArr3 = new byte[vVar4.d()][][];
        byte[][] bArr4 = new byte[vVar4.d()][];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= vVar4.d()) {
                break;
            }
            v vVar5 = (v) vVar4.a(i6);
            v vVar6 = (v) vVar5.a(0);
            bArr[i6] = new byte[vVar6.d()][][];
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= vVar6.d()) {
                    break;
                }
                v vVar7 = (v) vVar6.a(i8);
                bArr[i6][i8] = new byte[vVar7.d()][];
                int i9 = 0;
                while (true) {
                    int i10 = i9;
                    if (i10 < vVar7.d()) {
                        bArr[i6][i8][i10] = ((q) vVar7.a(i10)).c();
                        i9 = i10 + 1;
                    }
                }
                i7 = i8 + 1;
            }
            v vVar8 = (v) vVar5.a(1);
            bArr2[i6] = new byte[vVar8.d()][][];
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 >= vVar8.d()) {
                    break;
                }
                v vVar9 = (v) vVar8.a(i12);
                bArr2[i6][i12] = new byte[vVar9.d()][];
                int i13 = 0;
                while (true) {
                    int i14 = i13;
                    if (i14 < vVar9.d()) {
                        bArr2[i6][i12][i14] = ((q) vVar9.a(i14)).c();
                        i13 = i14 + 1;
                    }
                }
                i11 = i12 + 1;
            }
            v vVar10 = (v) vVar5.a(2);
            bArr3[i6] = new byte[vVar10.d()][];
            int i15 = 0;
            while (true) {
                int i16 = i15;
                if (i16 < vVar10.d()) {
                    bArr3[i6][i16] = ((q) vVar10.a(i16)).c();
                    i15 = i16 + 1;
                }
            }
            bArr4[i6] = ((q) vVar5.a(3)).c();
            i5 = i6 + 1;
        }
        int length = this.g.length - 1;
        this.h = new org.bouncycastle.e.b.d.a[length];
        for (int i17 = 0; i17 < length; i17++) {
            this.h[i17] = new org.bouncycastle.e.b.d.a(this.g[i17], this.g[i17 + 1], org.bouncycastle.e.b.d.a.a.a(bArr[i17]), org.bouncycastle.e.b.d.a.a.a(bArr2[i17]), org.bouncycastle.e.b.d.a.a.a(bArr3[i17]), org.bouncycastle.e.b.d.a.a.a(bArr4[i17]));
        }
    }

    public static f a(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(v.a(obj));
        }
        return null;
    }

    public final short[][] a() {
        return org.bouncycastle.e.b.d.a.a.a(this.c);
    }

    public final short[] b() {
        return org.bouncycastle.e.b.d.a.a.a(this.d);
    }

    public final short[] c() {
        return org.bouncycastle.e.b.d.a.a.a(this.f);
    }

    public final short[][] d() {
        return org.bouncycastle.e.b.d.a.a.a(this.e);
    }

    public final org.bouncycastle.e.b.d.a[] e() {
        return this.h;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(this.a);
        } else {
            gVar.a(this.b);
        }
        org.bouncycastle.a.g gVar2 = new org.bouncycastle.a.g();
        for (int i = 0; i < this.c.length; i++) {
            gVar2.a(new be(this.c[i]));
        }
        gVar.a(new bi(gVar2));
        org.bouncycastle.a.g gVar3 = new org.bouncycastle.a.g();
        gVar3.a(new be(this.d));
        gVar.a(new bi(gVar3));
        org.bouncycastle.a.g gVar4 = new org.bouncycastle.a.g();
        for (int i2 = 0; i2 < this.e.length; i2++) {
            gVar4.a(new be(this.e[i2]));
        }
        gVar.a(new bi(gVar4));
        org.bouncycastle.a.g gVar5 = new org.bouncycastle.a.g();
        gVar5.a(new be(this.f));
        gVar.a(new bi(gVar5));
        org.bouncycastle.a.g gVar6 = new org.bouncycastle.a.g();
        gVar6.a(new be(this.g));
        gVar.a(new bi(gVar6));
        org.bouncycastle.a.g gVar7 = new org.bouncycastle.a.g();
        for (int i3 = 0; i3 < this.h.length; i3++) {
            org.bouncycastle.a.g gVar8 = new org.bouncycastle.a.g();
            byte[][][] bArrA = org.bouncycastle.e.b.d.a.a.a(this.h[i3].a());
            org.bouncycastle.a.g gVar9 = new org.bouncycastle.a.g();
            for (int i4 = 0; i4 < bArrA.length; i4++) {
                org.bouncycastle.a.g gVar10 = new org.bouncycastle.a.g();
                for (int i5 = 0; i5 < bArrA[i4].length; i5++) {
                    gVar10.a(new be(bArrA[i4][i5]));
                }
                gVar9.a(new bi(gVar10));
            }
            gVar8.a(new bi(gVar9));
            byte[][][] bArrA2 = org.bouncycastle.e.b.d.a.a.a(this.h[i3].b());
            org.bouncycastle.a.g gVar11 = new org.bouncycastle.a.g();
            for (int i6 = 0; i6 < bArrA2.length; i6++) {
                org.bouncycastle.a.g gVar12 = new org.bouncycastle.a.g();
                for (int i7 = 0; i7 < bArrA2[i6].length; i7++) {
                    gVar12.a(new be(bArrA2[i6][i7]));
                }
                gVar11.a(new bi(gVar12));
            }
            gVar8.a(new bi(gVar11));
            byte[][] bArrA3 = org.bouncycastle.e.b.d.a.a.a(this.h[i3].c());
            org.bouncycastle.a.g gVar13 = new org.bouncycastle.a.g();
            for (byte[] bArr : bArrA3) {
                gVar13.a(new be(bArr));
            }
            gVar8.a(new bi(gVar13));
            gVar8.a(new be(org.bouncycastle.e.b.d.a.a.a(this.h[i3].d())));
            gVar7.a(new bi(gVar8));
        }
        gVar.a(new bi(gVar7));
        return new bi(gVar);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.e.b.d.a[] aVarArr) {
        this.a = new org.bouncycastle.a.m(1L);
        this.c = org.bouncycastle.e.b.d.a.a.a(sArr);
        this.d = org.bouncycastle.e.b.d.a.a.a(sArr2);
        this.e = org.bouncycastle.e.b.d.a.a.a(sArr3);
        this.f = org.bouncycastle.e.b.d.a.a.a(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.g = bArr;
        this.h = aVarArr;
    }

    public final int[] f() {
        byte[] bArr = this.g;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }
}
