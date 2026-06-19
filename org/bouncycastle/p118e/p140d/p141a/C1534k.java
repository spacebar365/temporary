package org.bouncycastle.p118e.p140d.p141a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1534k {

    /* JADX INFO: renamed from: a */
    protected C1532i[] f5477a;

    /* JADX INFO: renamed from: b */
    protected C1532i[] f5478b;

    /* JADX INFO: renamed from: c */
    private C1525b f5479c;

    /* JADX INFO: renamed from: d */
    private C1532i f5480d;

    public C1534k(C1525b c1525b, C1532i c1532i) {
        this.f5479c = c1525b;
        this.f5480d = c1532i;
        m4062b();
        m4063c();
    }

    /* JADX INFO: renamed from: a */
    private static void m4061a(C1532i[] c1532iArr, int i, int i2) {
        C1532i c1532i = c1532iArr[i];
        c1532iArr[i] = c1532iArr[i2];
        c1532iArr[i2] = c1532i;
    }

    /* JADX INFO: renamed from: b */
    private void m4062b() {
        int iM4049a = this.f5480d.m4049a();
        this.f5477a = new C1532i[iM4049a];
        for (int i = 0; i < (iM4049a >> 1); i++) {
            int[] iArr = new int[(i << 1) + 1];
            iArr[i << 1] = 1;
            this.f5477a[i] = new C1532i(this.f5479c, iArr);
        }
        for (int i2 = iM4049a >> 1; i2 < iM4049a; i2++) {
            int[] iArr2 = new int[(i2 << 1) + 1];
            iArr2[i2 << 1] = 1;
            this.f5477a[i2] = new C1532i(this.f5479c, iArr2).m4053b(this.f5480d);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m4063c() {
        int iM4050a;
        int iM4049a = this.f5480d.m4049a();
        C1532i[] c1532iArr = new C1532i[iM4049a];
        for (int i = iM4049a - 1; i >= 0; i--) {
            c1532iArr[i] = new C1532i(this.f5477a[i]);
        }
        this.f5478b = new C1532i[iM4049a];
        for (int i2 = iM4049a - 1; i2 >= 0; i2--) {
            this.f5478b[i2] = new C1532i(this.f5479c, i2);
        }
        for (int i3 = 0; i3 < iM4049a; i3++) {
            if (c1532iArr[i3].m4050a(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < iM4049a) {
                    if (c1532iArr[i4].m4050a(i3) != 0) {
                        z = true;
                        m4061a(c1532iArr, i3, i4);
                        m4061a(this.f5478b, i3, i4);
                        i4 = iM4049a;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iM4027a = this.f5479c.m4027a(c1532iArr[i3].m4050a(i3));
            c1532iArr[i3].m4056d(iM4027a);
            this.f5478b[i3].m4056d(iM4027a);
            for (int i5 = 0; i5 < iM4049a; i5++) {
                if (i5 != i3 && (iM4050a = c1532iArr[i5].m4050a(i3)) != 0) {
                    C1532i c1532iM4055c = c1532iArr[i3].m4055c(iM4050a);
                    C1532i c1532iM4055c2 = this.f5478b[i3].m4055c(iM4050a);
                    c1532iArr[i5].m4051a(c1532iM4055c);
                    this.f5478b[i5].m4051a(c1532iM4055c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1532i[] m4064a() {
        return this.f5478b;
    }
}
