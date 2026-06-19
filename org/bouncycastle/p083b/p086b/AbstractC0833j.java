package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p083b.InterfaceC1178u;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0833j implements InterfaceC1178u, InterfaceC1554e {

    /* JADX INFO: renamed from: i */
    static final long[] f3477i = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: a */
    protected long f3478a;

    /* JADX INFO: renamed from: b */
    protected long f3479b;

    /* JADX INFO: renamed from: c */
    protected long f3480c;

    /* JADX INFO: renamed from: d */
    protected long f3481d;

    /* JADX INFO: renamed from: e */
    protected long f3482e;

    /* JADX INFO: renamed from: f */
    protected long f3483f;

    /* JADX INFO: renamed from: g */
    protected long f3484g;

    /* JADX INFO: renamed from: h */
    protected long f3485h;

    /* JADX INFO: renamed from: j */
    private byte[] f3486j;

    /* JADX INFO: renamed from: k */
    private int f3487k;

    /* JADX INFO: renamed from: l */
    private long f3488l;

    /* JADX INFO: renamed from: m */
    private long f3489m;

    /* JADX INFO: renamed from: n */
    private long[] f3490n;

    /* JADX INFO: renamed from: o */
    private int f3491o;

    protected AbstractC0833j() {
        this.f3486j = new byte[8];
        this.f3490n = new long[80];
        this.f3487k = 0;
        mo1931c();
    }

    protected AbstractC0833j(AbstractC0833j abstractC0833j) {
        this.f3486j = new byte[8];
        this.f3490n = new long[80];
        m2036a(abstractC0833j);
    }

    /* JADX INFO: renamed from: a */
    private static long m2027a(long j) {
        return (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34))) ^ ((j << 25) | (j >>> 39));
    }

    /* JADX INFO: renamed from: a */
    private static long m2028a(long j, long j2, long j3) {
        return (j & j2) ^ (((-1) ^ j) & j3);
    }

    /* JADX INFO: renamed from: b */
    private static long m2029b(long j) {
        return (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18))) ^ ((j << 23) | (j >>> 41));
    }

    /* JADX INFO: renamed from: b */
    private static long m2030b(long j, long j2, long j3) {
        return ((j & j2) ^ (j & j3)) ^ (j2 & j3);
    }

    /* JADX INFO: renamed from: b */
    private void m2031b(byte[] bArr, int i) {
        this.f3490n[this.f3491o] = AbstractC1556g.m4146b(bArr, i);
        int i2 = this.f3491o + 1;
        this.f3491o = i2;
        if (i2 == 16) {
            m2035h();
        }
    }

    /* JADX INFO: renamed from: c */
    private static long m2032c(long j) {
        return (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8))) ^ (j >>> 7);
    }

    /* JADX INFO: renamed from: d */
    private static long m2033d(long j) {
        return (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61))) ^ (j >>> 6);
    }

    /* JADX INFO: renamed from: g */
    private void m2034g() {
        if (this.f3488l > 2305843009213693951L) {
            this.f3489m += this.f3488l >>> 61;
            this.f3488l &= 2305843009213693951L;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m2035h() {
        m2034g();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f3490n;
            jArr[i] = m2033d(jArr[i - 2]) + this.f3490n[i - 7] + m2032c(this.f3490n[i - 15]) + this.f3490n[i - 16];
        }
        long jM2030b = this.f3478a;
        long j = this.f3479b;
        long j2 = this.f3480c;
        long j3 = this.f3481d;
        long j4 = this.f3482e;
        long j5 = this.f3483f;
        long j6 = this.f3484g;
        long j7 = this.f3485h;
        int i2 = 0;
        int i3 = 0;
        long jM2030b2 = j3;
        while (i3 < 10) {
            int i4 = i2 + 1;
            long jM2029b = j7 + this.f3490n[i2] + m2029b(j4) + m2028a(j4, j5, j6) + f3477i[i2];
            long j8 = jM2030b2 + jM2029b;
            long jM2027a = jM2029b + m2027a(jM2030b) + m2030b(jM2030b, j, j2);
            int i5 = i4 + 1;
            long jM2028a = m2028a(j8, j4, j5) + m2029b(j8) + f3477i[i4] + this.f3490n[i4] + j6;
            long j9 = j2 + jM2028a;
            long jM2030b3 = jM2028a + m2030b(jM2027a, jM2030b, j) + m2027a(jM2027a);
            int i6 = i5 + 1;
            long jM2029b2 = j5 + m2029b(j9) + m2028a(j9, j8, j4) + f3477i[i5] + this.f3490n[i5];
            long j10 = j + jM2029b2;
            long jM2030b4 = jM2029b2 + m2030b(jM2030b3, jM2027a, jM2030b) + m2027a(jM2030b3);
            int i7 = i6 + 1;
            long jM2029b3 = j4 + m2029b(j10) + m2028a(j10, j9, j8) + f3477i[i6] + this.f3490n[i6];
            long j11 = jM2030b + jM2029b3;
            long jM2030b5 = m2030b(jM2030b4, jM2030b3, jM2027a) + m2027a(jM2030b4) + jM2029b3;
            int i8 = i7 + 1;
            long jM2029b4 = j8 + m2029b(j11) + m2028a(j11, j10, j9) + f3477i[i7] + this.f3490n[i7];
            long j12 = jM2027a + jM2029b4;
            jM2030b2 = jM2029b4 + m2030b(jM2030b5, jM2030b4, jM2030b3) + m2027a(jM2030b5);
            int i9 = i8 + 1;
            long jM2029b5 = m2029b(j12) + m2028a(j12, j11, j10) + f3477i[i8] + this.f3490n[i8] + j9;
            long j13 = jM2030b3 + jM2029b5;
            long jM2027a2 = jM2029b5 + m2027a(jM2030b2) + m2030b(jM2030b2, jM2030b5, jM2030b4);
            int i10 = i9 + 1;
            long jM2028a2 = m2028a(j13, j12, j11) + m2029b(j13) + f3477i[i9] + this.f3490n[i9] + j10;
            long j14 = jM2030b4 + jM2028a2;
            long jM2030b6 = jM2028a2 + m2030b(jM2027a2, jM2030b2, jM2030b5) + m2027a(jM2027a2);
            i2 = i10 + 1;
            long jM2029b6 = j11 + m2029b(j14) + m2028a(j14, j13, j12) + f3477i[i10] + this.f3490n[i10];
            long j15 = jM2030b5 + jM2029b6;
            jM2030b = jM2029b6 + m2030b(jM2030b6, jM2027a2, jM2030b2) + m2027a(jM2030b6);
            i3++;
            j7 = j12;
            j6 = j13;
            j5 = j14;
            j4 = j15;
            j2 = jM2027a2;
            j = jM2030b6;
        }
        this.f3478a = jM2030b + this.f3478a;
        this.f3479b += j;
        this.f3480c += j2;
        this.f3481d += jM2030b2;
        this.f3482e = j4 + this.f3482e;
        this.f3483f += j5;
        this.f3484g += j6;
        this.f3485h += j7;
        this.f3491o = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.f3490n[i11] = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        byte[] bArr = this.f3486j;
        int i = this.f3487k;
        this.f3487k = i + 1;
        bArr[i] = b;
        if (this.f3487k == this.f3486j.length) {
            m2031b(this.f3486j, 0);
            this.f3487k = 0;
        }
        this.f3488l++;
    }

    /* JADX INFO: renamed from: a */
    protected final void m2036a(AbstractC0833j abstractC0833j) {
        System.arraycopy(abstractC0833j.f3486j, 0, this.f3486j, 0, abstractC0833j.f3486j.length);
        this.f3487k = abstractC0833j.f3487k;
        this.f3488l = abstractC0833j.f3488l;
        this.f3489m = abstractC0833j.f3489m;
        this.f3478a = abstractC0833j.f3478a;
        this.f3479b = abstractC0833j.f3479b;
        this.f3480c = abstractC0833j.f3480c;
        this.f3481d = abstractC0833j.f3481d;
        this.f3482e = abstractC0833j.f3482e;
        this.f3483f = abstractC0833j.f3483f;
        this.f3484g = abstractC0833j.f3484g;
        this.f3485h = abstractC0833j.f3485h;
        System.arraycopy(abstractC0833j.f3490n, 0, this.f3490n, 0, abstractC0833j.f3490n.length);
        this.f3491o = abstractC0833j.f3491o;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        while (this.f3487k != 0 && i2 > 0) {
            mo1928a(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f3486j.length) {
            m2031b(bArr, i);
            i += this.f3486j.length;
            i2 -= this.f3486j.length;
            this.f3488l += (long) this.f3486j.length;
        }
        while (i2 > 0) {
            mo1928a(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public void mo1931c() {
        this.f3488l = 0L;
        this.f3489m = 0L;
        this.f3487k = 0;
        for (int i = 0; i < this.f3486j.length; i++) {
            this.f3486j[i] = 0;
        }
        this.f3491o = 0;
        for (int i2 = 0; i2 != this.f3490n.length; i2++) {
            this.f3490n[i2] = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1178u
    /* JADX INFO: renamed from: d */
    public final int mo1932d() {
        return 128;
    }

    /* JADX INFO: renamed from: f */
    public final void m2037f() {
        m2034g();
        long j = this.f3488l << 3;
        long j2 = this.f3489m;
        mo1928a((byte) -128);
        while (this.f3487k != 0) {
            mo1928a((byte) 0);
        }
        if (this.f3491o > 14) {
            m2035h();
        }
        this.f3490n[14] = j2;
        this.f3490n[15] = j;
        m2035h();
    }
}
