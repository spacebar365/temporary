package org.bouncycastle.p118e.p140d.p141a;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1526c {
    /* JADX INFO: renamed from: a */
    public static C1524a m4032a(C1525b c1525b, C1532i c1532i) {
        int iM4026a = c1525b.m4026a();
        int i = 1 << iM4026a;
        int iM4049a = c1532i.m4049a();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM4049a, i);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM4049a, i);
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[0][i2] = c1525b.m4027a(c1532i.m4052b(i2));
        }
        for (int i3 = 1; i3 < iM4049a; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = c1525b.m4028a(iArr2[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < iM4049a; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    iArr[i5][i6] = iArr[i5][i6] ^ c1525b.m4028a(iArr2[i7][i6], c1532i.m4050a((iM4049a + i7) - i5));
                }
            }
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM4049a * iM4026a, (i + 31) >>> 5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            int i10 = 1 << (i8 & 31);
            for (int i11 = 0; i11 < iM4049a; i11++) {
                int i12 = iArr[i11][i8];
                for (int i13 = 0; i13 < iM4026a; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr4 = iArr3[(((i11 + 1) * iM4026a) - i13) - 1];
                        iArr4[i9] = iArr4[i9] ^ i10;
                    }
                }
            }
        }
        return new C1524a(i, iArr3);
    }
}
