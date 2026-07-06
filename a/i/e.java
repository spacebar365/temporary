package a.i;

/* JADX INFO: compiled from: Hexdump.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = i;
        while (i2 > 0) {
            int i4 = (i2 + 0) - 1;
            if (i4 < cArr.length) {
                cArr[i4] = a[i3 & 15];
            }
            if (i3 != 0) {
                i3 >>>= 4;
            }
            i2--;
        }
        return new String(cArr);
    }

    public static String a(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            cArr[i3] = a[(bArr[i + i4] >> 4) & 15];
            i3 = i5 + 1;
            cArr[i5] = a[bArr[i + i4] & 15];
        }
        return new String(cArr);
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }
}
