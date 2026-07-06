package org.bouncycastle.b.e;

import org.bouncycastle.b.k.bp;

/* JADX INFO: loaded from: classes.dex */
public final class ba implements org.bouncycastle.b.e {
    private static int[] a = new int[80];
    private static int[] b = new int[80];
    private static int[] c = new int[a.length];
    private static int[] d = new int[a.length];
    private int e;
    private int f;
    private long[] g;
    private long[] h = new long[5];
    private long[] i;
    private ba$d j;
    private boolean k;

    static {
        for (int i = 0; i < a.length; i++) {
            b[i] = i % 17;
            a[i] = i % 9;
            c[i] = i % 5;
            d[i] = i % 3;
        }
    }

    public ba(int i) {
        this.e = i / 8;
        this.f = this.e / 8;
        this.g = new long[this.f];
        this.i = new long[(this.f * 2) + 1];
        switch (i) {
            case 256:
                this.j = new ba$b(this.i, this.h);
                return;
            case 512:
                this.j = new ba$c(this.i, this.h);
                return;
            case 1024:
                this.j = new ba$a(this.i, this.h);
                return;
            default:
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        }
    }

    static long a(long j, int i, long j2) {
        return ((j << i) | (j >>> (-i))) ^ j2;
    }

    public static long a(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        int i2 = i + 1;
        int i3 = i2 + 1;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        return ((((long) bArr[i8]) & 255) << 56) | j5 | ((((long) bArr[i7]) & 255) << 48);
    }

    public static void a(long j, byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        int i2 = i + 1;
        bArr[i] = (byte) j;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j >> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j >> 24);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j >> 32);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j >> 40);
        bArr[i7] = (byte) (j >> 48);
        bArr[i7 + 1] = (byte) (j >> 56);
    }

    private void a(long[] jArr) {
        if (jArr.length != this.f) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f + " words)");
        }
        long j = 2004413935125273122L;
        for (int i = 0; i < this.f; i++) {
            this.i[i] = jArr[i];
            j ^= this.i[i];
        }
        this.i[this.f] = j;
        System.arraycopy(this.i, 0, this.i, this.f + 1, this.f);
    }

    static long b(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    private void b(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        this.h[0] = jArr[0];
        this.h[1] = jArr[1];
        this.h[2] = this.h[0] ^ this.h[1];
        this.h[3] = this.h[0];
        this.h[4] = this.h[1];
    }

    static /* synthetic */ int[] d() {
        return c;
    }

    static /* synthetic */ int[] e() {
        return d;
    }

    static /* synthetic */ int[] f() {
        return a;
    }

    static /* synthetic */ int[] g() {
        return b;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.e + i > bArr.length) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        if (this.e + i2 > bArr2.length) {
            throw new org.bouncycastle.b.ac("Output buffer too short");
        }
        for (int i3 = 0; i3 < this.e; i3 += 8) {
            this.g[i3 >> 3] = a(bArr, i + i3);
        }
        a(this.g, this.g);
        for (int i4 = 0; i4 < this.e; i4 += 8) {
            a(this.g[i4 >> 3], bArr2, i2 + i4);
        }
        return this.e;
    }

    public final int a(long[] jArr, long[] jArr2) {
        if (this.i[this.f] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != this.f) {
            throw new org.bouncycastle.b.o("Input buffer too short");
        }
        if (jArr2.length != this.f) {
            throw new org.bouncycastle.b.ac("Output buffer too short");
        }
        if (this.k) {
            this.j.a(jArr, jArr2);
        } else {
            this.j.b(jArr, jArr2);
        }
        return this.f;
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "Threefish-" + (this.e * 8);
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        byte[] bArrB;
        byte[] bArrA;
        long[] jArr;
        long[] jArr2;
        if (iVar instanceof bp) {
            bp bpVar = (bp) iVar;
            byte[] bArrA2 = bpVar.a().a();
            bArrB = bpVar.b();
            bArrA = bArrA2;
        } else {
            if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + iVar.getClass().getName());
            }
            bArrB = null;
            bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        }
        if (bArrA == null) {
            jArr = null;
        } else {
            if (bArrA.length != this.e) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.e + " bytes)");
            }
            jArr = new long[this.f];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = a(bArrA, i * 8);
            }
        }
        if (bArrB == null) {
            jArr2 = null;
        } else {
            if (bArrB.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{a(bArrB, 0), a(bArrB, 8)};
        }
        a(z, jArr, jArr2);
    }

    public final void a(boolean z, long[] jArr, long[] jArr2) {
        this.k = z;
        if (jArr != null) {
            a(jArr);
        }
        if (jArr2 != null) {
            b(jArr2);
        }
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.e;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }
}
