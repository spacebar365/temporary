package org.bouncycastle.p142f.p143a;

/* JADX INFO: renamed from: org.bouncycastle.f.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1543h {

    /* JADX INFO: renamed from: a */
    private static final short[] f5492a = new short[128];

    /* JADX INFO: renamed from: b */
    private static final byte[] f5493b = new byte[112];

    static {
        byte[] bArr = new byte[128];
        m4112a(bArr, 0, 15, (byte) 1);
        m4112a(bArr, 16, 31, (byte) 2);
        m4112a(bArr, 32, 63, (byte) 3);
        m4112a(bArr, 64, 65, (byte) 0);
        m4112a(bArr, 66, 95, (byte) 4);
        m4112a(bArr, 96, 96, (byte) 5);
        m4112a(bArr, 97, 108, (byte) 6);
        m4112a(bArr, 109, 109, (byte) 7);
        m4112a(bArr, 110, 111, (byte) 6);
        m4112a(bArr, 112, 112, (byte) 8);
        m4112a(bArr, 113, 115, (byte) 9);
        m4112a(bArr, 116, 116, (byte) 10);
        m4112a(bArr, 117, 127, (byte) 0);
        m4112a(f5493b, 0, f5493b.length - 1, (byte) -2);
        m4112a(f5493b, 8, 11, (byte) -1);
        m4112a(f5493b, 24, 27, (byte) 0);
        m4112a(f5493b, 40, 43, (byte) 16);
        m4112a(f5493b, 58, 59, (byte) 0);
        m4112a(f5493b, 72, 73, (byte) 0);
        m4112a(f5493b, 89, 91, (byte) 16);
        m4112a(f5493b, 104, 104, (byte) 16);
        byte[] bArr2 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr3 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr[i];
            f5492a[i] = (short) (bArr3[b] | ((bArr2[b] & i) << 8));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4111a(byte[] bArr, char[] cArr) {
        int i = 0;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                short s = f5492a[b & 127];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                i2 = i3;
                while (b2 >= 0) {
                    if (i2 >= bArr.length) {
                        return -1;
                    }
                    int i5 = i2 + 1;
                    byte b3 = bArr[i2];
                    b2 = f5493b[b2 + ((b3 & 255) >>> 4)];
                    i4 = (i4 << 6) | (b3 & 63);
                    i2 = i5;
                }
                if (b2 == -2) {
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
                cArr[i] = (char) b;
                i++;
                i2 = i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static void m4112a(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
