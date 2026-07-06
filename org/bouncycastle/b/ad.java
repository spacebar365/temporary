package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class ad {
    protected byte[] a;
    protected byte[] b;
    protected int c;

    protected ad() {
    }

    public static byte[] a(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] b(char[] cArr) {
        return cArr != null ? org.bouncycastle.f.k.a(cArr) : new byte[0];
    }

    public static byte[] c(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i = 0; i != cArr.length; i++) {
            bArr[i * 2] = (byte) (cArr[i] >>> '\b');
            bArr[(i * 2) + 1] = (byte) cArr[i];
        }
        return bArr;
    }

    public abstract i a(int i);

    public abstract i a(int i, int i2);

    public final void a(byte[] bArr, byte[] bArr2, int i) {
        this.a = bArr;
        this.b = bArr2;
        this.c = i;
    }

    public abstract i b(int i);
}
