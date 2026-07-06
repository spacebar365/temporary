package org.bouncycastle.e.d.a;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static int a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static int a(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (a(i) >= a(i2)) {
            i ^= i2 << (a(i) - a(i2));
        }
        return i;
    }

    public static int a(int i, int i2, int i3) {
        int iA = a(i, i3);
        int iA2 = a(i2, i3);
        if (iA2 == 0) {
            return 0;
        }
        int iA3 = 1 << a(i3);
        int i4 = 0;
        while (iA != 0) {
            if (((byte) (iA & 1)) == 1) {
                i4 ^= iA2;
            }
            iA >>>= 1;
            int i5 = iA2 << 1;
            if (i5 >= iA3) {
                i5 ^= i3;
            }
            iA2 = i5;
        }
        return i4;
    }

    public static boolean b(int i) {
        if (i == 0) {
            return false;
        }
        int iA = a(i) >>> 1;
        int i2 = 0;
        int i3 = 2;
        while (i2 < iA) {
            int iA2 = a(i3, i3, i);
            int i4 = i;
            int i5 = iA2 ^ 2;
            while (i4 != 0) {
                int iA3 = a(i5, i4);
                i5 = i4;
                i4 = iA3;
            }
            if (i5 != 1) {
                return false;
            }
            i2++;
            i3 = iA2;
        }
        return true;
    }
}
