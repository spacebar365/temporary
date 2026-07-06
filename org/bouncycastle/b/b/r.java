package org.bouncycastle.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends h {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int[] k;
    private int l;

    public r() {
        this.k = new int[16];
        c();
    }

    public r(r rVar) {
        super(rVar);
        this.k = new int[16];
        a(rVar);
    }

    private static int a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    private static int a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void a(r rVar) {
        super.a((h) rVar);
        this.a = rVar.a;
        this.b = rVar.b;
        this.c = rVar.c;
        this.d = rVar.d;
        this.e = rVar.e;
        this.f = rVar.f;
        this.g = rVar.g;
        this.h = rVar.h;
        this.i = rVar.i;
        this.j = rVar.j;
        System.arraycopy(rVar.k, 0, this.k, 0, rVar.k.length);
        this.l = rVar.l;
    }

    private static int b(int i, int i2, int i3) {
        return (i & i3) | ((i3 ^ (-1)) & i2);
    }

    @Override // org.bouncycastle.b.r
    public final int a(byte[] bArr, int i) {
        f();
        a(this.a, bArr, i);
        a(this.b, bArr, i + 4);
        a(this.c, bArr, i + 8);
        a(this.d, bArr, i + 12);
        a(this.e, bArr, i + 16);
        a(this.f, bArr, i + 20);
        a(this.g, bArr, i + 24);
        a(this.h, bArr, i + 28);
        a(this.i, bArr, i + 32);
        a(this.j, bArr, i + 36);
        c();
        return 40;
    }

    @Override // org.bouncycastle.b.r
    public final String a() {
        return "RIPEMD320";
    }

    @Override // org.bouncycastle.b.b.h
    protected final void a(long j) {
        if (this.l > 14) {
            g();
        }
        this.k[14] = (int) ((-1) & j);
        this.k[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.f.e
    public final void a(org.bouncycastle.f.e eVar) {
        a((r) eVar);
    }

    @Override // org.bouncycastle.b.r
    public final int b() {
        return 40;
    }

    @Override // org.bouncycastle.b.b.h
    protected final void b(byte[] bArr, int i) {
        int[] iArr = this.k;
        int i2 = this.l;
        this.l = i2 + 1;
        iArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        if (this.l == 16) {
            g();
        }
    }

    @Override // org.bouncycastle.b.b.h, org.bouncycastle.b.r
    public final void c() {
        super.c();
        this.a = 1732584193;
        this.b = -271733879;
        this.c = -1732584194;
        this.d = 271733878;
        this.e = -1009589776;
        this.f = 1985229328;
        this.g = -19088744;
        this.h = -1985229329;
        this.i = 19088743;
        this.j = 1009589775;
        this.l = 0;
        for (int i = 0; i != this.k.length; i++) {
            this.k[i] = 0;
        }
    }

    @Override // org.bouncycastle.f.e
    public final org.bouncycastle.f.e e() {
        return new r(this);
    }

    @Override // org.bouncycastle.b.b.h
    protected final void g() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        int iA = a(i + ((i2 ^ i3) ^ i4) + this.k[0], 11) + i5;
        int iA2 = a(i3, 10);
        int iA3 = a(i5 + ((iA ^ i2) ^ iA2) + this.k[1], 14) + i4;
        int iA4 = a(i2, 10);
        int iA5 = a(i4 + ((iA3 ^ iA) ^ iA4) + this.k[2], 15) + iA2;
        int iA6 = a(iA, 10);
        int iA7 = a(iA2 + ((iA5 ^ iA3) ^ iA6) + this.k[3], 12) + iA4;
        int iA8 = a(iA3, 10);
        int iA9 = a(iA4 + ((iA7 ^ iA5) ^ iA8) + this.k[4], 5) + iA6;
        int iA10 = a(iA5, 10);
        int iA11 = a(iA6 + ((iA9 ^ iA7) ^ iA10) + this.k[5], 8) + iA8;
        int iA12 = a(iA7, 10);
        int iA13 = a(iA8 + ((iA11 ^ iA9) ^ iA12) + this.k[6], 7) + iA10;
        int iA14 = a(iA9, 10);
        int iA15 = a(iA10 + ((iA13 ^ iA11) ^ iA14) + this.k[7], 9) + iA12;
        int iA16 = a(iA11, 10);
        int iA17 = a(iA12 + ((iA15 ^ iA13) ^ iA16) + this.k[8], 11) + iA14;
        int iA18 = a(iA13, 10);
        int iA19 = a(iA14 + ((iA17 ^ iA15) ^ iA18) + this.k[9], 13) + iA16;
        int iA20 = a(iA15, 10);
        int iA21 = a(iA16 + ((iA19 ^ iA17) ^ iA20) + this.k[10], 14) + iA18;
        int iA22 = a(iA17, 10);
        int iA23 = a(iA18 + ((iA21 ^ iA19) ^ iA22) + this.k[11], 15) + iA20;
        int iA24 = a(iA19, 10);
        int iA25 = a(iA20 + ((iA23 ^ iA21) ^ iA24) + this.k[12], 6) + iA22;
        int iA26 = a(iA21, 10);
        int iA27 = a(iA22 + ((iA25 ^ iA23) ^ iA26) + this.k[13], 7) + iA24;
        int iA28 = a(iA23, 10);
        int iA29 = a(iA24 + ((iA27 ^ iA25) ^ iA28) + this.k[14], 9) + iA26;
        int iA30 = a(iA25, 10);
        int iA31 = a(iA26 + ((iA29 ^ iA27) ^ iA30) + this.k[15], 8) + iA28;
        int iA32 = a(iA27, 10);
        int iA33 = a(i6 + (((i9 ^ (-1)) | i8) ^ i7) + this.k[5] + 1352829926, 8) + i10;
        int iA34 = a(i8, 10);
        int iA35 = a(i10 + (((iA34 ^ (-1)) | i7) ^ iA33) + this.k[14] + 1352829926, 9) + i9;
        int iA36 = a(i7, 10);
        int iA37 = a(i9 + (((iA36 ^ (-1)) | iA33) ^ iA35) + this.k[7] + 1352829926, 9) + iA34;
        int iA38 = a(iA33, 10);
        int iA39 = a(iA34 + (((iA38 ^ (-1)) | iA35) ^ iA37) + this.k[0] + 1352829926, 11) + iA36;
        int iA40 = a(iA35, 10);
        int iA41 = a(iA36 + (((iA40 ^ (-1)) | iA37) ^ iA39) + this.k[9] + 1352829926, 13) + iA38;
        int iA42 = a(iA37, 10);
        int iA43 = a(iA38 + (((iA42 ^ (-1)) | iA39) ^ iA41) + this.k[2] + 1352829926, 15) + iA40;
        int iA44 = a(iA39, 10);
        int iA45 = a(iA40 + (((iA44 ^ (-1)) | iA41) ^ iA43) + this.k[11] + 1352829926, 15) + iA42;
        int iA46 = a(iA41, 10);
        int iA47 = a(iA42 + (((iA46 ^ (-1)) | iA43) ^ iA45) + this.k[4] + 1352829926, 5) + iA44;
        int iA48 = a(iA43, 10);
        int iA49 = a(iA44 + (((iA48 ^ (-1)) | iA45) ^ iA47) + this.k[13] + 1352829926, 7) + iA46;
        int iA50 = a(iA45, 10);
        int iA51 = a(iA46 + (((iA50 ^ (-1)) | iA47) ^ iA49) + this.k[6] + 1352829926, 7) + iA48;
        int iA52 = a(iA47, 10);
        int iA53 = a(iA48 + (((iA52 ^ (-1)) | iA49) ^ iA51) + this.k[15] + 1352829926, 8) + iA50;
        int iA54 = a(iA49, 10);
        int iA55 = a(iA50 + (((iA54 ^ (-1)) | iA51) ^ iA53) + this.k[8] + 1352829926, 11) + iA52;
        int iA56 = a(iA51, 10);
        int iA57 = a(iA52 + (((iA56 ^ (-1)) | iA53) ^ iA55) + this.k[1] + 1352829926, 14) + iA54;
        int iA58 = a(iA53, 10);
        int iA59 = a(iA54 + (((iA58 ^ (-1)) | iA55) ^ iA57) + this.k[10] + 1352829926, 14) + iA56;
        int iA60 = a(iA55, 10);
        int iA61 = a(iA56 + (((iA60 ^ (-1)) | iA57) ^ iA59) + this.k[3] + 1352829926, 12) + iA58;
        int iA62 = a(iA57, 10);
        int iA63 = a(iA58 + (((iA62 ^ (-1)) | iA59) ^ iA61) + this.k[12] + 1352829926, 6) + iA60;
        int iA64 = a(iA59, 10);
        int iA65 = a(iA28 + a(iA63, iA29, iA32) + this.k[7] + 1518500249, 7) + iA30;
        int iA66 = a(iA29, 10);
        int iA67 = a(iA30 + a(iA65, iA63, iA66) + this.k[4] + 1518500249, 6) + iA32;
        int iA68 = a(iA63, 10);
        int iA69 = a(iA32 + a(iA67, iA65, iA68) + this.k[13] + 1518500249, 8) + iA66;
        int iA70 = a(iA65, 10);
        int iA71 = a(iA66 + a(iA69, iA67, iA70) + this.k[1] + 1518500249, 13) + iA68;
        int iA72 = a(iA67, 10);
        int iA73 = a(iA68 + a(iA71, iA69, iA72) + this.k[10] + 1518500249, 11) + iA70;
        int iA74 = a(iA69, 10);
        int iA75 = a(iA70 + a(iA73, iA71, iA74) + this.k[6] + 1518500249, 9) + iA72;
        int iA76 = a(iA71, 10);
        int iA77 = a(iA72 + a(iA75, iA73, iA76) + this.k[15] + 1518500249, 7) + iA74;
        int iA78 = a(iA73, 10);
        int iA79 = a(iA74 + a(iA77, iA75, iA78) + this.k[3] + 1518500249, 15) + iA76;
        int iA80 = a(iA75, 10);
        int iA81 = a(iA76 + a(iA79, iA77, iA80) + this.k[12] + 1518500249, 7) + iA78;
        int iA82 = a(iA77, 10);
        int iA83 = a(iA78 + a(iA81, iA79, iA82) + this.k[0] + 1518500249, 12) + iA80;
        int iA84 = a(iA79, 10);
        int iA85 = a(iA80 + a(iA83, iA81, iA84) + this.k[9] + 1518500249, 15) + iA82;
        int iA86 = a(iA81, 10);
        int iA87 = a(iA82 + a(iA85, iA83, iA86) + this.k[5] + 1518500249, 9) + iA84;
        int iA88 = a(iA83, 10);
        int iA89 = a(iA84 + a(iA87, iA85, iA88) + this.k[2] + 1518500249, 11) + iA86;
        int iA90 = a(iA85, 10);
        int iA91 = a(iA86 + a(iA89, iA87, iA90) + this.k[14] + 1518500249, 7) + iA88;
        int iA92 = a(iA87, 10);
        int iA93 = a(iA88 + a(iA91, iA89, iA92) + this.k[11] + 1518500249, 13) + iA90;
        int iA94 = a(iA89, 10);
        int iA95 = a(iA90 + a(iA93, iA91, iA94) + this.k[8] + 1518500249, 12) + iA92;
        int iA96 = a(iA91, 10);
        int iA97 = a(iA60 + b(iA31, iA61, iA64) + this.k[6] + 1548603684, 9) + iA62;
        int iA98 = a(iA61, 10);
        int iA99 = a(iA62 + b(iA97, iA31, iA98) + this.k[11] + 1548603684, 13) + iA64;
        int iA100 = a(iA31, 10);
        int iA101 = a(iA64 + b(iA99, iA97, iA100) + this.k[3] + 1548603684, 15) + iA98;
        int iA102 = a(iA97, 10);
        int iA103 = a(iA98 + b(iA101, iA99, iA102) + this.k[7] + 1548603684, 7) + iA100;
        int iA104 = a(iA99, 10);
        int iA105 = a(iA100 + b(iA103, iA101, iA104) + this.k[0] + 1548603684, 12) + iA102;
        int iA106 = a(iA101, 10);
        int iA107 = a(iA102 + b(iA105, iA103, iA106) + this.k[13] + 1548603684, 8) + iA104;
        int iA108 = a(iA103, 10);
        int iA109 = a(iA104 + b(iA107, iA105, iA108) + this.k[5] + 1548603684, 9) + iA106;
        int iA110 = a(iA105, 10);
        int iA111 = a(iA106 + b(iA109, iA107, iA110) + this.k[10] + 1548603684, 11) + iA108;
        int iA112 = a(iA107, 10);
        int iA113 = a(iA108 + b(iA111, iA109, iA112) + this.k[14] + 1548603684, 7) + iA110;
        int iA114 = a(iA109, 10);
        int iA115 = a(iA110 + b(iA113, iA111, iA114) + this.k[15] + 1548603684, 7) + iA112;
        int iA116 = a(iA111, 10);
        int iA117 = a(iA112 + b(iA115, iA113, iA116) + this.k[8] + 1548603684, 12) + iA114;
        int iA118 = a(iA113, 10);
        int iA119 = a(iA114 + b(iA117, iA115, iA118) + this.k[12] + 1548603684, 7) + iA116;
        int iA120 = a(iA115, 10);
        int iA121 = a(iA116 + b(iA119, iA117, iA120) + this.k[4] + 1548603684, 6) + iA118;
        int iA122 = a(iA117, 10);
        int iA123 = a(iA118 + b(iA121, iA119, iA122) + this.k[9] + 1548603684, 15) + iA120;
        int iA124 = a(iA119, 10);
        int iA125 = a(iA120 + b(iA123, iA121, iA124) + this.k[1] + 1548603684, 13) + iA122;
        int iA126 = a(iA121, 10);
        int iA127 = a(iA122 + b(iA125, iA123, iA126) + this.k[2] + 1548603684, 11) + iA124;
        int iA128 = a(iA123, 10);
        int iA129 = a(iA92 + (((iA93 ^ (-1)) | iA95) ^ iA128) + this.k[3] + 1859775393, 11) + iA94;
        int iA130 = a(iA93, 10);
        int iA131 = a(iA94 + (((iA95 ^ (-1)) | iA129) ^ iA130) + this.k[10] + 1859775393, 13) + iA128;
        int iA132 = a(iA95, 10);
        int iA133 = a(iA128 + (((iA129 ^ (-1)) | iA131) ^ iA132) + this.k[14] + 1859775393, 6) + iA130;
        int iA134 = a(iA129, 10);
        int iA135 = a(iA130 + (((iA131 ^ (-1)) | iA133) ^ iA134) + this.k[4] + 1859775393, 7) + iA132;
        int iA136 = a(iA131, 10);
        int iA137 = a(iA132 + (((iA133 ^ (-1)) | iA135) ^ iA136) + this.k[9] + 1859775393, 14) + iA134;
        int iA138 = a(iA133, 10);
        int iA139 = a(iA134 + (((iA135 ^ (-1)) | iA137) ^ iA138) + this.k[15] + 1859775393, 9) + iA136;
        int iA140 = a(iA135, 10);
        int iA141 = a(iA136 + (((iA137 ^ (-1)) | iA139) ^ iA140) + this.k[8] + 1859775393, 13) + iA138;
        int iA142 = a(iA137, 10);
        int iA143 = a(iA138 + (((iA139 ^ (-1)) | iA141) ^ iA142) + this.k[1] + 1859775393, 15) + iA140;
        int iA144 = a(iA139, 10);
        int iA145 = a(iA140 + (((iA141 ^ (-1)) | iA143) ^ iA144) + this.k[2] + 1859775393, 14) + iA142;
        int iA146 = a(iA141, 10);
        int iA147 = a(iA142 + (((iA143 ^ (-1)) | iA145) ^ iA146) + this.k[7] + 1859775393, 8) + iA144;
        int iA148 = a(iA143, 10);
        int iA149 = a(iA144 + (((iA145 ^ (-1)) | iA147) ^ iA148) + this.k[0] + 1859775393, 13) + iA146;
        int iA150 = a(iA145, 10);
        int iA151 = a(iA146 + (((iA147 ^ (-1)) | iA149) ^ iA150) + this.k[6] + 1859775393, 6) + iA148;
        int iA152 = a(iA147, 10);
        int iA153 = a(iA148 + (((iA149 ^ (-1)) | iA151) ^ iA152) + this.k[13] + 1859775393, 5) + iA150;
        int iA154 = a(iA149, 10);
        int iA155 = a(iA150 + (((iA151 ^ (-1)) | iA153) ^ iA154) + this.k[11] + 1859775393, 12) + iA152;
        int iA156 = a(iA151, 10);
        int iA157 = a(iA152 + (((iA153 ^ (-1)) | iA155) ^ iA156) + this.k[5] + 1859775393, 7) + iA154;
        int iA158 = a(iA153, 10);
        int iA159 = a(iA154 + (((iA155 ^ (-1)) | iA157) ^ iA158) + this.k[12] + 1859775393, 5) + iA156;
        int iA160 = a(iA155, 10);
        int iA161 = a(iA124 + (((iA125 ^ (-1)) | iA127) ^ iA96) + this.k[15] + 1836072691, 9) + iA126;
        int iA162 = a(iA125, 10);
        int iA163 = a(iA126 + (((iA127 ^ (-1)) | iA161) ^ iA162) + this.k[5] + 1836072691, 7) + iA96;
        int iA164 = a(iA127, 10);
        int iA165 = a(iA96 + (((iA161 ^ (-1)) | iA163) ^ iA164) + this.k[1] + 1836072691, 15) + iA162;
        int iA166 = a(iA161, 10);
        int iA167 = a(iA162 + (((iA163 ^ (-1)) | iA165) ^ iA166) + this.k[3] + 1836072691, 11) + iA164;
        int iA168 = a(iA163, 10);
        int iA169 = a(iA164 + (((iA165 ^ (-1)) | iA167) ^ iA168) + this.k[7] + 1836072691, 8) + iA166;
        int iA170 = a(iA165, 10);
        int iA171 = a(iA166 + (((iA167 ^ (-1)) | iA169) ^ iA170) + this.k[14] + 1836072691, 6) + iA168;
        int iA172 = a(iA167, 10);
        int iA173 = a(iA168 + (((iA169 ^ (-1)) | iA171) ^ iA172) + this.k[6] + 1836072691, 6) + iA170;
        int iA174 = a(iA169, 10);
        int iA175 = a(iA170 + (((iA171 ^ (-1)) | iA173) ^ iA174) + this.k[9] + 1836072691, 14) + iA172;
        int iA176 = a(iA171, 10);
        int iA177 = a(iA172 + (((iA173 ^ (-1)) | iA175) ^ iA176) + this.k[11] + 1836072691, 12) + iA174;
        int iA178 = a(iA173, 10);
        int iA179 = a(iA174 + (((iA175 ^ (-1)) | iA177) ^ iA178) + this.k[8] + 1836072691, 13) + iA176;
        int iA180 = a(iA175, 10);
        int iA181 = a(iA176 + (((iA177 ^ (-1)) | iA179) ^ iA180) + this.k[12] + 1836072691, 5) + iA178;
        int iA182 = a(iA177, 10);
        int iA183 = a(iA178 + (((iA179 ^ (-1)) | iA181) ^ iA182) + this.k[2] + 1836072691, 14) + iA180;
        int iA184 = a(iA179, 10);
        int iA185 = a(iA180 + (((iA181 ^ (-1)) | iA183) ^ iA184) + this.k[10] + 1836072691, 13) + iA182;
        int iA186 = a(iA181, 10);
        int iA187 = a(iA182 + (((iA183 ^ (-1)) | iA185) ^ iA186) + this.k[0] + 1836072691, 13) + iA184;
        int iA188 = a(iA183, 10);
        int iA189 = a(iA184 + (((iA185 ^ (-1)) | iA187) ^ iA188) + this.k[4] + 1836072691, 7) + iA186;
        int iA190 = a(iA185, 10);
        int iA191 = a(iA186 + (((iA187 ^ (-1)) | iA189) ^ iA190) + this.k[13] + 1836072691, 5) + iA188;
        int iA192 = a(iA187, 10);
        int iA193 = a(((iA188 + b(iA159, iA157, iA160)) + this.k[1]) - 1894007588, 11) + iA158;
        int iA194 = a(iA157, 10);
        int iA195 = a(((iA158 + b(iA193, iA159, iA194)) + this.k[9]) - 1894007588, 12) + iA160;
        int iA196 = a(iA159, 10);
        int iA197 = a(((iA160 + b(iA195, iA193, iA196)) + this.k[11]) - 1894007588, 14) + iA194;
        int iA198 = a(iA193, 10);
        int iA199 = a(((iA194 + b(iA197, iA195, iA198)) + this.k[10]) - 1894007588, 15) + iA196;
        int iA200 = a(iA195, 10);
        int iA201 = a(((iA196 + b(iA199, iA197, iA200)) + this.k[0]) - 1894007588, 14) + iA198;
        int iA202 = a(iA197, 10);
        int iA203 = a(((iA198 + b(iA201, iA199, iA202)) + this.k[8]) - 1894007588, 15) + iA200;
        int iA204 = a(iA199, 10);
        int iA205 = a(((iA200 + b(iA203, iA201, iA204)) + this.k[12]) - 1894007588, 9) + iA202;
        int iA206 = a(iA201, 10);
        int iA207 = a(((iA202 + b(iA205, iA203, iA206)) + this.k[4]) - 1894007588, 8) + iA204;
        int iA208 = a(iA203, 10);
        int iA209 = a(((iA204 + b(iA207, iA205, iA208)) + this.k[13]) - 1894007588, 9) + iA206;
        int iA210 = a(iA205, 10);
        int iA211 = a(((iA206 + b(iA209, iA207, iA210)) + this.k[3]) - 1894007588, 14) + iA208;
        int iA212 = a(iA207, 10);
        int iA213 = a(((iA208 + b(iA211, iA209, iA212)) + this.k[7]) - 1894007588, 5) + iA210;
        int iA214 = a(iA209, 10);
        int iA215 = a(((iA210 + b(iA213, iA211, iA214)) + this.k[15]) - 1894007588, 6) + iA212;
        int iA216 = a(iA211, 10);
        int iA217 = a(((iA212 + b(iA215, iA213, iA216)) + this.k[14]) - 1894007588, 8) + iA214;
        int iA218 = a(iA213, 10);
        int iA219 = a(((iA214 + b(iA217, iA215, iA218)) + this.k[5]) - 1894007588, 6) + iA216;
        int iA220 = a(iA215, 10);
        int iA221 = a(((iA216 + b(iA219, iA217, iA220)) + this.k[6]) - 1894007588, 5) + iA218;
        int iA222 = a(iA217, 10);
        int iA223 = a(((iA218 + b(iA221, iA219, iA222)) + this.k[2]) - 1894007588, 12) + iA220;
        int iA224 = a(iA219, 10);
        int iA225 = a(iA156 + a(iA191, iA189, iA192) + this.k[8] + 2053994217, 15) + iA190;
        int iA226 = a(iA189, 10);
        int iA227 = a(iA190 + a(iA225, iA191, iA226) + this.k[6] + 2053994217, 5) + iA192;
        int iA228 = a(iA191, 10);
        int iA229 = a(iA192 + a(iA227, iA225, iA228) + this.k[4] + 2053994217, 8) + iA226;
        int iA230 = a(iA225, 10);
        int iA231 = a(iA226 + a(iA229, iA227, iA230) + this.k[1] + 2053994217, 11) + iA228;
        int iA232 = a(iA227, 10);
        int iA233 = a(iA228 + a(iA231, iA229, iA232) + this.k[3] + 2053994217, 14) + iA230;
        int iA234 = a(iA229, 10);
        int iA235 = a(iA230 + a(iA233, iA231, iA234) + this.k[11] + 2053994217, 14) + iA232;
        int iA236 = a(iA231, 10);
        int iA237 = a(iA232 + a(iA235, iA233, iA236) + this.k[15] + 2053994217, 6) + iA234;
        int iA238 = a(iA233, 10);
        int iA239 = a(iA234 + a(iA237, iA235, iA238) + this.k[0] + 2053994217, 14) + iA236;
        int iA240 = a(iA235, 10);
        int iA241 = a(iA236 + a(iA239, iA237, iA240) + this.k[5] + 2053994217, 6) + iA238;
        int iA242 = a(iA237, 10);
        int iA243 = a(iA238 + a(iA241, iA239, iA242) + this.k[12] + 2053994217, 9) + iA240;
        int iA244 = a(iA239, 10);
        int iA245 = a(iA240 + a(iA243, iA241, iA244) + this.k[2] + 2053994217, 12) + iA242;
        int iA246 = a(iA241, 10);
        int iA247 = a(iA242 + a(iA245, iA243, iA246) + this.k[13] + 2053994217, 9) + iA244;
        int iA248 = a(iA243, 10);
        int iA249 = a(iA244 + a(iA247, iA245, iA248) + this.k[9] + 2053994217, 12) + iA246;
        int iA250 = a(iA245, 10);
        int iA251 = a(iA246 + a(iA249, iA247, iA250) + this.k[7] + 2053994217, 5) + iA248;
        int iA252 = a(iA247, 10);
        int iA253 = a(iA248 + a(iA251, iA249, iA252) + this.k[10] + 2053994217, 15) + iA250;
        int iA254 = a(iA249, 10);
        int iA255 = a(iA250 + a(iA253, iA251, iA254) + this.k[14] + 2053994217, 8) + iA252;
        int iA256 = a(iA251, 10);
        int iA257 = a(((iA220 + (((iA224 ^ (-1)) | iA253) ^ iA223)) + this.k[4]) - 1454113458, 9) + iA222;
        int iA258 = a(iA253, 10);
        int iA259 = a(((iA222 + (((iA258 ^ (-1)) | iA223) ^ iA257)) + this.k[0]) - 1454113458, 15) + iA224;
        int iA260 = a(iA223, 10);
        int iA261 = a(((iA224 + (((iA260 ^ (-1)) | iA257) ^ iA259)) + this.k[5]) - 1454113458, 5) + iA258;
        int iA262 = a(iA257, 10);
        int iA263 = a(((iA258 + (((iA262 ^ (-1)) | iA259) ^ iA261)) + this.k[9]) - 1454113458, 11) + iA260;
        int iA264 = a(iA259, 10);
        int iA265 = a(((iA260 + (((iA264 ^ (-1)) | iA261) ^ iA263)) + this.k[7]) - 1454113458, 6) + iA262;
        int iA266 = a(iA261, 10);
        int iA267 = a(((iA262 + (((iA266 ^ (-1)) | iA263) ^ iA265)) + this.k[12]) - 1454113458, 8) + iA264;
        int iA268 = a(iA263, 10);
        int iA269 = a(((iA264 + (((iA268 ^ (-1)) | iA265) ^ iA267)) + this.k[2]) - 1454113458, 13) + iA266;
        int iA270 = a(iA265, 10);
        int iA271 = a(((iA266 + (((iA270 ^ (-1)) | iA267) ^ iA269)) + this.k[10]) - 1454113458, 12) + iA268;
        int iA272 = a(iA267, 10);
        int iA273 = a(((iA268 + (((iA272 ^ (-1)) | iA269) ^ iA271)) + this.k[14]) - 1454113458, 5) + iA270;
        int iA274 = a(iA269, 10);
        int iA275 = a(((iA270 + (((iA274 ^ (-1)) | iA271) ^ iA273)) + this.k[1]) - 1454113458, 12) + iA272;
        int iA276 = a(iA271, 10);
        int iA277 = a(((iA272 + (((iA276 ^ (-1)) | iA273) ^ iA275)) + this.k[3]) - 1454113458, 13) + iA274;
        int iA278 = a(iA273, 10);
        int iA279 = a(((iA274 + (((iA278 ^ (-1)) | iA275) ^ iA277)) + this.k[8]) - 1454113458, 14) + iA276;
        int iA280 = a(iA275, 10);
        int iA281 = a(((iA276 + (((iA280 ^ (-1)) | iA277) ^ iA279)) + this.k[11]) - 1454113458, 11) + iA278;
        int iA282 = a(iA277, 10);
        int iA283 = a(((iA278 + (((iA282 ^ (-1)) | iA279) ^ iA281)) + this.k[6]) - 1454113458, 8) + iA280;
        int iA284 = a(iA279, 10);
        int iA285 = a(((iA280 + (((iA284 ^ (-1)) | iA281) ^ iA283)) + this.k[15]) - 1454113458, 5) + iA282;
        int iA286 = a(iA281, 10);
        int iA287 = a(((iA282 + (((iA286 ^ (-1)) | iA283) ^ iA285)) + this.k[13]) - 1454113458, 6) + iA284;
        int iA288 = a(iA283, 10);
        int iA289 = a(iA252 + ((iA255 ^ iA221) ^ iA256) + this.k[12], 8) + iA254;
        int iA290 = a(iA221, 10);
        int iA291 = a(iA254 + ((iA289 ^ iA255) ^ iA290) + this.k[15], 5) + iA256;
        int iA292 = a(iA255, 10);
        int iA293 = a(iA256 + ((iA291 ^ iA289) ^ iA292) + this.k[10], 12) + iA290;
        int iA294 = a(iA289, 10);
        int iA295 = a(iA290 + ((iA293 ^ iA291) ^ iA294) + this.k[4], 9) + iA292;
        int iA296 = a(iA291, 10);
        int iA297 = a(iA292 + ((iA295 ^ iA293) ^ iA296) + this.k[1], 12) + iA294;
        int iA298 = a(iA293, 10);
        int iA299 = a(iA294 + ((iA297 ^ iA295) ^ iA298) + this.k[5], 5) + iA296;
        int iA300 = a(iA295, 10);
        int iA301 = a(iA296 + ((iA299 ^ iA297) ^ iA300) + this.k[8], 14) + iA298;
        int iA302 = a(iA297, 10);
        int iA303 = a(iA298 + ((iA301 ^ iA299) ^ iA302) + this.k[7], 6) + iA300;
        int iA304 = a(iA299, 10);
        int iA305 = a(iA300 + ((iA303 ^ iA301) ^ iA304) + this.k[6], 8) + iA302;
        int iA306 = a(iA301, 10);
        int iA307 = a(iA302 + ((iA305 ^ iA303) ^ iA306) + this.k[2], 13) + iA304;
        int iA308 = a(iA303, 10);
        int iA309 = a(iA304 + ((iA307 ^ iA305) ^ iA308) + this.k[13], 6) + iA306;
        int iA310 = a(iA305, 10);
        int iA311 = a(iA306 + ((iA309 ^ iA307) ^ iA310) + this.k[14], 5) + iA308;
        int iA312 = a(iA307, 10);
        int iA313 = a(iA308 + ((iA311 ^ iA309) ^ iA312) + this.k[0], 15) + iA310;
        int iA314 = a(iA309, 10);
        int iA315 = a(iA310 + ((iA313 ^ iA311) ^ iA314) + this.k[3], 13) + iA312;
        int iA316 = a(iA311, 10);
        int iA317 = a(iA312 + ((iA315 ^ iA313) ^ iA316) + this.k[9], 11) + iA314;
        int iA318 = a(iA313, 10);
        int iA319 = a(iA314 + ((iA317 ^ iA315) ^ iA318) + this.k[11], 11) + iA316;
        int iA320 = a(iA315, 10);
        this.a = iA284 + this.a;
        this.b += iA287;
        this.c += iA285;
        this.d += iA288;
        this.e += iA318;
        this.f = iA316 + this.f;
        this.g += iA319;
        this.h += iA317;
        this.i += iA320;
        this.j += iA286;
        this.l = 0;
        for (int i11 = 0; i11 != this.k.length; i11++) {
            this.k[i11] = 0;
        }
    }
}
