package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public class au implements org.bouncycastle.b.am {
    protected static final byte[] a;
    protected static final byte[] b;
    private static final int[] f;
    protected int c;
    protected int[] d;
    protected int[] e;
    private int g;
    private byte[] h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public au() {
        this((byte) 0);
    }

    private au(byte b2) {
        this.g = 0;
        this.d = new int[16];
        this.e = new int[16];
        this.h = new byte[64];
        this.i = false;
        this.c = 20;
    }

    protected static int a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    protected static void a(int i, int[] iArr) {
        int i2 = (i - 16) / 4;
        iArr[0] = f[i2];
        iArr[1] = f[i2 + 1];
        iArr[2] = f[i2 + 2];
        iArr[3] = f[i2 + 3];
    }

    public static void b(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int iA = iArr[0];
        int iA2 = iArr[1];
        int iA3 = iArr[2];
        int iA4 = iArr[3];
        int iA5 = iArr[4];
        int iA6 = iArr[5];
        int iA7 = iArr[6];
        int iA8 = iArr[7];
        int iA9 = iArr[8];
        int iA10 = iArr[9];
        int iA11 = iArr[10];
        int iA12 = iArr[11];
        int iA13 = iArr[12];
        int iA14 = iArr[13];
        int iA15 = iArr[14];
        int iA16 = iArr[15];
        while (i > 0) {
            int iA17 = iA5 ^ a(iA + iA13, 7);
            int iA18 = iA9 ^ a(iA17 + iA, 9);
            int iA19 = iA13 ^ a(iA18 + iA17, 13);
            int iA20 = iA ^ a(iA19 + iA18, 18);
            int iA21 = iA10 ^ a(iA6 + iA2, 7);
            int iA22 = iA14 ^ a(iA21 + iA6, 9);
            int iA23 = iA2 ^ a(iA22 + iA21, 13);
            int iA24 = iA6 ^ a(iA23 + iA22, 18);
            int iA25 = iA15 ^ a(iA11 + iA7, 7);
            int iA26 = iA3 ^ a(iA25 + iA11, 9);
            int iA27 = iA7 ^ a(iA26 + iA25, 13);
            int iA28 = iA11 ^ a(iA27 + iA26, 18);
            int iA29 = iA4 ^ a(iA16 + iA12, 7);
            int iA30 = iA8 ^ a(iA29 + iA16, 9);
            int iA31 = iA12 ^ a(iA30 + iA29, 13);
            int iA32 = iA16 ^ a(iA31 + iA30, 18);
            iA2 = iA23 ^ a(iA20 + iA29, 7);
            iA3 = iA26 ^ a(iA2 + iA20, 9);
            iA4 = iA29 ^ a(iA3 + iA2, 13);
            iA = iA20 ^ a(iA4 + iA3, 18);
            iA7 = iA27 ^ a(iA24 + iA17, 7);
            iA8 = iA30 ^ a(iA7 + iA24, 9);
            iA5 = iA17 ^ a(iA8 + iA7, 13);
            iA6 = iA24 ^ a(iA5 + iA8, 18);
            iA12 = iA31 ^ a(iA28 + iA21, 7);
            iA9 = iA18 ^ a(iA12 + iA28, 9);
            iA10 = iA21 ^ a(iA9 + iA12, 13);
            iA11 = iA28 ^ a(iA10 + iA9, 18);
            iA13 = iA19 ^ a(iA32 + iA25, 7);
            iA14 = iA22 ^ a(iA13 + iA32, 9);
            iA15 = iA25 ^ a(iA14 + iA13, 13);
            iA16 = iA32 ^ a(iA15 + iA14, 18);
            i -= 2;
        }
        iArr2[0] = iA + iArr[0];
        iArr2[1] = iA2 + iArr[1];
        iArr2[2] = iA3 + iArr[2];
        iArr2[3] = iA4 + iArr[3];
        iArr2[4] = iA5 + iArr[4];
        iArr2[5] = iA6 + iArr[5];
        iArr2[6] = iA7 + iArr[6];
        iArr2[7] = iA8 + iArr[7];
        iArr2[8] = iA9 + iArr[8];
        iArr2[9] = iA10 + iArr[9];
        iArr2[10] = iA11 + iArr[10];
        iArr2[11] = iA12 + iArr[11];
        iArr2[12] = iA13 + iArr[12];
        iArr2[13] = iA14 + iArr[13];
        iArr2[14] = iA15 + iArr[14];
        iArr2[15] = iA16 + iArr[15];
    }

    @Override // org.bouncycastle.b.ao
    public String a() {
        return this.c != 20 ? "Salsa20/" + this.c : "Salsa20";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.be)) {
            throw new IllegalArgumentException(a() + " Init parameters must include an IV");
        }
        org.bouncycastle.b.k.be beVar = (org.bouncycastle.b.k.be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA == null || bArrA.length != b()) {
            throw new IllegalArgumentException(a() + " requires exactly " + b() + " bytes of IV");
        }
        org.bouncycastle.b.i iVarB = beVar.b();
        if (iVarB == null) {
            if (!this.i) {
                throw new IllegalStateException(a() + " KeyParameter can not be null for first initialisation");
            }
            a((byte[]) null, bArrA);
        } else {
            if (!(iVarB instanceof org.bouncycastle.b.k.ba)) {
                throw new IllegalArgumentException(a() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            a(((org.bouncycastle.b.k.ba) iVarB).a(), bArrA);
        }
        c();
        this.i = true;
    }

    protected void a(byte[] bArr) {
        b(this.c, this.d, this.e);
        org.bouncycastle.f.g.a(this.e, bArr, 0);
    }

    protected void a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(a() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            this.d[0] = f[length];
            this.d[5] = f[length + 1];
            this.d[10] = f[length + 2];
            this.d[15] = f[length + 3];
            org.bouncycastle.f.g.a(bArr, 0, this.d, 1, 4);
            org.bouncycastle.f.g.a(bArr, bArr.length - 16, this.d, 11, 4);
        }
        org.bouncycastle.f.g.a(bArr2, 0, this.d, 6, 2);
    }

    protected int b() {
        return 8;
    }

    protected void d() {
        int[] iArr = this.d;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            int[] iArr2 = this.d;
            iArr2[9] = iArr2[9] + 1;
        }
    }

    protected void e() {
        int[] iArr = this.d;
        this.d[9] = 0;
        iArr[8] = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    @Override // org.bouncycastle.b.ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(byte[] r5, int r6, int r7, byte[] r8, int r9) {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = r4.i
            if (r1 != 0) goto L22
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " not initialised"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            int r1 = r6 + r7
            int r2 = r5.length
            if (r1 <= r2) goto L2f
            org.bouncycastle.b.o r0 = new org.bouncycastle.b.o
            java.lang.String r1 = "input buffer too short"
            r0.<init>(r1)
            throw r0
        L2f:
            int r1 = r9 + r7
            int r2 = r8.length
            if (r1 <= r2) goto L3c
            org.bouncycastle.b.ac r0 = new org.bouncycastle.b.ac
            java.lang.String r1 = "output buffer too short"
            r0.<init>(r1)
            throw r0
        L3c:
            int r1 = r4.j
            int r1 = r1 + r7
            r4.j = r1
            int r1 = r4.j
            if (r1 >= r7) goto L68
            int r1 = r4.j
            if (r1 < 0) goto L68
            int r1 = r4.k
            int r1 = r1 + 1
            r4.k = r1
            if (r1 != 0) goto L68
            int r1 = r4.l
            int r1 = r1 + 1
            r4.l = r1
            r1 = r1 & 32
            if (r1 == 0) goto L66
            r1 = 1
        L5c:
            if (r1 == 0) goto L6a
            org.bouncycastle.b.ab r0 = new org.bouncycastle.b.ab
            java.lang.String r1 = "2^70 byte limit per IV would be exceeded; Change IV"
            r0.<init>(r1)
            throw r0
        L66:
            r1 = r0
            goto L5c
        L68:
            r1 = r0
            goto L5c
        L6a:
            if (r0 >= r7) goto L93
            int r1 = r0 + r9
            byte[] r2 = r4.h
            int r3 = r4.g
            r2 = r2[r3]
            int r3 = r0 + r6
            r3 = r5[r3]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r8[r1] = r2
            int r1 = r4.g
            int r1 = r1 + 1
            r1 = r1 & 63
            r4.g = r1
            int r1 = r4.g
            if (r1 != 0) goto L90
            r4.d()
            byte[] r1 = r4.h
            r4.a(r1)
        L90:
            int r0 = r0 + 1
            goto L6a
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.b.e.au.a(byte[], int, int, byte[], int):int");
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        this.g = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        e();
        a(this.h);
    }

    static {
        byte[] bArrD = org.bouncycastle.f.k.d("expand 16-byte kexpand 32-byte k");
        int[] iArr = new int[8];
        int i = 0;
        int i2 = 0;
        while (i < 8) {
            iArr[i] = org.bouncycastle.f.g.c(bArrD, i2);
            i++;
            i2 += 4;
        }
        f = iArr;
        a = org.bouncycastle.f.k.d("expand 32-byte k");
        b = org.bouncycastle.f.k.d("expand 16-byte k");
    }
}
