package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.C0803ac;
import org.bouncycastle.p083b.C1163o;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1091bp;

/* JADX INFO: renamed from: org.bouncycastle.b.e.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0919ba implements InterfaceC0890e {

    /* JADX INFO: renamed from: a */
    private static int[] f3804a = new int[80];

    /* JADX INFO: renamed from: b */
    private static int[] f3805b = new int[80];

    /* JADX INFO: renamed from: c */
    private static int[] f3806c = new int[f3804a.length];

    /* JADX INFO: renamed from: d */
    private static int[] f3807d = new int[f3804a.length];

    /* JADX INFO: renamed from: e */
    private int f3808e;

    /* JADX INFO: renamed from: f */
    private int f3809f;

    /* JADX INFO: renamed from: g */
    private long[] f3810g;

    /* JADX INFO: renamed from: h */
    private long[] f3811h = new long[5];

    /* JADX INFO: renamed from: i */
    private long[] f3812i;

    /* JADX INFO: renamed from: j */
    private d f3813j;

    /* JADX INFO: renamed from: k */
    private boolean f3814k;

    /* JADX INFO: renamed from: org.bouncycastle.b.e.ba$a */
    private static final class a extends d {
        public a(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.p083b.p089e.C0919ba.d
        /* JADX INFO: renamed from: a */
        final void mo2280a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f3816b;
            long[] jArr4 = this.f3815a;
            int[] iArr = C0919ba.f3805b;
            int[] iArr2 = C0919ba.f3807d;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = j + jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = j4 + jArr3[3];
            long j21 = j5 + jArr3[4];
            long j22 = j6 + jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = j8 + jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = j10 + jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = j12 + jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = j14 + jArr3[13] + jArr4[0];
            long j31 = j15 + jArr3[14] + jArr4[1];
            long j32 = jArr3[15] + j16;
            for (int i = 1; i < 20; i += 2) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j33 = j17 + j18;
                long jM2268a = C0919ba.m2268a(j18, 24, j33);
                long j34 = j19 + j20;
                long jM2268a2 = C0919ba.m2268a(j20, 13, j34);
                long j35 = j21 + j22;
                long jM2268a3 = C0919ba.m2268a(j22, 8, j35);
                long j36 = j23 + j24;
                long jM2268a4 = C0919ba.m2268a(j24, 47, j36);
                long j37 = j25 + j26;
                long jM2268a5 = C0919ba.m2268a(j26, 8, j37);
                long j38 = j27 + j28;
                long jM2268a6 = C0919ba.m2268a(j28, 17, j38);
                long j39 = j29 + j30;
                long jM2268a7 = C0919ba.m2268a(j30, 22, j39);
                long j40 = j31 + j32;
                long jM2268a8 = C0919ba.m2268a(j32, 37, j40);
                long j41 = j33 + jM2268a5;
                long jM2268a9 = C0919ba.m2268a(jM2268a5, 38, j41);
                long j42 = j34 + jM2268a7;
                long jM2268a10 = C0919ba.m2268a(jM2268a7, 19, j42);
                long j43 = j36 + jM2268a6;
                long jM2268a11 = C0919ba.m2268a(jM2268a6, 10, j43);
                long j44 = j35 + jM2268a8;
                long jM2268a12 = C0919ba.m2268a(jM2268a8, 55, j44);
                long j45 = j38 + jM2268a4;
                long jM2268a13 = C0919ba.m2268a(jM2268a4, 49, j45);
                long j46 = j39 + jM2268a2;
                long jM2268a14 = C0919ba.m2268a(jM2268a2, 18, j46);
                long j47 = j40 + jM2268a3;
                long jM2268a15 = C0919ba.m2268a(jM2268a3, 23, j47);
                long j48 = j37 + jM2268a;
                long jM2268a16 = C0919ba.m2268a(jM2268a, 52, j48);
                long j49 = j41 + jM2268a13;
                long jM2268a17 = C0919ba.m2268a(jM2268a13, 33, j49);
                long j50 = j42 + jM2268a15;
                long jM2268a18 = C0919ba.m2268a(jM2268a15, 4, j50);
                long j51 = j44 + jM2268a14;
                long jM2268a19 = C0919ba.m2268a(jM2268a14, 51, j51);
                long j52 = j43 + jM2268a16;
                long jM2268a20 = C0919ba.m2268a(jM2268a16, 13, j52);
                long j53 = j46 + jM2268a12;
                long jM2268a21 = C0919ba.m2268a(jM2268a12, 34, j53);
                long j54 = j47 + jM2268a10;
                long jM2268a22 = C0919ba.m2268a(jM2268a10, 41, j54);
                long j55 = j48 + jM2268a11;
                long jM2268a23 = C0919ba.m2268a(jM2268a11, 59, j55);
                long j56 = j45 + jM2268a9;
                long jM2268a24 = C0919ba.m2268a(jM2268a9, 17, j56);
                long j57 = j49 + jM2268a21;
                long jM2268a25 = C0919ba.m2268a(jM2268a21, 5, j57);
                long j58 = j50 + jM2268a23;
                long jM2268a26 = C0919ba.m2268a(jM2268a23, 20, j58);
                long j59 = j52 + jM2268a22;
                long jM2268a27 = C0919ba.m2268a(jM2268a22, 48, j59);
                long j60 = j51 + jM2268a24;
                long jM2268a28 = C0919ba.m2268a(jM2268a24, 41, j60);
                long j61 = j54 + jM2268a20;
                long jM2268a29 = C0919ba.m2268a(jM2268a20, 47, j61);
                long j62 = j55 + jM2268a18;
                long jM2268a30 = C0919ba.m2268a(jM2268a18, 28, j62);
                long j63 = j56 + jM2268a19;
                long jM2268a31 = C0919ba.m2268a(jM2268a19, 16, j63);
                long j64 = j53 + jM2268a17;
                long jM2268a32 = C0919ba.m2268a(jM2268a17, 25, j64);
                long j65 = j57 + jArr3[i2];
                long j66 = jM2268a29 + jArr3[i2 + 1];
                long j67 = j58 + jArr3[i2 + 2];
                long j68 = jM2268a31 + jArr3[i2 + 3];
                long j69 = j60 + jArr3[i2 + 4];
                long j70 = jM2268a30 + jArr3[i2 + 5];
                long j71 = j59 + jArr3[i2 + 6];
                long j72 = jM2268a32 + jArr3[i2 + 7];
                long j73 = j62 + jArr3[i2 + 8];
                long j74 = jM2268a28 + jArr3[i2 + 9];
                long j75 = j63 + jArr3[i2 + 10];
                long j76 = jM2268a26 + jArr3[i2 + 11];
                long j77 = j64 + jArr3[i2 + 12];
                long j78 = jM2268a27 + jArr3[i2 + 13] + jArr4[i3];
                long j79 = j61 + jArr3[i2 + 14] + jArr4[i3 + 1];
                long j80 = jM2268a25 + jArr3[i2 + 15] + ((long) i);
                long j81 = j65 + j66;
                long jM2268a33 = C0919ba.m2268a(j66, 41, j81);
                long j82 = j67 + j68;
                long jM2268a34 = C0919ba.m2268a(j68, 9, j82);
                long j83 = j69 + j70;
                long jM2268a35 = C0919ba.m2268a(j70, 37, j83);
                long j84 = j71 + j72;
                long jM2268a36 = C0919ba.m2268a(j72, 31, j84);
                long j85 = j73 + j74;
                long jM2268a37 = C0919ba.m2268a(j74, 12, j85);
                long j86 = j75 + j76;
                long jM2268a38 = C0919ba.m2268a(j76, 47, j86);
                long j87 = j77 + j78;
                long jM2268a39 = C0919ba.m2268a(j78, 44, j87);
                long j88 = j79 + j80;
                long jM2268a40 = C0919ba.m2268a(j80, 30, j88);
                long j89 = j81 + jM2268a37;
                long jM2268a41 = C0919ba.m2268a(jM2268a37, 16, j89);
                long j90 = j82 + jM2268a39;
                long jM2268a42 = C0919ba.m2268a(jM2268a39, 34, j90);
                long j91 = j84 + jM2268a38;
                long jM2268a43 = C0919ba.m2268a(jM2268a38, 56, j91);
                long j92 = j83 + jM2268a40;
                long jM2268a44 = C0919ba.m2268a(jM2268a40, 51, j92);
                long j93 = j86 + jM2268a36;
                long jM2268a45 = C0919ba.m2268a(jM2268a36, 4, j93);
                long j94 = j87 + jM2268a34;
                long jM2268a46 = C0919ba.m2268a(jM2268a34, 53, j94);
                long j95 = j88 + jM2268a35;
                long jM2268a47 = C0919ba.m2268a(jM2268a35, 42, j95);
                long j96 = j85 + jM2268a33;
                long jM2268a48 = C0919ba.m2268a(jM2268a33, 41, j96);
                long j97 = j89 + jM2268a45;
                long jM2268a49 = C0919ba.m2268a(jM2268a45, 31, j97);
                long j98 = j90 + jM2268a47;
                long jM2268a50 = C0919ba.m2268a(jM2268a47, 44, j98);
                long j99 = j92 + jM2268a46;
                long jM2268a51 = C0919ba.m2268a(jM2268a46, 47, j99);
                long j100 = j91 + jM2268a48;
                long jM2268a52 = C0919ba.m2268a(jM2268a48, 46, j100);
                long j101 = j94 + jM2268a44;
                long jM2268a53 = C0919ba.m2268a(jM2268a44, 19, j101);
                long j102 = j95 + jM2268a42;
                long jM2268a54 = C0919ba.m2268a(jM2268a42, 42, j102);
                long j103 = j96 + jM2268a43;
                long jM2268a55 = C0919ba.m2268a(jM2268a43, 44, j103);
                long j104 = j93 + jM2268a41;
                long jM2268a56 = C0919ba.m2268a(jM2268a41, 25, j104);
                long j105 = j97 + jM2268a53;
                long jM2268a57 = C0919ba.m2268a(jM2268a53, 9, j105);
                long j106 = j98 + jM2268a55;
                long jM2268a58 = C0919ba.m2268a(jM2268a55, 48, j106);
                long j107 = j100 + jM2268a54;
                long jM2268a59 = C0919ba.m2268a(jM2268a54, 35, j107);
                long j108 = j99 + jM2268a56;
                long jM2268a60 = C0919ba.m2268a(jM2268a56, 52, j108);
                long j109 = j102 + jM2268a52;
                long jM2268a61 = C0919ba.m2268a(jM2268a52, 23, j109);
                long j110 = j103 + jM2268a50;
                long jM2268a62 = C0919ba.m2268a(jM2268a50, 31, j110);
                long j111 = j104 + jM2268a51;
                long jM2268a63 = C0919ba.m2268a(jM2268a51, 37, j111);
                long j112 = j101 + jM2268a49;
                long jM2268a64 = C0919ba.m2268a(jM2268a49, 20, j112);
                j17 = j105 + jArr3[i2 + 1];
                j18 = jM2268a61 + jArr3[i2 + 2];
                j19 = j106 + jArr3[i2 + 3];
                j20 = jM2268a63 + jArr3[i2 + 4];
                j21 = j108 + jArr3[i2 + 5];
                j22 = jM2268a62 + jArr3[i2 + 6];
                j23 = j107 + jArr3[i2 + 7];
                j24 = jM2268a64 + jArr3[i2 + 8];
                j25 = j110 + jArr3[i2 + 9];
                j26 = jM2268a60 + jArr3[i2 + 10];
                j27 = j111 + jArr3[i2 + 11];
                j28 = jM2268a58 + jArr3[i2 + 12];
                j29 = j112 + jArr3[i2 + 13];
                j30 = jM2268a59 + jArr3[i2 + 14] + jArr4[i3 + 1];
                j31 = j109 + jArr4[i3 + 2] + jArr3[i2 + 15];
                j32 = jM2268a57 + jArr3[i2 + 16] + ((long) i) + 1;
            }
            jArr2[0] = j17;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j20;
            jArr2[4] = j21;
            jArr2[5] = j22;
            jArr2[6] = j23;
            jArr2[7] = j24;
            jArr2[8] = j25;
            jArr2[9] = j26;
            jArr2[10] = j27;
            jArr2[11] = j28;
            jArr2[12] = j29;
            jArr2[13] = j30;
            jArr2[14] = j31;
            jArr2[15] = j32;
        }

        @Override // org.bouncycastle.p083b.p089e.C0919ba.d
        /* JADX INFO: renamed from: b */
        final void mo2281b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f3816b;
            long[] jArr4 = this.f3815a;
            int[] iArr = C0919ba.f3805b;
            int[] iArr2 = C0919ba.f3807d;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long jM2272b = jArr[1];
            long j2 = jArr[2];
            long jM2272b2 = jArr[3];
            long j3 = jArr[4];
            long jM2272b3 = jArr[5];
            long j4 = jArr[6];
            long jM2272b4 = jArr[7];
            long j5 = jArr[8];
            long jM2272b5 = jArr[9];
            long j6 = jArr[10];
            long jM2272b6 = jArr[11];
            long j7 = jArr[12];
            long jM2272b7 = jArr[13];
            long j8 = jArr[14];
            long jM2272b8 = jArr[15];
            for (int i = 19; i > 0; i -= 2) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j9 = j - jArr3[i2 + 1];
                long j10 = jM2272b - jArr3[i2 + 2];
                long j11 = j2 - jArr3[i2 + 3];
                long j12 = jM2272b2 - jArr3[i2 + 4];
                long j13 = j3 - jArr3[i2 + 5];
                long j14 = jM2272b3 - jArr3[i2 + 6];
                long j15 = j4 - jArr3[i2 + 7];
                long j16 = jM2272b4 - jArr3[i2 + 8];
                long j17 = j5 - jArr3[i2 + 9];
                long j18 = jM2272b5 - jArr3[i2 + 10];
                long j19 = j6 - jArr3[i2 + 11];
                long j20 = jM2272b6 - jArr3[i2 + 12];
                long j21 = j7 - jArr3[i2 + 13];
                long j22 = jM2272b7 - (jArr3[i2 + 14] + jArr4[i3 + 1]);
                long j23 = j8 - (jArr3[i2 + 15] + jArr4[i3 + 2]);
                long jM2272b9 = C0919ba.m2272b(jM2272b8 - ((jArr3[i2 + 16] + ((long) i)) + 1), 9, j9);
                long j24 = j9 - jM2272b9;
                long jM2272b10 = C0919ba.m2272b(j20, 48, j11);
                long j25 = j11 - jM2272b10;
                long jM2272b11 = C0919ba.m2272b(j22, 35, j15);
                long j26 = j15 - jM2272b11;
                long jM2272b12 = C0919ba.m2272b(j18, 52, j13);
                long j27 = j13 - jM2272b12;
                long jM2272b13 = C0919ba.m2272b(j10, 23, j23);
                long j28 = j23 - jM2272b13;
                long jM2272b14 = C0919ba.m2272b(j14, 31, j17);
                long j29 = j17 - jM2272b14;
                long jM2272b15 = C0919ba.m2272b(j12, 37, j19);
                long j30 = j19 - jM2272b15;
                long jM2272b16 = C0919ba.m2272b(j16, 20, j21);
                long j31 = j21 - jM2272b16;
                long jM2272b17 = C0919ba.m2272b(jM2272b16, 31, j24);
                long j32 = j24 - jM2272b17;
                long jM2272b18 = C0919ba.m2272b(jM2272b14, 44, j25);
                long j33 = j25 - jM2272b18;
                long jM2272b19 = C0919ba.m2272b(jM2272b15, 47, j27);
                long j34 = j27 - jM2272b19;
                long jM2272b20 = C0919ba.m2272b(jM2272b13, 46, j26);
                long j35 = j26 - jM2272b20;
                long jM2272b21 = C0919ba.m2272b(jM2272b9, 19, j31);
                long j36 = j31 - jM2272b21;
                long jM2272b22 = C0919ba.m2272b(jM2272b11, 42, j28);
                long j37 = j28 - jM2272b22;
                long jM2272b23 = C0919ba.m2272b(jM2272b10, 44, j29);
                long j38 = j29 - jM2272b23;
                long jM2272b24 = C0919ba.m2272b(jM2272b12, 25, j30);
                long j39 = j30 - jM2272b24;
                long jM2272b25 = C0919ba.m2272b(jM2272b24, 16, j32);
                long j40 = j32 - jM2272b25;
                long jM2272b26 = C0919ba.m2272b(jM2272b22, 34, j33);
                long j41 = j33 - jM2272b26;
                long jM2272b27 = C0919ba.m2272b(jM2272b23, 56, j35);
                long j42 = j35 - jM2272b27;
                long jM2272b28 = C0919ba.m2272b(jM2272b21, 51, j34);
                long j43 = j34 - jM2272b28;
                long jM2272b29 = C0919ba.m2272b(jM2272b17, 4, j39);
                long j44 = j39 - jM2272b29;
                long jM2272b30 = C0919ba.m2272b(jM2272b19, 53, j36);
                long j45 = j36 - jM2272b30;
                long jM2272b31 = C0919ba.m2272b(jM2272b18, 42, j37);
                long j46 = j37 - jM2272b31;
                long jM2272b32 = C0919ba.m2272b(jM2272b20, 41, j38);
                long j47 = j38 - jM2272b32;
                long jM2272b33 = C0919ba.m2272b(jM2272b32, 41, j40);
                long jM2272b34 = C0919ba.m2272b(jM2272b30, 9, j41);
                long jM2272b35 = C0919ba.m2272b(jM2272b31, 37, j43);
                long jM2272b36 = C0919ba.m2272b(jM2272b29, 31, j42);
                long jM2272b37 = C0919ba.m2272b(jM2272b25, 12, j47);
                long jM2272b38 = C0919ba.m2272b(jM2272b27, 47, j44);
                long jM2272b39 = C0919ba.m2272b(jM2272b26, 44, j45);
                long jM2272b40 = C0919ba.m2272b(jM2272b28, 30, j46);
                long j48 = (j40 - jM2272b33) - jArr3[i2];
                long j49 = jM2272b33 - jArr3[i2 + 1];
                long j50 = (j41 - jM2272b34) - jArr3[i2 + 2];
                long j51 = jM2272b34 - jArr3[i2 + 3];
                long j52 = (j43 - jM2272b35) - jArr3[i2 + 4];
                long j53 = jM2272b35 - jArr3[i2 + 5];
                long j54 = (j42 - jM2272b36) - jArr3[i2 + 6];
                long j55 = jM2272b36 - jArr3[i2 + 7];
                long j56 = (j47 - jM2272b37) - jArr3[i2 + 8];
                long j57 = jM2272b37 - jArr3[i2 + 9];
                long j58 = (j44 - jM2272b38) - jArr3[i2 + 10];
                long j59 = jM2272b38 - jArr3[i2 + 11];
                long j60 = (j45 - jM2272b39) - jArr3[i2 + 12];
                long j61 = jM2272b39 - (jArr3[i2 + 13] + jArr4[i3]);
                long j62 = (j46 - jM2272b40) - (jArr4[i3 + 1] + jArr3[i2 + 14]);
                long jM2272b41 = C0919ba.m2272b(jM2272b40 - (jArr3[i2 + 15] + ((long) i)), 5, j48);
                long j63 = j48 - jM2272b41;
                long jM2272b42 = C0919ba.m2272b(j59, 20, j50);
                long j64 = j50 - jM2272b42;
                long jM2272b43 = C0919ba.m2272b(j61, 48, j54);
                long j65 = j54 - jM2272b43;
                long jM2272b44 = C0919ba.m2272b(j57, 41, j52);
                long j66 = j52 - jM2272b44;
                long jM2272b45 = C0919ba.m2272b(j49, 47, j62);
                long j67 = j62 - jM2272b45;
                long jM2272b46 = C0919ba.m2272b(j53, 28, j56);
                long j68 = j56 - jM2272b46;
                long jM2272b47 = C0919ba.m2272b(j51, 16, j58);
                long j69 = j58 - jM2272b47;
                long jM2272b48 = C0919ba.m2272b(j55, 25, j60);
                long j70 = j60 - jM2272b48;
                long jM2272b49 = C0919ba.m2272b(jM2272b48, 33, j63);
                long j71 = j63 - jM2272b49;
                long jM2272b50 = C0919ba.m2272b(jM2272b46, 4, j64);
                long j72 = j64 - jM2272b50;
                long jM2272b51 = C0919ba.m2272b(jM2272b47, 51, j66);
                long j73 = j66 - jM2272b51;
                long jM2272b52 = C0919ba.m2272b(jM2272b45, 13, j65);
                long j74 = j65 - jM2272b52;
                long jM2272b53 = C0919ba.m2272b(jM2272b41, 34, j70);
                long j75 = j70 - jM2272b53;
                long jM2272b54 = C0919ba.m2272b(jM2272b43, 41, j67);
                long j76 = j67 - jM2272b54;
                long jM2272b55 = C0919ba.m2272b(jM2272b42, 59, j68);
                long j77 = j68 - jM2272b55;
                long jM2272b56 = C0919ba.m2272b(jM2272b44, 17, j69);
                long j78 = j69 - jM2272b56;
                long jM2272b57 = C0919ba.m2272b(jM2272b56, 38, j71);
                long j79 = j71 - jM2272b57;
                long jM2272b58 = C0919ba.m2272b(jM2272b54, 19, j72);
                long j80 = j72 - jM2272b58;
                long jM2272b59 = C0919ba.m2272b(jM2272b55, 10, j74);
                long j81 = j74 - jM2272b59;
                long jM2272b60 = C0919ba.m2272b(jM2272b53, 55, j73);
                long j82 = j73 - jM2272b60;
                long jM2272b61 = C0919ba.m2272b(jM2272b49, 49, j78);
                long j83 = j78 - jM2272b61;
                long jM2272b62 = C0919ba.m2272b(jM2272b51, 18, j75);
                long j84 = j75 - jM2272b62;
                long jM2272b63 = C0919ba.m2272b(jM2272b50, 23, j76);
                long j85 = j76 - jM2272b63;
                long jM2272b64 = C0919ba.m2272b(jM2272b52, 52, j77);
                long j86 = j77 - jM2272b64;
                jM2272b = C0919ba.m2272b(jM2272b64, 24, j79);
                j = j79 - jM2272b;
                jM2272b2 = C0919ba.m2272b(jM2272b62, 13, j80);
                j2 = j80 - jM2272b2;
                jM2272b3 = C0919ba.m2272b(jM2272b63, 8, j82);
                j3 = j82 - jM2272b3;
                jM2272b4 = C0919ba.m2272b(jM2272b61, 47, j81);
                j4 = j81 - jM2272b4;
                jM2272b5 = C0919ba.m2272b(jM2272b57, 8, j86);
                j5 = j86 - jM2272b5;
                jM2272b6 = C0919ba.m2272b(jM2272b59, 17, j83);
                j6 = j83 - jM2272b6;
                jM2272b7 = C0919ba.m2272b(jM2272b58, 22, j84);
                j7 = j84 - jM2272b7;
                jM2272b8 = C0919ba.m2272b(jM2272b60, 37, j85);
                j8 = j85 - jM2272b8;
            }
            long j87 = j - jArr3[0];
            long j88 = jM2272b - jArr3[1];
            long j89 = j2 - jArr3[2];
            long j90 = jM2272b2 - jArr3[3];
            long j91 = j3 - jArr3[4];
            long j92 = jM2272b3 - jArr3[5];
            long j93 = j4 - jArr3[6];
            long j94 = jM2272b4 - jArr3[7];
            long j95 = j5 - jArr3[8];
            long j96 = jM2272b5 - jArr3[9];
            long j97 = j6 - jArr3[10];
            long j98 = jM2272b6 - jArr3[11];
            long j99 = j7 - jArr3[12];
            long j100 = jM2272b7 - (jArr3[13] + jArr4[0]);
            long j101 = j8 - (jArr4[1] + jArr3[14]);
            long j102 = jM2272b8 - jArr3[15];
            jArr2[0] = j87;
            jArr2[1] = j88;
            jArr2[2] = j89;
            jArr2[3] = j90;
            jArr2[4] = j91;
            jArr2[5] = j92;
            jArr2[6] = j93;
            jArr2[7] = j94;
            jArr2[8] = j95;
            jArr2[9] = j96;
            jArr2[10] = j97;
            jArr2[11] = j98;
            jArr2[12] = j99;
            jArr2[13] = j100;
            jArr2[14] = j101;
            jArr2[15] = j102;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.e.ba$b */
    private static final class b extends d {
        public b(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.p083b.p089e.C0919ba.d
        /* JADX INFO: renamed from: a */
        final void mo2280a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f3816b;
            long[] jArr4 = this.f3815a;
            int[] iArr = C0919ba.f3806c;
            int[] iArr2 = C0919ba.f3807d;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = j + jArr3[0];
            long j6 = j2 + jArr3[1] + jArr4[0];
            long j7 = j3 + jArr3[2] + jArr4[1];
            long j8 = jArr3[3] + j4;
            for (int i = 1; i < 18; i += 2) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j9 = j5 + j6;
                long jM2268a = C0919ba.m2268a(j6, 14, j9);
                long j10 = j7 + j8;
                long jM2268a2 = C0919ba.m2268a(j8, 16, j10);
                long j11 = j9 + jM2268a2;
                long jM2268a3 = C0919ba.m2268a(jM2268a2, 52, j11);
                long j12 = j10 + jM2268a;
                long jM2268a4 = C0919ba.m2268a(jM2268a, 57, j12);
                long j13 = j11 + jM2268a4;
                long jM2268a5 = C0919ba.m2268a(jM2268a4, 23, j13);
                long j14 = j12 + jM2268a3;
                long jM2268a6 = C0919ba.m2268a(jM2268a3, 40, j14);
                long j15 = j13 + jM2268a6;
                long jM2268a7 = C0919ba.m2268a(jM2268a6, 5, j15);
                long j16 = j14 + jM2268a5;
                long jM2268a8 = C0919ba.m2268a(jM2268a5, 37, j16);
                long j17 = j15 + jArr3[i2];
                long j18 = jM2268a8 + jArr3[i2 + 1] + jArr4[i3];
                long j19 = j16 + jArr3[i2 + 2] + jArr4[i3 + 1];
                long j20 = jM2268a7 + jArr3[i2 + 3] + ((long) i);
                long j21 = j17 + j18;
                long jM2268a9 = C0919ba.m2268a(j18, 25, j21);
                long j22 = j19 + j20;
                long jM2268a10 = C0919ba.m2268a(j20, 33, j22);
                long j23 = j21 + jM2268a10;
                long jM2268a11 = C0919ba.m2268a(jM2268a10, 46, j23);
                long j24 = j22 + jM2268a9;
                long jM2268a12 = C0919ba.m2268a(jM2268a9, 12, j24);
                long j25 = j23 + jM2268a12;
                long jM2268a13 = C0919ba.m2268a(jM2268a12, 58, j25);
                long j26 = j24 + jM2268a11;
                long jM2268a14 = C0919ba.m2268a(jM2268a11, 22, j26);
                long j27 = j25 + jM2268a14;
                long jM2268a15 = C0919ba.m2268a(jM2268a14, 32, j27);
                long j28 = j26 + jM2268a13;
                long jM2268a16 = C0919ba.m2268a(jM2268a13, 32, j28);
                j5 = j27 + jArr3[i2 + 1];
                j6 = jM2268a16 + jArr3[i2 + 2] + jArr4[i3 + 1];
                j7 = j28 + jArr4[i3 + 2] + jArr3[i2 + 3];
                j8 = jM2268a15 + jArr3[i2 + 4] + ((long) i) + 1;
            }
            jArr2[0] = j5;
            jArr2[1] = j6;
            jArr2[2] = j7;
            jArr2[3] = j8;
        }

        @Override // org.bouncycastle.p083b.p089e.C0919ba.d
        /* JADX INFO: renamed from: b */
        final void mo2281b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f3816b;
            long[] jArr4 = this.f3815a;
            int[] iArr = C0919ba.f3806c;
            int[] iArr2 = C0919ba.f3807d;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long jM2272b = jArr[1];
            long j2 = jArr[2];
            long jM2272b2 = jArr[3];
            for (int i = 17; i > 0; i -= 2) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j3 = j - jArr3[i2 + 1];
                long j4 = jM2272b - (jArr3[i2 + 2] + jArr4[i3 + 1]);
                long j5 = j2 - (jArr3[i2 + 3] + jArr4[i3 + 2]);
                long jM2272b3 = C0919ba.m2272b(jM2272b2 - ((jArr3[i2 + 4] + ((long) i)) + 1), 32, j3);
                long j6 = j3 - jM2272b3;
                long jM2272b4 = C0919ba.m2272b(j4, 32, j5);
                long j7 = j5 - jM2272b4;
                long jM2272b5 = C0919ba.m2272b(jM2272b4, 58, j6);
                long j8 = j6 - jM2272b5;
                long jM2272b6 = C0919ba.m2272b(jM2272b3, 22, j7);
                long j9 = j7 - jM2272b6;
                long jM2272b7 = C0919ba.m2272b(jM2272b6, 46, j8);
                long j10 = j8 - jM2272b7;
                long jM2272b8 = C0919ba.m2272b(jM2272b5, 12, j9);
                long j11 = j9 - jM2272b8;
                long jM2272b9 = C0919ba.m2272b(jM2272b8, 25, j10);
                long jM2272b10 = C0919ba.m2272b(jM2272b7, 33, j11);
                long j12 = (j10 - jM2272b9) - jArr3[i2];
                long j13 = jM2272b9 - (jArr3[i2 + 1] + jArr4[i3]);
                long j14 = (j11 - jM2272b10) - (jArr4[i3 + 1] + jArr3[i2 + 2]);
                long jM2272b11 = C0919ba.m2272b(jM2272b10 - (jArr3[i2 + 3] + ((long) i)), 5, j12);
                long j15 = j12 - jM2272b11;
                long jM2272b12 = C0919ba.m2272b(j13, 37, j14);
                long j16 = j14 - jM2272b12;
                long jM2272b13 = C0919ba.m2272b(jM2272b12, 23, j15);
                long j17 = j15 - jM2272b13;
                long jM2272b14 = C0919ba.m2272b(jM2272b11, 40, j16);
                long j18 = j16 - jM2272b14;
                long jM2272b15 = C0919ba.m2272b(jM2272b14, 52, j17);
                long j19 = j17 - jM2272b15;
                long jM2272b16 = C0919ba.m2272b(jM2272b13, 57, j18);
                long j20 = j18 - jM2272b16;
                jM2272b = C0919ba.m2272b(jM2272b16, 14, j19);
                j = j19 - jM2272b;
                jM2272b2 = C0919ba.m2272b(jM2272b15, 16, j20);
                j2 = j20 - jM2272b2;
            }
            long j21 = j - jArr3[0];
            long j22 = jM2272b - (jArr3[1] + jArr4[0]);
            long j23 = j2 - (jArr4[1] + jArr3[2]);
            long j24 = jM2272b2 - jArr3[3];
            jArr2[0] = j21;
            jArr2[1] = j22;
            jArr2[2] = j23;
            jArr2[3] = j24;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.e.ba$c */
    private static final class c extends d {
        protected c(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.p083b.p089e.C0919ba.d
        /* JADX INFO: renamed from: a */
        public final void mo2280a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f3816b;
            long[] jArr4 = this.f3815a;
            int[] iArr = C0919ba.f3804a;
            int[] iArr2 = C0919ba.f3807d;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = j + jArr3[0];
            long j10 = j2 + jArr3[1];
            long j11 = j3 + jArr3[2];
            long j12 = j4 + jArr3[3];
            long j13 = j5 + jArr3[4];
            long j14 = j6 + jArr3[5] + jArr4[0];
            long j15 = j7 + jArr3[6] + jArr4[1];
            long j16 = jArr3[7] + j8;
            for (int i = 1; i < 18; i += 2) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j17 = j9 + j10;
                long jM2268a = C0919ba.m2268a(j10, 46, j17);
                long j18 = j11 + j12;
                long jM2268a2 = C0919ba.m2268a(j12, 36, j18);
                long j19 = j13 + j14;
                long jM2268a3 = C0919ba.m2268a(j14, 19, j19);
                long j20 = j15 + j16;
                long jM2268a4 = C0919ba.m2268a(j16, 37, j20);
                long j21 = j18 + jM2268a;
                long jM2268a5 = C0919ba.m2268a(jM2268a, 33, j21);
                long j22 = j19 + jM2268a4;
                long jM2268a6 = C0919ba.m2268a(jM2268a4, 27, j22);
                long j23 = j20 + jM2268a3;
                long jM2268a7 = C0919ba.m2268a(jM2268a3, 14, j23);
                long j24 = j17 + jM2268a2;
                long jM2268a8 = C0919ba.m2268a(jM2268a2, 42, j24);
                long j25 = j22 + jM2268a5;
                long jM2268a9 = C0919ba.m2268a(jM2268a5, 17, j25);
                long j26 = j23 + jM2268a8;
                long jM2268a10 = C0919ba.m2268a(jM2268a8, 49, j26);
                long j27 = j24 + jM2268a7;
                long jM2268a11 = C0919ba.m2268a(jM2268a7, 36, j27);
                long j28 = j21 + jM2268a6;
                long jM2268a12 = C0919ba.m2268a(jM2268a6, 39, j28);
                long j29 = j26 + jM2268a9;
                long jM2268a13 = C0919ba.m2268a(jM2268a9, 44, j29);
                long j30 = j27 + jM2268a12;
                long jM2268a14 = C0919ba.m2268a(jM2268a12, 9, j30);
                long j31 = j28 + jM2268a11;
                long jM2268a15 = C0919ba.m2268a(jM2268a11, 54, j31);
                long j32 = j25 + jM2268a10;
                long jM2268a16 = C0919ba.m2268a(jM2268a10, 56, j32);
                long j33 = j30 + jArr3[i2];
                long j34 = jM2268a13 + jArr3[i2 + 1];
                long j35 = j31 + jArr3[i2 + 2];
                long j36 = jM2268a16 + jArr3[i2 + 3];
                long j37 = j32 + jArr3[i2 + 4];
                long j38 = jM2268a15 + jArr3[i2 + 5] + jArr4[i3];
                long j39 = j29 + jArr3[i2 + 6] + jArr4[i3 + 1];
                long j40 = jM2268a14 + jArr3[i2 + 7] + ((long) i);
                long j41 = j33 + j34;
                long jM2268a17 = C0919ba.m2268a(j34, 39, j41);
                long j42 = j35 + j36;
                long jM2268a18 = C0919ba.m2268a(j36, 30, j42);
                long j43 = j37 + j38;
                long jM2268a19 = C0919ba.m2268a(j38, 34, j43);
                long j44 = j39 + j40;
                long jM2268a20 = C0919ba.m2268a(j40, 24, j44);
                long j45 = j42 + jM2268a17;
                long jM2268a21 = C0919ba.m2268a(jM2268a17, 13, j45);
                long j46 = j43 + jM2268a20;
                long jM2268a22 = C0919ba.m2268a(jM2268a20, 50, j46);
                long j47 = j44 + jM2268a19;
                long jM2268a23 = C0919ba.m2268a(jM2268a19, 10, j47);
                long j48 = j41 + jM2268a18;
                long jM2268a24 = C0919ba.m2268a(jM2268a18, 17, j48);
                long j49 = j46 + jM2268a21;
                long jM2268a25 = C0919ba.m2268a(jM2268a21, 25, j49);
                long j50 = j47 + jM2268a24;
                long jM2268a26 = C0919ba.m2268a(jM2268a24, 29, j50);
                long j51 = j48 + jM2268a23;
                long jM2268a27 = C0919ba.m2268a(jM2268a23, 39, j51);
                long j52 = j45 + jM2268a22;
                long jM2268a28 = C0919ba.m2268a(jM2268a22, 43, j52);
                long j53 = j50 + jM2268a25;
                long jM2268a29 = C0919ba.m2268a(jM2268a25, 8, j53);
                long j54 = j51 + jM2268a28;
                long jM2268a30 = C0919ba.m2268a(jM2268a28, 35, j54);
                long j55 = j52 + jM2268a27;
                long jM2268a31 = C0919ba.m2268a(jM2268a27, 56, j55);
                long j56 = j49 + jM2268a26;
                long jM2268a32 = C0919ba.m2268a(jM2268a26, 22, j56);
                j9 = j54 + jArr3[i2 + 1];
                j10 = jM2268a29 + jArr3[i2 + 2];
                j11 = j55 + jArr3[i2 + 3];
                j12 = jM2268a32 + jArr3[i2 + 4];
                j13 = j56 + jArr3[i2 + 5];
                j14 = jM2268a31 + jArr3[i2 + 6] + jArr4[i3 + 1];
                j15 = j53 + jArr4[i3 + 2] + jArr3[i2 + 7];
                j16 = jM2268a30 + jArr3[i2 + 8] + ((long) i) + 1;
            }
            jArr2[0] = j9;
            jArr2[1] = j10;
            jArr2[2] = j11;
            jArr2[3] = j12;
            jArr2[4] = j13;
            jArr2[5] = j14;
            jArr2[6] = j15;
            jArr2[7] = j16;
        }

        @Override // org.bouncycastle.p083b.p089e.C0919ba.d
        /* JADX INFO: renamed from: b */
        public final void mo2281b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f3816b;
            long[] jArr4 = this.f3815a;
            int[] iArr = C0919ba.f3804a;
            int[] iArr2 = C0919ba.f3807d;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long jM2272b = jArr[1];
            long j2 = jArr[2];
            long jM2272b2 = jArr[3];
            long j3 = jArr[4];
            long jM2272b3 = jArr[5];
            long j4 = jArr[6];
            long jM2272b4 = jArr[7];
            for (int i = 17; i > 0; i -= 2) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j5 = j - jArr3[i2 + 1];
                long j6 = jM2272b - jArr3[i2 + 2];
                long j7 = j2 - jArr3[i2 + 3];
                long j8 = jM2272b2 - jArr3[i2 + 4];
                long j9 = j3 - jArr3[i2 + 5];
                long j10 = jM2272b3 - (jArr3[i2 + 6] + jArr4[i3 + 1]);
                long j11 = j4 - (jArr3[i2 + 7] + jArr4[i3 + 2]);
                long j12 = jM2272b4 - ((jArr3[i2 + 8] + ((long) i)) + 1);
                long jM2272b5 = C0919ba.m2272b(j6, 8, j11);
                long j13 = j11 - jM2272b5;
                long jM2272b6 = C0919ba.m2272b(j12, 35, j5);
                long j14 = j5 - jM2272b6;
                long jM2272b7 = C0919ba.m2272b(j10, 56, j7);
                long j15 = j7 - jM2272b7;
                long jM2272b8 = C0919ba.m2272b(j8, 22, j9);
                long j16 = j9 - jM2272b8;
                long jM2272b9 = C0919ba.m2272b(jM2272b5, 25, j16);
                long j17 = j16 - jM2272b9;
                long jM2272b10 = C0919ba.m2272b(jM2272b8, 29, j13);
                long j18 = j13 - jM2272b10;
                long jM2272b11 = C0919ba.m2272b(jM2272b7, 39, j14);
                long j19 = j14 - jM2272b11;
                long jM2272b12 = C0919ba.m2272b(jM2272b6, 43, j15);
                long j20 = j15 - jM2272b12;
                long jM2272b13 = C0919ba.m2272b(jM2272b9, 13, j20);
                long j21 = j20 - jM2272b13;
                long jM2272b14 = C0919ba.m2272b(jM2272b12, 50, j17);
                long j22 = j17 - jM2272b14;
                long jM2272b15 = C0919ba.m2272b(jM2272b11, 10, j18);
                long j23 = j18 - jM2272b15;
                long jM2272b16 = C0919ba.m2272b(jM2272b10, 17, j19);
                long j24 = j19 - jM2272b16;
                long jM2272b17 = C0919ba.m2272b(jM2272b13, 39, j24);
                long jM2272b18 = C0919ba.m2272b(jM2272b16, 30, j21);
                long jM2272b19 = C0919ba.m2272b(jM2272b15, 34, j22);
                long jM2272b20 = C0919ba.m2272b(jM2272b14, 24, j23);
                long j25 = (j24 - jM2272b17) - jArr3[i2];
                long j26 = jM2272b17 - jArr3[i2 + 1];
                long j27 = (j21 - jM2272b18) - jArr3[i2 + 2];
                long j28 = jM2272b18 - jArr3[i2 + 3];
                long j29 = (j22 - jM2272b19) - jArr3[i2 + 4];
                long j30 = jM2272b19 - (jArr3[i2 + 5] + jArr4[i3]);
                long j31 = (j23 - jM2272b20) - (jArr4[i3 + 1] + jArr3[i2 + 6]);
                long j32 = jM2272b20 - (jArr3[i2 + 7] + ((long) i));
                long jM2272b21 = C0919ba.m2272b(j26, 44, j31);
                long j33 = j31 - jM2272b21;
                long jM2272b22 = C0919ba.m2272b(j32, 9, j25);
                long j34 = j25 - jM2272b22;
                long jM2272b23 = C0919ba.m2272b(j30, 54, j27);
                long j35 = j27 - jM2272b23;
                long jM2272b24 = C0919ba.m2272b(j28, 56, j29);
                long j36 = j29 - jM2272b24;
                long jM2272b25 = C0919ba.m2272b(jM2272b21, 17, j36);
                long j37 = j36 - jM2272b25;
                long jM2272b26 = C0919ba.m2272b(jM2272b24, 49, j33);
                long j38 = j33 - jM2272b26;
                long jM2272b27 = C0919ba.m2272b(jM2272b23, 36, j34);
                long j39 = j34 - jM2272b27;
                long jM2272b28 = C0919ba.m2272b(jM2272b22, 39, j35);
                long j40 = j35 - jM2272b28;
                long jM2272b29 = C0919ba.m2272b(jM2272b25, 33, j40);
                long j41 = j40 - jM2272b29;
                long jM2272b30 = C0919ba.m2272b(jM2272b28, 27, j37);
                long j42 = j37 - jM2272b30;
                long jM2272b31 = C0919ba.m2272b(jM2272b27, 14, j38);
                long j43 = j38 - jM2272b31;
                long jM2272b32 = C0919ba.m2272b(jM2272b26, 42, j39);
                long j44 = j39 - jM2272b32;
                jM2272b = C0919ba.m2272b(jM2272b29, 46, j44);
                j = j44 - jM2272b;
                jM2272b2 = C0919ba.m2272b(jM2272b32, 36, j41);
                j2 = j41 - jM2272b2;
                jM2272b3 = C0919ba.m2272b(jM2272b31, 19, j42);
                j3 = j42 - jM2272b3;
                jM2272b4 = C0919ba.m2272b(jM2272b30, 37, j43);
                j4 = j43 - jM2272b4;
            }
            long j45 = j - jArr3[0];
            long j46 = jM2272b - jArr3[1];
            long j47 = j2 - jArr3[2];
            long j48 = jM2272b2 - jArr3[3];
            long j49 = j3 - jArr3[4];
            long j50 = jM2272b3 - (jArr3[5] + jArr4[0]);
            long j51 = j4 - (jArr4[1] + jArr3[6]);
            long j52 = jM2272b4 - jArr3[7];
            jArr2[0] = j45;
            jArr2[1] = j46;
            jArr2[2] = j47;
            jArr2[3] = j48;
            jArr2[4] = j49;
            jArr2[5] = j50;
            jArr2[6] = j51;
            jArr2[7] = j52;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.e.ba$d */
    private static abstract class d {

        /* JADX INFO: renamed from: a */
        protected final long[] f3815a;

        /* JADX INFO: renamed from: b */
        protected final long[] f3816b;

        protected d(long[] jArr, long[] jArr2) {
            this.f3816b = jArr;
            this.f3815a = jArr2;
        }

        /* JADX INFO: renamed from: a */
        abstract void mo2280a(long[] jArr, long[] jArr2);

        /* JADX INFO: renamed from: b */
        abstract void mo2281b(long[] jArr, long[] jArr2);
    }

    static {
        for (int i = 0; i < f3804a.length; i++) {
            f3805b[i] = i % 17;
            f3804a[i] = i % 9;
            f3806c[i] = i % 5;
            f3807d[i] = i % 3;
        }
    }

    public C0919ba(int i) {
        this.f3808e = i / 8;
        this.f3809f = this.f3808e / 8;
        this.f3810g = new long[this.f3809f];
        this.f3812i = new long[(this.f3809f * 2) + 1];
        switch (i) {
            case 256:
                this.f3813j = new b(this.f3812i, this.f3811h);
                return;
            case 512:
                this.f3813j = new c(this.f3812i, this.f3811h);
                return;
            case 1024:
                this.f3813j = new a(this.f3812i, this.f3811h);
                return;
            default:
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        }
    }

    /* JADX INFO: renamed from: a */
    static long m2268a(long j, int i, long j2) {
        return ((j << i) | (j >>> (-i))) ^ j2;
    }

    /* JADX INFO: renamed from: a */
    public static long m2269a(byte[] bArr, int i) {
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

    /* JADX INFO: renamed from: a */
    public static void m2270a(long j, byte[] bArr, int i) {
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

    /* JADX INFO: renamed from: a */
    private void m2271a(long[] jArr) {
        if (jArr.length != this.f3809f) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f3809f + " words)");
        }
        long j = 2004413935125273122L;
        for (int i = 0; i < this.f3809f; i++) {
            this.f3812i[i] = jArr[i];
            j ^= this.f3812i[i];
        }
        this.f3812i[this.f3809f] = j;
        System.arraycopy(this.f3812i, 0, this.f3812i, this.f3809f + 1, this.f3809f);
    }

    /* JADX INFO: renamed from: b */
    static long m2272b(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    /* JADX INFO: renamed from: b */
    private void m2273b(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        this.f3811h[0] = jArr[0];
        this.f3811h[1] = jArr[1];
        this.f3811h[2] = this.f3811h[0] ^ this.f3811h[1];
        this.f3811h[3] = this.f3811h[0];
        this.f3811h[4] = this.f3811h[1];
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final int mo2122a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f3808e + i > bArr.length) {
            throw new C1163o("Input buffer too short");
        }
        if (this.f3808e + i2 > bArr2.length) {
            throw new C0803ac("Output buffer too short");
        }
        for (int i3 = 0; i3 < this.f3808e; i3 += 8) {
            this.f3810g[i3 >> 3] = m2269a(bArr, i + i3);
        }
        m2278a(this.f3810g, this.f3810g);
        for (int i4 = 0; i4 < this.f3808e; i4 += 8) {
            m2270a(this.f3810g[i4 >> 3], bArr2, i2 + i4);
        }
        return this.f3808e;
    }

    /* JADX INFO: renamed from: a */
    public final int m2278a(long[] jArr, long[] jArr2) {
        if (this.f3812i[this.f3809f] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != this.f3809f) {
            throw new C1163o("Input buffer too short");
        }
        if (jArr2.length != this.f3809f) {
            throw new C0803ac("Output buffer too short");
        }
        if (this.f3814k) {
            this.f3813j.mo2280a(jArr, jArr2);
        } else {
            this.f3813j.mo2281b(jArr, jArr2);
        }
        return this.f3809f;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final String mo2123a() {
        return "Threefish-" + (this.f3808e * 8);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: a */
    public final void mo2124a(boolean z, InterfaceC1003i interfaceC1003i) {
        byte[] bArrM2638b;
        byte[] bArrM2603a;
        long[] jArr;
        long[] jArr2;
        if (interfaceC1003i instanceof C1091bp) {
            C1091bp c1091bp = (C1091bp) interfaceC1003i;
            byte[] bArrM2603a2 = c1091bp.m2637a().m2603a();
            bArrM2638b = c1091bp.m2638b();
            bArrM2603a = bArrM2603a2;
        } else {
            if (!(interfaceC1003i instanceof C1076ba)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + interfaceC1003i.getClass().getName());
            }
            bArrM2638b = null;
            bArrM2603a = ((C1076ba) interfaceC1003i).m2603a();
        }
        if (bArrM2603a == null) {
            jArr = null;
        } else {
            if (bArrM2603a.length != this.f3808e) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f3808e + " bytes)");
            }
            jArr = new long[this.f3809f];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = m2269a(bArrM2603a, i * 8);
            }
        }
        if (bArrM2638b == null) {
            jArr2 = null;
        } else {
            if (bArrM2638b.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{m2269a(bArrM2638b, 0), m2269a(bArrM2638b, 8)};
        }
        m2279a(z, jArr, jArr2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2279a(boolean z, long[] jArr, long[] jArr2) {
        this.f3814k = z;
        if (jArr != null) {
            m2271a(jArr);
        }
        if (jArr2 != null) {
            m2273b(jArr2);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: b */
    public final int mo2125b() {
        return this.f3808e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0890e
    /* JADX INFO: renamed from: c */
    public final void mo2126c() {
    }
}
