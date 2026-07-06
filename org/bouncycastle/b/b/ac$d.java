package org.bouncycastle.b.b;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class ac$d {
    private long[] a = new long[2];
    private boolean b;

    public ac$d() {
        a();
    }

    public final void a() {
        this.a[0] = 0;
        this.a[1] = 0;
        this.b = false;
        a(true);
    }

    public final void a(int i) {
        this.a[1] = (this.a[1] & (-274877906944L)) | ((((long) i) & 63) << 56);
    }

    public final void a(ac$d ac_d) {
        this.a = org.bouncycastle.f.a.a(ac_d.a, this.a);
        this.b = ac_d.b;
    }

    public final void a(boolean z) {
        if (z) {
            long[] jArr = this.a;
            jArr[1] = jArr[1] | 4611686018427387904L;
        } else {
            long[] jArr2 = this.a;
            jArr2[1] = jArr2[1] & (-4611686018427387905L);
        }
    }

    public final void b() {
        long[] jArr = this.a;
        jArr[1] = jArr[1] | Long.MIN_VALUE;
    }

    public final void b(int i) {
        if (!this.b) {
            long j = this.a[0] + ((long) i);
            this.a[0] = j;
            if (j > 9223372034707292160L) {
                this.b = true;
                return;
            }
            return;
        }
        long[] jArr = new long[3];
        jArr[0] = this.a[0] & 4294967295L;
        jArr[1] = (this.a[0] >>> 32) & 4294967295L;
        jArr[2] = this.a[1] & 4294967295L;
        long j2 = i;
        for (int i2 = 0; i2 < 3; i2++) {
            long j3 = j2 + jArr[i2];
            jArr[i2] = j3;
            j2 = j3 >>> 32;
        }
        this.a[0] = ((jArr[1] & 4294967295L) << 32) | (jArr[0] & 4294967295L);
        this.a[1] = (this.a[1] & (-4294967296L)) | (jArr[2] & 4294967295L);
    }

    public final long[] c() {
        return this.a;
    }

    public final String toString() {
        return ((int) ((this.a[1] >>> 56) & 63)) + " first: " + ((this.a[1] & 4611686018427387904L) != 0) + ", final: " + ((this.a[1] & Long.MIN_VALUE) != 0);
    }
}
