package org.bouncycastle.p118e.p140d.p141a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1533j {
    /* JADX INFO: renamed from: a */
    public static int m4057a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private static int m4058a(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m4057a(i) >= m4057a(i2)) {
            i ^= i2 << (m4057a(i) - m4057a(i2));
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m4059a(int i, int i2, int i3) {
        int iM4058a = m4058a(i, i3);
        int iM4058a2 = m4058a(i2, i3);
        if (iM4058a2 == 0) {
            return 0;
        }
        int iM4057a = 1 << m4057a(i3);
        int i4 = 0;
        while (iM4058a != 0) {
            if (((byte) (iM4058a & 1)) == 1) {
                i4 ^= iM4058a2;
            }
            iM4058a >>>= 1;
            int i5 = iM4058a2 << 1;
            if (i5 >= iM4057a) {
                i5 ^= i3;
            }
            iM4058a2 = i5;
        }
        return i4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4060b(int i) {
        if (i == 0) {
            return false;
        }
        int iM4057a = m4057a(i) >>> 1;
        int i2 = 0;
        int i3 = 2;
        while (i2 < iM4057a) {
            int iM4059a = m4059a(i3, i3, i);
            int i4 = i;
            int i5 = iM4059a ^ 2;
            while (i4 != 0) {
                int iM4058a = m4058a(i5, i4);
                i5 = i4;
                i4 = iM4058a;
            }
            if (i5 != 1) {
                return false;
            }
            i2++;
            i3 = iM4059a;
        }
        return true;
    }
}
