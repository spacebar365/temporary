package org.bouncycastle.p083b.p086b;

import android.R;
import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0819a implements InterfaceC1178u {

    /* JADX INFO: renamed from: a */
    private static final long[] f3334a = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* JADX INFO: renamed from: b */
    private static final byte[][] f3335b = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* JADX INFO: renamed from: c */
    private static int f3336c = 12;

    /* JADX INFO: renamed from: d */
    private int f3337d;

    /* JADX INFO: renamed from: e */
    private int f3338e;

    /* JADX INFO: renamed from: f */
    private byte[] f3339f;

    /* JADX INFO: renamed from: g */
    private byte[] f3340g;

    /* JADX INFO: renamed from: h */
    private byte[] f3341h;

    /* JADX INFO: renamed from: i */
    private byte[] f3342i;

    /* JADX INFO: renamed from: j */
    private int f3343j;

    /* JADX INFO: renamed from: k */
    private long[] f3344k;

    /* JADX INFO: renamed from: l */
    private long[] f3345l;

    /* JADX INFO: renamed from: m */
    private long f3346m;

    /* JADX INFO: renamed from: n */
    private long f3347n;

    /* JADX INFO: renamed from: o */
    private long f3348o;

    public C0819a() {
        this(512);
    }

    public C0819a(int i) {
        this.f3337d = 64;
        this.f3338e = 0;
        this.f3339f = null;
        this.f3340g = null;
        this.f3341h = null;
        this.f3342i = null;
        this.f3343j = 0;
        this.f3344k = new long[16];
        this.f3345l = null;
        this.f3346m = 0L;
        this.f3347n = 0L;
        this.f3348o = 0L;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f3342i = new byte[128];
        this.f3338e = 0;
        this.f3337d = i / 8;
        m1924e();
    }

    public C0819a(C0819a c0819a) {
        this.f3337d = 64;
        this.f3338e = 0;
        this.f3339f = null;
        this.f3340g = null;
        this.f3341h = null;
        this.f3342i = null;
        this.f3343j = 0;
        this.f3344k = new long[16];
        this.f3345l = null;
        this.f3346m = 0L;
        this.f3347n = 0L;
        this.f3348o = 0L;
        this.f3343j = c0819a.f3343j;
        this.f3342i = C1535a.m4086b(c0819a.f3342i);
        this.f3338e = c0819a.f3338e;
        this.f3341h = C1535a.m4086b(c0819a.f3341h);
        this.f3337d = c0819a.f3337d;
        this.f3345l = C1535a.m4088b(c0819a.f3345l);
        this.f3340g = C1535a.m4086b(c0819a.f3340g);
        this.f3339f = C1535a.m4086b(c0819a.f3339f);
        this.f3346m = c0819a.f3346m;
        this.f3347n = c0819a.f3347n;
        this.f3348o = c0819a.f3348o;
    }

    /* JADX INFO: renamed from: a */
    private static long m1921a(long j, int i) {
        return (j >>> i) | (j << (64 - i));
    }

    /* JADX INFO: renamed from: a */
    private void m1922a(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.f3344k;
        jArr[i] = jArr[i] + this.f3344k[i2] + j;
        long[] jArr2 = this.f3344k;
        jArr2[i4] = m1921a(jArr2[i4] ^ this.f3344k[i], 32);
        long[] jArr3 = this.f3344k;
        jArr3[i3] = jArr3[i3] + this.f3344k[i4];
        long[] jArr4 = this.f3344k;
        jArr4[i2] = m1921a(jArr4[i2] ^ this.f3344k[i3], 24);
        long[] jArr5 = this.f3344k;
        jArr5[i] = jArr5[i] + this.f3344k[i2] + j2;
        long[] jArr6 = this.f3344k;
        jArr6[i4] = m1921a(jArr6[i4] ^ this.f3344k[i], 16);
        long[] jArr7 = this.f3344k;
        jArr7[i3] = jArr7[i3] + this.f3344k[i4];
        long[] jArr8 = this.f3344k;
        jArr8[i2] = m1921a(jArr8[i2] ^ this.f3344k[i3], 63);
    }

    /* JADX INFO: renamed from: b */
    private void m1923b(byte[] bArr, int i) {
        m1925f();
        long[] jArr = new long[16];
        for (int i2 = 0; i2 < 16; i2++) {
            jArr[i2] = AbstractC1556g.m4153d(bArr, (i2 * 8) + i);
        }
        for (int i3 = 0; i3 < f3336c; i3++) {
            m1922a(jArr[f3335b[i3][0]], jArr[f3335b[i3][1]], 0, 4, 8, 12);
            m1922a(jArr[f3335b[i3][2]], jArr[f3335b[i3][3]], 1, 5, 9, 13);
            m1922a(jArr[f3335b[i3][4]], jArr[f3335b[i3][5]], 2, 6, 10, 14);
            m1922a(jArr[f3335b[i3][6]], jArr[f3335b[i3][7]], 3, 7, 11, 15);
            m1922a(jArr[f3335b[i3][8]], jArr[f3335b[i3][9]], 0, 5, 10, 15);
            m1922a(jArr[f3335b[i3][10]], jArr[f3335b[i3][11]], 1, 6, 11, 12);
            m1922a(jArr[f3335b[i3][12]], jArr[f3335b[i3][13]], 2, 7, 8, 13);
            m1922a(jArr[f3335b[i3][14]], jArr[f3335b[i3][15]], 3, 4, 9, 14);
        }
        for (int i4 = 0; i4 < this.f3345l.length; i4++) {
            long[] jArr2 = this.f3345l;
            jArr2[i4] = (jArr2[i4] ^ this.f3344k[i4]) ^ this.f3344k[i4 + 8];
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1924e() {
        if (this.f3345l == null) {
            this.f3345l = new long[8];
            this.f3345l[0] = f3334a[0] ^ ((long) ((this.f3337d | (this.f3338e << 8)) | R.attr.theme));
            this.f3345l[1] = f3334a[1];
            this.f3345l[2] = f3334a[2];
            this.f3345l[3] = f3334a[3];
            this.f3345l[4] = f3334a[4];
            this.f3345l[5] = f3334a[5];
            if (this.f3339f != null) {
                long[] jArr = this.f3345l;
                jArr[4] = jArr[4] ^ AbstractC1556g.m4153d(this.f3339f, 0);
                long[] jArr2 = this.f3345l;
                jArr2[5] = jArr2[5] ^ AbstractC1556g.m4153d(this.f3339f, 8);
            }
            this.f3345l[6] = f3334a[6];
            this.f3345l[7] = f3334a[7];
            if (this.f3340g != null) {
                long[] jArr3 = this.f3345l;
                jArr3[6] = jArr3[6] ^ AbstractC1556g.m4153d(this.f3340g, 0);
                long[] jArr4 = this.f3345l;
                jArr4[7] = jArr4[7] ^ AbstractC1556g.m4153d(this.f3340g, 8);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m1925f() {
        System.arraycopy(this.f3345l, 0, this.f3344k, 0, this.f3345l.length);
        System.arraycopy(f3334a, 0, this.f3344k, this.f3345l.length, 4);
        this.f3344k[12] = this.f3346m ^ f3334a[4];
        this.f3344k[13] = this.f3347n ^ f3334a[5];
        this.f3344k[14] = this.f3348o ^ f3334a[6];
        this.f3344k[15] = f3334a[7];
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        this.f3348o = -1L;
        this.f3346m += (long) this.f3343j;
        if (this.f3343j > 0 && this.f3346m == 0) {
            this.f3347n++;
        }
        m1923b(this.f3342i, 0);
        C1535a.m4071a(this.f3342i, (byte) 0);
        C1535a.m4073a(this.f3344k);
        for (int i2 = 0; i2 < this.f3345l.length && i2 * 8 < this.f3337d; i2++) {
            byte[] bArrM4151b = AbstractC1556g.m4151b(this.f3345l[i2]);
            if (i2 * 8 < this.f3337d - 8) {
                System.arraycopy(bArrM4151b, 0, bArr, (i2 * 8) + i, 8);
            } else {
                System.arraycopy(bArrM4151b, 0, bArr, (i2 * 8) + i, this.f3337d - (i2 * 8));
            }
        }
        C1535a.m4073a(this.f3345l);
        mo1931c();
        return this.f3337d;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        if (128 - this.f3343j != 0) {
            this.f3342i[this.f3343j] = b;
            this.f3343j++;
            return;
        }
        this.f3346m += 128;
        if (this.f3346m == 0) {
            this.f3347n++;
        }
        m1923b(this.f3342i, 0);
        C1535a.m4071a(this.f3342i, (byte) 0);
        this.f3342i[0] = b;
        this.f3343j = 1;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.f3343j != 0) {
            i3 = 128 - this.f3343j;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, this.f3342i, this.f3343j, i2);
                this.f3343j += i2;
                return;
            }
            System.arraycopy(bArr, i, this.f3342i, this.f3343j, i3);
            this.f3346m += 128;
            if (this.f3346m == 0) {
                this.f3347n++;
            }
            m1923b(this.f3342i, 0);
            this.f3343j = 0;
            C1535a.m4071a(this.f3342i, (byte) 0);
        } else {
            i3 = 0;
        }
        int i4 = (i + i2) - 128;
        int i5 = i3 + i;
        while (i5 < i4) {
            this.f3346m += 128;
            if (this.f3346m == 0) {
                this.f3347n++;
            }
            m1923b(bArr, i5);
            i5 += 128;
        }
        System.arraycopy(bArr, i5, this.f3342i, 0, (i + i2) - i5);
        this.f3343j = ((i + i2) - i5) + this.f3343j;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return this.f3337d;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3343j = 0;
        this.f3348o = 0L;
        this.f3346m = 0L;
        this.f3347n = 0L;
        this.f3345l = null;
        C1535a.m4071a(this.f3342i, (byte) 0);
        if (this.f3341h != null) {
            System.arraycopy(this.f3341h, 0, this.f3342i, 0, this.f3341h.length);
            this.f3343j = 128;
        }
        m1924e();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 128;
    }
}
