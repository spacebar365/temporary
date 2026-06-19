package p000a.p031i;

/* JADX INFO: renamed from: a.i.e */
/* JADX INFO: compiled from: Hexdump.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0284e {

    /* JADX INFO: renamed from: a */
    public static final char[] f1251a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m947a(int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = i;
        while (i2 > 0) {
            int i4 = (i2 + 0) - 1;
            if (i4 < cArr.length) {
                cArr[i4] = f1251a[i3 & 15];
            }
            if (i3 != 0) {
                i3 >>>= 4;
            }
            i2--;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m949a(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            cArr[i3] = f1251a[(bArr[i + i4] >> 4) & 15];
            i3 = i5 + 1;
            cArr[i5] = f1251a[bArr[i + i4] & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m948a(byte[] bArr) {
        return m949a(bArr, 0, bArr.length);
    }
}
