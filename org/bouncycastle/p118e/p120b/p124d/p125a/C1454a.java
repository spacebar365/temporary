package org.bouncycastle.p118e.p120b.p124d.p125a;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: org.bouncycastle.e.b.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1454a {
    /* JADX INFO: renamed from: a */
    public static boolean m3803a(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3804a(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zM3803a = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zM3803a &= m3803a(sArr[length], sArr2[length]);
        }
        return zM3803a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3805a(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zM3804a = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zM3804a &= m3804a(sArr[length], sArr2[length]);
        }
        return zM3804a;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3806a(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static short[] m3807a(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[][] m3808a(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static short[][] m3809a(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, bArr.length, bArr[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[][][] m3810a(short[][][] sArr) {
        byte[][][] bArr = (byte[][][]) Array.newInstance((Class<?>) Byte.TYPE, sArr.length, sArr[0].length, sArr[0][0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static short[][][] m3811a(byte[][][] bArr) {
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, bArr.length, bArr[0].length, bArr[0][0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }
}
