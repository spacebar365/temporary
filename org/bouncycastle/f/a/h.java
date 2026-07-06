package org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final short[] a = new short[128];
    private static final byte[] b = new byte[112];

    static {
        byte[] bArr = new byte[128];
        a(bArr, 0, 15, (byte) 1);
        a(bArr, 16, 31, (byte) 2);
        a(bArr, 32, 63, (byte) 3);
        a(bArr, 64, 65, (byte) 0);
        a(bArr, 66, 95, (byte) 4);
        a(bArr, 96, 96, (byte) 5);
        a(bArr, 97, 108, (byte) 6);
        a(bArr, 109, 109, (byte) 7);
        a(bArr, 110, 111, (byte) 6);
        a(bArr, 112, 112, (byte) 8);
        a(bArr, 113, 115, (byte) 9);
        a(bArr, 116, 116, (byte) 10);
        a(bArr, 117, 127, (byte) 0);
        a(b, 0, b.length - 1, (byte) -2);
        a(b, 8, 11, (byte) -1);
        a(b, 24, 27, (byte) 0);
        a(b, 40, 43, (byte) 16);
        a(b, 58, 59, (byte) 0);
        a(b, 72, 73, (byte) 0);
        a(b, 89, 91, (byte) 16);
        a(b, 104, 104, (byte) 16);
        byte[] bArr2 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr3 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b2 = bArr[i];
            a[i] = (short) (bArr3[b2] | ((bArr2[b2] & i) << 8));
        }
    }

    public static int a(byte[] bArr, char[] cArr) {
        int i = 0;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                short s = a[b2 & 127];
                int i4 = s >>> 8;
                byte b3 = (byte) s;
                i2 = i3;
                while (b3 >= 0) {
                    if (i2 >= bArr.length) {
                        return -1;
                    }
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    b3 = b[b3 + ((b4 & 255) >>> 4)];
                    i4 = (i4 << 6) | (b4 & 63);
                    i2 = i5;
                }
                if (b3 == -2) {
                    return -1;
                }
                if (i4 <= 65535) {
                    if (i >= cArr.length) {
                        return -1;
                    }
                    cArr[i] = (char) i4;
                    i++;
                } else {
                    if (i >= cArr.length - 1) {
                        return -1;
                    }
                    int i6 = i + 1;
                    cArr[i] = (char) (55232 + (i4 >>> 10));
                    i = i6 + 1;
                    cArr[i6] = (char) (56320 | (i4 & 1023));
                }
            } else {
                if (i >= cArr.length) {
                    return -1;
                }
                cArr[i] = (char) b2;
                i++;
                i2 = i3;
            }
        }
        return i;
    }

    private static void a(byte[] bArr, int i, int i2, byte b2) {
        while (i <= i2) {
            bArr[i] = b2;
            i++;
        }
    }
}
