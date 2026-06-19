package org.bouncycastle.p142f;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: org.bouncycastle.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1535a {

    /* JADX INFO: renamed from: org.bouncycastle.f.a$a */
    public static class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        private final T[] f5481a;

        /* JADX INFO: renamed from: b */
        private int f5482b = 0;

        public a(T[] tArr) {
            this.f5481a = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5482b < this.f5481a.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f5482b == this.f5481a.length) {
                throw new NoSuchElementException("Out of elements: " + this.f5482b);
            }
            T[] tArr = this.f5481a;
            int i = this.f5482b;
            this.f5482b = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m4065a(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ").append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: a */
    public static int m4066a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4067a(int[] iArr, int i) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[i + 0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4068a(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[i + 0];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4069a(short[][] sArr) {
        int iM4083b = 0;
        int i = 0;
        while (true) {
            int i2 = iM4083b;
            if (i == sArr.length) {
                return i2;
            }
            iM4083b = (i2 * 257) + m4083b(sArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4070a(short[][][] sArr) {
        int iM4069a = 0;
        int i = 0;
        while (true) {
            int i2 = iM4069a;
            if (i == sArr.length) {
                return i2;
            }
            iM4069a = (i2 * 257) + m4069a(sArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4071a(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4072a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4073a(long[] jArr) {
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4074a(short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4075a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= bArr[i + i4];
        }
        return i3 == 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4076a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4077a(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i != iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4078a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (i < bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, i);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4079a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return bArr == null ? m4095d(bArr2, bArr3) : bArr2 == null ? m4095d(bArr, bArr3) : m4095d(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4080a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null) {
            return bArr4 == null ? m4079a(bArr, bArr2, bArr3) : bArr3 == null ? m4079a(bArr, bArr2, bArr4) : bArr2 == null ? m4079a(bArr, bArr3, bArr4) : m4079a(bArr2, bArr3, bArr4);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    /* JADX INFO: renamed from: a */
    public static long[] m4081a(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return m4088b(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    /* JADX INFO: renamed from: b */
    public static int m4082b(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m4083b(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4084b(byte[] bArr, int i, int i2) {
        while (i < i2) {
            bArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4085b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr.length != bArr2.length) {
            return !m4085b(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4086b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m4087b(int[] iArr, int i) {
        int iM4065a = m4065a(1, i);
        int[] iArr2 = new int[iM4065a];
        if (iArr.length - 1 < iM4065a) {
            System.arraycopy(iArr, 1, iArr2, 0, iArr.length - 1);
        } else {
            System.arraycopy(iArr, 1, iArr2, 0, iM4065a);
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    public static long[] m4088b(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m4089c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m4090c(byte[] bArr, int i, int i2) {
        int iM4065a = m4065a(i, i2);
        byte[] bArr2 = new byte[iM4065a];
        if (bArr.length - i < iM4065a) {
            System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
        } else {
            System.arraycopy(bArr, i, bArr2, 0, iM4065a);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m4091c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return m4086b(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m4092c(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: renamed from: c */
    public static short[] m4093c(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    /* JADX INFO: renamed from: d */
    public static void m4094d(byte[] bArr) {
        if (bArr != null) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = 0;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m4095d(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr2 != null ? m4086b(bArr2) : m4086b(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: d */
    public static int[] m4096d(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int i = 0;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i];
            i++;
        }
    }
}
