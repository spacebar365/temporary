package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements org.bouncycastle.b.u, org.bouncycastle.f.e {
    static final long[] i = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long a;
    protected long b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    private byte[] j;
    private int k;
    private long l;
    private long m;
    private long[] n;
    private int o;

    protected j() {
        this.j = new byte[8];
        this.n = new long[80];
        this.k = 0;
        c();
    }

    protected j(j jVar) {
        this.j = new byte[8];
        this.n = new long[80];
        a(jVar);
    }

    private static long a(long j) {
        return (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34))) ^ ((j << 25) | (j >>> 39));
    }

    private static long a(long j, long j2, long j3) {
        return (j & j2) ^ (((-1) ^ j) & j3);
    }

    private static long b(long j) {
        return (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18))) ^ ((j << 23) | (j >>> 41));
    }

    private static long b(long j, long j2, long j3) {
        return ((j & j2) ^ (j & j3)) ^ (j2 & j3);
    }

    private void b(byte[] bArr, int i2) {
        this.n[this.o] = org.bouncycastle.f.g.b(bArr, i2);
        int i3 = this.o + 1;
        this.o = i3;
        if (i3 == 16) {
            h();
        }
    }

    private static long c(long j) {
        return (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8))) ^ (j >>> 7);
    }

    private static long d(long j) {
        return (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61))) ^ (j >>> 6);
    }

    private void g() {
        if (this.l > 2305843009213693951L) {
            this.m += this.l >>> 61;
            this.l &= 2305843009213693951L;
        }
    }

    private void h() {
        g();
        for (int i2 = 16; i2 <= 79; i2++) {
            long[] jArr = this.n;
            jArr[i2] = d(jArr[i2 - 2]) + this.n[i2 - 7] + c(this.n[i2 - 15]) + this.n[i2 - 16];
        }
        long jB = this.a;
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        long j6 = this.g;
        long j7 = this.h;
        int i3 = 0;
        int i4 = 0;
        long jB2 = j3;
        while (i4 < 10) {
            int i5 = i3 + 1;
            long jB3 = j7 + this.n[i3] + b(j4) + a(j4, j5, j6) + i[i3];
            long j8 = jB2 + jB3;
            long jA = jB3 + a(jB) + b(jB, j, j2);
            int i6 = i5 + 1;
            long jA2 = a(j8, j4, j5) + b(j8) + i[i5] + this.n[i5] + j6;
            long j9 = j2 + jA2;
            long jB4 = jA2 + b(jA, jB, j) + a(jA);
            int i7 = i6 + 1;
            long jB5 = j5 + b(j9) + a(j9, j8, j4) + i[i6] + this.n[i6];
            long j10 = j + jB5;
            long jB6 = jB5 + b(jB4, jA, jB) + a(jB4);
            int i8 = i7 + 1;
            long jB7 = j4 + b(j10) + a(j10, j9, j8) + i[i7] + this.n[i7];
            long j11 = jB + jB7;
            long jB8 = b(jB6, jB4, jA) + a(jB6) + jB7;
            int i9 = i8 + 1;
            long jB9 = j8 + b(j11) + a(j11, j10, j9) + i[i8] + this.n[i8];
            long j12 = jA + jB9;
            jB2 = jB9 + b(jB8, jB6, jB4) + a(jB8);
            int i10 = i9 + 1;
            long jB10 = b(j12) + a(j12, j11, j10) + i[i9] + this.n[i9] + j9;
            long j13 = jB4 + jB10;
            long jA3 = jB10 + a(jB2) + b(jB2, jB8, jB6);
            int i11 = i10 + 1;
            long jA4 = a(j13, j12, j11) + b(j13) + i[i10] + this.n[i10] + j10;
            long j14 = jB6 + jA4;
            long jB11 = jA4 + b(jA3, jB2, jB8) + a(jA3);
            i3 = i11 + 1;
            long jB12 = j11 + b(j14) + a(j14, j13, j12) + i[i11] + this.n[i11];
            long j15 = jB8 + jB12;
            jB = jB12 + b(jB11, jA3, jB2) + a(jB11);
            i4++;
            j7 = j12;
            j6 = j13;
            j5 = j14;
            j4 = j15;
            j2 = jA3;
            j = jB11;
        }
        this.a = jB + this.a;
        this.b += j;
        this.c += j2;
        this.d += jB2;
        this.e = j4 + this.e;
        this.f += j5;
        this.g += j6;
        this.h += j7;
        this.o = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.n[i12] = 0;
        }
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte b) {
        byte[] bArr = this.j;
        int i2 = this.k;
        this.k = i2 + 1;
        bArr[i2] = b;
        if (this.k == this.j.length) {
            b(this.j, 0);
            this.k = 0;
        }
        this.l++;
    }

    protected final void a(j jVar) {
        System.arraycopy(jVar.j, 0, this.j, 0, jVar.j.length);
        this.k = jVar.k;
        this.l = jVar.l;
        this.m = jVar.m;
        this.a = jVar.a;
        this.b = jVar.b;
        this.c = jVar.c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.f;
        this.g = jVar.g;
        this.h = jVar.h;
        System.arraycopy(jVar.n, 0, this.n, 0, jVar.n.length);
        this.o = jVar.o;
    }

    @Override // org.bouncycastle.b.r
    public final void a(byte[] bArr, int i2, int i3) {
        while (this.k != 0 && i3 > 0) {
            a(bArr[i2]);
            i2++;
            i3--;
        }
        while (i3 > this.j.length) {
            b(bArr, i2);
            i2 += this.j.length;
            i3 -= this.j.length;
            this.l += (long) this.j.length;
        }
        while (i3 > 0) {
            a(bArr[i2]);
            i2++;
            i3--;
        }
    }

    @Override // org.bouncycastle.b.r
    public void c() {
        this.l = 0L;
        this.m = 0L;
        this.k = 0;
        for (int i2 = 0; i2 < this.j.length; i2++) {
            this.j[i2] = 0;
        }
        this.o = 0;
        for (int i3 = 0; i3 != this.n.length; i3++) {
            this.n[i3] = 0;
        }
    }

    @Override // org.bouncycastle.b.u
    public final int d() {
        return 128;
    }

    public final void f() {
        g();
        long j = this.l << 3;
        long j2 = this.m;
        a((byte) -128);
        while (this.k != 0) {
            a((byte) 0);
        }
        if (this.o > 14) {
            h();
        }
        this.n[14] = j2;
        this.n[15] = j;
        h();
    }
}
