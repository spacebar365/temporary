package org.bouncycastle.b.e;

import org.bouncycastle.b.k.bj;

/* JADX INFO: loaded from: classes.dex */
public final class ai implements org.bouncycastle.b.e {
    private int a = 12;
    private long[] b = null;
    private boolean c;

    private static long a(long j, long j2) {
        return (j << ((int) (j2 & 63))) | (j >>> ((int) (64 - (63 & j2))));
    }

    private static long a(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            j = (j << 8) + ((long) (bArr[i2 + i] & 255));
        }
        return j;
    }

    private static void a(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) j;
            j >>>= 8;
        }
    }

    private void a(byte[] bArr) {
        long[] jArr = new long[(bArr.length + 7) / 8];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 8;
            jArr[i2] = jArr[i2] + (((long) (bArr[i] & 255)) << ((i % 8) * 8));
        }
        this.b = new long[(this.a + 1) * 2];
        this.b[0] = -5196783011329398165L;
        for (int i3 = 1; i3 < this.b.length; i3++) {
            this.b[i3] = r2[i3 - 1] - 7046029254386353131L;
        }
        int length = jArr.length > this.b.length ? jArr.length * 3 : this.b.length * 3;
        int i4 = 0;
        int length2 = 0;
        long jA = 0;
        long j = 0;
        int length3 = 0;
        while (i4 < length) {
            long[] jArr2 = this.b;
            long jA2 = a(jArr2[length3] + j + jA, 3L);
            jArr2[length3] = jA2;
            jA = a(jArr[length2] + jA2 + jA, jA + jA2);
            jArr[length2] = jA;
            length3 = (length3 + 1) % this.b.length;
            length2 = (length2 + 1) % jArr.length;
            i4++;
            j = jA2;
        }
    }

    private static long b(long j, long j2) {
        return (j >>> ((int) (j2 & 63))) | (j << ((int) (64 - (63 & j2))));
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof bj)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + iVar.getClass().getName());
        }
        bj bjVar = (bj) iVar;
        this.c = z;
        this.a = bjVar.b();
        a(bjVar.a());
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.c) {
            long jA = this.b[0] + a(bArr, i);
            long jA2 = a(bArr, i + 8) + this.b[1];
            for (int i3 = 1; i3 <= this.a; i3++) {
                jA = a(jA ^ jA2, jA2) + this.b[i3 * 2];
                jA2 = a(jA2 ^ jA, jA) + this.b[(i3 * 2) + 1];
            }
            a(jA, bArr2, i2);
            a(jA2, bArr2, i2 + 8);
        } else {
            long jA3 = a(bArr, i);
            long jA4 = a(bArr, i + 8);
            for (int i4 = this.a; i4 > 0; i4--) {
                jA4 = b(jA4 - this.b[(i4 * 2) + 1], jA3) ^ jA3;
                jA3 = b(jA3 - this.b[i4 * 2], jA4) ^ jA4;
            }
            a(jA3 - this.b[0], bArr2, i2);
            a(jA4 - this.b[1], bArr2, i2 + 8);
        }
        return 16;
    }
}
