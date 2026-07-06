package org.bouncycastle.e.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    protected i[] a;
    protected i[] b;
    private b c;
    private i d;

    public k(b bVar, i iVar) {
        this.c = bVar;
        this.d = iVar;
        b();
        c();
    }

    private static void a(i[] iVarArr, int i, int i2) {
        i iVar = iVarArr[i];
        iVarArr[i] = iVarArr[i2];
        iVarArr[i2] = iVar;
    }

    private void b() {
        int iA = this.d.a();
        this.a = new i[iA];
        for (int i = 0; i < (iA >> 1); i++) {
            int[] iArr = new int[(i << 1) + 1];
            iArr[i << 1] = 1;
            this.a[i] = new i(this.c, iArr);
        }
        for (int i2 = iA >> 1; i2 < iA; i2++) {
            int[] iArr2 = new int[(i2 << 1) + 1];
            iArr2[i2 << 1] = 1;
            this.a[i2] = new i(this.c, iArr2).b(this.d);
        }
    }

    private void c() {
        int iA;
        int iA2 = this.d.a();
        i[] iVarArr = new i[iA2];
        for (int i = iA2 - 1; i >= 0; i--) {
            iVarArr[i] = new i(this.a[i]);
        }
        this.b = new i[iA2];
        for (int i2 = iA2 - 1; i2 >= 0; i2--) {
            this.b[i2] = new i(this.c, i2);
        }
        for (int i3 = 0; i3 < iA2; i3++) {
            if (iVarArr[i3].a(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < iA2) {
                    if (iVarArr[i4].a(i3) != 0) {
                        z = true;
                        a(iVarArr, i3, i4);
                        a(this.b, i3, i4);
                        i4 = iA2;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iA3 = this.c.a(iVarArr[i3].a(i3));
            iVarArr[i3].d(iA3);
            this.b[i3].d(iA3);
            for (int i5 = 0; i5 < iA2; i5++) {
                if (i5 != i3 && (iA = iVarArr[i5].a(i3)) != 0) {
                    i iVarC = iVarArr[i3].c(iA);
                    i iVarC2 = this.b[i3].c(iA);
                    iVarArr[i5].a(iVarC);
                    this.b[i5].a(iVarC2);
                }
            }
        }
    }

    public final i[] a() {
        return this.b;
    }
}
